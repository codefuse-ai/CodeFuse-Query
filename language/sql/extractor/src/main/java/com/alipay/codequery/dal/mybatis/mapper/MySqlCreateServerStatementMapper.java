package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlCreateServerStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlCreateServerStatement;
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
public interface MySqlCreateServerStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, databaseOid, foreignDataWrapperOid, hostOid, nameOid, ownerOid, passwordOid, portOid, socketOid, userOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlCreateServerStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlCreateServerStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="database_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="foreign_data_wrapper_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="host_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="owner_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="password_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="port_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="socket_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="user_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlCreateServerStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="database_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="foreign_data_wrapper_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="host_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="owner_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="password_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="port_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="socket_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="user_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlCreateServerStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlCreateServerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlCreateServerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    default int insert(MySqlCreateServerStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlCreateServerStatement, c ->
            c.map(oid).toProperty("oid")
            .map(databaseOid).toProperty("databaseOid")
            .map(foreignDataWrapperOid).toProperty("foreignDataWrapperOid")
            .map(hostOid).toProperty("hostOid")
            .map(nameOid).toProperty("nameOid")
            .map(ownerOid).toProperty("ownerOid")
            .map(passwordOid).toProperty("passwordOid")
            .map(portOid).toProperty("portOid")
            .map(socketOid).toProperty("socketOid")
            .map(userOid).toProperty("userOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    default int insertMultiple(Collection<MySqlCreateServerStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlCreateServerStatement, c ->
            c.map(oid).toProperty("oid")
            .map(databaseOid).toProperty("databaseOid")
            .map(foreignDataWrapperOid).toProperty("foreignDataWrapperOid")
            .map(hostOid).toProperty("hostOid")
            .map(nameOid).toProperty("nameOid")
            .map(ownerOid).toProperty("ownerOid")
            .map(passwordOid).toProperty("passwordOid")
            .map(portOid).toProperty("portOid")
            .map(socketOid).toProperty("socketOid")
            .map(userOid).toProperty("userOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    default int insertSelective(MySqlCreateServerStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlCreateServerStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(databaseOid).toPropertyWhenPresent("databaseOid", record::getDatabaseOid)
            .map(foreignDataWrapperOid).toPropertyWhenPresent("foreignDataWrapperOid", record::getForeignDataWrapperOid)
            .map(hostOid).toPropertyWhenPresent("hostOid", record::getHostOid)
            .map(nameOid).toPropertyWhenPresent("nameOid", record::getNameOid)
            .map(ownerOid).toPropertyWhenPresent("ownerOid", record::getOwnerOid)
            .map(passwordOid).toPropertyWhenPresent("passwordOid", record::getPasswordOid)
            .map(portOid).toPropertyWhenPresent("portOid", record::getPortOid)
            .map(socketOid).toPropertyWhenPresent("socketOid", record::getSocketOid)
            .map(userOid).toPropertyWhenPresent("userOid", record::getUserOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    default Optional<MySqlCreateServerStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlCreateServerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    default List<MySqlCreateServerStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlCreateServerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    default List<MySqlCreateServerStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlCreateServerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    default Optional<MySqlCreateServerStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlCreateServerStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlCreateServerStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(databaseOid).equalTo(record::getDatabaseOid)
                .set(foreignDataWrapperOid).equalTo(record::getForeignDataWrapperOid)
                .set(hostOid).equalTo(record::getHostOid)
                .set(nameOid).equalTo(record::getNameOid)
                .set(ownerOid).equalTo(record::getOwnerOid)
                .set(passwordOid).equalTo(record::getPasswordOid)
                .set(portOid).equalTo(record::getPortOid)
                .set(socketOid).equalTo(record::getSocketOid)
                .set(userOid).equalTo(record::getUserOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlCreateServerStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(databaseOid).equalToWhenPresent(record::getDatabaseOid)
                .set(foreignDataWrapperOid).equalToWhenPresent(record::getForeignDataWrapperOid)
                .set(hostOid).equalToWhenPresent(record::getHostOid)
                .set(nameOid).equalToWhenPresent(record::getNameOid)
                .set(ownerOid).equalToWhenPresent(record::getOwnerOid)
                .set(passwordOid).equalToWhenPresent(record::getPasswordOid)
                .set(portOid).equalToWhenPresent(record::getPortOid)
                .set(socketOid).equalToWhenPresent(record::getSocketOid)
                .set(userOid).equalToWhenPresent(record::getUserOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    default int updateByPrimaryKey(MySqlCreateServerStatement record) {
        return update(c ->
            c.set(databaseOid).equalTo(record::getDatabaseOid)
            .set(foreignDataWrapperOid).equalTo(record::getForeignDataWrapperOid)
            .set(hostOid).equalTo(record::getHostOid)
            .set(nameOid).equalTo(record::getNameOid)
            .set(ownerOid).equalTo(record::getOwnerOid)
            .set(passwordOid).equalTo(record::getPasswordOid)
            .set(portOid).equalTo(record::getPortOid)
            .set(socketOid).equalTo(record::getSocketOid)
            .set(userOid).equalTo(record::getUserOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_create_server_statement")
    default int updateByPrimaryKeySelective(MySqlCreateServerStatement record) {
        return update(c ->
            c.set(databaseOid).equalToWhenPresent(record::getDatabaseOid)
            .set(foreignDataWrapperOid).equalToWhenPresent(record::getForeignDataWrapperOid)
            .set(hostOid).equalToWhenPresent(record::getHostOid)
            .set(nameOid).equalToWhenPresent(record::getNameOid)
            .set(ownerOid).equalToWhenPresent(record::getOwnerOid)
            .set(passwordOid).equalToWhenPresent(record::getPasswordOid)
            .set(portOid).equalToWhenPresent(record::getPortOid)
            .set(socketOid).equalToWhenPresent(record::getSocketOid)
            .set(userOid).equalToWhenPresent(record::getUserOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}