package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlUpdateTableSourceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_table_source")
    public static final MySqlUpdateTableSource mySqlUpdateTableSource = new MySqlUpdateTableSource();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_table_source.oid")
    public static final SqlColumn<Long> oid = mySqlUpdateTableSource.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_update_table_source.update_oid")
    public static final SqlColumn<Long> updateOid = mySqlUpdateTableSource.updateOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_update_table_source")
    public static final class MySqlUpdateTableSource extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> updateOid = column("`update_oid`", JDBCType.BIGINT);

        public MySqlUpdateTableSource() {
            super("my_sql_update_table_source");
        }
    }
}