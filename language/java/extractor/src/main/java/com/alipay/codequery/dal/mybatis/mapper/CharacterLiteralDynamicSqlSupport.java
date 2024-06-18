package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CharacterLiteralDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: character_literal")
    public static final CharacterLiteral characterLiteral = new CharacterLiteral();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: character_literal.element_hash_id")
    public static final SqlColumn<Long> elementHashId = characterLiteral.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: character_literal.value")
    public static final SqlColumn<String> value = characterLiteral.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: character_literal")
    public static final class CharacterLiteral extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public CharacterLiteral() {
            super("character_literal");
        }
    }
}