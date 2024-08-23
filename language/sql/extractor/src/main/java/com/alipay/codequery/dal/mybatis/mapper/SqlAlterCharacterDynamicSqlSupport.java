package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SqlAlterCharacterDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_character")
    public static final SqlAlterCharacter sqlAlterCharacter = new SqlAlterCharacter();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_character.oid")
    public static final SqlColumn<Long> oid = sqlAlterCharacter.oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_character.character_set_oid")
    public static final SqlColumn<Long> characterSetOid = sqlAlterCharacter.characterSetOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_alter_character.collate_oid")
    public static final SqlColumn<Long> collateOid = sqlAlterCharacter.collateOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_alter_character")
    public static final class SqlAlterCharacter extends SqlTable {
        public final SqlColumn<Long> oid = column("`oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> characterSetOid = column("`character_set_oid`", JDBCType.BIGINT);

        public final SqlColumn<Long> collateOid = column("`collate_oid`", JDBCType.BIGINT);

        public SqlAlterCharacter() {
            super("sql_alter_character");
        }
    }
}