package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsShowChangelogsStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_changelogs_statement")
    public static final OdpsShowChangelogsStatement odpsShowChangelogsStatement = new OdpsShowChangelogsStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_changelogs_statement.oid")
    public static final SqlColumn<Long> oid = odpsShowChangelogsStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_changelogs_statement.id_oid")
    public static final SqlColumn<Long> idOid = odpsShowChangelogsStatement.idOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_changelogs_statement.is_tables")
    public static final SqlColumn<Integer> isTables = odpsShowChangelogsStatement.isTables;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_changelogs_statement.table_oid")
    public static final SqlColumn<Long> tableOid = odpsShowChangelogsStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_changelogs_statement")
    public static final class OdpsShowChangelogsStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> idOid = column("`id_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isTables = column("`is_tables`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public OdpsShowChangelogsStatement() {
            super("odps_show_changelogs_statement");
        }
    }
}