package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlDescribeStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlDescribeStatement;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface SqlDescribeStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, columnOid, isExtended, isFormatted, objectOid, objectType);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlDescribeStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlDescribeStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_extended", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_formatted", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="object_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="object_type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<SqlDescribeStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="column_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_extended", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_formatted", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="object_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="object_type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<SqlDescribeStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlDescribeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlDescribeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    default int insert(SqlDescribeStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDescribeStatement, c ->
            c.map(oid).toProperty("oid")
            .map(columnOid).toProperty("columnOid")
            .map(isExtended).toProperty("isExtended")
            .map(isFormatted).toProperty("isFormatted")
            .map(objectOid).toProperty("objectOid")
            .map(objectType).toProperty("objectType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    default int insertMultiple(Collection<SqlDescribeStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlDescribeStatement, c ->
            c.map(oid).toProperty("oid")
            .map(columnOid).toProperty("columnOid")
            .map(isExtended).toProperty("isExtended")
            .map(isFormatted).toProperty("isFormatted")
            .map(objectOid).toProperty("objectOid")
            .map(objectType).toProperty("objectType")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    default int insertSelective(SqlDescribeStatement record) {
        return MyBatis3Utils.insert(this::insert, record, sqlDescribeStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(columnOid).toPropertyWhenPresent("columnOid", record::getColumnOid)
            .map(isExtended).toPropertyWhenPresent("isExtended", record::getIsExtended)
            .map(isFormatted).toPropertyWhenPresent("isFormatted", record::getIsFormatted)
            .map(objectOid).toPropertyWhenPresent("objectOid", record::getObjectOid)
            .map(objectType).toPropertyWhenPresent("objectType", record::getObjectType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    default Optional<SqlDescribeStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlDescribeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    default List<SqlDescribeStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlDescribeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    default List<SqlDescribeStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlDescribeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    default Optional<SqlDescribeStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlDescribeStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlDescribeStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(columnOid).equalTo(record::getColumnOid)
                .set(isExtended).equalTo(record::getIsExtended)
                .set(isFormatted).equalTo(record::getIsFormatted)
                .set(objectOid).equalTo(record::getObjectOid)
                .set(objectType).equalTo(record::getObjectType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlDescribeStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(columnOid).equalToWhenPresent(record::getColumnOid)
                .set(isExtended).equalToWhenPresent(record::getIsExtended)
                .set(isFormatted).equalToWhenPresent(record::getIsFormatted)
                .set(objectOid).equalToWhenPresent(record::getObjectOid)
                .set(objectType).equalToWhenPresent(record::getObjectType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    default int updateByPrimaryKey(SqlDescribeStatement record) {
        return update(c ->
            c.set(columnOid).equalTo(record::getColumnOid)
            .set(isExtended).equalTo(record::getIsExtended)
            .set(isFormatted).equalTo(record::getIsFormatted)
            .set(objectOid).equalTo(record::getObjectOid)
            .set(objectType).equalTo(record::getObjectType)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_describe_statement")
    default int updateByPrimaryKeySelective(SqlDescribeStatement record) {
        return update(c ->
            c.set(columnOid).equalToWhenPresent(record::getColumnOid)
            .set(isExtended).equalToWhenPresent(record::getIsExtended)
            .set(isFormatted).equalToWhenPresent(record::getIsFormatted)
            .set(objectOid).equalToWhenPresent(record::getObjectOid)
            .set(objectType).equalToWhenPresent(record::getObjectType)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}