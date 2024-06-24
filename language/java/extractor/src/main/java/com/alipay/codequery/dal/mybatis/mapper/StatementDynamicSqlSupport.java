package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StatementDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement")
    public static final Statement statement = new Statement();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: statement.element_hash_id")
    public static final SqlColumn<Long> elementHashId = statement.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: statement.parent_hash_id")
    public static final SqlColumn<Long> parentHashId = statement.parentHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: statement.index_order")
    public static final SqlColumn<Integer> indexOrder = statement.indexOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: statement.location_hash_id")
    public static final SqlColumn<Long> locationHashId = statement.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: statement.debug_message")
    public static final SqlColumn<String> debugMessage = statement.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: statement.type")
    public static final SqlColumn<String> type = statement.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: statement")
    public static final class Statement extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentHashId = column("parent_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> indexOrder = column("index_order", JDBCType.INTEGER);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public final SqlColumn<String> type = column("type", JDBCType.VARCHAR);

        public Statement() {
            super("statement");
        }
    }
}