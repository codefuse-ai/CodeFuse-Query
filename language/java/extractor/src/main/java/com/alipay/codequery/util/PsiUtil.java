package com.alipay.codequery.util;

import kotlin.UninitializedPropertyAccessException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.com.intellij.openapi.editor.Document;
import org.jetbrains.kotlin.com.intellij.openapi.util.Key;
import org.jetbrains.kotlin.com.intellij.psi.*;
import org.jetbrains.kotlin.com.intellij.psi.impl.source.tree.java.PsiMethodReferenceExpressionImpl;
import org.jetbrains.kotlin.com.intellij.psi.impl.source.tree.java.PsiReferenceExpressionImpl;
import org.jetbrains.kotlin.com.intellij.psi.util.*;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

import static org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil.getParentOfType;

public class PsiUtil {
    private static final Logger LOGGER = LogManager.getLogger(PsiUtil.class);

    private static final Key<ParameterizedCachedValue<Map<PsiLambdaExpression, String>, PsiClass>> LAMBDA_NAME = Key.create("ANONYMOUS_CLASS_NAME");

    public static <T extends PsiElement> String getLoc(Document document, String path, T referenceElement) {
        return String.join(File.pathSeparator, Arrays.asList(path, Integer.toString(getLineNo(document, referenceElement))));
    }

    public static <T extends PsiElement> int getLineNo(Document document, T referenceElement) {
        return document.getLineNumber(referenceElement.getTextOffset()) + 1;
    }

    public static <T extends PsiJvmMember> String getQualifiedName(T psiField) {
        String importName;
        PsiClass containingClass = psiField.getContainingClass();
        if (containingClass == null) {
            importName = psiField.getName();
        } else {
            String containingClassQualifiedName = containingClass.getQualifiedName();
            if (containingClassQualifiedName != null) {
                importName = String.join(".", Arrays.asList(containingClassQualifiedName, psiField.getName()));
            } else if (containingClass instanceof PsiAnonymousClass) {
                return null;
            } else {
                return null;
            }
        }
        return importName;
    }

    public static <T extends PsiJvmMember> String getContainingClassQualifiedName(T psiField) {
        String containingClassQualifiedName = null;
        PsiClass containingClass = psiField.getContainingClass();
        if (containingClass != null) {
            containingClassQualifiedName = containingClass.getQualifiedName();
        }
        return containingClassQualifiedName;
    }

    /**
     * Checks whether given class is inner (as opposed to nested)
     */
    public static boolean isInnerClass(@NotNull PsiClass aClass) {
        return !aClass.hasModifierProperty(PsiModifier.STATIC) && aClass.getContainingClass() != null;
    }

    public static String getVMClassName(@NotNull PsiClass aClass) {
        StringBuilder className = new StringBuilder();
        PsiClass tmpClass = aClass;
        while (tmpClass != null) {
            if (!isInnerClass(tmpClass)) {
                className.insert(0, tmpClass.getQualifiedName());
                tmpClass = null;
            } else {
                className.insert(0, "$" + tmpClass.getName());
                tmpClass = tmpClass.getContainingClass();
            }
        }
        return className.toString();
    }

    public static String getQualifiedNameIfPossible(PsiMethodReferenceExpression expression) {
        try {
            return expression.getCanonicalText();
        } catch (UninitializedPropertyAccessException e) {
            return expression.getText();
        }
    }

    public static String getQualifiedNameIfPossible(PsiAnnotationParameterList annotationParameterList) {
        String annotationName;
        PsiAnnotation psiAnnotation = ((PsiAnnotation) annotationParameterList.getParent());
        annotationName = getQualifiedNameIfPossible(psiAnnotation);
        return annotationName;
    }

    public static String getQualifiedNameIfPossible(PsiAnnotation psiAnnotation) {
        try {
            return psiAnnotation.getQualifiedName();
        } catch (UninitializedPropertyAccessException e) {
            PsiJavaCodeReferenceElement annotationNameEl = psiAnnotation.getNameReferenceElement();
            return getQualifiedNameIfPossible(annotationNameEl);
        }
    }

