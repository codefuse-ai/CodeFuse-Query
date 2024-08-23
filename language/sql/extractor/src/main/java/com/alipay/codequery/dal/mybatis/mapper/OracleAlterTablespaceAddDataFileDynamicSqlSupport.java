package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OracleAlterTablespaceAddDataFileDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_tablespace_add_data_file")
    public static final OracleAlterTablespaceAddDataFile oracleAlterTablespaceAddDataFile = new OracleAlterTablespaceAddDataFile();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: oracle_alter_tablespace_add_data_file.oid")
    public static final SqlColumn<Long> oid = oracleAlterTablespaceAddDataFile.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: oracle_alter_tablespace_add_data_file")
    public static final class OracleAlterTablespaceAddDataFile extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public OracleAlterTablespaceAddDataFile() {
            super("oracle_alter_tablespace_add_data_file");
        }
    }
}