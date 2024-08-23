package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowCharacterSetStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_character_set_statement")
    public static final MySqlShowCharacterSetStatement mySqlShowCharacterSetStatement = new MySqlShowCharacterSetStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_character_set_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowCharacterSetStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_character_set_statement.pattern_oid")
    public static final SqlColumn<Long> patternOid = mySqlShowCharacterSetStatement.patternOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_character_set_statement.where_oid")
    public static final SqlColumn<Long> whereOid = mySqlShowCharacterSetStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_character_set_statement")
    public static final class MySqlShowCharacterSetStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> patternOid = column("`pattern_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public MySqlShowCharacterSetStatement() {
            super("my_sql_show_character_set_statement");
        }
    }
}