package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MySqlAlterTableValidationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_validation")
    public static final MySqlAlterTableValidation mySqlAlterTableValidation = new MySqlAlterTableValidation();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_validation.oid")
    public static final SqlColumn<Long> oid = mySqlAlterTableValidation.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: my_sql_alter_table_validation.is_with_validation")
    public static final SqlColumn<Integer> isWithValidation = mySqlAlterTableValidation.isWithValidation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: my_sql_alter_table_validation")
    public static final class MySqlAlterTableValidation extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Integer> isWithValidation = column("`is_with_validation`", JDBCType.BIGINT);

        public MySqlAlterTableValidation() {
            super("my_sql_alter_table_validation");
        }
    }
}