package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AssignmentExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    public static final AssignmentExpression assignmentExpression = new AssignmentExpression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: assignment_expression.element_hash_id")
    public static final SqlColumn<Long> elementHashId = assignmentExpression.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: assignment_expression.lhs_hash_id")
    public static final SqlColumn<Long> lhsHashId = assignmentExpression.lhsHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: assignment_expression.rhs_hash_id")
    public static final SqlColumn<Long> rhsHashId = assignmentExpression.rhsHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: assignment_expression.opcode")
    public static final SqlColumn<String> opcode = assignmentExpression.opcode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assignment_expression")
    public static final class AssignmentExpression extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> lhsHashId = column("lhs_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> rhsHashId = column("rhs_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> opcode = column("opcode", JDBCType.VARCHAR);

        public AssignmentExpression() {
            super("assignment_expression");
        }
    }
}