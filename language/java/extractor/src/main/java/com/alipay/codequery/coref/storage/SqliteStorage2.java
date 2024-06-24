package com.alipay.codequery.coref.storage;

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
import com.alipay.codequery.coref.model.*;
import com.alipay.codequery.coref.model.NpClass;
import com.alipay.codequery.coref.model.NpFile;
import com.alipay.codequery.coref.model.NpInterface;
import com.alipay.codequery.coref.model.NpMethod;
import com.alipay.codequery.coref.model.NpProject;
import com.alipay.codequery.dal.mybatis.domain.*;
import com.alipay.codequery.dal.mybatis.domain.Exception;
import com.alipay.codequery.dal.mybatis.mapper.*;
import com.alipay.codequery.coref.model.*;
import com.alipay.codequery.dal.mybatis.domain.Primitive;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
import org.apache.ibatis.io.ResolverUtil;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tk.mybatis.mapper.entity.Config;
import tk.mybatis.mapper.mapperhelper.MapperHelper;

import javax.sql.DataSource;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;

@Slf4j
public class SqliteStorage2 implements IStorage {

    public static final Logger logger = LogManager.getLogger(SqliteStorage2.class);

    private static final Set<java.lang.Class<?>> mappers = new HashSet<>();
    static {
        ResolverUtil<java.lang.Class<?>> resolverUtil = new ResolverUtil<>();
        resolverUtil.find(new ResolverUtil.IsA(Object.class), "com.alipay.codequery.dal.mybatis.mapper");
        Set<java.lang.Class<? extends java.lang.Class<?>>> mapperSet = resolverUtil.getClasses();
        mappers.addAll(mapperSet);
    }

    private final SqlSessionFactory sqlSessionFactory;
    private final MapperHelper mapperHelper;
    private int batchSize = 2000;

    private final Map<java.lang.Class, Set<Object>> cacheManager = Collections.synchronizedMap(new HashMap<>());

    public SqliteStorage2(String dbDir, String dbFileName) {
        copyDBFiles(dbDir, dbFileName);

        // init the mapper
        Config config = new Config();
        config.setIDENTITY("sqlite");
        config.setEnableMethodAnnotation(true);
        config.setNotEmpty(true);
        config.setCheckExampleEntityClass(true);
        config.setUseSimpleType(true);
        config.setEnumAsSimpleType(true);
        config.setWrapKeyword("`{0}`");
        mapperHelper = new MapperHelper();
        mapperHelper.setConfig(config);

        Properties properties = new Properties();
        properties.setProperty("driver", "org.sqlite.JDBC");
        properties.setProperty("url", "jdbc:sqlite:" + Paths.get(dbDir, dbFileName));
        properties.setProperty("username", "");
        properties.setProperty("password", "");

        DataSourceFactory factory = new PooledDataSourceFactory();
        DataSource dataSource = factory.getDataSource();
        factory.setProperties(properties);
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, dataSource);
        Configuration configuration = new Configuration(environment);
        for (java.lang.Class<?> mapperClass : mappers) {
            configuration.addMapper(mapperClass);
        }

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

