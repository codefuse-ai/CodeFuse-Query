package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDropOutlineStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_outline_statement")
    public static final SqlDropOutlineStatement sqlDropOutlineStatement = new SqlDropOutlineStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_outline_statement.oid")
    public static final SqlColumn<Long> oid = sqlDropOutlineStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_outline_statement.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = sqlDropOutlineStatement.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_outline_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlDropOutlineStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_outline_statement")
    public static final class SqlDropOutlineStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlDropOutlineStatement() {
            super("sql_drop_outline_statement");
        }
    }
}