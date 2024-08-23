package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.OdpsRemoveStatisticStatementDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.alipay.codequery.dal.mybatis.domain.OdpsRemoveStatisticStatement;
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
public interface OdpsRemoveStatisticStatementMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    BasicColumn[] selectList = BasicColumn.columnList(oid, statisticClauseOid, tableOid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OdpsRemoveStatisticStatement> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OdpsRemoveStatisticStatement> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="statistic_clause_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    Optional<OdpsRemoveStatisticStatement> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="oid", javaType=Long.class, jdbcType=JdbcType.BIGINT, id=true),
        @Arg(column="statistic_clause_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="table_oid", javaType=Long.class, jdbcType=JdbcType.BIGINT)
    })
    List<OdpsRemoveStatisticStatement> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, odpsRemoveStatisticStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, odpsRemoveStatisticStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    default int deleteByPrimaryKey(Long oid_) {
        return delete(c -> 
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    default int insert(OdpsRemoveStatisticStatement record) {
        return MyBatis3Utils.insert(this::insert, record, odpsRemoveStatisticStatement, c ->
            c.map(oid).toProperty("oid")
            .map(statisticClauseOid).toProperty("statisticClauseOid")
            .map(tableOid).toProperty("tableOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    default int insertMultiple(Collection<OdpsRemoveStatisticStatement> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, odpsRemoveStatisticStatement, c ->
            c.map(oid).toProperty("oid")
            .map(statisticClauseOid).toProperty("statisticClauseOid")
            .map(tableOid).toProperty("tableOid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    default int insertSelective(OdpsRemoveStatisticStatement record) {
        return MyBatis3Utils.insert(this::insert, record, odpsRemoveStatisticStatement, c ->
            c.map(oid).toPropertyWhenPresent("oid", record::getOid)
            .map(statisticClauseOid).toPropertyWhenPresent("statisticClauseOid", record::getStatisticClauseOid)
            .map(tableOid).toPropertyWhenPresent("tableOid", record::getTableOid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    default Optional<OdpsRemoveStatisticStatement> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, odpsRemoveStatisticStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    default List<OdpsRemoveStatisticStatement> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, odpsRemoveStatisticStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    default List<OdpsRemoveStatisticStatement> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, odpsRemoveStatisticStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    default Optional<OdpsRemoveStatisticStatement> selectByPrimaryKey(Long oid_) {
        return selectOne(c ->
            c.where(oid, isEqualTo(oid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, odpsRemoveStatisticStatement, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    static UpdateDSL<UpdateModel> updateAllColumns(OdpsRemoveStatisticStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalTo(record::getOid)
                .set(statisticClauseOid).equalTo(record::getStatisticClauseOid)
                .set(tableOid).equalTo(record::getTableOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OdpsRemoveStatisticStatement record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(oid).equalToWhenPresent(record::getOid)
                .set(statisticClauseOid).equalToWhenPresent(record::getStatisticClauseOid)
                .set(tableOid).equalToWhenPresent(record::getTableOid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    default int updateByPrimaryKey(OdpsRemoveStatisticStatement record) {
        return update(c ->
            c.set(statisticClauseOid).equalTo(record::getStatisticClauseOid)
            .set(tableOid).equalTo(record::getTableOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_remove_statistic_statement")
    default int updateByPrimaryKeySelective(OdpsRemoveStatisticStatement record) {
        return update(c ->
            c.set(statisticClauseOid).equalToWhenPresent(record::getStatisticClauseOid)
            .set(tableOid).equalToWhenPresent(record::getTableOid)
            .where(oid, isEqualTo(record::getOid))
        );
    }
}