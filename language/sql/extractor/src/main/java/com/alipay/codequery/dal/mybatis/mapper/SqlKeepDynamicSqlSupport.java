package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlKeepDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_keep")
    public static final SqlKeep sqlKeep = new SqlKeep();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_keep.oid")
    public static final SqlColumn<Long> oid = sqlKeep.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_keep.dense_rank")
    public static final SqlColumn<String> denseRank = sqlKeep.denseRank;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_keep.order_by_oid")
    public static final SqlColumn<Long> orderByOid = sqlKeep.orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_keep")
    public static final class SqlKeep extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> denseRank = column("`dense_rank`", JDBCType.VARCHAR);

        public final SqlColumn<Long> orderByOid = column("`order_by_oid`", JDBCType.BIGINT);

        public SqlKeep() {
            super("sql_keep");
        }
    }
}