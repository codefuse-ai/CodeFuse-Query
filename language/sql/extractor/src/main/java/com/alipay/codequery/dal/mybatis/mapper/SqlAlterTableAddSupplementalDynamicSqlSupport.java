package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableAddSupplementalDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_supplemental")
    public static final SqlAlterTableAddSupplemental sqlAlterTableAddSupplemental = new SqlAlterTableAddSupplemental();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_supplemental.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableAddSupplemental.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_add_supplemental.element_oid")
    public static final SqlColumn<Long> elementOid = sqlAlterTableAddSupplemental.elementOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_add_supplemental")
    public static final class SqlAlterTableAddSupplemental extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> elementOid = column("`element_oid`", JDBCType.BIGINT);

        public SqlAlterTableAddSupplemental() {
            super("sql_alter_table_add_supplemental");
        }
    }
}