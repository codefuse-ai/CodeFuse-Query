package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class BinaryExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    public static final BinaryExpression binaryExpression = new BinaryExpression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: binary_expression.element_hash_id")
    public static final SqlColumn<Long> elementHashId = binaryExpression.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: binary_expression.lhs_hash_id")
    public static final SqlColumn<Long> lhsHashId = binaryExpression.lhsHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: binary_expression.rhs_hash_id")
    public static final SqlColumn<Long> rhsHashId = binaryExpression.rhsHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: binary_expression.opcode")
    public static final SqlColumn<String> opcode = binaryExpression.opcode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: binary_expression")
    public static final class BinaryExpression extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> lhsHashId = column("lhs_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> rhsHashId = column("rhs_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> opcode = column("opcode", JDBCType.VARCHAR);

        public BinaryExpression() {
            super("binary_expression");
        }
    }
}