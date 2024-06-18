package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AssertStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    public static final AssertStatement assertStatement = new AssertStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: assert_statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = assertStatement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: assert_statement.assert_condition_hash_id")
    public static final SqlColumn<Long> assertConditionHashId = assertStatement.assertConditionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: assert_statement.assert_description_hash_id")
    public static final SqlColumn<Long> assertDescriptionHashId = assertStatement.assertDescriptionHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: assert_statement")
    public static final class AssertStatement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> assertConditionHashId = column("assert_condition_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> assertDescriptionHashId = column("assert_description_hash_id", JDBCType.BIGINT);

        public AssertStatement() {
            super("assert_statement");
        }
    }
}