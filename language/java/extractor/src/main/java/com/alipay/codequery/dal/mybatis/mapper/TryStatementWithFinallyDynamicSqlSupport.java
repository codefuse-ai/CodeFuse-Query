package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TryStatementWithFinallyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    public static final TryStatementWithFinally tryStatementWithFinally = new TryStatementWithFinally();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_with_finally.element_hash_id")
    public static final SqlColumn<Long> elementHashId = tryStatementWithFinally.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_with_finally.try_block_hash_id")
    public static final SqlColumn<Long> tryBlockHashId = tryStatementWithFinally.tryBlockHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_with_finally.finally_block_hash_id")
    public static final SqlColumn<Long> finallyBlockHashId = tryStatementWithFinally.finallyBlockHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_with_finally")
    public static final class TryStatementWithFinally extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> tryBlockHashId = column("try_block_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> finallyBlockHashId = column("finally_block_hash_id", JDBCType.BIGINT);

        public TryStatementWithFinally() {
            super("try_statement_with_finally");
        }
    }
}