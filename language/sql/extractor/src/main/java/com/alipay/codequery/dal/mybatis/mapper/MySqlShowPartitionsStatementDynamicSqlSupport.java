package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlShowPartitionsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_partitions_statement")
    public static final MySqlShowPartitionsStatement mySqlShowPartitionsStatement = new MySqlShowPartitionsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_partitions_statement.oid")
    public static final SqlColumn<Long> oid = mySqlShowPartitionsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_show_partitions_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlShowPartitionsStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_show_partitions_statement")
    public static final class MySqlShowPartitionsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public MySqlShowPartitionsStatement() {
            super("my_sql_show_partitions_statement");
        }
    }
}