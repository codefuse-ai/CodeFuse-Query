package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowOutlinesStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_outlines_statement")
    public static final SqlShowOutlinesStatement sqlShowOutlinesStatement = new SqlShowOutlinesStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_outlines_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowOutlinesStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_outlines_statement.limit_oid")
    public static final SqlColumn<Long> limitOid = sqlShowOutlinesStatement.limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_outlines_statement.order_by_oid")
    public static final SqlColumn<Long> orderByOid = sqlShowOutlinesStatement.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_outlines_statement.where_oid")
    public static final SqlColumn<Long> whereOid = sqlShowOutlinesStatement.whereOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_outlines_statement")
    public static final class SqlShowOutlinesStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> limitOid = column("`limit_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> whereOid = column("`where_oid`", JDBCType.BIGINT);

        public SqlShowOutlinesStatement() {
            super("sql_show_outlines_statement");
        }
    }
}