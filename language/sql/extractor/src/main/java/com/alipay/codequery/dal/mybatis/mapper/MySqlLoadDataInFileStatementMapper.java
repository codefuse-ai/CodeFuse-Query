package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlLoadDataInFileStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlLoadDataInFileStatement;
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
public interface MySqlLoadDataInFileStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, charset, columnsEnclosedByOid, columnsEscapedOid, columnsTerminatedByOid, fileNameOid, ignoreLinesNumberOid, isColumnsEnclosedOptionally, isConcurrent, isIgnore, isLocal, isLowPriority, isReplicate, linesStartingByOid, linesTerminatedByOid, tableNameOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlLoadDataInFileStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlLoadDataInFileStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="charset", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="columns_enclosed_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="columns_escaped_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="columns_terminated_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="file_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ignore_lines_number_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_columns_enclosed_optionally", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_concurrent", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ignore", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_low_priority", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_replicate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lines_starting_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lines_terminated_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlLoadDataInFileStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="charset", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="columns_enclosed_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="columns_escaped_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="columns_terminated_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="file_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ignore_lines_number_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_columns_enclosed_optionally", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_concurrent", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_ignore", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_local", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_low_priority", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_replicate", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lines_starting_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lines_terminated_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_name_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlLoadDataInFileStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlLoadDataInFileStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlLoadDataInFileStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    default int insert(MySqlLoadDataInFileStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlLoadDataInFileStatement, c ->
            c.map(oid).toProperty("oid")
            .map(charset).toProperty("charset")
            .map(columnsEnclosedByOid).toProperty("columnsEnclosedByOid")
            .map(columnsEscapedOid).toProperty("columnsEscapedOid")
            .map(columnsTerminatedByOid).toProperty("columnsTerminatedByOid")
            .map(fileNameOid).toProperty("fileNameOid")
            .map(ignoreLinesNumberOid).toProperty("ignoreLinesNumberOid")
            .map(isColumnsEnclosedOptionally).toProperty("isColumnsEnclosedOptionally")
            .map(isConcurrent).toProperty("isConcurrent")
            .map(isIgnore).toProperty("isIgnore")
            .map(isLocal).toProperty("isLocal")
            .map(isLowPriority).toProperty("isLowPriority")
            .map(isReplicate).toProperty("isReplicate")
            .map(linesStartingByOid).toProperty("linesStartingByOid")
            .map(linesTerminatedByOid).toProperty("linesTerminatedByOid")
            .map(tableNameOid).toProperty("tableNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    default int insertMultiple(Collection<MySqlLoadDataInFileStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlLoadDataInFileStatement, c ->
            c.map(oid).toProperty("oid")
            .map(charset).toProperty("charset")
            .map(columnsEnclosedByOid).toProperty("columnsEnclosedByOid")
            .map(columnsEscapedOid).toProperty("columnsEscapedOid")
            .map(columnsTerminatedByOid).toProperty("columnsTerminatedByOid")
            .map(fileNameOid).toProperty("fileNameOid")
            .map(ignoreLinesNumberOid).toProperty("ignoreLinesNumberOid")
            .map(isColumnsEnclosedOptionally).toProperty("isColumnsEnclosedOptionally")
            .map(isConcurrent).toProperty("isConcurrent")
            .map(isIgnore).toProperty("isIgnore")
            .map(isLocal).toProperty("isLocal")
            .map(isLowPriority).toProperty("isLowPriority")
            .map(isReplicate).toProperty("isReplicate")
            .map(linesStartingByOid).toProperty("linesStartingByOid")
            .map(linesTerminatedByOid).toProperty("linesTerminatedByOid")
            .map(tableNameOid).toProperty("tableNameOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    default int insertSelective(MySqlLoadDataInFileStatement record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlLoadDataInFileStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(charset).toPropertyWhenPresent("charset", record::getCharset)
            .map(columnsEnclosedByOid).toPropertyWhenPresent("columnsEnclosedByOid", record::getColumnsEnclosedByOid)
            .map(columnsEscapedOid).toPropertyWhenPresent("columnsEscapedOid", record::getColumnsEscapedOid)
            .map(columnsTerminatedByOid).toPropertyWhenPresent("columnsTerminatedByOid", record::getColumnsTerminatedByOid)
            .map(fileNameOid).toPropertyWhenPresent("fileNameOid", record::getFileNameOid)
            .map(ignoreLinesNumberOid).toPropertyWhenPresent("ignoreLinesNumberOid", record::getIgnoreLinesNumberOid)
            .map(isColumnsEnclosedOptionally).toPropertyWhenPresent("isColumnsEnclosedOptionally", record::getIsColumnsEnclosedOptionally)
            .map(isConcurrent).toPropertyWhenPresent("isConcurrent", record::getIsConcurrent)
            .map(isIgnore).toPropertyWhenPresent("isIgnore", record::getIsIgnore)
            .map(isLocal).toPropertyWhenPresent("isLocal", record::getIsLocal)
            .map(isLowPriority).toPropertyWhenPresent("isLowPriority", record::getIsLowPriority)
            .map(isReplicate).toPropertyWhenPresent("isReplicate", record::getIsReplicate)
            .map(linesStartingByOid).toPropertyWhenPresent("linesStartingByOid", record::getLinesStartingByOid)
            .map(linesTerminatedByOid).toPropertyWhenPresent("linesTerminatedByOid", record::getLinesTerminatedByOid)
            .map(tableNameOid).toPropertyWhenPresent("tableNameOid", record::getTableNameOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    default Optional<MySqlLoadDataInFileStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlLoadDataInFileStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    default List<MySqlLoadDataInFileStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlLoadDataInFileStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    default List<MySqlLoadDataInFileStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlLoadDataInFileStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    default Optional<MySqlLoadDataInFileStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlLoadDataInFileStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlLoadDataInFileStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(charset).equalTo(record::getCharset)
                .set(columnsEnclosedByOid).equalTo(record::getColumnsEnclosedByOid)
                .set(columnsEscapedOid).equalTo(record::getColumnsEscapedOid)
                .set(columnsTerminatedByOid).equalTo(record::getColumnsTerminatedByOid)
                .set(fileNameOid).equalTo(record::getFileNameOid)
                .set(ignoreLinesNumberOid).equalTo(record::getIgnoreLinesNumberOid)
                .set(isColumnsEnclosedOptionally).equalTo(record::getIsColumnsEnclosedOptionally)
                .set(isConcurrent).equalTo(record::getIsConcurrent)
                .set(isIgnore).equalTo(record::getIsIgnore)
                .set(isLocal).equalTo(record::getIsLocal)
                .set(isLowPriority).equalTo(record::getIsLowPriority)
                .set(isReplicate).equalTo(record::getIsReplicate)
                .set(linesStartingByOid).equalTo(record::getLinesStartingByOid)
                .set(linesTerminatedByOid).equalTo(record::getLinesTerminatedByOid)
                .set(tableNameOid).equalTo(record::getTableNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlLoadDataInFileStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(charset).equalToWhenPresent(record::getCharset)
                .set(columnsEnclosedByOid).equalToWhenPresent(record::getColumnsEnclosedByOid)
                .set(columnsEscapedOid).equalToWhenPresent(record::getColumnsEscapedOid)
                .set(columnsTerminatedByOid).equalToWhenPresent(record::getColumnsTerminatedByOid)
                .set(fileNameOid).equalToWhenPresent(record::getFileNameOid)
                .set(ignoreLinesNumberOid).equalToWhenPresent(record::getIgnoreLinesNumberOid)
                .set(isColumnsEnclosedOptionally).equalToWhenPresent(record::getIsColumnsEnclosedOptionally)
                .set(isConcurrent).equalToWhenPresent(record::getIsConcurrent)
                .set(isIgnore).equalToWhenPresent(record::getIsIgnore)
                .set(isLocal).equalToWhenPresent(record::getIsLocal)
                .set(isLowPriority).equalToWhenPresent(record::getIsLowPriority)
                .set(isReplicate).equalToWhenPresent(record::getIsReplicate)
                .set(linesStartingByOid).equalToWhenPresent(record::getLinesStartingByOid)
                .set(linesTerminatedByOid).equalToWhenPresent(record::getLinesTerminatedByOid)
                .set(tableNameOid).equalToWhenPresent(record::getTableNameOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    default int updateByPrimaryKey(MySqlLoadDataInFileStatement record) {
        return update(c ->
            c.set(charset).equalTo(record::getCharset)
            .set(columnsEnclosedByOid).equalTo(record::getColumnsEnclosedByOid)
            .set(columnsEscapedOid).equalTo(record::getColumnsEscapedOid)
            .set(columnsTerminatedByOid).equalTo(record::getColumnsTerminatedByOid)
            .set(fileNameOid).equalTo(record::getFileNameOid)
            .set(ignoreLinesNumberOid).equalTo(record::getIgnoreLinesNumberOid)
            .set(isColumnsEnclosedOptionally).equalTo(record::getIsColumnsEnclosedOptionally)
            .set(isConcurrent).equalTo(record::getIsConcurrent)
            .set(isIgnore).equalTo(record::getIsIgnore)
            .set(isLocal).equalTo(record::getIsLocal)
            .set(isLowPriority).equalTo(record::getIsLowPriority)
            .set(isReplicate).equalTo(record::getIsReplicate)
            .set(linesStartingByOid).equalTo(record::getLinesStartingByOid)
            .set(linesTerminatedByOid).equalTo(record::getLinesTerminatedByOid)
            .set(tableNameOid).equalTo(record::getTableNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_load_data_in_file_statement")
    default int updateByPrimaryKeySelective(MySqlLoadDataInFileStatement record) {
        return update(c ->
            c.set(charset).equalToWhenPresent(record::getCharset)
            .set(columnsEnclosedByOid).equalToWhenPresent(record::getColumnsEnclosedByOid)
            .set(columnsEscapedOid).equalToWhenPresent(record::getColumnsEscapedOid)
            .set(columnsTerminatedByOid).equalToWhenPresent(record::getColumnsTerminatedByOid)
            .set(fileNameOid).equalToWhenPresent(record::getFileNameOid)
            .set(ignoreLinesNumberOid).equalToWhenPresent(record::getIgnoreLinesNumberOid)
            .set(isColumnsEnclosedOptionally).equalToWhenPresent(record::getIsColumnsEnclosedOptionally)
            .set(isConcurrent).equalToWhenPresent(record::getIsConcurrent)
            .set(isIgnore).equalToWhenPresent(record::getIsIgnore)
            .set(isLocal).equalToWhenPresent(record::getIsLocal)
            .set(isLowPriority).equalToWhenPresent(record::getIsLowPriority)
            .set(isReplicate).equalToWhenPresent(record::getIsReplicate)
            .set(linesStartingByOid).equalToWhenPresent(record::getLinesStartingByOid)
            .set(linesTerminatedByOid).equalToWhenPresent(record::getLinesTerminatedByOid)
            .set(tableNameOid).equalToWhenPresent(record::getTableNameOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}