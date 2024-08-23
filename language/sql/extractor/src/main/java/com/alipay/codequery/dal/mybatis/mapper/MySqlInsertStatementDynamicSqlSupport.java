package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlInsertStatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    public static final MySqlInsertStatement mySqlInsertStatement = new MySqlInsertStatement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.oid")
    public static final SqlColumn<Long> oid = mySqlInsertStatement.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.hints_size")
    public static final SqlColumn<Integer> hintsSize = mySqlInsertStatement.hintsSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_delayed")
    public static final SqlColumn<Integer> isDelayed = mySqlInsertStatement.isDelayed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_fulltext_dictionary")
    public static final SqlColumn<Integer> isFulltextDictionary = mySqlInsertStatement.isFulltextDictionary;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_high_priority")
    public static final SqlColumn<Integer> isHighPriority = mySqlInsertStatement.isHighPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_if_not_exists")
    public static final SqlColumn<Integer> isIfNotExists = mySqlInsertStatement.isIfNotExists;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_ignore")
    public static final SqlColumn<Integer> isIgnore = mySqlInsertStatement.isIgnore;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_low_priority")
    public static final SqlColumn<Integer> isLowPriority = mySqlInsertStatement.isLowPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_overwrite")
    public static final SqlColumn<Integer> isOverwrite = mySqlInsertStatement.isOverwrite;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_insert_statement.is_rollback_on_fail")
    public static final SqlColumn<Integer> isRollbackOnFail = mySqlInsertStatement.isRollbackOnFail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_insert_statement")
    public static final class MySqlInsertStatement extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> hintsSize = column("`hints_size`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isDelayed = column("`is_delayed`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isFulltextDictionary = column("`is_fulltext_dictionary`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isHighPriority = column("`is_high_priority`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIfNotExists = column("`is_if_not_exists`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isIgnore = column("`is_ignore`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isLowPriority = column("`is_low_priority`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isOverwrite = column("`is_overwrite`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isRollbackOnFail = column("`is_rollback_on_fail`", JDBCType.BIGINT);

        public MySqlInsertStatement() {
            super("my_sql_insert_statement");
        }
    }
}