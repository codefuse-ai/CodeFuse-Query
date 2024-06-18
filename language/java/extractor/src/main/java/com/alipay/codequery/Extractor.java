package com.alipay.codequery;

import com.alipay.codequery.coref.storage.CorefCache;
import com.alipay.codequery.coref.storage.LocalCorefCache;
import com.alipay.codequery.coref.storage.OssCorefCache;
import com.alipay.codequery.coref.storage.RemoteCacheType;
import com.alipay.codequery.coref.util.ConvertCodeUtil;
import com.alipay.codequery.project.PsiProject;
import com.alipay.codequery.project.ProjectBuilder;
import com.alipay.codequery.util.LoggerUtil;
import com.alipay.codequery.coref.core.Runner;
import com.alipay.codequery.coref.core.SharedManager;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.com.intellij.openapi.util.io.FileUtil;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

@Command(name = "extract", mixinStandardHelpOptions = true, version = "extract 1.0",
    description = "extract COREF-Java db from a src directory.")
@Slf4j
public class Extractor implements Callable<Integer> {
    private static final Logger logger = LogManager.getLogger(Extractor.class);

    public static final int DEFAULT_WORKER_COUNT = Integer.min(Runtime.getRuntime().availableProcessors(), 8);

    public static Configuration configuration = new Configuration();

    // Arguments and Options
    @Parameters(index = "0", description = "The source directory to extract.")
    private File srcRootDir;

    @Parameters(index = "1", description = "The output directory for the DB file.")
    private File dbDir;

    @CommandLine.Option(names = {"-w", "--white-list"}, description = "The white list to extract.", required = false)
    private File whiteList;

    @CommandLine.Option(names = {"-p", "--parallel"}, description = "Set run in parallel (threads)")
    public boolean parallelRequested = false;

    @CommandLine.Option(names = {"--commit"}, description = "current repo's commit")
    public String commitId;

    @CommandLine.Option(names = {"--incremental"}, description = "enable incremental extract")
    public boolean incremental = false;

    @CommandLine.Option(names = {"--cache-dir"}, description = "cache dir")
    public String cacheDir;

    @CommandLine.Option(names = {"--remote-cache-type"}, description = "remote cache type. eg. oss")
    public String remoteCacheTypeName;

    @CommandLine.Option(names = {"--oss-bucket"}, description = "oss bucket")
    public String ossBucket;

    @CommandLine.Option(names = {"--oss-config-file"}, description = "oss config file")
    public File ossConfigFile;

    @CommandLine.Option(names = {"--oss-path-prefix"}, description = "oss path prefix, should end with '/'.")
    public String ossPathPrefix;

    @CommandLine.Option(names = {"--verbose"}, description = "Set run with verbose")
    public boolean verbose = false;

    @CommandLine.Option(names = {"-j", "--workers"}, description = "Set run worker limit")
    public int workerCount = DEFAULT_WORKER_COUNT;

    @CommandLine.Option(names = {"--java-home"}, description = "JDK Home")
    public String javaHome = System.getenv("JAVA_HOME");

    @CommandLine.Option(names = {"-cp", "--classpath"}, description = "PSI class path")
    public String classPath;

    @CommandLine.Option(names = {"--dump-coref-ast-path"}, description = "The path of dumped coref ast")
    public String corefASTPath;

