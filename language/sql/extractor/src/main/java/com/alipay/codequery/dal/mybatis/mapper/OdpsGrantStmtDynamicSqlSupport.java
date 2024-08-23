package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsGrantStmtDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    public static final OdpsGrantStmt odpsGrantStmt = new OdpsGrantStmt();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.oid")
    public static final SqlColumn<Long> oid = odpsGrantStmt.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.expire_oid")
    public static final SqlColumn<Long> expireOid = odpsGrantStmt.expireOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.is_label")
    public static final SqlColumn<Integer> isLabel = odpsGrantStmt.isLabel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.is_super")
    public static final SqlColumn<Integer> isSuper = odpsGrantStmt.isSuper;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.label_oid")
    public static final SqlColumn<Long> labelOid = odpsGrantStmt.labelOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_grant_stmt.subject_type")
    public static final SqlColumn<String> subjectType = odpsGrantStmt.subjectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_grant_stmt")
    public static final class OdpsGrantStmt extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> expireOid = column("`expire_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLabel = column("`is_label`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isSuper = column("`is_super`", JDBCType.BIGINT);

        public final SqlColumn<Long> labelOid = column("`label_oid`", JDBCType.BIGINT);

        public final SqlColumn<String> subjectType = column("`subject_type`", JDBCType.VARCHAR);

        public OdpsGrantStmt() {
            super("odps_grant_stmt");
        }
    }
}