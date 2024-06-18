package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TryStatementWithoutFinallyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    public static final TryStatementWithoutFinally tryStatementWithoutFinally = new TryStatementWithoutFinally();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_without_finally.element_hash_id")
    public static final SqlColumn<Long> elementHashId = tryStatementWithoutFinally.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: try_statement_without_finally.try_block_hash_id")
    public static final SqlColumn<Long> tryBlockHashId = tryStatementWithoutFinally.tryBlockHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: try_statement_without_finally")
    public static final class TryStatementWithoutFinally extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> tryBlockHashId = column("try_block_hash_id", JDBCType.BIGINT);

        public TryStatementWithoutFinally() {
            super("try_statement_without_finally");
        }
    }
}