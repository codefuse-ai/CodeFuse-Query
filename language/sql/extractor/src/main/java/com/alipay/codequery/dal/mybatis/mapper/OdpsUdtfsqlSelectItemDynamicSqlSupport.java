package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsUdtfsqlSelectItemDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_udtfsql_select_item")
    public static final OdpsUdtfsqlSelectItem odpsUdtfsqlSelectItem = new OdpsUdtfsqlSelectItem();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_udtfsql_select_item.oid")
    public static final SqlColumn<Long> oid = odpsUdtfsqlSelectItem.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_udtfsql_select_item")
    public static final class OdpsUdtfsqlSelectItem extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public OdpsUdtfsqlSelectItem() {
            super("odps_udtfsql_select_item");
        }
    }
}