package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlBinaryOpExprDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    public static final SqlBinaryOpExpr sqlBinaryOpExpr = new SqlBinaryOpExpr();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.oid")
    public static final SqlColumn<Long> oid = sqlBinaryOpExpr.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_both_name")
    public static final SqlColumn<Integer> isBothName = sqlBinaryOpExpr.isBothName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_left_function_and_right_literal")
    public static final SqlColumn<Integer> isLeftFunctionAndRightLiteral = sqlBinaryOpExpr.isLeftFunctionAndRightLiteral;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_left_literal_and_right_name")
    public static final SqlColumn<Integer> isLeftLiteralAndRightName = sqlBinaryOpExpr.isLeftLiteralAndRightName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_left_name_and_right_literal")
    public static final SqlColumn<Integer> isLeftNameAndRightLiteral = sqlBinaryOpExpr.isLeftNameAndRightLiteral;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_name_and_literal")
    public static final SqlColumn<Integer> isNameAndLiteral = sqlBinaryOpExpr.isNameAndLiteral;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.is_parenthesized")
    public static final SqlColumn<Integer> isParenthesized = sqlBinaryOpExpr.isParenthesized;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.left_oid")
    public static final SqlColumn<Long> leftOid = sqlBinaryOpExpr.leftOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.operator")
    public static final SqlColumn<String> operator = sqlBinaryOpExpr.operator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_binary_op_expr.right_oid")
    public static final SqlColumn<Long> rightOid = sqlBinaryOpExpr.rightOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_binary_op_expr")
    public static final class SqlBinaryOpExpr extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isBothName = column("`is_both_name`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLeftFunctionAndRightLiteral = column("`is_left_function_and_right_literal`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLeftLiteralAndRightName = column("`is_left_literal_and_right_name`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLeftNameAndRightLiteral = column("`is_left_name_and_right_literal`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isNameAndLiteral = column("`is_name_and_literal`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isParenthesized = column("`is_parenthesized`", JDBCType.BIGINT);

        public final SqlColumn<Long> leftOid = column("`left_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> operator = column("`operator`", JDBCType.VARCHAR);

        public final SqlColumn<Long> rightOid = column("`right_oid`", JDBCType.BIGINT);

        public SqlBinaryOpExpr() {
            super("sql_binary_op_expr");
        }
    }
}