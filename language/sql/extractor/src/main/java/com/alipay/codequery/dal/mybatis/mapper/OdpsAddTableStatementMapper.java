package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OdpsAddTableStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OdpsAddTableStatement;
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
public interface OdpsAddTableStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, commentOid, isForce, tableOid, toPackageOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OdpsAddTableStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OdpsAddTableStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_force", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_package_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OdpsAddTableStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_force", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="to_package_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OdpsAddTableStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, odpsAddTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, odpsAddTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    default int insert(OdpsAddTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, odpsAddTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(commentOid).toProperty("commentOid")
            .map(isForce).toProperty("isForce")
            .map(tableOid).toProperty("tableOid")
            .map(toPackageOid).toProperty("toPackageOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    default int insertMultiple(Collection<OdpsAddTableStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, odpsAddTableStatement, c ->
            c.map(oid).toProperty("oid")
            .map(commentOid).toProperty("commentOid")
            .map(isForce).toProperty("isForce")
            .map(tableOid).toProperty("tableOid")
            .map(toPackageOid).toProperty("toPackageOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    default int insertSelective(OdpsAddTableStatement record) {
        return MyBatis3Utils.insert(this::insert, record, odpsAddTableStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(isForce).toPropertyWhenPresent("isForce", record::getIsForce)
            .map(tableOid).toPropertyWhenPresent("tableOid", record::getTableOid)
            .map(toPackageOid).toPropertyWhenPresent("toPackageOid", record::getToPackageOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    default Optional<OdpsAddTableStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, odpsAddTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    default List<OdpsAddTableStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, odpsAddTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    default List<OdpsAddTableStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, odpsAddTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    default Optional<OdpsAddTableStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, odpsAddTableStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OdpsAddTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(isForce).equalTo(record::getIsForce)
                .set(tableOid).equalTo(record::getTableOid)
                .set(toPackageOid).equalTo(record::getToPackageOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OdpsAddTableStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(isForce).equalToWhenPresent(record::getIsForce)
                .set(tableOid).equalToWhenPresent(record::getTableOid)
                .set(toPackageOid).equalToWhenPresent(record::getToPackageOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    default int updateByPrimaryKey(OdpsAddTableStatement record) {
        return update(c ->
            c.set(commentOid).equalTo(record::getCommentOid)
            .set(isForce).equalTo(record::getIsForce)
            .set(tableOid).equalTo(record::getTableOid)
            .set(toPackageOid).equalTo(record::getToPackageOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    default int updateByPrimaryKeySelective(OdpsAddTableStatement record) {
        return update(c ->
            c.set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(isForce).equalToWhenPresent(record::getIsForce)
            .set(tableOid).equalToWhenPresent(record::getTableOid)
            .set(toPackageOid).equalToWhenPresent(record::getToPackageOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}