package com.alipay.codequery.coref.core;


import com.alipay.codequery.Configuration;
import com.alipay.codequery.coref.model.Folder;
import com.alipay.codequery.coref.model.Node;
import com.alipay.codequery.coref.model.Program;
import com.alipay.codequery.coref.storage.*;
import com.alipay.codequery.coref.util.HashUtil;
import com.alipay.codequery.project.PsiProject;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;
import me.tongfei.progressbar.ProgressBar;
import me.tongfei.progressbar.ProgressBarBuilder;
import me.tongfei.progressbar.ProgressBarStyle;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.com.intellij.psi.PsiJavaFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

@Slf4j
public class Runner {
    public static final int DEFAULT_BATCH_SIZE = 100;
    public static final int DEFAULT_PARALLEL_BATCH_SIZE = 100;

    public final Configuration configuration;
    public final PsiProject basicProject;
    public final List<File> javaFiles;
    private final File srcRootDir;
    private Program program;

    public Runner(Configuration configuration,
                  PsiProject basicProject,
                  List<File> javaFiles,
                  File srcRootDir) {
        this.configuration = configuration;
        this.basicProject = basicProject;
        this.javaFiles = javaFiles;
        this.srcRootDir = srcRootDir;
    }


    private static void analyseFile(Configuration configuration, PsiProject project, IStorage sliceCorefStorage, Program program, File javaPath) {
        String srcRootPath = configuration.getSourcePath();

        // corresponding the java path to a psi java file into the project
        @Nullable PsiJavaFile psiJavaFile = project.getPsiJavaFileFromFile(javaPath);
        assert psiJavaFile != null;
        String fileName = psiJavaFile.getContainingFile().getVirtualFile().getCanonicalPath();
        try {
            CorefExtractor corefExtractor = new CorefExtractor(project, srcRootPath, psiJavaFile, sliceCorefStorage, program, new CorefURI(configuration.repository));
            psiJavaFile.accept(corefExtractor);

        } catch (Throwable e) {
            log.error("extracting error for: {}", fileName, e);
        }
    }

    // 填充基本信息
    // 1. Coref 根节点 —— Program节点
    // 2. 文件目录信息
    private void fillCommonInfo(File srcRootDir, IStorage storage) {
        Program program = createProgramNode(javaFiles, srcRootDir.getAbsolutePath(), storage);
        this.program = program;
        visitDirectory(srcRootDir.getAbsolutePath(), program, storage);
        storage.commit();
    }

    // Create coref root (aka. program) node of the input source.
    private Program createProgramNode(List<File> allJavaFiles, String repoDir, IStorage corefStorage) {
        Program program = new Program(HashUtil.getStringSHA256(this.configuration.sourcepath.toString()));
        if (allJavaFiles.size() > 0) {
            if (repoDir.startsWith("/")) {
                program.prefix = repoDir;
            } else {
                String absolutePath = allJavaFiles.get(0).getAbsolutePath();
                program.prefix = absolutePath.substring(0, absolutePath.indexOf(repoDir));
            }
        }
        corefStorage.storeProgram(program);
        return program;
    }

    // Create folder nodes from the input source root dir.
    public void visitDirectory(String repoDir, Node parent, IStorage corefStorage) {
        String[] blackFilePath = {"node_modules", ".git", ".idea"};
        if (StringUtils.containsAnyIgnoreCase(repoDir, blackFilePath)) {
            log.info("ignore dir: {}", repoDir);
            return;
        }

        File file = new File(repoDir);

        // Ignore the folder starts with "."
        if (file.isDirectory() && !(file.getName().startsWith("."))) {
            String absolutePath = file.getAbsolutePath();

            Folder parentFolder = new Folder(HashUtil.getStringSHA256(absolutePath));
            parentFolder.name = file.getName();
            parentFolder.parent = parent;

            // Calculate the relative path of the folder.
            if (absolutePath.endsWith(srcRootDir.getAbsolutePath())) {
                parentFolder.qualifiedName = "ROOT";
            } else {
                char head = repoDir.charAt(0);
                switch (head) {
                    case '/':
                        parentFolder.qualifiedName = absolutePath.substring(srcRootDir.getAbsolutePath().length() + 1);
                        break;
                    case '.':
                        parentFolder.qualifiedName = absolutePath.substring(absolutePath.indexOf(repoDir) + 2);
                        break;
                    default:
                        parentFolder.qualifiedName = absolutePath.substring(absolutePath.indexOf(repoDir));
                }
            }
            corefStorage.storeFolder(parentFolder);

            // Recursively visit the sub folders.
            for (File f : file.listFiles()) {
                if (f.isDirectory()) {
                    visitDirectory(f.getAbsolutePath(), parentFolder, corefStorage);
                } else if (f.getName().endsWith(".java")) {
                    SharedManager.FILE_MAP.put(f.getAbsolutePath(), parentFolder.hashId);
                }
            }
        }
    }

