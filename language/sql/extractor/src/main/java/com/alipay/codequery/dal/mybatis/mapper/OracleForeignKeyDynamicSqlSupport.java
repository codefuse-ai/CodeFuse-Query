package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleForeignKeyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_foreign_key")
    public static final OracleForeignKey oracleForeignKey = new OracleForeignKey();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_foreign_key.oid")
    public static final SqlColumn<Long> oid = oracleForeignKey.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_foreign_key.deferrable")
    public static final SqlColumn<Integer> deferrable = oracleForeignKey.deferrable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_foreign_key.exceptions_into_oid")
    public static final SqlColumn<Long> exceptionsIntoOid = oracleForeignKey.exceptionsIntoOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_foreign_key.initially")
    public static final SqlColumn<String> initially = oracleForeignKey.initially;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_foreign_key.using_oid")
    public static final SqlColumn<Long> usingOid = oracleForeignKey.usingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_foreign_key")
    public static final class OracleForeignKey extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> deferrable = column("`deferrable`", JDBCType.BIGINT);

        public final SqlColumn<Long> exceptionsIntoOid = column("`exceptions_into_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> initially = column("`initially`", JDBCType.VARCHAR);

        public final SqlColumn<Long> usingOid = column("`using_oid`", JDBCType.BIGINT);

        public OracleForeignKey() {
            super("oracle_foreign_key");
        }
    }
}