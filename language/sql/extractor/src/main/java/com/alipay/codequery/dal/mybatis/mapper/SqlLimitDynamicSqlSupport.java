package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlLimitDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_limit")
    public static final SqlLimit sqlLimit = new SqlLimit();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_limit.oid")
    public static final SqlColumn<Long> oid = sqlLimit.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_limit.offset_oid")
    public static final SqlColumn<Long> offsetOid = sqlLimit.offsetOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_limit.row_count_oid")
    public static final SqlColumn<Long> rowCountOid = sqlLimit.rowCountOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_limit")
    public static final class SqlLimit extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> offsetOid = column("`offset_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> rowCountOid = column("`row_count_oid`", JDBCType.BIGINT);

        public SqlLimit() {
            super("sql_limit");
        }
    }
}