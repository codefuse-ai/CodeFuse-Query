/*
 * Automatically Generated From CorefVisitor.java.j2.
 * Do Not Edit Directly!
 *
 * Ant Group
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.alipay.codequery.coref.sql.core;

import com.alibaba.druid.DbType;
import com.alibaba.druid.sql.ast.*;
import com.alibaba.druid.sql.dialect.antspark.visitor.AntsparkVisitor;
import com.alibaba.druid.sql.dialect.blink.vsitor.BlinkVisitor;
import com.alibaba.druid.sql.dialect.clickhouse.visitor.ClickhouseVisitor;
import com.alibaba.druid.sql.dialect.db2.visitor.DB2ASTVisitor;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlASTVisitor;
import com.alibaba.druid.sql.dialect.odps.visitor.OdpsASTVisitor;
import com.alibaba.druid.sql.dialect.oracle.visitor.OracleASTVisitor;
import com.alibaba.druid.sql.dialect.oscar.visitor.OscarASTVisitor;
import com.alibaba.druid.sql.dialect.postgresql.visitor.PGASTVisitor;
import com.alibaba.druid.sql.dialect.sqlserver.visitor.SQLServerASTVisitor;
import com.alibaba.druid.sql.parser.ParserException;
import com.alibaba.druid.sql.parser.SQLParserFeature;
import com.alibaba.druid.sql.parser.SQLParserUtils;
import com.alibaba.druid.sql.parser.SQLStatementParser;
import com.alibaba.druid.sql.repository.SchemaRepository;
import com.alibaba.druid.sql.repository.SchemaResolveVisitor;
import com.alibaba.druid.sql.visitor.SQLASTVisitorAdapter;
import com.alipay.codequery.coref.sql.DbTypeEnum;
import com.alipay.codequery.coref.sql.storage.StorageFacade;
import com.alipay.codequery.coref.sql.util.JavaObject2CorefDataConverter;
import com.alipay.codequery.dal.mybatis.domain.Location;
import com.alipay.codequery.dal.mybatis.domain.SqlObject;
import com.alipay.codequery.util.PathUtil;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class CorefVisitor extends SQLASTVisitorAdapter implements OracleASTVisitor, SQLServerASTVisitor, OdpsASTVisitor, MySqlASTVisitor, PGASTVisitor, DB2ASTVisitor, ClickhouseVisitor, OscarASTVisitor, AntsparkVisitor, BlinkVisitor {
    private static final Logger logger = LogManager.getLogger(CorefVisitor.class);

    private final File file;

    @Getter@Setter
    private DbTypeEnum dbType;

    @Getter
    private final String sqlContent;

    private final StorageFacade corefStorage;

    private final CorefURI corefURI;

    final Set<Long> locationSet = new HashSet<>();
    
    final Map<Long, Integer> parentMap = new HashMap<>();

    /**
     * Set storing Object IDs of SQLObjects to avoid storing them multiple times
     */
    final Set<Long> visitedOidSet = new HashSet<>();

    /**
     * Hash map storing SQL object and its Object ID mapping. Key is the hash code of a SQL object,
     * value is the COREF Object ID of the SQL object
     */
    final Map<Integer, Long> visitedSQLObjectMap = new HashMap<>();

    public void parse() {
        try {
            corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.File(
                    corefURI.generateFileOid(),
                    corefURI.getPath(),
                    FilenameUtils.getExtension(corefURI.getPath()),
                    FilenameUtils.getName(corefURI.getPath()),
                    corefURI.generateCorpusOid()
            ));

            logger.info("Using database type of {} to parse file: {}", getDbType(), file);

            // Convert the Db type to Druid's one
            // Even if druidDbType is null, createSQLStatementParser() will use `DbType.other` instead.
            DbType druidDbType = DbType.of(getDbType().getName());

            SQLStatementParser parser = SQLParserUtils.createSQLStatementParser(
                    getSqlContent(),
                    druidDbType,
                    //SQLParserFeature.PrintSQLWhileParsingFailed,
                    SQLParserFeature.KeepSourceLocation,
                    SQLParserFeature.KeepComments
            );

            List<SQLStatement> sqlStatements = parser.parseStatementList();

            // Try to detect some SQLObject whose parent is null but actually not.
            // If so, try to reset its parent to the real one.
            FakeNullParentDetector fakeNullParentDetector = new FakeNullParentDetector();

            SchemaRepository schemaRepository = new SchemaRepository(druidDbType);

            for (SQLStatement sqlStatement: sqlStatements) {
                schemaRepository.resolve(sqlStatement,
                        SchemaResolveVisitor.Option.ResolveIdentifierAlias,
                        SchemaResolveVisitor.Option.ResolveAllColumn,
                        SchemaResolveVisitor.Option.CheckColumnAmbiguous);
                
                sqlStatement.accept(fakeNullParentDetector);
                sqlStatement.accept(this);
            }
        } catch (ParserException e) {
            logger.error("SQL parser exception with dialect {} for file {}: {}", getDbType(), file, e);
            throw e;
        }
    }

    /**
     * Problematic: Druid SQL parser seems not be able to parse source location for every AST element.
     * For example, for the following SQL:
     * select a from A;
     * select a from B;
     * <p>
     * `a` is a SQLSelectItem but Druid returns its source line and source column as 0 and 0. (Some elements can return the
     * exact source location but some doesn't, don't know why and how to work around this).
     * <p>
     * In COREF, the object ID depends on corpus, file path, AST node type, node text and source location to be identifiable between each other.
     * However, in the example above and due to Druid's source location parsing issue, the Object ID of those two `a` will be the same,
     * but they should've been treated as two different AST elements.
     * <p>
     * To solve this issue, we should introduce another information to be added to the Object ID so that those two `a` have
     * different object ID. I chose all of its ancestors' Oid. Looks the equation below:
     * <p>
     * Oid(sqlObject) = Oid(AST signature of sqlObject) ^ Oid(parent)
     *                = Oid(AST signature of sqlObject) ^ Oid( Oid(AST signature of parent) ^ Oid(parent's parent) )
     *                = ...
     * <p>
     * Here, no matter if its parent has source location or not, we just calculate the object ID of the node by involving all of its ancestors' Oid,
     * so that we can always avoid object ID conflicts.
     * <p>
     * TODO add Unit tests to make sure the uniqueness of the Object ID.
     *
     * @param sqlObject
     * @return Object ID of the SQL Object
     */
    public Long getOid(SQLObjectImpl sqlObject) {
        // IMPORTANT NOTE: use native default hash code method to identify if the SQL object has already been visited to
        // calculate its object ID.
        // Don't use the method of SQLObjectImpl::hashCode !!! This method doesn't take SQLObject's parent into account to
        // calculate the hash code. Otherwise, it will cause
        Integer sqlObjectHashCode = System.identityHashCode(sqlObject);
        if (visitedSQLObjectMap.get(sqlObjectHashCode) != null) {
            return visitedSQLObjectMap.get(sqlObjectHashCode);
        }

        if (sqlObject == null) {
            return -1L;
        }

        String signature = SignatureGenerator.generate(sqlObject);
        Long oid = corefURI.generateOid(signature);

        oid ^= getOid((SQLObjectImpl) sqlObject.getParent());

        visitedSQLObjectMap.put(sqlObjectHashCode, oid);

        return oid;
    }

    public Long getOid(SQLObject sqlObject) {
        return getOid((SQLObjectImpl) sqlObject);
    }

    public Long getLocationOid(SQLObjectImpl sqlObject) {
        if (sqlObject == null) {
            return -1L;
        }

        int sourceLine = sqlObject.getSourceLine();
        int sourceColumn = sqlObject.getSourceColumn();

        String signature = String.format("(%d,%d)", sourceLine, sourceColumn);
        Long locationOid = corefURI.generateOid(signature);

        if (!locationSet.contains(locationOid)) {
            locationSet.add(locationOid);
            corefStorage.store(new Location(
                    locationOid,
                    corefURI.generateFileOid(),
                    sourceLine,
                    sourceColumn
            ));
        }
        return locationOid;
    }

    public CorefVisitor(File file, DbTypeEnum dbType, StorageFacade corefStorage, File srcRootDir, String corpus) throws IOException {
        this.file = file;
        this.dbType = dbType;
        this.corefStorage = corefStorage;

        // If corpus is not specified, pass srcRootDir dir name
        this.corefURI = StringUtils.isBlank(corpus) ? new CorefURI(srcRootDir.getName()) : new CorefURI(corpus);
        String relativePath = PathUtil.getRelPath(srcRootDir.getPath(), file.getPath());
        this.corefURI.setPath(relativePath);

        sqlContent = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
    }

    @Override
    public void postVisit(SQLObject x) {
        SQLObjectImpl sqlObject = (SQLObjectImpl) x;
        SQLObjectImpl parent = (SQLObjectImpl) x.getParent();

        Long oid = getOid(sqlObject);
        if (visitedOidSet.contains(oid)) {
            return;
        }
        visitedOidSet.add(oid);

        Long parentOid = getOid(parent);
        Integer currentIndexInParent = -1;
        if (parent != null) {
            parentMap.putIfAbsent(parentOid, 0);
            currentIndexInParent = parentMap.get(parentOid);
            parentMap.put(parentOid, currentIndexInParent + 1);
        }

        corefStorage.store(new SqlObject(
                oid,
                parentOid,
                getLocationOid(sqlObject),
                x.getClass().getSimpleName(),
                currentIndexInParent,
                x.getAfterCommentsDirect() != null ? x.getAfterCommentsDirect().toString() : "",
                x.getBeforeCommentsDirect() != null ? x.getBeforeCommentsDirect().toString() : "",
                getDbType().toString(),
                sqlObject.toString()
        ));
    }

    @Override
    public void endVisit(com.alibaba.druid.sql.dialect.antspark.ast.AntsparkCreateTableStatement x) {}

    @Override
    public void endVisit(com.alibaba.druid.sql.dialect.blink.ast.BlinkCreateTableStatement x) {}

    
    @Override
    public boolean visit(SQLDataType x) {
        SQLDataTypeImpl dataTypeImpl = (SQLDataTypeImpl) x;
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDataTypeImpl(
                getOid(dataTypeImpl),
                getOid(dataTypeImpl.getIndexBy()),
                JavaObject2CorefDataConverter.convert(dataTypeImpl, com.alibaba.druid.sql.ast.SQLDataTypeImpl::isInt, Integer.class, "isInt"),
                JavaObject2CorefDataConverter.convert(dataTypeImpl, com.alibaba.druid.sql.ast.SQLDataTypeImpl::isNumberic, Integer.class, "isNumberic"),
                JavaObject2CorefDataConverter.convert(dataTypeImpl, com.alibaba.druid.sql.ast.SQLDataTypeImpl::isString, Integer.class, "isString"),
                JavaObject2CorefDataConverter.convert(dataTypeImpl, com.alibaba.druid.sql.ast.SQLDataTypeImpl::isUnsigned, Integer.class, "isUnsigned"),
                JavaObject2CorefDataConverter.convert(dataTypeImpl, com.alibaba.druid.sql.ast.SQLDataTypeImpl::isWithLocalTimeZone, Integer.class, "isWithLocalTimeZone"),
                JavaObject2CorefDataConverter.convert(dataTypeImpl, com.alibaba.druid.sql.ast.SQLDataTypeImpl::isZerofill, Integer.class, "isZerofill"),
                JavaObject2CorefDataConverter.convert(dataTypeImpl, com.alibaba.druid.sql.ast.SQLDataTypeImpl::getName, String.class, "getName"),
                JavaObject2CorefDataConverter.convert(dataTypeImpl, com.alibaba.druid.sql.ast.SQLDataTypeImpl::getWithTimeZone, Integer.class, "getWithTimeZone")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLAdhocTableSource x) {
        // SQLTableSourceImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlTableSourceImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLAdhocTableSource::getAlias, String.class, "getAlias"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLAdhocTableSource::getAlias2, String.class, "getAlias2"),
                getOid(x.getFlashback()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLAdhocTableSource::getHintsSize, Integer.class, "getHintsSize")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAdhocTableSource(
                getOid(x),
                getOid(x.getDefinition())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLAnnIndex x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAnnIndex(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLAnnIndex::getDistance, String.class, "getDistance"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLAnnIndex::getIndexType, Integer.class, "getIndexType"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLAnnIndex::getRtIndexType, Integer.class, "getRtIndexType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLArgument x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlArgument(
                getOid(x),
                getOid(x.getExpr()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLArgument::getType, String.class, "getType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLArrayDataType x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlArrayDataType(
                getOid(x),
                getOid(x.getComponentType()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLArrayDataType::isInt, Integer.class, "isInt"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLArrayDataType::isNumberic, Integer.class, "isNumberic"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLArrayDataType::isString, Integer.class, "isString"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLArrayDataType::isWithLocalTimeZone, Integer.class, "isWithLocalTimeZone"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLArrayDataType::getName, String.class, "getName"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLArrayDataType::getWithTimeZone, Integer.class, "getWithTimeZone")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLCommentHint x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCommentHint(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLCommentHint::getText, String.class, "getText")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLCurrentTimeExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCurrentTimeExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLCurrentTimeExpr::getType, String.class, "getType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLCurrentUserExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCurrentUserExpr(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLDataTypeRefExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDataTypeRefExpr(
                getOid(x),
                getOid(x.getDataType())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLDeclareItem x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDeclareItem(
                getOid(x),
                getOid(x.getDataType()),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLDeclareItem::getResolvedObject, String.class, "getResolvedObject"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLDeclareItem::getType, String.class, "getType"),
                getOid(x.getValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLIndexDefinition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlIndexDefinition(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLIndexDefinition::getAlgorithm, String.class, "getAlgorithm"),
                getOid(x.getAnalyzerName()),
                getOid(x.getDbPartitionBy()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLIndexDefinition::getDistanceMeasure, String.class, "getDistanceMeasure"),
                getOid(x.getIndexAnalyzerName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLIndexDefinition::isGlobal, Integer.class, "isGlobal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLIndexDefinition::isHashMapType, Integer.class, "isHashMapType"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLIndexDefinition::isHashType, Integer.class, "isHashType"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLIndexDefinition::isIndex, Integer.class, "isIndex"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLIndexDefinition::isKey, Integer.class, "isKey"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLIndexDefinition::isLocal, Integer.class, "isLocal"),
                getOid(x.getName()),
                getOid(x.getOptions()),
                getOid(x.getQueryAnalyzerName()),
                getOid(x.getSymbol()),
                getOid(x.getTable()),
                getOid(x.getTbPartitionBy()),
                getOid(x.getTbPartitions()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLIndexDefinition::getType, String.class, "getType"),
                getOid(x.getWithDicName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLIndexOptions x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlIndexOptions(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLIndexOptions::getAlgorithm, String.class, "getAlgorithm"),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLIndexOptions::getIndexType, String.class, "getIndexType"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLIndexOptions::isGlobal, Integer.class, "isGlobal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLIndexOptions::isInvisible, Integer.class, "isInvisible"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLIndexOptions::isLocal, Integer.class, "isLocal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLIndexOptions::isVisible, Integer.class, "isVisible"),
                getOid(x.getKeyBlockSize()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLIndexOptions::getLock, String.class, "getLock"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLIndexOptions::getParserName, String.class, "getParserName")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLKeep x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlKeep(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLKeep::getDenseRank, String.class, "getDenseRank"),
                getOid(x.getOrderBy())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLLimit x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlLimit(
                getOid(x),
                getOid(x.getOffset()),
                getOid(x.getRowCount())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLMapDataType x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlMapDataType(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLMapDataType::isInt, Integer.class, "isInt"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLMapDataType::isNumberic, Integer.class, "isNumberic"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLMapDataType::isString, Integer.class, "isString"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLMapDataType::isWithLocalTimeZone, Integer.class, "isWithLocalTimeZone"),
                getOid(x.getKeyType()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLMapDataType::getName, String.class, "getName"),
                getOid(x.getValueType()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLMapDataType::getWithTimeZone, Integer.class, "getWithTimeZone")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLOrderBy x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlOrderBy(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLOrderBy::isSiblings, Integer.class, "isSiblings")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLOver x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlOver(
                getOid(x),
                getOid(x.getClusterBy()),
                getOid(x.getDistributeBy()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLOver::isExcludeCurrentRow, Integer.class, "isExcludeCurrentRow"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLOver::isWindowingBetweenEndFollowing, Integer.class, "isWindowingBetweenEndFollowing"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLOver::isWindowingBetweenEndPreceding, Integer.class, "isWindowingBetweenEndPreceding"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLOver::isWindowingPreceding, Integer.class, "isWindowingPreceding"),
                getOid(x.getOf()),
                getOid(x.getOrderBy()),
                getOid(x.getSortBy()),
                getOid(x.getWindowingBetweenBegin()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLOver::getWindowingBetweenBeginBound, String.class, "getWindowingBetweenBeginBound"),
                getOid(x.getWindowingBetweenEnd()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLOver::getWindowingBetweenEndBound, String.class, "getWindowingBetweenEndBound"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLOver::getWindowingType, String.class, "getWindowingType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLParameter x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlParameter(
                getOid(x),
                getOid(x.getCursorName()),
                getOid(x.getDataType()),
                getOid(x.getDefaultValue()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLParameter::isConstant, Integer.class, "isConstant"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLParameter::isMap, Integer.class, "isMap"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLParameter::isMember, Integer.class, "isMember"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLParameter::isNoCopy, Integer.class, "isNoCopy"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLParameter::isOrder, Integer.class, "isOrder"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLParameter::getParamType, String.class, "getParamType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLPartition x) {
        // OracleSegmentAttributesImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSegmentAttributesImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartition::getCompress, Integer.class, "getCompress"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartition::getCompressLevel, Integer.class, "getCompressLevel"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartition::getFreeLists, Integer.class, "getFreeLists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartition::getInitrans, Integer.class, "getInitrans"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartition::isCompressForOltp, Integer.class, "isCompressForOltp"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartition::getLogging, Integer.class, "getLogging"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartition::getMaxtrans, Integer.class, "getMaxtrans"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartition::getPctfree, Integer.class, "getPctfree"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartition::getPctincrease, Integer.class, "getPctincrease"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartition::getPctthreshold, Integer.class, "getPctthreshold"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartition::getPctused, Integer.class, "getPctused"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartition::getStorage, String.class, "getStorage"),
                getOid(x.getTablespace())
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPartition(
                getOid(x),
                getOid(x.getComment()),
                getOid(x.getDataDirectory()),
                getOid(x.getEngine()),
                getOid(x.getIndexDirectory()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartition::isSegmentCreationDeferred, Integer.class, "isSegmentCreationDeferred"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartition::isSegmentCreationImmediate, Integer.class, "isSegmentCreationImmediate"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartition::getLobStorage, String.class, "getLobStorage"),
                getOid(x.getLocality()),
                getOid(x.getMaxRows()),
                getOid(x.getMinRows()),
                getOid(x.getName()),
                getOid(x.getSubPartitionsCount()),
                getOid(x.getValues())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLPartitionByHash x) {
        // SQLPartitionBy is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPartitionBy(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionByHash::isLinear, Integer.class, "isLinear"),
                getOid(x.getLifecycle()),
                getOid(x.getPartitionsCount()),
                getOid(x.getSubPartitionBy())
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPartitionByHash(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionByHash::isKey, Integer.class, "isKey"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionByHash::isUnique, Integer.class, "isUnique")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLPartitionByList x) {
        // SQLPartitionBy is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPartitionBy(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionByList::isLinear, Integer.class, "isLinear"),
                getOid(x.getLifecycle()),
                getOid(x.getPartitionsCount()),
                getOid(x.getSubPartitionBy())
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPartitionByList(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLPartitionByRange x) {
        // SQLPartitionBy is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPartitionBy(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionByRange::isLinear, Integer.class, "isLinear"),
                getOid(x.getLifecycle()),
                getOid(x.getPartitionsCount()),
                getOid(x.getSubPartitionBy())
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPartitionByRange(
                getOid(x),
                getOid(x.getExpireAfter()),
                getOid(x.getInterval()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionByRange::isColumns, Integer.class, "isColumns"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionByRange::isDisableSchedule, Integer.class, "isDisableSchedule"),
                getOid(x.getPivotDateExpr()),
                getOid(x.getPreAllocate()),
                getOid(x.getStartWith())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLPartitionByValue x) {
        // SQLPartitionBy is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPartitionBy(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionByValue::isLinear, Integer.class, "isLinear"),
                getOid(x.getLifecycle()),
                getOid(x.getPartitionsCount()),
                getOid(x.getSubPartitionBy())
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPartitionByValue(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLPartitionSpec x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPartitionSpec(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionSpec::getItems, String.class, "getItems")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLPartitionValue x) {
        // OracleSegmentAttributesImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSegmentAttributesImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionValue::getCompress, Integer.class, "getCompress"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionValue::getCompressLevel, Integer.class, "getCompressLevel"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionValue::getFreeLists, Integer.class, "getFreeLists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionValue::getInitrans, Integer.class, "getInitrans"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionValue::isCompressForOltp, Integer.class, "isCompressForOltp"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionValue::getLogging, Integer.class, "getLogging"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionValue::getMaxtrans, Integer.class, "getMaxtrans"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionValue::getPctfree, Integer.class, "getPctfree"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionValue::getPctincrease, Integer.class, "getPctincrease"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionValue::getPctthreshold, Integer.class, "getPctthreshold"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionValue::getPctused, Integer.class, "getPctused"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionValue::getStorage, String.class, "getStorage"),
                getOid(x.getTablespace())
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPartitionValue(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLPartitionValue::getOperator, String.class, "getOperator")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLRecordDataType x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlRecordDataType(
                getOid(x)
        ));

        return this.visit((com.alibaba.druid.sql.ast.SQLDataTypeImpl) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLRowDataType x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlRowDataType(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLRowDataType::getFields, String.class, "getFields"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLRowDataType::isInt, Integer.class, "isInt"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLRowDataType::isNumberic, Integer.class, "isNumberic"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLRowDataType::isString, Integer.class, "isString"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLRowDataType::isWithLocalTimeZone, Integer.class, "isWithLocalTimeZone"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLRowDataType::getName, String.class, "getName"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLRowDataType::getWithTimeZone, Integer.class, "getWithTimeZone")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLStructDataType x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStructDataType(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLStructDataType::getFields, String.class, "getFields"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLStructDataType::isInt, Integer.class, "isInt"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLStructDataType::isNumberic, Integer.class, "isNumberic"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLStructDataType::isString, Integer.class, "isString"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLStructDataType::isWithLocalTimeZone, Integer.class, "isWithLocalTimeZone"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLStructDataType::getName, String.class, "getName"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLStructDataType::getWithTimeZone, Integer.class, "getWithTimeZone")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLSubPartition x) {
        // OracleSegmentAttributesImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSegmentAttributesImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLSubPartition::getCompress, Integer.class, "getCompress"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLSubPartition::getCompressLevel, Integer.class, "getCompressLevel"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLSubPartition::getFreeLists, Integer.class, "getFreeLists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLSubPartition::getInitrans, Integer.class, "getInitrans"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLSubPartition::isCompressForOltp, Integer.class, "isCompressForOltp"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLSubPartition::getLogging, Integer.class, "getLogging"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLSubPartition::getMaxtrans, Integer.class, "getMaxtrans"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLSubPartition::getPctfree, Integer.class, "getPctfree"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLSubPartition::getPctincrease, Integer.class, "getPctincrease"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLSubPartition::getPctthreshold, Integer.class, "getPctthreshold"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLSubPartition::getPctused, Integer.class, "getPctused"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLSubPartition::getStorage, String.class, "getStorage"),
                getOid(x.getTablespace())
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSubPartition(
                getOid(x),
                getOid(x.getComment()),
                getOid(x.getDataDirectory()),
                getOid(x.getEngine()),
                getOid(x.getIndexDirectory()),
                getOid(x.getMaxRows()),
                getOid(x.getMinRows()),
                getOid(x.getName()),
                getOid(x.getTableSpace()),
                getOid(x.getValues())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLSubPartitionByHash x) {
        // SQLSubPartitionBy is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSubPartitionBy(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLSubPartitionByHash::isLinear, Integer.class, "isLinear"),
                getOid(x.getLifecycle()),
                getOid(x.getSubPartitionsCount())
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSubPartitionByHash(
                getOid(x),
                getOid(x.getExpr()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLSubPartitionByHash::isKey, Integer.class, "isKey")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLSubPartitionByList x) {
        // SQLSubPartitionBy is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSubPartitionBy(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLSubPartitionByList::isLinear, Integer.class, "isLinear"),
                getOid(x.getLifecycle()),
                getOid(x.getSubPartitionsCount())
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSubPartitionByList(
                getOid(x),
                getOid(x.getColumn())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLSubPartitionByRange x) {
        // SQLSubPartitionBy is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSubPartitionBy(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLSubPartitionByRange::isLinear, Integer.class, "isLinear"),
                getOid(x.getLifecycle()),
                getOid(x.getSubPartitionsCount())
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSubPartitionByRange(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLTableDataType x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlTableDataType(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLTableDataType::isInt, Integer.class, "isInt"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLTableDataType::isNumberic, Integer.class, "isNumberic"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLTableDataType::isString, Integer.class, "isString"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLTableDataType::isWithLocalTimeZone, Integer.class, "isWithLocalTimeZone"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLTableDataType::getName, String.class, "getName"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLTableDataType::getWithTimeZone, Integer.class, "getWithTimeZone")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLUnionDataType x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlUnionDataType(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLUnionDataType::getName, String.class, "getName")
        ));

        return this.visit((com.alibaba.druid.sql.ast.SQLDataTypeImpl) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLWindow x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlWindow(
                getOid(x),
                getOid(x.getName()),
                getOid(x.getOver())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.SQLZOrderBy x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlzOrderBy(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.SQLZOrderBy::isSibings, Integer.class, "isSibings")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLAggregateExpr x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAggregateExpr(
                getOid(x),
                getOid(x.getFilter()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLAggregateExpr::getIgnoreNulls, Integer.class, "getIgnoreNulls"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLAggregateExpr::isDistinct, Integer.class, "isDistinct"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLAggregateExpr::isIgnoreNulls, Integer.class, "isIgnoreNulls"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLAggregateExpr::isWithinGroup, Integer.class, "isWithinGroup"),
                getOid(x.getKeep()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLAggregateExpr::getOption, String.class, "getOption"),
                getOid(x.getOrderBy()),
                getOid(x.getOver()),
                getOid(x.getOverRef())
        ));

        return this.visit((com.alibaba.druid.sql.ast.expr.SQLMethodInvokeExpr) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLAllColumnExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAllColumnExpr(
                getOid(x),
                getOid(x.getResolvedTableSource())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLAllExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAllExpr(
                getOid(x),
                getOid(x.getSubQuery())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLAnyExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAnyExpr(
                getOid(x),
                getOid(x.getSubQuery())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLArrayExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlArrayExpr(
                getOid(x),
                getOid(x.getExpr())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLBetweenExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlBetweenExpr(
                getOid(x),
                getOid(x.getBeginExpr()),
                getOid(x.getEndExpr()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLBetweenExpr::isNot, Integer.class, "isNot"),
                getOid(x.getTestExpr())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLBigIntExpr x) {
        // SQLNumericLiteralExpr is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlNumericLiteralExpr(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlBigIntExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLBigIntExpr::getNumber, String.class, "getNumber"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLBigIntExpr::getValue, String.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLBinaryExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlBinaryExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLBinaryExpr::getText, String.class, "getText"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLBinaryExpr::getValue, String.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLBinaryOpExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlBinaryOpExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLBinaryOpExpr::isBothName, Integer.class, "isBothName"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLBinaryOpExpr::isLeftFunctionAndRightLiteral, Integer.class, "isLeftFunctionAndRightLiteral"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLBinaryOpExpr::isLeftLiteralAndRightName, Integer.class, "isLeftLiteralAndRightName"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLBinaryOpExpr::isLeftNameAndRightLiteral, Integer.class, "isLeftNameAndRightLiteral"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLBinaryOpExpr::isNameAndLiteral, Integer.class, "isNameAndLiteral"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLBinaryOpExpr::isParenthesized, Integer.class, "isParenthesized"),
                getOid(x.getLeft()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLBinaryOpExpr::getOperator, String.class, "getOperator"),
                getOid(x.getRight())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLBinaryOpExprGroup x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlBinaryOpExprGroup(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLBinaryOpExprGroup::getOperator, String.class, "getOperator")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLBooleanExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlBooleanExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLBooleanExpr::getBooleanValue, Integer.class, "getBooleanValue"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLBooleanExpr::getValue, Integer.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLCaseExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCaseExpr(
                getOid(x),
                getOid(x.getElseExpr()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLCaseExpr::getItems, String.class, "getItems"),
                getOid(x.getValueExpr())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLCaseStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLCaseStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCaseStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLCaseStatement::getItems, String.class, "getItems"),
                getOid(x.getValueExpr())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLCastExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCastExpr(
                getOid(x),
                getOid(x.getDataType()),
                getOid(x.getExpr()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLCastExpr::isTry, Integer.class, "isTry")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLCharExpr x) {
        // SQLTextLiteralExpr is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlTextLiteralExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLCharExpr::getText, String.class, "getText")
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCharExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLCharExpr::getValue, String.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLContainsExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlContainsExpr(
                getOid(x),
                getOid(x.getExpr()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLContainsExpr::isNot, Integer.class, "isNot")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLCurrentOfCursorExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCurrentOfCursorExpr(
                getOid(x),
                getOid(x.getCursorName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLDateExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDateExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLDateExpr::getDate, String.class, "getDate"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLDateExpr::getLiteral, String.class, "getLiteral"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLDateExpr::getValue, String.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLDateTimeExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDateTimeExpr(
                getOid(x),
                getOid(x.getLiteral()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLDateTimeExpr::getValue, String.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLDbLinkExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDbLinkExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLDbLinkExpr::getDbLink, String.class, "getDbLink"),
                getOid(x.getExpr()),
                getOid(x.getResolvedColumn()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLDbLinkExpr::getSimpleName, String.class, "getSimpleName")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLDecimalExpr x) {
        // SQLNumericLiteralExpr is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlNumericLiteralExpr(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDecimalExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLDecimalExpr::getLiteral, String.class, "getLiteral"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLDecimalExpr::getNumber, String.class, "getNumber"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLDecimalExpr::getValue, String.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLDefaultExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDefaultExpr(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLDoubleExpr x) {
        // SQLNumericLiteralExpr is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlNumericLiteralExpr(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDoubleExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLDoubleExpr::getNumber, String.class, "getNumber"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLDoubleExpr::getValue, String.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLExistsExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExistsExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLExistsExpr::isNot, Integer.class, "isNot"),
                getOid(x.getSubQuery())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLExtractExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExtractExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLExtractExpr::getUnit, String.class, "getUnit"),
                getOid(x.getValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLFlashbackExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlFlashbackExpr(
                getOid(x),
                getOid(x.getExpr()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLFlashbackExpr::getType, String.class, "getType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLFloatExpr x) {
        // SQLNumericLiteralExpr is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlNumericLiteralExpr(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlFloatExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLFloatExpr::getNumber, String.class, "getNumber"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLFloatExpr::getValue, String.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLGroupingSetExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlGroupingSetExpr(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLHexExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlHexExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLHexExpr::getHex, String.class, "getHex"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLHexExpr::getValue, String.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLIdentifierExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlIdentifierExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLIdentifierExpr::getLowerName, String.class, "getLowerName"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLIdentifierExpr::getName, String.class, "getName"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLIdentifierExpr::getResolvedColumnObject, String.class, "getResolvedColumnObject"),
                getOid(x.getResolvedColumn()),
                getOid(x.getResolvedDeclareItem()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLIdentifierExpr::getResolvedOwnerObject, String.class, "getResolvedOwnerObject"),
                getOid(x.getResolvedParameter()),
                getOid(x.getResolvedSelectItem()),
                getOid(x.getResolvedTableSource()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLIdentifierExpr::getSimpleName, String.class, "getSimpleName")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLInListExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlInListExpr(
                getOid(x),
                getOid(x.getExpr()),
                getOid(x.getHint()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLInListExpr::isNot, Integer.class, "isNot")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLInSubQueryExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlInSubQueryExpr(
                getOid(x),
                getOid(x.getExpr()),
                getOid(x.getHint()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLInSubQueryExpr::isGlobal, Integer.class, "isGlobal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLInSubQueryExpr::isNot, Integer.class, "isNot"),
                getOid(x.getSubQuery())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLIntegerExpr x) {
        // SQLNumericLiteralExpr is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlNumericLiteralExpr(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlIntegerExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLIntegerExpr::getNumber, String.class, "getNumber"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLIntegerExpr::getType, String.class, "getType"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLIntegerExpr::getValue, String.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLIntervalExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlIntervalExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLIntervalExpr::getUnit, String.class, "getUnit"),
                getOid(x.getValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLJSONExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqljsonExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLJSONExpr::getLiteral, String.class, "getLiteral"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLJSONExpr::getValue, String.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLListExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlListExpr(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLMatchAgainstExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlMatchAgainstExpr(
                getOid(x),
                getOid(x.getAgainst()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLMatchAgainstExpr::getSearchModifier, String.class, "getSearchModifier")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLMethodInvokeExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlMethodInvokeExpr(
                getOid(x),
                getOid(x.getFor()),
                getOid(x.getFrom()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLMethodInvokeExpr::getMethodName, String.class, "getMethodName"),
                getOid(x.getOwner()),
                getOid(x.getResolvedReturnDataType()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLMethodInvokeExpr::getTrimOption, String.class, "getTrimOption"),
                getOid(x.getUsing())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLNCharExpr x) {
        // SQLTextLiteralExpr is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlTextLiteralExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLNCharExpr::getText, String.class, "getText")
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlnCharExpr(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLNotExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlNotExpr(
                getOid(x),
                getOid(x.getExpr())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLNullExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlNullExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLNullExpr::getValue, String.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLNumberExpr x) {
        // SQLNumericLiteralExpr is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlNumericLiteralExpr(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlNumberExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLNumberExpr::getLiteral, String.class, "getLiteral"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLNumberExpr::getNumber, String.class, "getNumber"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLNumberExpr::getValue, String.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLPropertyExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPropertyExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLPropertyExpr::getName, String.class, "getName"),
                getOid(x.getOwner()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLPropertyExpr::getOwnerName, String.class, "getOwnerName"),
                getOid(x.getResolvedColumn()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLPropertyExpr::getResolvedOwnerObject, String.class, "getResolvedOwnerObject"),
                getOid(x.getResolvedProcudure()),
                getOid(x.getResolvedTableSource()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLPropertyExpr::getSimpleName, String.class, "getSimpleName")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLQueryExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlQueryExpr(
                getOid(x),
                getOid(x.getSubQuery())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLRealExpr x) {
        // SQLNumericLiteralExpr is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlNumericLiteralExpr(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlRealExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLRealExpr::getNumber, String.class, "getNumber"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLRealExpr::getValue, String.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLSequenceExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSequenceExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLSequenceExpr::getFunction, String.class, "getFunction"),
                getOid(x.getSequence())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLSizeExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSizeExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLSizeExpr::getUnit, String.class, "getUnit"),
                getOid(x.getValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLSmallIntExpr x) {
        // SQLNumericLiteralExpr is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlNumericLiteralExpr(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSmallIntExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLSmallIntExpr::getNumber, String.class, "getNumber"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLSmallIntExpr::getValue, Integer.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLSomeExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSomeExpr(
                getOid(x),
                getOid(x.getSubQuery())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLTimeExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlTimeExpr(
                getOid(x),
                getOid(x.getLiteral()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLTimeExpr::getValue, String.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLTimestampExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlTimestampExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLTimestampExpr::isWithTimeZone, Integer.class, "isWithTimeZone"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLTimestampExpr::getLiteral, String.class, "getLiteral"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLTimestampExpr::getTimeZone, String.class, "getTimeZone"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLTimestampExpr::getValue, String.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLTinyIntExpr x) {
        // SQLNumericLiteralExpr is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlNumericLiteralExpr(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlTinyIntExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLTinyIntExpr::getNumber, String.class, "getNumber"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLTinyIntExpr::getValue, Integer.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLUnaryExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlUnaryExpr(
                getOid(x),
                getOid(x.getExpr()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLUnaryExpr::getOperator, String.class, "getOperator")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLValuesExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlValuesExpr(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.expr.SQLVariantRefExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlVariantRefExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLVariantRefExpr::getIndex, Integer.class, "getIndex"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLVariantRefExpr::isGlobal, Integer.class, "isGlobal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLVariantRefExpr::isSession, Integer.class, "isSession"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.expr.SQLVariantRefExpr::getName, String.class, "getName")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterCharacter x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterCharacter(
                getOid(x),
                getOid(x.getCharacterSet()),
                getOid(x.getCollate())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterDatabaseStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterDatabaseStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterDatabaseStatement(
                getOid(x),
                getOid(x.getCharacter()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterDatabaseStatement::isUpgradeDataDirectoryName, Integer.class, "isUpgradeDataDirectoryName"),
                getOid(x.getItem()),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterFunctionStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterFunctionStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterFunctionStatement(
                getOid(x),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterFunctionStatement::isContainsSql, Integer.class, "isContainsSql"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterFunctionStatement::isDebug, Integer.class, "isDebug"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterFunctionStatement::isLanguageSql, Integer.class, "isLanguageSql"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterFunctionStatement::isReuseSettings, Integer.class, "isReuseSettings"),
                getOid(x.getName()),
                getOid(x.getSqlSecurity())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterIndexStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterIndexStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterIndexStatement(
                getOid(x),
                getOid(x.getDbPartitionBy()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterIndexStatement::getEnable, Integer.class, "getEnable"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterIndexStatement::isCompile, Integer.class, "isCompile"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterIndexStatement::isUnusable, Integer.class, "isUnusable"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterIndexStatement::getMonitoringUsage, Integer.class, "getMonitoringUsage"),
                getOid(x.getName()),
                getOid(x.getParallel()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterIndexStatement::getRebuild, String.class, "getRebuild"),
                getOid(x.getRenameTo()),
                getOid(x.getTable())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterMaterializedViewStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterMaterializedViewStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterMaterializedViewStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterMaterializedViewStatement::getEnableQueryRewrite, Integer.class, "getEnableQueryRewrite"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterMaterializedViewStatement::isRebuild, Integer.class, "isRebuild"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterMaterializedViewStatement::isRefresh, Integer.class, "isRefresh"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterMaterializedViewStatement::isRefreshComplete, Integer.class, "isRefreshComplete"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterMaterializedViewStatement::isRefreshFast, Integer.class, "isRefreshFast"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterMaterializedViewStatement::isRefreshForce, Integer.class, "isRefreshForce"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterMaterializedViewStatement::isRefreshNext, Integer.class, "isRefreshNext"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterMaterializedViewStatement::isRefreshOnCommit, Integer.class, "isRefreshOnCommit"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterMaterializedViewStatement::isRefreshOnDemand, Integer.class, "isRefreshOnDemand"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterMaterializedViewStatement::isRefreshOnOverWrite, Integer.class, "isRefreshOnOverWrite"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterMaterializedViewStatement::isRefreshStartWith, Integer.class, "isRefreshStartWith"),
                getOid(x.getName()),
                getOid(x.getNext()),
                getOid(x.getStartWith())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterOutlineStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterOutlineStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterOutlineStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterOutlineStatement::isDisable, Integer.class, "isDisable"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterOutlineStatement::isEnable, Integer.class, "isEnable"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterOutlineStatement::isResync, Integer.class, "isResync"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterProcedureStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterProcedureStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterProcedureStatement(
                getOid(x),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterProcedureStatement::isCompile, Integer.class, "isCompile"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterProcedureStatement::isContainsSql, Integer.class, "isContainsSql"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterProcedureStatement::isLanguageSql, Integer.class, "isLanguageSql"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterProcedureStatement::isReuseSettings, Integer.class, "isReuseSettings"),
                getOid(x.getName()),
                getOid(x.getSqlSecurity())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterSequenceStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterSequenceStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterSequenceStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterSequenceStatement::getCache, Integer.class, "getCache"),
                getOid(x.getCacheValue()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterSequenceStatement::getCycle, Integer.class, "getCycle"),
                getOid(x.getIncrementBy()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterSequenceStatement::isChangeToGroup, Integer.class, "isChangeToGroup"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterSequenceStatement::isChangeToSimple, Integer.class, "isChangeToSimple"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterSequenceStatement::isChangeToTime, Integer.class, "isChangeToTime"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterSequenceStatement::isNoMaxValue, Integer.class, "isNoMaxValue"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterSequenceStatement::isNoMinValue, Integer.class, "isNoMinValue"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterSequenceStatement::isRestart, Integer.class, "isRestart"),
                getOid(x.getMaxValue()),
                getOid(x.getMinValue()),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterSequenceStatement::getOrder, Integer.class, "getOrder"),
                getOid(x.getRestartWith()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterSequenceStatement::getSchema, String.class, "getSchema"),
                getOid(x.getStartWith()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterSequenceStatement::getWithCache, Integer.class, "getWithCache")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterSystemGetConfigStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterSystemGetConfigStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterSystemGetConfigStatement(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterSystemSetConfigStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterSystemSetConfigStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterSystemSetConfigStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableAddClusteringKey x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableAddClusteringKey(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableAddColumn x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableAddColumn(
                getOid(x),
                getOid(x.getAfterColumn()),
                getOid(x.getFirstColumn()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAddColumn::isCascade, Integer.class, "isCascade"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAddColumn::isFirst, Integer.class, "isFirst"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAddColumn::isRestrict, Integer.class, "isRestrict"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAddColumn::getRestrict, Integer.class, "getRestrict")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableAddConstraint x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableAddConstraint(
                getOid(x),
                getOid(x.getConstraint()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAddConstraint::isWithNoCheck, Integer.class, "isWithNoCheck")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableAddExtPartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableAddExtPartition(
                getOid(x),
                getOid(x.getExtPartition())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableAddIndex x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableAddIndex(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAddIndex::getAlgorithm, String.class, "getAlgorithm"),
                getOid(x.getComment()),
                getOid(x.getDbPartitionBy()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAddIndex::getDistanceMeasure, String.class, "getDistanceMeasure"),
                getOid(x.getIndexDefinition()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAddIndex::isGlobal, Integer.class, "isGlobal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAddIndex::isHashMapType, Integer.class, "isHashMapType"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAddIndex::isKey, Integer.class, "isKey"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAddIndex::isUnique, Integer.class, "isUnique"),
                getOid(x.getKeyBlockSize()),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAddIndex::getParserName, String.class, "getParserName"),
                getOid(x.getTablePartitionBy()),
                getOid(x.getTablePartitions()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAddIndex::getType, String.class, "getType"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAddIndex::getUsing, String.class, "getUsing")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableAddPartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableAddPartition(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAddPartition::isIfNotExists, Integer.class, "isIfNotExists"),
                getOid(x.getLocation()),
                getOid(x.getPartitionCount())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableAddSupplemental x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableAddSupplemental(
                getOid(x),
                getOid(x.getElement())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableAlterColumn x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableAlterColumn(
                getOid(x),
                getOid(x.getAfter()),
                getOid(x.getColumn()),
                getOid(x.getDataType()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAlterColumn::isDropDefault, Integer.class, "isDropDefault"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAlterColumn::isDropNotNull, Integer.class, "isDropNotNull"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAlterColumn::isFirst, Integer.class, "isFirst"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAlterColumn::isSetNotNull, Integer.class, "isSetNotNull"),
                getOid(x.getOriginColumn()),
                getOid(x.getSetDefault())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableAlterIndex x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableAlterIndex(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAlterIndex::getAlgorithm, String.class, "getAlgorithm"),
                getOid(x.getComment()),
                getOid(x.getDbPartitionBy()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAlterIndex::getDistanceMeasure, String.class, "getDistanceMeasure"),
                getOid(x.getIndexDefinition()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAlterIndex::isGlobal, Integer.class, "isGlobal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAlterIndex::isHashMapType, Integer.class, "isHashMapType"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAlterIndex::isKey, Integer.class, "isKey"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAlterIndex::isUnique, Integer.class, "isUnique"),
                getOid(x.getKeyBlockSize()),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAlterIndex::getParserName, String.class, "getParserName"),
                getOid(x.getTablePartitionBy()),
                getOid(x.getTablePartitions()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAlterIndex::getType, String.class, "getType"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableAlterIndex::getUsing, String.class, "getUsing")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableAnalyzePartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableAnalyzePartition(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableArchivePartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableArchivePartition(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableBlockSize x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableBlockSize(
                getOid(x),
                getOid(x.getSize())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableChangeOwner x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableChangeOwner(
                getOid(x),
                getOid(x.getOwner())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableCheckPartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableCheckPartition(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableCoalescePartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableCoalescePartition(
                getOid(x),
                getOid(x.getCount())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableCompression x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableCompression(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableConvertCharSet x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableConvertCharSet(
                getOid(x),
                getOid(x.getCharset()),
                getOid(x.getCollate())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableDeleteByCondition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableDeleteByCondition(
                getOid(x),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableDisableConstraint x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableDisableConstraint(
                getOid(x),
                getOid(x.getConstraintName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableDisableKeys x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableDisableKeys(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableDisableLifecycle x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableDisableLifecycle(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableDiscardPartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableDiscardPartition(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableDiscardPartition::isTablespace, Integer.class, "isTablespace")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableDropClusteringKey x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableDropClusteringKey(
                getOid(x),
                getOid(x.getKeyName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableDropColumnItem x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableDropColumnItem(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableDropColumnItem::isCascade, Integer.class, "isCascade")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableDropConstraint x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableDropConstraint(
                getOid(x),
                getOid(x.getConstraintName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableDropConstraint::isCascade, Integer.class, "isCascade"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableDropConstraint::isRestrict, Integer.class, "isRestrict")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableDropExtPartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableDropExtPartition(
                getOid(x),
                getOid(x.getExtPartition())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableDropForeignKey x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableDropForeignKey(
                getOid(x),
                getOid(x.getIndexName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableDropIndex x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableDropIndex(
                getOid(x),
                getOid(x.getIndexName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableDropKey x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableDropKey(
                getOid(x),
                getOid(x.getKeyName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableDropPartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableDropPartition(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableDropPartition::isIfExists, Integer.class, "isIfExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableDropPartition::isPurge, Integer.class, "isPurge")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableDropPrimaryKey x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableDropPrimaryKey(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableDropSubpartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableDropSubpartition(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableEnableConstraint x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableEnableConstraint(
                getOid(x),
                getOid(x.getConstraintName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableEnableKeys x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableEnableKeys(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableEnableLifecycle x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableEnableLifecycle(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableExchangePartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableExchangePartition(
                getOid(x),
                getOid(x.getTable()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableExchangePartition::getValidation, Integer.class, "getValidation")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableGroupStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableGroupStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableGroupStatement(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableImportPartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableImportPartition(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableImportPartition::isTablespace, Integer.class, "isTablespace")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableMergePartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableMergePartition(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableMergePartition::isIfExists, Integer.class, "isIfExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableMergePartition::isPurge, Integer.class, "isPurge"),
                getOid(x.getOverwritePartition())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableModifyClusteredBy x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableModifyClusteredBy(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableOptimizePartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableOptimizePartition(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTablePartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTablePartition(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTablePartitionCount x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTablePartitionCount(
                getOid(x),
                getOid(x.getCount())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTablePartitionLifecycle x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTablePartitionLifecycle(
                getOid(x),
                getOid(x.getLifecycle())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTablePartitionSetProperties x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTablePartitionSetProperties(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableReOrganizePartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableReOrganizePartition(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableRebuildPartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableRebuildPartition(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableRecoverPartitions x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableRecoverPartitions(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableRename x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableRename(
                getOid(x),
                getOid(x.getToName()),
                getOid(x.getTo())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableRenameColumn x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableRenameColumn(
                getOid(x),
                getOid(x.getColumn()),
                getOid(x.getTo())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableRenameIndex x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableRenameIndex(
                getOid(x),
                getOid(x.getName()),
                getOid(x.getTo())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableRenamePartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableRenamePartition(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableRenamePartition::isIfNotExists, Integer.class, "isIfNotExists")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableRepairPartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableRepairPartition(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableReplaceColumn x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableReplaceColumn(
                getOid(x),
                getOid(x.getAfterColumn()),
                getOid(x.getFirstColumn()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableReplaceColumn::isFirst, Integer.class, "isFirst")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableSetComment x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableSetComment(
                getOid(x),
                getOid(x.getComment())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableSetLifecycle x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableSetLifecycle(
                getOid(x),
                getOid(x.getLifecycle())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableSetLocation x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableSetLocation(
                getOid(x),
                getOid(x.getLocation())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableSetOption x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableSetOption(
                getOid(x),
                getOid(x.getOn())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableStatement::getBuckets, Integer.class, "getBuckets"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableStatement::isIfExists, Integer.class, "isIfExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableStatement::isIgnore, Integer.class, "isIgnore"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableStatement::isInvalidateGlobalIndexes, Integer.class, "isInvalidateGlobalIndexes"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableStatement::isMergeSmallFiles, Integer.class, "isMergeSmallFiles"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableStatement::isNotClustered, Integer.class, "isNotClustered"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableStatement::isOffline, Integer.class, "isOffline"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableStatement::isOnline, Integer.class, "isOnline"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableStatement::isRange, Integer.class, "isRange"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableStatement::isRemovePatiting, Integer.class, "isRemovePatiting"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableStatement::isUpdateGlobalIndexes, Integer.class, "isUpdateGlobalIndexes"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableStatement::isUpgradePatiting, Integer.class, "isUpgradePatiting"),
                getOid(x.getName()),
                getOid(x.getPartition()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableStatement::getSchema, String.class, "getSchema"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableStatement::getShards, Integer.class, "getShards"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTableStatement::getTableName, String.class, "getTableName"),
                getOid(x.getTableSource())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableSubpartitionAvailablePartitionNum x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableSubpartitionAvailablePartitionNum(
                getOid(x),
                getOid(x.getNumber())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableSubpartitionLifecycle x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableSubpartitionLifecycle(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableTouch x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableTouch(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableTruncatePartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableTruncatePartition(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTableUnarchivePartition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTableUnarchivePartition(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterTypeStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTypeStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterTypeStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTypeStatement::isBody, Integer.class, "isBody"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTypeStatement::isCompile, Integer.class, "isCompile"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTypeStatement::isDebug, Integer.class, "isDebug"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterTypeStatement::isReuseSettings, Integer.class, "isReuseSettings"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterViewRenameStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterViewRenameStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterViewRenameStatement(
                getOid(x),
                getOid(x.getChangeOwnerTo()),
                getOid(x.getName()),
                getOid(x.getTo())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAlterViewStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterViewStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterViewStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterViewStatement::getAlgorithm, String.class, "getAlgorithm"),
                getOid(x.getComment()),
                getOid(x.getDefiner()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterViewStatement::isForce, Integer.class, "isForce"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterViewStatement::isIfNotExists, Integer.class, "isIfNotExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterViewStatement::isWithCascaded, Integer.class, "isWithCascaded"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterViewStatement::isWithCheckOption, Integer.class, "isWithCheckOption"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterViewStatement::isWithLocal, Integer.class, "isWithLocal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterViewStatement::isWithReadOnly, Integer.class, "isWithReadOnly"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterViewStatement::getSchema, String.class, "getSchema"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAlterViewStatement::getSqlSecurity, String.class, "getSqlSecurity"),
                getOid(x.getSubQuery()),
                getOid(x.getTableSource())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAnalyzeTableStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAnalyzeTableStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAnalyzeTableStatement(
                getOid(x),
                getOid(x.getAdbSchema()),
                getOid(x.getAdbWhere()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAnalyzeTableStatement::isCacheMetadata, Integer.class, "isCacheMetadata"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAnalyzeTableStatement::isComputeStatistics, Integer.class, "isComputeStatistics"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAnalyzeTableStatement::isForColums, Integer.class, "isForColums"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLAnalyzeTableStatement::isNoscan, Integer.class, "isNoscan"),
                getOid(x.getPartition()),
                getOid(x.getTable())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLArchiveTableStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLArchiveTableStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlArchiveTableStatement(
                getOid(x),
                getOid(x.getTable()),
                getOid(x.getType())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLAssignItem x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAssignItem(
                getOid(x),
                getOid(x.getTarget()),
                getOid(x.getValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLBackupStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLBackupStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlBackupStatement(
                getOid(x),
                getOid(x.getAction()),
                getOid(x.getType())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLBlockStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLBlockStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlBlockStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLBlockStatement::getEndLabel, String.class, "getEndLabel"),
                getOid(x.getException()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLBlockStatement::isEndOfCommit, Integer.class, "isEndOfCommit"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLBlockStatement::getLabelName, String.class, "getLabelName")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLBuildTableStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLBuildTableStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlBuildTableStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLBuildTableStatement::isForce, Integer.class, "isForce"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLBuildTableStatement::isWithSplit, Integer.class, "isWithSplit"),
                getOid(x.getTable()),
                getOid(x.getVersion())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCallStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCallStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCallStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCallStatement::isBrace, Integer.class, "isBrace"),
                getOid(x.getOutParameter()),
                getOid(x.getProcedureName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCancelJobStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCancelJobStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCancelJobStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCancelJobStatement::isImport, Integer.class, "isImport"),
                getOid(x.getJobName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCharacterDataType x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCharacterDataType(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCharacterDataType::getCharSetName, String.class, "getCharSetName"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCharacterDataType::getCharType, String.class, "getCharType"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCharacterDataType::getCollate, String.class, "getCollate"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCharacterDataType::isHasBinary, Integer.class, "isHasBinary"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCharacterDataType::getLength, Integer.class, "getLength")
        ));

        return this.visit((com.alibaba.druid.sql.ast.SQLDataTypeImpl) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCheck x) {
        // SQLConstraintImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlConstraintImpl(
                getOid(x),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCheck::getEnable, Integer.class, "getEnable"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCheck::getRely, Integer.class, "getRely"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCheck::getValidate, Integer.class, "getValidate")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCheck(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCheck::getEnforced, Integer.class, "getEnforced"),
                getOid(x.getExpr())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCloneTableStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCloneTableStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCloneTableStatement(
                getOid(x),
                getOid(x.getFrom()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCloneTableStatement::isIfExistsIgnore, Integer.class, "isIfExistsIgnore"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCloneTableStatement::isIfExistsOverwrite, Integer.class, "isIfExistsOverwrite"),
                getOid(x.getToName()),
                getOid(x.getTo())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCloseStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCloseStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCloseStatement(
                getOid(x),
                getOid(x.getCursorName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLColumnCheck x) {
        // SQLConstraintImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlConstraintImpl(
                getOid(x),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnCheck::getEnable, Integer.class, "getEnable"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnCheck::getRely, Integer.class, "getRely"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnCheck::getValidate, Integer.class, "getValidate")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlColumnCheck(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnCheck::getEnforced, Integer.class, "getEnforced"),
                getOid(x.getExpr())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLColumnDefinition x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlColumnDefinition(
                getOid(x),
                getOid(x.getAnnIndex()),
                getOid(x.getAsExpr()),
                getOid(x.getCharsetExpr()),
                getOid(x.getCollateExpr()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnDefinition::getColumnName, String.class, "getColumnName"),
                getOid(x.getComment()),
                getOid(x.getCompression()),
                getOid(x.getDataType()),
                getOid(x.getDefaultExpr()),
                getOid(x.getDelimiter()),
                getOid(x.getDelimiterTokenizer()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnDefinition::getEnable, Integer.class, "getEnable"),
                getOid(x.getEncode()),
                getOid(x.getFormat()),
                getOid(x.getGeneratedAlawsAs()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnDefinition::getIdentity, String.class, "getIdentity"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnDefinition::isAutoIncrement, Integer.class, "isAutoIncrement"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnDefinition::isDisableIndex, Integer.class, "isDisableIndex"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnDefinition::isOnlyPrimaryKey, Integer.class, "isOnlyPrimaryKey"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnDefinition::isPartitionBy, Integer.class, "isPartitionBy"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnDefinition::isPreSort, Integer.class, "isPreSort"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnDefinition::isPrimaryKey, Integer.class, "isPrimaryKey"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnDefinition::isStored, Integer.class, "isStored"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnDefinition::isVirtual, Integer.class, "isVirtual"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnDefinition::isVisible, Integer.class, "isVisible"),
                getOid(x.getJsonIndexAttrsExpr()),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnDefinition::getNameAsString, String.class, "getNameAsString"),
                getOid(x.getNlpTokenizer()),
                getOid(x.getNplTokenizer()),
                getOid(x.getOnUpdate()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnDefinition::getPreSortOrder, Integer.class, "getPreSortOrder"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnDefinition::getRely, Integer.class, "getRely"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnDefinition::getSequenceType, String.class, "getSequenceType"),
                getOid(x.getStep()),
                getOid(x.getStorage()),
                getOid(x.getUnitCount()),
                getOid(x.getUnitIndex()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnDefinition::getValidate, Integer.class, "getValidate"),
                getOid(x.getValueType())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLColumnPrimaryKey x) {
        // SQLConstraintImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlConstraintImpl(
                getOid(x),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnPrimaryKey::getEnable, Integer.class, "getEnable"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnPrimaryKey::getRely, Integer.class, "getRely"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnPrimaryKey::getValidate, Integer.class, "getValidate")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlColumnPrimaryKey(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLColumnReference x) {
        // SQLConstraintImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlConstraintImpl(
                getOid(x),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnReference::getEnable, Integer.class, "getEnable"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnReference::getRely, Integer.class, "getRely"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnReference::getValidate, Integer.class, "getValidate")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlColumnReference(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnReference::getOnDelete, String.class, "getOnDelete"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnReference::getOnUpdate, String.class, "getOnUpdate"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnReference::getReferenceMatch, String.class, "getReferenceMatch"),
                getOid(x.getTable())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLColumnUniqueKey x) {
        // SQLConstraintImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlConstraintImpl(
                getOid(x),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnUniqueKey::getEnable, Integer.class, "getEnable"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnUniqueKey::getRely, Integer.class, "getRely"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLColumnUniqueKey::getValidate, Integer.class, "getValidate")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlColumnUniqueKey(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCommentStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCommentStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCommentStatement(
                getOid(x),
                getOid(x.getComment()),
                getOid(x.getOn()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCommentStatement::getType, String.class, "getType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCommitStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCommitStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCommitStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCommitStatement::getChain, Integer.class, "getChain"),
                getOid(x.getDelayedDurability()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCommitStatement::getImmediate, Integer.class, "getImmediate"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCommitStatement::isWork, Integer.class, "isWork"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCommitStatement::isWrite, Integer.class, "isWrite"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCommitStatement::getRelease, Integer.class, "getRelease"),
                getOid(x.getTransactionName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCommitStatement::getWait, Integer.class, "getWait")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCopyFromStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCopyFromStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCopyFromStatement(
                getOid(x),
                getOid(x.getAccessKeyId()),
                getOid(x.getAccessKeySecret()),
                getOid(x.getFrom()),
                getOid(x.getTable())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCreateDatabaseStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateDatabaseStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCreateDatabaseStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateDatabaseStatement::getCharacterSet, String.class, "getCharacterSet"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateDatabaseStatement::getCollate, String.class, "getCollate"),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateDatabaseStatement::getDatabaseName, String.class, "getDatabaseName"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateDatabaseStatement::isIfNotExists, Integer.class, "isIfNotExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateDatabaseStatement::isPhysical, Integer.class, "isPhysical"),
                getOid(x.getLocation()),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateDatabaseStatement::getOptions, String.class, "getOptions"),
                getOid(x.getPassword()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateDatabaseStatement::getServer, String.class, "getServer"),
                getOid(x.getStoredAs()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateDatabaseStatement::getStoredBy, String.class, "getStoredBy"),
                getOid(x.getStoredIn()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateDatabaseStatement::getUser, String.class, "getUser")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCreateFunctionStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateFunctionStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCreateFunctionStatement(
                getOid(x),
                getOid(x.getAuthid()),
                getOid(x.getBlock()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateFunctionStatement::getComment, String.class, "getComment"),
                getOid(x.getDataType()),
                getOid(x.getDefiner()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateFunctionStatement::isAggregate, Integer.class, "isAggregate"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateFunctionStatement::isCreate, Integer.class, "isCreate"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateFunctionStatement::isDeterministic, Integer.class, "isDeterministic"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateFunctionStatement::isIfNotExists, Integer.class, "isIfNotExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateFunctionStatement::isOrReplace, Integer.class, "isOrReplace"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateFunctionStatement::isParallelEnable, Integer.class, "isParallelEnable"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateFunctionStatement::isPipelined, Integer.class, "isPipelined"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateFunctionStatement::isResultCache, Integer.class, "isResultCache"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateFunctionStatement::isTemporary, Integer.class, "isTemporary"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateFunctionStatement::getJavaCallSpec, String.class, "getJavaCallSpec"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateFunctionStatement::getLanguage, String.class, "getLanguage"),
                getOid(x.getName()),
                getOid(x.getReturnDataType()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateFunctionStatement::getSchema, String.class, "getSchema"),
                getOid(x.getUsing()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateFunctionStatement::getWrappedSource, String.class, "getWrappedSource")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCreateIndexStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateIndexStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCreateIndexStatement(
                getOid(x),
                getOid(x.getComment()),
                getOid(x.getDbPartitionBy()),
                getOid(x.getIn()),
                getOid(x.getIndexDefinition()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateIndexStatement::isConcurrently, Integer.class, "isConcurrently"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateIndexStatement::isDeferedRebuild, Integer.class, "isDeferedRebuild"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateIndexStatement::isGlobal, Integer.class, "isGlobal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateIndexStatement::isIfNotExists, Integer.class, "isIfNotExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateIndexStatement::isLocal, Integer.class, "isLocal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateIndexStatement::isStoring, Integer.class, "isStoring"),
                getOid(x.getName()),
                getOid(x.getRowFormat()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateIndexStatement::getSchema, String.class, "getSchema"),
                getOid(x.getStoredAs()),
                getOid(x.getTable()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateIndexStatement::getTableName, String.class, "getTableName"),
                getOid(x.getTablePartitionBy()),
                getOid(x.getTablePartitions()),
                getOid(x.getTablespace()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateIndexStatement::getType, String.class, "getType"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateIndexStatement::getUsing, String.class, "getUsing")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCreateMaterializedViewStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::getCache, Integer.class, "getCache"),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::getCompress, Integer.class, "getCompress"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::getCompressLevel, Integer.class, "getCompressLevel"),
                getOid(x.getDistributedByType()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::getEnableQueryRewrite, Integer.class, "getEnableQueryRewrite"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::getFreeLists, Integer.class, "getFreeLists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::getInitrans, Integer.class, "getInitrans"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::isBuildDeferred, Integer.class, "isBuildDeferred"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::isBuildImmediate, Integer.class, "isBuildImmediate"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::isCompressForOltp, Integer.class, "isCompressForOltp"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::isIfNotExists, Integer.class, "isIfNotExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::isRefresh, Integer.class, "isRefresh"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::isRefreshComplete, Integer.class, "isRefreshComplete"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::isRefreshFast, Integer.class, "isRefreshFast"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::isRefreshForce, Integer.class, "isRefreshForce"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::isRefreshNext, Integer.class, "isRefreshNext"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::isRefreshOnCommit, Integer.class, "isRefreshOnCommit"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::isRefreshOnDemand, Integer.class, "isRefreshOnDemand"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::isRefreshOnOverWrite, Integer.class, "isRefreshOnOverWrite"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::isRefreshStartWith, Integer.class, "isRefreshStartWith"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::isWithRowId, Integer.class, "isWithRowId"),
                getOid(x.getLifyCycle()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::getLogging, Integer.class, "getLogging"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::getMaxtrans, Integer.class, "getMaxtrans"),
                getOid(x.getName()),
                getOid(x.getNext()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::getParallel, Integer.class, "getParallel"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::getParallelValue, Integer.class, "getParallelValue"),
                getOid(x.getPartitionBy()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::getPctfree, Integer.class, "getPctfree"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::getPctincrease, Integer.class, "getPctincrease"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::getPctthreshold, Integer.class, "getPctthreshold"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::getPctused, Integer.class, "getPctused"),
                getOid(x.getQuery()),
                getOid(x.getStartWith()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateMaterializedViewStatement::getStorage, String.class, "getStorage"),
                getOid(x.getTablespace())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCreateOutlineStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateOutlineStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCreateOutlineStatement(
                getOid(x),
                getOid(x.getName()),
                getOid(x.getOn()),
                getOid(x.getTo()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCreateProcedureStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateProcedureStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCreateProcedureStatement(
                getOid(x),
                getOid(x.getAuthid()),
                getOid(x.getBlock()),
                getOid(x.getComment()),
                getOid(x.getDefiner()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateProcedureStatement::isContainsSql, Integer.class, "isContainsSql"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateProcedureStatement::isCreate, Integer.class, "isCreate"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateProcedureStatement::isDeterministic, Integer.class, "isDeterministic"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateProcedureStatement::isLanguageSql, Integer.class, "isLanguageSql"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateProcedureStatement::isModifiesSqlData, Integer.class, "isModifiesSqlData"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateProcedureStatement::isNoSql, Integer.class, "isNoSql"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateProcedureStatement::isOrReplace, Integer.class, "isOrReplace"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateProcedureStatement::isReadSqlData, Integer.class, "isReadSqlData"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateProcedureStatement::getJavaCallSpec, String.class, "getJavaCallSpec"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateProcedureStatement::getWrappedSource, String.class, "getWrappedSource")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCreateRoleStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateRoleStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCreateRoleStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateRoleStatement::isIfNotExists, Integer.class, "isIfNotExists"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCreateSequenceStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateSequenceStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCreateSequenceStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateSequenceStatement::getCache, Integer.class, "getCache"),
                getOid(x.getCacheValue()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateSequenceStatement::getCycle, Integer.class, "getCycle"),
                getOid(x.getIncrementBy()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateSequenceStatement::isGroup, Integer.class, "isGroup"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateSequenceStatement::isNoMaxValue, Integer.class, "isNoMaxValue"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateSequenceStatement::isNoMinValue, Integer.class, "isNoMinValue"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateSequenceStatement::isSimple, Integer.class, "isSimple"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateSequenceStatement::isTime, Integer.class, "isTime"),
                getOid(x.getMaxValue()),
                getOid(x.getMinValue()),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateSequenceStatement::getOrder, Integer.class, "getOrder"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateSequenceStatement::getSchema, String.class, "getSchema"),
                getOid(x.getStartWith()),
                getOid(x.getStep()),
                getOid(x.getUnitCount()),
                getOid(x.getUnitIndex()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateSequenceStatement::getWithCache, Integer.class, "getWithCache")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCreateTableGroupStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableGroupStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCreateTableGroupStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableGroupStatement::isIfNotExists, Integer.class, "isIfNotExists"),
                getOid(x.getName()),
                getOid(x.getPartitionNum()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableGroupStatement::getSchemaName, String.class, "getSchemaName"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableGroupStatement::getTableGroupName, String.class, "getTableGroupName")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCreateTableStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::getBodyBeforeCommentsDirect, String.class, "getBodyBeforeCommentsDirect"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::getBuckets, Integer.class, "getBuckets"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::getCatalog, String.class, "getCatalog"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::getClusteringType, String.class, "getClusteringType"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::getColumnComments, String.class, "getColumnComments"),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::getCompress, Integer.class, "getCompress"),
                getOid(x.getEngine()),
                getOid(x.getInherits()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::isDimension, Integer.class, "isDimension"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::isExternal, Integer.class, "isExternal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::isIfNotExists, Integer.class, "isIfNotExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::isIgnore, Integer.class, "isIgnore"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::isOnCommitPreserveRows, Integer.class, "isOnCommitPreserveRows"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::isReplace, Integer.class, "isReplace"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::isSingle, Integer.class, "isSingle"),
                getOid(x.getLike()),
                getOid(x.getLocalPartitioning()),
                getOid(x.getLocation()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::getLogging, Integer.class, "getLogging"),
                getOid(x.getName()),
                getOid(x.getPartitioning()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::getPrimaryKeyNames, String.class, "getPrimaryKeyNames"),
                getOid(x.getRowFormat()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::getSchema, String.class, "getSchema"),
                getOid(x.getSelect()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::getShards, Integer.class, "getShards"),
                getOid(x.getStoredAs()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::getTableName, String.class, "getTableName"),
                getOid(x.getTableSource()),
                getOid(x.getTablespace()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement::getType, String.class, "getType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCreateTriggerStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTriggerStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCreateTriggerStatement(
                getOid(x),
                getOid(x.getBody()),
                getOid(x.getDefiner()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTriggerStatement::isDelete, Integer.class, "isDelete"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTriggerStatement::isForEachRow, Integer.class, "isForEachRow"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTriggerStatement::isInsert, Integer.class, "isInsert"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTriggerStatement::isOrReplace, Integer.class, "isOrReplace"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTriggerStatement::isUpdate, Integer.class, "isUpdate"),
                getOid(x.getName()),
                getOid(x.getOn()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTriggerStatement::getTriggerEvents, String.class, "getTriggerEvents"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateTriggerStatement::getTriggerType, String.class, "getTriggerType"),
                getOid(x.getWhen())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCreateUserStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateUserStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCreateUserStatement(
                getOid(x),
                getOid(x.getPassword()),
                getOid(x.getUser())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLCreateViewStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateViewStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCreateViewStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateViewStatement::getAlgorithm, String.class, "getAlgorithm"),
                getOid(x.getComment()),
                getOid(x.getDefiner()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateViewStatement::isForce, Integer.class, "isForce"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateViewStatement::isIfNotExists, Integer.class, "isIfNotExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateViewStatement::isOnCluster, Integer.class, "isOnCluster"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateViewStatement::isOrReplace, Integer.class, "isOrReplace"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateViewStatement::isWithCascaded, Integer.class, "isWithCascaded"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateViewStatement::isWithCheckOption, Integer.class, "isWithCheckOption"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateViewStatement::isWithLocal, Integer.class, "isWithLocal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateViewStatement::isWithReadOnly, Integer.class, "isWithReadOnly"),
                getOid(x.getName()),
                getOid(x.getReturnsDataType()),
                getOid(x.getReturns()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateViewStatement::getSchema, String.class, "getSchema"),
                getOid(x.getScript()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLCreateViewStatement::getSqlSecurity, String.class, "getSqlSecurity"),
                getOid(x.getSubQuery()),
                getOid(x.getTableSource()),
                getOid(x.getTo())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDeclareStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDeclareStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDeclareStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDefault x) {
        // SQLConstraintImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlConstraintImpl(
                getOid(x),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDefault::getEnable, Integer.class, "getEnable"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDefault::getRely, Integer.class, "getRely"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDefault::getValidate, Integer.class, "getValidate")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDefault(
                getOid(x),
                getOid(x.getColumn()),
                getOid(x.getExpr()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDefault::isWithValues, Integer.class, "isWithValues")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDeleteStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDeleteStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDeleteStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDeleteStatement::getAlias, String.class, "getAlias"),
                getOid(x.getExprTableSource()),
                getOid(x.getFrom()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDeleteStatement::isOnly, Integer.class, "isOnly"),
                getOid(x.getTableName()),
                getOid(x.getTableSource()),
                getOid(x.getUsing()),
                getOid(x.getWhere()),
                getOid(x.getWith())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDescribeStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDescribeStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDescribeStatement(
                getOid(x),
                getOid(x.getColumn()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDescribeStatement::isExtended, Integer.class, "isExtended"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDescribeStatement::isFormatted, Integer.class, "isFormatted"),
                getOid(x.getObject()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDescribeStatement::getObjectType, String.class, "getObjectType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropCatalogStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropCatalogStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropCatalogStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropCatalogStatement::isExternal, Integer.class, "isExternal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropCatalogStatement::isIfExists, Integer.class, "isIfExists"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropDatabaseStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropDatabaseStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropDatabaseStatement(
                getOid(x),
                getOid(x.getDatabase()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropDatabaseStatement::getDatabaseName, String.class, "getDatabaseName"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropDatabaseStatement::isCascade, Integer.class, "isCascade"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropDatabaseStatement::isIfExists, Integer.class, "isIfExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropDatabaseStatement::isPhysical, Integer.class, "isPhysical"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropDatabaseStatement::isRestrict, Integer.class, "isRestrict"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropDatabaseStatement::getRestrict, Integer.class, "getRestrict"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropDatabaseStatement::getServer, String.class, "getServer")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropEventStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropEventStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropEventStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropEventStatement::isIfExists, Integer.class, "isIfExists"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropFunctionStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropFunctionStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropFunctionStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropFunctionStatement::isIfExists, Integer.class, "isIfExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropFunctionStatement::isTemporary, Integer.class, "isTemporary"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropIndexStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropIndexStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropIndexStatement(
                getOid(x),
                getOid(x.getAlgorithm()),
                getOid(x.getIndexName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropIndexStatement::isIfExists, Integer.class, "isIfExists"),
                getOid(x.getLockOption()),
                getOid(x.getTableName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropLogFileGroupStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropLogFileGroupStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropLogFileGroupStatement(
                getOid(x),
                getOid(x.getEngine()),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropMaterializedViewStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropMaterializedViewStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropMaterializedViewStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropMaterializedViewStatement::isIfExists, Integer.class, "isIfExists"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropOutlineStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropOutlineStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropOutlineStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropOutlineStatement::isIfExists, Integer.class, "isIfExists"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropProcedureStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropProcedureStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropProcedureStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropProcedureStatement::isIfExists, Integer.class, "isIfExists"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropResourceGroupStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropResourceGroupStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropResourceGroupStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropResourceGroupStatement::isIfExists, Integer.class, "isIfExists"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropResourceStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropResourceStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropResourceStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropResourceStatement::isIfExists, Integer.class, "isIfExists"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropRoleStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropRoleStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropRoleStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropRoleStatement::isIfNotExists, Integer.class, "isIfNotExists"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropSequenceStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropSequenceStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropSequenceStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropSequenceStatement::isIfExists, Integer.class, "isIfExists"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropSequenceStatement::getSchema, String.class, "getSchema")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropServerStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropServerStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropServerStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropServerStatement::isIfExists, Integer.class, "isIfExists"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropSynonymStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropSynonymStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropSynonymStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropSynonymStatement::isForce, Integer.class, "isForce"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropSynonymStatement::isIfExists, Integer.class, "isIfExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropSynonymStatement::isPublic, Integer.class, "isPublic"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropSynonymStatement::getSchema, String.class, "getSchema")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropTableGroupStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropTableGroupStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropTableGroupStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropTableGroupStatement::isIfExists, Integer.class, "isIfExists"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropTableGroupStatement::getTableGroupName, String.class, "getTableGroupName")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropTableSpaceStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropTableSpaceStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropTableSpaceStatement(
                getOid(x),
                getOid(x.getEngine()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropTableSpaceStatement::isIfExists, Integer.class, "isIfExists"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropTableSpaceStatement::getTableSpaceName, String.class, "getTableSpaceName")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropTableStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropTableStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropTableStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropTableStatement::isCascade, Integer.class, "isCascade"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropTableStatement::isDropPartition, Integer.class, "isDropPartition"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropTableStatement::isExternal, Integer.class, "isExternal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropTableStatement::isIfExists, Integer.class, "isIfExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropTableStatement::isPurge, Integer.class, "isPurge"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropTableStatement::isRestrict, Integer.class, "isRestrict"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropTableStatement::isTemporary, Integer.class, "isTemporary"),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropTriggerStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropTriggerStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropTriggerStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropTriggerStatement::isIfExists, Integer.class, "isIfExists"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropTypeStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropTypeStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropTypeStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropTypeStatement::isIfExists, Integer.class, "isIfExists"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropUserStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropUserStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropUserStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropUserStatement::isIfExists, Integer.class, "isIfExists")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDropViewStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropViewStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDropViewStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropViewStatement::isCascade, Integer.class, "isCascade"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropViewStatement::isIfExists, Integer.class, "isIfExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDropViewStatement::isRestrict, Integer.class, "isRestrict")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLDumpStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDumpStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlDumpStatement(
                getOid(x),
                getOid(x.getInto()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLDumpStatement::isOverwrite, Integer.class, "isOverwrite"),
                getOid(x.getSelect())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLErrorLoggingClause x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlErrorLoggingClause(
                getOid(x),
                getOid(x.getInto()),
                getOid(x.getLimit()),
                getOid(x.getSimpleExpression())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLExplainAnalyzeStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExplainAnalyzeStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExplainAnalyzeStatement(
                getOid(x),
                getOid(x.getSelect())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLExplainStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExplainStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExplainStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExplainStatement::getFormat, String.class, "getFormat"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExplainStatement::isAuthorization, Integer.class, "isAuthorization"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExplainStatement::isDependency, Integer.class, "isDependency"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExplainStatement::isExtended, Integer.class, "isExtended"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExplainStatement::isOptimizer, Integer.class, "isOptimizer"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExplainStatement::isParenthesis, Integer.class, "isParenthesis"),
                getOid(x.getStatement()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExplainStatement::getType, String.class, "getType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLExportDatabaseStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExportDatabaseStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExportDatabaseStatement(
                getOid(x),
                getOid(x.getDb()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExportDatabaseStatement::isRealtime, Integer.class, "isRealtime")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLExportTableStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExportTableStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExportTableStatement(
                getOid(x),
                getOid(x.getForReplication()),
                getOid(x.getTable()),
                getOid(x.getTo())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLExprHint x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprHint(
                getOid(x),
                getOid(x.getExpr())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLExprStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExprStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprStatement(
                getOid(x),
                getOid(x.getExpr())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLExprTableSource x) {
        // SQLTableSourceImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlTableSourceImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExprTableSource::getAlias, String.class, "getAlias"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExprTableSource::getAlias2, String.class, "getAlias2"),
                getOid(x.getFlashback()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExprTableSource::getHintsSize, Integer.class, "getHintsSize")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprTableSource(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExprTableSource::getCatalog, String.class, "getCatalog"),
                getOid(x.getExpr()),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExprTableSource::getPartitionSize, Integer.class, "getPartitionSize"),
                getOid(x.getSampling()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExprTableSource::getSchema, String.class, "getSchema"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExprTableSource::getSchemaObject, String.class, "getSchemaObject"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExprTableSource::getTableName, String.class, "getTableName")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLExternalRecordFormat x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExternalRecordFormat(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExternalRecordFormat::getBadfile, Integer.class, "getBadfile"),
                getOid(x.getCollectionItemsTerminatedBy()),
                getOid(x.getDelimitedBy()),
                getOid(x.getEscapedBy()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExternalRecordFormat::isLtrim, Integer.class, "isLtrim"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExternalRecordFormat::isMissingFieldValuesAreNull, Integer.class, "isMissingFieldValuesAreNull"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExternalRecordFormat::isRejectRowsWithAllNullFields, Integer.class, "isRejectRowsWithAllNullFields"),
                getOid(x.getLinesTerminatedBy()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLExternalRecordFormat::getLogfile, Integer.class, "getLogfile"),
                getOid(x.getMapKeysTerminatedBy()),
                getOid(x.getNullDefinedAs()),
                getOid(x.getSerde()),
                getOid(x.getTerminatedBy())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLFetchStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLFetchStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlFetchStatement(
                getOid(x),
                getOid(x.getCursorName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLFetchStatement::isBulkCollect, Integer.class, "isBulkCollect"),
                getOid(x.getLimit())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLForStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLForStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlForStatement(
                getOid(x),
                getOid(x.getIndex()),
                getOid(x.getRange())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLForeignKeyImpl x) {
        // SQLConstraintImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlConstraintImpl(
                getOid(x),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLForeignKeyImpl::getEnable, Integer.class, "getEnable"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLForeignKeyImpl::getRely, Integer.class, "getRely"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLForeignKeyImpl::getValidate, Integer.class, "getValidate")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlForeignKeyImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLForeignKeyImpl::isDisableNovalidate, Integer.class, "isDisableNovalidate"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLForeignKeyImpl::isOnDeleteCascade, Integer.class, "isOnDeleteCascade"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLForeignKeyImpl::isOnDeleteSetNull, Integer.class, "isOnDeleteSetNull"),
                getOid(x.getReferencedTableName()),
                getOid(x.getReferencedTable())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLGrantStatement x) {
        // SQLPrivilegeStatement is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPrivilegeStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLGrantStatement::getResource, String.class, "getResource"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLGrantStatement::getResourceType, String.class, "getResourceType")
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLGrantStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlGrantStatement(
                getOid(x),
                getOid(x.getIdentifiedBy()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLGrantStatement::getIdentifiedByPassword, String.class, "getIdentifiedByPassword"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLGrantStatement::isAdminOption, Integer.class, "isAdminOption"),
                getOid(x.getMaxConnectionsPerHour()),
                getOid(x.getMaxQueriesPerHour()),
                getOid(x.getMaxUpdatesPerHour()),
                getOid(x.getMaxUserConnections()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLGrantStatement::getResourceType, String.class, "getResourceType"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLGrantStatement::getWithGrantOption, Integer.class, "getWithGrantOption")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLIfStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLIfStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlIfStatement(
                getOid(x),
                getOid(x.getCondition()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLIfStatement::getElseIfList, String.class, "getElseIfList"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLIfStatement::getElseItem, String.class, "getElseItem")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLImportDatabaseStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLImportDatabaseStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlImportDatabaseStatement(
                getOid(x),
                getOid(x.getDb()),
                getOid(x.getStatus())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLImportTableStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLImportTableStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlImportTableStatement(
                getOid(x),
                getOid(x.getFrom()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLImportTableStatement::isExtenal, Integer.class, "isExtenal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLImportTableStatement::isUsingBuild, Integer.class, "isUsingBuild"),
                getOid(x.getLocation()),
                getOid(x.getTable()),
                getOid(x.getVersion())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLInsertStatement x) {
        // SQLInsertInto is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlInsertInto(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLInsertStatement::getAlias, String.class, "getAlias"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLInsertStatement::getColumnsString, String.class, "getColumnsString"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLInsertStatement::getColumnsStringHash, String.class, "getColumnsStringHash"),
                getOid(x.getHint()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLInsertStatement::getInsertBeforeCommentsDirect, String.class, "getInsertBeforeCommentsDirect"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLInsertStatement::isOverwrite, Integer.class, "isOverwrite"),
                getOid(x.getQuery()),
                getOid(x.getTableName()),
                getOid(x.getTableSource()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLInsertStatement::getValues, String.class, "getValues"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLInsertStatement::getValuesList, String.class, "getValuesList")
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLInsertStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlInsertStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLInsertStatement::isAfterSemi, Integer.class, "isAfterSemi"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLInsertStatement::isUpsert, Integer.class, "isUpsert"),
                getOid(x.getWith())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLJoinTableSource x) {
        // SQLTableSourceImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlTableSourceImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLJoinTableSource::getAlias, String.class, "getAlias"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLJoinTableSource::getAlias2, String.class, "getAlias2"),
                getOid(x.getFlashback()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLJoinTableSource::getHintsSize, Integer.class, "getHintsSize")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlJoinTableSource(
                getOid(x),
                getOid(x.getCondition()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLJoinTableSource::isAsof, Integer.class, "isAsof"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLJoinTableSource::isGlobal, Integer.class, "isGlobal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLJoinTableSource::isNatural, Integer.class, "isNatural"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLJoinTableSource::getJoinType, String.class, "getJoinType"),
                getOid(x.getLeft()),
                getOid(x.getRight()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLJoinTableSource::getUdj, String.class, "getUdj")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLLateralViewTableSource x) {
        // SQLTableSourceImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlTableSourceImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLLateralViewTableSource::getAlias, String.class, "getAlias"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLLateralViewTableSource::getAlias2, String.class, "getAlias2"),
                getOid(x.getFlashback()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLLateralViewTableSource::getHintsSize, Integer.class, "getHintsSize")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlLateralViewTableSource(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLLateralViewTableSource::isOuter, Integer.class, "isOuter"),
                getOid(x.getMethod()),
                getOid(x.getOn()),
                getOid(x.getTableSource())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLLoopStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLLoopStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlLoopStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLLoopStatement::getLabelName, String.class, "getLabelName")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLMergeStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLMergeStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlMergeStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLMergeStatement::getAlias, String.class, "getAlias"),
                getOid(x.getErrorLoggingClause()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLMergeStatement::getInsertClause, String.class, "getInsertClause"),
                getOid(x.getInto()),
                getOid(x.getOn()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLMergeStatement::getUpdateClause, String.class, "getUpdateClause"),
                getOid(x.getUsing())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLNotNullConstraint x) {
        // SQLConstraintImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlConstraintImpl(
                getOid(x),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLNotNullConstraint::getEnable, Integer.class, "getEnable"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLNotNullConstraint::getRely, Integer.class, "getRely"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLNotNullConstraint::getValidate, Integer.class, "getValidate")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlNotNullConstraint(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLNullConstraint x) {
        // SQLConstraintImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlConstraintImpl(
                getOid(x),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLNullConstraint::getEnable, Integer.class, "getEnable"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLNullConstraint::getRely, Integer.class, "getRely"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLNullConstraint::getValidate, Integer.class, "getValidate")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlNullConstraint(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLOpenStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLOpenStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlOpenStatement(
                getOid(x),
                getOid(x.getCursorName()),
                getOid(x.getFor())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLOptimizeStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLOptimizeStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlOptimizeStatement(
                getOid(x),
                getOid(x.getCluster()),
                getOid(x.getDeduplicateBy()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLOptimizeStatement::isDeduplicate, Integer.class, "isDeduplicate"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLOptimizeStatement::isFinal, Integer.class, "isFinal")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLPartitionRef x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPartitionRef(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLPartitionRef::getItems, String.class, "getItems")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLPrimaryKeyImpl x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPrimaryKeyImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLPrimaryKeyImpl::isClustered, Integer.class, "isClustered"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLPrimaryKeyImpl::isDisableNovalidate, Integer.class, "isDisableNovalidate")
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLUnique) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLPrivilegeItem x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPrivilegeItem(
                getOid(x),
                getOid(x.getAction())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLPurgeLogsStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLPurgeLogsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPurgeLogsStatement(
                getOid(x),
                getOid(x.getBefore()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLPurgeLogsStatement::isAll, Integer.class, "isAll"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLPurgeLogsStatement::isBinary, Integer.class, "isBinary"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLPurgeLogsStatement::isMaster, Integer.class, "isMaster"),
                getOid(x.getTo())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLPurgeRecyclebinStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLPurgeRecyclebinStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPurgeRecyclebinStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLPurgeTableStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLPurgeTableStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPurgeTableStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLPurgeTableStatement::getCount, Integer.class, "getCount"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLPurgeTableStatement::isAll, Integer.class, "isAll"),
                getOid(x.getTable())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLPurgeTemporaryOutputStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLPurgeTemporaryOutputStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPurgeTemporaryOutputStatement(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLRefreshMaterializedViewStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLRefreshMaterializedViewStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlRefreshMaterializedViewStatement(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLReleaseSavePointStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLReleaseSavePointStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlReleaseSavePointStatement(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLRenameUserStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLRenameUserStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlRenameUserStatement(
                getOid(x),
                getOid(x.getName()),
                getOid(x.getTo())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLReplaceStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLReplaceStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlReplaceStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLReplaceStatement::getHintsSize, Integer.class, "getHintsSize"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLReplaceStatement::isDelayed, Integer.class, "isDelayed"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLReplaceStatement::isLowPriority, Integer.class, "isLowPriority"),
                getOid(x.getQuery()),
                getOid(x.getTableName()),
                getOid(x.getTableSource()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLReplaceStatement::getValuesList, String.class, "getValuesList")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLRestoreStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLRestoreStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlRestoreStatement(
                getOid(x),
                getOid(x.getType())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLReturnStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLReturnStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlReturnStatement(
                getOid(x),
                getOid(x.getExpr())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLRevokeStatement x) {
        // SQLPrivilegeStatement is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPrivilegeStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLRevokeStatement::getResource, String.class, "getResource"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLRevokeStatement::getResourceType, String.class, "getResourceType")
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLRevokeStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlRevokeStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLRevokeStatement::isGrantOption, Integer.class, "isGrantOption")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLRollbackStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLRollbackStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlRollbackStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLRollbackStatement::getChain, Integer.class, "getChain"),
                getOid(x.getForce()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLRollbackStatement::getRelease, Integer.class, "getRelease"),
                getOid(x.getTo())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLSavePointStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSavePointStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSavePointStatement(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLScriptCommitStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLScriptCommitStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlScriptCommitStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLSelect x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSelect(
                getOid(x),
                getOid(x.getFirstQueryBlock()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelect::getForXmlOptions, String.class, "getForXmlOptions"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelect::getForXmlOptionsSize, Integer.class, "getForXmlOptionsSize"),
                getOid(x.getHeadHint()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelect::getHintsSize, Integer.class, "getHintsSize"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelect::isForBrowse, Integer.class, "isForBrowse"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelect::isSimple, Integer.class, "isSimple"),
                getOid(x.getLimit()),
                getOid(x.getOffset()),
                getOid(x.getOrderBy()),
                getOid(x.getQuery()),
                getOid(x.getQueryBlock()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelect::getRestriction, String.class, "getRestriction"),
                getOid(x.getRowCount()),
                getOid(x.getWithSubQuery()),
                getOid(x.getXmlPath())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLSelectGroupByClause x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSelectGroupByClause(
                getOid(x),
                getOid(x.getHaving()),
                getOid(x.getHint()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectGroupByClause::isDistinct, Integer.class, "isDistinct"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectGroupByClause::isParen, Integer.class, "isParen"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectGroupByClause::isWithCube, Integer.class, "isWithCube"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectGroupByClause::isWithRollUp, Integer.class, "isWithRollUp")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLSelectItem x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSelectItem(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectItem::getAlias, String.class, "getAlias"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectItem::getAlias2, String.class, "getAlias2"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectItem::getAliasList, String.class, "getAliasList"),
                getOid(x.getExpr()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectItem::isConnectByRoot, Integer.class, "isConnectByRoot"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectItem::isUDTFSelectItem, Integer.class, "isUDTFSelectItem")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLSelectOrderByItem x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSelectOrderByItem(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectOrderByItem::getCollate, String.class, "getCollate"),
                getOid(x.getExpr()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectOrderByItem::isClusterBy, Integer.class, "isClusterBy"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectOrderByItem::isDistributeBy, Integer.class, "isDistributeBy"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectOrderByItem::isSortBy, Integer.class, "isSortBy"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectOrderByItem::getNullsOrderType, String.class, "getNullsOrderType"),
                getOid(x.getResolvedSelectItem()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectOrderByItem::getType, String.class, "getType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock x) {
        // SQLSelectQueryBase is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSelectQueryBase(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock::isParenthesized, Integer.class, "isParenthesized")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSelectQueryBlock(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock::getCachedSelectList, String.class, "getCachedSelectList"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock::getCachedSelectListHash, String.class, "getCachedSelectListHash"),
                getOid(x.getConnectBy()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock::getDistionOption, Integer.class, "getDistionOption"),
                getOid(x.getFirst()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock::getForUpdateOfSize, Integer.class, "getForUpdateOfSize"),
                getOid(x.getFrom()),
                getOid(x.getGroupBy()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock::getHintsSize, Integer.class, "getHintsSize"),
                getOid(x.getInto()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock::isDistinct, Integer.class, "isDistinct"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock::isForShare, Integer.class, "isForShare"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock::isForUpdate, Integer.class, "isForUpdate"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock::isNoCycle, Integer.class, "isNoCycle"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock::isNoWait, Integer.class, "isNoWait"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock::isPrior, Integer.class, "isPrior"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock::isSkipLocked, Integer.class, "isSkipLocked"),
                getOid(x.getLimit()),
                getOid(x.getOffset()),
                getOid(x.getOrderBy()),
                getOid(x.getOrderBySiblings()),
                getOid(x.getStartWith()),
                getOid(x.getWaitTime()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLSelectStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSelectStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSelectStatement(
                getOid(x),
                getOid(x.getSelect())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLSetStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSetStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSetStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSetStatement::getOption, String.class, "getOption")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowACLStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowACLStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowAclStatement(
                getOid(x),
                getOid(x.getTable())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowCatalogsStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowCatalogsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowCatalogsStatement(
                getOid(x),
                getOid(x.getLike())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowColumnsStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowColumnsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowColumnsStatement(
                getOid(x),
                getOid(x.getDatabase()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowColumnsStatement::isFull, Integer.class, "isFull"),
                getOid(x.getLike()),
                getOid(x.getTable()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowCreateMaterializedViewStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowCreateMaterializedViewStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowCreateMaterializedViewStatement(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowCreateTableStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowCreateTableStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowCreateTableStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowCreateTableStatement::isAll, Integer.class, "isAll"),
                getOid(x.getLikeMapping()),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowCreateViewStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowCreateViewStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowCreateViewStatement(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowDatabasesStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowDatabasesStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowDatabasesStatement(
                getOid(x),
                getOid(x.getDatabase()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowDatabasesStatement::isExtra, Integer.class, "isExtra"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowDatabasesStatement::isFull, Integer.class, "isFull"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowDatabasesStatement::isPhysical, Integer.class, "isPhysical"),
                getOid(x.getLike()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowErrorsStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowErrorsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowErrorsStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowFunctionsStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowFunctionsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowFunctionsStatement(
                getOid(x),
                getOid(x.getLike())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowGrantsStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowGrantsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowGrantsStatement(
                getOid(x),
                getOid(x.getOn()),
                getOid(x.getUser())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowHistoryStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowHistoryStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowHistoryStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowHistoryStatement::isTables, Integer.class, "isTables"),
                getOid(x.getTable())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowIndexesStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowIndexesStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowIndexesStatement(
                getOid(x),
                getOid(x.getDatabase()),
                getOid(x.getTable()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowIndexesStatement::getType, String.class, "getType"),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowMaterializedViewStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowMaterializedViewStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowMaterializedViewStatement(
                getOid(x),
                getOid(x.getLike()),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowOutlinesStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowOutlinesStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowOutlinesStatement(
                getOid(x),
                getOid(x.getLimit()),
                getOid(x.getOrderBy()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowPackagesStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowPackagesStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowPackagesStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowPartitionsStmt x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowPartitionsStmt::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowPartitionsStmt(
                getOid(x),
                getOid(x.getTableSource()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowProcessListStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowProcessListStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowProcessListStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowProcessListStatement::isFull, Integer.class, "isFull"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowProcessListStatement::isMpp, Integer.class, "isMpp"),
                getOid(x.getLimit()),
                getOid(x.getOrderBy()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowQueryTaskStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowQueryTaskStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowQueryTaskStatement(
                getOid(x),
                getOid(x.getFor()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowQueryTaskStatement::isFull, Integer.class, "isFull"),
                getOid(x.getLimit()),
                getOid(x.getOrderBy()),
                getOid(x.getUser()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowRecylebinStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowRecylebinStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowRecylebinStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowRoleStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowRoleStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowRoleStatement(
                getOid(x),
                getOid(x.getGrant())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowRolesStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowRolesStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowRolesStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowSessionStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowSessionStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowSessionStatement(
                getOid(x),
                getOid(x.getLike())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowStatisticListStmt x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowStatisticListStmt::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowStatisticListStmt(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowStatisticListStmt::isFull, Integer.class, "isFull"),
                getOid(x.getTableSource())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowStatisticStmt x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowStatisticStmt::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowStatisticStmt(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowStatisticStmt::isFull, Integer.class, "isFull"),
                getOid(x.getTableSource())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowTableGroupsStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowTableGroupsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowTableGroupsStatement(
                getOid(x),
                getOid(x.getDatabase())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowTablesStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowTablesStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowTablesStatement(
                getOid(x),
                getOid(x.getDatabase()),
                getOid(x.getFrom()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowTablesStatement::isExtended, Integer.class, "isExtended"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowTablesStatement::isFull, Integer.class, "isFull"),
                getOid(x.getLike()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowUsersStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowUsersStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowUsersStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowVariantsStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowVariantsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowVariantsStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowVariantsStatement::isGlobal, Integer.class, "isGlobal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowVariantsStatement::isSession, Integer.class, "isSession"),
                getOid(x.getLike()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLShowViewsStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLShowViewsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlShowViewsStatement(
                getOid(x),
                getOid(x.getDatabase()),
                getOid(x.getLike())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLStartTransactionStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLStartTransactionStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStartTransactionStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLStartTransactionStatement::isBegin, Integer.class, "isBegin"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLStartTransactionStatement::isConsistentSnapshot, Integer.class, "isConsistentSnapshot"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLStartTransactionStatement::isReadOnly, Integer.class, "isReadOnly"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLStartTransactionStatement::isWork, Integer.class, "isWork"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLStartTransactionStatement::getIsolationLevel, String.class, "getIsolationLevel"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLSubmitJobStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSubmitJobStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSubmitJobStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSubmitJobStatement::isAwait, Integer.class, "isAwait"),
                getOid(x.getStatment())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLSubqueryTableSource x) {
        // SQLTableSourceImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlTableSourceImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSubqueryTableSource::getAlias, String.class, "getAlias"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSubqueryTableSource::getAlias2, String.class, "getAlias2"),
                getOid(x.getFlashback()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSubqueryTableSource::getHintsSize, Integer.class, "getHintsSize")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSubqueryTableSource(
                getOid(x),
                getOid(x.getSelect())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLSyncMetaStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSyncMetaStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSyncMetaStatement(
                getOid(x),
                getOid(x.getFrom()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSyncMetaStatement::getIgnore, Integer.class, "getIgnore"),
                getOid(x.getLike()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLSyncMetaStatement::getRestrict, Integer.class, "getRestrict")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLTableLike x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlTableLike(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLTableLike::isExcludeProperties, Integer.class, "isExcludeProperties"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLTableLike::isIncludeProperties, Integer.class, "isIncludeProperties"),
                getOid(x.getTable())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLTableSampling x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlTableSampling(
                getOid(x),
                getOid(x.getBucket()),
                getOid(x.getByteLength()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLTableSampling::isBernoulli, Integer.class, "isBernoulli"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLTableSampling::isSystem, Integer.class, "isSystem"),
                getOid(x.getOn()),
                getOid(x.getOutOf()),
                getOid(x.getPercent()),
                getOid(x.getRows())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLTruncateStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLTruncateStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlTruncateStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLTruncateStatement::getCascade, Integer.class, "getCascade"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLTruncateStatement::isContinueIdentity, Integer.class, "isContinueIdentity"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLTruncateStatement::isDropStorage, Integer.class, "isDropStorage"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLTruncateStatement::isIfExists, Integer.class, "isIfExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLTruncateStatement::isIgnoreDeleteTriggers, Integer.class, "isIgnoreDeleteTriggers"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLTruncateStatement::isImmediate, Integer.class, "isImmediate"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLTruncateStatement::isOnly, Integer.class, "isOnly"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLTruncateStatement::isPartitionAll, Integer.class, "isPartitionAll"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLTruncateStatement::isPurgeSnapshotLog, Integer.class, "isPurgeSnapshotLog"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLTruncateStatement::isRestrictWhenDeleteTriggers, Integer.class, "isRestrictWhenDeleteTriggers"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLTruncateStatement::isReuseStorage, Integer.class, "isReuseStorage"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLTruncateStatement::getRestartIdentity, Integer.class, "getRestartIdentity")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLUnionQuery x) {
        // SQLSelectQueryBase is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSelectQueryBase(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLUnionQuery::isParenthesized, Integer.class, "isParenthesized")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlUnionQuery(
                getOid(x),
                getOid(x.getFirstQueryBlock()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLUnionQuery::isEmpty, Integer.class, "isEmpty"),
                getOid(x.getLeft()),
                getOid(x.getLimit()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLUnionQuery::getOperator, String.class, "getOperator"),
                getOid(x.getOrderBy()),
                getOid(x.getRight())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLUnionQueryTableSource x) {
        // SQLTableSourceImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlTableSourceImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLUnionQueryTableSource::getAlias, String.class, "getAlias"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLUnionQueryTableSource::getAlias2, String.class, "getAlias2"),
                getOid(x.getFlashback()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLUnionQueryTableSource::getHintsSize, Integer.class, "getHintsSize")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlUnionQueryTableSource(
                getOid(x),
                getOid(x.getUnion())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLUnique x) {
        // SQLConstraintImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlConstraintImpl(
                getOid(x),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLUnique::getEnable, Integer.class, "getEnable"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLUnique::getRely, Integer.class, "getRely"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLUnique::getValidate, Integer.class, "getValidate")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlUnique(
                getOid(x),
                getOid(x.getComment()),
                getOid(x.getIndexDefinition()),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLUnnestTableSource x) {
        // SQLTableSourceImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlTableSourceImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLUnnestTableSource::getAlias, String.class, "getAlias"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLUnnestTableSource::getAlias2, String.class, "getAlias2"),
                getOid(x.getFlashback()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLUnnestTableSource::getHintsSize, Integer.class, "getHintsSize")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlUnnestTableSource(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLUnnestTableSource::isOrdinality, Integer.class, "isOrdinality")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLUpdateSetItem x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlUpdateSetItem(
                getOid(x),
                getOid(x.getColumn()),
                getOid(x.getValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLUpdateStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLUpdateStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlUpdateStatement(
                getOid(x),
                getOid(x.getFrom()),
                getOid(x.getOrderBy()),
                getOid(x.getTableName()),
                getOid(x.getTableSource()),
                getOid(x.getWhere()),
                getOid(x.getWith())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLUseStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLUseStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlUseStatement(
                getOid(x),
                getOid(x.getDatabase())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLValuesQuery x) {
        // SQLSelectQueryBase is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSelectQueryBase(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLValuesQuery::isParenthesized, Integer.class, "isParenthesized")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlValuesQuery(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLValuesTableSource x) {
        // SQLTableSourceImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlTableSourceImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLValuesTableSource::getAlias, String.class, "getAlias"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLValuesTableSource::getAlias2, String.class, "getAlias2"),
                getOid(x.getFlashback()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLValuesTableSource::getHintsSize, Integer.class, "getHintsSize")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlValuesTableSource(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLValuesTableSource::isParenthesized, Integer.class, "isParenthesized")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLWhileStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLWhileStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlWhileStatement(
                getOid(x),
                getOid(x.getCondition()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLWhileStatement::getLabelName, String.class, "getLabelName")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLWhoamiStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLWhoamiStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlWhoamiStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.ast.statement.SQLWithSubqueryClause x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlWithSubqueryClause(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLWithSubqueryClause::getEntries, String.class, "getEntries"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.ast.statement.SQLWithSubqueryClause::getRecursive, Integer.class, "getRecursive")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.antspark.ast.AntsparkCreateTableStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.AntsparkCreateTableStatement(
                getOid(x),
                getOid(x.getDatasource()),
                getOid(x.getMetaLifeCycle()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.antspark.ast.AntsparkCreateTableStatement::getSerdeProperties, String.class, "getSerdeProperties")
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.blink.ast.BlinkCreateTableStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.BlinkCreateTableStatement(
                getOid(x),
                getOid(x.getPeriodFor())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.clickhouse.ast.ClickhouseCreateTableStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.ClickhouseCreateTableStatement(
                getOid(x),
                getOid(x.getOrderBy()),
                getOid(x.getPartitionBy()),
                getOid(x.getSampleBy())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.db2.ast.stmt.DB2CreateTableStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.Db2CreateTableStatement(
                getOid(x),
                getOid(x.getDatabase()),
                getOid(x.getIndexIn()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.db2.ast.stmt.DB2CreateTableStatement::isDataCaptureChanges, Integer.class, "isDataCaptureChanges"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.db2.ast.stmt.DB2CreateTableStatement::isDataCaptureNone, Integer.class, "isDataCaptureNone"),
                getOid(x.getValidproc())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.db2.ast.stmt.DB2SelectQueryBlock x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.Db2SelectQueryBlock(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.db2.ast.stmt.DB2SelectQueryBlock::isForReadOnly, Integer.class, "isForReadOnly"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.db2.ast.stmt.DB2SelectQueryBlock::getIsolation, String.class, "getIsolation"),
                getOid(x.getOptimizeFor())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.db2.ast.stmt.DB2ValuesStatement x) {
        // DB2StatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.Db2StatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.db2.ast.stmt.DB2ValuesStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.Db2ValuesStatement(
                getOid(x),
                getOid(x.getExpr())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.hive.ast.HiveInputOutputFormat x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.HiveInputOutputFormat(
                getOid(x),
                getOid(x.getInput()),
                getOid(x.getOutput())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.hive.ast.HiveInsert x) {
        // SQLInsertInto is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlInsertInto(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.ast.HiveInsert::getAlias, String.class, "getAlias"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.ast.HiveInsert::getColumnsString, String.class, "getColumnsString"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.ast.HiveInsert::getColumnsStringHash, String.class, "getColumnsStringHash"),
                getOid(x.getHint()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.ast.HiveInsert::getInsertBeforeCommentsDirect, String.class, "getInsertBeforeCommentsDirect"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.ast.HiveInsert::isOverwrite, Integer.class, "isOverwrite"),
                getOid(x.getQuery()),
                getOid(x.getTableName()),
                getOid(x.getTableSource()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.ast.HiveInsert::getValues, String.class, "getValues"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.ast.HiveInsert::getValuesList, String.class, "getValuesList")
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.ast.HiveInsert::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.HiveInsert(
                getOid(x),
                getOid(x.getQuery()),
                getOid(x.getTableSource()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.ast.HiveInsert::getValuesList, String.class, "getValuesList")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.hive.ast.HiveInsertStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.HiveInsertStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.ast.HiveInsertStatement::isIfNotExists, Integer.class, "isIfNotExists")
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLInsertStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.hive.ast.HiveMultiInsertStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.ast.HiveMultiInsertStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.HiveMultiInsertStatement(
                getOid(x),
                getOid(x.getFrom()),
                getOid(x.getWith())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.hive.stmt.HiveCreateFunctionStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.HiveCreateFunctionStatement(
                getOid(x),
                getOid(x.getClassName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.stmt.HiveCreateFunctionStatement::getCode, String.class, "getCode"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.stmt.HiveCreateFunctionStatement::isDeclare, Integer.class, "isDeclare"),
                getOid(x.getLocation()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.stmt.HiveCreateFunctionStatement::getResourceType, String.class, "getResourceType"),
                getOid(x.getSymbol())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLCreateFunctionStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.hive.stmt.HiveCreateTableStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.HiveCreateTableStatement(
                getOid(x),
                getOid(x.getIntoBuckets()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.stmt.HiveCreateTableStatement::isLikeQuery, Integer.class, "isLikeQuery"),
                getOid(x.getMetaLifeCycle()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.stmt.HiveCreateTableStatement::getSerdeProperties, String.class, "getSerdeProperties"),
                getOid(x.getUsing())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.hive.stmt.HiveLoadDataStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.stmt.HiveLoadDataStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.HiveLoadDataStatement(
                getOid(x),
                getOid(x.getFormat()),
                getOid(x.getInpath()),
                getOid(x.getInto()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.stmt.HiveLoadDataStatement::isLocal, Integer.class, "isLocal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.stmt.HiveLoadDataStatement::isOverwrite, Integer.class, "isOverwrite"),
                getOid(x.getRowFormat()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.stmt.HiveLoadDataStatement::getSerdeProperties, String.class, "getSerdeProperties"),
                getOid(x.getStoredAs()),
                getOid(x.getStoredBy()),
                getOid(x.getUsing())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.hive.stmt.HiveMsckRepairStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.stmt.HiveMsckRepairStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.HiveMsckRepairStatement(
                getOid(x),
                getOid(x.getDatabase()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.hive.stmt.HiveMsckRepairStatement::isAddPartitions, Integer.class, "isAddPartitions"),
                getOid(x.getTable())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.MySqlForceIndexHint x) {
        // MySqlIndexHintImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlIndexHintImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.MySqlForceIndexHint::getOption, String.class, "getOption")
        ));
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlForceIndexHint(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.MySqlIgnoreIndexHint x) {
        // MySqlIndexHintImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlIndexHintImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.MySqlIgnoreIndexHint::getOption, String.class, "getOption")
        ));
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlIgnoreIndexHint(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.MySqlKey x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlKey(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.MySqlKey::getIndexType, String.class, "getIndexType"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.MySqlKey::isHasConstraint, Integer.class, "isHasConstraint"),
                getOid(x.getKeyBlockSize())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLUnique) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.MySqlPrimaryKey x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlPrimaryKey(
                getOid(x)
        ));

        return this.visit((com.alibaba.druid.sql.dialect.mysql.ast.MySqlKey) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.MySqlUnique x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlUnique(
                getOid(x),
                getOid(x.getDbPartitionBy()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.MySqlUnique::isGlobal, Integer.class, "isGlobal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.MySqlUnique::isLocal, Integer.class, "isLocal"),
                getOid(x.getTablePartitionBy()),
                getOid(x.getTablePartitions())
        ));

        return this.visit((com.alibaba.druid.sql.dialect.mysql.ast.MySqlKey) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.MySqlUseIndexHint x) {
        // MySqlIndexHintImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlIndexHintImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.MySqlUseIndexHint::getOption, String.class, "getOption")
        ));
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlUseIndexHint(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.MysqlForeignKey x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MysqlForeignKey(
                getOid(x),
                getOid(x.getIndexName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.MysqlForeignKey::isHasConstraint, Integer.class, "isHasConstraint"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.MysqlForeignKey::getOnDelete, String.class, "getOnDelete"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.MysqlForeignKey::getOnUpdate, String.class, "getOnUpdate"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.MysqlForeignKey::getReferenceMatch, String.class, "getReferenceMatch")
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLForeignKeyImpl) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlCaseStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlCaseStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlCaseStatement(
                getOid(x),
                getOid(x.getCondition()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlCaseStatement::getElseItem, String.class, "getElseItem"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlCaseStatement::getWhenList, String.class, "getWhenList")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlCursorDeclareStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlCursorDeclareStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlCursorDeclareStatement(
                getOid(x),
                getOid(x.getCursorName()),
                getOid(x.getSelect())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlDeclareConditionStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlDeclareConditionStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlDeclareConditionStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlDeclareConditionStatement::getConditionName, String.class, "getConditionName"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlDeclareConditionStatement::getConditionValue, String.class, "getConditionValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlDeclareHandlerStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlDeclareHandlerStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlDeclareHandlerStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlDeclareHandlerStatement::getConditionValues, String.class, "getConditionValues"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlDeclareHandlerStatement::getHandleType, String.class, "getHandleType"),
                getOid(x.getSpStatement())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlDeclareStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlDeclareStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlDeclareStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlIterateStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlIterateStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlIterateStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlIterateStatement::getLabelName, String.class, "getLabelName")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlLeaveStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlLeaveStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlLeaveStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlLeaveStatement::getLabelName, String.class, "getLabelName")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlRepeatStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlRepeatStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlRepeatStatement(
                getOid(x),
                getOid(x.getCondition()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlRepeatStatement::getLabelName, String.class, "getLabelName")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlSelectIntoStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlSelectIntoStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlSelectIntoStatement(
                getOid(x),
                getOid(x.getSelect())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlCharExpr x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlCharExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlCharExpr::getCharset, String.class, "getCharset"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlCharExpr::getCollate, String.class, "getCollate"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlCharExpr::getType, String.class, "getType")
        ));

        return this.visit((com.alibaba.druid.sql.ast.expr.SQLCharExpr) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlJSONTableExpr x) {
        // MySqlExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlExprImpl(
                getOid(x),
                getOid(x.getHint())
        ));
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlJsonTableExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlJSONTableExpr::getColumns, String.class, "getColumns"),
                getOid(x.getExpr()),
                getOid(x.getPath())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlOrderingExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlOrderingExpr(
                getOid(x),
                getOid(x.getExpr()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlOrderingExpr::getType, String.class, "getType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlOutFileExpr x) {
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlOutFileExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlOutFileExpr::getCharset, String.class, "getCharset"),
                getOid(x.getColumnsEnclosedBy()),
                getOid(x.getColumnsEscaped()),
                getOid(x.getColumnsTerminatedBy()),
                getOid(x.getFile()),
                getOid(x.getIgnoreLinesNumber()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlOutFileExpr::isColumnsEnclosedOptionally, Integer.class, "isColumnsEnclosedOptionally"),
                getOid(x.getLinesStartingBy()),
                getOid(x.getLinesTerminatedBy())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlUserName x) {
        // MySqlExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlExprImpl(
                getOid(x),
                getOid(x.getHint())
        ));
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlUserName(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlUserName::getHost, String.class, "getHost"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlUserName::getIdentifiedBy, String.class, "getIdentifiedBy"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlUserName::getNormalizeUserName, String.class, "getNormalizeUserName"),
                getOid(x.getResolvedColumn()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlUserName::getSimpleName, String.class, "getSimpleName"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlUserName::getUserName, String.class, "getUserName")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.CobarShowStatus x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.CobarShowStatus::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.CobarShowStatus(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsBaselineStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsBaselineStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.DrdsBaselineStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsBaselineStatement::getBaselineIds, String.class, "getBaselineIds"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsBaselineStatement::getOperation, String.class, "getOperation"),
                getOid(x.getSelect())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsCancelDDLJob x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsCancelDDLJob::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.DrdsCancelDdlJob(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsCancelDDLJob::getJobIds, String.class, "getJobIds")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsChangeDDLJob x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsChangeDDLJob::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.DrdsChangeDdlJob(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsChangeDDLJob::getGroupAndTableNameList, String.class, "getGroupAndTableNameList"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsChangeDDLJob::isAdd, Integer.class, "isAdd"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsChangeDDLJob::isSkip, Integer.class, "isSkip"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsChangeDDLJob::getJobId, String.class, "getJobId")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsClearDDLJobCache x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsClearDDLJobCache::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.DrdsClearDdlJobCache(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsClearDDLJobCache::isAllJobs, Integer.class, "isAllJobs"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsClearDDLJobCache::getJobIds, String.class, "getJobIds")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsInspectDDLJobCache x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsInspectDDLJobCache::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.DrdsInspectDdlJobCache(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsRecoverDDLJob x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsRecoverDDLJob::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.DrdsRecoverDdlJob(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsRecoverDDLJob::isAllJobs, Integer.class, "isAllJobs"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsRecoverDDLJob::getJobIds, String.class, "getJobIds")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsRemoveDDLJob x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsRemoveDDLJob::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.DrdsRemoveDdlJob(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsRemoveDDLJob::isAllCompleted, Integer.class, "isAllCompleted"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsRemoveDDLJob::isAllPending, Integer.class, "isAllPending"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsRemoveDDLJob::getJobIds, String.class, "getJobIds")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsRollbackDDLJob x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsRollbackDDLJob::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.DrdsRollbackDdlJob(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsRollbackDDLJob::getJobIds, String.class, "getJobIds")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsShowDDLJobs x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsShowDDLJobs::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.DrdsShowDdlJobs(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsShowDDLJobs::isFull, Integer.class, "isFull"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsShowDDLJobs::getJobIds, String.class, "getJobIds")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsShowGlobalIndex x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsShowGlobalIndex::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.DrdsShowGlobalIndex(
                getOid(x),
                getOid(x.getTableName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsShowMetadataLock x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.DrdsShowMetadataLock::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.DrdsShowMetadataLock(
                getOid(x),
                getOid(x.getSchemaName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterDatabaseKillJob x) {
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlAlterDatabaseKillJob(
                getOid(x),
                getOid(x.getJobId()),
                getOid(x.getJobType())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterDatabaseSetOption x) {
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlAlterDatabaseSetOption(
                getOid(x),
                getOid(x.getOn())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterEventStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterEventStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlAlterEventStatement(
                getOid(x),
                getOid(x.getComment()),
                getOid(x.getDefiner()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterEventStatement::getEnable, Integer.class, "getEnable"),
                getOid(x.getEventBody()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterEventStatement::isDisableOnSlave, Integer.class, "isDisableOnSlave"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterEventStatement::isOnCompletionPreserve, Integer.class, "isOnCompletionPreserve"),
                getOid(x.getName()),
                getOid(x.getRenameTo()),
                getOid(x.getSchedule())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterLogFileGroupStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterLogFileGroupStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlAlterLogFileGroupStatement(
                getOid(x),
                getOid(x.getAddUndoFile()),
                getOid(x.getEngine()),
                getOid(x.getInitialSize()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterLogFileGroupStatement::isWait, Integer.class, "isWait"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterServerStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterServerStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlAlterServerStatement(
                getOid(x),
                getOid(x.getName()),
                getOid(x.getUser())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableAlterColumn x) {
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlAlterTableAlterColumn(
                getOid(x),
                getOid(x.getColumn()),
                getOid(x.getDefaultExpr()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableAlterColumn::isDropDefault, Integer.class, "isDropDefault")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableAlterFullTextIndex x) {
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlAlterTableAlterFullTextIndex(
                getOid(x),
                getOid(x.getAnalyzerName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableAlterFullTextIndex::getAnalyzerType, String.class, "getAnalyzerType"),
                getOid(x.getIndexName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableChangeColumn x) {
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlAlterTableChangeColumn(
                getOid(x),
                getOid(x.getAfterColumn()),
                getOid(x.getColumnName()),
                getOid(x.getFirstColumn()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableChangeColumn::isFirst, Integer.class, "isFirst"),
                getOid(x.getNewColumnDefinition())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableDiscardTablespace x) {
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlAlterTableDiscardTablespace(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableForce x) {
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlAlterTableForce(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableImportTablespace x) {
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlAlterTableImportTablespace(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableLock x) {
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlAlterTableLock(
                getOid(x),
                getOid(x.getLockType())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableModifyColumn x) {
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlAlterTableModifyColumn(
                getOid(x),
                getOid(x.getAfterColumn()),
                getOid(x.getFirstColumn()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableModifyColumn::isFirst, Integer.class, "isFirst"),
                getOid(x.getNewColumnDefinition())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableOption x) {
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlAlterTableOption(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableOption::getName, String.class, "getName"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableOption::getValue, String.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableOrderBy x) {
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlAlterTableOrderBy(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableValidation x) {
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlAlterTableValidation(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableValidation::isWithValidation, Integer.class, "isWithValidation")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTablespaceStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTablespaceStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlAlterTablespaceStatement(
                getOid(x),
                getOid(x.getAddDataFile()),
                getOid(x.getDropDataFile()),
                getOid(x.getEngine()),
                getOid(x.getInitialSize()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTablespaceStatement::isWait, Integer.class, "isWait"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterUserStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterUserStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlAlterUserStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterUserStatement::getAlterUsers, String.class, "getAlterUsers"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterUserStatement::isIfExists, Integer.class, "isIfExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterUserStatement::getPasswordOption, String.class, "getPasswordOption")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAnalyzeStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlAnalyzeStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAnalyzeStatement::isLocal, Integer.class, "isLocal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAnalyzeStatement::isNoWriteToBinlog, Integer.class, "isNoWriteToBinlog")
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLAnalyzeTableStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlBinlogStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlBinlogStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlBinlogStatement(
                getOid(x),
                getOid(x.getExpr())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCheckTableStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCheckTableStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlCheckTableStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlChecksumTableStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlChecksumTableStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlChecksumTableStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlChecksumTableStatement::isExtended, Integer.class, "isExtended"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlChecksumTableStatement::isQuick, Integer.class, "isQuick")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlClearPlanCacheStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlClearPlanCacheStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlClearPlanCacheStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateAddLogFileGroupStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateAddLogFileGroupStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlCreateAddLogFileGroupStatement(
                getOid(x),
                getOid(x.getAddUndoFile()),
                getOid(x.getComment()),
                getOid(x.getEngine()),
                getOid(x.getInitialSize()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateAddLogFileGroupStatement::isWait, Integer.class, "isWait"),
                getOid(x.getName()),
                getOid(x.getNodeGroup()),
                getOid(x.getRedoBufferSize()),
                getOid(x.getUndoBufferSize())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateEventStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateEventStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlCreateEventStatement(
                getOid(x),
                getOid(x.getComment()),
                getOid(x.getDefiner()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateEventStatement::getEnable, Integer.class, "getEnable"),
                getOid(x.getEventBody()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateEventStatement::isDisableOnSlave, Integer.class, "isDisableOnSlave"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateEventStatement::isIfNotExists, Integer.class, "isIfNotExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateEventStatement::isOnCompletionPreserve, Integer.class, "isOnCompletionPreserve"),
                getOid(x.getName()),
                getOid(x.getRenameTo()),
                getOid(x.getSchedule())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateExternalCatalogStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateExternalCatalogStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlCreateExternalCatalogStatement(
                getOid(x),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateExternalCatalogStatement::isIfNotExists, Integer.class, "isIfNotExists"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateExternalCatalogStatement::getProperties, String.class, "getProperties")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateServerStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateServerStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlCreateServerStatement(
                getOid(x),
                getOid(x.getDatabase()),
                getOid(x.getForeignDataWrapper()),
                getOid(x.getHost()),
                getOid(x.getName()),
                getOid(x.getOwner()),
                getOid(x.getPassword()),
                getOid(x.getPort()),
                getOid(x.getSocket()),
                getOid(x.getUser())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateTableSpaceStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateTableSpaceStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlCreateTableSpaceStatement(
                getOid(x),
                getOid(x.getAddDataFile()),
                getOid(x.getAutoExtentSize()),
                getOid(x.getComment()),
                getOid(x.getEngine()),
                getOid(x.getExtentSize()),
                getOid(x.getFileBlockSize()),
                getOid(x.getInitialSize()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateTableSpaceStatement::isWait, Integer.class, "isWait"),
                getOid(x.getLogFileGroup()),
                getOid(x.getMaxSize()),
                getOid(x.getName()),
                getOid(x.getNodeGroup())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateTableStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlCreateTableStatement(
                getOid(x),
                getOid(x.getArchiveBy()),
                getOid(x.getDbPartitionBy()),
                getOid(x.getDbPartitions()),
                getOid(x.getDbpartitions()),
                getOid(x.getDistributeByType()),
                getOid(x.getEngine()),
                getOid(x.getExtPartition()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateTableStatement::isBroadCast, Integer.class, "isBroadCast"),
                getOid(x.getStoredBy()),
                getOid(x.getTableGroup()),
                getOid(x.getTablePartitionBy()),
                getOid(x.getTablePartitions()),
                getOid(x.getTbpartitions()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateTableStatement::getWith, String.class, "getWith"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateTableStatement::getWithData, Integer.class, "getWithData")
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateUserStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateUserStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlCreateUserStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateUserStatement::isIfNotExists, Integer.class, "isIfNotExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateUserStatement::getUsers, String.class, "getUsers")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlDeleteStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlDeleteStatement(
                getOid(x),
                getOid(x.getForcePartition()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlDeleteStatement::getHintsSize, Integer.class, "getHintsSize"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlDeleteStatement::isForceAllPartitions, Integer.class, "isForceAllPartitions"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlDeleteStatement::isFulltextDictionary, Integer.class, "isFulltextDictionary"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlDeleteStatement::isIgnore, Integer.class, "isIgnore"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlDeleteStatement::isLowPriority, Integer.class, "isLowPriority"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlDeleteStatement::isQuick, Integer.class, "isQuick"),
                getOid(x.getLimit()),
                getOid(x.getOrderBy())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLDeleteStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlDisabledPlanCacheStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlDisabledPlanCacheStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlDisabledPlanCacheStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlEventSchedule x) {
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlEventSchedule(
                getOid(x),
                getOid(x.getAt()),
                getOid(x.getEnds()),
                getOid(x.getEvery()),
                getOid(x.getStarts())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlExecuteForAdsStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlExecuteForAdsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlExecuteForAdsStatement(
                getOid(x),
                getOid(x.getAction()),
                getOid(x.getRole()),
                getOid(x.getStatus()),
                getOid(x.getTargetId())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlExecuteStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlExecuteStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlExecuteStatement(
                getOid(x),
                getOid(x.getStatementName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlExplainPlanCacheStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlExplainPlanCacheStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlExplainPlanCacheStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlExplainStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlExplainStatement(
                getOid(x),
                getOid(x.getColumnName()),
                getOid(x.getConnectionId()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlExplainStatement::isDescribe, Integer.class, "isDescribe"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlExplainStatement::isDistributeInfo, Integer.class, "isDistributeInfo"),
                getOid(x.getTableName()),
                getOid(x.getWild())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLExplainStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlExtPartition x) {
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlExtPartition(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlExtPartition::getItems, String.class, "getItems")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlashbackStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlashbackStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlFlashbackStatement(
                getOid(x),
                getOid(x.getName()),
                getOid(x.getRenameTo())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlFlushStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isBinaryLogs, Integer.class, "isBinaryLogs"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isDesKeyFile, Integer.class, "isDesKeyFile"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isEngineLogs, Integer.class, "isEngineLogs"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isErrorLogs, Integer.class, "isErrorLogs"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isForExport, Integer.class, "isForExport"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isGeneralLogs, Integer.class, "isGeneralLogs"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isHots, Integer.class, "isHots"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isLocal, Integer.class, "isLocal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isLogs, Integer.class, "isLogs"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isMaster, Integer.class, "isMaster"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isNoWriteToBinlog, Integer.class, "isNoWriteToBinlog"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isOptimizerCosts, Integer.class, "isOptimizerCosts"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isPrivileges, Integer.class, "isPrivileges"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isQueryCache, Integer.class, "isQueryCache"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isRelayLogs, Integer.class, "isRelayLogs"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isSlowLogs, Integer.class, "isSlowLogs"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isStatus, Integer.class, "isStatus"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isTableOption, Integer.class, "isTableOption"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isUserResources, Integer.class, "isUserResources"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlFlushStatement::isWithReadLock, Integer.class, "isWithReadLock"),
                getOid(x.getRelayLogsForChannel()),
                getOid(x.getVersion())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlHelpStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlHelpStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlHelpStatement(
                getOid(x),
                getOid(x.getContent())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlHintStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlHintStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlHintStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlHintStatement::getHintVersion, Integer.class, "getHintVersion")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlInsertStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlInsertStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlInsertStatement::getHintsSize, Integer.class, "getHintsSize"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlInsertStatement::isDelayed, Integer.class, "isDelayed"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlInsertStatement::isFulltextDictionary, Integer.class, "isFulltextDictionary"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlInsertStatement::isHighPriority, Integer.class, "isHighPriority"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlInsertStatement::isIfNotExists, Integer.class, "isIfNotExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlInsertStatement::isIgnore, Integer.class, "isIgnore"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlInsertStatement::isLowPriority, Integer.class, "isLowPriority"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlInsertStatement::isOverwrite, Integer.class, "isOverwrite"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlInsertStatement::isRollbackOnFail, Integer.class, "isRollbackOnFail")
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLInsertStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlKillStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlKillStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlKillStatement(
                getOid(x),
                getOid(x.getThreadId()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlKillStatement::getType, String.class, "getType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLoadDataInFileStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLoadDataInFileStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlLoadDataInFileStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLoadDataInFileStatement::getCharset, String.class, "getCharset"),
                getOid(x.getColumnsEnclosedBy()),
                getOid(x.getColumnsEscaped()),
                getOid(x.getColumnsTerminatedBy()),
                getOid(x.getFileName()),
                getOid(x.getIgnoreLinesNumber()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLoadDataInFileStatement::isColumnsEnclosedOptionally, Integer.class, "isColumnsEnclosedOptionally"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLoadDataInFileStatement::isConcurrent, Integer.class, "isConcurrent"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLoadDataInFileStatement::isIgnore, Integer.class, "isIgnore"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLoadDataInFileStatement::isLocal, Integer.class, "isLocal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLoadDataInFileStatement::isLowPriority, Integer.class, "isLowPriority"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLoadDataInFileStatement::isReplicate, Integer.class, "isReplicate"),
                getOid(x.getLinesStartingBy()),
                getOid(x.getLinesTerminatedBy()),
                getOid(x.getTableName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLoadXmlStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLoadXmlStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlLoadXmlStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLoadXmlStatement::getCharset, String.class, "getCharset"),
                getOid(x.getFileName()),
                getOid(x.getIgnoreLinesNumber()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLoadXmlStatement::isConcurrent, Integer.class, "isConcurrent"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLoadXmlStatement::isIgnore, Integer.class, "isIgnore"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLoadXmlStatement::isLocal, Integer.class, "isLocal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLoadXmlStatement::isLowPriority, Integer.class, "isLowPriority"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLoadXmlStatement::isReplicate, Integer.class, "isReplicate"),
                getOid(x.getRowsIdentifiedBy()),
                getOid(x.getTableName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLockTableStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLockTableStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlLockTableStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlLockTableStatement::getItems, String.class, "getItems")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlManageInstanceGroupStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlManageInstanceGroupStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlManageInstanceGroupStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlManageInstanceGroupStatement::getGroupNamesToString, String.class, "getGroupNamesToString"),
                getOid(x.getOperation()),
                getOid(x.getReplication())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlMigrateStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlMigrateStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlMigrateStatement(
                getOid(x),
                getOid(x.getFromInsId()),
                getOid(x.getFromInsIp()),
                getOid(x.getFromInsPort()),
                getOid(x.getFromInsStatus()),
                getOid(x.getMigrateType()),
                getOid(x.getSchema()),
                getOid(x.getShardNames()),
                getOid(x.getToInsId()),
                getOid(x.getToInsIp()),
                getOid(x.getToInsPort()),
                getOid(x.getToInsStatus())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlOptimizeStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlOptimizeStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlOptimizeStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlOptimizeStatement::isLocal, Integer.class, "isLocal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlOptimizeStatement::isNoWriteToBinlog, Integer.class, "isNoWriteToBinlog")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlPartitionByKey x) {
        // SQLPartitionBy is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlPartitionBy(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlPartitionByKey::isLinear, Integer.class, "isLinear"),
                getOid(x.getLifecycle()),
                getOid(x.getPartitionsCount()),
                getOid(x.getSubPartitionBy())
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlPartitionByKey(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlPartitionByKey::getAlgorithm, Integer.class, "getAlgorithm")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlPrepareStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlPrepareStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlPrepareStatement(
                getOid(x),
                getOid(x.getFrom()),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlRaftLeaderTransferStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlRaftLeaderTransferStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlRaftLeaderTransferStatement(
                getOid(x),
                getOid(x.getFrom()),
                getOid(x.getShard()),
                getOid(x.getTimeout()),
                getOid(x.getTo())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlRaftMemberChangeStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlRaftMemberChangeStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlRaftMemberChangeStatement(
                getOid(x),
                getOid(x.getHost()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlRaftMemberChangeStatement::isForce, Integer.class, "isForce"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlRaftMemberChangeStatement::isNoLeader, Integer.class, "isNoLeader"),
                getOid(x.getShard()),
                getOid(x.getStatus())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlRenameSequenceStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlRenameSequenceStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlRenameSequenceStatement(
                getOid(x),
                getOid(x.getName()),
                getOid(x.getTo())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlRenameTableStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlRenameTableStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlRenameTableStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlRenameTableStatement::getItems, String.class, "getItems")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlResetStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlResetStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlResetStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlResetStatement::getOptions, String.class, "getOptions")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSelectQueryBlock x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlSelectQueryBlock(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSelectQueryBlock::getCache, Integer.class, "getCache"),
                getOid(x.getForcePartition()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSelectQueryBlock::getHintsSize, Integer.class, "getHintsSize"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSelectQueryBlock::isBigResult, Integer.class, "isBigResult"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSelectQueryBlock::isBufferResult, Integer.class, "isBufferResult"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSelectQueryBlock::isCalcFoundRows, Integer.class, "isCalcFoundRows"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSelectQueryBlock::isHignPriority, Integer.class, "isHignPriority"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSelectQueryBlock::isLockInShareMode, Integer.class, "isLockInShareMode"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSelectQueryBlock::isSmallResult, Integer.class, "isSmallResult"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSelectQueryBlock::isStraightJoin, Integer.class, "isStraightJoin"),
                getOid(x.getProcedureName())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSetTransactionStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSetTransactionStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlSetTransactionStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSetTransactionStatement::getAccessModel, String.class, "getAccessModel"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSetTransactionStatement::getGlobal, Integer.class, "getGlobal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSetTransactionStatement::isLocal, Integer.class, "isLocal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSetTransactionStatement::getIsolationLevel, String.class, "getIsolationLevel"),
                getOid(x.getPolicy()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSetTransactionStatement::getSession, Integer.class, "getSession")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowAuthorsStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowAuthorsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowAuthorsStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowBinLogEventsStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowBinLogEventsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowBinLogEventsStatement(
                getOid(x),
                getOid(x.getFrom()),
                getOid(x.getIn()),
                getOid(x.getLimit())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowBinaryLogsStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowBinaryLogsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowBinaryLogsStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowBroadcastsStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowBroadcastsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowBroadcastsStatement(
                getOid(x),
                getOid(x.getLimit()),
                getOid(x.getOrderBy()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowCharacterSetStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowCharacterSetStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowCharacterSetStatement(
                getOid(x),
                getOid(x.getPattern()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowClusterNameStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowClusterNameStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowClusterNameStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowCollationStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowCollationStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowCollationStatement(
                getOid(x),
                getOid(x.getPattern()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowConfigStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowConfigStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowConfigStatement(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowContributorsStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowContributorsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowContributorsStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowCreateDatabaseStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowCreateDatabaseStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowCreateDatabaseStatement(
                getOid(x),
                getOid(x.getDatabase()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowCreateDatabaseStatement::isIfNotExists, Integer.class, "isIfNotExists")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowCreateEventStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowCreateEventStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowCreateEventStatement(
                getOid(x),
                getOid(x.getEventName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowCreateFunctionStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowCreateFunctionStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowCreateFunctionStatement(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowCreateProcedureStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowCreateProcedureStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowCreateProcedureStatement(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowCreateTriggerStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowCreateTriggerStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowCreateTriggerStatement(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowDatabaseStatusStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowDatabaseStatusStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowDatabaseStatusStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowDatabaseStatusStatement::isFull, Integer.class, "isFull"),
                getOid(x.getLimit()),
                getOid(x.getName()),
                getOid(x.getOrderBy()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowDatasourcesStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowDatasourcesStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowDatasourcesStatement(
                getOid(x),
                getOid(x.getLimit()),
                getOid(x.getOrderBy()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowDdlStatusStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowDdlStatusStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowDdlStatusStatement(
                getOid(x),
                getOid(x.getLimit()),
                getOid(x.getOrderBy()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowDsStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowDsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowDsStatement(
                getOid(x),
                getOid(x.getLimit()),
                getOid(x.getOrderBy()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowEngineStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowEngineStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowEngineStatement(
                getOid(x),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowEngineStatement::getOption, String.class, "getOption")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowEnginesStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowEnginesStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowEnginesStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowEnginesStatement::isStorage, Integer.class, "isStorage")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowErrorsStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowErrorsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowErrorsStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowErrorsStatement::isCount, Integer.class, "isCount"),
                getOid(x.getLimit())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowEventsStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowEventsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowEventsStatement(
                getOid(x),
                getOid(x.getLike()),
                getOid(x.getSchema()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowFunctionCodeStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowFunctionCodeStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowFunctionCodeStatement(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowFunctionStatusStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowFunctionStatusStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowFunctionStatusStatement(
                getOid(x),
                getOid(x.getLike()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowGrantsStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowGrantsStatement(
                getOid(x)
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLShowGrantsStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowHMSMetaStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowHMSMetaStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowHmsMetaStatement(
                getOid(x),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowHMSMetaStatement::getSchema, String.class, "getSchema"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowHMSMetaStatement::getTableName, String.class, "getTableName")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowHelpStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowHelpStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowHelpStatement(
                getOid(x),
                getOid(x.getLimit()),
                getOid(x.getOrderBy()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowJobStatusStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowJobStatusStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowJobStatusStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowJobStatusStatement::isSync, Integer.class, "isSync"),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowMasterLogsStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowMasterLogsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowMasterLogsStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowMasterStatusStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowMasterStatusStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowMasterStatusStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowMigrateTaskStatusStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowMigrateTaskStatusStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowMigrateTaskStatusStatement(
                getOid(x),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowNodeStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowNodeStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowNodeStatement(
                getOid(x),
                getOid(x.getLimit()),
                getOid(x.getOrderBy()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowOpenTablesStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowOpenTablesStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowOpenTablesStatement(
                getOid(x),
                getOid(x.getDatabase()),
                getOid(x.getLike()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowPartitionsStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowPartitionsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowPartitionsStatement(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowPhysicalProcesslistStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowPhysicalProcesslistStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowPhysicalProcesslistStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowPhysicalProcesslistStatement::isFull, Integer.class, "isFull")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowPlanCacheStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowPlanCacheStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowPlanCacheStatement(
                getOid(x),
                getOid(x.getSelect())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowPlanCacheStatusStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowPlanCacheStatusStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowPlanCacheStatusStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowPluginsStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowPluginsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowPluginsStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowPrivilegesStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowPrivilegesStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowPrivilegesStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowProcedureCodeStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowProcedureCodeStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowProcedureCodeStatement(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowProcedureStatusStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowProcedureStatusStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowProcedureStatusStatement(
                getOid(x),
                getOid(x.getLike()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowProcessListStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowProcessListStatement(
                getOid(x)
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLShowProcessListStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowProfileStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowProfileStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowProfileStatement(
                getOid(x),
                getOid(x.getForQuery()),
                getOid(x.getLimit()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowProfileStatement::getTypes, String.class, "getTypes")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowProfilesStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowProfilesStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowProfilesStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowRelayLogEventsStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowRelayLogEventsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowRelayLogEventsStatement(
                getOid(x),
                getOid(x.getFrom()),
                getOid(x.getLimit()),
                getOid(x.getLogName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowRuleStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowRuleStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowRuleStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowRuleStatement::isFull, Integer.class, "isFull"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowRuleStatement::isVersion, Integer.class, "isVersion"),
                getOid(x.getLimit()),
                getOid(x.getName()),
                getOid(x.getOrderBy()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowRuleStatusStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowRuleStatusStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowRuleStatusStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowRuleStatusStatement::isFull, Integer.class, "isFull"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowRuleStatusStatement::isLite, Integer.class, "isLite"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowRuleStatusStatement::isVersion, Integer.class, "isVersion"),
                getOid(x.getLimit()),
                getOid(x.getOrderBy()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowSequencesStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowSequencesStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowSequencesStatement(
                getOid(x),
                getOid(x.getLimit()),
                getOid(x.getOrderBy()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowSlaveHostsStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowSlaveHostsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowSlaveHostsStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowSlaveStatusStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowSlaveStatusStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowSlaveStatusStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowSlowStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowSlowStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowSlowStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowSlowStatement::isFull, Integer.class, "isFull"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowSlowStatement::isPhysical, Integer.class, "isPhysical"),
                getOid(x.getLimit()),
                getOid(x.getOrderBy()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowStatusStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowStatusStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowStatusStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowStatusStatement::isGlobal, Integer.class, "isGlobal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowStatusStatement::isSession, Integer.class, "isSession"),
                getOid(x.getLike()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowTableStatusStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowTableStatusStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowTableStatusStatement(
                getOid(x),
                getOid(x.getDatabase()),
                getOid(x.getLike()),
                getOid(x.getTableGroup()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowTopologyStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowTopologyStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowTopologyStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowTopologyStatement::isFull, Integer.class, "isFull"),
                getOid(x.getLimit()),
                getOid(x.getName()),
                getOid(x.getOrderBy()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowTraceStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowTraceStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowTraceStatement(
                getOid(x),
                getOid(x.getLimit()),
                getOid(x.getOrderBy()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowTriggersStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowTriggersStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowTriggersStatement(
                getOid(x),
                getOid(x.getDatabase()),
                getOid(x.getLike()),
                getOid(x.getWhere())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowWarningsStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowWarningsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlShowWarningsStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowWarningsStatement::isCount, Integer.class, "isCount"),
                getOid(x.getLimit())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSubPartitionByKey x) {
        // SQLSubPartitionBy is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSubPartitionBy(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSubPartitionByKey::isLinear, Integer.class, "isLinear"),
                getOid(x.getLifecycle()),
                getOid(x.getSubPartitionsCount())
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlSubPartitionByKey(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSubPartitionByKey::getAlgorithm, Integer.class, "getAlgorithm")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSubPartitionByList x) {
        // SQLSubPartitionBy is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSubPartitionBy(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSubPartitionByList::isLinear, Integer.class, "isLinear"),
                getOid(x.getLifecycle()),
                getOid(x.getSubPartitionsCount())
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlSubPartitionByList(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSubPartitionByValue x) {
        // SQLSubPartitionBy is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlSubPartitionBy(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSubPartitionByValue::isLinear, Integer.class, "isLinear"),
                getOid(x.getLifecycle()),
                getOid(x.getSubPartitionsCount())
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlSubPartitionByValue(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlTableIndex x) {
        // SQLConstraintImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlConstraintImpl(
                getOid(x),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlTableIndex::getEnable, Integer.class, "getEnable"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlTableIndex::getRely, Integer.class, "getRely"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlTableIndex::getValidate, Integer.class, "getValidate")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlTableIndex(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlTableIndex::getAlgorithm, String.class, "getAlgorithm"),
                getOid(x.getAnalyzerName()),
                getOid(x.getComment()),
                getOid(x.getDbPartitionBy()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlTableIndex::getDistanceMeasure, String.class, "getDistanceMeasure"),
                getOid(x.getIndexAnalyzerName()),
                getOid(x.getIndexDefinition()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlTableIndex::getIndexType, String.class, "getIndexType"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlTableIndex::isGlobal, Integer.class, "isGlobal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlTableIndex::isLocal, Integer.class, "isLocal"),
                getOid(x.getName()),
                getOid(x.getQueryAnalyzerName()),
                getOid(x.getTablePartitionBy()),
                getOid(x.getTablePartitions()),
                getOid(x.getWithDicName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUnlockTablesStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUnlockTablesStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlUnlockTablesStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUpdatePlanCacheStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUpdatePlanCacheStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlUpdatePlanCacheStatement(
                getOid(x),
                getOid(x.getFormSelect()),
                getOid(x.getToSelect())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUpdateStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlUpdateStatement(
                getOid(x),
                getOid(x.getForcePartition()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUpdateStatement::getHintsSize, Integer.class, "getHintsSize"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUpdateStatement::isCommitOnSuccess, Integer.class, "isCommitOnSuccess"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUpdateStatement::isForceAllPartitions, Integer.class, "isForceAllPartitions"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUpdateStatement::isIgnore, Integer.class, "isIgnore"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUpdateStatement::isLowPriority, Integer.class, "isLowPriority"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUpdateStatement::isQueryOnPk, Integer.class, "isQueryOnPk"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUpdateStatement::isRollBackOnFail, Integer.class, "isRollBackOnFail"),
                getOid(x.getLimit()),
                getOid(x.getTargetAffectRow())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLUpdateStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUpdateTableSource x) {
        // SQLTableSourceImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlTableSourceImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUpdateTableSource::getAlias, String.class, "getAlias"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUpdateTableSource::getAlias2, String.class, "getAlias2"),
                getOid(x.getFlashback()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUpdateTableSource::getHintsSize, Integer.class, "getHintsSize")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlUpdateTableSource(
                getOid(x),
                getOid(x.getUpdate())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlAlterFullTextStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlAlterFullTextStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MysqlAlterFullTextStatement(
                getOid(x),
                getOid(x.getItem()),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlAlterFullTextStatement::getType, String.class, "getType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlAlterTableAlterCheck x) {
        // MySqlObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MysqlAlterTableAlterCheck(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlAlterTableAlterCheck::getEnforced, Integer.class, "getEnforced"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlCreateFullTextAnalyzerStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlCreateFullTextAnalyzerStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MysqlCreateFullTextAnalyzerStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlCreateFullTextAnalyzerStatement::getCharfilters, String.class, "getCharfilters"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlCreateFullTextAnalyzerStatement::getTokenizer, String.class, "getTokenizer"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlCreateFullTextAnalyzerStatement::getTokenizers, String.class, "getTokenizers")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlCreateFullTextCharFilterStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlCreateFullTextCharFilterStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MysqlCreateFullTextCharFilterStatement(
                getOid(x),
                getOid(x.getName()),
                getOid(x.getTypeName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlCreateFullTextDictionaryStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlCreateFullTextDictionaryStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MysqlCreateFullTextDictionaryStatement(
                getOid(x),
                getOid(x.getColumn()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlCreateFullTextDictionaryStatement::getComment, String.class, "getComment"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlCreateFullTextTokenFilterStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlCreateFullTextTokenFilterStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MysqlCreateFullTextTokenFilterStatement(
                getOid(x),
                getOid(x.getName()),
                getOid(x.getTypeName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlCreateFullTextTokenizerStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlCreateFullTextTokenizerStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MysqlCreateFullTextTokenizerStatement(
                getOid(x),
                getOid(x.getName()),
                getOid(x.getTypeName()),
                getOid(x.getUserDefinedDict())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlDeallocatePrepareStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlDeallocatePrepareStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MysqlDeallocatePrepareStatement(
                getOid(x),
                getOid(x.getStatementName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlDropFullTextStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlDropFullTextStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MysqlDropFullTextStatement(
                getOid(x),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlDropFullTextStatement::getType, String.class, "getType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlShowCreateFullTextStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlShowCreateFullTextStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MysqlShowCreateFullTextStatement(
                getOid(x),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlShowCreateFullTextStatement::getType, String.class, "getType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlShowDbLockStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlShowDbLockStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MysqlShowDbLockStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlShowFullTextStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlShowFullTextStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MysqlShowFullTextStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlShowFullTextStatement::getType, String.class, "getType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlShowHtcStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlShowHtcStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MysqlShowHtcStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlShowHtcStatement::isFull, Integer.class, "isFull"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlShowHtcStatement::isHis, Integer.class, "isHis")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlShowStcStatement x) {
        // MySqlStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MySqlStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlShowStcStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.MysqlShowStcStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlShowStcStatement::isFull, Integer.class, "isFull"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.MysqlShowStcStatement::isHis, Integer.class, "isHis")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.SQLAlterResourceGroupStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.SQLAlterResourceGroupStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlAlterResourceGroupStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.SQLAlterResourceGroupStatement::getEnable, Integer.class, "getEnable"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.SQLAlterResourceGroupStatement::getProperties, String.class, "getProperties")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.SQLCreateResourceGroupStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.SQLCreateResourceGroupStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlCreateResourceGroupStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.SQLCreateResourceGroupStatement::getEnable, Integer.class, "getEnable"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.SQLCreateResourceGroupStatement::getProperties, String.class, "getProperties")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.mysql.ast.statement.SQLListResourceGroupStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.mysql.ast.statement.SQLListResourceGroupStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlListResourceGroupStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsAddAccountProviderStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsAddAccountProviderStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsAddAccountProviderStatement(
                getOid(x),
                getOid(x.getProvider())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsAddFileStatement x) {
        // OdpsStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsAddFileStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsAddFileStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsAddFileStatement::getAlias, String.class, "getAlias"),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsAddFileStatement::getFile, String.class, "getFile"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsAddFileStatement::isForce, Integer.class, "isForce"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsAddFileStatement::getType, String.class, "getType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsAddStatisticStatement x) {
        // OdpsStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsAddStatisticStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsAddStatisticStatement(
                getOid(x),
                getOid(x.getStatisticClause()),
                getOid(x.getTable())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsAddTableStatement x) {
        // OdpsStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsAddTableStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsAddTableStatement(
                getOid(x),
                getOid(x.getComment()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsAddTableStatement::isForce, Integer.class, "isForce"),
                getOid(x.getTable()),
                getOid(x.getToPackage())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsAddUserStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsAddUserStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsAddUserStatement(
                getOid(x),
                getOid(x.getUser())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsAlterTableSetChangeLogs x) {
        // OdpsObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsAlterTableSetChangeLogs(
                getOid(x),
                getOid(x.getValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsAlterTableSetFileFormat x) {
        // OdpsObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsAlterTableSetFileFormat(
                getOid(x),
                getOid(x.getValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsCountStatement x) {
        // OdpsStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsCountStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsCountStatement(
                getOid(x),
                getOid(x.getTable())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsCreateTableStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsCreateTableStatement(
                getOid(x),
                getOid(x.getLifecycle()),
                getOid(x.getLike()),
                getOid(x.getStoredBy())
        ));

        return this.visit((com.alibaba.druid.sql.dialect.hive.stmt.HiveCreateTableStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsDeclareVariableStatement x) {
        // OdpsStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsDeclareVariableStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsDeclareVariableStatement(
                getOid(x),
                getOid(x.getDataType()),
                getOid(x.getInitValue()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsDeclareVariableStatement::getVariant, String.class, "getVariant")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsExstoreStatement x) {
        // OdpsStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsExstoreStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsExstoreStatement(
                getOid(x),
                getOid(x.getTable())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsGrantStmt x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsGrantStmt(
                getOid(x),
                getOid(x.getExpire()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsGrantStmt::isLabel, Integer.class, "isLabel"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsGrantStmt::isSuper, Integer.class, "isSuper"),
                getOid(x.getLabel()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsGrantStmt::getSubjectType, String.class, "getSubjectType")
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLGrantStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsInstallPackageStatement x) {
        // OdpsStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsInstallPackageStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsInstallPackageStatement(
                getOid(x),
                getOid(x.getPackageName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsListStmt x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsListStmt::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsListStmt(
                getOid(x),
                getOid(x.getObject())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsNewExpr x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsNewExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsNewExpr::isArray, Integer.class, "isArray")
        ));

        return this.visit((com.alibaba.druid.sql.ast.expr.SQLMethodInvokeExpr) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsQueryAliasStatement x) {
        // OdpsStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsQueryAliasStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsQueryAliasStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsQueryAliasStatement::isCache, Integer.class, "isCache"),
                getOid(x.getStatement()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsQueryAliasStatement::getVariant, String.class, "getVariant")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsReadStatement x) {
        // OdpsStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsReadStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsReadStatement(
                getOid(x),
                getOid(x.getRowCount()),
                getOid(x.getTable())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsRemoveStatisticStatement x) {
        // OdpsStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsRemoveStatisticStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsRemoveStatisticStatement(
                getOid(x),
                getOid(x.getStatisticClause()),
                getOid(x.getTable())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsRemoveUserStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsRemoveUserStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsRemoveUserStatement(
                getOid(x),
                getOid(x.getUser())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsRestoreStatement x) {
        // OdpsStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsRestoreStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsRestoreStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsRestoreStatement::getAlias, String.class, "getAlias"),
                getOid(x.getTable()),
                getOid(x.getTo())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsSelectQueryBlock x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsSelectQueryBlock(
                getOid(x),
                getOid(x.getZOrderBy())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsSetLabelStatement x) {
        // OdpsStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsSetLabelStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsSetLabelStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsSetLabelStatement::getLabel, String.class, "getLabel"),
                getOid(x.getProject()),
                getOid(x.getTable()),
                getOid(x.getUser())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsShowChangelogsStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsShowChangelogsStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsShowChangelogsStatement(
                getOid(x),
                getOid(x.getId()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsShowChangelogsStatement::isTables, Integer.class, "isTables"),
                getOid(x.getTable())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsShowGrantsStmt x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsShowGrantsStmt::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsShowGrantsStmt(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsShowGrantsStmt::isLabel, Integer.class, "isLabel"),
                getOid(x.getObjectType()),
                getOid(x.getUser())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsTransformExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsTransformExpr(
                getOid(x),
                getOid(x.getInputRowFormat()),
                getOid(x.getOutputRowFormat()),
                getOid(x.getUsing())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsUDTFSQLSelectItem x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsUdtfsqlSelectItem(
                getOid(x)
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLSelectItem) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsUndoTableStatement x) {
        // OdpsStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsUndoTableStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsUndoTableStatement(
                getOid(x),
                getOid(x.getTable()),
                getOid(x.getTo())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.odps.ast.OdpsUnloadStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.odps.ast.OdpsUnloadStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OdpsUnloadStatement(
                getOid(x),
                getOid(x.getFrom()),
                getOid(x.getLocation()),
                getOid(x.getRowFormat()),
                getOid(x.getStoredAs())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.OracleDataTypeIntervalDay x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleDataTypeIntervalDay(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.OracleDataTypeIntervalDay::isToSecond, Integer.class, "isToSecond")
        ));

        return this.visit((com.alibaba.druid.sql.ast.SQLDataTypeImpl) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.OracleDataTypeIntervalYear x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleDataTypeIntervalYear(
                getOid(x)
        ));

        return this.visit((com.alibaba.druid.sql.ast.SQLDataTypeImpl) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.clause.CycleClause x) {
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.CycleClause(
                getOid(x),
                getOid(x.getDefaultValue()),
                getOid(x.getMark()),
                getOid(x.getValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.clause.ModelClause x) {
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.ModelClause(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.ModelClause::getCellReferenceOptions, String.class, "getCellReferenceOptions"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.ModelClause::getMainModel, String.class, "getMainModel"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.ModelClause::getReferenceModelClauses, String.class, "getReferenceModelClauses"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.ModelClause::getReturnRowsClause, String.class, "getReturnRowsClause")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause x) {
        // OracleSegmentAttributesImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSegmentAttributesImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::getCompress, Integer.class, "getCompress"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::getCompressLevel, Integer.class, "getCompressLevel"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::getFreeLists, Integer.class, "getFreeLists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::getInitrans, Integer.class, "getInitrans"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::isCompressForOltp, Integer.class, "isCompressForOltp"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::getLogging, Integer.class, "getLogging"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::getMaxtrans, Integer.class, "getMaxtrans"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::getPctfree, Integer.class, "getPctfree"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::getPctincrease, Integer.class, "getPctincrease"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::getPctthreshold, Integer.class, "getPctthreshold"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::getPctused, Integer.class, "getPctused"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::getStorage, String.class, "getStorage"),
                getOid(x.getTablespace())
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleLobStorageClause(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::getCache, Integer.class, "getCache"),
                getOid(x.getChunk()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::getCompress, Integer.class, "getCompress"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::getEnable, Integer.class, "getEnable"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::isBasicFile, Integer.class, "isBasicFile"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::isRetention, Integer.class, "isRetention"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::isSecureFile, Integer.class, "isSecureFile"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::getKeepDuplicate, Integer.class, "getKeepDuplicate"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleLobStorageClause::getLogging, Integer.class, "getLogging"),
                getOid(x.getPctversion()),
                getOid(x.getSegementName()),
                getOid(x.getStorageClause())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleReturningClause x) {
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleReturningClause(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleStorageClause x) {
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStorageClause(
                getOid(x),
                getOid(x.getBufferPool()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleStorageClause::getCellFlashCache, String.class, "getCellFlashCache"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleStorageClause::getFlashCache, String.class, "getFlashCache"),
                getOid(x.getFreeListGroups()),
                getOid(x.getFreeLists()),
                getOid(x.getInitial()),
                getOid(x.getMaxExtents()),
                getOid(x.getMaxSize()),
                getOid(x.getMinExtents()),
                getOid(x.getNext()),
                getOid(x.getObjno()),
                getOid(x.getPctIncrease())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.clause.OracleWithSubqueryEntry x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleWithSubqueryEntry(
                getOid(x),
                getOid(x.getCycleClause()),
                getOid(x.getSearchClause())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.clause.PartitionExtensionClause x) {
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PartitionExtensionClause(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.PartitionExtensionClause::isSubPartition, Integer.class, "isSubPartition"),
                getOid(x.getPartition())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.clause.SampleClause x) {
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SampleClause(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.SampleClause::isBlock, Integer.class, "isBlock"),
                getOid(x.getSeedValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.clause.SearchClause x) {
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SearchClause(
                getOid(x),
                getOid(x.getOrderingColumn()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.clause.SearchClause::getType, String.class, "getType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleAnalytic x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleAnalytic(
                getOid(x),
                getOid(x.getWindowing())
        ));

        return this.visit((com.alibaba.druid.sql.ast.SQLOver) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleAnalyticWindowing x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleAnalyticWindowing(
                getOid(x),
                getOid(x.getExpr()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleAnalyticWindowing::getType, String.class, "getType")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleArgumentExpr x) {
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleArgumentExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleArgumentExpr::getArgumentName, String.class, "getArgumentName"),
                getOid(x.getValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleBinaryDoubleExpr x) {
        // SQLNumericLiteralExpr is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlNumericLiteralExpr(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleBinaryDoubleExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleBinaryDoubleExpr::getNumber, String.class, "getNumber"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleBinaryDoubleExpr::getValue, String.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleBinaryFloatExpr x) {
        // SQLNumericLiteralExpr is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlNumericLiteralExpr(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleBinaryFloatExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleBinaryFloatExpr::getNumber, String.class, "getNumber"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleBinaryFloatExpr::getValue, String.class, "getValue")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleCursorExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleCursorExpr(
                getOid(x),
                getOid(x.getQuery())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleDatetimeExpr x) {
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleDatetimeExpr(
                getOid(x),
                getOid(x.getExpr()),
                getOid(x.getTimeZone())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleIntervalExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleIntervalExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleIntervalExpr::getFactionalSecondsPrecision, Integer.class, "getFactionalSecondsPrecision"),
                getOid(x.getPrecision()),
                getOid(x.getToFactionalSecondsPrecision()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleIntervalExpr::getToType, String.class, "getToType"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleIntervalExpr::getType, String.class, "getType"),
                getOid(x.getValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleIsOfTypeExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleIsOfTypeExpr(
                getOid(x),
                getOid(x.getExpr())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleIsSetExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleIsSetExpr(
                getOid(x),
                getOid(x.getNestedTable())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleOuterExpr x) {
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleOuterExpr(
                getOid(x),
                getOid(x.getExpr())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleRangeExpr x) {
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleRangeExpr(
                getOid(x),
                getOid(x.getLowBound()),
                getOid(x.getUpBound())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleSysdateExpr x) {
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSysdateExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleSysdateExpr::getOption, String.class, "getOption")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleTreatExpr x) {
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleTreatExpr(
                getOid(x),
                getOid(x.getExpr()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.expr.OracleTreatExpr::isRef, Integer.class, "isRef"),
                getOid(x.getType())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterSessionStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterSessionStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleAlterSessionStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterSynonymStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterSynonymStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleAlterSynonymStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterSynonymStatement::getEnable, Integer.class, "getEnable"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterSynonymStatement::isCompile, Integer.class, "isCompile"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterTableDropPartition x) {
        // OracleAlterTableItem is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleAlterTableItem(
                getOid(x)
        ));
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleAlterTableDropPartition(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterTableModify x) {
        // OracleAlterTableItem is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleAlterTableItem(
                getOid(x)
        ));
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleAlterTableModify(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterTableMoveTablespace x) {
        // OracleAlterTableItem is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleAlterTableItem(
                getOid(x)
        ));
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleAlterTableMoveTablespace(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterTableSplitPartition x) {
        // OracleAlterTableItem is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleAlterTableItem(
                getOid(x)
        ));
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleAlterTableSplitPartition(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterTableSplitPartition::getInto, String.class, "getInto"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterTableSplitPartition::getUpdateIndexes, String.class, "getUpdateIndexes")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterTableTruncatePartition x) {
        // OracleAlterTableItem is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleAlterTableItem(
                getOid(x)
        ));
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleAlterTableTruncatePartition(
                getOid(x),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterTablespaceAddDataFile x) {
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleAlterTablespaceAddDataFile(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterTablespaceStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterTablespaceStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleAlterTablespaceStatement(
                getOid(x),
                getOid(x.getItem()),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterTriggerStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterTriggerStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleAlterTriggerStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterTriggerStatement::getEnable, Integer.class, "getEnable"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterTriggerStatement::isCompile, Integer.class, "isCompile"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterViewStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterViewStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleAlterViewStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterViewStatement::getEnable, Integer.class, "getEnable"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleAlterViewStatement::isCompile, Integer.class, "isCompile"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCheck x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleCheck(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCheck::getDeferrable, Integer.class, "getDeferrable"),
                getOid(x.getExceptionsInto()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCheck::getInitially, String.class, "getInitially"),
                getOid(x.getUsing())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLCheck) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleContinueStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleContinueStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleContinueStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleContinueStatement::getLabel, String.class, "getLabel"),
                getOid(x.getWhen())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateDatabaseDbLinkStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateDatabaseDbLinkStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleCreateDatabaseDbLinkStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateDatabaseDbLinkStatement::getAuthenticatedPassword, String.class, "getAuthenticatedPassword"),
                getOid(x.getAuthenticatedUser()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateDatabaseDbLinkStatement::isPublic, Integer.class, "isPublic"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateDatabaseDbLinkStatement::isShared, Integer.class, "isShared"),
                getOid(x.getName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateDatabaseDbLinkStatement::getPassword, String.class, "getPassword"),
                getOid(x.getUser()),
                getOid(x.getUsing())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleCreateIndexStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::getCompress, Integer.class, "getCompress"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::getCompressLevel, Integer.class, "getCompressLevel"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::getEnable, Integer.class, "getEnable"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::getFreeLists, Integer.class, "getFreeLists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::getInitrans, Integer.class, "getInitrans"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::isCluster, Integer.class, "isCluster"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::isCompressForOltp, Integer.class, "isCompressForOltp"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::isComputeStatistics, Integer.class, "isComputeStatistics"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::isGlobal, Integer.class, "isGlobal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::isIndexOnlyTopLevel, Integer.class, "isIndexOnlyTopLevel"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::isLocal, Integer.class, "isLocal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::isNoParallel, Integer.class, "isNoParallel"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::isOnline, Integer.class, "isOnline"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::isReverse, Integer.class, "isReverse"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::getLogging, Integer.class, "getLogging"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::getMaxtrans, Integer.class, "getMaxtrans"),
                getOid(x.getParallel()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::getPctfree, Integer.class, "getPctfree"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::getPctincrease, Integer.class, "getPctincrease"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::getPctthreshold, Integer.class, "getPctthreshold"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::getPctused, Integer.class, "getPctused"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::getSort, Integer.class, "getSort"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateIndexStatement::getStorage, String.class, "getStorage"),
                getOid(x.getTablespace())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLCreateIndexStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreatePackageStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreatePackageStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleCreatePackageStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreatePackageStatement::isBody, Integer.class, "isBody"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreatePackageStatement::isOrReplace, Integer.class, "isOrReplace"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateSynonymStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateSynonymStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleCreateSynonymStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateSynonymStatement::isOrReplace, Integer.class, "isOrReplace"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateSynonymStatement::isPublic, Integer.class, "isPublic"),
                getOid(x.getName()),
                getOid(x.getObject())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTableStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleCreateTableStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTableStatement::getCache, Integer.class, "getCache"),
                getOid(x.getCluster()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTableStatement::getCompressLevel, Integer.class, "getCompressLevel"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTableStatement::getDeferredSegmentCreation, String.class, "getDeferredSegmentCreation"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTableStatement::getEnableRowMovement, Integer.class, "getEnableRowMovement"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTableStatement::getInitrans, Integer.class, "getInitrans"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTableStatement::isCompressForOltp, Integer.class, "isCompressForOltp"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTableStatement::isCursorSpecificSegment, Integer.class, "isCursorSpecificSegment"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTableStatement::isInMemoryMetadata, Integer.class, "isInMemoryMetadata"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTableStatement::isMonitoring, Integer.class, "isMonitoring"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTableStatement::isOnCommitDeleteRows, Integer.class, "isOnCommitDeleteRows"),
                getOid(x.getLobStorage()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTableStatement::getMaxtrans, Integer.class, "getMaxtrans"),
                getOid(x.getOf()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTableStatement::getOidIndex, String.class, "getOidIndex"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTableStatement::getOrganization, String.class, "getOrganization"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTableStatement::getParallel, Integer.class, "getParallel"),
                getOid(x.getParallelValue()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTableStatement::getPctfree, Integer.class, "getPctfree"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTableStatement::getPctincrease, Integer.class, "getPctincrease"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTableStatement::getPctused, Integer.class, "getPctused"),
                getOid(x.getStorage()),
                getOid(x.getXmlTypeColumnProperties())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTypeStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTypeStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleCreateTypeStatement(
                getOid(x),
                getOid(x.getAuthId()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTypeStatement::getInstantiable, Integer.class, "getInstantiable"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTypeStatement::isBody, Integer.class, "isBody"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTypeStatement::getFinal, Integer.class, "getFinal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTypeStatement::isForce, Integer.class, "isForce"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTypeStatement::isObject, Integer.class, "isObject"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTypeStatement::isOrReplace, Integer.class, "isOrReplace"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTypeStatement::isParen, Integer.class, "isParen"),
                getOid(x.getName()),
                getOid(x.getOid()),
                getOid(x.getTableOf()),
                getOid(x.getUnder()),
                getOid(x.getVarrayDataType()),
                getOid(x.getVarraySizeLimit()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleCreateTypeStatement::getWrappedSource, String.class, "getWrappedSource")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleDeleteStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleDeleteStatement(
                getOid(x),
                getOid(x.getReturning())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLDeleteStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleDropDbLinkStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleDropDbLinkStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleDropDbLinkStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleDropDbLinkStatement::isPublic, Integer.class, "isPublic"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleExceptionStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleExceptionStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleExceptionStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleExceptionStatement::getItems, String.class, "getItems")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleExecuteImmediateStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleExecuteImmediateStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleExecuteImmediateStatement(
                getOid(x),
                getOid(x.getDynamicSql())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleExitStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleExitStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleExitStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleExitStatement::getLabel, String.class, "getLabel"),
                getOid(x.getWhen())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleExplainStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleExplainStatement(
                getOid(x),
                getOid(x.getInto()),
                getOid(x.getStatementId())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLExplainStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleFileSpecification x) {
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleFileSpecification(
                getOid(x),
                getOid(x.getAutoExtendOn()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleFileSpecification::isAutoExtendOff, Integer.class, "isAutoExtendOff"),
                getOid(x.getSize())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleForStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleForStatement(
                getOid(x),
                getOid(x.getEndLabel()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleForStatement::isAll, Integer.class, "isAll")
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLForStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleForeignKey x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleForeignKey(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleForeignKey::getDeferrable, Integer.class, "getDeferrable"),
                getOid(x.getExceptionsInto()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleForeignKey::getInitially, String.class, "getInitially"),
                getOid(x.getUsing())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLForeignKeyImpl) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleGotoStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleGotoStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleGotoStatement(
                getOid(x),
                getOid(x.getLabel())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleInsertStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleInsertStatement(
                getOid(x),
                getOid(x.getErrorLogging()),
                getOid(x.getReturning())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLInsertStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleLabelStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleLabelStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleLabelStatement(
                getOid(x),
                getOid(x.getLabel())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleLockTableStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleLockTableStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleLockTableStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleLockTableStatement::isNoWait, Integer.class, "isNoWait"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleLockTableStatement::getLockMode, String.class, "getLockMode"),
                getOid(x.getPartition()),
                getOid(x.getTable()),
                getOid(x.getWait())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleMultiInsertStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleMultiInsertStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleMultiInsertStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleMultiInsertStatement::getEntries, String.class, "getEntries"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleMultiInsertStatement::getOption, String.class, "getOption"),
                getOid(x.getSubQuery())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OraclePipeRowStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OraclePipeRowStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OraclePipeRowStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OraclePrimaryKey x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OraclePrimaryKey(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OraclePrimaryKey::getDeferrable, Integer.class, "getDeferrable"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OraclePrimaryKey::getEnable, Integer.class, "getEnable"),
                getOid(x.getExceptionsInto()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OraclePrimaryKey::getInitially, String.class, "getInitially"),
                getOid(x.getUsing())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLPrimaryKeyImpl) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleRaiseStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleRaiseStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleRaiseStatement(
                getOid(x),
                getOid(x.getException())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleRunStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleRunStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleRunStatement(
                getOid(x),
                getOid(x.getExpr())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSelectJoin x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSelectJoin(
                getOid(x),
                getOid(x.getPivot())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLJoinTableSource) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSelectPivot x) {
        // OracleSelectPivotBase is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSelectPivotBase(
                getOid(x)
        ));
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSelectPivot(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSelectPivot::isXml, Integer.class, "isXml"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSelectPivot::getItems, String.class, "getItems"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSelectPivot::getPivotIn, String.class, "getPivotIn")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSelectQueryBlock x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSelectQueryBlock(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSelectQueryBlock::isSkipLocked, Integer.class, "isSkipLocked"),
                getOid(x.getModelClause())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSelectSubqueryTableSource x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSelectSubqueryTableSource(
                getOid(x),
                getOid(x.getPivot())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLSubqueryTableSource) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSelectTableReference x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSelectTableReference(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSelectTableReference::isOnly, Integer.class, "isOnly"),
                getOid(x.getPartition()),
                getOid(x.getPivot()),
                getOid(x.getSampleClause())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLExprTableSource) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSelectUnPivot x) {
        // OracleSelectPivotBase is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSelectPivotBase(
                getOid(x)
        ));
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSelectUnPivot(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSelectUnPivot::getNullsIncludeType, String.class, "getNullsIncludeType"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSelectUnPivot::getPivotIn, String.class, "getPivotIn")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSetTransactionStatement x) {
        // OracleStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSetTransactionStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSetTransactionStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSetTransactionStatement::isReadOnly, Integer.class, "isReadOnly"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSetTransactionStatement::isWrite, Integer.class, "isWrite"),
                getOid(x.getName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSupplementalIdKey x) {
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSupplementalIdKey(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSupplementalIdKey::isAll, Integer.class, "isAll"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSupplementalIdKey::isForeignKey, Integer.class, "isForeignKey"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSupplementalIdKey::isPrimaryKey, Integer.class, "isPrimaryKey"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSupplementalIdKey::isUnique, Integer.class, "isUnique"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSupplementalIdKey::isUniqueIndex, Integer.class, "isUniqueIndex")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSupplementalLogGrp x) {
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSupplementalLogGrp(
                getOid(x),
                getOid(x.getGroup()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSupplementalLogGrp::isAlways, Integer.class, "isAlways")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUnique x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleUnique(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUnique::getDeferrable, Integer.class, "getDeferrable"),
                getOid(x.getExceptionsInto()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUnique::getInitially, String.class, "getInitially"),
                getOid(x.getUsing())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLUnique) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUpdateStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleUpdateStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUpdateStatement::getAlias, String.class, "getAlias"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUpdateStatement::getHintsSize, Integer.class, "getHintsSize"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUpdateStatement::isOnly, Integer.class, "isOnly")
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLUpdateStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUsingIndexClause x) {
        // OracleSegmentAttributesImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSegmentAttributesImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUsingIndexClause::getCompress, Integer.class, "getCompress"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUsingIndexClause::getCompressLevel, Integer.class, "getCompressLevel"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUsingIndexClause::getFreeLists, Integer.class, "getFreeLists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUsingIndexClause::getInitrans, Integer.class, "getInitrans"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUsingIndexClause::isCompressForOltp, Integer.class, "isCompressForOltp"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUsingIndexClause::getLogging, Integer.class, "getLogging"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUsingIndexClause::getMaxtrans, Integer.class, "getMaxtrans"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUsingIndexClause::getPctfree, Integer.class, "getPctfree"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUsingIndexClause::getPctincrease, Integer.class, "getPctincrease"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUsingIndexClause::getPctthreshold, Integer.class, "getPctthreshold"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUsingIndexClause::getPctused, Integer.class, "getPctused"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUsingIndexClause::getStorage, String.class, "getStorage"),
                getOid(x.getTablespace())
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleUsingIndexClause(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUsingIndexClause::getEnable, Integer.class, "getEnable"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUsingIndexClause::getIndex, String.class, "getIndex"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUsingIndexClause::isComputeStatistics, Integer.class, "isComputeStatistics"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleUsingIndexClause::isReverse, Integer.class, "isReverse")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleXmlColumnProperties x) {
        // OracleSQLObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleSqlObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OracleXmlColumnProperties(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleXmlColumnProperties::getAllowAnySchema, Integer.class, "getAllowAnySchema"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleXmlColumnProperties::getAllowNonSchema, Integer.class, "getAllowNonSchema"),
                getOid(x.getColumn()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleXmlColumnProperties::getStorage, String.class, "getStorage")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oscar.ast.OscarTop x) {
        // OscarObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OscarObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OscarTop(
                getOid(x),
                getOid(x.getExpr()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.OscarTop::isPercent, Integer.class, "isPercent"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.OscarTop::isWithTies, Integer.class, "isWithTies")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarAlterSchemaStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarAlterSchemaStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OscarAlterSchemaStatement(
                getOid(x),
                getOid(x.getNewName()),
                getOid(x.getNewOwner()),
                getOid(x.getSchemaName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarConnectToStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarConnectToStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OscarConnectToStatement(
                getOid(x),
                getOid(x.getTarget())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarCreateSchemaStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarCreateSchemaStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OscarCreateSchemaStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarCreateSchemaStatement::isAuthorization, Integer.class, "isAuthorization"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarCreateSchemaStatement::isIfNotExists, Integer.class, "isIfNotExists"),
                getOid(x.getSchemaName()),
                getOid(x.getUserName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarDeleteStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OscarDeleteStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarDeleteStatement::getAlias, String.class, "getAlias"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarDeleteStatement::isReturning, Integer.class, "isReturning")
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLDeleteStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarDropSchemaStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarDropSchemaStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OscarDropSchemaStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarDropSchemaStatement::isCascade, Integer.class, "isCascade"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarDropSchemaStatement::isIfExists, Integer.class, "isIfExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarDropSchemaStatement::isRestrict, Integer.class, "isRestrict"),
                getOid(x.getSchemaName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarFunctionTableSource x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OscarFunctionTableSource(
                getOid(x)
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLExprTableSource) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarInsertStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OscarInsertStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarInsertStatement::isDefaultValues, Integer.class, "isDefaultValues"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarInsertStatement::isOnConflictDoNothing, Integer.class, "isOnConflictDoNothing"),
                getOid(x.getOnConflictConstraint()),
                getOid(x.getOnConflictUpdateWhere()),
                getOid(x.getOnConflictWhere()),
                getOid(x.getReturning()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarInsertStatement::getValues, String.class, "getValues"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarInsertStatement::getValuesList, String.class, "getValuesList")
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLInsertStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarSelectQueryBlock x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OscarSelectQueryBlock(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarSelectQueryBlock::getFetch, String.class, "getFetch"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarSelectQueryBlock::getForClause, String.class, "getForClause"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarSelectQueryBlock::getIntoOptionLocal, String.class, "getIntoOptionLocal"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarSelectQueryBlock::getIntoOptionTemp, String.class, "getIntoOptionTemp"),
                getOid(x.getTop())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarSelectStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OscarSelectStatement(
                getOid(x)
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLSelectStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarShowStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarShowStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OscarShowStatement(
                getOid(x),
                getOid(x.getExpr())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarStartTransactionStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarStartTransactionStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OscarStartTransactionStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarUpdateStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.OscarUpdateStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.oscar.ast.stmt.OscarUpdateStatement::isOnly, Integer.class, "isOnly")
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLUpdateStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.expr.PGBoxExpr x) {
        // PGExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgExprImpl(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgBoxExpr(
                getOid(x),
                getOid(x.getValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.expr.PGCidrExpr x) {
        // PGExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgExprImpl(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgCidrExpr(
                getOid(x),
                getOid(x.getValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.expr.PGCircleExpr x) {
        // PGExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgExprImpl(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgCircleExpr(
                getOid(x),
                getOid(x.getValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.expr.PGExtractExpr x) {
        // PGExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgExprImpl(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgExtractExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.expr.PGExtractExpr::getField, String.class, "getField"),
                getOid(x.getSource())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.expr.PGInetExpr x) {
        // PGExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgExprImpl(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgInetExpr(
                getOid(x),
                getOid(x.getValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.expr.PGLineSegmentsExpr x) {
        // PGExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgExprImpl(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgLineSegmentsExpr(
                getOid(x),
                getOid(x.getValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.expr.PGMacAddrExpr x) {
        // PGExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgExprImpl(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgMacAddrExpr(
                getOid(x),
                getOid(x.getValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.expr.PGPointExpr x) {
        // PGExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgExprImpl(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgPointExpr(
                getOid(x),
                getOid(x.getValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.expr.PGPolygonExpr x) {
        // PGExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgExprImpl(
                getOid(x)
        ));
        // SQLExprImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlExprImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgPolygonExpr(
                getOid(x),
                getOid(x.getValue())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.expr.PGTypeCastExpr x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgTypeCastExpr(
                getOid(x)
        ));

        return this.visit((com.alibaba.druid.sql.ast.expr.SQLCastExpr) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGAlterSchemaStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGAlterSchemaStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgAlterSchemaStatement(
                getOid(x),
                getOid(x.getNewName()),
                getOid(x.getNewOwner()),
                getOid(x.getSchemaName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGConnectToStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGConnectToStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgConnectToStatement(
                getOid(x),
                getOid(x.getTarget())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGCreateSchemaStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGCreateSchemaStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgCreateSchemaStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGCreateSchemaStatement::isAuthorization, Integer.class, "isAuthorization"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGCreateSchemaStatement::isIfNotExists, Integer.class, "isIfNotExists"),
                getOid(x.getSchemaName()),
                getOid(x.getUserName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGDeleteStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgDeleteStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGDeleteStatement::getAlias, String.class, "getAlias"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGDeleteStatement::isReturning, Integer.class, "isReturning")
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLDeleteStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGDropSchemaStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGDropSchemaStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgDropSchemaStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGDropSchemaStatement::isCascade, Integer.class, "isCascade"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGDropSchemaStatement::isIfExists, Integer.class, "isIfExists"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGDropSchemaStatement::isRestrict, Integer.class, "isRestrict"),
                getOid(x.getSchemaName())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGFunctionTableSource x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgFunctionTableSource(
                getOid(x)
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLExprTableSource) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGInsertStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgInsertStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGInsertStatement::isDefaultValues, Integer.class, "isDefaultValues"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGInsertStatement::isOnConflictDoNothing, Integer.class, "isOnConflictDoNothing"),
                getOid(x.getOnConflictConstraint()),
                getOid(x.getOnConflictUpdateWhere()),
                getOid(x.getOnConflictWhere()),
                getOid(x.getReturning()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGInsertStatement::getValues, String.class, "getValues"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGInsertStatement::getValuesList, String.class, "getValuesList")
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLInsertStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGSelectQueryBlock x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgSelectQueryBlock(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGSelectQueryBlock::getFetch, String.class, "getFetch"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGSelectQueryBlock::getForClause, String.class, "getForClause"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGSelectQueryBlock::getIntoOption, String.class, "getIntoOption")
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGSelectStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgSelectStatement(
                getOid(x)
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLSelectStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGShowStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGShowStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgShowStatement(
                getOid(x),
                getOid(x.getExpr())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGStartTransactionStatement x) {
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGStartTransactionStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgStartTransactionStatement(
                getOid(x)
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGUpdateStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.PgUpdateStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.postgresql.ast.stmt.PGUpdateStatement::isOnly, Integer.class, "isOnly")
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLUpdateStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.sqlserver.ast.SQLServerOutput x) {
        // SQLServerObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlServerObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlServerOutput(
                getOid(x),
                getOid(x.getInto())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.sqlserver.ast.SQLServerSelectQueryBlock x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlServerSelectQueryBlock(
                getOid(x),
                getOid(x.getTop())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.sqlserver.ast.SQLServerTop x) {
        // SQLServerObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlServerObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlServerTop(
                getOid(x),
                getOid(x.getExpr()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.sqlserver.ast.SQLServerTop::isPercent, Integer.class, "isPercent"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.sqlserver.ast.SQLServerTop::isWithTies, Integer.class, "isWithTies")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.sqlserver.ast.expr.SQLServerObjectReferenceExpr x) {
        // SQLServerObjectImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlServerObjectImpl(
                getOid(x)
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlServerObjectReferenceExpr(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.sqlserver.ast.expr.SQLServerObjectReferenceExpr::getDatabase, String.class, "getDatabase"),
                getOid(x.getResolvedColumn()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.sqlserver.ast.expr.SQLServerObjectReferenceExpr::getSchema, String.class, "getSchema"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.sqlserver.ast.expr.SQLServerObjectReferenceExpr::getServer, String.class, "getServer"),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.sqlserver.ast.expr.SQLServerObjectReferenceExpr::getSimpleName, String.class, "getSimpleName")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.sqlserver.ast.stmt.SQLServerExecStatement x) {
        // SQLServerStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlServerStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.sqlserver.ast.stmt.SQLServerExecStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlServerExecStatement(
                getOid(x),
                getOid(x.getModuleName()),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.sqlserver.ast.stmt.SQLServerExecStatement::getParameters, String.class, "getParameters"),
                getOid(x.getReturnStatus())
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.sqlserver.ast.stmt.SQLServerInsertStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlServerInsertStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.sqlserver.ast.stmt.SQLServerInsertStatement::isDefaultValues, Integer.class, "isDefaultValues"),
                getOid(x.getOutput()),
                getOid(x.getTop())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLInsertStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.sqlserver.ast.stmt.SQLServerRollbackStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlServerRollbackStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.sqlserver.ast.stmt.SQLServerRollbackStatement::isWork, Integer.class, "isWork"),
                getOid(x.getName())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLRollbackStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.sqlserver.ast.stmt.SQLServerSetTransactionIsolationLevelStatement x) {
        // SQLServerStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlServerStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.sqlserver.ast.stmt.SQLServerSetTransactionIsolationLevelStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlServerSetTransactionIsolationLevelStatement(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.sqlserver.ast.stmt.SQLServerSetTransactionIsolationLevelStatement::getLevel, String.class, "getLevel")
        ));

        return true;
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.sqlserver.ast.stmt.SQLServerUpdateStatement x) {
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlServerUpdateStatement(
                getOid(x),
                getOid(x.getOutput()),
                getOid(x.getTop())
        ));

        return this.visit((com.alibaba.druid.sql.ast.statement.SQLUpdateStatement) x);
    }
    
    @Override
    public boolean visit(com.alibaba.druid.sql.dialect.sqlserver.ast.stmt.SQLServerWaitForStatement x) {
        // SQLServerStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlServerStatementImpl(
                getOid(x)
        ));
        // SQLStatementImpl is abstract and doesn't have a visitor method, extract it here.
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlStatementImpl(
                getOid(x),
                JavaObject2CorefDataConverter.convert(x, com.alibaba.druid.sql.dialect.sqlserver.ast.stmt.SQLServerWaitForStatement::isAfterSemi, Integer.class, "isAfterSemi")
        ));
        
        corefStorage.store(new com.alipay.codequery.dal.mybatis.domain.SqlServerWaitForStatement(
                getOid(x),
                getOid(x.getDelay()),
                getOid(x.getStatement()),
                getOid(x.getTime()),
                getOid(x.getTimeout())
        ));

        return true;
    }
    
}