    @Override
    public Integer call() throws Exception { // your business logic goes here...
        long start = System.currentTimeMillis();
        if (verbose) {
            LoggerUtil.initLogger(Level.DEBUG);
        } else {
            LoggerUtil.initLogger(Level.INFO);
        }

        // Exit if JAVA_HOME is not set
        if (javaHome == null) {
            logger.error("Missing JAVA_HOME!");
            return 3;
        }

        log.info("start extracting with root: {}", srcRootDir.getAbsolutePath());
        log.info("java home: {}", javaHome);

        // Why set configuration here but use configuration.sourcePath later?
        configuration.sourcepath = Collections.singletonList(srcRootDir.getAbsolutePath());
        configuration.javaHome = javaHome;
        configuration.classpath = parseClassPath(classPath);
        // must do this prepare
        configuration.prepareFile();

        // Regular the file codec
        configuration.getJavaFiles().forEach(file -> {
            try {
                ConvertCodeUtil.normCodecToUTF8ForFile(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // Make a builder
        // The inner will scan and include all Java Src files and so on
        ProjectBuilder projectBuilder = ProjectBuilder.getInstance(configuration, false);
        projectBuilder.shouldBuildResolveInfo(true);

        // Build the project
        PsiProject basicProject = projectBuilder.createProject();
        SharedManager.clear();

        List<File> whiteFiles = null;
        if (whiteList != null) {
            whiteFiles = getWhiteList(whiteList).stream()
                .map(file -> Paths.get(file).toFile()).collect(Collectors.toList());
        }

        // Create dbDir if it not exists
        if (this.corefASTPath == null){
            FileUtil.createDirectory(dbDir);
        }

        // Run to analyse
        try {
            if (this.corefASTPath != null){
                // corefASTPath抽取只使用sequenceAnalyse,其他的分析方式不支持
                Runner runner = new Runner(configuration, basicProject, whiteFiles, srcRootDir);
                runner.sequenceDumpCorefAST(this.corefASTPath);
            }
            else if (whiteFiles != null ) {
                Runner runner = new Runner(configuration, basicProject, whiteFiles, srcRootDir);
                runner.sequenceAnalyse(dbDir.toString(), "coref_java_src.db");
            } else {
                List<File> allFiles = basicProject.allJavaPaths().collect(Collectors.toList());
                Runner runner = new Runner(configuration, basicProject, allFiles, srcRootDir);
                if (incremental) {
                    if (StringUtils.isBlank(cacheDir) || "null".equals(cacheDir)) {
                        throw new IllegalArgumentException("please specify cacheDir when incremental analyse.");
                    }
                    if (StringUtils.isBlank(commitId) || "null".equals(commitId)) {
                        throw new IllegalArgumentException("please specify commitId when incremental analyse.");
                    }
                    File cacheDirFile = new File(cacheDir);
                    if (!cacheDirFile.exists()) {
                        cacheDirFile.mkdirs();
                    }
                    CorefCache remoteCorefCache = null;
                    if (RemoteCacheType.oss.name().equals(remoteCacheTypeName)) {
                        remoteCorefCache = new OssCorefCache(ossPathPrefix, cacheDirFile, ossBucket, ossConfigFile);
                    }
                    CorefCache corefCache = new LocalCorefCache(cacheDirFile, remoteCorefCache);
                    runner.incrementalAnalyse(dbDir.toString(), "coref_java_src.db", corefCache, commitId);
                } else if (parallelRequested) {
                    String uuid = UUID.randomUUID().toString();
                    Path pathPrefix = Paths.get(dbDir.getAbsolutePath(), uuid).toAbsolutePath();
                    FileUtil.createDirectory(pathPrefix.toFile());
                    runner.parallelAnalyse(pathPrefix.toString(), workerCount, dbDir.toString(), "coref_java_src.db");
                } else {
                    runner.sequenceAnalyse(dbDir.toString(), "coref_java_src.db");
                }
            }
        } catch (Exception e) {
            log.error("extracting get error!", e);
            return 1;
        }


        log.info("Time to completion (TTC): {}", (System.currentTimeMillis() - start)/1000 + "s");
        return 0;
    }

    public static void main(String... args) {
        int exitCode = new CommandLine(new Extractor()).execute(args);
        System.exit(exitCode);
    }

    // Get the white list from the #2 command parameter
    private static List<String> getWhiteList(@NotNull File whiteList) {
        List<String> whiteListFiles = new ArrayList<>();

        try {
            // Read the input file.
            FileInputStream inputStream = new FileInputStream(whiteList);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String relativePath = null;

            // Read the file line by line and insert it into the list.
            while ((relativePath = bufferedReader.readLine()) != null) {
                whiteListFiles.add(relativePath);
            }
            // Close inputStream and bufferedReader.
            inputStream.close();
            bufferedReader.close();

        } catch (IOException e) {
            System.err.println(e);
        }
        // Return the white list.
        return whiteListFiles;
    }


    private List<String> parseClassPath(String classPath) {
        List<String> classPathList = new ArrayList<>();
        if (classPath == null || classPath.isEmpty()) {
            return classPathList;
        }
        String[] classPathArr = classPath.split(":");
        for (String singleClassPath: classPathArr) {
            if (singleClassPath.isEmpty()) {
                continue;
            }
            if (!(new File(singleClassPath)).exists()) {
                continue;
            }
            classPathList.add(singleClassPath);
        }
        return classPathList;
    }
}
