package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleAlterTableMoveTablespaceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_table_move_tablespace")
    public static final OracleAlterTableMoveTablespace oracleAlterTableMoveTablespace = new OracleAlterTableMoveTablespace();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_table_move_tablespace.oid")
    public static final SqlColumn<Long> oid = oracleAlterTableMoveTablespace.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_table_move_tablespace.name_oid")
    public static final SqlColumn<Long> nameOid = oracleAlterTableMoveTablespace.nameOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_table_move_tablespace")
    public static final class OracleAlterTableMoveTablespace extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> nameOid = column("`name_oid`", JDBCType.BIGINT);

        public OracleAlterTableMoveTablespace() {
            super("oracle_alter_table_move_tablespace");
        }
    }
}