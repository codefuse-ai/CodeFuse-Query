package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.SqlCharacterDataTypeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.SqlCharacterDataType;
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
public interface SqlCharacterDataTypeMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    BasicColumn[] selectList = BasicColumn.columnList(oid, charSetName, charType, collate, isHasBinary, length);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SqlCharacterDataType> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<SqlCharacterDataType> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="char_set_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="char_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="collate", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_has_binary", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="length", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<SqlCharacterDataType> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="char_set_name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="char_type", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="collate", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="is_has_binary", javaType=Integer.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="length", javaType=Integer.class, jdbcType=JdbcType.BIGINT)
    })
    List<SqlCharacterDataType> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, sqlCharacterDataType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, sqlCharacterDataType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    default int insert(SqlCharacterDataType record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCharacterDataType, c ->
            c.map(oid).toProperty("oid")
            .map(charSetName).toProperty("charSetName")
            .map(charType).toProperty("charType")
            .map(collate).toProperty("collate")
            .map(isHasBinary).toProperty("isHasBinary")
            .map(length).toProperty("length")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    default int insertMultiple(Collection<SqlCharacterDataType> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, sqlCharacterDataType, c ->
            c.map(oid).toProperty("oid")
            .map(charSetName).toProperty("charSetName")
            .map(charType).toProperty("charType")
            .map(collate).toProperty("collate")
            .map(isHasBinary).toProperty("isHasBinary")
            .map(length).toProperty("length")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    default int insertSelective(SqlCharacterDataType record) {
        return MyBatis3Utils.insert(this::insert, record, sqlCharacterDataType, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(charSetName).toPropertyWhenPresent("charSetName", record::getCharSetName)
            .map(charType).toPropertyWhenPresent("charType", record::getCharType)
            .map(collate).toPropertyWhenPresent("collate", record::getCollate)
            .map(isHasBinary).toPropertyWhenPresent("isHasBinary", record::getIsHasBinary)
            .map(length).toPropertyWhenPresent("length", record::getLength)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    default Optional<SqlCharacterDataType> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, sqlCharacterDataType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    default List<SqlCharacterDataType> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, sqlCharacterDataType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    default List<SqlCharacterDataType> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, sqlCharacterDataType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    default Optional<SqlCharacterDataType> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, sqlCharacterDataType, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    static UpdateDSL<UpdateModel> updateAllColumns(SqlCharacterDataType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(charSetName).equalTo(record::getCharSetName)
                .set(charType).equalTo(record::getCharType)
                .set(collate).equalTo(record::getCollate)
                .set(isHasBinary).equalTo(record::getIsHasBinary)
                .set(length).equalTo(record::getLength);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(SqlCharacterDataType record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(charSetName).equalToWhenPresent(record::getCharSetName)
                .set(charType).equalToWhenPresent(record::getCharType)
                .set(collate).equalToWhenPresent(record::getCollate)
                .set(isHasBinary).equalToWhenPresent(record::getIsHasBinary)
                .set(length).equalToWhenPresent(record::getLength);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    default int updateByPrimaryKey(SqlCharacterDataType record) {
        return update(c ->
            c.set(charSetName).equalTo(record::getCharSetName)
            .set(charType).equalTo(record::getCharType)
            .set(collate).equalTo(record::getCollate)
            .set(isHasBinary).equalTo(record::getIsHasBinary)
            .set(length).equalTo(record::getLength)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_character_data_type")
    default int updateByPrimaryKeySelective(SqlCharacterDataType record) {
        return update(c ->
            c.set(charSetName).equalToWhenPresent(record::getCharSetName)
            .set(charType).equalToWhenPresent(record::getCharType)
            .set(collate).equalToWhenPresent(record::getCollate)
            .set(isHasBinary).equalToWhenPresent(record::getIsHasBinary)
            .set(length).equalToWhenPresent(record::getLength)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}