    /**
     * 生成coref ast
     */
    public void sequenceDumpCorefAST(String corefASTPath){
        log.info("Dump Coref AST with {} java files.", javaFiles.size());
        ProgressBarBuilder pbb = new ProgressBarBuilder()
            .setInitialMax(javaFiles.size())
            .setTaskName("Dump COREF-Java AST ")
            .setStyle(ProgressBarStyle.ASCII);
        for (File javaFile : ProgressBar.wrap(javaFiles, pbb)) {
            try {
                CorefASTDumpStorage storage = new CorefASTDumpStorage(corefASTPath, this.srcRootDir.toString(), javaFile, this.basicProject, configuration.repository);
                analyseFile(configuration, basicProject, storage, program, javaFile);
                storage.commit();
            } catch (Throwable e) {
                log.error("Error when extracting: " + javaFile.getAbsolutePath(), e);
            }
        }
    }
    /**
     * run analysis in file sequence (with specific files)
     */
    public void sequenceAnalyse(String dbDir, String dbFileName) {
        log.info("Analyse project with {} java files.", javaFiles.size());

        IStorage storage = new SqliteStorage2(dbDir, dbFileName);
        fillCommonInfo(this.srcRootDir, storage);

        ProgressBarBuilder pbb = new ProgressBarBuilder()
            .setInitialMax(javaFiles.size())
            .setTaskName("Extracting COREF-Java")
            .setStyle(ProgressBarStyle.ASCII);
        for (File javaFile : ProgressBar.wrap(javaFiles, pbb)) {
            try {
                analyseFile(configuration, basicProject, storage, program, javaFile);
                storage.commit();
            } catch (Throwable e) {
                log.error("Error when extracting: " + javaFile.getAbsolutePath(), e);
            }
        }
    }

