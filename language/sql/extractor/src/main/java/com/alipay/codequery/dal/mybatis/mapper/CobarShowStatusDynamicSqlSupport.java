package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CobarShowStatusDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cobar_show_status")
    public static final CobarShowStatus cobarShowStatus = new CobarShowStatus();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: cobar_show_status.oid")
    public static final SqlColumn<Long> oid = cobarShowStatus.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: cobar_show_status")
    public static final class CobarShowStatus extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public CobarShowStatus() {
            super("cobar_show_status");
        }
    }
}