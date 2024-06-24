package com.alipay.codequery;

import com.alipay.codequery.project.ProjectUtil;
import com.alipay.codequery.util.PathUtil;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.*;


public class Configuration implements Cloneable {

    public final String commitId = "init";
    public final String repository = "Not Specified";
    public List<String> sourcepath = new ArrayList<>();
    public String javaHome = null;
    public List<String> classpath = new ArrayList<>();

    @Getter
    private final @NotNull Collection<File> kotlinFiles = new HashSet<>();
    @Getter
    private final @NotNull Collection<File> javaFiles = new HashSet<>();
    @Getter
    private final @NotNull Set<File> javaDirs = new HashSet<>();
    @Getter
    private final List<File> classFiles = new ArrayList<>();

    /**
     * MENTION: we allow multiple source paths exist but we ONLY use the first one as root
     */
    public String getSourcePath() {
        return sourcepath.get(0);
    }

    public void prepareFile() {
        clearExistedFiles();

        // jar class path
        ProjectUtil.getClassPaths(this.classpath).stream().map(File::new).forEach(classFiles::add);

        // source file path
        for (String sourceRoot : sourcepath) {
            File file = new File(sourceRoot).getAbsoluteFile();
            withJavaSrc(file);
            withKotlinSrc(file);
        }
    }

    public void withKotlinSrc(File root) {
        ArrayList<File> results = new ArrayList<>();

        PathUtil.TraverseBuilder traversal = new PathUtil.TraverseBuilder()
            .withSymbol(false)
            .withDirInResult(false)
            .withSuffix(".kt");
        traversal.traverse(root, results);

        kotlinFiles.addAll(results);
    }


    public void withJavaSrc(File root) {
        ArrayList<File> results = new ArrayList<>();
        PathUtil.TraverseBuilder traversal = new PathUtil.TraverseBuilder()
            .withSymbol(false)
            .withDirInResult(true)
            .withSuffix(".java");
        traversal.traverse(root, results);

        for (File file : results) {
            if (file.isDirectory()) {
                javaDirs.add(file);
            } else {
                javaFiles.add(file);
            }
        }
    }

    private void clearExistedFiles() {
        javaFiles.clear();
        javaDirs.clear();
        kotlinFiles.clear();
        classFiles.clear();
    }

}
