package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PgSelectQueryBlockDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    public static final PgSelectQueryBlock pgSelectQueryBlock = new PgSelectQueryBlock();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_select_query_block.oid")
    public static final SqlColumn<Long> oid = pgSelectQueryBlock.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_select_query_block.fetch")
    public static final SqlColumn<String> fetch = pgSelectQueryBlock.fetch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_select_query_block.for_clause")
    public static final SqlColumn<String> forClause = pgSelectQueryBlock.forClause;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: pg_select_query_block.into_option")
    public static final SqlColumn<String> intoOption = pgSelectQueryBlock.intoOption;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: pg_select_query_block")
    public static final class PgSelectQueryBlock extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> fetch = column("`fetch`", JDBCType.VARCHAR);

        public final SqlColumn<String> forClause = column("`for_clause`", JDBCType.VARCHAR);

        public final SqlColumn<String> intoOption = column("`into_option`", JDBCType.VARCHAR);

        public PgSelectQueryBlock() {
            super("pg_select_query_block");
        }
    }
}