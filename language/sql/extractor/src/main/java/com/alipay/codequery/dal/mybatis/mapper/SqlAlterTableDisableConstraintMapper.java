package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlAlterTableDisableConstraintDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlAlterTableDisableConstraint;
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
public interface SqlAlterTableDisableConstraintMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    BasicColumn[] selectList = BasicColumn.columnList(oid, constraintNameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlAlterTableDisableConstraint> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlAlterTableDisableConstraint> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="constraint_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlAlterTableDisableConstraint> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="constraint_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlAlterTableDisableConstraint> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlAlterTableDisableConstraint, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlAlterTableDisableConstraint, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    default int insert(SqlAlterTableDisableConstraint record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterTableDisableConstraint, c ->
            c.map(oid).toProperty("oid")
            .map(constraintNameOid).toProperty("constraintNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    default int insertMultiple(Collection<SqlAlterTableDisableConstraint> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlAlterTableDisableConstraint, c ->
            c.map(oid).toProperty("oid")
            .map(constraintNameOid).toProperty("constraintNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    default int insertSelective(SqlAlterTableDisableConstraint record) {
        return MyBatis3Utils.insert(this::insert, record, sqlAlterTableDisableConstraint, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(constraintNameOid).toPropertyWhenPresent("constraintNameOid", record::getConstraintNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    default Optional<SqlAlterTableDisableConstraint> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlAlterTableDisableConstraint, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    default List<SqlAlterTableDisableConstraint> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlAlterTableDisableConstraint, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    default List<SqlAlterTableDisableConstraint> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlAlterTableDisableConstraint, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    default Optional<SqlAlterTableDisableConstraint> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlAlterTableDisableConstraint, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlAlterTableDisableConstraint record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(constraintNameOid).equalTo(record::getConstraintNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlAlterTableDisableConstraint record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(constraintNameOid).equalToWhenPresent(record::getConstraintNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    default int updateByPrimaryKey(SqlAlterTableDisableConstraint record) {
        return update(c ->
            c.set(constraintNameOid).equalTo(record::getConstraintNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_disable_constraint")
    default int updateByPrimaryKeySelective(SqlAlterTableDisableConstraint record) {
        return update(c ->
            c.set(constraintNameOid).equalToWhenPresent(record::getConstraintNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}