package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleSelectRestrictionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_restriction")
    public static final OracleSelectRestriction oracleSelectRestriction = new OracleSelectRestriction();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_restriction.oid")
    public static final SqlColumn<Long> oid = oracleSelectRestriction.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_select_restriction.constraint_oid")
    public static final SqlColumn<Long> constraintOid = oracleSelectRestriction.constraintOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_select_restriction")
    public static final class OracleSelectRestriction extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> constraintOid = column("`constraint_oid`", JDBCType.BIGINT);

        public OracleSelectRestriction() {
            super("oracle_select_restriction");
        }
    }
}