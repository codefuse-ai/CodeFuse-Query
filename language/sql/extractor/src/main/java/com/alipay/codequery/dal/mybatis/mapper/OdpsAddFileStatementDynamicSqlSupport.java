package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsAddFileStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    public static final OdpsAddFileStatement odpsAddFileStatement = new OdpsAddFileStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_file_statement.oid")
    public static final SqlColumn<Long> oid = odpsAddFileStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_file_statement.alias")
    public static final SqlColumn<String> alias = odpsAddFileStatement.alias;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_file_statement.comment_oid")
    public static final SqlColumn<Long> commentOid = odpsAddFileStatement.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_file_statement.file")
    public static final SqlColumn<String> file = odpsAddFileStatement.file;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_file_statement.is_force")
    public static final SqlColumn<Integer> isForce = odpsAddFileStatement.isForce;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_file_statement.type")
    public static final SqlColumn<String> type = odpsAddFileStatement.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_file_statement")
    public static final class OdpsAddFileStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> alias = column("`alias`", JDBCType.VARCHAR);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> file = column("`file`", JDBCType.VARCHAR);

        public final SqlColumn<Integer> isForce = column("`is_force`", JDBCType.BIGINT);

        public final SqlColumn<String> type = column("`type`", JDBCType.VARCHAR);

        public OdpsAddFileStatement() {
            super("odps_add_file_statement");
        }
    }
}