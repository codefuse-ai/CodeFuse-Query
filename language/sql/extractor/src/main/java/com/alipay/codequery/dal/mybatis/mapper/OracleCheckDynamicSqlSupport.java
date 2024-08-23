package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleCheckDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_check")
    public static final OracleCheck oracleCheck = new OracleCheck();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_check.oid")
    public static final SqlColumn<Long> oid = oracleCheck.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_check.deferrable")
    public static final SqlColumn<Integer> deferrable = oracleCheck.deferrable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_check.exceptions_into_oid")
    public static final SqlColumn<Long> exceptionsIntoOid = oracleCheck.exceptionsIntoOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_check.initially")
    public static final SqlColumn<String> initially = oracleCheck.initially;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_check.using_oid")
    public static final SqlColumn<Long> usingOid = oracleCheck.usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_check")
    public static final class OracleCheck extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> deferrable = column("`deferrable`", JDBCType.BIGINT);

        public final SqlColumn<Long> exceptionsIntoOid = column("`exceptions_into_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> initially = column("`initially`", JDBCType.VARCHAR);

        public final SqlColumn<Long> usingOid = column("`using_oid`", JDBCType.BIGINT);

        public OracleCheck() {
            super("oracle_check");
        }
    }
}