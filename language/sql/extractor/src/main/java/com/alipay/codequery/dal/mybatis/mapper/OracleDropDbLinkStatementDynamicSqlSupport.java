package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleDropDbLinkStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_drop_db_link_statement")
    public static final OracleDropDbLinkStatement oracleDropDbLinkStatement = new OracleDropDbLinkStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_drop_db_link_statement.oid")
    public static final SqlColumn<Long> oid = oracleDropDbLinkStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_drop_db_link_statement.is_public")
    public static final SqlColumn<Integer> isPublic = oracleDropDbLinkStatement.isPublic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_drop_db_link_statement.name_oid")
    public static final SqlColumn<Long> nameOid = oracleDropDbLinkStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_drop_db_link_statement")
    public static final class OracleDropDbLinkStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isPublic = column("`is_public`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public OracleDropDbLinkStatement() {
            super("oracle_drop_db_link_statement");
        }
    }
}