package com.alipay.codequery.coref.util;

import lombok.extern.log4j.Log4j2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


@Log4j2
public class CmdUtils {

    public static List<String> runExternalCommand(String... cmdItems) {
        List<String> lineRes = new ArrayList<>();
        try {
            ProcessBuilder builder = new ProcessBuilder(cmdItems);
            builder.redirectErrorStream(true);
            Process process = builder.start();
            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = input.readLine()) != null) {
                lineRes.add(line);
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lineRes;
    }
}
