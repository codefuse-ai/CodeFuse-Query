package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsSetLabelStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    public static final OdpsSetLabelStatement odpsSetLabelStatement = new OdpsSetLabelStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_set_label_statement.oid")
    public static final SqlColumn<Long> oid = odpsSetLabelStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_set_label_statement.label")
    public static final SqlColumn<String> label = odpsSetLabelStatement.label;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_set_label_statement.project_oid")
    public static final SqlColumn<Long> projectOid = odpsSetLabelStatement.projectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_set_label_statement.table_oid")
    public static final SqlColumn<Long> tableOid = odpsSetLabelStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_set_label_statement.user_oid")
    public static final SqlColumn<Long> userOid = odpsSetLabelStatement.userOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_set_label_statement")
    public static final class OdpsSetLabelStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<String> label = column("`label`", JDBCType.VARCHAR);

        public final SqlColumn<Long> projectOid = column("`project_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> userOid = column("`user_oid`", JDBCType.BIGINT);

        public OdpsSetLabelStatement() {
            super("odps_set_label_statement");
        }
    }
}