        SqlSession session = sqlSessionFactory.openSession(false);
        mapperHelper.processConfiguration(session.getConfiguration());
        session.commit();
        session.close();
    }

    private void copyDBFiles(String dbDir, String corefDbName) {
        try {
            Path destPath = Paths.get(dbDir, corefDbName);
            if (destPath.toFile().exists()) {
                Files.delete(destPath);
            }

            InputStream in = this.getClass().getClassLoader().getResourceAsStream("coref_java_src.db");
            IOUtils.copy(in, new FileOutputStream(destPath.toFile()));
        } catch (IOException e) {
            logger.error("copy db file get error!", e);
        }
    }

    private void insert(java.lang.Class mapperClass, Object object) {
        Set<Object> objectList = cacheManager.computeIfAbsent(mapperClass, k -> Collections.synchronizedSet(new HashSet<>()));
        objectList.add(object);
    }



    @Override
    public void commit() {
        SqlSession session = sqlSessionFactory.openSession(false);
        cacheManager.forEach((mapperClass, value) -> {
            List<Object> doList = new ArrayList<>(value);
            Object mapper = session.getMapper(mapperClass);
            try {
                // MENTION: here we use reflect to reduce the coding work, but make sense while the dal change.
                java.lang.reflect.Method method = mapper.getClass().getMethod("insertMultiple", Collection.class);
                // we must limit the batch insert size to avoid blob over-size crash
                Stream.iterate(0, n -> n + 1).limit(doList.size() / batchSize + 1)
                    .forEach(idx -> {
                            int startIndex = idx * batchSize;
                            int endIndex = Integer.min(startIndex + batchSize, doList.size());
                            if (startIndex >= doList.size()) {
                                return;
                            }
                            List<Object> subList = doList.subList(startIndex, endIndex);
                            if (!subList.isEmpty()) {
                                try {
                                    method.invoke(mapper, subList);
                                    session.commit();
                                } catch (IllegalAccessException | InvocationTargetException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    );
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        });
        session.close();
        cacheManager.clear();
    }

    @Override
    public void storeLocation(com.alipay.codequery.coref.model.Location location) {
        insert(LocationMapper.class, location.extractLocation());
    }

    @Override
    public void storeStatementEnclosingExpression(StatementEnclosingExpression s) {
        insert(StatementEnclosingExpressionMapper.class, s);
    }

    @Override
    public void storeCallableEnclosingExpression(CallableEnclosingExpression c) {
        insert(CallableEnclosingExpressionMapper.class, c);
    }

    @Override
    public void storeCallableEnclosingStatement(CallableEnclosingStatement c) {
        insert(CallableEnclosingStatementMapper.class, c);
    }

    @Override
    public void storeNumberOfLines(com.alipay.codequery.coref.model.Location.NumberOfLines numberOfLines) {
        insert(NumberOfLinesMapper.class, numberOfLines.extractNumberOfLines());
    }

    @Override
    public void storeNameStrings(NameString nameString) {
        insert(NameStringMapper.class, nameString);
    }

    @Override
    public void storeReferenceRelation(ReferenceRelation referenceRelation) {
        insert(ReferenceRelationMapper.class, referenceRelation);
    }

    @Override
    public void storeCallableBinding(CallableBinding callableBinding) {
        insert(CallableBindingMapper.class, callableBinding);
    }

    @Override
    public void storeParent(com.alipay.codequery.coref.model.Parent parent) {
        insert(ParentMapper.class, parent.extractParent());
    }

    @Override
    public void storeAnnotatedRelation(AnnotatedRelation annotatedRelation) {
        insert(AnnotatedRelationMapper.class, annotatedRelation);
    }

    @Override
    public void storeParameter(com.alipay.codequery.coref.model.Parameter parameter) {
        insert(ParameterMapper.class, parameter.extractParameter());
    }

    @Override
    public void storeReferenceElement(com.alipay.codequery.coref.model.Expression reference) {
        insert(ReferenceElementMapper.class, reference.extractReferenceElement());
    }

    @Override
    public void storeImportStaticReferenceElement(com.alipay.codequery.coref.model.Expression reference) {
        insert(ImportStaticReferenceElementMapper.class, reference.extractImportStaticReferenceElement());
    }

    @Override
    public void storeTypeParameter(Type.TypeParameter parameter) {
        insert(TypeParameterMapper.class, parameter.extractTypeParameter());
    }

    @Override
    public void storeClassInitializer(com.alipay.codequery.coref.model.Expression initializer) {
        insert(ClassInitializerMapper.class, initializer.extractClassInitializer());
    }

    @Override
    public void storeAnnotationDeclarationParameterDefaultValue(AnnotationDeclarationParameterDefaultValue parameter) {
        insert(AnnotationDeclarationParameterDefaultValueMapper.class, parameter);
    }

    @Override
    public void storeJavaDocTag(com.alipay.codequery.coref.model.Comment.JavaDocTag docTag) {
        insert(JavadocTagMapper.class, docTag.extractJavadocTag());
    }

    @Override
    public void storeAnonymousClass(Class.AnonymousClass clazz) {
        insert(AnonymousClassMapper.class, clazz.extractAnonymousClass());
    }

    @Override
    public void storeFileMd5Sum(FileMd5Sum file) {
        insert(FileMd5SumMapper.class, file);
    }

    @Override
    public void storeFileSHA256Sum(FileSha256Sum file) {
        insert(FileSha256SumMapper.class, file);
    }

//    public void storeAnnotation(Annotations.AnnotationModel annotation){
//        if(!mock)insert(AnnotationMapper.class, annotation.extractAnnotation());
//    }

    @Override
    public void storeReferenceType(Type type) {
        insert(ReferenceTypeMapper.class, type.extractReferenceType());

    }

    @Override
    public void storeIfStatementWithElse(com.alipay.codequery.coref.model.Statement.IfStatement statement) {
        insert(IfStatementWithElseMapper.class, statement.extractIfStatementWithElse());
    }

    @Override
    public void storeIfStatementWithoutElse(com.alipay.codequery.coref.model.Statement.IfStatement statement) {
        insert(IfStatementWithoutElseMapper.class, statement.extractIfStatementWithoutElse());
    }

//    public void storeTypeParameter(TypeParameterElement element){
//        if(!mock)insert(TypeParameterElementMapper.class, element);
//    }

    @Override
    public void storeTypeElement(Type element) {
        insert(TypeElementMapper.class, element.extractTypeElement());
    }


//    public void storeTypeArgument(TypeArgument argument){
//        if(!mock)insert(TypeArgumentMapper.class, argument);
//    }

    @Override
    public void storeYieldStatement(com.alipay.codequery.coref.model.Statement.YieldStatement statement) {
        insert(YieldStatementMapper.class, statement.extractYieldStatement());
    }

    @Override
    public void storeSynchronizedStatement(com.alipay.codequery.coref.model.Statement.SynchronizedStatement statement) {
        insert(SynchronizedStatementMapper.class, statement.extractSynchronizedStatement());
    }


    @Override
    public void storeExpressionStatement(com.alipay.codequery.coref.model.Statement.ExpressionStatement statement) {
        insert(ExpressionStatementMapper.class, statement.extractExpressionStatement());
    }

    @Override
    public void storeCodeBlock(com.alipay.codequery.coref.model.Statement.CodeBlock codeblock) {
        insert(CodeBlockMapper.class, codeblock.extractCodeBlock());
    }

    @Override
    public void storeBlockStatement(com.alipay.codequery.coref.model.Statement.BlockStatement statement) {
        insert(BlockStatementMapper.class, statement.extractBlockStatement());
    }

    @Override
    public void storeLabeledStatement(com.alipay.codequery.coref.model.Statement.LabeledStatement statement) {
        insert(LabeledStatementMapper.class, statement.extractLabeledStatement());
    }

    @Override
    public void storeLambdaExpression(com.alipay.codequery.coref.model.Expression.LambdaExpression expression) {
        insert(LambdaExpressionMapper.class, expression.extractLambdaExpression());
    }

    @Override
    public void storeThisExpression(com.alipay.codequery.coref.model.Expression.ThisExpression expression) {
        insert(ThisAccessExpressionMapper.class, expression.extractThisAccessExpression());
    }

    @Override
    public void storeThisExpressionWithQualifier(com.alipay.codequery.coref.model.Expression.ThisExpression expression) {
        insert(ThisExpressionWithQualifierMapper.class, expression.extractThisExpressionWithQualifier());
    }

    @Override
    public void storeSuperAccessExpression(com.alipay.codequery.coref.model.Expression.MethodCallExpression expression) {
        insert(SuperAccessExpressionMapper.class, expression.extractSuperAccessExpression());
    }

    @Override
    public void storeSuperConstructorInvocation(com.alipay.codequery.coref.model.Expression.MethodCallExpression expression) {
        insert(SuperConstructorInvocationMapper.class, expression.extractSuperConstructorInvocation());
    }

    @Override
    public void storeEmptyStatement(com.alipay.codequery.coref.model.Statement.EmptyStatement statement) {
        insert(EmptyStatementMapper.class, statement.extractEmptyStatement());
    }

    @Override
    public void storeWhileStatement(com.alipay.codequery.coref.model.Statement.WhileStatement statement) {
        insert(WhileStatementMapper.class, statement.extractWhileStatement());
    }

    @Override
    public void storeTryStatementWithoutFinally(com.alipay.codequery.coref.model.Statement.TryStatement statement) {
        insert(TryStatementWithoutFinallyMapper.class, statement.extractTryStatementWithoutFinally());
    }

    @Override
    public void storeTryStatementWithFinally(com.alipay.codequery.coref.model.Statement.TryStatement statement) {
        insert(TryStatementWithFinallyMapper.class, statement.extractTryStatementWithFinally());
    }

    @Override
    public void storeThrowStatement(com.alipay.codequery.coref.model.Statement.ThrowStatement statement) {
        insert(ThrowStatementMapper.class, statement.extractThrowStatement());
    }


    @Override
    public void storeSwitchStatement(com.alipay.codequery.coref.model.Statement.SwitchStatement statement) {
        insert(SwitchStatementMapper.class, statement.extractSwitchStatement());
    }

    @Override
    public void storeSwitchLabelStatement(com.alipay.codequery.coref.model.Statement.SwitchLabelStatement statement) {
        insert(SwitchLabelStatementMapper.class, statement.extractSwitchLabelStatement());
    }

    @Override
    public void storeDoWhileStatement(com.alipay.codequery.coref.model.Statement.DoWhileStatement statement) {
        insert(DoWhileStatementMapper.class, statement.extractDoWhileStatement());
    }

    @Override
    public void storeContinueStatement(com.alipay.codequery.coref.model.Statement.ContinueStatement statement) {
        insert(ContinueStatementMapper.class, statement.extractContinueStatement());
    }

    @Override
    public void storeBreakStatement(com.alipay.codequery.coref.model.Statement.BreakStatement statement) {
        insert(BreakStatementMapper.class, statement.extractBreakStatement());
    }

    @Override
    public void storeReturnStatement(com.alipay.codequery.coref.model.Statement.ReturnStatement statement) {
        insert(ReturnStatementMapper.class, statement.extractReturnStatement());
    }

    @Override
    public void storeModule(Module module) {
        insert(ModuleMapper.class, module.extractModule());
    }

    @Override
    public void storeTypeLiteral(Type.TypeLiteral literal) {
        insert(TypeLiteralMapper.class, literal.extractTypeLiteral());
    }

    @Override
    public void storeAssertStatement(com.alipay.codequery.coref.model.Statement.AssertStatement statement) {
        insert(AssertStatementMapper.class, statement.extractAssertStatement());
    }

    @Override
    public void storeDeclarationElement(com.alipay.codequery.coref.model.Statement.DeclarationStatement statement) {
        insert(DeclarationElementMapper.class, statement.extractDeclarationElement());
    }

    @Override
    public void storeImport(com.alipay.codequery.coref.model.Statement.ImportStatement statement) {
        insert(ImportInfoMapper.class, statement.extractImport());
    }

    @Override
    public void storeImportStaticStatement(com.alipay.codequery.coref.model.Statement.ImportStatement statement) {
        insert(ImportStaticStatementMapper.class, statement.extractImportStaticStatement());
    }

    @Override
    public void storeResourceList(ResourceList list) {
        insert(ResourceListMapper.class, list);
    }

    @Override
    public void storeMethodAccessExpressionWithoutType(com.alipay.codequery.coref.model.Expression.MethodCallExpression expression) {
        insert(MethodAccessExpressionWithoutTypeMapper.class, expression.extractMethodAccessExpressionWithoutType());
    }

    @Override
    public void storeMethodAccessExpressionWithType(com.alipay.codequery.coref.model.Expression.MethodCallExpression expression) {
        insert(MethodAccessExpressionWithTypeMapper.class, expression.extractMethodAccessExpressionWithType());
    }

    @Override
    public void storeMethodReferenceExpression(com.alipay.codequery.coref.model.Expression.MethodCallExpression expression) {
        insert(MethodReferenceExpressionMapper.class, expression.extractMethodReferenceExpression());
    }

    @Override
    public void storeArrayInitializerExpression(com.alipay.codequery.coref.model.Expression.ArrayInitializationExpression expression) {
        insert(ArrayInitializerExpressionMapper.class, expression.extractArrayInitializerExpression());
    }

    @Override
    public void storeAnnotationArrayInitializer(com.alipay.codequery.coref.model.Expression.ArrayInitializationExpression expression) {
        insert(AnnotationArrayInitializerMapper.class, expression.extractAnnotationArrayInitializer());
    }

    @Override
    public void storeArrayAccessExpression(com.alipay.codequery.coref.model.Expression.ArrayAccessExpression expression) {
        insert(ArrayAccessExpressionMapper.class, expression.extractArrayAccessExpression());
    }

    @Override
    public void storeToken(Token token) {
        insert(TokenMapper.class, token);
    }

    @Override
    public void storeLocalVariable(com.alipay.codequery.coref.model.LocalVariable variable) {
        insert(LocalVariableMapper.class, variable.extractLocalVariable());
    }

//    public void storeCallExpression(Expressions.CallExpression expression){
//        if(!mock)insert(CallExpressionMapper.class, expression.extractCallExpression());
//    }

    @Override
    public void storeCastExpression(com.alipay.codequery.coref.model.Expression.CastExpression expression) {
        insert(TypeCastExpressionMapper.class, expression.extractTypeCastExpressiont());
    }

    @Override
    public void storeReferenceExpression(com.alipay.codequery.coref.model.Expression expression) {
        insert(ReferenceExpressionMapper.class, expression.extractReferenceExpression());
    }

    @Override
    public void storeConstructorInvocation(com.alipay.codequery.coref.model.Expression.NewExpression expression) {
        insert(ConstructorInvocationMapper.class, expression.extractConstructorInvocation());
    }

    @Override
    public void storeConditionalExpression(com.alipay.codequery.coref.model.Expression.ConditionalExpression expression) {
        insert(ConditionalExpressionMapper.class, expression.extractCondtionalExpression());
    }

    @Override
    public void storeNewExpression(com.alipay.codequery.coref.model.Expression.NewExpression expression) {
        insert(NewExpressionMapper.class, expression.extractNewExpression());
    }

    @Override
    public void storeArrayCreationExpression(com.alipay.codequery.coref.model.Expression.NewExpression expression) {
        insert(ArrayCreationExpressionMapper.class, expression.extractArrayCreationExpression());
    }

    @Override
    public void storeField(com.alipay.codequery.coref.model.Field field) {
        insert(FieldMapper.class, field.extractField());
    }

    @Override
    public void storeMethod(com.alipay.codequery.coref.model.Method method) {
        insert(MethodMapper.class, method.extractMethodDeclaration());
    }

    @Override
    public void storeConstructor(com.alipay.codequery.coref.model.Method method) {
        insert(ConstructorMapper.class, method.extractConstructor());
    }

    @Override
    public void storePrimitive(Primitive primitive) {
        insert(PrimitiveMapper.class, primitive);
    }

    @Override
    public void storeCatchClauseStatement(com.alipay.codequery.coref.model.Statement.CatchClause catchClause) {
        insert(CatchSectionMapper.class, catchClause.extractCatchSection());
    }

    @Override
    public void storeLocalClass(Class.ClassDefinition statement) {
        insert(LocalClassMapper.class, statement.extractLocalClass());
    }

    @Override
    public void storeEnumConstant(com.alipay.codequery.coref.model.Field enumField) {
        insert(EnumConstantMapper.class, enumField.extractEnumConstant());
    }

    @Override
    public void storeInstanceOfExpression(com.alipay.codequery.coref.model.Expression.InstanceOfExpression expression) {
        insert(InstanceofExpressionMapper.class, expression.extractInstanceOfExpression());
    }

    @Override
    public void storeArray(Variable array) {
        insert(ArrayMapper.class, array.extractArray());
    }

    @Override
    public void storeAnnotationCanResolved(Annotation.AnnotationModel annotation) {
        insert(AnnotationCanResolvedMapper.class, annotation.extractAnnotationCanResolved());
    }

    @Override
    public void storeAnnotationCanNotResolved(Annotation.AnnotationModel annotation) {
        insert(AnnotationCanNotResolvedMapper.class, annotation.extractAnnotationCanNotResolved());
    }

    @Override
    public void storeAnnotationDeclaration(Annotation.AnnotationModel annotation) {
        insert(AnnotationDeclarationMapper.class, annotation.extractAnnotationDeclaration());
    }

    @Override
    public void storeAnnotationDeclarationParameter(Annotation.AnnotationParameter parameter) {
        insert(AnnotationDeclarationParameterMapper.class, parameter.extractAnnotationArgument());
    }

    @Override
    public void storeExpression(com.alipay.codequery.coref.model.Expression expression) {
        insert(ExpressionMapper.class, expression.extractExpression());
    }

    @Override
    public void storePackageStatement(com.alipay.codequery.coref.model.Statement.PackageStatement packages) {
        insert(PackageStatementMapper.class, packages.extractPackage());
    }

    @Override
    public void storeCuPackage(Cupackage cupackage) {
        insert(CupackageMapper.class, cupackage);
    }

    @Override
    public void storeClassHierarchy(Class.ClassHierarchy classHierarchy) {
        insert(ClassHierarchyMapper.class, classHierarchy.extractClassHierarchy());
    }

    @Override
    public void storeSuperExpression(com.alipay.codequery.coref.model.Expression.SuperExpression expression) {
        insert(SuperExpressionMapper.class, expression.extractSuperExpression());
    }

    @Override
    public void storeSuperExpressionWithQualifier(com.alipay.codequery.coref.model.Expression.SuperExpression expression) {
        insert(SuperExpressionWithQualifierMapper.class, expression.extractSuperExpressionWithQualifier());
    }

    @Override
    public void storeException(Exception exception) {
        insert(ExceptionMapper.class, exception);
    }

    @Override
    public void storeClass(Class.ClassDefinition classDefinition) {
        insert(clazzMapper.class, classDefinition.extractClass());
    }

    @Override
    public void storeImplementlist(ClassImplementList list) {
        insert(ClassImplementListMapper.class, list);
    }


    @Override
    public void storeElement(Element e) {
        insert(ElementMapper.class, e);
    }

    @Override
    public void storeReferencelist(com.alipay.codequery.coref.model.Expression.ReferenceList list) {
        insert(ReferenceListMapper.class, list.extractReferenceList());
    }

    @Override
    public void storeReferenceParameterlist(ParameterList.ReferenceParameterList list, int index) {
        insert(ReferenceParameterListMapper.class, list.extractReferenceParameterList(index));
    }

    @Override
    public void storeEmptyReferenceParameterlist(ParameterList.ReferenceParameterList list) {
        insert(EmptyReferenceParameterListMapper.class, list.extractEmptyReferenceParameterList());
    }

    @Override
    public void storeInterface(Class.ClassDefinition classDefinition) {
        insert(InterfaceInfoMapper.class, classDefinition.extractInterface());
    }

    @Override
    public void storeStatement(com.alipay.codequery.coref.model.Statement statement) {
        insert(StatementMapper.class, statement.extractStatement());
    }

    @Override
    public void storeComment(com.alipay.codequery.coref.model.Comment comment) {
        insert(CommentMapper.class, comment.extractComment());
    }

    @Override
    public void storeExpressionList(com.alipay.codequery.coref.model.Expression.ExpressionList list) {
        insert(ExpressionListMapper.class, list.extractExpressionList());
    }

    @Override
    public void storeExpressionListExpressionRelation(ExpressionListExpressionRelation expressionListRelation) {
        insert(ExpressionListExpressionRelationMapper.class, expressionListRelation);
    }

    @Override
    public void storeJavaDocComment(com.alipay.codequery.coref.model.Comment.JavaDocComment comments) {
        insert(JavadocCommentMapper.class, comments.extractJavaDocComment());
    }

    @Override
    public void storeJavaDocDataToken(com.alipay.codequery.coref.model.Comment.JavaDocDataToken javaDocDataToken) {
        insert(JavadocDataTokenMapper.class, javaDocDataToken.extractJavaDocDataToken());
    }

    @Override
    public void storeJavaDocTagValue(Comment.JavaDocTagValue javaDocTagValue) {
        insert(JavadocTagValueMapper.class, javaDocTagValue.extractJavaDocTagValue());
    }

    @Override
    public void storeForStatement(com.alipay.codequery.coref.model.Statement.ForStatement statement) {
        insert(ForStatementMapper.class, statement.extractForStatement());
    }

    @Override
    public void storeAssignmentExpression(com.alipay.codequery.coref.model.Expression.AssignmentExpression expression) {
        insert(AssignmentExpressionMapper.class, expression.extractAssignmentExpression());
    }

    @Override
    public void storeBinaryExpression(com.alipay.codequery.coref.model.Expression.BinaryExpression expression) {
        insert(BinaryExpressionMapper.class, expression.extractBinaryExpression());
    }

    @Override
    public void storePolyadicExpression(com.alipay.codequery.coref.model.Expression.PolyadicExpression expression) {
        insert(PolyadicExpressionMapper.class, expression.extractPolyadicExpression());
    }

    @Override
    public void storeUnaryExpression(Expression.UnaryExpression expression) {
        insert(UnaryExpressionMapper.class, expression.extractUnaryExpression());
    }

    @Override
    public void storeForeachStatement(Statement.ForeachStatement statement) {
        insert(ForeachStatementMapper.class, statement.extractForeachStatement());
    }

    @Override
    public void storeAnnotationArgumentWithName(Annotation.AnnotationArgument annotationArgument) {
        insert(AnnotationAccessArgumentWithNameMapper.class, annotationArgument.extractAnnotationArgumentWithName());
    }

    @Override
    public void storeAnnotationArgumentWithoutName(Annotation.AnnotationArgument annotationArgument) {
        insert(AnnotationAccessArgumentWithoutNameMapper.class, annotationArgument.extractAnnotationArgumentWithoutName());
    }

    @Override
    public void storeProgram(Program program) {
        insert(ProgramMapper.class, program.extractProgram());
    }

    @Override
    public void storeModifier(com.alipay.codequery.coref.model.Modifier modifier) {
        insert(ModifierMapper.class, modifier.extractModifier());
    }

    @Override
    public void storeModifierList(Modifier modifier) {
        insert(ModifierListMapper.class, modifier.extractModifierList());
    }

    @Override
    public void storeFile(File file) {
        insert(FileMapper.class, file.extractFile());
    }

    @Override
    public void storeFolder(Folder folder) {
        insert(FolderMapper.class, folder.extractFolder());
    }

    @Override
    public void storeContainerParent(ContainerParent container) {
        insert(ContainerParentMapper.class, container);
    }

    @Override
    public void storeIdentifier(Identifier identifier) {
        insert(IdentifierMapper.class, identifier.extractIdentifier());
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

        }
    }

    @Override
    public void storeLiteral(Literal literal, java.lang.Class mapperClass) {
        insert(mapperClass, literal.extractLiteral());
    }

    @Override
    public void storeNpProject(NpProject npProject) {
        insert(NpProjectMapper.class, npProject.extractNpProject());
    }

    @Override
    public void storeNpFile(NpFile npFile) {
        insert(NpFileMapper.class, npFile.extractNpFile());
    }

    @Override
    public void storeNpClass(NpClass npClass) {
        insert(NpClassMapper.class, npClass.extractNpClass());
    }

    @Override
    public void storeNpInterface(NpInterface npInterface) {
        insert(NpInterfaceMapper.class, npInterface.extractNpInterface());
    }

    @Override
    public void storeNpMethod(NpMethod npMethod) {
        insert(NpMethodMapper.class, npMethod.extractNpMethod());
    }
}
