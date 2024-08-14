
package com.alipay.codequery;
import com.alipay.codequery.stax.StaxCorefExtractor;
import com.alipay.codequery.util.CorefStorage;
import com.alipay.codequery.util.LoggerUtil;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.IOException;

public class Extractor {
    private static final Logger logger = LogManager.getLogger(Extractor.class);
    public static final String XML_EXT = ".xml";
    public static final String AXML_EXT = ".axml";
    public static final String[] FILE_EXT_ARRAY = {
            XML_EXT,
            AXML_EXT,
    };

    public static void main(String[] args) throws IOException, XMLStreamException {
        LoggerUtil.initLogger(Level.INFO);

        long start = System.currentTimeMillis();
        // repoDir和destDir是设置的本地测试目录，在生产中会被替换掉
        String repoDir = "";
        String destDir = "";
        if (args.length > 0) {
            repoDir = args[0];
        }
        if (args.length > 1) {
            destDir = args[1];
        }
        if (!destDir.endsWith(File.separator)) {
            destDir += File.separator;
        }
        CorefStorage corefStorage = new CorefStorage(destDir);
        File sourceDir = new File(repoDir);
        parse(sourceDir, sourceDir, corefStorage);
        logger.info("Time to completion (TTC): " + (System.currentTimeMillis() - start));
    }

    private static void parse(File sourceDir, File rootDir, CorefStorage corefStorage) {
        File[] files = rootDir.listFiles();
        if (files == null) {
            return;
        }
        for (File file: files) {
            if (file.isDirectory()) {
                parse(sourceDir, file, corefStorage);
            } else {
                for (String fileExt: FILE_EXT_ARRAY) {
                    if (file.getName().endsWith(fileExt)) {
                        logger.info("Start Extracting xml file: {}", file.getAbsolutePath());
                        try {
                            StaxCorefExtractor extractor = new StaxCorefExtractor(file, corefStorage, sourceDir.getAbsolutePath());
                            extractor.parse();
                        } catch (Exception e) {
                            logger.error("Extraction failed, error message:{} on file {}", e.getMessage(), file.getAbsolutePath());
                        }
                    }
                }
            }
        }
    }
}
