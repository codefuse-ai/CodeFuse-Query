package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleUniqueDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_unique")
    public static final OracleUnique oracleUnique = new OracleUnique();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_unique.oid")
    public static final SqlColumn<Long> oid = oracleUnique.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_unique.deferrable")
    public static final SqlColumn<Integer> deferrable = oracleUnique.deferrable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_unique.exceptions_into_oid")
    public static final SqlColumn<Long> exceptionsIntoOid = oracleUnique.exceptionsIntoOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_unique.initially")
    public static final SqlColumn<String> initially = oracleUnique.initially;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_unique.using_oid")
    public static final SqlColumn<Long> usingOid = oracleUnique.usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_unique")
    public static final class OracleUnique extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> deferrable = column("`deferrable`", JDBCType.BIGINT);

        public final SqlColumn<Long> exceptionsIntoOid = column("`exceptions_into_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> initially = column("`initially`", JDBCType.VARCHAR);

        public final SqlColumn<Long> usingOid = column("`using_oid`", JDBCType.BIGINT);

        public OracleUnique() {
            super("oracle_unique");
        }
    }
}