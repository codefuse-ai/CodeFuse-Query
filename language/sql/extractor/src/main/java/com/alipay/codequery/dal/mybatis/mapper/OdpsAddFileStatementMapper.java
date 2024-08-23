package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OdpsAddFileStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OdpsAddFileStatement;
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
public interface OdpsAddFileStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, alias, commentOid, file, isForce, type);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OdpsAddFileStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OdpsAddFileStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="alias", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="file", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_force", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<OdpsAddFileStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="alias", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="file", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_force", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="type", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<OdpsAddFileStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, odpsAddFileStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, odpsAddFileStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    default int insert(OdpsAddFileStatement record) {
        return MyBatis3Utils.insert(this::insert, record, odpsAddFileStatement, c ->
            c.map(oid).toProperty("oid")
            .map(alias).toProperty("alias")
            .map(commentOid).toProperty("commentOid")
            .map(file).toProperty("file")
            .map(isForce).toProperty("isForce")
            .map(type).toProperty("type")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    default int insertMultiple(Collection<OdpsAddFileStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, odpsAddFileStatement, c ->
            c.map(oid).toProperty("oid")
            .map(alias).toProperty("alias")
            .map(commentOid).toProperty("commentOid")
            .map(file).toProperty("file")
            .map(isForce).toProperty("isForce")
            .map(type).toProperty("type")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    default int insertSelective(OdpsAddFileStatement record) {
        return MyBatis3Utils.insert(this::insert, record, odpsAddFileStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(alias).toPropertyWhenPresent("alias", record::getAlias)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(file).toPropertyWhenPresent("file", record::getFile)
            .map(isForce).toPropertyWhenPresent("isForce", record::getIsForce)
            .map(type).toPropertyWhenPresent("type", record::getType)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    default Optional<OdpsAddFileStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, odpsAddFileStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    default List<OdpsAddFileStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, odpsAddFileStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    default List<OdpsAddFileStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, odpsAddFileStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    default Optional<OdpsAddFileStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, odpsAddFileStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OdpsAddFileStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(alias).equalTo(record::getAlias)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(file).equalTo(record::getFile)
                .set(isForce).equalTo(record::getIsForce)
                .set(type).equalTo(record::getType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OdpsAddFileStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(alias).equalToWhenPresent(record::getAlias)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(file).equalToWhenPresent(record::getFile)
                .set(isForce).equalToWhenPresent(record::getIsForce)
                .set(type).equalToWhenPresent(record::getType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    default int updateByPrimaryKey(OdpsAddFileStatement record) {
        return update(c ->
            c.set(alias).equalTo(record::getAlias)
            .set(commentOid).equalTo(record::getCommentOid)
            .set(file).equalTo(record::getFile)
            .set(isForce).equalTo(record::getIsForce)
            .set(type).equalTo(record::getType)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    default int updateByPrimaryKeySelective(OdpsAddFileStatement record) {
        return update(c ->
            c.set(alias).equalToWhenPresent(record::getAlias)
            .set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(file).equalToWhenPresent(record::getFile)
            .set(isForce).equalToWhenPresent(record::getIsForce)
            .set(type).equalToWhenPresent(record::getType)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}