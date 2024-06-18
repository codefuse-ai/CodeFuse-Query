package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class LabeledStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    public static final LabeledStatement labeledStatement = new LabeledStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: labeled_statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = labeledStatement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: labeled_statement.labeled_hash_identifier_hash_id")
    public static final SqlColumn<Long> labeledHashIdentifierHashId = labeledStatement.labeledHashIdentifierHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: labeled_statement.statement_hash_id")
    public static final SqlColumn<Long> statementHashId = labeledStatement.statementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: labeled_statement")
    public static final class LabeledStatement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> labeledHashIdentifierHashId = column("labeled_hash_identifier_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> statementHashId = column("statement_hash_id", JDBCType.BIGINT);

        public LabeledStatement() {
            super("labeled_statement");
        }
    }
}