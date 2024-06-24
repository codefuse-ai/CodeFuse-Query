package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ThrowStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: throw_statement")
    public static final ThrowStatement throwStatement = new ThrowStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: throw_statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = throwStatement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: throw_statement.exception_hash_id")
    public static final SqlColumn<Long> exceptionHashId = throwStatement.exceptionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: throw_statement.block_hash_id")
    public static final SqlColumn<Long> blockHashId = throwStatement.blockHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: throw_statement")
    public static final class ThrowStatement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> exceptionHashId = column("exception_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> blockHashId = column("block_hash_id", JDBCType.BIGINT);

        public ThrowStatement() {
            super("throw_statement");
        }
    }
}