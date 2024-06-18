package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InstanceofExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    public static final InstanceofExpression instanceofExpression = new InstanceofExpression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: instanceof_expression.element_hash_id")
    public static final SqlColumn<Long> elementHashId = instanceofExpression.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: instanceof_expression.operand_hash_id")
    public static final SqlColumn<Long> operandHashId = instanceofExpression.operandHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: instanceof_expression.check_type_hash_id")
    public static final SqlColumn<Long> checkTypeHashId = instanceofExpression.checkTypeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: instanceof_expression.pattern_hash_id")
    public static final SqlColumn<Long> patternHashId = instanceofExpression.patternHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: instanceof_expression")
    public static final class InstanceofExpression extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> operandHashId = column("operand_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> checkTypeHashId = column("check_type_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> patternHashId = column("pattern_hash_id", JDBCType.BIGINT);

        public InstanceofExpression() {
            super("instanceof_expression");
        }
    }
}