package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleSelectQueryBlockDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    public static final OracleSelectQueryBlock oracleSelectQueryBlock = new OracleSelectQueryBlock();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_query_block.oid")
    public static final SqlColumn<Long> oid = oracleSelectQueryBlock.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_query_block.is_skip_locked")
    public static final SqlColumn<Integer> isSkipLocked = oracleSelectQueryBlock.isSkipLocked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_query_block.model_clause_oid")
    public static final SqlColumn<Long> modelClauseOid = oracleSelectQueryBlock.modelClauseOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_query_block")
    public static final class OracleSelectQueryBlock extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSkipLocked = column("`is_skip_locked`", JDBCType.BIGINT);

        public final SqlColumn<Long> modelClauseOid = column("`model_clause_oid`", JDBCType.BIGINT);

        public OracleSelectQueryBlock() {
            super("oracle_select_query_block");
        }
    }
}