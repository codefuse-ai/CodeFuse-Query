package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlPrepareStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_prepare_statement")
    public static final MySqlPrepareStatement mySqlPrepareStatement = new MySqlPrepareStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_prepare_statement.oid")
    public static final SqlColumn<Long> oid = mySqlPrepareStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_prepare_statement.from_oid")
    public static final SqlColumn<Long> fromOid = mySqlPrepareStatement.fromOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_prepare_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlPrepareStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_prepare_statement")
    public static final class MySqlPrepareStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> fromOid = column("`from_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public MySqlPrepareStatement() {
            super("my_sql_prepare_statement");
        }
    }
}