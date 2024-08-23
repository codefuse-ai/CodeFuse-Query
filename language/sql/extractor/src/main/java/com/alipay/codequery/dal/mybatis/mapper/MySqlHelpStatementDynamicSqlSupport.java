package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlHelpStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_help_statement")
    public static final MySqlHelpStatement mySqlHelpStatement = new MySqlHelpStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_help_statement.oid")
    public static final SqlColumn<Long> oid = mySqlHelpStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_help_statement.content_oid")
    public static final SqlColumn<Long> contentOid = mySqlHelpStatement.contentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_help_statement")
    public static final class MySqlHelpStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> contentOid = column("`content_oid`", JDBCType.BIGINT);

        public MySqlHelpStatement() {
            super("my_sql_help_statement");
        }
    }
}