package com.alipay.codequery.coref.sql.util;

import com.ibm.icu.text.CharsetDetector;
import com.ibm.icu.text.CharsetMatch;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JudgeFileCharset {
    private static final Logger logger = LogManager.getLogger(JudgeFileCharset.class);
    public static CharsetDetector detector = new CharsetDetector();

    public static String getFileCharsetByICU4J(File file) {
        String encoding = null;
        try {
            Path path = Paths.get(file.getPath());
            byte[] data = Files.readAllBytes(path);
            detector.setText(data);
            CharsetMatch match = detector.detect();
            if (match == null) {
                return encoding;
            }
            encoding = match.getName();
        } catch (IOException e) {
            System.err.println(e);
        }
        return encoding;
    }
}
