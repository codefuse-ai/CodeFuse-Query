package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MysqlDeallocatePrepareStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_deallocate_prepare_statement")
    public static final MysqlDeallocatePrepareStatement mysqlDeallocatePrepareStatement = new MysqlDeallocatePrepareStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_deallocate_prepare_statement.oid")
    public static final SqlColumn<Long> oid = mysqlDeallocatePrepareStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: mysql_deallocate_prepare_statement.statement_name_oid")
    public static final SqlColumn<Long> statementNameOid = mysqlDeallocatePrepareStatement.statementNameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: mysql_deallocate_prepare_statement")
    public static final class MysqlDeallocatePrepareStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> statementNameOid = column("`statement_name_oid`", JDBCType.BIGINT);

        public MysqlDeallocatePrepareStatement() {
            super("mysql_deallocate_prepare_statement");
        }
    }
}