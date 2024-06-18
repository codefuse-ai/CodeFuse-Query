package com.alipay.codequery.project;


import com.alipay.codequery.Configuration;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.functions.Function1;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.analyzer.AnalysisResult;
import org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles;
import org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment;
import org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM;
import org.jetbrains.kotlin.com.google.common.collect.ImmutableCollection;
import org.jetbrains.kotlin.com.google.common.collect.ImmutableList;
import org.jetbrains.kotlin.com.intellij.lang.java.JavaLanguage;
import org.jetbrains.kotlin.com.intellij.openapi.editor.Document;
import org.jetbrains.kotlin.com.intellij.openapi.project.Project;
import org.jetbrains.kotlin.com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.kotlin.com.intellij.openapi.vfs.impl.jar.CoreJarFileSystem;
import org.jetbrains.kotlin.com.intellij.openapi.vfs.local.CoreLocalFileSystem;
import org.jetbrains.kotlin.com.intellij.psi.*;
import org.jetbrains.kotlin.com.intellij.psi.impl.PsiManagerEx;
import org.jetbrains.kotlin.com.intellij.psi.search.GlobalSearchScope;
import org.jetbrains.kotlin.config.CompilerConfiguration;
import org.jetbrains.kotlin.idea.KotlinLanguage;
import org.jetbrains.kotlin.load.kotlin.PackagePartProvider;
import org.jetbrains.kotlin.psi.KtFile;
import org.jetbrains.kotlin.resolve.BindingTrace;
import org.jetbrains.kotlin.resolve.CodeAnalyzerInitializer;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@SuppressWarnings("WeakerAccess")
public final class PsiProject {
    public final @NotNull String name;
    public final @NotNull String revision;
    public final @NotNull JavaPsiFacade javaPsiFacade;
    private final @NotNull KotlinCoreEnvironment environment;
    private final @NotNull Project project;
    private final @NotNull ImmutableCollection<File> kotlinFiles;
    private final @NotNull ImmutableCollection<File> javaFiles;
    private final @NotNull GlobalSearchScope searchScope;
    private final @NotNull PsiFileFactory psiFileFactory;
    private final @NotNull PsiDocumentManager documentManager;
    @Getter
    private final @NotNull PsiManagerEx psiManagerEx;
    @Getter
    private final @NotNull CoreLocalFileSystem localFileSystem;
    @Getter
    private final @NotNull CoreJarFileSystem jarFileSystem;

    public PsiProject(@NotNull CompilerConfiguration configuration,
                      @NotNull Collection<File> kotlinFiles,
                      @NotNull Collection<File> javaFiles,
                      @NotNull String revision,
                      @NotNull String name) {
        System.setProperty("idea.io.use.fallback", "true");
        System.setProperty("idea.io.use.nio2", "true");
        this.name = name;
        this.revision = revision;
        this.environment = KotlinCoreEnvironment.createForProduction(() -> {
        }, configuration, EnvironmentConfigFiles.JVM_CONFIG_FILES);
        this.kotlinFiles = ImmutableList.copyOf(kotlinFiles);
        this.javaFiles = ImmutableList.copyOf(javaFiles);
        project = environment.getProject();
        searchScope = GlobalSearchScope.projectScope(project);
        javaPsiFacade = JavaPsiFacade.getInstance(project);
        psiManagerEx = PsiManagerEx.getInstanceEx(project);
        psiFileFactory = PsiFileFactory.getInstance(project);
        documentManager = PsiDocumentManager.getInstance(project);
        localFileSystem = new CoreLocalFileSystem();
        jarFileSystem = new CoreJarFileSystem();
    }



    private static AnalysisResult buildResolveInfo(Project project,
                                                   Collection<KtFile> files,
                                                   CompilerConfiguration configuration,
                                                   Function1<GlobalSearchScope, PackagePartProvider> packagePartProviderFactory,
                                                   BindingTrace trace) {
        return TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration(
            project, files, trace, configuration, packagePartProviderFactory);
    }


    @NotNull
    public static PsiProject buildProject(Configuration configuration, boolean shouldBuildResolveInfo) {
        ProjectBuilder projectBuilder = ProjectBuilder.getInstance(configuration, false);
        projectBuilder.shouldBuildResolveInfo(shouldBuildResolveInfo);
        return projectBuilder.createProject();
    }

    @NotNull
    public static PsiProject buildProject(Configuration configuration) {
        return buildProject(configuration, true);
    }

    /**
     * Collect the information in the classpath and build the AST.
     * This method might be time-consuming and it has side-effects.
     */
    public void buildResolveInfo() {
        buildResolveInfo(kotlinFiles.stream()
            .map(localFileSystem::findFileByIoFile)
            .filter(Objects::nonNull)
            .map(psiManagerEx::findFile)
            .filter(it -> it instanceof KtFile)
            .map(it -> (KtFile) it)
            .collect(Collectors.toList()));
    }

    private void buildResolveInfo(Collection<KtFile> files) {
        CodeAnalyzerInitializer initializer = CodeAnalyzerInitializer.Companion.getInstance(project);
        BindingTrace trace = initializer.createTrace();
        buildResolveInfo(project,
            files,
            environment.getConfiguration(),
            environment::createPackagePartProvider,
            trace
        );
    }


    public final @Nullable Document documentOf(@NotNull PsiFile psiFile) {
        return documentManager.getDocument(psiFile);
    }

    /**
     * Collect all java files in this project.
     *
     * @return all java files in current project
     */
    public final @NotNull Stream<PsiJavaFile> allJavaFiles() {
        return javaFiles.stream()
            .map(localFileSystem::findFileByIoFile)
            .filter(Objects::nonNull)
            .map(psiManagerEx::findFile)
            .filter(it -> it instanceof PsiJavaFile)
            .map(it -> (PsiJavaFile) it);
    }


    /**
     * Collect all files in this project.
     *
     * @return all files in current project
     */
    public final @NotNull Stream<File> allJavaPaths() {
        return javaFiles.stream();
    }

    /**
     * Collect all files in this project.
     *
     * @return all files in current project
     */
    public final @Nullable PsiJavaFile getPsiJavaFileFromFile(File file) {
        VirtualFile virtualFile = localFileSystem.findFileByIoFile(file);
        if (virtualFile == null) {
            return null;
        }
        PsiFile psiFile = psiManagerEx.findFile(virtualFile);
        if (!(psiFile instanceof PsiJavaFile)) {
            return null;
        }
        return (PsiJavaFile) psiFile;
    }

    /**
     * Collect all kotlin files in this project.
     *
     * @return all kotlin files in current project
     */
    public final @NotNull Stream<KtFile> allKtFiles() {
        return javaFiles.stream()
            .map(localFileSystem::findFileByIoFile)
            .filter(Objects::nonNull)
            .map(psiManagerEx::findFile)
            .filter(it -> it instanceof KtFile)
            .map(it -> (KtFile) it);
    }

}

