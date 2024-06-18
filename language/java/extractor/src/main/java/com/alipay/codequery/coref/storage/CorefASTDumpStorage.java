package com.alipay.codequery.coref.storage;

import com.alipay.codequery.coref.core.CorefURI;
import com.alipay.codequery.coref.core.SignatureGenerator;
import com.alipay.codequery.coref.model.*;
import com.alipay.codequery.coref.model.Class;
import com.alipay.codequery.coref.model.Comment;
import com.alipay.codequery.coref.model.Expression;
import com.alipay.codequery.coref.model.File;
import com.alipay.codequery.coref.model.Folder;
import com.alipay.codequery.coref.model.Identifier;
import com.alipay.codequery.coref.model.Modifier;
import com.alipay.codequery.coref.model.Module;
import com.alipay.codequery.coref.model.Program;
import com.alipay.codequery.coref.model.Statement;
import com.alipay.codequery.coref.model.NpClass;
import com.alipay.codequery.coref.model.NpFile;
import com.alipay.codequery.coref.model.NpInterface;
import com.alipay.codequery.coref.model.NpMethod;
import com.alipay.codequery.coref.model.NpProject;
import com.alipay.codequery.coref.util.HashUtil;
import com.alipay.codequery.dal.mybatis.domain.*;
import com.alipay.codequery.dal.mybatis.domain.Exception;
import com.alipay.codequery.dal.mybatis.mapper.*;
import com.alipay.codequery.project.PsiProject;
import com.google.gson.*;
import com.alipay.codequery.dal.mybatis.domain.Primitive;
import com.alipay.codequery.util.PathUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.kotlin.com.intellij.psi.*;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class CorefASTDumpStorage implements IStorage {

    public static final Logger logger = LogManager.getLogger(CorefASTDumpStorage.class);
    private final Map<Long, String> hashIDToNodeMap = new HashMap<>();
    private final String corefASTPath;
    private final String srcRootDir;
    private final java.io.File file;
    private PsiJavaFile psiJavaFile;
    private final CorefURI corefURI ;

    public CorefASTDumpStorage(String corefASTPath, String srcRootDir, java.io.File file, PsiProject basicProject,
                               String repository) {
        this.psiJavaFile = basicProject.getPsiJavaFileFromFile(file);
        assert psiJavaFile != null;

        this.corefURI = new CorefURI(repository);
        String relativePath = PathUtil.getRelPath(srcRootDir, psiJavaFile.getVirtualFile().getPath());
        this.corefURI.setPath(relativePath);

        this.corefASTPath = corefASTPath;
        this.srcRootDir = srcRootDir;
        this.file = file;

    }

    @Override
    public void commit() {
        this.dumpCorefAST();
    }

    @Override
    public void storeLocation(com.alipay.codequery.coref.model.Location location) {
    }

    @Override
    public void storeStatementEnclosingExpression(StatementEnclosingExpression s) {
    }

    @Override
    public void storeCallableEnclosingExpression(CallableEnclosingExpression c) {

    }

    void collectHashIdToNode(Long hashId, Object node) {
        hashIDToNodeMap.put(hashId, node.getClass().getSimpleName());
    }

    @Override
    public void storeCallableEnclosingStatement(CallableEnclosingStatement c) {
    }

    @Override
    public void storeNumberOfLines(com.alipay.codequery.coref.model.Location.NumberOfLines numberOfLines) {
    }

    @Override
    public void storeNameStrings(NameString nameString) {
    }

    @Override
    public void storeReferenceRelation(ReferenceRelation referenceRelation) {
    }

    @Override
    public void storeCallableBinding(CallableBinding callableBinding) {
    }

    @Override
    public void storeParent(com.alipay.codequery.coref.model.Parent parent) {
    }

    @Override
    public void storeAnnotatedRelation(AnnotatedRelation annotatedRelation) {
    }

    @Override
    public void storeParameter(com.alipay.codequery.coref.model.Parameter parameter) {
        collectHashIdToNode(parameter.getHashId(), parameter.extractParameter());
    }

    @Override
    public void storeReferenceElement(com.alipay.codequery.coref.model.Expression reference) {
        collectHashIdToNode(reference.getHashId(), reference.extractReferenceElement());
    }

    @Override
    public void storeImportStaticReferenceElement(com.alipay.codequery.coref.model.Expression reference) {
        collectHashIdToNode(reference.getHashId(), reference.extractImportStaticReferenceElement());
    }

    @Override
    public void storeTypeParameter(Type.TypeParameter parameter) {
        collectHashIdToNode(parameter.getHashId(), parameter.extractTypeParameter());
    }

    @Override
    public void storeClassInitializer(com.alipay.codequery.coref.model.Expression initializer) {
        collectHashIdToNode(initializer.getHashId(), initializer.extractClassInitializer());
    }

    @Override
    public void storeAnnotationDeclarationParameterDefaultValue(AnnotationDeclarationParameterDefaultValue parameter) {
        collectHashIdToNode(parameter.getElementHashId(), parameter);
    }

    @Override
    public void storeJavaDocTag(com.alipay.codequery.coref.model.Comment.JavaDocTag docTag) {
        collectHashIdToNode(docTag.getHashId(), docTag.extractJavadocTag());
    }

    @Override
    public void storeAnonymousClass(Class.AnonymousClass clazz) {
        collectHashIdToNode(clazz.getHashId(), clazz.extractAnonymousClass());
    }

    @Override
    public void storeFileMd5Sum(FileMd5Sum file) {
    }

    @Override
    public void storeFileSHA256Sum(FileSha256Sum file) {
    }

//    public void storeAnnotation(Annotations.AnnotationModel annotation){
//        if(!mock)//    }

    @Override
    public void storeReferenceType(Type type) {
        collectHashIdToNode(type.getHashId(), type.extractReferenceType());
    }

    @Override
    public void storeIfStatementWithElse(com.alipay.codequery.coref.model.Statement.IfStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractIfStatementWithElse());
    }

    @Override
    public void storeIfStatementWithoutElse(com.alipay.codequery.coref.model.Statement.IfStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractIfStatementWithoutElse());
    }

