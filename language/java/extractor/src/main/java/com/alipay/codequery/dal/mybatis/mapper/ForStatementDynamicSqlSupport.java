package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ForStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    public static final ForStatement forStatement = new ForStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = forStatement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.initialization_hash_id")
    public static final SqlColumn<Long> initializationHashId = forStatement.initializationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.condition_hash_id")
    public static final SqlColumn<Long> conditionHashId = forStatement.conditionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.update_hash_id")
    public static final SqlColumn<Long> updateHashId = forStatement.updateHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: for_statement.body_hash_id")
    public static final SqlColumn<Long> bodyHashId = forStatement.bodyHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: for_statement")
    public static final class ForStatement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> initializationHashId = column("initialization_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> conditionHashId = column("condition_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> updateHashId = column("update_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> bodyHashId = column("body_hash_id", JDBCType.BIGINT);

        public ForStatement() {
            super("for_statement");
        }
    }
}