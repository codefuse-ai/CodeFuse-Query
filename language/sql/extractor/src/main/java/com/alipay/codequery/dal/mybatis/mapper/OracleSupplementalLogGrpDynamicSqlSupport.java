package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleSupplementalLogGrpDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    public static final OracleSupplementalLogGrp oracleSupplementalLogGrp = new OracleSupplementalLogGrp();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_log_grp.oid")
    public static final SqlColumn<Long> oid = oracleSupplementalLogGrp.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_log_grp.group_oid")
    public static final SqlColumn<Long> groupOid = oracleSupplementalLogGrp.groupOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_supplemental_log_grp.is_always")
    public static final SqlColumn<Integer> isAlways = oracleSupplementalLogGrp.isAlways;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_supplemental_log_grp")
    public static final class OracleSupplementalLogGrp extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> groupOid = column("`group_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isAlways = column("`is_always`", JDBCType.BIGINT);

        public OracleSupplementalLogGrp() {
            super("oracle_supplemental_log_grp");
        }
    }
}