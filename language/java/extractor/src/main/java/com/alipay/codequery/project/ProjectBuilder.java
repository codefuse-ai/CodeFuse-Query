package com.alipay.codequery.project;

import com.alipay.codequery.Configuration;
import com.alipay.codequery.util.PathUtil;
import kotlin.collections.CollectionsKt;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.cli.jvm.config.JvmContentRootsKt;
import org.jetbrains.kotlin.config.CompilerConfiguration;

import java.io.File;
import java.nio.file.Path;
import java.util.*;


@SuppressWarnings({"WeakerAccess", "unused", "UnusedReturnValue"})
@Slf4j
public class ProjectBuilder {

    private final @NotNull CompilerConfiguration compileConfig;
    private final @NotNull Collection<File> kotlinFiles;
    private final @NotNull Collection<File> javaFiles;
    private final @NotNull String commitId;
    private final @NotNull String name;
    private boolean shouldBuildResolveInfo = false;

    private ProjectBuilder(@NotNull Configuration config, boolean kt) {
        compileConfig = ProjectUtil.buildCompileConfig(config.javaHome);
        this.commitId = config.commitId;
        this.name = config.repository;

        // prepare all files
        if (kt) {
            kotlinFiles = config.getKotlinFiles();
        } else {
            kotlinFiles = Collections.emptyList();
        }
        javaFiles = config.getJavaFiles();
        @NotNull ArrayList<File> javaDirs = new ArrayList<>(config.getJavaDirs());
        @NotNull ArrayList<File> classFiles = new ArrayList<>(config.getClassFiles());
        JvmContentRootsKt.addJavaSourceRoots(compileConfig, javaDirs);
        JvmContentRootsKt.addJvmClasspathRoots(compileConfig, classFiles);
    }

    private ProjectBuilder(@NotNull Configuration config) {
        this(config, false);
    }

    public static ProjectBuilder getInstance(Configuration configuration, boolean kt) {
        ProjectBuilder builder = new ProjectBuilder(configuration);
        return builder;
    }

    @Contract(pure = true)
    public static boolean isKotlinFile(@NotNull String name) {
        return name.endsWith(".kt");
    }

    @Contract(pure = true)
    public static boolean isJavaFile(@NotNull String name) {
        return name.endsWith(".java");
    }

    public @NotNull ProjectBuilder withJavaSrc(@NotNull List<File> roots) {
        for (File root : roots) withJavaSrc(root);
        return this;
    }

    public @NotNull ProjectBuilder withJavaSrc(File... roots) {
        for (File root : roots) withJavaSrc(root);
        return this;
    }

    public @NotNull ProjectBuilder withJavaSrc(@NotNull String... roots) {
        for (String root : roots) withJavaSrc(root);
        return this;
    }

    public @NotNull ProjectBuilder withJars(@NotNull List<File> jars) {
        JvmContentRootsKt.addJvmClasspathRoots(compileConfig, jars);
        return this;
    }

    public @NotNull ProjectBuilder withJars(File... jars) {
        return withJars(Arrays.asList(jars));
    }

    public @NotNull ProjectBuilder withJars(@NotNull String... jars) {
        return withJars(CollectionsKt.map(Arrays.asList(jars), File::new));
    }

    public @NotNull ProjectBuilder withJarsUnder(@NotNull Path jarsRoot) {
        return withJarsUnder(jarsRoot.toFile());
    }

    public @NotNull ProjectBuilder withJarsUnder(@NotNull String jarsRoot) {
        return withJarsUnder(new File(jarsRoot));
    }

    public @NotNull ProjectBuilder withJarsUnder(File jarsRoot) {
        File[] files = jarsRoot.listFiles();
        if (files != null) return withJars(files);
        else return this;
    }

    public @NotNull ProjectBuilder withKotlinSrc(File root) {
        ArrayList<File> results = new ArrayList<>();

        PathUtil.TraverseBuilder traversal = new PathUtil.TraverseBuilder()
            .withSymbol(false)
            .withDirInResult(false)
            .withSuffix(".kt");
        traversal.traverse(root, results);

        kotlinFiles.addAll(results);
        return this;
    }

    public @NotNull ProjectBuilder withKotlinSrc(@NotNull Path root) {
        return withKotlinSrc(root.toFile());
    }

    public @NotNull ProjectBuilder withKotlinSrc(@NotNull String root) {
        return withKotlinSrc(new File(root));
    }

    public @NotNull ProjectBuilder withJavaSrc(File root) {
        ArrayList<File> results = new ArrayList<>();
        PathUtil.TraverseBuilder traversal = new PathUtil.TraverseBuilder()
            .withSymbol(false)
            .withDirInResult(true)
            .withSuffix(".java");
        traversal.traverse(root, results);

        for (File file : results) {
            if (file.isDirectory()) {
                JvmContentRootsKt.addJavaSourceRoot(compileConfig, file);
            } else {
                javaFiles.add(file);
            }
        }
        return this;
    }

    public @NotNull ProjectBuilder withJavaSrc(@NotNull String root) {
        return withJavaSrc(new File(root));
    }

    public @NotNull ProjectBuilder withJavaSrc(@NotNull Path root) {
        return withJavaSrc(root.toFile());
    }

    public @NotNull ProjectBuilder shouldBuildResolveInfo(boolean should) {
        shouldBuildResolveInfo = should;
        return this;
    }

    public @NotNull PsiProject createProject() {
        PsiProject project = new PsiProject(compileConfig, kotlinFiles, javaFiles, commitId, name);
        if (shouldBuildResolveInfo) {
            project.buildResolveInfo();
        }
        return project;
    }
}
