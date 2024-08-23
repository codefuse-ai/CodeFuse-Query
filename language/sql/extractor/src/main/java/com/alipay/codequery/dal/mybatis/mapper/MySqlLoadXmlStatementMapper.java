package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlLoadXmlStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlLoadXmlStatement;
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
public interface MySqlLoadXmlStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, charset, fileNameOid, ignoreLinesNumberOid, isConcurrent, isIgnore, isLocal, isLowPriority, isReplicate, rowsIdentifiedByOid, tableNameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlLoadXmlStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlLoadXmlStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="charset", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="file_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ignore_lines_number_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_concurrent", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ignore", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_low_priority", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_replicate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="rows_identified_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlLoadXmlStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="charset", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="file_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ignore_lines_number_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_concurrent", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ignore", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_low_priority", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_replicate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="rows_identified_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlLoadXmlStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlLoadXmlStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlLoadXmlStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    default int insert(MySqlLoadXmlStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlLoadXmlStatement, c ->
            c.map(oid).toProperty("oid")
            .map(charset).toProperty("charset")
            .map(fileNameOid).toProperty("fileNameOid")
            .map(ignoreLinesNumberOid).toProperty("ignoreLinesNumberOid")
            .map(isConcurrent).toProperty("isConcurrent")
            .map(isIgnore).toProperty("isIgnore")
            .map(isLocal).toProperty("isLocal")
            .map(isLowPriority).toProperty("isLowPriority")
            .map(isReplicate).toProperty("isReplicate")
            .map(rowsIdentifiedByOid).toProperty("rowsIdentifiedByOid")
            .map(tableNameOid).toProperty("tableNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    default int insertMultiple(Collection<MySqlLoadXmlStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlLoadXmlStatement, c ->
            c.map(oid).toProperty("oid")
            .map(charset).toProperty("charset")
            .map(fileNameOid).toProperty("fileNameOid")
            .map(ignoreLinesNumberOid).toProperty("ignoreLinesNumberOid")
            .map(isConcurrent).toProperty("isConcurrent")
            .map(isIgnore).toProperty("isIgnore")
            .map(isLocal).toProperty("isLocal")
            .map(isLowPriority).toProperty("isLowPriority")
            .map(isReplicate).toProperty("isReplicate")
            .map(rowsIdentifiedByOid).toProperty("rowsIdentifiedByOid")
            .map(tableNameOid).toProperty("tableNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    default int insertSelective(MySqlLoadXmlStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlLoadXmlStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(charset).toPropertyWhenPresent("charset", record::getCharset)
            .map(fileNameOid).toPropertyWhenPresent("fileNameOid", record::getFileNameOid)
            .map(ignoreLinesNumberOid).toPropertyWhenPresent("ignoreLinesNumberOid", record::getIgnoreLinesNumberOid)
            .map(isConcurrent).toPropertyWhenPresent("isConcurrent", record::getIsConcurrent)
            .map(isIgnore).toPropertyWhenPresent("isIgnore", record::getIsIgnore)
            .map(isLocal).toPropertyWhenPresent("isLocal", record::getIsLocal)
            .map(isLowPriority).toPropertyWhenPresent("isLowPriority", record::getIsLowPriority)
            .map(isReplicate).toPropertyWhenPresent("isReplicate", record::getIsReplicate)
            .map(rowsIdentifiedByOid).toPropertyWhenPresent("rowsIdentifiedByOid", record::getRowsIdentifiedByOid)
            .map(tableNameOid).toPropertyWhenPresent("tableNameOid", record::getTableNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    default Optional<MySqlLoadXmlStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlLoadXmlStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    default List<MySqlLoadXmlStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlLoadXmlStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    default List<MySqlLoadXmlStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlLoadXmlStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    default Optional<MySqlLoadXmlStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlLoadXmlStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlLoadXmlStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(charset).equalTo(record::getCharset)
                .set(fileNameOid).equalTo(record::getFileNameOid)
                .set(ignoreLinesNumberOid).equalTo(record::getIgnoreLinesNumberOid)
                .set(isConcurrent).equalTo(record::getIsConcurrent)
                .set(isIgnore).equalTo(record::getIsIgnore)
                .set(isLocal).equalTo(record::getIsLocal)
                .set(isLowPriority).equalTo(record::getIsLowPriority)
                .set(isReplicate).equalTo(record::getIsReplicate)
                .set(rowsIdentifiedByOid).equalTo(record::getRowsIdentifiedByOid)
                .set(tableNameOid).equalTo(record::getTableNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlLoadXmlStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(charset).equalToWhenPresent(record::getCharset)
                .set(fileNameOid).equalToWhenPresent(record::getFileNameOid)
                .set(ignoreLinesNumberOid).equalToWhenPresent(record::getIgnoreLinesNumberOid)
                .set(isConcurrent).equalToWhenPresent(record::getIsConcurrent)
                .set(isIgnore).equalToWhenPresent(record::getIsIgnore)
                .set(isLocal).equalToWhenPresent(record::getIsLocal)
                .set(isLowPriority).equalToWhenPresent(record::getIsLowPriority)
                .set(isReplicate).equalToWhenPresent(record::getIsReplicate)
                .set(rowsIdentifiedByOid).equalToWhenPresent(record::getRowsIdentifiedByOid)
                .set(tableNameOid).equalToWhenPresent(record::getTableNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    default int updateByPrimaryKey(MySqlLoadXmlStatement record) {
        return update(c ->
            c.set(charset).equalTo(record::getCharset)
            .set(fileNameOid).equalTo(record::getFileNameOid)
            .set(ignoreLinesNumberOid).equalTo(record::getIgnoreLinesNumberOid)
            .set(isConcurrent).equalTo(record::getIsConcurrent)
            .set(isIgnore).equalTo(record::getIsIgnore)
            .set(isLocal).equalTo(record::getIsLocal)
            .set(isLowPriority).equalTo(record::getIsLowPriority)
            .set(isReplicate).equalTo(record::getIsReplicate)
            .set(rowsIdentifiedByOid).equalTo(record::getRowsIdentifiedByOid)
            .set(tableNameOid).equalTo(record::getTableNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_xml_statement")
    default int updateByPrimaryKeySelective(MySqlLoadXmlStatement record) {
        return update(c ->
            c.set(charset).equalToWhenPresent(record::getCharset)
            .set(fileNameOid).equalToWhenPresent(record::getFileNameOid)
            .set(ignoreLinesNumberOid).equalToWhenPresent(record::getIgnoreLinesNumberOid)
            .set(isConcurrent).equalToWhenPresent(record::getIsConcurrent)
            .set(isIgnore).equalToWhenPresent(record::getIsIgnore)
            .set(isLocal).equalToWhenPresent(record::getIsLocal)
            .set(isLowPriority).equalToWhenPresent(record::getIsLowPriority)
            .set(isReplicate).equalToWhenPresent(record::getIsReplicate)
            .set(rowsIdentifiedByOid).equalToWhenPresent(record::getRowsIdentifiedByOid)
            .set(tableNameOid).equalToWhenPresent(record::getTableNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}