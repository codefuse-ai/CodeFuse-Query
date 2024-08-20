
package com.alipay.codequery.properties;

import com.alipay.codequery.properties.core.CorefExtractor;
import com.alipay.codequery.properties.model.Folder;
import com.alipay.codequery.properties.model.Node;
import com.alipay.codequery.properties.model.Program;
import com.alipay.codequery.properties.storage.CorefStorage;
import com.alipay.codequery.properties.core.CorefURI;
import com.alipay.codequery.properties.util.LoggerUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

import java.io.*;
import java.util.concurrent.Callable;


@Command(name = "extract", mixinStandardHelpOptions = true, version = "extract 1.0",
  description = "extract COREF-Properties db from a src directory.")
@Slf4j
public class Extractor implements Callable<Integer> {

  private static final Logger logger = LogManager.getLogger(Extractor.class);
  @Parameters(index = "0", description = "The source directory to extract.")
  private File srcRootDir;

  @Parameters(index = "1", description = "The output directory for the DB file.")
  private File dbDir;

  @CommandLine.Option(names = {"--corpus"}, description = "Specify the corpus of the codebase.")
  private String corpus = "";

  /**
   *
   * main method.
   */
  public static void main(String[] args) {
    int exitCode = new CommandLine(new Extractor()).execute(args);
    System.exit(exitCode);
  }

  private void parse(File rootDir, CorefStorage corefStorage, CorefURI corefURI) throws IOException{
    File[] files = rootDir.listFiles();
    for (File file : files) {
      if (file.isDirectory()) {
        parse(file, corefStorage, corefURI);
      } else {

        // Support extracting file's extension is 'properties' or 'properties.vm'.
        if (file.getName().endsWith(".properties") || file.getName().endsWith(".properties.vm")) {
          logger.info("Start Extracting properties file: {}", file.getAbsolutePath());
          try {
            CorefExtractor extractor = new CorefExtractor(file, corefStorage, srcRootDir.getAbsolutePath(), corefURI);
            extractor.parse();
          } catch (Exception e) {
            logger.error("Extraction failed, error message:{} on file {}", e.getMessage(), file.getAbsolutePath());
          }
        }
      }
    }
  }

  private Program createProgramNode(String repoDir, CorefStorage corefStorage, CorefURI corefURI) {
    Program program = new Program();
    program.oid = corefURI.generateCorpusOid();
    program.prefix = repoDir;
    corefStorage.storeProgram(program.extractProgram());
    return program;
  }

  private void visitDirectory(String repoDir, Node parent, CorefStorage corefStorage, CorefURI corefURI) {
    File file = new File(repoDir);

    // Ignore the folder starts with "."
    if (file.isDirectory() && !(file.getName().startsWith("."))) {
      String absolutePath = file.getAbsolutePath();

      Folder parentFolder = new Folder();
      parentFolder.name = file.getName();
      parentFolder.parent = parent;

      // Calculate the relative path of the folder.
      if (absolutePath.endsWith(srcRootDir.getAbsolutePath())) {
        parentFolder.relativePath = "ROOT";
      } else {
        char head = repoDir.charAt(0);
        switch (head) {
          case '/':
            parentFolder.relativePath = absolutePath.substring(srcRootDir.getAbsolutePath().length() + 1);
            break;
          case '.':
            parentFolder.relativePath = absolutePath.substring(absolutePath.indexOf(repoDir) + 2);
            break;
          default:
            parentFolder.relativePath = absolutePath.substring(absolutePath.indexOf(repoDir));
        }
      }
      corefURI.setPath(parentFolder.relativePath);
      parentFolder.oid = corefURI.generateFileOid();
      corefStorage.storeFolder(parentFolder.extractFolder());

      // Recursively visit the sub folders.
      for (File f : file.listFiles()) {
        if (f.isDirectory()) {
          visitDirectory(f.getAbsolutePath(), parentFolder, corefStorage, corefURI);
        } else if (f.getName().endsWith(".properties")) {
          CorefURI.fileMap.put(f.getAbsolutePath(), parentFolder.oid);
        }
      }
    }
  }

  /**
   * Override the call method.
   * @return
   * @throws Exception
   */
  @Override
  public Integer call() throws Exception {
    LoggerUtil.initLogger(Level.INFO);

    long start = System.currentTimeMillis();
    CorefStorage corefStorage = new CorefStorage(dbDir.getAbsolutePath());
    CorefURI corefURI = StringUtils.isBlank(corpus) ? new CorefURI(srcRootDir.getAbsolutePath()) : new CorefURI(corpus);
    Program program = createProgramNode(srcRootDir.getAbsolutePath(), corefStorage, corefURI);
    visitDirectory(srcRootDir.getAbsolutePath(), program, corefStorage, corefURI);

    parse(srcRootDir, corefStorage, corefURI);
    corefStorage.store();

    logger.info("Time to completion (TTC): " + (System.currentTimeMillis() - start));

    return 0;
  }
}
