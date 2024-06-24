package com.alipay.codequery.coref.core;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.kotlin.com.intellij.openapi.util.TextRange;
import org.jetbrains.kotlin.com.intellij.psi.*;

import java.util.ArrayList;
import java.util.List;

public class SignatureGenerator {
    private static final Logger LOGGER = LogManager.getLogger(SignatureGenerator.class);

    public static String generate(PsiElement element) {
        String signature;
        if (element instanceof PsiClass) {
            signature = SignatureGenerator.generateClassSignature((PsiClass) element);
        } else if (element instanceof PsiMethod) {
            signature = SignatureGenerator.generateMethodSignature((PsiMethod) element);
        } else if (element instanceof PsiField) {
            signature = SignatureGenerator.generateFieldSignature((PsiField) element);
        } else {
            signature = SignatureGenerator.generateCommonElementSignature(element);
        }

        return signature;
    }

    private static String generateClassSignature(PsiClass psiClass) {
        // for generate signature of method whose class is null
        if(psiClass == null) {
            return "CorefDummyClass";
        }
        // if a class is an anonymous class or it is a local class inside a method.
        if (psiClass instanceof PsiAnonymousClass || psiClass.getQualifiedName() == null) {
            return generateCommonElementSignature(psiClass);
        }
        if (psiClass instanceof PsiTypeParameter) {
            return generateCommonElementSignature(psiClass);
        }
        if (psiClass.getQualifiedName() != null) {
            return psiClass.getQualifiedName();
        }

        // may be method's inner class.
        // 普通inner class的parent是PsiClass，可以正常获取到qualified name
        // method scope的inner class，psi中算作变量声明，因此我们当成普通变量来处理
        if (psiClass.getParent() instanceof PsiDeclarationStatement) {
            return generateCommonElementSignature(psiClass);
        }
        throw new RuntimeException("cannot generate signature for PsiClass: " + psiClass);
    }

    private static String generateMethodSignature(PsiMethod psiMethod) {
        // return CorefExtractor.mangleMethodName(psiMethod);
        StringBuilder paramListSignature = new StringBuilder();
        PsiParameter[] params = psiMethod.getParameterList().getParameters();
        paramListSignature.append("(");
        for (int i = 0; i < params.length; ++i) {
            PsiType paramType = params[i].getType();
            paramListSignature.append(paramType.getCanonicalText());
            if (i != params.length - 1) {
                paramListSignature.append(",");
            }
        }
        paramListSignature.append(")");

        //  Fixed: if the method exists type parameter, add it at the end of the method signature to guarantee the signature uniques.
        //  TODO: the current design may not be the best choice, needs to review it later.
        // StringBuilder typeParameterSignature = new StringBuilder();
        String typeParameterListSignature = "";
        PsiTypeParameterList typeParameterList = psiMethod.getTypeParameterList();
        try {
            // typeParameterList.getText() may throws NPE
            if(typeParameterList != null && !(typeParameterList.getText().isEmpty())) {
                List<String> typeParameterSignature = new ArrayList<>();
                for (PsiTypeParameter t : typeParameterList.getTypeParameters()) {
                    typeParameterSignature.add(t.getText());
                }
                typeParameterListSignature = ":<" + StringUtils.join(typeParameterSignature, ", ") + ">";
            }
        } catch (Exception e) {
            LOGGER.debug(e.getMessage(), e);
        }

        String methodName = psiMethod.getName();
        if (psiMethod.isConstructor()) {
            // 若是构造函数，则使用javac的处理方式，https://docs.oracle.com/javase/specs/jvms/se17/html/jvms-2.html#jvms-2.9.1
            methodName = "<init>";
        }

        return generateClassSignature(psiMethod.getContainingClass()) + "." + methodName + paramListSignature + typeParameterListSignature;
    }

    // TODO type info?
    private static String generateFieldSignature(PsiField psiField) {
        String classSignature = generateClassSignature(psiField.getContainingClass());
        return classSignature + "." + psiField.getName();
    }

    private static String generateParameterSignature(PsiParameter psiParameter) {
        return generateCommonElementSignature(psiParameter);
    }

    private static String generateLocalVariableSignature(PsiVariable psiVariable) {
        return generateCommonElementSignature(psiVariable);
    }

    private static String generateLocationSignature(PsiElement psiElement) {
        TextRange textRange = psiElement.getTextRange();
        return textRange.getStartOffset() + "-" + textRange.getEndOffset();
    }

    // TODO: PsiKeywordImpl:(0,7) ?
    private static String generateCommonElementSignature(PsiElement psiElement) {
        String offsetString = "-1";
        try {
            if (psiElement.getTextRange() != null) {
                offsetString = psiElement.getTextRange().toString();
            }
        } catch (Exception e) {
            LOGGER.debug(e.getMessage(), e);
        }
        return psiElement.toString() + ":" + offsetString;
    }

}
