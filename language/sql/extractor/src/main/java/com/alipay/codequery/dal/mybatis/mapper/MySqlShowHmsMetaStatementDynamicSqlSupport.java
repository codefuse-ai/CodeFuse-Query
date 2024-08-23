package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowHmsMetaStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_hms_meta_statement")
    public static final MySqlShowHmsMetaStatement mySqlShowHmsMetaStatement = new MySqlShowHmsMetaStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_hms_meta_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowHmsMetaStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_hms_meta_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlShowHmsMetaStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_hms_meta_statement.schema")
    public static final SqlColumn<String> schema = mySqlShowHmsMetaStatement.schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_hms_meta_statement.table_name")
    public static final SqlColumn<String> tableName = mySqlShowHmsMetaStatement.tableName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_hms_meta_statement")
    public static final class MySqlShowHmsMetaStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> schema = column("`schema`", JDBCType.VARCHAR);

        public final SqlColumn<String> tableName = column("`table_name`", JDBCType.VARCHAR);

        public MySqlShowHmsMetaStatement() {
            super("my_sql_show_hms_meta_statement");
        }
    }
}