//    public void storeTypeParameter(TypeParameterElement element){
//        if(!mock)//    }

    @Override
    public void storeTypeElement(Type element) {
        collectHashIdToNode(element.getHashId(), element.extractTypeElement());
    }

//    public void storeTypeArgument(TypeArgument argument){
//        if(!mock)//    }

    @Override
    public void storeYieldStatement(com.alipay.codequery.coref.model.Statement.YieldStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractYieldStatement());
    }

    @Override
    public void storeSynchronizedStatement(com.alipay.codequery.coref.model.Statement.SynchronizedStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractSynchronizedStatement());
    }


    @Override
    public void storeExpressionStatement(com.alipay.codequery.coref.model.Statement.ExpressionStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractExpressionStatement());
    }

    @Override
    public void storeCodeBlock(com.alipay.codequery.coref.model.Statement.CodeBlock codeblock) {
        collectHashIdToNode(codeblock.getHashId(), codeblock.extractCodeBlock());
    }

    @Override
    public void storeBlockStatement(com.alipay.codequery.coref.model.Statement.BlockStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractBlockStatement());
    }

    @Override
    public void storeLabeledStatement(com.alipay.codequery.coref.model.Statement.LabeledStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractLabeledStatement());
    }

    @Override
    public void storeLambdaExpression(com.alipay.codequery.coref.model.Expression.LambdaExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractLambdaExpression());
    }

    @Override
    public void storeThisExpression(com.alipay.codequery.coref.model.Expression.ThisExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractThisAccessExpression());
    }

    @Override
    public void storeThisExpressionWithQualifier(com.alipay.codequery.coref.model.Expression.ThisExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractThisExpressionWithQualifier());

    }

    @Override
    public void storeSuperAccessExpression(com.alipay.codequery.coref.model.Expression.MethodCallExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractSuperAccessExpression());
    }

    @Override
    public void storeSuperConstructorInvocation(com.alipay.codequery.coref.model.Expression.MethodCallExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractSuperConstructorInvocation());
    }

    @Override
    public void storeEmptyStatement(com.alipay.codequery.coref.model.Statement.EmptyStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractEmptyStatement());
    }

    @Override
    public void storeWhileStatement(com.alipay.codequery.coref.model.Statement.WhileStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractWhileStatement());
    }

    @Override
    public void storeTryStatementWithoutFinally(com.alipay.codequery.coref.model.Statement.TryStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractTryStatementWithoutFinally());
    }

    @Override
    public void storeTryStatementWithFinally(com.alipay.codequery.coref.model.Statement.TryStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractTryStatementWithFinally());
    }

    @Override
    public void storeThrowStatement(com.alipay.codequery.coref.model.Statement.ThrowStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractThrowStatement());
    }


    @Override
    public void storeSwitchStatement(com.alipay.codequery.coref.model.Statement.SwitchStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractSwitchStatement());
    }

    @Override
    public void storeSwitchLabelStatement(com.alipay.codequery.coref.model.Statement.SwitchLabelStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractSwitchLabelStatement());
    }

    @Override
    public void storeDoWhileStatement(com.alipay.codequery.coref.model.Statement.DoWhileStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractDoWhileStatement());
    }

    @Override
    public void storeContinueStatement(com.alipay.codequery.coref.model.Statement.ContinueStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractContinueStatement());
    }

    @Override
    public void storeBreakStatement(com.alipay.codequery.coref.model.Statement.BreakStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractBreakStatement());
    }

    @Override
    public void storeReturnStatement(com.alipay.codequery.coref.model.Statement.ReturnStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractReturnStatement());
    }

    @Override
    public void storeModule(Module module) {
        collectHashIdToNode(module.getHashId(), module.extractModule());
    }

    @Override
    public void storeTypeLiteral(Type.TypeLiteral literal) {
        collectHashIdToNode(literal.getHashId(), literal.extractTypeLiteral());
    }

    @Override
    public void storeAssertStatement(com.alipay.codequery.coref.model.Statement.AssertStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractAssertStatement());
    }

    @Override
    public void storeDeclarationElement(com.alipay.codequery.coref.model.Statement.DeclarationStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractDeclarationElement());
    }

    @Override
    public void storeImport(com.alipay.codequery.coref.model.Statement.ImportStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractImport());
    }

    @Override
    public void storeImportStaticStatement(com.alipay.codequery.coref.model.Statement.ImportStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractImportStaticStatement());
    }

    @Override
    public void storeResourceList(ResourceList list) {

    }

    @Override
    public void storeMethodAccessExpressionWithoutType(com.alipay.codequery.coref.model.Expression.MethodCallExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractMethodAccessExpressionWithoutType());
    }

    @Override
    public void storeMethodAccessExpressionWithType(com.alipay.codequery.coref.model.Expression.MethodCallExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractMethodAccessExpressionWithType());
    }

    @Override
    public void storeMethodReferenceExpression(com.alipay.codequery.coref.model.Expression.MethodCallExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractMethodReferenceExpression());
    }

    @Override
    public void storeArrayInitializerExpression(com.alipay.codequery.coref.model.Expression.ArrayInitializationExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractArrayInitializerExpression());
    }

    @Override
    public void storeAnnotationArrayInitializer(com.alipay.codequery.coref.model.Expression.ArrayInitializationExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractAnnotationArrayInitializer());
    }

    @Override
    public void storeArrayAccessExpression(com.alipay.codequery.coref.model.Expression.ArrayAccessExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractArrayAccessExpression());
    }

    @Override
    public void storeToken(Token token) {
    }

    @Override
    public void storeLocalVariable(com.alipay.codequery.coref.model.LocalVariable variable) {
        collectHashIdToNode(variable.getHashId(), variable.extractLocalVariable());
    }

