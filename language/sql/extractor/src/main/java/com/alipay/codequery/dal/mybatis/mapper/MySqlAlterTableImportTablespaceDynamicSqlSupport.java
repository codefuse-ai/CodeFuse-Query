package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlAlterTableImportTablespaceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_import_tablespace")
    public static final MySqlAlterTableImportTablespace mySqlAlterTableImportTablespace = new MySqlAlterTableImportTablespace();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_import_tablespace.oid")
    public static final SqlColumn<Long> oid = mySqlAlterTableImportTablespace.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_import_tablespace")
    public static final class MySqlAlterTableImportTablespace extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlAlterTableImportTablespace() {
            super("my_sql_alter_table_import_tablespace");
        }
    }
}