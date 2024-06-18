package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ExpressionListExpressionRelationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    public static final ExpressionListExpressionRelation expressionListExpressionRelation = new ExpressionListExpressionRelation();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression_list_expression_relation.expression_list_hash_id")
    public static final SqlColumn<Long> expressionListHashId = expressionListExpressionRelation.expressionListHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression_list_expression_relation.expression_hash_id")
    public static final SqlColumn<Long> expressionHashId = expressionListExpressionRelation.expressionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: expression_list_expression_relation.position")
    public static final SqlColumn<Integer> position = expressionListExpressionRelation.position;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: expression_list_expression_relation")
    public static final class ExpressionListExpressionRelation extends SqlTable {
        public final SqlColumn<Long> expressionListHashId = column("expression_list_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> expressionHashId = column("expression_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> position = column("position", JDBCType.INTEGER);

        public ExpressionListExpressionRelation() {
            super("expression_list_expression_relation");
        }
    }
}