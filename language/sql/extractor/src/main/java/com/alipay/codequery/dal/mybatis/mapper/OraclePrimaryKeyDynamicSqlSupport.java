package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OraclePrimaryKeyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    public static final OraclePrimaryKey oraclePrimaryKey = new OraclePrimaryKey();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.oid")
    public static final SqlColumn<Long> oid = oraclePrimaryKey.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.deferrable")
    public static final SqlColumn<Integer> deferrable = oraclePrimaryKey.deferrable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.enable")
    public static final SqlColumn<Integer> enable = oraclePrimaryKey.enable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.exceptions_into_oid")
    public static final SqlColumn<Long> exceptionsIntoOid = oraclePrimaryKey.exceptionsIntoOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.initially")
    public static final SqlColumn<String> initially = oraclePrimaryKey.initially;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_primary_key.using_oid")
    public static final SqlColumn<Long> usingOid = oraclePrimaryKey.usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_primary_key")
    public static final class OraclePrimaryKey extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> deferrable = column("`deferrable`", JDBCType.BIGINT);

        public final SqlColumn<Integer> enable = column("`enable`", JDBCType.BIGINT);

        public final SqlColumn<Long> exceptionsIntoOid = column("`exceptions_into_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> initially = column("`initially`", JDBCType.VARCHAR);

        public final SqlColumn<Long> usingOid = column("`using_oid`", JDBCType.BIGINT);

        public OraclePrimaryKey() {
            super("oracle_primary_key");
        }
    }
}