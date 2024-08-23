package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowRecylebinStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_recylebin_statement")
    public static final SqlShowRecylebinStatement sqlShowRecylebinStatement = new SqlShowRecylebinStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_recylebin_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowRecylebinStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_recylebin_statement")
    public static final class SqlShowRecylebinStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public SqlShowRecylebinStatement() {
            super("sql_show_recylebin_statement");
        }
    }
}