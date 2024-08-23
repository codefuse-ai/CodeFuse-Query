
package com.alipay.codequery.coref.sql.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class ConvertCodeUtil {
    private static final Logger logger = LogManager.getLogger(ConvertCodeUtil.class);

    private static final String FILE_PATH = ""; //文件路径
    private static final String TARGET_CODE = "UTF-8"; //目标文件编码
    private static final String SOURCE_CODE = "GBK"; //源文件编码
    private static final String FILE_END_WITH = ".java"; //转换文件格式
    public static long start = System.currentTimeMillis();

    public static void main(String[] args) throws IOException {
        File srcFolder = new File(FILE_PATH);
        normCodecToUTF8ForDir(srcFolder);
        System.out.println("success");
        System.out.println("耗时时间：" + (System.currentTimeMillis() - start));
    }

    public static void normCodecToUTF8ForDir(File srcFolder) throws IOException {
        File[] fileArray = srcFolder.listFiles();
        for (File file : fileArray) {
            if (file.isDirectory()) {
                normCodecToUTF8ForDir(file);
            } else {
                if (file.getName().endsWith(FILE_END_WITH)) {
                    normCodecToUTF8ForFile(file);
                }
            }
        }
    }

    public static void normCodecToUTF8ForFile(File file) throws IOException {
        String s = JudgeFileCharset.getFileCharsetByICU4J(file);
        if (!(s.equals("UTF-8"))) {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, SOURCE_CODE);
            BufferedReader br = new BufferedReader(isr);
            String OriStr;
            StringBuilder stringBuilder = new StringBuilder();
            while ((OriStr = br.readLine()) != null) {
                //手动拼接换行符
                OriStr += "\n";
                stringBuilder.append(OriStr);
            }
            String targetStr = stringBuilder.toString();
            //false代表不追加直接覆盖,true代表追加文件
            FileOutputStream fos = new FileOutputStream(file.getAbsolutePath(), false);
            OutputStreamWriter osw = new OutputStreamWriter(fos, TARGET_CODE);
            osw.write(targetStr);
            osw.flush();
            osw.close();
            fos.close();
            br.close();
            isr.close();
            fis.close();
        }
    }
}
