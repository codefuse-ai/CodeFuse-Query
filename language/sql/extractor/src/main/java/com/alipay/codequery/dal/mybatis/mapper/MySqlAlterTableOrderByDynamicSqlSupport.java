package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlAlterTableOrderByDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_order_by")
    public static final MySqlAlterTableOrderBy mySqlAlterTableOrderBy = new MySqlAlterTableOrderBy();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_order_by.oid")
    public static final SqlColumn<Long> oid = mySqlAlterTableOrderBy.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_order_by")
    public static final class MySqlAlterTableOrderBy extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public MySqlAlterTableOrderBy() {
            super("my_sql_alter_table_order_by");
        }
    }
}