package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.JavadocDataTokenDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.JavadocDataToken;
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
public interface JavadocDataTokenMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    BasicColumn[] selectList = BasicColumn.columnList(elementHashId, value, parentHashId, indexOrder, locationHashId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<JavadocDataToken> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<JavadocDataToken> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="value", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_order", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<JavadocDataToken> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="element_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="value", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="parent_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="index_order", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="location_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<JavadocDataToken> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, javadocDataToken, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, javadocDataToken, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    default int insert(JavadocDataToken record) {
        return MyBatis3Utils.insert(this::insert, record, javadocDataToken, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(value).toProperty("value")
            .map(parentHashId).toProperty("parentHashId")
            .map(indexOrder).toProperty("indexOrder")
            .map(locationHashId).toProperty("locationHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    default int insertMultiple(Collection<JavadocDataToken> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, javadocDataToken, c ->
            c.map(elementHashId).toProperty("elementHashId")
            .map(value).toProperty("value")
            .map(parentHashId).toProperty("parentHashId")
            .map(indexOrder).toProperty("indexOrder")
            .map(locationHashId).toProperty("locationHashId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    default int insertSelective(JavadocDataToken record) {
        return MyBatis3Utils.insert(this::insert, record, javadocDataToken, c ->
            c.map(elementHashId).toPropertyWhenPresent("elementHashId", record::getElementHashId)
            .map(value).toPropertyWhenPresent("value", record::getValue)
            .map(parentHashId).toPropertyWhenPresent("parentHashId", record::getParentHashId)
            .map(indexOrder).toPropertyWhenPresent("indexOrder", record::getIndexOrder)
            .map(locationHashId).toPropertyWhenPresent("locationHashId", record::getLocationHashId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    default Optional<JavadocDataToken> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, javadocDataToken, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    default List<JavadocDataToken> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, javadocDataToken, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    default List<JavadocDataToken> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, javadocDataToken, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, javadocDataToken, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    static UpdateDSL<UpdateModel> updateAllColumns(JavadocDataToken record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalTo(record::getElementHashId)
                .set(value).equalTo(record::getValue)
                .set(parentHashId).equalTo(record::getParentHashId)
                .set(indexOrder).equalTo(record::getIndexOrder)
                .set(locationHashId).equalTo(record::getLocationHashId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: javadoc_data_token")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(JavadocDataToken record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(elementHashId).equalToWhenPresent(record::getElementHashId)
                .set(value).equalToWhenPresent(record::getValue)
                .set(parentHashId).equalToWhenPresent(record::getParentHashId)
                .set(indexOrder).equalToWhenPresent(record::getIndexOrder)
                .set(locationHashId).equalToWhenPresent(record::getLocationHashId);
    }
}