//    public void storeCallExpression(Expressions.CallExpression expression){
//        if(!mock)//    }

    @Override
    public void storeCastExpression(com.alipay.codequery.coref.model.Expression.CastExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractTypeCastExpressiont());
    }

    @Override
    public void storeReferenceExpression(com.alipay.codequery.coref.model.Expression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractReferenceExpression());

    }

    @Override
    public void storeConstructorInvocation(com.alipay.codequery.coref.model.Expression.NewExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractConstructorInvocation());

    }

    @Override
    public void storeConditionalExpression(com.alipay.codequery.coref.model.Expression.ConditionalExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractCondtionalExpression());

    }

    @Override
    public void storeNewExpression(com.alipay.codequery.coref.model.Expression.NewExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractNewExpression());

    }

    @Override
    public void storeArrayCreationExpression(com.alipay.codequery.coref.model.Expression.NewExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractArrayCreationExpression());

    }

    @Override
    public void storeField(com.alipay.codequery.coref.model.Field field) {
        collectHashIdToNode(field.getHashId(), field.extractField());

    }

    @Override
    public void storeMethod(com.alipay.codequery.coref.model.Method method) {
        collectHashIdToNode(method.getHashId(), method.extractMethodDeclaration());

    }

    @Override
    public void storeConstructor(com.alipay.codequery.coref.model.Method method) {
        collectHashIdToNode(method.getHashId(), method.extractConstructor());
    }

    @Override
    public void storePrimitive(Primitive primitive) {
    }

    @Override
    public void storeCatchClauseStatement(com.alipay.codequery.coref.model.Statement.CatchClause catchClause) {
        collectHashIdToNode(catchClause.getHashId(), catchClause.extractCatchSection());

    }

    @Override
    public void storeLocalClass(Class.ClassDefinition statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractLocalClass());

    }

    @Override
    public void storeEnumConstant(com.alipay.codequery.coref.model.Field enumField) {
        collectHashIdToNode(enumField.getHashId(), enumField.extractEnumConstant());

    }

    @Override
    public void storeInstanceOfExpression(com.alipay.codequery.coref.model.Expression.InstanceOfExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractInstanceOfExpression());

    }

    @Override
    public void storeArray(Variable array) {
    }

    @Override
    public void storeAnnotationCanResolved(Annotation.AnnotationModel annotation) {
        collectHashIdToNode(annotation.getHashId(), annotation.extractAnnotationCanResolved());
    }

    @Override
    public void storeAnnotationCanNotResolved(Annotation.AnnotationModel annotation) {
        collectHashIdToNode(annotation.getHashId(), annotation.extractAnnotationCanNotResolved());
    }

    @Override
    public void storeAnnotationDeclaration(Annotation.AnnotationModel annotation) {
        collectHashIdToNode(annotation.getHashId(), annotation.extractAnnotationDeclaration());
    }

    @Override
    public void storeAnnotationDeclarationParameter(Annotation.AnnotationParameter parameter) {
        collectHashIdToNode(parameter.getHashId(), parameter.extractAnnotationArgument());
    }

    @Override
    public void storeExpression(com.alipay.codequery.coref.model.Expression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractExpression());
    }

    @Override
    public void storePackageStatement(com.alipay.codequery.coref.model.Statement.PackageStatement packages) {
        collectHashIdToNode(packages.getHashId(), packages.extractPackage());
    }

    @Override
    public void storeCuPackage(Cupackage cupackage) {
    }

    @Override
    public void storeClassHierarchy(Class.ClassHierarchy classHierarchy) {
        collectHashIdToNode(classHierarchy.getHashId(), classHierarchy.extractClassHierarchy());
    }

    @Override
    public void storeSuperExpression(com.alipay.codequery.coref.model.Expression.SuperExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractSuperExpression());
    }

    @Override
    public void storeSuperExpressionWithQualifier(com.alipay.codequery.coref.model.Expression.SuperExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractSuperExpressionWithQualifier());
    }

    @Override
    public void storeException(Exception exception) {
    }

    @Override
    public void storeClass(Class.ClassDefinition classDefinition) {
        collectHashIdToNode(classDefinition.getHashId(), classDefinition.extractClass());
    }

    @Override
    public void storeImplementlist(ClassImplementList list) {
    }


    @Override
    public void storeElement(Element e) {
    }

    @Override
    public void storeReferencelist(com.alipay.codequery.coref.model.Expression.ReferenceList list) {
        collectHashIdToNode(list.getHashId(), list.extractReferenceList());
    }

    @Override
    public void storeReferenceParameterlist(ParameterList.ReferenceParameterList list, int index) {
        collectHashIdToNode(list.getHashId(), list.extractReferenceParameterList(index));
    }

    @Override
    public void storeEmptyReferenceParameterlist(ParameterList.ReferenceParameterList list) {
        collectHashIdToNode(list.getHashId(), list.extractEmptyReferenceParameterList());
    }

    @Override
    public void storeInterface(Class.ClassDefinition classDefinition) {
        collectHashIdToNode(classDefinition.getHashId(), classDefinition.extractInterface());
    }

    @Override
    public void storeStatement(com.alipay.codequery.coref.model.Statement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractStatement());
    }

    @Override
    public void storeComment(com.alipay.codequery.coref.model.Comment comment) {
        collectHashIdToNode(comment.getHashId(), comment.extractComment());
    }

    @Override
    public void storeExpressionList(com.alipay.codequery.coref.model.Expression.ExpressionList list) {
        collectHashIdToNode(list.getHashId(), list.extractExpressionList());
    }

    @Override
    public void storeExpressionListExpressionRelation(ExpressionListExpressionRelation expressionListRelation) {
    }

    @Override
    public void storeJavaDocComment(com.alipay.codequery.coref.model.Comment.JavaDocComment comments) {
        collectHashIdToNode(comments.getHashId(), comments.extractJavaDocComment());
    }

    @Override
    public void storeJavaDocDataToken(com.alipay.codequery.coref.model.Comment.JavaDocDataToken javaDocDataToken) {
        collectHashIdToNode(javaDocDataToken.getHashId(), javaDocDataToken.extractJavaDocDataToken());
    }

    @Override
    public void storeJavaDocTagValue(Comment.JavaDocTagValue javaDocTagValue) {
        collectHashIdToNode(javaDocTagValue.getHashId(), javaDocTagValue.extractJavaDocTagValue());
    }

    @Override
    public void storeForStatement(com.alipay.codequery.coref.model.Statement.ForStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractForStatement());
    }

    @Override
    public void storeAssignmentExpression(com.alipay.codequery.coref.model.Expression.AssignmentExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractAssignmentExpression());
    }

    @Override
    public void storeBinaryExpression(com.alipay.codequery.coref.model.Expression.BinaryExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractBinaryExpression());
    }

    @Override
    public void storePolyadicExpression(com.alipay.codequery.coref.model.Expression.PolyadicExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractPolyadicExpression());
    }

    @Override
    public void storeUnaryExpression(Expression.UnaryExpression expression) {
        collectHashIdToNode(expression.getHashId(), expression.extractUnaryExpression());
    }

    @Override
    public void storeForeachStatement(Statement.ForeachStatement statement) {
        collectHashIdToNode(statement.getHashId(), statement.extractForeachStatement());
    }

    @Override
    public void storeAnnotationArgumentWithName(Annotation.AnnotationArgument annotationArgument) {
        collectHashIdToNode(annotationArgument.getHashId(), annotationArgument.extractAnnotationArgumentWithName());

    }

    @Override
    public void storeAnnotationArgumentWithoutName(Annotation.AnnotationArgument annotationArgument) {
        collectHashIdToNode(annotationArgument.getHashId(), annotationArgument.extractAnnotationArgumentWithoutName());
    }

    @Override
    public void storeProgram(Program program) {
        collectHashIdToNode(program.getHashId(), program.extractProgram());
    }

    @Override
    public void storeModifier(com.alipay.codequery.coref.model.Modifier modifier) {
        collectHashIdToNode(modifier.getHashId(), modifier.extractModifier());
    }

    @Override
    public void storeModifierList(Modifier modifier) {
        collectHashIdToNode(modifier.getHashId(), modifier.extractModifierList());
    }

    @Override
    public void storeFile(File file) {
        collectHashIdToNode(file.getHashId(), file.extractFile());
    }

    @Override
    public void storeFolder(Folder folder) {
        collectHashIdToNode(folder.getHashId(), folder.extractFolder());
    }

    @Override
    public void storeContainerParent(ContainerParent container) {
    }

    @Override
    public void storeIdentifier(Identifier identifier) {
        collectHashIdToNode(identifier.getHashId(), identifier.extractIdentifier());
    }

    @Override
    public void handleLiteral(Literal literal) {
        switch (literal.type) {
            case "String":
                storeLiteral(literal, StringLiteralMapper.class);
                break;
            case "int":
                storeLiteral(literal, IntegerLiteralMapper.class);
                break;
            case "char":
                storeLiteral(literal, CharacterLiteralMapper.class);
                break;
            case "double":
                storeLiteral(literal, DoubleLiteralMapper.class);
                break;
            case "float":
                storeLiteral(literal, FloatingPointLiteralMapper.class);
                break;
            case "long":
                storeLiteral(literal, LongLiteralMapper.class);
                break;
            case "boolean":
                storeLiteral(literal, BooleanLiteralMapper.class);
                break;
            case "null":
                storeLiteral(literal, NullLiteralMapper.class);
                break;
            default:
                break;
        }
    }

    @Override
    public void storeLiteral(Literal literal, java.lang.Class mapperClass) {
        collectHashIdToNode(literal.getHashId(), literal.extractLiteral());
    }

    @Override
    public void storeNpProject(NpProject npProject) {
        collectHashIdToNode(npProject.getHashId(), npProject.extractNpProject());
    }

    @Override
    public void storeNpFile(NpFile npFile) {
        collectHashIdToNode(npFile.getHashId(), npFile.extractNpFile());
    }

    @Override
    public void storeNpClass(NpClass npClass) {
        collectHashIdToNode(npClass.getHashId(), npClass.extractNpClass());
    }

    @Override
    public void storeNpInterface(NpInterface npInterface) {
        collectHashIdToNode(npInterface.getHashId(), npInterface.extractNpInterface());
    }

    @Override
    public void storeNpMethod(NpMethod npMethod) {
        collectHashIdToNode(npMethod.getHashId(), npMethod.extractNpMethod());
    }

    public void clearHashIDToNodeMap() {
        this.hashIDToNodeMap.clear();
    }


    private void dumpCorefAST() {
        if (corefASTPath != null ) {
            Path basePath = Paths.get(srcRootDir);
            // 计算相对路径
            Path relativePath = basePath.relativize(Paths.get(file.toString()));
            // 拼接输出路径
            Path fullPath = Paths.get(corefASTPath, relativePath.toString());

            // 非空和覆盖的情况
            java.io.File astPathDir = new java.io.File(corefASTPath);
            if (!astPathDir.exists()) {
                boolean created = astPathDir.mkdir();
                if (created) {
                    logger.info("Folder created successfully.");
                } else {
                    logger.error("Folder creation failed.");
                }
            }
            //  直接添加一个.json的后缀
            dumpAstJsonStr(psiJavaFile,  hashIDToNodeMap, fullPath + ".json");
        }
        this.clearHashIDToNodeMap();
    }


    private void dumpAstJsonStr(PsiFile psiFile,  Map<Long, String> hashIDToNodeMap, String outputPath) {
        JsonElement jsonObject = getElementJsonStr(psiFile, hashIDToNodeMap);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(jsonObject);
        java.io.File file = new java.io.File(outputPath);


        try {
            FileWriter writer = new FileWriter(file);
            writer.write(jsonString);
            writer.close();
            logger.info("\nsuccess to generate file: " + outputPath);
        } catch (IOException e) {
            logger.error("\nfaild to generate file: " + outputPath, e);
        }
    }

    private String truncate(String text, int maxTextLength) {
        if (text.length() > maxTextLength){
            return text.substring(0, maxTextLength).trim() + "...";
        }
        else{
            return text;
        }

    }

    private String getNodeMessage(PsiElement element) {
        int maxTextLength = 80;
        String result = "";
        if (element instanceof PsiPlainTextFile) {
            result = ((PsiPlainTextFile) element).getName();
        } else if (element instanceof PsiFile) {
            result = ((PsiFile) element).getName();
        } else if (element instanceof PsiDirectory) {
            result = ((PsiDirectory) element).getName();
        } else if (element instanceof PsiComment) {
            result = truncate(element.getText(), maxTextLength);
        } else if (element instanceof PsiBinaryFile) {
            result = ((PsiBinaryFile) element).getName();
        } else {
            result = truncate(element.getText(), maxTextLength);
        }

        return result;
    }

    private Long getHashId(PsiElement element){
        if( element != null) {
            String signature = SignatureGenerator.generate(element);
            String path = corefURI.getPath();

            //when a resolved element is from another file, needs to use its real file path.
            if(element.getContainingFile() != null && element.getContainingFile().getVirtualFile() != null) {
                if(!(element.getContainingFile().equals(file))){
                    path = PathUtil.getRelPath(this.srcRootDir, element.getContainingFile().getVirtualFile().getPath());
                }
            }

            String corefURIString = CorefURI.generate(corefURI.getRepository(), path, signature);
            return HashUtil.hashString(corefURIString);
        } else {
            return Long.valueOf(-1);
        }
    }

    private JsonElement getElementJsonStr(PsiElement element, Map<Long, String> hashIDToNodeMap) {

        if (element == null || (element instanceof PsiWhiteSpace)) {
            return null;
        }
        Long hashId = getHashId(element);
        String label = "";


        if (hashIDToNodeMap.containsKey(hashId)) {
            label = hashIDToNodeMap.get(hashId);

            //  手工做一些特殊处理，更标准的方法是在代码中找到对应关系
            if (("clazz").equals(label)) {
                label = "Class";
            } else if (("ImportInfo").equals(label)) {
                label = "Import";
            } else if (("InterfaceInfo").equals(label)) {
                label = "Interface";
            }
        }

        String nodeMessage = getNodeMessage(element);
        if ("".equals(nodeMessage) && "".equals(label)) {
            return null;
        }

        JsonObject jsonObject = new JsonObject();
        jsonObject.add("nodeName", new JsonPrimitive(label));
        jsonObject.add("nodeMessage", new JsonPrimitive(nodeMessage));
        jsonObject.add("startOffset", new JsonPrimitive(element.getTextRange().getStartOffset()));
        jsonObject.add("endOffset", new JsonPrimitive(element.getTextRange().getEndOffset()));

        JsonArray jsonElements = new JsonArray();
        if (element.getChildren().length > 0) {
            for (PsiElement child : element.getChildren()) {
                JsonElement childObject = getElementJsonStr(child, hashIDToNodeMap);
                if (childObject != null) {
                    jsonElements.add(childObject);
                }

            }
        }
        jsonObject.add("children", jsonElements);
        return jsonObject;
    }
}
