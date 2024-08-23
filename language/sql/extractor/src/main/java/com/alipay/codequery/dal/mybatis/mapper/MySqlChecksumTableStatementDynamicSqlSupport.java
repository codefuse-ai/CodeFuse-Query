package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlChecksumTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_checksum_table_statement")
    public static final MySqlChecksumTableStatement mySqlChecksumTableStatement = new MySqlChecksumTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_checksum_table_statement.oid")
    public static final SqlColumn<Long> oid = mySqlChecksumTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_checksum_table_statement.is_extended")
    public static final SqlColumn<Integer> isExtended = mySqlChecksumTableStatement.isExtended;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_checksum_table_statement.is_quick")
    public static final SqlColumn<Integer> isQuick = mySqlChecksumTableStatement.isQuick;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_checksum_table_statement")
    public static final class MySqlChecksumTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isExtended = column("`is_extended`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isQuick = column("`is_quick`", JDBCType.BIGINT);

        public MySqlChecksumTableStatement() {
            super("my_sql_checksum_table_statement");
        }
    }
}