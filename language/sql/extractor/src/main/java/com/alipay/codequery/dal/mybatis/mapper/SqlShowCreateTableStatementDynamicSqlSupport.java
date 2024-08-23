package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlShowCreateTableStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_create_table_statement")
    public static final SqlShowCreateTableStatement sqlShowCreateTableStatement = new SqlShowCreateTableStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_create_table_statement.oid")
    public static final SqlColumn<Long> oid = sqlShowCreateTableStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_create_table_statement.is_all")
    public static final SqlColumn<Integer> isAll = sqlShowCreateTableStatement.isAll;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_create_table_statement.like_mapping_oid")
    public static final SqlColumn<Long> likeMappingOid = sqlShowCreateTableStatement.likeMappingOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_show_create_table_statement.name_oid")
    public static final SqlColumn<Long> nameOid = sqlShowCreateTableStatement.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_show_create_table_statement")
    public static final class SqlShowCreateTableStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isAll = column("`is_all`", JDBCType.BIGINT);

        public final SqlColumn<Long> likeMappingOid = column("`like_mapping_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public SqlShowCreateTableStatement() {
            super("sql_show_create_table_statement");
        }
    }
}