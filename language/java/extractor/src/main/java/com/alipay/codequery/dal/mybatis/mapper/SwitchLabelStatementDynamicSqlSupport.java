package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SwitchLabelStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    public static final SwitchLabelStatement switchLabelStatement = new SwitchLabelStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_label_statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = switchLabelStatement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_label_statement.case_value_hash_id")
    public static final SqlColumn<Long> caseValueHashId = switchLabelStatement.caseValueHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_label_statement.enclosing_switch_block_hash_id")
    public static final SqlColumn<Long> enclosingSwitchBlockHashId = switchLabelStatement.enclosingSwitchBlockHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_label_statement.next_switch_case_hash_id")
    public static final SqlColumn<Long> nextSwitchCaseHashId = switchLabelStatement.nextSwitchCaseHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_label_statement")
    public static final class SwitchLabelStatement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> caseValueHashId = column("case_value_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> enclosingSwitchBlockHashId = column("enclosing_switch_block_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> nextSwitchCaseHashId = column("next_switch_case_hash_id", JDBCType.BIGINT);

        public SwitchLabelStatement() {
            super("switch_label_statement");
        }
    }
}