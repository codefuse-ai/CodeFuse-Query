package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlFlashbackStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flashback_statement")
    public static final MySqlFlashbackStatement mySqlFlashbackStatement = new MySqlFlashbackStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flashback_statement.oid")
    public static final SqlColumn<Long> oid = mySqlFlashbackStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flashback_statement.name_oid")
    public static final SqlColumn<Long> nameOid = mySqlFlashbackStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_flashback_statement.rename_to_oid")
    public static final SqlColumn<Long> renameToOid = mySqlFlashbackStatement.renameToOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_flashback_statement")
    public static final class MySqlFlashbackStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> renameToOid = column("`rename_to_oid`", JDBCType.BIGINT);

        public MySqlFlashbackStatement() {
            super("my_sql_flashback_statement");
        }
    }
}