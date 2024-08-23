package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterTableSetOptionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_set_option")
    public static final SqlAlterTableSetOption sqlAlterTableSetOption = new SqlAlterTableSetOption();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_set_option.oid")
    public static final SqlColumn<Long> oid = sqlAlterTableSetOption.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_table_set_option.on_oid")
    public static final SqlColumn<Long> onOid = sqlAlterTableSetOption.onOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_table_set_option")
    public static final class SqlAlterTableSetOption extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> onOid = column("`on_oid`", JDBCType.BIGINT);

        public SqlAlterTableSetOption() {
            super("sql_alter_table_set_option");
        }
    }
}