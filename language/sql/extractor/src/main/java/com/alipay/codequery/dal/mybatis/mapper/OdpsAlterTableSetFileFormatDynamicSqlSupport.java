package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsAlterTableSetFileFormatDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_alter_table_set_file_format")
    public static final OdpsAlterTableSetFileFormat odpsAlterTableSetFileFormat = new OdpsAlterTableSetFileFormat();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_alter_table_set_file_format.oid")
    public static final SqlColumn<Long> oid = odpsAlterTableSetFileFormat.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_alter_table_set_file_format.value_oid")
    public static final SqlColumn<Long> valueOid = odpsAlterTableSetFileFormat.valueOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_alter_table_set_file_format")
    public static final class OdpsAlterTableSetFileFormat extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> valueOid = column("`value_oid`", JDBCType.BIGINT);

        public OdpsAlterTableSetFileFormat() {
            super("odps_alter_table_set_file_format");
        }
    }
}