package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlRenameTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_table_statement")
    public static final MySqlRenameTableStatement mySqlRenameTableStatement = new MySqlRenameTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_rename_table_statement.oid")
    public static final SqlColumn<Long> oid = mySqlRenameTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_rename_table_statement.items")
    public static final SqlColumn<String> items = mySqlRenameTableStatement.items;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_table_statement")
    public static final class MySqlRenameTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> items = column("`items`", JDBCType.VARCHAR);

        public MySqlRenameTableStatement() {
            super("my_sql_rename_table_statement");
        }
    }
}