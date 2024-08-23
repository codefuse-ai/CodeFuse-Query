package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlDropSequenceStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_sequence_statement")
    public static final SqlDropSequenceStatement sqlDropSequenceStatement = new SqlDropSequenceStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_sequence_statement.oid")
    public static final SqlColumn<Long> oid = sqlDropSequenceStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_sequence_statement.is_if_exists")
    public static final SqlColumn<Integer> isIfExists = sqlDropSequenceStatement.isIfExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_sequence_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlDropSequenceStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_drop_sequence_statement.schema")
    public static final SqlColumn<String> schema = sqlDropSequenceStatement.schema;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_drop_sequence_statement")
    public static final class SqlDropSequenceStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfExists = column("`is_if_exists`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> schema = column("`schema`", JDBCType.VARCHAR);

        public SqlDropSequenceStatement() {
            super("sql_drop_sequence_statement");
        }
    }
}