    public void parallelAnalyse(String pathPrefix, int workerCount, String dbDir, String dbFileName) throws InterruptedException, IOException {
        ExecutorService psiExecutePool = new ForkJoinPool(workerCount);

        // 注册关闭hook函数，优雅退出
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                log.info("calling shutdown hook.");
                psiExecutePool.shutdown();
            }
        });

        List<File> allJavaPaths = basicProject.allJavaPaths().collect(Collectors.toList());
        log.info("Analyse project with {} java files.", javaFiles.size());
        ThreadLocal<PsiProject> threadLocal = new ThreadLocal<>();
        List<List<File>> partedList = Lists.partition(allJavaPaths, DEFAULT_PARALLEL_BATCH_SIZE);
        log.info("Parallel Extraction Mode, Worker Count: {}, Batch Size: {}, Batch Count: {}", workerCount, DEFAULT_PARALLEL_BATCH_SIZE, partedList.size());
        CountDownLatch latch = new CountDownLatch(partedList.size());
        IStorage mergedStorage = new SqliteStorage2(dbDir, dbFileName);
        fillCommonInfo(srcRootDir, mergedStorage);

        ProgressBar parallelProgressBar = new ProgressBarBuilder()
            .setInitialMax(javaFiles.size())
            .setTaskName("Parallel Extracting COREF-Java")
            .setStyle(ProgressBarStyle.ASCII)
            .build();
        for (int i = 0; i < partedList.size(); i++) {
            int idx = i;
            List<File> part = partedList.get(i);
            psiExecutePool.submit(() -> {
                String sqliteFileDir = Paths.get(pathPrefix).toAbsolutePath().toString();
                IStorage storage = new SqliteStorage2(sqliteFileDir, String.valueOf(idx));

                part.stream()
                    .parallel()
                    .forEach(javaPath -> {
                        PsiProject threadProject;
                        threadProject = threadLocal.get();
                        if (threadProject == null) {
                            threadProject = PsiProject.buildProject(configuration);
                            threadLocal.set(threadProject);
                        }
                        analyseFile(configuration, threadProject, storage, program, javaPath);
                    });

                // end of batch analysis, begin to storage
                storage.commit();
                latch.countDown();
                parallelProgressBar.stepBy(part.size());
            });
        }

        latch.await();
        psiExecutePool.shutdown();

        String mergedDBFileName = dbDir + File.separator + dbFileName;
        SqliteUtil.importSqlite(
            pathPrefix,
            mergedDBFileName
        );

        // 合并完成后，删除分片
        log.info("after merge. Will delete batch file dir: {}", pathPrefix);
        FileUtils.deleteDirectory(Paths.get(pathPrefix).toFile());
    }


    public void incrementalAnalyse(String dbDir, String dbFileName, CorefCache corefCache, String commitId) throws InterruptedException {
        log.info("start inc analyse");

        IStorage storage = new SqliteStorage2(dbDir, dbFileName);
        fillCommonInfo(this.srcRootDir, storage);

        Set<String> cachedFileIds = corefCache.getAllObjectIds();
        log.info("end of get all objects");
        // 计算所有源文件的hash信息，存储在内存中
        Map<String, FileScopeCorefObject> currentFileObjectMap = new HashMap<>();
        for (File javaFile : javaFiles) {
            FileScopeCorefObject fileObject = new FileScopeCorefObject();
            String currentFileId = HashUtil.getFileSha1Hash(javaFile);
            fileObject.setHashId(currentFileId);
            fileObject.setSourceFile(javaFile);
            fileObject.setCacheFile(new File(corefCache.getLocalObjectDir().getAbsolutePath() + "/" + currentFileId));
            currentFileObjectMap.put(currentFileId, fileObject);
        }

        // 找出当前文件集中存在，且缓存中不存在的。就是待分析的文件集
        Set<String> diffSet = Sets.difference(currentFileObjectMap.keySet(), cachedFileIds).immutableCopy();
        Set<FileScopeCorefObject> toBeAnalyzedFileObject = new HashSet<>();
        for (Map.Entry<String, FileScopeCorefObject> fileObjectEntry : currentFileObjectMap.entrySet()) {
            if (diffSet.contains(fileObjectEntry.getKey())) {
                toBeAnalyzedFileObject.add(fileObjectEntry.getValue());
            }
        }
        log.info("total file: {}, to be analyzed file: {}", javaFiles.size(), toBeAnalyzedFileObject.size());

        // 下载文件
        Set<String> sameSet = Sets.intersection(currentFileObjectMap.keySet(), cachedFileIds).immutableCopy();
        corefCache.getObjectByIds(sameSet);
        log.info("get intersection objects ends.");

        // 开始抽取
        ProgressBar pb = new ProgressBarBuilder()
            .setInitialMax(toBeAnalyzedFileObject.size())
            .setTaskName("Incremental Extracting COREF-Java")
            .setStyle(ProgressBarStyle.ASCII).build();

        // 并行抽取
        CountDownLatch latch = new CountDownLatch(toBeAnalyzedFileObject.size());
        List<List<FileScopeCorefObject>> partedList = Lists.partition(Lists.newArrayList(toBeAnalyzedFileObject), DEFAULT_PARALLEL_BATCH_SIZE);
        ExecutorService psiExecutePool = new ForkJoinPool(8);
        ThreadLocal<PsiProject> threadLocal = new ThreadLocal<>();
        for (List<FileScopeCorefObject> part : partedList) {
            psiExecutePool.submit(() -> {
                try {
                    part.stream()
                        .parallel()
                        .forEach(fileObject -> {
                            IStorage fileStorage = new SqliteStorage2(corefCache.getLocalObjectDir().getAbsolutePath(), fileObject.getHashId());
                            PsiProject threadProject;
                            threadProject = threadLocal.get();
                            if (threadProject == null) {
                                threadProject = PsiProject.buildProject(configuration);
                                threadLocal.set(threadProject);
                            }

                            analyseFile(configuration, threadProject, fileStorage, program, fileObject.getSourceFile());
                            fileStorage.commit();
                            latch.countDown();
                            pb.stepBy(1);
                        });
                } catch (Throwable e) {
                    log.error("Error when extracting: ", e);
                }
            });
        }

        latch.await();
        psiExecutePool.shutdown();
        log.info("end extracting.");

        log.info("analyze done. Will adding {} files to cache. ", toBeAnalyzedFileObject.size());
        corefCache.putObjects(toBeAnalyzedFileObject);
        log.info("put to cache objects ends.");
        Commit commit = new Commit(commitId, currentFileObjectMap.values(), srcRootDir);
        corefCache.putCommit(commit);
        log.info("put to cache refs ends.");

        // 合并成一个大DB，用于查询
        Instant beforeMerge = Instant.now();
        Set<File> currentFileCorefData = currentFileObjectMap.values().stream()
            .map(FileScopeCorefObject::getCacheFile)
            .collect(Collectors.toSet());
        SqliteUtil.importSqlite(
            currentFileCorefData,
            dbDir + "/" + dbFileName
        );
        long timeCost = Duration.between(beforeMerge, Instant.now()).getSeconds();
        log.info("time cost of merge db: {}s", timeCost);
    }
}
