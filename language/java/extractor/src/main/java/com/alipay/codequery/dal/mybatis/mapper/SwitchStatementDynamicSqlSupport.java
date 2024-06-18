package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SwitchStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    public static final SwitchStatement switchStatement = new SwitchStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = switchStatement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_statement.discriminant_hash_id")
    public static final SqlColumn<Long> discriminantHashId = switchStatement.discriminantHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: switch_statement.body_declaration_hash_id")
    public static final SqlColumn<Long> bodyDeclarationHashId = switchStatement.bodyDeclarationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: switch_statement")
    public static final class SwitchStatement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> discriminantHashId = column("discriminant_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> bodyDeclarationHashId = column("body_declaration_hash_id", JDBCType.BIGINT);

        public SwitchStatement() {
            super("switch_statement");
        }
    }
}