package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleSysdateExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_sysdate_expr")
    public static final OracleSysdateExpr oracleSysdateExpr = new OracleSysdateExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_sysdate_expr.oid")
    public static final SqlColumn<Long> oid = oracleSysdateExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_sysdate_expr.option")
    public static final SqlColumn<String> option = oracleSysdateExpr.option;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_sysdate_expr")
    public static final class OracleSysdateExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> option = column("`option`", JDBCType.VARCHAR);

        public OracleSysdateExpr() {
            super("oracle_sysdate_expr");
        }
    }
}