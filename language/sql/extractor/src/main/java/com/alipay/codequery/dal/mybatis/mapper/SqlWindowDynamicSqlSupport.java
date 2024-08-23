package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlWindowDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_window")
    public static final SqlWindow sqlWindow = new SqlWindow();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_window.oid")
    public static final SqlColumn<Long> oid = sqlWindow.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_window.name_oid")
    public static final SqlColumn<Long> nameOid = sqlWindow.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_window.over_oid")
    public static final SqlColumn<Long> overOid = sqlWindow.overOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_window")
    public static final class SqlWindow extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> overOid = column("`over_oid`", JDBCType.BIGINT);

        public SqlWindow() {
            super("sql_window");
        }
    }
}