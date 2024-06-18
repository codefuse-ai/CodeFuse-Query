package com.alipay.codequery.coref.core;

import com.alipay.codequery.coref.model.*;
import com.alipay.codequery.coref.storage.IStorage;
import com.alipay.codequery.coref.util.HashUtil;
import com.alipay.codequery.coref.model.*;
import com.alipay.codequery.util.PsiUtil;
import com.alipay.codequery.coref.model.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.com.intellij.psi.*;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorefDepExtractor {
    private static final ConcurrentHashMap<String, Long> NP_PROJECT_ID_MAP = new ConcurrentHashMap<>();
    // ATTENTION: PSI resolve dependencies in different thread independently
    // so multi psi objects may represent same element
    // we should create two cache for each category psi object
    // the first cache save psi object and its hash id
    // the second cache save hash id present or not
    private static final ConcurrentHashMap<PsiFile, Long> PSI_FILE_NP_FILE_ID_MAP = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Long, Boolean> NP_FILE_ID_MAP = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<PsiClass, Long> PSI_CLASS_NP_CLASS_ID_MAP = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Long, Boolean> NP_CLASS_ID_MAP = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<PsiMethod, Long> PSI_METHOD_NP_METHOD_ID_MAP = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Long, Boolean> NP_METHOD_ID_MAP = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<PsiElement, Parent> PARENT_MAP = new ConcurrentHashMap<>();

    /*
       string: com/google/code/gson/gson/2.10/gson-2.10.jar!/com/google/gson/Gson.class
       matching result: gson-2.10.jar
       the regular expression match string with pattern:
       1. start with a '/' char, not included, just match position （零宽正回顾后发断言）
       2. followed by char sequence, contains at least one char, the char can't be '/'
       3. end with a '!' char, not included, just match position （零宽正向先行断言）
     */
    private static final Pattern DEP_NAME_PATTERN = Pattern.compile("(?<=/)[^/]+?(?=!)");

    public static Long extractNpProject(IStorage storage, String project) {
        return NP_PROJECT_ID_MAP.computeIfAbsent(project, (k) -> {
            String corefURI = CorefURI.generate("depedency", "java", project);
            Long hashId = HashUtil.hashString(corefURI);
            NpProject npProject = new NpProject(hashId);
            npProject.name = project;
            int dotPos = project.lastIndexOf('.');
            if (dotPos != -1 && (dotPos + 1) < project.length()) {
                npProject.extension = project.substring(dotPos + 1);
            } else {
                npProject.extension = "default";
            }
            storage.storeNpProject(npProject);
            return hashId;
        });
    }

    public static Long extractNpFile(IStorage storage, PsiFile file) {
        return PSI_FILE_NP_FILE_ID_MAP.computeIfAbsent(file, (k) -> {
            Long hashId = getHashId(file);
            AtomicBoolean contains = new AtomicBoolean(true);
            NP_FILE_ID_MAP.computeIfAbsent(hashId, (id) -> {
                contains.set(false);
                return Boolean.TRUE;
            });
            if (!contains.get()) {
                NpFile npFile = new NpFile(hashId);
                npFile.name = file.getName();
                String[] depNameAndFilePath = getDepNameAndFilePath(file);
                if (depNameAndFilePath != null) {
                    npFile.qualifiedName = depNameAndFilePath[1];
                    int slashPos = npFile.qualifiedName.lastIndexOf('/');
                    if (slashPos != -1 && (slashPos + 1) < npFile.qualifiedName.length()) {
                        npFile.name = npFile.qualifiedName.substring(slashPos + 1);
                    } else {
                        npFile.name = npFile.qualifiedName;
                    }

                    npFile.projectId = extractNpProject(storage, depNameAndFilePath[0]);
                } else {
                    npFile.qualifiedName = "default";
                    npFile.name = "default";
                    npFile.projectId = (long) -1;
                }
                storage.storeNpFile(npFile);
            }
            return hashId;
        });
    }

    public static Long extractNpClass(IStorage storage, PsiClass clazz) {
        return PSI_CLASS_NP_CLASS_ID_MAP.computeIfAbsent(clazz, (k) -> {
            Long hashId = getHashId(clazz);
            AtomicBoolean contains = new AtomicBoolean(true);
            NP_CLASS_ID_MAP.computeIfAbsent(hashId, (id) -> {
                contains.set(false);
                return Boolean.TRUE;
            });
            if (!contains.get()) {
                extractNpElement(storage, clazz.getParent());
                if (clazz.isInterface()) {
                    NpInterface npInterface = new NpInterface(hashId);
                    npInterface.name = clazz.getName();
                    npInterface.qualifiedName = clazz.getQualifiedName();
                    npInterface.parent = getParent(clazz);
                    storage.storeNpInterface(npInterface);
                } else {
                    NpClass npClass = new NpClass(hashId);
                    npClass.name = clazz.getName();
                    npClass.qualifiedName = clazz.getQualifiedName();
                    npClass.parent = getParent(clazz);
                    storage.storeNpClass(npClass);
                }
            }
            return hashId;
        });
    }

    public static Long extractNpMethod(IStorage storage, PsiMethod method) {
        return PSI_METHOD_NP_METHOD_ID_MAP.computeIfAbsent(method, (k) -> {
            Long hashId = getHashId(k);
            AtomicBoolean contains = new AtomicBoolean(true);
            NP_METHOD_ID_MAP.computeIfAbsent(hashId, (id) -> {
                contains.set(false);
                return Boolean.TRUE;
            });
            // hash id does not exist
            if (!contains.get()) {
                extractNpElement(storage, method.getParent());
                NpMethod npMethod = new NpMethod(hashId);
                npMethod.name = method.getName();
                npMethod.signature = PsiUtil.mangleMethodName(method);
                npMethod.returnType = SharedManager.getType(storage, method.getReturnType());
                npMethod.parent = getParent(method);
                storage.storeNpMethod(npMethod);
            }
            return hashId;
        });
    }

    public static Long extractNpElement(IStorage storage, PsiElement element) {
        if (element instanceof PsiFile) {
            return extractNpFile(storage, (PsiFile) element);
        } else if (element instanceof PsiClass) {
            return extractNpClass(storage, (PsiClass) element);
        } else if (element instanceof PsiMethod) {
            return extractNpMethod(storage, (PsiMethod) element);
        }
        assert false: "Element's type: " + element.getClass().toString();
        return Long.valueOf(-1);
    }

    /**
     * Get dependency name and psi file path.
     * psi virtual file path: "com/google/code/gson/gson/2.10/gson-2.10.jar!/com/google/gson/Gson.class"
     * return value: ["gson-2.10.jar", "/com/google/gson/Gson.class"]
     * @param psiFile
     * @return null or an array with 2 elements [dependency name, psi file path]
     */
    private static String[] getDepNameAndFilePath(@NotNull PsiFile psiFile) {
        assert psiFile != null;
        String[] depNameAndFilePath = null;
        if (psiFile != null && psiFile.getVirtualFile() != null) {
            String virtualPath = psiFile.getVirtualFile().getPath();
            Matcher matcher = DEP_NAME_PATTERN.matcher(virtualPath);
            if (matcher.find() && (matcher.end(0) + 1) < virtualPath.length()) {
                depNameAndFilePath = new String[2];
                depNameAndFilePath[0] = matcher.group();
                depNameAndFilePath[1] = virtualPath.substring(matcher.end(0) + 1);
            }
        }
        return depNameAndFilePath;
    }

    private static Long getHashId(PsiElement element) {
        if (element == null) {
            return Long.valueOf(-1);
        }
        String signature = SignatureGenerator.generate(element);
        String repo = "default";
        String path = "default";
        PsiFile psiFile = element.getContainingFile();
        String[] depNameAndFilePath = getDepNameAndFilePath(psiFile);
        if (depNameAndFilePath != null) {
            repo = depNameAndFilePath[0];
            path = depNameAndFilePath[1];
        }
        String corefURIString = CorefURI.generate(repo, path, signature);
        return HashUtil.hashString(corefURIString);
    }

    private static Parent getParent(PsiElement element) {
        return PARENT_MAP.computeIfAbsent(element, (k) -> {
            PsiElement psiParent = PsiUtil.getPsiParent(element);
            Parent parent = new Parent(getHashId(psiParent));
            if (psiParent != null) {
                String temp = psiParent.toString();
                temp = temp.startsWith("Psi") ? temp.substring(3) : temp;
                parent.parentType = temp.contains(":") ? temp.substring(0, temp.indexOf(":")) : temp;
            } else {
                parent.parentType = "";
            }
            return parent;
        });
    }
}
