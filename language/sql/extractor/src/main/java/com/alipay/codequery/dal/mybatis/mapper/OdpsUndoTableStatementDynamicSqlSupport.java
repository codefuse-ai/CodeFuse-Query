package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsUndoTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_undo_table_statement")
    public static final OdpsUndoTableStatement odpsUndoTableStatement = new OdpsUndoTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_undo_table_statement.oid")
    public static final SqlColumn<Long> oid = odpsUndoTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_undo_table_statement.table_oid")
    public static final SqlColumn<Long> tableOid = odpsUndoTableStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_undo_table_statement.to_oid")
    public static final SqlColumn<Long> toOid = odpsUndoTableStatement.toOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_undo_table_statement")
    public static final class OdpsUndoTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toOid = column("`to_oid`", JDBCType.BIGINT);

        public OdpsUndoTableStatement() {
            super("odps_undo_table_statement");
        }
    }
}