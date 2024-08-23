package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsAlterTableSetChangeLogsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_alter_table_set_change_logs")
    public static final OdpsAlterTableSetChangeLogs odpsAlterTableSetChangeLogs = new OdpsAlterTableSetChangeLogs();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_alter_table_set_change_logs.oid")
    public static final SqlColumn<Long> oid = odpsAlterTableSetChangeLogs.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_alter_table_set_change_logs.value_oid")
    public static final SqlColumn<Long> valueOid = odpsAlterTableSetChangeLogs.valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_alter_table_set_change_logs")
    public static final class OdpsAlterTableSetChangeLogs extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> valueOid = column("`value_oid`", JDBCType.BIGINT);

        public OdpsAlterTableSetChangeLogs() {
            super("odps_alter_table_set_change_logs");
        }
    }
}