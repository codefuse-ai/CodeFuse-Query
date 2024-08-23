package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlTableSourceImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    public static final SqlTableSourceImpl sqlTableSourceImpl = new SqlTableSourceImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_source_impl.oid")
    public static final SqlColumn<Long> oid = sqlTableSourceImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_source_impl.alias")
    public static final SqlColumn<String> alias = sqlTableSourceImpl.alias;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_source_impl.alias2")
    public static final SqlColumn<String> alias2 = sqlTableSourceImpl.alias2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_source_impl.flashback_oid")
    public static final SqlColumn<Long> flashbackOid = sqlTableSourceImpl.flashbackOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_table_source_impl.hints_size")
    public static final SqlColumn<Integer> hintsSize = sqlTableSourceImpl.hintsSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_table_source_impl")
    public static final class SqlTableSourceImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> alias = column("`alias`", JDBCType.VARCHAR);

        public final SqlColumn<String> alias2 = column("`alias2`", JDBCType.VARCHAR);

        public final SqlColumn<Long> flashbackOid = column("`flashback_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> hintsSize = column("`hints_size`", JDBCType.BIGINT);

        public SqlTableSourceImpl() {
            super("sql_table_source_impl");
        }
    }
}