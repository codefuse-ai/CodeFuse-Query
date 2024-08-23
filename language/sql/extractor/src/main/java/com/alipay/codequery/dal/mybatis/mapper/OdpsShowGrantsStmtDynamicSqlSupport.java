package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsShowGrantsStmtDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    public static final OdpsShowGrantsStmt odpsShowGrantsStmt = new OdpsShowGrantsStmt();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_grants_stmt.oid")
    public static final SqlColumn<Long> oid = odpsShowGrantsStmt.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_grants_stmt.is_label")
    public static final SqlColumn<Integer> isLabel = odpsShowGrantsStmt.isLabel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_grants_stmt.object_type_oid")
    public static final SqlColumn<Long> objectTypeOid = odpsShowGrantsStmt.objectTypeOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_show_grants_stmt.user_oid")
    public static final SqlColumn<Long> userOid = odpsShowGrantsStmt.userOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_show_grants_stmt")
    public static final class OdpsShowGrantsStmt extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLabel = column("`is_label`", JDBCType.BIGINT);

        public final SqlColumn<Long> objectTypeOid = column("`object_type_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> userOid = column("`user_oid`", JDBCType.BIGINT);

        public OdpsShowGrantsStmt() {
            super("odps_show_grants_stmt");
        }
    }
}