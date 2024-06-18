package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class IfStatementWithElseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    public static final IfStatementWithElse ifStatementWithElse = new IfStatementWithElse();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: if_statement_with_else.element_hash_id")
    public static final SqlColumn<Long> elementHashId = ifStatementWithElse.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: if_statement_with_else.condition_hash_id")
    public static final SqlColumn<Long> conditionHashId = ifStatementWithElse.conditionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: if_statement_with_else.consequent_hash_id")
    public static final SqlColumn<Long> consequentHashId = ifStatementWithElse.consequentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: if_statement_with_else.alternate_hash_id")
    public static final SqlColumn<Long> alternateHashId = ifStatementWithElse.alternateHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: if_statement_with_else")
    public static final class IfStatementWithElse extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> conditionHashId = column("condition_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> consequentHashId = column("consequent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> alternateHashId = column("alternate_hash_id", JDBCType.BIGINT);

        public IfStatementWithElse() {
            super("if_statement_with_else");
        }
    }
}