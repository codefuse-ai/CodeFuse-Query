package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OscarFunctionTableSourceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_function_table_source")
    public static final OscarFunctionTableSource oscarFunctionTableSource = new OscarFunctionTableSource();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oscar_function_table_source.oid")
    public static final SqlColumn<Long> oid = oscarFunctionTableSource.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oscar_function_table_source")
    public static final class OscarFunctionTableSource extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public OscarFunctionTableSource() {
            super("oscar_function_table_source");
        }
    }
}