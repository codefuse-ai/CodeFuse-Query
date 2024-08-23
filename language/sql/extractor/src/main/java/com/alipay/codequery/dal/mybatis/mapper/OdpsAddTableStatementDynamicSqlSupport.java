package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OdpsAddTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    public static final OdpsAddTableStatement odpsAddTableStatement = new OdpsAddTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.oid")
    public static final SqlColumn<Long> oid = odpsAddTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.comment_oid")
    public static final SqlColumn<Long> commentOid = odpsAddTableStatement.commentOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.is_force")
    public static final SqlColumn<Integer> isForce = odpsAddTableStatement.isForce;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.table_oid")
    public static final SqlColumn<Long> tableOid = odpsAddTableStatement.tableOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: odps_add_table_statement.to_package_oid")
    public static final SqlColumn<Long> toPackageOid = odpsAddTableStatement.toPackageOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: odps_add_table_statement")
    public static final class OdpsAddTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> commentOid = column("`comment_oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isForce = column("`is_force`", JDBCType.BIGINT);

        public final SqlColumn<Long> tableOid = column("`table_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> toPackageOid = column("`to_package_oid`", JDBCType.BIGINT);

        public OdpsAddTableStatement() {
            super("odps_add_table_statement");
        }
    }
}