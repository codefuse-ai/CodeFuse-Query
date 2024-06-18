package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.LocationDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.Location;
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
public interface LocationMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, fileHashId, startLineNumber, startColumnNumber, endLineNumber, endColumnNumber);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Location> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Location> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="file_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="start_line_number", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="start_column_number", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="end_line_number", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="end_column_number", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    Optional<Location> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="file_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="start_line_number", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="start_column_number", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="end_line_number", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="end_column_number", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<Location> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, location, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, location, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    default int insert(Location record) {
        return MyBatis3Utils.insert(this::insert, record, location, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(fileHashId).toProperty("fileHashId")
            .map(startLineNumber).toProperty("startLineNumber")
            .map(startColumnNumber).toProperty("startColumnNumber")
            .map(endLineNumber).toProperty("endLineNumber")
            .map(endColumnNumber).toProperty("endColumnNumber")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    default int insertMultiple(Collection<Location> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, location, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(fileHashId).toProperty("fileHashId")
            .map(startLineNumber).toProperty("startLineNumber")
            .map(startColumnNumber).toProperty("startColumnNumber")
            .map(endLineNumber).toProperty("endLineNumber")
            .map(endColumnNumber).toProperty("endColumnNumber")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    default int insertSelective(Location record) {
        return MyBatis3Utils.insert(this::insert, record, location, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(fileHashId).toPropertyWhenPresent("fileHashId", record::getFileHashId)
            .map(startLineNumber).toPropertyWhenPresent("startLineNumber", record::getStartLineNumber)
            .map(startColumnNumber).toPropertyWhenPresent("startColumnNumber", record::getStartColumnNumber)
            .map(endLineNumber).toPropertyWhenPresent("endLineNumber", record::getEndLineNumber)
            .map(endColumnNumber).toPropertyWhenPresent("endColumnNumber", record::getEndColumnNumber)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    default Optional<Location> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, location, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    default List<Location> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, location, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    default List<Location> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, location, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, location, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    static UpdateDSL<UpdateModel> updateAllColumns(Location record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(fileHashId).equalTo(record::getFileHashId)
                .set(startLineNumber).equalTo(record::getStartLineNumber)
                .set(startColumnNumber).equalTo(record::getStartColumnNumber)
                .set(endLineNumber).equalTo(record::getEndLineNumber)
                .set(endColumnNumber).equalTo(record::getEndColumnNumber);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: location")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Location record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(fileHashId).equalToWhenPresent(record::getFileHashId)
                .set(startLineNumber).equalToWhenPresent(record::getStartLineNumber)
                .set(startColumnNumber).equalToWhenPresent(record::getStartColumnNumber)
                .set(endLineNumber).equalToWhenPresent(record::getEndLineNumber)
                .set(endColumnNumber).equalToWhenPresent(record::getEndColumnNumber);
    }
}