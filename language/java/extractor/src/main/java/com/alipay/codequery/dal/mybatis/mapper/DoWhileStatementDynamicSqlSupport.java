package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DoWhileStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    public static final DoWhileStatement doWhileStatement = new DoWhileStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: do_while_statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = doWhileStatement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: do_while_statement.keyword")
    public static final SqlColumn<String> keyword = doWhileStatement.keyword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: do_while_statement.condition_hash_id")
    public static final SqlColumn<Long> conditionHashId = doWhileStatement.conditionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: do_while_statement.body_declaration_hash_id")
    public static final SqlColumn<Long> bodyDeclarationHashId = doWhileStatement.bodyDeclarationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: do_while_statement")
    public static final class DoWhileStatement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> keyword = column("keyword", JDBCType.VARCHAR);

        public final SqlColumn<Long> conditionHashId = column("condition_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> bodyDeclarationHashId = column("body_declaration_hash_id", JDBCType.BIGINT);

        public DoWhileStatement() {
            super("do_while_statement");
        }
    }
}