package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowPackagesStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_packages_statement")
    public static final SqlShowPackagesStatement sqlShowPackagesStatement = new SqlShowPackagesStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_packages_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowPackagesStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_packages_statement")
    public static final class SqlShowPackagesStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlShowPackagesStatement() {
            super("sql_show_packages_statement");
        }
    }
}