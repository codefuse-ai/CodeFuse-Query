package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.FileSha256SumDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.FileSha256Sum;
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
public interface FileSha256SumMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    BasicColumn[] selectList = BasicColumn.columnList(fileHashId, value);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<FileSha256Sum> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<FileSha256Sum> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="file_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="value", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<FileSha256Sum> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="file_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="value", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<FileSha256Sum> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, fileSha256Sum, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, fileSha256Sum, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    default int insert(FileSha256Sum record) {
        return MyBatis3Utils.insert(this::insert, record, fileSha256Sum, c ->
            c.map(fileHashId).toProperty("fileHashId")
            .map(value).toProperty("value")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    default int insertMultiple(Collection<FileSha256Sum> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, fileSha256Sum, c ->
            c.map(fileHashId).toProperty("fileHashId")
            .map(value).toProperty("value")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    default int insertSelective(FileSha256Sum record) {
        return MyBatis3Utils.insert(this::insert, record, fileSha256Sum, c ->
            c.map(fileHashId).toPropertyWhenPresent("fileHashId", record::getFileHashId)
            .map(value).toPropertyWhenPresent("value", record::getValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    default Optional<FileSha256Sum> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, fileSha256Sum, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    default List<FileSha256Sum> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, fileSha256Sum, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    default List<FileSha256Sum> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, fileSha256Sum, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, fileSha256Sum, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    static UpdateDSL<UpdateModel> updateAllColumns(FileSha256Sum record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fileHashId).equalTo(record::getFileHashId)
                .set(value).equalTo(record::getValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(FileSha256Sum record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(fileHashId).equalToWhenPresent(record::getFileHashId)
                .set(value).equalToWhenPresent(record::getValue);
    }
}