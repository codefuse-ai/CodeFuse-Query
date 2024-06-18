package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class IfStatementWithoutElseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    public static final IfStatementWithoutElse ifStatementWithoutElse = new IfStatementWithoutElse();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: if_statement_without_else.element_hash_id")
    public static final SqlColumn<Long> elementHashId = ifStatementWithoutElse.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: if_statement_without_else.condition_hash_id")
    public static final SqlColumn<Long> conditionHashId = ifStatementWithoutElse.conditionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: if_statement_without_else.consequent_hash_id")
    public static final SqlColumn<Long> consequentHashId = ifStatementWithoutElse.consequentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_without_else")
    public static final class IfStatementWithoutElse extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> conditionHashId = column("condition_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> consequentHashId = column("consequent_hash_id", JDBCType.BIGINT);

        public IfStatementWithoutElse() {
            super("if_statement_without_else");
        }
    }
}