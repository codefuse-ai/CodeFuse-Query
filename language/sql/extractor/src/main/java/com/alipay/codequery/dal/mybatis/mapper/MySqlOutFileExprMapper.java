package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.MySqlOutFileExprDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.MySqlOutFileExpr;
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
public interface MySqlOutFileExprMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    BasicColumn[] selectList = BasicColumn.columnList(oid, charset, columnsEnclosedByOid, columnsEscapedOid, columnsTerminatedByOid, fileOid, ignoreLinesNumberOid, isColumnsEnclosedOptionally, linesStartingByOid, linesTerminatedByOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MySqlOutFileExpr> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MySqlOutFileExpr> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="charset", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="columns_enclosed_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="columns_escaped_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="columns_terminated_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="file_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ignore_lines_number_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_columns_enclosed_optionally", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lines_starting_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lines_terminated_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<MySqlOutFileExpr> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="charset", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="columns_enclosed_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="columns_escaped_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="columns_terminated_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="file_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="ignore_lines_number_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_columns_enclosed_optionally", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lines_starting_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="lines_terminated_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<MySqlOutFileExpr> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, mySqlOutFileExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, mySqlOutFileExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    default int insert(MySqlOutFileExpr record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlOutFileExpr, c ->
            c.map(oid).toProperty("oid")
            .map(charset).toProperty("charset")
            .map(columnsEnclosedByOid).toProperty("columnsEnclosedByOid")
            .map(columnsEscapedOid).toProperty("columnsEscapedOid")
            .map(columnsTerminatedByOid).toProperty("columnsTerminatedByOid")
            .map(fileOid).toProperty("fileOid")
            .map(ignoreLinesNumberOid).toProperty("ignoreLinesNumberOid")
            .map(isColumnsEnclosedOptionally).toProperty("isColumnsEnclosedOptionally")
            .map(linesStartingByOid).toProperty("linesStartingByOid")
            .map(linesTerminatedByOid).toProperty("linesTerminatedByOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    default int insertMultiple(Collection<MySqlOutFileExpr> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, mySqlOutFileExpr, c ->
            c.map(oid).toProperty("oid")
            .map(charset).toProperty("charset")
            .map(columnsEnclosedByOid).toProperty("columnsEnclosedByOid")
            .map(columnsEscapedOid).toProperty("columnsEscapedOid")
            .map(columnsTerminatedByOid).toProperty("columnsTerminatedByOid")
            .map(fileOid).toProperty("fileOid")
            .map(ignoreLinesNumberOid).toProperty("ignoreLinesNumberOid")
            .map(isColumnsEnclosedOptionally).toProperty("isColumnsEnclosedOptionally")
            .map(linesStartingByOid).toProperty("linesStartingByOid")
            .map(linesTerminatedByOid).toProperty("linesTerminatedByOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    default int insertSelective(MySqlOutFileExpr record) {
        return MyBatis3Utils.insert(this::insert, record, mySqlOutFileExpr, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(charset).toPropertyWhenPresent("charset", record::getCharset)
            .map(columnsEnclosedByOid).toPropertyWhenPresent("columnsEnclosedByOid", record::getColumnsEnclosedByOid)
            .map(columnsEscapedOid).toPropertyWhenPresent("columnsEscapedOid", record::getColumnsEscapedOid)
            .map(columnsTerminatedByOid).toPropertyWhenPresent("columnsTerminatedByOid", record::getColumnsTerminatedByOid)
            .map(fileOid).toPropertyWhenPresent("fileOid", record::getFileOid)
            .map(ignoreLinesNumberOid).toPropertyWhenPresent("ignoreLinesNumberOid", record::getIgnoreLinesNumberOid)
            .map(isColumnsEnclosedOptionally).toPropertyWhenPresent("isColumnsEnclosedOptionally", record::getIsColumnsEnclosedOptionally)
            .map(linesStartingByOid).toPropertyWhenPresent("linesStartingByOid", record::getLinesStartingByOid)
            .map(linesTerminatedByOid).toPropertyWhenPresent("linesTerminatedByOid", record::getLinesTerminatedByOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    default Optional<MySqlOutFileExpr> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, mySqlOutFileExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    default List<MySqlOutFileExpr> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, mySqlOutFileExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    default List<MySqlOutFileExpr> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, mySqlOutFileExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    default Optional<MySqlOutFileExpr> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, mySqlOutFileExpr, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    static UpdateDSL<UpdateModel> updateAllColumns(MySqlOutFileExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(charset).equalTo(record::getCharset)
                .set(columnsEnclosedByOid).equalTo(record::getColumnsEnclosedByOid)
                .set(columnsEscapedOid).equalTo(record::getColumnsEscapedOid)
                .set(columnsTerminatedByOid).equalTo(record::getColumnsTerminatedByOid)
                .set(fileOid).equalTo(record::getFileOid)
                .set(ignoreLinesNumberOid).equalTo(record::getIgnoreLinesNumberOid)
                .set(isColumnsEnclosedOptionally).equalTo(record::getIsColumnsEnclosedOptionally)
                .set(linesStartingByOid).equalTo(record::getLinesStartingByOid)
                .set(linesTerminatedByOid).equalTo(record::getLinesTerminatedByOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MySqlOutFileExpr record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(charset).equalToWhenPresent(record::getCharset)
                .set(columnsEnclosedByOid).equalToWhenPresent(record::getColumnsEnclosedByOid)
                .set(columnsEscapedOid).equalToWhenPresent(record::getColumnsEscapedOid)
                .set(columnsTerminatedByOid).equalToWhenPresent(record::getColumnsTerminatedByOid)
                .set(fileOid).equalToWhenPresent(record::getFileOid)
                .set(ignoreLinesNumberOid).equalToWhenPresent(record::getIgnoreLinesNumberOid)
                .set(isColumnsEnclosedOptionally).equalToWhenPresent(record::getIsColumnsEnclosedOptionally)
                .set(linesStartingByOid).equalToWhenPresent(record::getLinesStartingByOid)
                .set(linesTerminatedByOid).equalToWhenPresent(record::getLinesTerminatedByOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    default int updateByPrimaryKey(MySqlOutFileExpr record) {
        return update(c ->
            c.set(charset).equalTo(record::getCharset)
            .set(columnsEnclosedByOid).equalTo(record::getColumnsEnclosedByOid)
            .set(columnsEscapedOid).equalTo(record::getColumnsEscapedOid)
            .set(columnsTerminatedByOid).equalTo(record::getColumnsTerminatedByOid)
            .set(fileOid).equalTo(record::getFileOid)
            .set(ignoreLinesNumberOid).equalTo(record::getIgnoreLinesNumberOid)
            .set(isColumnsEnclosedOptionally).equalTo(record::getIsColumnsEnclosedOptionally)
            .set(linesStartingByOid).equalTo(record::getLinesStartingByOid)
            .set(linesTerminatedByOid).equalTo(record::getLinesTerminatedByOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_out_file_expr")
    default int updateByPrimaryKeySelective(MySqlOutFileExpr record) {
        return update(c ->
            c.set(charset).equalToWhenPresent(record::getCharset)
            .set(columnsEnclosedByOid).equalToWhenPresent(record::getColumnsEnclosedByOid)
            .set(columnsEscapedOid).equalToWhenPresent(record::getColumnsEscapedOid)
            .set(columnsTerminatedByOid).equalToWhenPresent(record::getColumnsTerminatedByOid)
            .set(fileOid).equalToWhenPresent(record::getFileOid)
            .set(ignoreLinesNumberOid).equalToWhenPresent(record::getIgnoreLinesNumberOid)
            .set(isColumnsEnclosedOptionally).equalToWhenPresent(record::getIsColumnsEnclosedOptionally)
            .set(linesStartingByOid).equalToWhenPresent(record::getLinesStartingByOid)
            .set(linesTerminatedByOid).equalToWhenPresent(record::getLinesTerminatedByOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}