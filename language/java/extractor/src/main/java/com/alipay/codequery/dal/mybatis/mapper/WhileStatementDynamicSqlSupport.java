package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class WhileStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: while_statement")
    public static final WhileStatement whileStatement = new WhileStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: while_statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = whileStatement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: while_statement.condition_hash_id")
    public static final SqlColumn<Long> conditionHashId = whileStatement.conditionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: while_statement.body_declaration_hash_id")
    public static final SqlColumn<Long> bodyDeclarationHashId = whileStatement.bodyDeclarationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: while_statement")
    public static final class WhileStatement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> conditionHashId = column("condition_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> bodyDeclarationHashId = column("body_declaration_hash_id", JDBCType.BIGINT);

        public WhileStatement() {
            super("while_statement");
        }
    }
}