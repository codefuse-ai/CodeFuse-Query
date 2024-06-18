package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PolyadicExpressionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: polyadic_expression")
    public static final PolyadicExpression polyadicExpression = new PolyadicExpression();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: polyadic_expression.element_hash_id")
    public static final SqlColumn<Long> elementHashId = polyadicExpression.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: polyadic_expression.size")
    public static final SqlColumn<Integer> size = polyadicExpression.size;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: polyadic_expression.opcode")
    public static final SqlColumn<String> opcode = polyadicExpression.opcode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: polyadic_expression")
    public static final class PolyadicExpression extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> size = column("size", JDBCType.INTEGER);

        public final SqlColumn<String> opcode = column("opcode", JDBCType.VARCHAR);

        public PolyadicExpression() {
            super("polyadic_expression");
        }
    }
}