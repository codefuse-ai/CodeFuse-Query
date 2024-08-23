
package com.alipay.codequery.coref.sql;

import com.alipay.codequery.coref.sql.storage.SqliteStorageFacade;
import com.alipay.codequery.coref.sql.storage.StorageFacade;
import com.alipay.codequery.coref.sql.util.ConvertCodeUtil;
import com.alipay.codequery.coref.sql.core.CorefExtractor;
import com.alipay.codequery.coref.sql.core.CorefURI;
import com.alipay.codequery.dal.mybatis.domain.Corpus;
import com.alipay.codequery.util.LoggerUtil;
import com.alipay.codequery.util.PathUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import picocli.CommandLine;
import picocli.CommandLine.Model.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.util.*;
import java.util.concurrent.Callable;


@CommandLine.Command(name = "coref-sql-src-extractor", mixinStandardHelpOptions = true, version = "coref-sql-src-extractor 0.0.1",
        description = "extract COREF-SQL db from a src directory.")
@Slf4j
public class Extractor implements Callable<Integer> {
    private static final Logger logger = LogManager.getLogger(Extractor.class);

    private static final com.alipay.codequery.coref.sql.DbTypeEnum DEFAULT_DB_TYPE = com.alipay.codequery.coref.sql.DbTypeEnum.ODPS;

    public static final int DEFAULT_WORKER_COUNT = Integer.min(Runtime.getRuntime().availableProcessors(), 8);

    // TODO implement a file iterator
    //public static Configuration configuration = new Configuration();

    // Arguments and Options
    @CommandLine.Parameters(index = "0", description = "The source directory to extract.")
    private File srcRootDir;

    @CommandLine.Parameters(index = "1", description = "The output directory for the DB file.")
    private File dbDir;

    @CommandLine.Option(names = {"--corpus"}, description = "Specify the corpus of the codebase.")
    public String corpus = "";

    // TODO
    @CommandLine.Option(names = {"-p", "--parallel"}, description = "Set run in parallel (threads)")
    public boolean parallelRequested = false;

    @CommandLine.Option(names = {"--verbose"}, description = "Set run with verbose")
    public boolean verbose = false;

    @CommandLine.Option(names = {"-j", "--workers"}, description = "Set run worker limit")
    public int workerCount = DEFAULT_WORKER_COUNT;

    public static com.alipay.codequery.coref.sql.DbTypeEnum dbType = DEFAULT_DB_TYPE;
    @Override
    public Integer call() throws Exception { // your business logic goes here...
        long start = System.currentTimeMillis();
        if (verbose) {
            LoggerUtil.initLogger(Level.DEBUG);
        } else {
            LoggerUtil.initLogger(Level.INFO);
        }

        if (!srcRootDir.exists()) {
            throw new NoSuchFileException(srcRootDir.getAbsolutePath());
        }
        log.info("start extracting with root: {}", srcRootDir.getAbsolutePath());

        HashSet<File> sqlFiles = prepareFile(srcRootDir);

        // Regular the file codec
        sqlFiles.forEach(file -> {
            try {
                ConvertCodeUtil.normCodecToUTF8ForFile(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // Create dbDir if it doesn't exist
        Files.createDirectories(dbDir.toPath());

        List<File> allFiles = new ArrayList<>(sqlFiles);

        StorageFacade storage = new SqliteStorageFacade(dbDir.toString(), "coref_sql_src.db");
        storage.store(new Corpus(
                CorefURI.generateCorpusOid(corpus),
                corpus
        ));
        for (File f: allFiles) {
            try {
                CorefExtractor.extract(f, dbType, storage, srcRootDir, corpus);
                storage.commit();
            } catch (Throwable e) {
                log.error("Error when extracting {}: {}", f, e);
            }
        }

        log.info("Time to completion (TTC): {}", (System.currentTimeMillis() - start)/1000 + "s");
        return 0;
    }

    public static void main(String... args) {
        // Init logger first so logging is enabled in main block
        LoggerUtil.initLogger(Level.INFO);

        CommandLine commandLine = new CommandLine(new Extractor())
            // 设置 Enum 参数的匹配大小写「不」敏感
            .setCaseInsensitiveEnumValuesAllowed(true);
        CommandSpec spec = commandLine.getCommandSpec();

        // Add SQL database type option
        spec.addOption(OptionSpec.builder("-s", "--sql-dialect-type")
                .paramLabel("<type>")
                .type(com.alipay.codequery.coref.sql.DbTypeEnum.class)
                .description(constructDbTypeDescription())
                .build());

        CommandLine.ParseResult pr = commandLine.parseArgs(args);

        if (!pr.hasMatchedOption("--sql-dialect-type")) {
            log.info("--sql-dialect-type not specified, using default SQL db type: {}", DEFAULT_DB_TYPE);
        }

        dbType = pr.matchedOptionValue("--sql-dialect-type", DEFAULT_DB_TYPE);

        int exitCode = commandLine.execute(args);
        System.exit(exitCode);
    }

    private static HashSet<File> prepareFile(File root) {
        ArrayList<File> results = new ArrayList<>();
        PathUtil.TraverseBuilder traversal = new PathUtil.TraverseBuilder()
                .withSymbol(false)
                .withDirInResult(true)
                .withSuffix(".sql");
        traversal.traverse(root, results);

        HashSet<File> sqlFiles = new HashSet<>();
        for (File file : results) {
            if (!file.isDirectory()) {
                sqlFiles.add(file);
            }
        }

        return sqlFiles;
    }

    private static String constructDbTypeDescription() {
        StringBuilder description = new StringBuilder("The SQL dialect type to parse. Currently supports: ");
        List<com.alipay.codequery.coref.sql.DbTypeEnum> dbTypeEnumList = Arrays.asList(DbTypeEnum.values());
        for (int i=0; i < dbTypeEnumList.size(); i++) {
            description.append(dbTypeEnumList.get(i).getName());
            if (i < dbTypeEnumList.size() - 1) {
                description.append(", ");
            }
        }
        description.append(". Defaults to: ").append(DEFAULT_DB_TYPE.getName());
        return description.toString();
    }
}