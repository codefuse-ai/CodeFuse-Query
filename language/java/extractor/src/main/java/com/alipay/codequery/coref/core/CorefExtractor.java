package com.alipay.codequery.coref.core;

import com.alipay.codequery.coref.model.*;
import com.alipay.codequery.coref.model.Class;
import com.alipay.codequery.coref.model.Comment;
import com.alipay.codequery.coref.model.Expression;
import com.alipay.codequery.coref.model.Identifier;
import com.alipay.codequery.coref.model.Location;
import com.alipay.codequery.coref.model.Method;
import com.alipay.codequery.coref.model.Modifier;
import com.alipay.codequery.coref.model.Package;
import com.alipay.codequery.coref.model.Parameter;
import com.alipay.codequery.coref.model.Statement;
import com.alipay.codequery.coref.storage.IStorage;
import com.alipay.codequery.coref.util.HashUtil;
import com.alipay.codequery.dal.mybatis.domain.*;
import com.alipay.codequery.project.PsiProject;
import com.alipay.codequery.util.PathUtil;
import com.alipay.codequery.util.PsiUtil;
import com.alipay.codequery.coref.model.Annotation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.com.intellij.openapi.editor.Document;
import org.jetbrains.kotlin.com.intellij.openapi.util.TextRange;
import org.jetbrains.kotlin.com.intellij.openapi.util.text.StringUtil;
import org.jetbrains.kotlin.com.intellij.psi.*;
import org.jetbrains.kotlin.com.intellij.psi.impl.source.PsiClassReferenceType;
import org.jetbrains.kotlin.com.intellij.psi.javadoc.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CorefExtractor extends JavaRecursiveElementVisitor {
    private static final Logger logger = LogManager.getLogger(CorefExtractor.class);

    // TODO hold PSI File may cause high memory usage
    private final PsiFile file;
    private final Document document;
    private final String repoDir;
    private final PsiProject project;
    private final com.alipay.codequery.coref.model.Program program;
    private final IStorage corefStorage;
    public String fileMD5cached;
    public String fileSHA256cached;
    final Map<TextRange, Long> locationMap = new HashMap<>();
    final Map<PsiElement, com.alipay.codequery.coref.model.Parent> parentMap = new HashMap<>();
    final HashMap<Integer, String> lineTag = new HashMap<>();
    private CorefURI corefURI;

    public CorefExtractor(PsiProject project, String repoDir, PsiFile file, IStorage corefStorage, com.alipay.codequery.coref.model.Program program, CorefURI corefURI) {
        this.project = project;
        this.repoDir = repoDir;
        this.file = file;
        this.document = project.documentOf(file);
        this.corefStorage = corefStorage;
        this.program = program;
        fileSHA256cached = HashUtil.getFileSHA1(file.getVirtualFile().getCanonicalPath());
        fileMD5cached = HashUtil.getFileMD5(file.getVirtualFile().getCanonicalPath());
        classifyJavaLines(file);
        this.corefURI = corefURI;
        String relativePath = PathUtil.getRelPath(repoDir, file.getVirtualFile().getPath());
        this.corefURI.setPath(relativePath);
    }

    public void classifyJavaLines(PsiFile file) {
        BufferedReader reader = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file.getVirtualFile().getCanonicalPath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        reader = new BufferedReader(fileReader);
        String line = null;
        int count = 1;
        try {
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    lineTag.put(count, "Empty");
                } else if (line.startsWith("//") || (line.startsWith("/*")) || (line.startsWith("*")) || (line.endsWith("*/"))) {
                    lineTag.put(count, "Comment");
                }
                count++;
            }
            if (file.getText().endsWith("")) {
                lineTag.put(count, "Empty");
            }
            reader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getValidJavaLines(Location.LocalLocation location, long id) {
        int startLineNumber = location.startLineNumber;
        int endLineNumber = location.endLineNumber;
        int numberOfEmptyLines = 0;
        int numberOfCommentLines = 0;
        int totalLines = endLineNumber - startLineNumber + 1;
        for (int i = startLineNumber; i <= endLineNumber; i++) {
            if (lineTag.containsKey(i)) {
                if (lineTag.get(i).equals("Empty")) {
                    numberOfEmptyLines++;
                } else if (lineTag.get(i).equals("Comment")) {
                    numberOfCommentLines++;
                }
            }
        }
        Location.NumberOfLines numberOfLines = new Location.NumberOfLines(id);
        numberOfLines.numberOfLines = totalLines;
        numberOfLines.numberOfCodeLines = totalLines - numberOfEmptyLines - numberOfCommentLines;
        numberOfLines.numberOfCommentLines = numberOfCommentLines;
        corefStorage.storeNumberOfLines(numberOfLines);
    }

    public Long getHashId(PsiElement element) {
        if( element != null) {
            String signature = SignatureGenerator.generate(element);
            String path = corefURI.getPath();

            //when a resolved element is from another file, needs to use its real file path.
            if(element.getContainingFile() != null && element.getContainingFile().getVirtualFile() != null) {
                if(!(element.getContainingFile().equals(file))){
                    path = PathUtil.getRelPath(repoDir, element.getContainingFile().getVirtualFile().getPath());
                }
            }

            String corefURIString = CorefURI.generate(corefURI.getRepository(), path, signature);
            return HashUtil.hashString(corefURIString);
        } else {
            return Long.valueOf(-1);
        }
    }

    //subclass of reference expression.
    @Override
    public void visitMethodReferenceExpression(PsiMethodReferenceExpression expression) {
        super.visitMethodReferenceExpression(expression);
        com.alipay.codequery.coref.model.Expression.MethodCallExpression methodReferenceExpression = new com.alipay.codequery.coref.model.Expression.MethodCallExpression(getHashId(expression));

        PsiElement resolvedMethod = expression.getPotentiallyApplicableMember();
        Long calleeId = null;
        if(isPhysicalValidElement(resolvedMethod)) {
            calleeId = getHashId(resolvedMethod);
        }
        // else if (resolvedMethod != null) {
        //     calleeId = CorefDepExtractor.extractNpElement(corefStorage, resolvedMethod);
        // }
        if (calleeId != null) {
            CallableBinding callableBinding = new CallableBinding(methodReferenceExpression.hashId, calleeId);
            corefStorage.storeCallableBinding(callableBinding);
        }

        methodReferenceExpression.isConstructor = expression.isConstructor() ? 1 : 0;
        corefStorage.storeMethodReferenceExpression(methodReferenceExpression);
    }

    public Location.LocalLocation calculateLocalLocation(Document document, PsiElement element) {
        TextRange textRange = element.getTextRange();
        int startOffset = textRange.getStartOffset();
        int startLineNumber = document.getLineNumber(startOffset);
        int startColumnNumber = startOffset - document.getLineStartOffset(startLineNumber);
        if (element instanceof PsiClass && ((PsiClass) element).getNameIdentifier() != null) {
            TextRange textRange1 = ((PsiClass) element).getNameIdentifier().getTextRange();
            startOffset = textRange1.getStartOffset();
            startLineNumber = document.getLineNumber(startOffset);
        }
        int endOffset = textRange.getEndOffset();
        int endLineNumber = document.getLineNumber(endOffset);
        int endColumnNumber = endOffset - document.getLineStartOffset(endLineNumber);
        return new Location.LocalLocation(startLineNumber + 1, startColumnNumber + 1, endLineNumber + 1, endColumnNumber + 1);
    }

    public Location calculateLocation(Document document, PsiElement element) {
        if (element instanceof PsiFile) {
            return null;
        } else {
            // If the Location has been calculated before, return it directly.
            if (locationMap.containsKey(element.getTextRange())) {
                return new Location(locationMap.get(element.getTextRange()));
            } else {
                PsiFile containingFile = element.getContainingFile();
                com.alipay.codequery.coref.model.File file1 = new com.alipay.codequery.coref.model.File(getHashId(containingFile));

                // Generate the element's location hash id if not exists.
                Long hashId = getLocationHashId(element);
                locationMap.put(element.getTextRange(), hashId);

                // If the element is resolved, the document should be generated again.
                if (!(element.getContainingFile().equals(file))) {
                    document = project.documentOf(containingFile);
                }
                Location.LocalLocation localLocation = calculateLocalLocation(document, element);
                getValidJavaLines(localLocation, hashId);
                Location location = new Location(hashId, file1, localLocation);
                corefStorage.storeLocation(location);
                return location;
            }
        }
    }

    // Generate location hash id.
    public Long getLocationHashId(PsiElement element) {
        return CorefURI.generateHashId(corefURI.getRepository(), corefURI.getPath(), SignatureGenerator.generate(element));
    }

    @Override
    public void visitInstanceOfExpression(PsiInstanceOfExpression expression) {
        super.visitInstanceOfExpression(expression);
        com.alipay.codequery.coref.model.Expression.InstanceOfExpression instanceOfExpression = new com.alipay.codequery.coref.model.Expression.InstanceOfExpression(getHashId(expression));
        //type element
        instanceOfExpression.checkType = expression.getCheckType() != null ?
            new com.alipay.codequery.coref.model.Expression(getHashId(expression.getCheckType())) : new com.alipay.codequery.coref.model.Expression((long) -1);
        //expression
        instanceOfExpression.operand = new com.alipay.codequery.coref.model.Expression(getHashId(expression.getOperand()));
        //typetestpattern, parent of checktype
        instanceOfExpression.pattern = expression.getPattern() != null ?
            new com.alipay.codequery.coref.model.Expression(getHashId(expression.getPattern())) : new com.alipay.codequery.coref.model.Expression((long) -1);
        instanceOfExpression.location = calculateLocation(document, expression);
        corefStorage.storeInstanceOfExpression(instanceOfExpression);
    }

    @Override
    public void visitAnnotationArrayInitializer(PsiArrayInitializerMemberValue initializer) {
        super.visitAnnotationArrayInitializer(initializer);
        com.alipay.codequery.coref.model.Expression.ArrayInitializationExpression aExpression = new com.alipay.codequery.coref.model.Expression.ArrayInitializationExpression(getHashId(initializer));
        aExpression.debug_message = initializer.getText();
        aExpression.parent = getParent(initializer); //PsiArrayInitializerMemberValue element.
        aExpression.location = calculateLocation(document, initializer);
        corefStorage.storeAnnotationArrayInitializer(aExpression);
    }

    //PsiImportStaticStatement extends PsiImportStatementBase extends PsiElement
    @Override
    public void visitImportStaticStatement(PsiImportStaticStatement statement) {
        super.visitImportStaticStatement(statement);
        com.alipay.codequery.coref.model.Statement.ImportStatement importStatement = new com.alipay.codequery.coref.model.Statement.ImportStatement(getHashId(statement));
        importStatement.reference = new com.alipay.codequery.coref.model.Statement(getHashId(statement.getImportReference()));
        importStatement.debug_message = statement.getText();
        importStatement.parent = getParent(statement);
        importStatement.location = calculateLocation(document, statement);
        corefStorage.storeImportStaticStatement(importStatement);
    }

    @Override
    public void visitImportStaticReferenceElement(PsiImportStaticReferenceElement reference) {
        super.visitImportStaticReferenceElement(reference);
        com.alipay.codequery.coref.model.Expression importReference = new com.alipay.codequery.coref.model.Expression(getHashId(reference));
        importReference.debug_message = reference.getQualifiedName();
        importReference.parent = getParent(reference);
        importReference.location = calculateLocation(document, reference);
        corefStorage.storeImportStaticReferenceElement(importReference);
        if (isPhysicalValidElement(reference.resolve())) {
            PsiElement definition = reference.resolve();
            ReferenceRelation referenceRelation = new ReferenceRelation(getHashId(reference), getHashId(definition));
            corefStorage.storeReferenceRelation(referenceRelation);
        }
    }

    @Override
    public void visitAnnotation(PsiAnnotation annotation) {
        super.visitAnnotation(annotation);
        Annotation.AnnotationModel annotations = new Annotation.AnnotationModel(getHashId(annotation));
        annotations.name = new com.alipay.codequery.coref.model.Identifier(annotation.getNameReferenceElement().getText(), getHashId(annotation.getNameReferenceElement()));
        annotations.qualifiedName = annotation.getQualifiedName() != null ? annotation.getQualifiedName() : "-1";
        annotations.location = calculateLocation(document, annotation);
        annotations.parent = getParent(annotation);
        annotations.debug_message = annotation.getText();

        if (isPhysicalValidElement(annotation.resolveAnnotationType())) {
            annotations.resolveAnnotationType = new Node(getHashId(annotation.resolveAnnotationType()));
            corefStorage.storeAnnotationCanResolved(annotations);
        } else {
            corefStorage.storeAnnotationCanNotResolved(annotations);
        }

        if (annotation.getParent() instanceof PsiModifierList) {
            AnnotatedRelation annoRelation = new AnnotatedRelation();
            annoRelation.setAnnotationHashId(annotations.hashId);
            annoRelation.setAnnotatedItemHashId(getHashId(annotation.getParent().getParent()));
            corefStorage.storeAnnotatedRelation(annoRelation);
        }

    }

    @Deprecated
    private void processAnnotationType(PsiClass annotationType) {
        boolean shouldVisit = false;
        synchronized (SharedManager.RESOLVED_ANNOTATION_SET) {
            @Nullable String name = annotationType.getQualifiedName();
            if (SharedManager.RESOLVED_ANNOTATION_SET.contains(name)) {
                shouldVisit = false;
            } else {
                SharedManager.RESOLVED_ANNOTATION_SET.add(name);
                shouldVisit = true;
            }
        }
        if (shouldVisit) {
            visitAnnotationDeclaration(annotationType);
        }
    }

    @Override
    public void visitAnnotationMethod(PsiAnnotationMethod method) {
        super.visitAnnotationMethod(method);
        Annotation.AnnotationParameter parameter = new Annotation.AnnotationParameter(getHashId(method));
        parameter.debug_message = method.getText();
        parameter.location = calculateLocation(document, method);
        parameter.type = getType(method.getReturnType());
        parameter.parent = getParent(method);
        parameter.name = new com.alipay.codequery.coref.model.Identifier(method.getName(), getHashId(method.getNameIdentifier()));
        corefStorage.storeAnnotationDeclarationParameter(parameter);

        if (method.getDefaultValue() != null) {
            AnnotationDeclarationParameterDefaultValue parameterDefaultValue = new AnnotationDeclarationParameterDefaultValue();
            parameterDefaultValue.setDefaultValue(method.getDefaultValue().getText());
            parameterDefaultValue.setElementHashId(parameter.hashId);
            corefStorage.storeAnnotationDeclarationParameterDefaultValue(parameterDefaultValue);
        }
    }

    public void generateFileCache(com.alipay.codequery.coref.model.File file) {
        FileMd5Sum fileMd5 = new FileMd5Sum();
        fileMd5.setFileHashId(file.hashId);
        fileMd5.setValue(fileMD5cached);
        corefStorage.storeFileMd5Sum(fileMd5);

        FileSha256Sum fileSha256Sum = new FileSha256Sum();
        fileSha256Sum.setFileHashId(file.hashId);
        fileSha256Sum.setValue(fileSHA256cached);
        corefStorage.storeFileSHA256Sum(fileSha256Sum);
    }

    @Override
    public void visitReferenceParameterList(PsiReferenceParameterList list) {
        super.visitReferenceParameterList(list);
        if (!(list.getText().isEmpty())) {
            ParameterList.ReferenceParameterList referenceParameterList = new ParameterList.ReferenceParameterList(getHashId(list));
            referenceParameterList.parent = getParent(list);
            referenceParameterList.location = calculateLocation(document, list);
            referenceParameterList.debug_message = list.getText();

            if(referenceParameterList.debug_message.equals("<>")){
                // The list is "<>".
                corefStorage.storeEmptyReferenceParameterlist(referenceParameterList);
            } else {
                referenceParameterList.types = new Type[list.getTypeParameterElements().length];
                for (int i = 0; i < list.getTypeParameterElements().length; i++) {
                    referenceParameterList.types[i] = new Type(getHashId(list.getTypeParameterElements()[i]));
                    corefStorage.storeReferenceParameterlist(referenceParameterList, i);
                }
            }
        }
    }

    @Override
    public void visitFile(@NotNull PsiFile file) {
        super.visitFile(file);
        String absolutePath = file.getVirtualFile().getCanonicalPath();
        com.alipay.codequery.coref.model.File files = new com.alipay.codequery.coref.model.File(getHashId(file));
        generateFileCache(files);
        char head = repoDir.charAt(0);
        String relativePath;
        switch (head) {
            case '/':
                relativePath = absolutePath.substring(repoDir.length() + 1);
                break;
            case '.':
                relativePath = absolutePath.substring(absolutePath.indexOf(repoDir) + 2);
                break;
            default:
                relativePath = absolutePath.substring(absolutePath.indexOf(repoDir));
        }
        files.qualifiedName = relativePath;
        files.name = file.getName();
        files.extension = file.getLanguage().getDisplayName();
        files.program = program;
        files.numberOfLines = new Location.NumberOfLines(getLocationHashId(file));
        getValidJavaLines(calculateLocalLocation(document, file), files.numberOfLines.hashId);
        if (SharedManager.FILE_MAP.containsKey(absolutePath)) {
            ContainerParent containerParent = new ContainerParent(files.hashId, SharedManager.FILE_MAP.get(absolutePath));
            corefStorage.storeContainerParent(containerParent);
        }
        corefStorage.storeFile(files);
    }

    //PsiPackageStatement extends PsiElement, not a statement, actually.
    @Override
    public void visitPackageStatement(PsiPackageStatement statement) {
        super.visitPackageStatement(statement);
        com.alipay.codequery.coref.model.Statement.PackageStatement packages = new com.alipay.codequery.coref.model.Statement.PackageStatement(getHashId(statement));
        packages.debug_message = statement.getPackageName();
        packages.location = calculateLocation(document, statement);
        packages.parent = getParent(statement);

        @Nullable PsiElement resolved;
        resolved = statement.getPackageReference().resolve();

        if (resolved != null) {
            packages.referencePackage = new Package(getHashId(resolved));
        } else {
            packages.referencePackage = new Package((long) -1);
        }
        Cupackage cupackage = new Cupackage();
        cupackage.setFileHashId(getHashId(file));
        cupackage.setPackageHashId(packages.referencePackage.hashId);
        corefStorage.storeCuPackage(cupackage);
        corefStorage.storePackageStatement(packages);
    }

    public String mangleFieldName(PsiField field) {
        PsiClass parent = field.getContainingClass();
        PsiIdentifier ident = field.getNameIdentifier();
        PsiType type = field.getType();
        String typedString = null;
        if (type instanceof PsiPrimitiveType) {
            typedString = type.getPresentableText();
        }
        if (type instanceof PsiClassReferenceType) {
            PsiClassReferenceType psiClassReferenceType = (PsiClassReferenceType) type;
            typedString = psiClassReferenceType.getPresentableText();
        }
        if (parent.getQualifiedName() != null) {
            return parent.getQualifiedName() + "." + ident.getText() + ":" + typedString;
        }
        if (parent.getNameIdentifier() != null) {
            return parent.getNameIdentifier().getText() + "." + ident.getText() + ":" + typedString;
        }
        return ident.getText() + ":" + typedString;
    }

    private Type getType(PsiType type) {
        return SharedManager.getType(corefStorage, type);
    }

    @Deprecated
    public void generateCallableEnclosingElement(PsiElement element, Node node) {
        Long elementId;
        if (!(element instanceof PsiJavaToken) && !(element instanceof PsiWhiteSpace)) {
            for (PsiElement e : element.getChildren()) {
                if (!(e instanceof PsiMethod)) {
                    elementId = getHashId(e);
                    if (e instanceof PsiExpression) {
                        CallableEnclosingExpression callableEnclosingExpression = new CallableEnclosingExpression(elementId, node.hashId);
                        corefStorage.storeCallableEnclosingExpression(callableEnclosingExpression);
                    } else if (e instanceof PsiStatement) {
                        com.alipay.codequery.coref.model.Statement s = new com.alipay.codequery.coref.model.Statement(getHashId(e));
                        CallableEnclosingStatement callableEnclosingStatement = new CallableEnclosingStatement(elementId, node.hashId);
                        corefStorage.storeCallableEnclosingStatement(callableEnclosingStatement);
                        generateStatementEnclosingExpression(e, s);
                    }
                    generateCallableEnclosingElement(e, node);
                }
            }
        }
    }

    @Deprecated
    public void generateStatementEnclosingExpressionLegacy(PsiElement element, Node node) {
        if (element instanceof PsiJavaToken || element instanceof PsiWhiteSpace) {
            return;
        } else {
            for (PsiElement e : element.getChildren()) {
                if (e instanceof PsiStatement) {
                    continue;
                }
                if (e instanceof PsiExpression) {
                    StatementEnclosingExpression statementEnclosingExpression = new StatementEnclosingExpression(node.hashId, getHashId(element));
                    corefStorage.storeStatementEnclosingExpression(statementEnclosingExpression);
                }
                generateStatementEnclosingExpressionLegacy(e, node);
            }
        }
    }
    // Iterates to find any expression in a statement element.
    public void generateStatementEnclosingExpression(PsiElement element, Node node) {
        ArrayList<PsiElement> pending = new ArrayList<>();
        List<PsiElement> children = new ArrayList<>();

        // ready to expand the element (from current)
        pending.add(element);

        // loop to expand
        while (!pending.isEmpty()) {
            // get and remove
            PsiElement item = pending.get(0);
            pending.remove(0);

            // ignore them
            if (item instanceof PsiJavaToken || item instanceof PsiWhiteSpace) {
                continue;
            } else {
                for (PsiElement child : item.getChildren()) {
                    if (child instanceof PsiStatement) {
                        continue;
                    }
                    if (child instanceof PsiExpression) {
                        children.add(child);
                    }
                    // continue to expand the element
                    pending.add(child);
                }
            }
        }

        for (PsiElement child : children) {
            StatementEnclosingExpression statementEnclosingExpression = new StatementEnclosingExpression(getHashId(child), node.hashId);
            corefStorage.storeStatementEnclosingExpression(statementEnclosingExpression);
        }
    }

    // Iterates to find any statements or expressions in a callable element.
    public void generateCallableEnclosingNode(PsiElement element, Node node) {
        ArrayList<PsiElement> pending = new ArrayList<>();
        List<PsiElement> statementChildren = new ArrayList<>();
        List<PsiElement> expressionChildren = new ArrayList<>();

        // ready to expand the element (from current)
        pending.add(element);

        // loop to expand
        while (!pending.isEmpty()) {
            // get and remove
            PsiElement item = pending.get(0);
            pending.remove(0);

            // ignore them
            if (item instanceof PsiJavaToken || item instanceof PsiWhiteSpace) {
                continue;
            } else {
                for (PsiElement child : item.getChildren()) {
                    if(child instanceof PsiMethod) {
                        continue;
                    }
                    if (child instanceof PsiStatement) {
                        statementChildren.add(child);
                    }
                    if (child instanceof PsiExpression) {
                        expressionChildren.add(child);
                    }
                    // continue to expand the element
                    pending.add(child);
                }
            }
        }

        for (PsiElement child : statementChildren) {
            CallableEnclosingStatement callableEnclosingStatement = new CallableEnclosingStatement(getHashId(child), node.hashId);
            corefStorage.storeCallableEnclosingStatement(callableEnclosingStatement);
        }

        for (PsiElement child : expressionChildren) {
            CallableEnclosingExpression callableEnclosingExpression = new CallableEnclosingExpression(getHashId(child), node.hashId);
            corefStorage.storeCallableEnclosingExpression(callableEnclosingExpression);
        }
    }

    @Override
    public void visitTypeElement(PsiTypeElement type) {
        super.visitTypeElement(type);
        if(!type.getText().isEmpty()){
            Type typeElement = new Type(getHashId(type));
            typeElement.debug_message = type.getText();
            typeElement.type = getType(type.getType());
            typeElement.parent = getParent(type);
            typeElement.location = calculateLocation(document, type);
            corefStorage.storeTypeElement(typeElement);
        }
    }

    @Override
    public void visitSuperExpression(PsiSuperExpression expression) {
        super.visitSuperExpression(expression);
        com.alipay.codequery.coref.model.Expression.SuperExpression superExpression = new com.alipay.codequery.coref.model.Expression.SuperExpression(getHashId(expression));

        //qualifier always is null
        if(expression.getQualifier() != null) {
            superExpression.qualifier = new com.alipay.codequery.coref.model.Expression(getHashId(expression.getQualifier()));
            corefStorage.storeSuperExpressionWithQualifier(superExpression);
        }

        corefStorage.storeSuperExpression(superExpression);
    }

    @Override
    // PsiTypeParameter extends PsiClass
    public void visitTypeParameter(PsiTypeParameter classParameter) {
        super.visitTypeParameter(classParameter);
        Type.TypeParameter parameter = new Type.TypeParameter(getHashId(classParameter));
        parameter.index = classParameter.getIndex();
        parameter.owner = classParameter.getOwner() != null ?
            new Node(getHashId(classParameter.getOwner())) : new Node((long) -1);
        parameter.parent = getParent(classParameter);
        parameter.location = calculateLocation(document, classParameter);
        parameter.debug_message = classParameter.getText();
        //extendsList is a reference list.
        parameter.extendsList = new Node(getHashId(classParameter.getExtendsList()));
        corefStorage.storeTypeParameter(parameter);
    }

    // store implements relation.
    private void generateImplementsRelation(Long oid, PsiClass psiClass) {
        for (PsiType t : psiClass.getImplementsListTypes()) {
            ClassImplementList list = new ClassImplementList(oid, getType(t).hashId);
            corefStorage.storeImplementlist(list);
        }
    }

    // store extends relation (class hierarchy).
    private void generateExtendsRelation(Long oid, PsiClass psiClass) {
        for (PsiClass c : psiClass.getSupers()) {
            // TODO: when JAVA_HOME is specified, PSI can resolve extends relation from java.lang package. But extractor couldn't resolve other relevant info from jar currently, so excludes this kind of relation from class hierarchy temporally.
            if(c.getQualifiedName() != null ){
                if (!(StringUtil.startsWith(c.getQualifiedName(), "java.lang."))) {
                    com.alipay.codequery.coref.model.Class.ClassHierarchy classHierarchy = new com.alipay.codequery.coref.model.Class.ClassHierarchy(oid, getHashId(c));
                    corefStorage.storeClassHierarchy(classHierarchy);
                }
            }
        }
    }

    @Override
    public void visitClass(PsiClass aClass) {
        super.visitClass(aClass);

        // class extracting, firstly exclude anonymous class and type parameter elements.
        if( !(aClass instanceof PsiTypeParameter) && !(aClass instanceof PsiAnonymousClass)) {
            com.alipay.codequery.coref.model.Class.ClassDefinition class1 = new com.alipay.codequery.coref.model.Class.ClassDefinition(getHashId(aClass));
            class1.parent = getParent(aClass);
            class1.identifier = new com.alipay.codequery.coref.model.Identifier(aClass.getName(), getHashId(aClass.getNameIdentifier()));
            class1.location = calculateLocation(document, aClass);
            class1.qualifiedName = aClass.getQualifiedName() != null ? aClass.getQualifiedName() : aClass.getName();

            if(aClass.getQualifiedName() == null) {
                class1.debug_message = aClass.getText();
                // store null qualified name local class in local class declaration table.
                corefStorage.storeLocalClass(class1);

            } else if(aClass.isInterface()){
                // store interface into interface table.
                corefStorage.storeInterface(class1);

                // if the class is annotation class, also save it in the annotation declaration table.
                if (aClass.isAnnotationType()) {
                    visitAnnotationDeclaration(aClass);
                }

            } else {
                generateImplementsRelation(class1.hashId, aClass);

                // store normal class.
                corefStorage.storeClass(class1);
            }
            generateExtendsRelation(class1.hashId, aClass);
        }

    }

    @Override
    public void visitAnnotationParameterList(PsiAnnotationParameterList list) {
        super.visitAnnotationParameterList(list);
        int index = 0;
        for (PsiNameValuePair var : list.getAttributes()) {
            Annotation.AnnotationArgument annoParam = new Annotation.AnnotationArgument(getHashId(var));
            annoParam.value = var.getDetachedValue() != null ?
                new com.alipay.codequery.coref.model.Expression(getHashId(var.getDetachedValue())) : new com.alipay.codequery.coref.model.Expression((long) -1);
            annoParam.location = calculateLocation(document, var);
            annoParam.parent = getParent(var); //ignore PsiAnnotationParameterList element.
            annoParam.debug_message = var.getText();
            annoParam.index = index;
            index++;
            //If the parameter has no name, the default name is "value".
            if(var.getNameIdentifier() != null) {
                annoParam.kind = new com.alipay.codequery.coref.model.Expression(getHashId(var.getNameIdentifier()));
                corefStorage.storeAnnotationArgumentWithName(annoParam);
            } else {
                corefStorage.storeAnnotationArgumentWithoutName(annoParam);
            }
        }
    }

    public void visitAnnotationDeclaration(PsiClass aclass) {
        Annotation.AnnotationModel annotationDeclaration = new Annotation.AnnotationModel(getHashId(aclass));
        annotationDeclaration.qualifiedName = aclass.getQualifiedName();
        corefStorage.storeAnnotationDeclaration(annotationDeclaration);
    }

    public void visitProgram() {
        corefStorage.storeProgram(program);
    }

    @Override
    public void visitWhileStatement(PsiWhileStatement statement) {
        super.visitWhileStatement(statement);
        com.alipay.codequery.coref.model.Statement.WhileStatement whileStatement = new com.alipay.codequery.coref.model.Statement.WhileStatement(getHashId(statement));
        whileStatement.condition = statement.getCondition() != null ?
            new com.alipay.codequery.coref.model.Expression(getHashId(statement.getCondition())) : new com.alipay.codequery.coref.model.Expression((long) -1);
        whileStatement.body = statement.getBody() != null ?
            new com.alipay.codequery.coref.model.Statement(getHashId(statement.getBody())) : new com.alipay.codequery.coref.model.Statement((long) -1);
        corefStorage.storeWhileStatement(whileStatement);
    }

    @Override
    public void visitDoWhileStatement(PsiDoWhileStatement statement) {
        super.visitDoWhileStatement(statement);
        com.alipay.codequery.coref.model.Statement.DoWhileStatement doWhileStatement = new com.alipay.codequery.coref.model.Statement.DoWhileStatement(getHashId(statement));
        doWhileStatement.condition = statement.getCondition() != null ?
            new com.alipay.codequery.coref.model.Expression(getHashId(statement.getCondition())) : new com.alipay.codequery.coref.model.Expression((long) -1);
        doWhileStatement.keyword = statement.getWhileKeyword().getText();
        doWhileStatement.body = statement.getBody() != null ?
            new com.alipay.codequery.coref.model.Statement(getHashId(statement.getBody())) : new com.alipay.codequery.coref.model.Statement((long) -1);
        corefStorage.storeDoWhileStatement(doWhileStatement);
    }

    @Override
    public void visitBlockStatement(PsiBlockStatement statement) {
        super.visitBlockStatement(statement);
        com.alipay.codequery.coref.model.Statement.BlockStatement blockStatement = new com.alipay.codequery.coref.model.Statement.BlockStatement(getHashId(statement));
        blockStatement.codeBlock = new com.alipay.codequery.coref.model.Statement.CodeBlock(getHashId(statement.getCodeBlock()));
        corefStorage.storeBlockStatement(blockStatement);
    }
    //PsiCodeBlock extends PsiElement, not a statement.
    @Override
    public void visitCodeBlock(PsiCodeBlock block) {
        super.visitCodeBlock(block);
        com.alipay.codequery.coref.model.Statement.CodeBlock codeBlock = new com.alipay.codequery.coref.model.Statement.CodeBlock(getHashId(block));
        codeBlock.count = block.getStatementCount();
        codeBlock.isEmpty = block.isEmpty() ? 1 : 0;
        codeBlock.parent = getParent(block);
        codeBlock.location = calculateLocation(document, block);
        codeBlock.debug_message = block.getText();
        corefStorage.storeCodeBlock(codeBlock);
    }
    //PsiModifierList extends PsiAnnotationOwner
    @Override
    public void visitModifierList(PsiModifierList list) {
        super.visitModifierList(list);
        if (!(list.getText().isEmpty())) {
            com.alipay.codequery.coref.model.Modifier modifierlist = new com.alipay.codequery.coref.model.Modifier(getHashId(list));
            modifierlist.parent = getParent(list);
            modifierlist.location = calculateLocation(document, list);
            corefStorage.storeModifierList(modifierlist);
        }
    }
    // TODO: filter the resolved element not in the source code, including the following condition, the design may be reviewed later.
    // 1. if the resolved element is null.
    // 2. if the resolved element is not physical, like "DummyMethod" will be generated during psi parsing.
    // 3. if the resolved element belongs to a virtual file's extension is class.
    // 4. if the resolved element belongs to a virtual file's path not starts with the repo dir, aka the absolute path of the src root.
    private boolean isPhysicalValidElement(PsiElement element) {
        if (element == null) {
            return false;
        } else if (!element.isPhysical()) {
            return false;
        } else {
            PsiFile file = element.getContainingFile();
            if (file == null || file.getVirtualFile().getExtension().equals("class")) {
                return false;
            } else if (!file.getVirtualFile().getPath().startsWith(repoDir)) {
                return false;
            }
            return true;
        }
    }

    @Override
    public void visitMethodCallExpression(PsiMethodCallExpression expression) {
        super.visitMethodCallExpression(expression);
        com.alipay.codequery.coref.model.Expression.MethodCallExpression methodCallExpression = new com.alipay.codequery.coref.model.Expression.MethodCallExpression(getHashId(expression));
        methodCallExpression.reference = new com.alipay.codequery.coref.model.Expression(getHashId(expression.getMethodExpression()));
        methodCallExpression.argumentList = new com.alipay.codequery.coref.model.Expression.ReferenceList(getHashId(expression.getArgumentList()));
        //add try/catch protection for resolveMethod() in case cannot resolve it.
        try {
            PsiMethod psiMethod = expression.resolveMethod();
            Long calleeId = null;
            if (isPhysicalValidElement(psiMethod)) {
                calleeId = getHashId(psiMethod);
                methodCallExpression.callee = new com.alipay.codequery.coref.model.Expression(calleeId);
            }
            // else if (psiMethod != null) {
            //     calleeId = CorefDepExtractor.extractNpMethod(corefStorage, psiMethod);
            // }
            if (calleeId != null) {
                CallableBinding callableBinding = new CallableBinding(methodCallExpression.hashId, calleeId);
                corefStorage.storeCallableBinding(callableBinding);
            }

            methodCallExpression.type = expression.getType() != null ? getType(expression.getType()) : new Type((long) -1);

        } catch (IllegalArgumentException illegalArgumentException) {
            // avoid too many Missing extension point exception stacktrace
            if (illegalArgumentException.getMessage().contains("Missing extension point")) {
                methodCallExpression.type = new Type((long) -1);
                logger.error("error message: {}, element text: {}", illegalArgumentException.getMessage(), expression.getText());
            } else {
                logger.error("error message: {}, element text: {}", illegalArgumentException.getMessage(), expression.getText(), illegalArgumentException);
            }
        } catch (Throwable e) {
            PsiFile psiFile = expression.getContainingFile();
            if (psiFile != null) {
                logger.error("unknown error, file: {},  element text: {}", psiFile.getVirtualFile().getCanonicalPath(), expression.getText(), e);
            } else {
                logger.error("unknown error, element text: {}", expression.getText(), e);
            }
        }

        String name = expression.getMethodExpression().getText();
        if (name.contains("super")) {
            if (name.equals("super")) {
                corefStorage.storeSuperConstructorInvocation(methodCallExpression);
            } else {
                corefStorage.storeSuperAccessExpression(methodCallExpression);
            }
        } else if(methodCallExpression.type.hashId != -1) {
            corefStorage.storeMethodAccessExpressionWithType(methodCallExpression);
        } else {
            corefStorage.storeMethodAccessExpressionWithoutType(methodCallExpression);
        }
    }

    @Override
    public void visitCallExpression(PsiCallExpression callExpression) {
        super.visitCallExpression(callExpression);
    }

    @Override
    public void visitConditionalExpression(PsiConditionalExpression expression) {
        super.visitConditionalExpression(expression);
        com.alipay.codequery.coref.model.Expression.ConditionalExpression conditionalExpression = new com.alipay.codequery.coref.model.Expression.ConditionalExpression(getHashId(expression));
        conditionalExpression.condition = new com.alipay.codequery.coref.model.Expression(getHashId(expression.getCondition()));
        conditionalExpression.thenExpression = expression.getThenExpression() != null ?
            new com.alipay.codequery.coref.model.Expression(getHashId(expression.getThenExpression())) : new com.alipay.codequery.coref.model.Expression((long) -1);
        conditionalExpression.elseExpression = expression.getElseExpression() != null ?
            new com.alipay.codequery.coref.model.Expression(getHashId(expression.getElseExpression())) : new com.alipay.codequery.coref.model.Expression((long) -1);
        corefStorage.storeConditionalExpression(conditionalExpression);
    }

    @Override
    public void visitContinueStatement(PsiContinueStatement statement) {
        super.visitContinueStatement(statement);
        com.alipay.codequery.coref.model.Statement.ContinueStatement continueStatement = new com.alipay.codequery.coref.model.Statement.ContinueStatement(getHashId(statement));
        continueStatement.continuedStatement = statement.findContinuedStatement() != null ?
            new com.alipay.codequery.coref.model.Statement(getHashId(statement.findContinuedStatement())) : new com.alipay.codequery.coref.model.Statement((long) -1);
        if (statement.getLabelIdentifier() != null) {
            continueStatement.discriminant = new com.alipay.codequery.coref.model.Identifier(statement.getLabelIdentifier().getText(), getHashId(statement.getLabelIdentifier()));
            NameString nameString = new NameString(continueStatement.hashId, continueStatement.discriminant.hashId, continueStatement.continuedStatement.hashId);
            corefStorage.storeNameStrings(nameString);
        }
        corefStorage.storeContinueStatement(continueStatement);
    }

    @Override
    public void visitArrayInitializerExpression(PsiArrayInitializerExpression expression) {
        super.visitArrayInitializerExpression(expression);
        com.alipay.codequery.coref.model.Expression.ArrayInitializationExpression aExpression = new com.alipay.codequery.coref.model.Expression.ArrayInitializationExpression(getHashId(expression));
        aExpression.type = getType(expression.getType());
        corefStorage.storeArrayInitializerExpression(aExpression);
    }

    //PsiClassInitializer extends PsiMember
    @Override
    public void visitClassInitializer(PsiClassInitializer initializer) {
        super.visitClassInitializer(initializer);
        com.alipay.codequery.coref.model.Expression classInitializer = new com.alipay.codequery.coref.model.Expression(getHashId(initializer));
        classInitializer.debug_message = initializer.getText();
        classInitializer.parent = getParent(initializer);
        classInitializer.location = calculateLocation(document, initializer);
        corefStorage.storeClassInitializer(classInitializer);
    }

    @Override
    public void visitBreakStatement(PsiBreakStatement statement) {
        super.visitBreakStatement(statement);
        com.alipay.codequery.coref.model.Statement.BreakStatement breakStatement = new com.alipay.codequery.coref.model.Statement.BreakStatement(getHashId(statement));
        breakStatement.exitedStatemnt = statement.findExitedStatement() != null ?
            new com.alipay.codequery.coref.model.Statement(getHashId(statement.findExitedStatement())) : new com.alipay.codequery.coref.model.Statement((long) -1);
        if (statement.getLabelIdentifier() != null) {
            breakStatement.discriminant = new com.alipay.codequery.coref.model.Identifier(statement.getLabelIdentifier().getText(), getHashId(statement.getLabelIdentifier()));
            NameString nameString = new NameString(breakStatement.hashId, breakStatement.discriminant.hashId, breakStatement.exitedStatemnt.hashId);
            corefStorage.storeNameStrings(nameString);
        }
        corefStorage.storeBreakStatement(breakStatement);
    }

    @Override
    public void visitNewExpression(PsiNewExpression expression) {
        super.visitNewExpression(expression);
        com.alipay.codequery.coref.model.Expression.NewExpression newExpression = new com.alipay.codequery.coref.model.Expression.NewExpression(getHashId(expression));
        newExpression.type = getType(expression.getType());

        if (expression.isArrayCreation()) {
            newExpression.dimension = expression.getArrayDimensions().length;
            corefStorage.storeArrayCreationExpression(newExpression);
        } else {
            newExpression.reference = expression.getClassReference() != null ?
                new com.alipay.codequery.coref.model.Expression(getHashId(expression.getClassReference())) : new com.alipay.codequery.coref.model.Expression(getHashId(expression.getAnonymousClass()));

            if (newExpression.type.hashId != -1 && !(newExpression.type.qualifiedName.startsWith("java"))) {
                corefStorage.storeConstructorInvocation(newExpression);

                try {
                    PsiMethod psiMethod = expression.resolveConstructor();
                    Long calleeId = null;
                    if(isPhysicalValidElement(psiMethod)) {
                        calleeId = getHashId(psiMethod);
                    }
                    // else if (psiMethod != null) {
                    //     calleeId = CorefDepExtractor.extractNpMethod(corefStorage, psiMethod);
                    // }
                    if (calleeId != null) {
                        CallableBinding callableBinding = new CallableBinding(newExpression.hashId, calleeId);
                        corefStorage.storeCallableBinding(callableBinding);
                    }
                } catch (Throwable e) {
                    logger.error("{} {}", this.project, e);
                }

            } else {
                corefStorage.storeNewExpression(newExpression);
            }
        }
    }

    @Override
    public void visitDeclarationStatement(PsiDeclarationStatement statement) {
        super.visitDeclarationStatement(statement);
        int i = 0;
        // s is a local variable or a local class.
        for (PsiElement s : statement.getDeclaredElements()) {
            com.alipay.codequery.coref.model.Statement.DeclarationStatement declarationStatement = new com.alipay.codequery.coref.model.Statement.DeclarationStatement(getHashId(s));
            declarationStatement.index = i;
            declarationStatement.parent = getParent(s);
            corefStorage.storeDeclarationElement(declarationStatement);
            i++;
        }
    }

    @Override
    public void visitExpressionList(PsiExpressionList list) {
        super.visitExpressionList(list);
        if (!(list.getText().isEmpty())) {
            com.alipay.codequery.coref.model.Expression.ExpressionList expressionList = new com.alipay.codequery.coref.model.Expression.ExpressionList(getHashId(list));
            expressionList.location = calculateLocation(document, list);
            expressionList.parent = getParent(list);
            expressionList.debug_message = list.getText();
            expressionList.size = list.getExpressionCount();
            corefStorage.storeExpressionList(expressionList);
            for (int i = 0; i < list.getExpressionCount(); i++) {
                PsiExpression expression = list.getExpressions()[i];
                Long expressionHashId = getHashId(expression);
                ExpressionListExpressionRelation expressionListRelation = new ExpressionListExpressionRelation(expressionList.hashId, expressionHashId, i);
                corefStorage.storeExpressionListExpressionRelation(expressionListRelation);
            }
        }
    }

    @Override
    public void visitExpressionStatement(PsiExpressionStatement statement) {
        super.visitExpressionStatement(statement);
        com.alipay.codequery.coref.model.Statement.ExpressionStatement expressionStatement = new com.alipay.codequery.coref.model.Statement.ExpressionStatement(getHashId(statement));
        expressionStatement.expr = new com.alipay.codequery.coref.model.Expression(getHashId(statement.getExpression()));
        corefStorage.storeExpressionStatement(expressionStatement);
    }

    //not a statement, actually.
    @Override
    public void visitImportStatement(PsiImportStatement statement) {
        // TODO: we have no need to call super
        super.visitImportStatement(statement);

        com.alipay.codequery.coref.model.Statement.ImportStatement importStatement = new com.alipay.codequery.coref.model.Statement.ImportStatement(getHashId(statement));
        importStatement.reference = new com.alipay.codequery.coref.model.Statement(getHashId(statement.getImportReference()));
        importStatement.debug_message = statement.getText();//statement.getQualifiedName();
        importStatement.parent = getParent(statement); //skip import list
        importStatement.location = calculateLocation(document, statement);
        importStatement.isForeignImport = statement.isForeignFileImport() ? 1 : 0;

        corefStorage.storeImport(importStatement);
    }

    @Override
    public void visitTypeCastExpression(PsiTypeCastExpression expression) {
        super.visitTypeCastExpression(expression);
        com.alipay.codequery.coref.model.Expression.CastExpression castExpression = new com.alipay.codequery.coref.model.Expression.CastExpression(getHashId(expression));
        castExpression.operand = new com.alipay.codequery.coref.model.Expression(getHashId(expression.getOperand()));
        corefStorage.storeCastExpression(castExpression);
    }

    public HashMap<PsiElement, Integer> elementIndex = new HashMap<>();

    public void getIndex(PsiElement element) {
        int i = 0;
        for (PsiElement e : element.getChildren()) {
            if (!(e instanceof PsiWhiteSpace) && !(e instanceof PsiJavaToken) && !(e instanceof PsiComment)) {
                elementIndex.put(e, i);
                i++;
            }
        }
    }

    public com.alipay.codequery.coref.model.Parent getParent(PsiElement element) {
        PsiElement psiParent = PsiUtil.getPsiParent(element);
        if (element instanceof PsiStatement || element instanceof PsiExpression || element instanceof PsiVariable || element instanceof PsiCatchSection) {
            if (!(elementIndex.containsKey(element))) {
                getIndex(psiParent);
            }
        }
        com.alipay.codequery.coref.model.Parent parent = new com.alipay.codequery.coref.model.Parent(getHashId(psiParent));

        if (parentMap.containsKey(psiParent)) {
            return parentMap.get(psiParent);
        } else {
            parentMap.put(psiParent, parent);
            String temp = psiParent.toString();
            parent.parentType = temp.contains(":") ? temp.substring(3, temp.indexOf(":")) : temp.substring(3);
            // Save parent info usually for debug usage.
            //corefStorage.storeParent(parent);
            return parent;
        }
    }

    @Override
    public void visitStatement(PsiStatement statement) {
        super.visitStatement(statement);
        com.alipay.codequery.coref.model.Statement corefStatement = new com.alipay.codequery.coref.model.Statement(getHashId(statement));

        corefStatement.parent = getParent(statement);
        corefStatement.index = elementIndex.get(statement);

        corefStatement.debug_message = statement.getText();
        corefStatement.location = calculateLocation(document, statement);
        String temp = statement.toString();
        corefStatement.baseName = temp.contains(":") ? temp.substring(3, temp.indexOf(":")) : temp.substring(3);
        corefStorage.storeStatement(corefStatement);
        //generateCallableEnclosingStatement(statement.getParent(), corefStatement);
        generateStatementEnclosingExpression(statement, corefStatement);
    }

    @Override
    public void visitExpression(PsiExpression expression) {
        super.visitExpression(expression);
        com.alipay.codequery.coref.model.Expression corefExpression = new com.alipay.codequery.coref.model.Expression(getHashId(expression));
        corefExpression.debug_message = expression.getText();

        corefExpression.parent = getParent(expression);
        corefExpression.index = elementIndex.get(expression);

        corefExpression.location = calculateLocation(document, expression);

        String temp = expression.toString();
        corefExpression.baseName = temp.contains(":") ? temp.substring(3, temp.indexOf(":")) : temp.substring(3);
        corefStorage.storeExpression(corefExpression);
    }

    @Override
    public void visitSwitchStatement(PsiSwitchStatement statement) {
        super.visitSwitchStatement(statement);
        com.alipay.codequery.coref.model.Statement.SwitchStatement switchStatement = new com.alipay.codequery.coref.model.Statement.SwitchStatement(getHashId(statement));
        switchStatement.discriminant = new com.alipay.codequery.coref.model.Expression(getHashId(statement.getExpression()));
        switchStatement.body = new com.alipay.codequery.coref.model.Statement.BlockStatement(getHashId(statement.getBody()));
        corefStorage.storeSwitchStatement(switchStatement);
    }

    @Override
    public void visitSwitchLabelStatement(PsiSwitchLabelStatement statement) {
        super.visitSwitchLabelStatement(statement);
        com.alipay.codequery.coref.model.Statement.SwitchLabelStatement labelStatement = new com.alipay.codequery.coref.model.Statement.SwitchLabelStatement(getHashId(statement));
        labelStatement.caseValue = statement.getCaseValues() != null ?
            new com.alipay.codequery.coref.model.Expression(getHashId(statement.getCaseValues())) : new com.alipay.codequery.coref.model.Expression((long) -1);
        labelStatement.enclosingSwitchBlock = new com.alipay.codequery.coref.model.Statement.BlockStatement(getHashId(statement.getEnclosingSwitchBlock()));
        PsiElement sibling = statement.getNextSibling();
        while (sibling != null) {
            if (sibling instanceof PsiSwitchLabelStatement) {
                labelStatement.nextSwitchCashHashId = getHashId(sibling);
                break;
            } else {
                sibling = sibling.getNextSibling();
            }
        }
        // labelStatement.isDefaultValue = statement.isDefaultCase() ? 1 : 0;
        corefStorage.storeSwitchLabelStatement(labelStatement);
    }

    @Override
    public void visitClassObjectAccessExpression(PsiClassObjectAccessExpression expression) {
        super.visitClassObjectAccessExpression(expression);
        try {
            Type.TypeLiteral literal = new Type.TypeLiteral(getHashId(expression));
            literal.type = getType(expression.getType());
            literal.typeElement = new Type(getHashId(expression.getOperand()));
            corefStorage.storeTypeLiteral(literal);
        } catch (Throwable e) {
            logger.error("{} {}", this.project, e);
        }
    }

    @Override
    public void visitSynchronizedStatement(PsiSynchronizedStatement statement) {
        super.visitSynchronizedStatement(statement);
        com.alipay.codequery.coref.model.Statement.SynchronizedStatement synchronizedStatement = new com.alipay.codequery.coref.model.Statement.SynchronizedStatement(getHashId(statement));
        synchronizedStatement.lockExpression = statement.getLockExpression() != null ?
            new com.alipay.codequery.coref.model.Expression(getHashId(statement.getLockExpression())) : new com.alipay.codequery.coref.model.Expression((long) -1);
        synchronizedStatement.body = statement.getBody() != null ?
            new com.alipay.codequery.coref.model.Statement(getHashId(statement.getBody())) : new com.alipay.codequery.coref.model.Statement((long) -1);
        corefStorage.storeSynchronizedStatement(synchronizedStatement);
    }

    @Override
    public void visitTryStatement(PsiTryStatement statement) {
        super.visitTryStatement(statement);
        com.alipay.codequery.coref.model.Statement.TryStatement tryStatement = new com.alipay.codequery.coref.model.Statement.TryStatement(getHashId(statement));
        tryStatement.tryBlock = statement.getTryBlock() != null ?
            new com.alipay.codequery.coref.model.Statement.CodeBlock(getHashId(statement.getTryBlock())) : new com.alipay.codequery.coref.model.Statement.CodeBlock((long) -1);
        if(statement.getFinallyBlock() != null) {
            tryStatement.finallyBlock = new com.alipay.codequery.coref.model.Statement.CodeBlock(getHashId(statement.getFinallyBlock()));
            corefStorage.storeTryStatementWithFinally(tryStatement);
        } else {
            corefStorage.storeTryStatementWithoutFinally(tryStatement);
        }
    }
    //PsiCatchSection extends PsiElement, not an expression.
    @Override
    public void visitCatchSection(PsiCatchSection section) {
        super.visitCatchSection(section);
        com.alipay.codequery.coref.model.Statement.CatchClause clauseStatement = new com.alipay.codequery.coref.model.Statement.CatchClause(getHashId(section));
        clauseStatement.param = new com.alipay.codequery.coref.model.Expression(getHashId(section.getParameter()));
        clauseStatement.tryStatement = new com.alipay.codequery.coref.model.Statement.TryStatement(getHashId(section.getTryStatement()));
        clauseStatement.debug_message = section.getText();
        clauseStatement.type = getType(section.getCatchType());
        clauseStatement.parent = getParent(section);
        clauseStatement.location = calculateLocation(document, section);
        clauseStatement.index = elementIndex.get(section);
        corefStorage.storeCatchClauseStatement(clauseStatement);
    }

    @Override
    public void visitThrowStatement(PsiThrowStatement statement) {
        super.visitThrowStatement(statement);
        com.alipay.codequery.coref.model.Statement.ThrowStatement throwStatement = new com.alipay.codequery.coref.model.Statement.ThrowStatement(getHashId(statement));
        throwStatement.exception = new com.alipay.codequery.coref.model.Expression(getHashId(statement.getException()));
        throwStatement.body = new com.alipay.codequery.coref.model.Statement.CodeBlock(getHashId(statement.getContext()));
        corefStorage.storeThrowStatement(throwStatement);
    }

    @Override
    public void visitThisExpression(PsiThisExpression expression) {
        super.visitThisExpression(expression);
        com.alipay.codequery.coref.model.Expression.ThisExpression thisExpression = new com.alipay.codequery.coref.model.Expression.ThisExpression(getHashId(expression));
        //qualifier info is always null.
        if(expression.getQualifier() != null) {
            thisExpression.qualifier = new com.alipay.codequery.coref.model.Expression(getHashId(expression.getQualifier()));
            corefStorage.storeThisExpressionWithQualifier(thisExpression);
        }
        corefStorage.storeThisExpression(thisExpression);
    }

    @Override
    public void visitEmptyStatement(PsiEmptyStatement statement) {
        super.visitEmptyStatement(statement);
        com.alipay.codequery.coref.model.Statement.EmptyStatement emptyStatement = new com.alipay.codequery.coref.model.Statement.EmptyStatement(getHashId(statement));
        corefStorage.storeEmptyStatement(emptyStatement);
    }

    @Override
    public void visitLabeledStatement(PsiLabeledStatement statement) {
        super.visitLabeledStatement(statement);
        com.alipay.codequery.coref.model.Statement.LabeledStatement labeledStatement = new com.alipay.codequery.coref.model.Statement.LabeledStatement(getHashId(statement));
        labeledStatement.identifier = new com.alipay.codequery.coref.model.Identifier(statement.getLabelIdentifier().getText(), getHashId(statement.getLabelIdentifier()));
        labeledStatement.statement = statement.getStatement() != null ? new com.alipay.codequery.coref.model.Statement(getHashId(statement.getStatement())) : new com.alipay.codequery.coref.model.Statement((long) -1);
        if (statement.getStatement() != null) {
            NameString nameString = new NameString(labeledStatement.hashId, labeledStatement.identifier.hashId, labeledStatement.hashId);
            corefStorage.storeNameStrings(nameString);
        }
        corefStorage.storeLabeledStatement(labeledStatement);
    }

    @Override
    public void visitLambdaExpression(PsiLambdaExpression expression) {
        super.visitLambdaExpression(expression);
        com.alipay.codequery.coref.model.Expression.LambdaExpression lExpression = new com.alipay.codequery.coref.model.Expression.LambdaExpression(getHashId(expression));
        lExpression.body = new com.alipay.codequery.coref.model.Statement(getHashId(expression.getBody()));
        lExpression.paramterList = new com.alipay.codequery.coref.model.Expression(getHashId(expression.getParameterList()));
        try {
            lExpression.isValueCompatible = expression.isValueCompatible() ? 1 : 0;
        } catch (IllegalArgumentException e) {
            lExpression.isValueCompatible = 0 ;
        }
        lExpression.isVoidCompatible = expression.isVoidCompatible() ? 1 : 0;
        corefStorage.storeLambdaExpression(lExpression);
    }

    @Override
    public void visitAssertStatement(PsiAssertStatement statement) {
        super.visitAssertStatement(statement);
        com.alipay.codequery.coref.model.Statement.AssertStatement assertStatement = new com.alipay.codequery.coref.model.Statement.AssertStatement(getHashId(statement));
        assertStatement.condition = statement.getAssertCondition() != null ?
            new com.alipay.codequery.coref.model.Expression(getHashId(statement.getAssertCondition())) : new com.alipay.codequery.coref.model.Expression((long) -1);
        assertStatement.description = statement.getAssertDescription() != null ?
            new com.alipay.codequery.coref.model.Expression(getHashId(statement.getAssertDescription())) : new com.alipay.codequery.coref.model.Expression((long) -1);
        corefStorage.storeAssertStatement(assertStatement);
    }

    @Override
    public void visitReturnStatement(PsiReturnStatement statement) {
        super.visitReturnStatement(statement);
        com.alipay.codequery.coref.model.Statement.ReturnStatement returnStatement = new com.alipay.codequery.coref.model.Statement.ReturnStatement(getHashId(statement));
        returnStatement.returnExpression = statement.getReturnValue() != null ?
            new com.alipay.codequery.coref.model.Expression(getHashId(statement.getReturnValue())) : new com.alipay.codequery.coref.model.Expression(getHashId(statement));
        corefStorage.storeReturnStatement(returnStatement);
    }

    @Override
    public void visitYieldStatement(PsiYieldStatement statement) {
        super.visitYieldStatement(statement);
        com.alipay.codequery.coref.model.Statement.YieldStatement yieldStatement = new com.alipay.codequery.coref.model.Statement.YieldStatement(getHashId(statement));
        yieldStatement.expression = statement.getExpression() != null ?
            new com.alipay.codequery.coref.model.Expression(getHashId(statement.getExpression())) : new com.alipay.codequery.coref.model.Expression((long) -1);
        yieldStatement.enclosingExpression = statement.findEnclosingExpression() != null ?
            new com.alipay.codequery.coref.model.Expression(getHashId(statement.findEnclosingExpression())) : new com.alipay.codequery.coref.model.Expression((long) -1);
        corefStorage.storeYieldStatement(yieldStatement);
    }

    @Override
    public void visitParameter(PsiParameter parameter) {
        super.visitParameter(parameter);
        // parameter in a foreach statement
        if (!(parameter.getParent() instanceof PsiParameterList)) {
            com.alipay.codequery.coref.model.Parameter param = new com.alipay.codequery.coref.model.Parameter(getHashId(parameter));
            param.name = parameter.getName();
            param.location = calculateLocation(document, parameter);
            param.parent = getParent(parameter);
            param.debug_message = parameter.getText();
            param.index = 0;
            // If the parameter has no type element, set its type id with -1.
            param.type = parameter.getTypeElement() != null ? getType(parameter.getType()) : new Type((long) -1);
            corefStorage.storeParameter(param);
        }
    }

    //parent of resource expression and variable
    @Override
    public void visitResourceList(PsiResourceList resourceList) {
        super.visitResourceList(resourceList);
        Node list = new Node(getHashId(resourceList));
        ResourceList rlist = new ResourceList();
        rlist.setDebugMessage(resourceList.getText());
        rlist.setElementHashId(list.hashId);
        rlist.setParentHashId(getParent(resourceList).hashId);
        rlist.setLocationHashId(calculateLocation(document, resourceList).hashId);
        corefStorage.storeResourceList(rlist);
    }

    @Override
    public void visitParameterList(PsiParameterList list) {
        super.visitParameterList(list);
        int i = 0;
        for (PsiParameter param : list.getParameters()) {
            com.alipay.codequery.coref.model.Parameter parameter = new com.alipay.codequery.coref.model.Parameter(getHashId(param));
            parameter.name = param.getName();
            parameter.location = calculateLocation(document, param);
            parameter.parent = getParent(param); //skip parameter list
            parameter.debug_message = param.getText();
            parameter.index = i;
            i++;
            // If the parameter has no type element, set its type id with -1.
            parameter.type = param.getTypeElement() != null ? getType(param.getType()) : new Type((long) -1);
            corefStorage.storeParameter(parameter);
        }
    }

    //extract reference element and reference expression.
    @Override
    public void visitReferenceElement(PsiJavaCodeReferenceElement reference) {
        super.visitReferenceElement(reference);
        com.alipay.codequery.coref.model.Expression referenceElement = new com.alipay.codequery.coref.model.Expression(getHashId(reference));
        try {
            if (reference instanceof PsiReferenceExpression) {
                corefStorage.storeReferenceExpression(referenceElement);
            } else {
                referenceElement.debug_message = reference.getText();
                referenceElement.parent = getParent(reference);
                referenceElement.location = calculateLocation(document, reference);
                corefStorage.storeReferenceElement(referenceElement);
            }

            // store the def-use relation between reference element and self-defined element
            @Nullable PsiElement definition = reference.resolve();
            if (isPhysicalValidElement(definition)) {
                if (definition instanceof PsiMethod || definition instanceof PsiClass || definition instanceof PsiVariable) {
                    ReferenceRelation referenceRelation = new ReferenceRelation(getHashId(reference), getHashId(definition));
                    corefStorage.storeReferenceRelation(referenceRelation);
                }
            }
        } catch (IllegalArgumentException illegalArgumentException) {
            // avoid too many Missing extension point exception stacktrace
            if (illegalArgumentException.getMessage().contains("Missing extension point")) {
                logger.error("error message: {}, element text: {}", illegalArgumentException.getMessage(), reference.getText());
            } else {
                logger.error("error message: {}, element text: {}", illegalArgumentException.getMessage(), reference.getText(), illegalArgumentException);
            }
        } catch (Throwable e) {
            PsiFile psiFile = reference.getContainingFile();
            if (psiFile != null) {
                logger.error("unknown error, file: {},  element text: {}", psiFile.getVirtualFile().getCanonicalPath(), reference.getText(), e);
            } else {
                logger.error("unknown error, element text: {}", reference.getText(), e);
            }
        }
    }

    @Override
    public void visitField(PsiField field) {
        com.alipay.codequery.coref.model.Field field1 = new com.alipay.codequery.coref.model.Field(getHashId(field));
        field1.location = calculateLocation(document, field);
        field1.name = field.getName();
        field1.parent = getParent(field);
        field1.debug_message = field.getText();
        if (field instanceof PsiEnumConstant) {
            corefStorage.storeEnumConstant(field1);
        } else {
            //String name = mangleFieldName(field);
            corefStorage.storeField(field1);
        }
        super.visitField(field);
    }

    @Override
    public void visitUnaryExpression(PsiUnaryExpression expression) {
        super.visitUnaryExpression(expression);
        com.alipay.codequery.coref.model.Expression.UnaryExpression unaryExpression = new com.alipay.codequery.coref.model.Expression.UnaryExpression(getHashId(expression));
        unaryExpression.operand = new com.alipay.codequery.coref.model.Expression(getHashId(expression.getOperand()));
        unaryExpression.opcode = expression.getOperationTokenType().toString();
        if (expression instanceof PsiPostfixExpression) {
            unaryExpression.isPostfix = 1;
        } else {
            unaryExpression.isPostfix = 0;
        }
        corefStorage.storeUnaryExpression(unaryExpression);
    }

    @Override
    public void visitArrayAccessExpression(PsiArrayAccessExpression expression) {
        super.visitArrayAccessExpression(expression);
        com.alipay.codequery.coref.model.Expression.ArrayAccessExpression accessExpression = new com.alipay.codequery.coref.model.Expression.ArrayAccessExpression(getHashId(expression));
        accessExpression.arrayExpression = new com.alipay.codequery.coref.model.Expression.ArrayExpression(getHashId(expression.getArrayExpression()));
        accessExpression.indexExpression = expression.getIndexExpression() != null ? new com.alipay.codequery.coref.model.Expression.ArrayExpression(getHashId(expression.getIndexExpression())) : new com.alipay.codequery.coref.model.Expression((long) -1);
        corefStorage.storeArrayAccessExpression(accessExpression);
    }

    @Override
    public void visitLocalVariable(PsiLocalVariable variable) {
        super.visitLocalVariable(variable);
        com.alipay.codequery.coref.model.LocalVariable localVariable = new com.alipay.codequery.coref.model.LocalVariable(getHashId(variable));
        localVariable.name = variable.getName();
        localVariable.debug_message = variable.getText();
        localVariable.location = calculateLocation(document, variable);
        localVariable.parent = getParent(variable);
        localVariable.index = elementIndex.get(variable);
        corefStorage.storeLocalVariable(localVariable);
    }

    @Override
    public void visitVariable(PsiVariable variable) {
        super.visitVariable(variable);
        // Check whether the variable has type element or not firstly, otherwise may cause illegal argument exception.
        if (variable.getTypeElement() != null && variable.getType() instanceof PsiArrayType) {
            Variable array = new Variable(getHashId(variable));
            array.name = variable.getName();
            corefStorage.storeArray(array);
        }
    }

    @Override
    public void visitMethod(PsiMethod psiMethod) {
        com.alipay.codequery.coref.model.Method method = new Method(getHashId(psiMethod));
        method.parent = getParent(psiMethod);
        method.identifier = new com.alipay.codequery.coref.model.Identifier(psiMethod.getName(), getHashId(psiMethod.getNameIdentifier()));
        method.returnType = psiMethod.getReturnType() != null ? getType(psiMethod.getReturnType()) : new Type( (long) -1);
        method.location = calculateLocation(document, psiMethod);
        // 若method有注释，则方法定义部分能需要取到psiMethod下modifier的起始位置
        int definitionStartOffset = psiMethod.getModifierList().getTextRange().getStartOffset();
        int definitionEndOffset = psiMethod.getTextRange().getEndOffset();
        method.definitionBody = document.getText().substring(definitionStartOffset, definitionEndOffset);
        if (psiMethod.isConstructor()) {
            method.signature = psiMethod.getContainingClass().getQualifiedName() != null ? PsiUtil.mangleMethodName(psiMethod) : psiMethod.getContainingClass().getName();
            corefStorage.storeConstructor(method);
        } else {
            method.signature = PsiUtil.mangleMethodName(psiMethod);
            corefStorage.storeMethod(method);
        }

        generateCallableEnclosingNode(psiMethod, method);
        super.visitMethod(psiMethod);
    }

    @Override
    public void visitForStatement(PsiForStatement statement) {
        super.visitForStatement(statement);
        com.alipay.codequery.coref.model.Statement.ForStatement stmt = new com.alipay.codequery.coref.model.Statement.ForStatement(getHashId(statement));
        stmt.init = statement.getInitialization() != null ?
            new com.alipay.codequery.coref.model.Expression(getHashId(statement.getInitialization())) : new com.alipay.codequery.coref.model.Expression((long) -1);
        stmt.update = statement.getUpdate() != null ?
            new com.alipay.codequery.coref.model.Expression(getHashId(statement.getUpdate())) : new com.alipay.codequery.coref.model.Expression((long) -1);
        stmt.condition = statement.getCondition() != null ?
            new com.alipay.codequery.coref.model.Expression(getHashId(statement.getCondition())) : new com.alipay.codequery.coref.model.Expression((long) -1);
        stmt.body = new com.alipay.codequery.coref.model.Statement(getHashId(statement.getBody()));
        corefStorage.storeForStatement(stmt);
    }

    @Override
    public void visitAnonymousClass(PsiAnonymousClass aClass) {
        super.visitAnonymousClass(aClass);
        com.alipay.codequery.coref.model.Class.AnonymousClass anonymousClass = new com.alipay.codequery.coref.model.Class.AnonymousClass(getHashId(aClass));
        anonymousClass.location = calculateLocation(document, aClass);
        anonymousClass.parent = getParent(aClass);
        anonymousClass.baseType = getType(aClass.getBaseClassType());
        //BaseClassReference may resolve to null.
        anonymousClass.baseClass = new Class.ClassDefinition(getHashId(aClass.getBaseClassReference()));
        corefStorage.storeAnonymousClass(anonymousClass);
    }

    @Override
    public void visitForeachStatement(PsiForeachStatement statement) {
        super.visitForeachStatement(statement);
        com.alipay.codequery.coref.model.Statement.ForeachStatement stmt = new com.alipay.codequery.coref.model.Statement.ForeachStatement(getHashId(statement));
        stmt.iterationParameter = new Parameter(getHashId(statement.getIterationParameter()));
        stmt.iteratedValue = new com.alipay.codequery.coref.model.Expression(getHashId(statement.getIteratedValue()));
        stmt.body = new com.alipay.codequery.coref.model.Statement(getHashId(statement.getBody()));
        corefStorage.storeForeachStatement(stmt);
    }

    @Override
    public void visitAssignmentExpression(PsiAssignmentExpression expression) {
        super.visitAssignmentExpression(expression);
        com.alipay.codequery.coref.model.Expression.AssignmentExpression assignmentExpression = new com.alipay.codequery.coref.model.Expression.AssignmentExpression(getHashId(expression));
        assignmentExpression.lhs = new com.alipay.codequery.coref.model.Expression(getHashId(expression.getLExpression()));
        assignmentExpression.rhs = new com.alipay.codequery.coref.model.Expression(getHashId(expression.getRExpression()));
        assignmentExpression.opcode = expression.getOperationSign().getText();
        corefStorage.storeAssignmentExpression(assignmentExpression);
    }

    @Override
    public void visitKeyword(PsiKeyword keyword) {
        super.visitKeyword(keyword);
        com.alipay.codequery.coref.model.Modifier modifier = new Modifier(getHashId(keyword));
        modifier.name = keyword.getText();
        modifier.parent = getParent(keyword);
        modifier.location = calculateLocation(document, keyword);
        corefStorage.storeModifier(modifier);
    }

    @Override
    public void visitIdentifier(PsiIdentifier identifier) {
        super.visitIdentifier(identifier);
        com.alipay.codequery.coref.model.Identifier identifiers = new Identifier(identifier.getText(), getHashId(identifier));
        identifiers.parent = getParent(identifier);
        identifiers.location = calculateLocation(document, identifier);
        corefStorage.storeIdentifier(identifiers);
    }

    @Override
    public void visitPolyadicExpression(PsiPolyadicExpression expression) {
        super.visitPolyadicExpression(expression);
        try {
            if (expression instanceof PsiBinaryExpression) {
                com.alipay.codequery.coref.model.Expression.BinaryExpression binaryExpression = new com.alipay.codequery.coref.model.Expression.BinaryExpression(getHashId(expression));
                binaryExpression.lhs = new com.alipay.codequery.coref.model.Expression(getHashId(((PsiBinaryExpression) expression).getLOperand()));
                binaryExpression.rhs = new com.alipay.codequery.coref.model.Expression(getHashId(((PsiBinaryExpression) expression).getROperand()));
                binaryExpression.opcode = ((PsiBinaryExpression) expression).getOperationSign().getText();
                corefStorage.storeBinaryExpression(binaryExpression);
            } else {
                com.alipay.codequery.coref.model.Expression.PolyadicExpression polyadicExpression = new com.alipay.codequery.coref.model.Expression.PolyadicExpression(getHashId(expression));
                polyadicExpression.size = expression.getOperands().length;
                polyadicExpression.opcode = expression.getOperationTokenType().toString();
                corefStorage.storePolyadicExpression(polyadicExpression);
            }
        } catch (NullPointerException e) {
            logger.error("error message: {}, element text: {}", e.getMessage(), expression.getText());
        }
    }

    @Override
    public void visitIfStatement(PsiIfStatement statement) {
        super.visitIfStatement(statement);
        com.alipay.codequery.coref.model.Statement.IfStatement ifStatement = new com.alipay.codequery.coref.model.Statement.IfStatement(getHashId(statement));
        ifStatement.condition = statement.getCondition() != null ?
            new com.alipay.codequery.coref.model.Expression(getHashId(statement.getCondition())) : new com.alipay.codequery.coref.model.Expression((long) -1);
        ifStatement.thenBranch = statement.getThenBranch() != null ?
            new com.alipay.codequery.coref.model.Statement(getHashId(statement.getThenBranch())) : new com.alipay.codequery.coref.model.Statement((long) -1);
        if(statement.getElseBranch() != null) {
            ifStatement.elseBranch = new Statement(getHashId(statement.getElseBranch()));
            corefStorage.storeIfStatementWithElse(ifStatement);
        } else {
            corefStorage.storeIfStatementWithoutElse(ifStatement);
        }

    }

    @Override
    public void visitDocTag(PsiDocTag tag) {
        super.visitDocTag(tag);
        com.alipay.codequery.coref.model.Comment.JavaDocTag javaDocTag = new com.alipay.codequery.coref.model.Comment.JavaDocTag(getHashId(tag));
        javaDocTag.value = tag.getValueElement() != null ? tag.getValueElement().getText() : "-1";
        javaDocTag.name = tag.getName();
        int i = 0;
        for (PsiDocTag t : tag.getContainingComment().getTags()) {
            if (t == tag) {
                javaDocTag.index = i;
            }
            i++;
        }
        javaDocTag.location = calculateLocation(document, tag);
        javaDocTag.containedComment = new com.alipay.codequery.coref.model.Comment(getHashId(tag.getContainingComment()));
        corefStorage.storeJavaDocTag(javaDocTag);
    }

    /**
     * This method extracts PsiComment element info, including java doc comment and normal coment.
     */
    @Override
    public void visitComment(@NotNull PsiComment comment) {
        super.visitComment(comment);
        if (comment instanceof PsiDocComment) {
            com.alipay.codequery.coref.model.Comment.JavaDocComment javaDocComments = new com.alipay.codequery.coref.model.Comment.JavaDocComment(getHashId(comment));
            javaDocComments.text = comment.getText();
            javaDocComments.documentedItem = ((PsiDocComment) comment).getOwner() != null ?
                new Node(getHashId(((PsiDocComment) comment).getOwner())) : new Node((long) -1);
            javaDocComments.location = calculateLocation(document, comment);
            javaDocComments.parent = getParent(comment);
            corefStorage.storeJavaDocComment(javaDocComments);
        } else {
            com.alipay.codequery.coref.model.Comment comments = new com.alipay.codequery.coref.model.Comment(getHashId(comment));
            comments.text = comment.getText();
            comments.parent = getParent(comment);
            comments.location = calculateLocation(document, comment);
            // Add one attribute to normal comment, to record the comment type, which may be end_of_line_comment or c_style_comment.
            comments.commentType = comment.getTokenType().toString();
            corefStorage.storeComment(comments);
        }
    }

    /**
     * This method extract the info about PsiDocToken with Data type.
     */
    @Override
    public void visitDocToken(PsiDocToken token) {
        super.visitDocToken(token);
        if(token.getTokenType().toString().equals("DOC_COMMENT_DATA") && !(StringUtil.isEmptyOrSpaces(token.getText()))) {
            com.alipay.codequery.coref.model.Comment.JavaDocDataToken javaDocDataToken = new com.alipay.codequery.coref.model.Comment.JavaDocDataToken(getHashId(token));
            javaDocDataToken.value = token.getText();
            int i = 0;
            for (PsiElement t : token.getParent().getChildren()) {
                if (t instanceof PsiDocToken && t.isEquivalentTo(token)) {
                    javaDocDataToken.index = i;
                }
                i++;
            }
            javaDocDataToken.parent = getParent(token);
            javaDocDataToken.location = calculateLocation(document, token);
            corefStorage.storeJavaDocDataToken(javaDocDataToken);
        }
    }

    /**
     * This method extract the info about PsiDocTagValue element.
     */
    @Override
    public void visitDocTagValue(PsiDocTagValue value) {
        super.visitDocTagValue(value);
        com.alipay.codequery.coref.model.Comment.JavaDocTagValue javaDocTagValue = new Comment.JavaDocTagValue(getHashId(value));
        javaDocTagValue.value = value.getText();
        javaDocTagValue.parent = getParent(value);
        javaDocTagValue.location = calculateLocation(document, value);
        corefStorage.storeJavaDocTagValue(javaDocTagValue);
    }

    @Override
    public void visitLiteralExpression(PsiLiteralExpression expression) {
        super.visitLiteralExpression(expression);
        Literal literal = new Literal(getHashId(expression));
        literal.type = expression.getType().getPresentableText();
        literal.value = expression.getText();
        corefStorage.handleLiteral(literal);
    }

    @Override
//    PsiReferenceList is ReferenceElement's parent, get exception information.
    public void visitReferenceList(PsiReferenceList list) {
        super.visitReferenceList(list);
        if (!(list.getText().isEmpty())) {
            com.alipay.codequery.coref.model.Expression.ReferenceList referenceList = new Expression.ReferenceList(getHashId(list));
            referenceList.parent = getParent(list);
            referenceList.location = calculateLocation(document, list);
            referenceList.role = list.getRole().name();
            referenceList.debug_message = list.getText();
            corefStorage.storeReferencelist(referenceList);
        }
    }

}
