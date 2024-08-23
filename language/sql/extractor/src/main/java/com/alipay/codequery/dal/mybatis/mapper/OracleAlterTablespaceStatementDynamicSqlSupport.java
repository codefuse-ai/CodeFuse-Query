package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleAlterTablespaceStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_tablespace_statement")
    public static final OracleAlterTablespaceStatement oracleAlterTablespaceStatement = new OracleAlterTablespaceStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_tablespace_statement.oid")
    public static final SqlColumn<Long> oid = oracleAlterTablespaceStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_tablespace_statement.item_oid")
    public static final SqlColumn<Long> itemOid = oracleAlterTablespaceStatement.itemOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_tablespace_statement.name_oid")
    public static final SqlColumn<Long> nameOid = oracleAlterTablespaceStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_tablespace_statement")
    public static final class OracleAlterTablespaceStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> itemOid = column("`item_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public OracleAlterTablespaceStatement() {
            super("oracle_alter_tablespace_statement");
        }
    }
}