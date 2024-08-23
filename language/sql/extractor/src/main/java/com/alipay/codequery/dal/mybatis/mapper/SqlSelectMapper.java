package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlSelectDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlSelect;
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
public interface SqlSelectMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    BasicColumn[] selectList = BasicColumn.columnList(oid, firstQueryBlockOid, forXmlOptions, forXmlOptionsSize, headHintOid, hintsSize, isForBrowse, isSimple, limitOid, offsetOid, orderByOid, queryOid, queryBlockOid, restriction, rowCountOid, withSubQueryOid, xmlPathOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlSelect> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlSelect> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="first_query_block_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="for_xml_options", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="for_xml_options_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="head_hint_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="hints_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_for_browse", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_simple", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="offset_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="query_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="query_block_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="restriction", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="row_count_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="with_sub_query_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="xml_path_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlSelect> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="first_query_block_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="for_xml_options", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="for_xml_options_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="head_hint_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="hints_size", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_for_browse", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="is_simple", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="limit_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="offset_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="order_by_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="query_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="query_block_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="restriction", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="row_count_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="with_sub_query_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="xml_path_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlSelect> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlSelect, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlSelect, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    default int insert(SqlSelect record) {
        return MyBatis3Utils.insert(this::insert, record, sqlSelect, c ->
            c.map(oid).toProperty("oid")
            .map(firstQueryBlockOid).toProperty("firstQueryBlockOid")
            .map(forXmlOptions).toProperty("forXmlOptions")
            .map(forXmlOptionsSize).toProperty("forXmlOptionsSize")
            .map(headHintOid).toProperty("headHintOid")
            .map(hintsSize).toProperty("hintsSize")
            .map(isForBrowse).toProperty("isForBrowse")
            .map(isSimple).toProperty("isSimple")
            .map(limitOid).toProperty("limitOid")
            .map(offsetOid).toProperty("offsetOid")
            .map(orderByOid).toProperty("orderByOid")
            .map(queryOid).toProperty("queryOid")
            .map(queryBlockOid).toProperty("queryBlockOid")
            .map(restriction).toProperty("restriction")
            .map(rowCountOid).toProperty("rowCountOid")
            .map(withSubQueryOid).toProperty("withSubQueryOid")
            .map(xmlPathOid).toProperty("xmlPathOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    default int insertMultiple(Collection<SqlSelect> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlSelect, c ->
            c.map(oid).toProperty("oid")
            .map(firstQueryBlockOid).toProperty("firstQueryBlockOid")
            .map(forXmlOptions).toProperty("forXmlOptions")
            .map(forXmlOptionsSize).toProperty("forXmlOptionsSize")
            .map(headHintOid).toProperty("headHintOid")
            .map(hintsSize).toProperty("hintsSize")
            .map(isForBrowse).toProperty("isForBrowse")
            .map(isSimple).toProperty("isSimple")
            .map(limitOid).toProperty("limitOid")
            .map(offsetOid).toProperty("offsetOid")
            .map(orderByOid).toProperty("orderByOid")
            .map(queryOid).toProperty("queryOid")
            .map(queryBlockOid).toProperty("queryBlockOid")
            .map(restriction).toProperty("restriction")
            .map(rowCountOid).toProperty("rowCountOid")
            .map(withSubQueryOid).toProperty("withSubQueryOid")
            .map(xmlPathOid).toProperty("xmlPathOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    default int insertSelective(SqlSelect record) {
        return MyBatis3Utils.insert(this::insert, record, sqlSelect, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(firstQueryBlockOid).toPropertyWhenPresent("firstQueryBlockOid", record::getFirstQueryBlockOid)
            .map(forXmlOptions).toPropertyWhenPresent("forXmlOptions", record::getForXmlOptions)
            .map(forXmlOptionsSize).toPropertyWhenPresent("forXmlOptionsSize", record::getForXmlOptionsSize)
            .map(headHintOid).toPropertyWhenPresent("headHintOid", record::getHeadHintOid)
            .map(hintsSize).toPropertyWhenPresent("hintsSize", record::getHintsSize)
            .map(isForBrowse).toPropertyWhenPresent("isForBrowse", record::getIsForBrowse)
            .map(isSimple).toPropertyWhenPresent("isSimple", record::getIsSimple)
            .map(limitOid).toPropertyWhenPresent("limitOid", record::getLimitOid)
            .map(offsetOid).toPropertyWhenPresent("offsetOid", record::getOffsetOid)
            .map(orderByOid).toPropertyWhenPresent("orderByOid", record::getOrderByOid)
            .map(queryOid).toPropertyWhenPresent("queryOid", record::getQueryOid)
            .map(queryBlockOid).toPropertyWhenPresent("queryBlockOid", record::getQueryBlockOid)
            .map(restriction).toPropertyWhenPresent("restriction", record::getRestriction)
            .map(rowCountOid).toPropertyWhenPresent("rowCountOid", record::getRowCountOid)
            .map(withSubQueryOid).toPropertyWhenPresent("withSubQueryOid", record::getWithSubQueryOid)
            .map(xmlPathOid).toPropertyWhenPresent("xmlPathOid", record::getXmlPathOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    default Optional<SqlSelect> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlSelect, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    default List<SqlSelect> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlSelect, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    default List<SqlSelect> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlSelect, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    default Optional<SqlSelect> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlSelect, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlSelect record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(firstQueryBlockOid).equalTo(record::getFirstQueryBlockOid)
                .set(forXmlOptions).equalTo(record::getForXmlOptions)
                .set(forXmlOptionsSize).equalTo(record::getForXmlOptionsSize)
                .set(headHintOid).equalTo(record::getHeadHintOid)
                .set(hintsSize).equalTo(record::getHintsSize)
                .set(isForBrowse).equalTo(record::getIsForBrowse)
                .set(isSimple).equalTo(record::getIsSimple)
                .set(limitOid).equalTo(record::getLimitOid)
                .set(offsetOid).equalTo(record::getOffsetOid)
                .set(orderByOid).equalTo(record::getOrderByOid)
                .set(queryOid).equalTo(record::getQueryOid)
                .set(queryBlockOid).equalTo(record::getQueryBlockOid)
                .set(restriction).equalTo(record::getRestriction)
                .set(rowCountOid).equalTo(record::getRowCountOid)
                .set(withSubQueryOid).equalTo(record::getWithSubQueryOid)
                .set(xmlPathOid).equalTo(record::getXmlPathOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlSelect record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(firstQueryBlockOid).equalToWhenPresent(record::getFirstQueryBlockOid)
                .set(forXmlOptions).equalToWhenPresent(record::getForXmlOptions)
                .set(forXmlOptionsSize).equalToWhenPresent(record::getForXmlOptionsSize)
                .set(headHintOid).equalToWhenPresent(record::getHeadHintOid)
                .set(hintsSize).equalToWhenPresent(record::getHintsSize)
                .set(isForBrowse).equalToWhenPresent(record::getIsForBrowse)
                .set(isSimple).equalToWhenPresent(record::getIsSimple)
                .set(limitOid).equalToWhenPresent(record::getLimitOid)
                .set(offsetOid).equalToWhenPresent(record::getOffsetOid)
                .set(orderByOid).equalToWhenPresent(record::getOrderByOid)
                .set(queryOid).equalToWhenPresent(record::getQueryOid)
                .set(queryBlockOid).equalToWhenPresent(record::getQueryBlockOid)
                .set(restriction).equalToWhenPresent(record::getRestriction)
                .set(rowCountOid).equalToWhenPresent(record::getRowCountOid)
                .set(withSubQueryOid).equalToWhenPresent(record::getWithSubQueryOid)
                .set(xmlPathOid).equalToWhenPresent(record::getXmlPathOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    default int updateByPrimaryKey(SqlSelect record) {
        return update(c ->
            c.set(firstQueryBlockOid).equalTo(record::getFirstQueryBlockOid)
            .set(forXmlOptions).equalTo(record::getForXmlOptions)
            .set(forXmlOptionsSize).equalTo(record::getForXmlOptionsSize)
            .set(headHintOid).equalTo(record::getHeadHintOid)
            .set(hintsSize).equalTo(record::getHintsSize)
            .set(isForBrowse).equalTo(record::getIsForBrowse)
            .set(isSimple).equalTo(record::getIsSimple)
            .set(limitOid).equalTo(record::getLimitOid)
            .set(offsetOid).equalTo(record::getOffsetOid)
            .set(orderByOid).equalTo(record::getOrderByOid)
            .set(queryOid).equalTo(record::getQueryOid)
            .set(queryBlockOid).equalTo(record::getQueryBlockOid)
            .set(restriction).equalTo(record::getRestriction)
            .set(rowCountOid).equalTo(record::getRowCountOid)
            .set(withSubQueryOid).equalTo(record::getWithSubQueryOid)
            .set(xmlPathOid).equalTo(record::getXmlPathOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    default int updateByPrimaryKeySelective(SqlSelect record) {
        return update(c ->
            c.set(firstQueryBlockOid).equalToWhenPresent(record::getFirstQueryBlockOid)
            .set(forXmlOptions).equalToWhenPresent(record::getForXmlOptions)
            .set(forXmlOptionsSize).equalToWhenPresent(record::getForXmlOptionsSize)
            .set(headHintOid).equalToWhenPresent(record::getHeadHintOid)
            .set(hintsSize).equalToWhenPresent(record::getHintsSize)
            .set(isForBrowse).equalToWhenPresent(record::getIsForBrowse)
            .set(isSimple).equalToWhenPresent(record::getIsSimple)
            .set(limitOid).equalToWhenPresent(record::getLimitOid)
            .set(offsetOid).equalToWhenPresent(record::getOffsetOid)
            .set(orderByOid).equalToWhenPresent(record::getOrderByOid)
            .set(queryOid).equalToWhenPresent(record::getQueryOid)
            .set(queryBlockOid).equalToWhenPresent(record::getQueryBlockOid)
            .set(restriction).equalToWhenPresent(record::getRestriction)
            .set(rowCountOid).equalToWhenPresent(record::getRowCountOid)
            .set(withSubQueryOid).equalToWhenPresent(record::getWithSubQueryOid)
            .set(xmlPathOid).equalToWhenPresent(record::getXmlPathOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}