package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsListStmtDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_list_stmt")
    public static final OdpsListStmt odpsListStmt = new OdpsListStmt();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_list_stmt.oid")
    public static final SqlColumn<Long> oid = odpsListStmt.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_list_stmt.object_oid")
    public static final SqlColumn<Long> objectOid = odpsListStmt.objectOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_list_stmt")
    public static final class OdpsListStmt extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> objectOid = column("`object_oid`", JDBCType.BIGINT);

        public OdpsListStmt() {
            super("odps_list_stmt");
        }
    }
}