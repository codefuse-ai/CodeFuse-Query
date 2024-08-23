package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlAlterTablespaceStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlAlterTablespaceStatement;
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
public interface MySqlAlterTablespaceStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, addDataFileOid, dropDataFileOid, engineOid, initialSizeOid, isWait, nameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlAlterTablespaceStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlAlterTablespaceStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="add_data_file_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="drop_data_file_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="engine_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initial_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_wait", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlAlterTablespaceStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="add_data_file_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="drop_data_file_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="engine_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initial_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_wait", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlAlterTablespaceStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlAlterTablespaceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlAlterTablespaceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    default int insert(MySqlAlterTablespaceStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlAlterTablespaceStatement, c ->
            c.map(oid).toProperty("oid")
            .map(addDataFileOid).toProperty("addDataFileOid")
            .map(dropDataFileOid).toProperty("dropDataFileOid")
            .map(engineOid).toProperty("engineOid")
            .map(initialSizeOid).toProperty("initialSizeOid")
            .map(isWait).toProperty("isWait")
            .map(nameOid).toProperty("nameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    default int insertMultiple(Collection<MySqlAlterTablespaceStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlAlterTablespaceStatement, c ->
            c.map(oid).toProperty("oid")
            .map(addDataFileOid).toProperty("addDataFileOid")
            .map(dropDataFileOid).toProperty("dropDataFileOid")
            .map(engineOid).toProperty("engineOid")
            .map(initialSizeOid).toProperty("initialSizeOid")
            .map(isWait).toProperty("isWait")
            .map(nameOid).toProperty("nameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    default int insertSelective(MySqlAlterTablespaceStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlAlterTablespaceStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(addDataFileOid).toPropertyWhenPresent("addDataFileOid", record::getAddDataFileOid)
            .map(dropDataFileOid).toPropertyWhenPresent("dropDataFileOid", record::getDropDataFileOid)
            .map(engineOid).toPropertyWhenPresent("engineOid", record::getEngineOid)
            .map(initialSizeOid).toPropertyWhenPresent("initialSizeOid", record::getInitialSizeOid)
            .map(isWait).toPropertyWhenPresent("isWait", record::getIsWait)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    default Optional<MySqlAlterTablespaceStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlAlterTablespaceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    default List<MySqlAlterTablespaceStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlAlterTablespaceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    default List<MySqlAlterTablespaceStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlAlterTablespaceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    default Optional<MySqlAlterTablespaceStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlAlterTablespaceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlAlterTablespaceStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(addDataFileOid).equalTo(record::getAddDataFileOid)
                .set(dropDataFileOid).equalTo(record::getDropDataFileOid)
                .set(engineOid).equalTo(record::getEngineOid)
                .set(initialSizeOid).equalTo(record::getInitialSizeOid)
                .set(isWait).equalTo(record::getIsWait)
                .set(nameOid).equalTo(record::getNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlAlterTablespaceStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(addDataFileOid).equalToWhenPresent(record::getAddDataFileOid)
                .set(dropDataFileOid).equalToWhenPresent(record::getDropDataFileOid)
                .set(engineOid).equalToWhenPresent(record::getEngineOid)
                .set(initialSizeOid).equalToWhenPresent(record::getInitialSizeOid)
                .set(isWait).equalToWhenPresent(record::getIsWait)
                .set(nameOid).equalToWhenPresent(record::getNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    default int updateByPrimaryKey(MySqlAlterTablespaceStatement record) {
        return update(c ->
            c.set(addDataFileOid).equalTo(record::getAddDataFileOid)
            .set(dropDataFileOid).equalTo(record::getDropDataFileOid)
            .set(engineOid).equalTo(record::getEngineOid)
            .set(initialSizeOid).equalTo(record::getInitialSizeOid)
            .set(isWait).equalTo(record::getIsWait)
            .set(nameOid).equalTo(record::getNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_tablespace_statement")
    default int updateByPrimaryKeySelective(MySqlAlterTablespaceStatement record) {
        return update(c ->
            c.set(addDataFileOid).equalToWhenPresent(record::getAddDataFileOid)
            .set(dropDataFileOid).equalToWhenPresent(record::getDropDataFileOid)
            .set(engineOid).equalToWhenPresent(record::getEngineOid)
            .set(initialSizeOid).equalToWhenPresent(record::getInitialSizeOid)
            .set(isWait).equalToWhenPresent(record::getIsWait)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}