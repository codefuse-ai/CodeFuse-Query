package com.alipay.codequery.util;

import org.jetbrains.kotlin.com.intellij.openapi.util.text.StringUtil;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PathUtil {

    /**
     * traverse the file root and collect all info into results.
     * furthermore, we can give some limit.
     * MENTION: default, the directory will be collected too.
     */
    public static class TraverseBuilder {
        String suffix;
        Integer depth;
        Boolean withDirInResult = true;
        Boolean withSymbolLink = false;

        public TraverseBuilder() {

        }

        public TraverseBuilder withSymbol(Boolean b) {
            this.withSymbolLink = b;
            return this;
        }

        public TraverseBuilder withSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        public TraverseBuilder withDirInResult(Boolean b) {
            this.withDirInResult = b;
            return this;
        }

        public List<File> traverse(File root) {
            List<File> results = new ArrayList<>();
            return traverse(root, results);
        }

        public List<File> traverse(File root, List<File> results) {
            File[] files = root.listFiles();
            if (files == null) {
                return results;// 判断目录下是不是空的
            }
            for (File file : files) {
                // 可选：是否递归解析链接符号
                if (!withSymbolLink) {
                    if (java.nio.file.Files.isSymbolicLink(file.toPath())) {
                        continue;
                    }
                }

                // 判断是否文件夹
                if (file.isDirectory()) {
                    // 可选：保留目录信息
                    if (withDirInResult) {
                        results.add(file);
                    }
                    // 调用自身,查找子目录
                    traverse(file, results);
                } else {
                    if (StringUtil.isNotEmpty(suffix)) {
                        // 可选：过滤文件类型
                        if (!file.getName().endsWith(suffix)) {
                            continue;
                        }
                    }
                    results.add(file);
                }
            }
            return results;
        }
    }

    public static String normalizePath(String sourcePath) {
        return Paths.get(sourcePath).normalize().toString();
    }

    public static String getRelPath(String sourcePath, String path) {
        return new File(sourcePath).toURI().relativize(new File(path).toURI()).getPath();
    }
}
