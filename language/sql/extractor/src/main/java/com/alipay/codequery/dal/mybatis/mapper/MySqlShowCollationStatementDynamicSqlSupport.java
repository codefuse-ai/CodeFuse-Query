package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowCollationStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_collation_statement")
    public static final MySqlShowCollationStatement mySqlShowCollationStatement = new MySqlShowCollationStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_collation_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowCollationStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_collation_statement.pattern_oid")
    public static final SqlColumn<Long> patternOid = mySqlShowCollationStatement.patternOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_collation_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowCollationStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_collation_statement")
    public static final class MySqlShowCollationStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> patternOid = column("`pattern_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowCollationStatement() {
            super("my_sql_show_collation_statement");
        }
    }
}