    @Nullable
    public static String getQualifiedNameIfPossible(PsiClass psiClass) {
        if (psiClass == null) {
            return "-1";
        }
        try {
            return psiClass.getQualifiedName();
        } catch (UninitializedPropertyAccessException e) {
            return psiClass.getName();
        }
    }

    public static String getQualifiedNameIfPossible(PsiJavaCodeReferenceElement psiJavaCodeReferenceElement) {
        if (psiJavaCodeReferenceElement == null) {
            return "-1";
        }
        try {
            return psiJavaCodeReferenceElement.getQualifiedName();
        } catch (UninitializedPropertyAccessException e) {
            return psiJavaCodeReferenceElement.getReferenceName();
        } catch (Throwable e){
            return psiJavaCodeReferenceElement.getText();
        }
    }

    public static String getQualifiedNameIfPossible(PsiExpression psiExpression) {
        if (psiExpression == null) {
            return "-1";
        }
        if (psiExpression instanceof PsiMethodReferenceExpression) {
            return ((PsiMethodReferenceExpressionImpl) psiExpression).getCanonicalText();
        }
        if (psiExpression instanceof PsiReferenceExpressionImpl) {
            return ((PsiReferenceExpressionImpl) psiExpression).getCanonicalText();
        }
        return psiExpression.getText();
    }

    public static String getQualifiedNameIfPossible(PsiType psiType) {
        if (psiType == null) {
            return "null";
        }
        try {
            return psiType.getCanonicalText();
        } catch (UninitializedPropertyAccessException e) {
            return psiType.getPresentableText();
        } catch (Throwable e){
            // return psiType.getPresentableText();
            return "null";
        }
    }

    //Add util method for PsiType's getPresentableText(), in case cannot resolve it.
    public static String getPresentableTextIfPossible(PsiType psiType) {
        try {
            return psiType.getPresentableText();
        } catch (UninitializedPropertyAccessException e) {
            return "-1";
        } catch (Throwable e){
            return "-1";
        }
    }

    public static String getClassName(PsiElement psiElement, PsiElement annotationTarget) {
        String className;
        if (annotationTarget instanceof PsiClass) {
            className = ((PsiClass) annotationTarget).getQualifiedName();
        } else {
            PsiClass[] classesInFile = ((PsiJavaFile) psiElement.getContainingFile()).getClasses();
            if (classesInFile.length > 0) {
                className = classesInFile[0].getQualifiedName();
            } else {
                return "-1";
            }
        }
        return className;
    }

    @Nullable
    public static PsiElement getAnnotationTarget(PsiElement annotation) {
        PsiElement annotationTarget;
        annotationTarget = getParentOfType(annotation, PsiMethod.class);
        if (annotationTarget == null) {
            annotationTarget = getParentOfType(annotation, PsiField.class);
        }
        if (annotationTarget == null) {
            annotationTarget = getParentOfType(annotation, PsiClass.class);
        }
        return annotationTarget;
    }

    public static String getMethodFullName(String parentClassName, PsiElement psiElement) {
        String elementName = null;

        if (psiElement instanceof PsiMethod) {
            PsiMethod psiMethod = (PsiMethod) psiElement;
            elementName = parentClassName + "." + psiMethod.getName();
        } else if (psiElement instanceof PsiLambdaExpression) {
            PsiLambdaExpression psiLambdaExpression = (PsiLambdaExpression) psiElement;
            elementName = parentClassName + "." + getVMName(psiLambdaExpression);
        }
        return elementName;
    }

    public static String getParamsTypeList(PsiElement psiElement) {
        PsiParameterList psiParameterList = null;
        if (psiElement instanceof PsiMethod) {
            psiParameterList = ((PsiMethod) psiElement).getParameterList();
            return Arrays.stream(psiParameterList.getChildren())
                .filter(el -> el instanceof PsiParameter && PsiTreeUtil.getChildrenOfType(el, PsiTypeElement.class) != null)
                .map(el -> Arrays.asList(Objects.requireNonNull(PsiTreeUtil.getChildrenOfType(el, PsiTypeElement.class))))
                .flatMap(Collection::stream)
                .map(el -> el.getType().getCanonicalText())
                .collect(Collectors.joining(", "));
        } else if (psiElement instanceof PsiLambdaExpression) {
            psiParameterList = ((PsiLambdaExpression) psiElement).getParameterList();
            return Arrays.stream(psiParameterList.getChildren())
                .filter(el -> el instanceof PsiParameter)
                .map(el -> ((PsiParameter) el).getType().getCanonicalText())
                .collect(Collectors.joining(", "));
        }
        return "-1";
    }

