package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlBinaryOpExprGroupDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr_group")
    public static final SqlBinaryOpExprGroup sqlBinaryOpExprGroup = new SqlBinaryOpExprGroup();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr_group.oid")
    public static final SqlColumn<Long> oid = sqlBinaryOpExprGroup.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr_group.operator")
    public static final SqlColumn<String> operator = sqlBinaryOpExprGroup.operator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr_group")
    public static final class SqlBinaryOpExprGroup extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> operator = column("`operator`", JDBCType.VARCHAR);

        public SqlBinaryOpExprGroup() {
            super("sql_binary_op_expr_group");
        }
    }
}