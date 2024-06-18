package com.alipay.codequery.coref.storage;

import com.alibaba.fastjson.JSON;
import com.alipay.codequery.util.PathUtil;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.Collection;
import java.util.stream.Collectors;

@Data
@Slf4j
public class Commit {
    private String id;
    private Collection<SimpleFileObject> containedFileObjects;

    public Commit(String commitId, Collection<FileScopeCorefObject> containedFiles, File rootDir) {
        this.id = commitId;
        this.containedFileObjects = containedFiles.stream()
            .map(fileObject -> {
                SimpleFileObject simpleFileObject = new SimpleFileObject();
                simpleFileObject.setObjectId(fileObject.getHashId());
                simpleFileObject.setRelativePath(PathUtil.getRelPath(rootDir.getAbsolutePath(), fileObject.getSourceFile().getAbsolutePath()));
                return simpleFileObject;
            })
            .collect(Collectors.toList());
    }

    public void writeToJsonFile(File targetFile) {
        String jsonString = JSON.toJSONString(this);
        try (
            InputStream inputStream = new ByteArrayInputStream(jsonString.getBytes());
            OutputStream outputStream = new FileOutputStream(targetFile)
        ) {
            IOUtils.copy(inputStream, outputStream);
        } catch (IOException ioe) {
            log.error("write json string to file get error!", ioe);
            throw new RuntimeException(ioe);
        }
    }

    public static Commit readFromFile(File targetFile) {
        try (
            InputStream inputStream = new FileInputStream(targetFile);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream()
        ) {
            IOUtils.copy(inputStream, outputStream);
            String jsonString = outputStream.toString();
            return JSON.parseObject(jsonString, Commit.class);
        } catch (IOException e) {
            log.error("read file to json get error!", e);
            throw new RuntimeException(e);
        }
    }

    @Data
    public static class SimpleFileObject {
        String objectId;
        String relativePath;
    }
}
