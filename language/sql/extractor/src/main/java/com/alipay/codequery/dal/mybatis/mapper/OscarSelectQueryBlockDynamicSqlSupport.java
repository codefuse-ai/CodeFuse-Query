package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OscarSelectQueryBlockDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_select_query_block")
    public static final OscarSelectQueryBlock oscarSelectQueryBlock = new OscarSelectQueryBlock();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.oid")
    public static final SqlColumn<Long> oid = oscarSelectQueryBlock.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.fetch")
    public static final SqlColumn<String> fetch = oscarSelectQueryBlock.fetch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.for_clause")
    public static final SqlColumn<String> forClause = oscarSelectQueryBlock.forClause;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.into_option_local")
    public static final SqlColumn<String> intoOptionLocal = oscarSelectQueryBlock.intoOptionLocal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.into_option_temp")
    public static final SqlColumn<String> intoOptionTemp = oscarSelectQueryBlock.intoOptionTemp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_select_query_block.top_oid")
    public static final SqlColumn<Long> topOid = oscarSelectQueryBlock.topOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_select_query_block")
    public static final class OscarSelectQueryBlock extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> fetch = column("`fetch`", JDBCType.VARCHAR);

        public final SqlColumn<String> forClause = column("`for_clause`", JDBCType.VARCHAR);

        public final SqlColumn<String> intoOptionLocal = column("`into_option_local`", JDBCType.VARCHAR);

        public final SqlColumn<String> intoOptionTemp = column("`into_option_temp`", JDBCType.VARCHAR);

        public final SqlColumn<Long> topOid = column("`top_oid`", JDBCType.BIGINT);

        public OscarSelectQueryBlock() {
            super("oscar_select_query_block");
        }
    }
}