    public static String getReturnType(PsiElement psiElement) {
        String returnTypeName = "void";
        PsiType returnType = null;
        if (psiElement instanceof PsiMethod) {
            PsiMethod psiMethod = (PsiMethod) psiElement;
            returnType = psiMethod.getReturnType();
        } else if (psiElement instanceof PsiLambdaExpression) {
            PsiLambdaExpression psiLambdaExpression = (PsiLambdaExpression) psiElement;
            returnType = LambdaUtil.getFunctionalInterfaceReturnType(psiLambdaExpression);
        }
        if (returnType != null) {
            returnTypeName = returnType.getCanonicalText();
        }
        return returnTypeName;
    }

    @NotNull
    public static String getSignature(String methodFullName, String paramsTypeList) {
        return methodFullName + "(" + paramsTypeList + ")";
    }

    public static int getLineNoEnd(Document document, PsiElement psiElement) {
        return document.getLineNumber(psiElement.getTextRange().getEndOffset()) + 1;
    }

    /**
     * Convert to UPPER_UNDERSCORE format detecting upper case acronyms
     */
    public static String lowerUnderscoreWithAcronyms(String name) {
        if (name.toLowerCase().equals(name) || name.toUpperCase().equals(name)) {
            return name;
        }
        StringBuilder result = new StringBuilder();
        boolean begin = true;
        boolean lastUppercase = false;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (Character.isUpperCase(ch)) {
                // is start?
                if (begin) {
                    result.append(ch);
                } else {
                    if (lastUppercase) {
                        // test if end of acronym
                        if (i + 1 < name.length()) {
                            char next = name.charAt(i + 1);
                            if (Character.isUpperCase(next)) {
                                // acronym continues
                                result.append(ch);
                            } else if (Character.isDigit(next)) {
                                // acronym continues when last char is number
                                result.append(ch);
                            } else {
                                // end of acronym
                                result.append('_').append(ch);
                            }
                        } else {
                            // acronym continues
                            result.append(ch);
                        }
                    } else {
                        // last was lowercase, insert _
                        result.append('_').append(ch);
                    }
                }
                lastUppercase = true;
            } else {
                result.append(Character.toUpperCase(ch));
                lastUppercase = false;
            }
            begin = false;
        }
        return result.toString().toLowerCase();
    }

    public static String getUnderScoreText(String text) {
        return Arrays.stream(text.split("\\.")).map(PsiUtil::lowerUnderscoreWithAcronyms).collect(Collectors.joining("."));
    }

    @Nullable
    public static String getVMName(@NotNull PsiLambdaExpression lambdaExpression) {
        final PsiClass upper = getParentOfType(lambdaExpression, PsiClass.class);
        if (upper == null) {
            return null;
        }
        ParameterizedCachedValue<Map<PsiLambdaExpression, String>, PsiClass> value = upper.getUserData(LAMBDA_NAME);
        if (value == null) {
            value = CachedValuesManager.getManager(upper.getProject()).createParameterizedCachedValue(
                new ParameterizedCachedValueProvider<Map<PsiLambdaExpression, String>, PsiClass>() {
                    @Override
                    public CachedValueProvider.Result<Map<PsiLambdaExpression, String>> compute(final PsiClass upper) {
                        final Map<PsiLambdaExpression, String> map = new HashMap<>();
                        upper.accept(new JavaRecursiveElementWalkingVisitor() {
                            int index;

                            @Override
                            public void visitLambdaExpression(PsiLambdaExpression expression) {
                                map.put(expression, "$" + index++);
                                super.visitLambdaExpression(expression);
                            }

                            @Override
                            public void visitClass(PsiClass aClass) {
                                if (aClass == upper) {
                                    super.visitClass(aClass);
                                }
                            }
                        });
                        return CachedValueProvider.Result.create(map, upper);
                    }
                }, false);
            upper.putUserData(LAMBDA_NAME, value);
        }
        return "lambda" + getLambdaPrefix(lambdaExpression) + value.getValue(upper).get(lambdaExpression);
    }

    public static String getLambdaPrefix(@NotNull PsiLambdaExpression lambdaExpression) {
        PsiMember member = getParentOfType(lambdaExpression, PsiMethod.class, PsiClass.class, PsiField.class);
        final String methodPrefix;
        if (member instanceof PsiMethod) {
            methodPrefix = member.getContainingClass() instanceof PsiAnonymousClass ? "" : "$" + member.getName();
        } else if (member instanceof PsiField && member.getContainingClass() instanceof PsiAnonymousClass) {
            methodPrefix = "";
        } else {
            //inside class initializer everywhere or field in a named class
            methodPrefix = "$new";
        }
        return methodPrefix;
    }

    public static boolean isModifiedWith(PsiModifierListOwner element, String... modifiers) {
        @Nullable PsiModifierList modifierList = element.getModifierList();
        if (modifierList == null) {
            return false;
        }
        return Arrays.stream(modifiers).allMatch(modifierList::hasModifierProperty);
    }

    public static boolean isModifiedWith(PsiModifierListOwner element, Set<String> modifiers) {
        @Nullable PsiModifierList modifierList = element.getModifierList();
        if (modifierList == null) {
            return false;
        }
        return modifiers.stream().allMatch(modifierList::hasModifierProperty);
    }

    public static String getNameIfPossible(PsiType psiType) {
        try {
            return psiType.getPresentableText();
        } catch (UninitializedPropertyAccessException e) {
            return "-1";
        } catch (Throwable e) {
            return "-1";
        }
    }

    public static String mangleMethodName(@NotNull PsiMethod method) {
        assert method != null;
        PsiClass clazz = method.getContainingClass();
        if (clazz == null) {
            return method.getName();
        }
        String classname = clazz.getQualifiedName();
        if (classname == null) {
            if (clazz.getNameIdentifier() != null) {
                classname = clazz.getNameIdentifier().getText();
            } else {
                classname = clazz.getName();
            }
        }
        StringBuilder suffix = new StringBuilder();
        suffix.append(":");
        // FIXME(Kai Luo): Resolve classes in JDK
        suffix.append(PsiUtil.getQualifiedNameIfPossible(method.getReturnType()));

        PsiParameter[] params = method.getParameterList().getParameters();
        suffix.append("(");
        for (int i = 0; i < params.length; ++i) {
            PsiType ty = params[i].getType();
            // NOTE(Kai Luo): Resolution might occur here.
            suffix.append(PsiUtil.getQualifiedNameIfPossible(ty));
            if (i != params.length - 1) {
                suffix.append(", ");
            }
        }
        suffix.append(")");

        //  Fixed: if the method exists type parameter, add it at the end of the method signature to guarantee the signature uniques.
        //  TODO: the current design may not be the best choice, needs to review it later.
        PsiTypeParameterList typeParameterList = method.getTypeParameterList();
        try {
            // typeParameterList.getText() may produce NPE, just catch it and ignore
            if(typeParameterList != null && !(typeParameterList.getText().isEmpty())) {
                suffix.append(":<");
                for (int i = 0; i < typeParameterList.getTypeParameters().length; ++i) {
                    suffix.append(typeParameterList.getTypeParameters()[i].getText());
                    if (i != typeParameterList.getTypeParameters().length - 1) {
                        suffix.append(", ");
                    }
                }
                suffix.append(">");
            }
        } catch (Exception e) {
            LOGGER.debug(e.getMessage(), e);
        }
        return classname + "." + method.getName() + suffix;
    }

    public static PsiElement getPsiParent(PsiElement element) {
        PsiElement psiParent;
        if (element instanceof PsiImportStatementBase || element.getParent() instanceof PsiParameterList
            || element instanceof PsiTypeParameter || element instanceof PsiNameValuePair
            || element instanceof PsiArrayInitializerMemberValue || element.getParent() instanceof PsiTypeTestPattern) {
            psiParent = element.getParent().getParent();
        } else if (element instanceof PsiMethod) {
            psiParent = ((PsiMethod) element).getContainingClass();
        } else {
            psiParent = element.getParent();
        }
        return psiParent;
    }
}
