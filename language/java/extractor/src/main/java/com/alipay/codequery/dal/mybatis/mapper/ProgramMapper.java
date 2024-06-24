package com.alipay.codequery.dal.mybatis.mapper;

import static com.alipay.codequery.dal.mybatis.mapper.ProgramDynamicSqlSupport.*;

import com.alipay.codequery.dal.mybatis.domain.Program;
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
public interface ProgramMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    BasicColumn[] selectList = BasicColumn.columnList(programHashId, absolutePrefixPath);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Program> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Program> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="program_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="absolute_prefix_path", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Optional<Program> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="program_hash_id", javaType=Long.class, jdbcType=JdbcType.BIGINT),
        @Arg(column="absolute_prefix_path", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Program> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, program, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, program, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    default int insert(Program record) {
        return MyBatis3Utils.insert(this::insert, record, program, c ->
            c.map(programHashId).toProperty("programHashId")
            .map(absolutePrefixPath).toProperty("absolutePrefixPath")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    default int insertMultiple(Collection<Program> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, program, c ->
            c.map(programHashId).toProperty("programHashId")
            .map(absolutePrefixPath).toProperty("absolutePrefixPath")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    default int insertSelective(Program record) {
        return MyBatis3Utils.insert(this::insert, record, program, c ->
            c.map(programHashId).toPropertyWhenPresent("programHashId", record::getProgramHashId)
            .map(absolutePrefixPath).toPropertyWhenPresent("absolutePrefixPath", record::getAbsolutePrefixPath)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    default Optional<Program> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, program, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    default List<Program> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, program, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    default List<Program> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, program, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, program, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    static UpdateDSL<UpdateModel> updateAllColumns(Program record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(programHashId).equalTo(record::getProgramHashId)
                .set(absolutePrefixPath).equalTo(record::getAbsolutePrefixPath);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Program record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(programHashId).equalToWhenPresent(record::getProgramHashId)
                .set(absolutePrefixPath).equalToWhenPresent(record::getAbsolutePrefixPath);
    }
}