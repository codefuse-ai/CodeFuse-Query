package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsSelectQueryBlockDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_select_query_block")
    public static final OdpsSelectQueryBlock odpsSelectQueryBlock = new OdpsSelectQueryBlock();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_select_query_block.oid")
    public static final SqlColumn<Long> oid = odpsSelectQueryBlock.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_select_query_block.z_order_by_oid")
    public static final SqlColumn<Long> zOrderByOid = odpsSelectQueryBlock.zOrderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_select_query_block")
    public static final class OdpsSelectQueryBlock extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> zOrderByOid = column("`z_order_by_oid`", JDBCType.BIGINT);

        public OdpsSelectQueryBlock() {
            super("odps_select_query_block");
        }
    }
}