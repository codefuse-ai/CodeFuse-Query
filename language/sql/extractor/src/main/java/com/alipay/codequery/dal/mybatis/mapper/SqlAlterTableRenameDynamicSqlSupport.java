package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableRenameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_rename")
    public static final SqlAlterTableRename sqlAlterTableRename = new SqlAlterTableRename();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableRename.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename.to_name_oid")
    public static final SqlColumn<Long> toNameOid = sqlAlterTableRename.toNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_rename.to_oid")
    public static final SqlColumn<Long> toOid = sqlAlterTableRename.toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_rename")
    public static final class SqlAlterTableRename extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toNameOid = column("`to_name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toOid = column("`to_oid`", JDBCType.BIGINT);

        public SqlAlterTableRename() {
            super("sql_alter_table_rename");
        }
    }
}