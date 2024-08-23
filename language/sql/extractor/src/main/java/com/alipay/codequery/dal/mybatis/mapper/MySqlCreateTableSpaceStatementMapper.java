package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlCreateTableSpaceStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlCreateTableSpaceStatement;
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
public interface MySqlCreateTableSpaceStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, addDataFileOid, autoExtentSizeOid, commentOid, engineOid, extentSizeOid, fileBlockSizeOid, initialSizeOid, isWait, logFileGroupOid, maxSizeOid, nameOid, nodeGroupOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlCreateTableSpaceStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlCreateTableSpaceStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="add_data_file_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="auto_extent_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="engine_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="extent_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="file_block_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initial_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_wait", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="log_file_group_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="node_group_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlCreateTableSpaceStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="add_data_file_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="auto_extent_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="comment_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="engine_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="extent_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="file_block_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="initial_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_wait", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="log_file_group_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="max_size_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="node_group_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlCreateTableSpaceStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlCreateTableSpaceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlCreateTableSpaceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    default int insert(MySqlCreateTableSpaceStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlCreateTableSpaceStatement, c ->
            c.map(oid).toProperty("oid")
            .map(addDataFileOid).toProperty("addDataFileOid")
            .map(autoExtentSizeOid).toProperty("autoExtentSizeOid")
            .map(commentOid).toProperty("commentOid")
            .map(engineOid).toProperty("engineOid")
            .map(extentSizeOid).toProperty("extentSizeOid")
            .map(fileBlockSizeOid).toProperty("fileBlockSizeOid")
            .map(initialSizeOid).toProperty("initialSizeOid")
            .map(isWait).toProperty("isWait")
            .map(logFileGroupOid).toProperty("logFileGroupOid")
            .map(maxSizeOid).toProperty("maxSizeOid")
            .map(nameOid).toProperty("nameOid")
            .map(nodeGroupOid).toProperty("nodeGroupOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    default int insertMultiple(Collection<MySqlCreateTableSpaceStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlCreateTableSpaceStatement, c ->
            c.map(oid).toProperty("oid")
            .map(addDataFileOid).toProperty("addDataFileOid")
            .map(autoExtentSizeOid).toProperty("autoExtentSizeOid")
            .map(commentOid).toProperty("commentOid")
            .map(engineOid).toProperty("engineOid")
            .map(extentSizeOid).toProperty("extentSizeOid")
            .map(fileBlockSizeOid).toProperty("fileBlockSizeOid")
            .map(initialSizeOid).toProperty("initialSizeOid")
            .map(isWait).toProperty("isWait")
            .map(logFileGroupOid).toProperty("logFileGroupOid")
            .map(maxSizeOid).toProperty("maxSizeOid")
            .map(nameOid).toProperty("nameOid")
            .map(nodeGroupOid).toProperty("nodeGroupOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    default int insertSelective(MySqlCreateTableSpaceStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlCreateTableSpaceStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(addDataFileOid).toPropertyWhenPresent("addDataFileOid", record::getAddDataFileOid)
            .map(autoExtentSizeOid).toPropertyWhenPresent("autoExtentSizeOid", record::getAutoExtentSizeOid)
            .map(commentOid).toPropertyWhenPresent("commentOid", record::getCommentOid)
            .map(engineOid).toPropertyWhenPresent("engineOid", record::getEngineOid)
            .map(extentSizeOid).toPropertyWhenPresent("extentSizeOid", record::getExtentSizeOid)
            .map(fileBlockSizeOid).toPropertyWhenPresent("fileBlockSizeOid", record::getFileBlockSizeOid)
            .map(initialSizeOid).toPropertyWhenPresent("initialSizeOid", record::getInitialSizeOid)
            .map(isWait).toPropertyWhenPresent("isWait", record::getIsWait)
            .map(logFileGroupOid).toPropertyWhenPresent("logFileGroupOid", record::getLogFileGroupOid)
            .map(maxSizeOid).toPropertyWhenPresent("maxSizeOid", record::getMaxSizeOid)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(nodeGroupOid).toPropertyWhenPresent("nodeGroupOid", record::getNodeGroupOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    default Optional<MySqlCreateTableSpaceStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlCreateTableSpaceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    default List<MySqlCreateTableSpaceStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlCreateTableSpaceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    default List<MySqlCreateTableSpaceStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlCreateTableSpaceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    default Optional<MySqlCreateTableSpaceStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlCreateTableSpaceStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlCreateTableSpaceStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(addDataFileOid).equalTo(record::getAddDataFileOid)
                .set(autoExtentSizeOid).equalTo(record::getAutoExtentSizeOid)
                .set(commentOid).equalTo(record::getCommentOid)
                .set(engineOid).equalTo(record::getEngineOid)
                .set(extentSizeOid).equalTo(record::getExtentSizeOid)
                .set(fileBlockSizeOid).equalTo(record::getFileBlockSizeOid)
                .set(initialSizeOid).equalTo(record::getInitialSizeOid)
                .set(isWait).equalTo(record::getIsWait)
                .set(logFileGroupOid).equalTo(record::getLogFileGroupOid)
                .set(maxSizeOid).equalTo(record::getMaxSizeOid)
                .set(nameOid).equalTo(record::getNameOid)
                .set(nodeGroupOid).equalTo(record::getNodeGroupOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlCreateTableSpaceStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(addDataFileOid).equalToWhenPresent(record::getAddDataFileOid)
                .set(autoExtentSizeOid).equalToWhenPresent(record::getAutoExtentSizeOid)
                .set(commentOid).equalToWhenPresent(record::getCommentOid)
                .set(engineOid).equalToWhenPresent(record::getEngineOid)
                .set(extentSizeOid).equalToWhenPresent(record::getExtentSizeOid)
                .set(fileBlockSizeOid).equalToWhenPresent(record::getFileBlockSizeOid)
                .set(initialSizeOid).equalToWhenPresent(record::getInitialSizeOid)
                .set(isWait).equalToWhenPresent(record::getIsWait)
                .set(logFileGroupOid).equalToWhenPresent(record::getLogFileGroupOid)
                .set(maxSizeOid).equalToWhenPresent(record::getMaxSizeOid)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(nodeGroupOid).equalToWhenPresent(record::getNodeGroupOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    default int updateByPrimaryKey(MySqlCreateTableSpaceStatement record) {
        return update(c ->
            c.set(addDataFileOid).equalTo(record::getAddDataFileOid)
            .set(autoExtentSizeOid).equalTo(record::getAutoExtentSizeOid)
            .set(commentOid).equalTo(record::getCommentOid)
            .set(engineOid).equalTo(record::getEngineOid)
            .set(extentSizeOid).equalTo(record::getExtentSizeOid)
            .set(fileBlockSizeOid).equalTo(record::getFileBlockSizeOid)
            .set(initialSizeOid).equalTo(record::getInitialSizeOid)
            .set(isWait).equalTo(record::getIsWait)
            .set(logFileGroupOid).equalTo(record::getLogFileGroupOid)
            .set(maxSizeOid).equalTo(record::getMaxSizeOid)
            .set(nameOid).equalTo(record::getNameOid)
            .set(nodeGroupOid).equalTo(record::getNodeGroupOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_table_space_statement")
    default int updateByPrimaryKeySelective(MySqlCreateTableSpaceStatement record) {
        return update(c ->
            c.set(addDataFileOid).equalToWhenPresent(record::getAddDataFileOid)
            .set(autoExtentSizeOid).equalToWhenPresent(record::getAutoExtentSizeOid)
            .set(commentOid).equalToWhenPresent(record::getCommentOid)
            .set(engineOid).equalToWhenPresent(record::getEngineOid)
            .set(extentSizeOid).equalToWhenPresent(record::getExtentSizeOid)
            .set(fileBlockSizeOid).equalToWhenPresent(record::getFileBlockSizeOid)
            .set(initialSizeOid).equalToWhenPresent(record::getInitialSizeOid)
            .set(isWait).equalToWhenPresent(record::getIsWait)
            .set(logFileGroupOid).equalToWhenPresent(record::getLogFileGroupOid)
            .set(maxSizeOid).equalToWhenPresent(record::getMaxSizeOid)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(nodeGroupOid).equalToWhenPresent(record::getNodeGroupOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}