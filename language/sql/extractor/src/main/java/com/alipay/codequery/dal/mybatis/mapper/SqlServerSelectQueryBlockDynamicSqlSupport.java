package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlServerSelectQueryBlockDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_select_query_block")
    public static final SqlServerSelectQueryBlock sqlServerSelectQueryBlock = new SqlServerSelectQueryBlock();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_select_query_block.oid")
    public static final SqlColumn<Long> oid = sqlServerSelectQueryBlock.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_server_select_query_block.top_oid")
    public static final SqlColumn<Long> topOid = sqlServerSelectQueryBlock.topOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_server_select_query_block")
    public static final class SqlServerSelectQueryBlock extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> topOid = column("`top_oid`", JDBCType.BIGINT);

        public SqlServerSelectQueryBlock() {
            super("sql_server_select_query_block");
        }
    }
}