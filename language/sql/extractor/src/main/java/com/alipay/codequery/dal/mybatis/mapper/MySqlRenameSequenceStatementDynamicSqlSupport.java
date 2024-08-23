package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlRenameSequenceStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    public static final MySqlRenameSequenceStatement mySqlRenameSequenceStatement = new MySqlRenameSequenceStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_rename_sequence_statement.oid")
    public static final SqlColumn<Long> oid = mySqlRenameSequenceStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_rename_sequence_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlRenameSequenceStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_rename_sequence_statement.to_oid")
    public static final SqlColumn<Long> toOid = mySqlRenameSequenceStatement.toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_rename_sequence_statement")
    public static final class MySqlRenameSequenceStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toOid = column("`to_oid`", JDBCType.BIGINT);

        public MySqlRenameSequenceStatement() {
            super("my_sql_rename_sequence_statement");
        }
    }
}