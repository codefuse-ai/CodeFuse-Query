package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlExprImplDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_expr_impl")
    public static final MySqlExprImpl mySqlExprImpl = new MySqlExprImpl();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_expr_impl.oid")
    public static final SqlColumn<Long> oid = mySqlExprImpl.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_expr_impl.hint_oid")
    public static final SqlColumn<Long> hintOid = mySqlExprImpl.hintOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_expr_impl")
    public static final class MySqlExprImpl extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> hintOid = column("`hint_oid`", JDBCType.BIGINT);

        public MySqlExprImpl() {
            super("my_sql_expr_impl");
        }
    }
}