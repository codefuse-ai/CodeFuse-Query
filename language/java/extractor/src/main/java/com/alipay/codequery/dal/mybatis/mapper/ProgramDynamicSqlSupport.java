package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ProgramDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    public static final Program program = new Program();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: program.program_hash_id")
    public static final SqlColumn<Long> programHashId = program.programHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: program.absolute_prefix_path")
    public static final SqlColumn<String> absolutePrefixPath = program.absolutePrefixPath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: program")
    public static final class Program extends SqlTable {
        public final SqlColumn<Long> programHashId = column("program_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> absolutePrefixPath = column("absolute_prefix_path", JDBCType.VARCHAR);

        public Program() {
            super("program");
        }
    }
}