package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CatchSectionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    public static final CatchSection catchSection = new CatchSection();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: catch_section.element_hash_id")
    public static final SqlColumn<Long> elementHashId = catchSection.elementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: catch_section.debug_message")
    public static final SqlColumn<String> debugMessage = catchSection.debugMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: catch_section.parameter_hash_id")
    public static final SqlColumn<Long> parameterHashId = catchSection.parameterHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: catch_section.type_hash_id")
    public static final SqlColumn<Long> typeHashId = catchSection.typeHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: catch_section.location_hash_id")
    public static final SqlColumn<Long> locationHashId = catchSection.locationHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: catch_section.try_statement_hash_id")
    public static final SqlColumn<Long> tryStatementHashId = catchSection.tryStatementHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: catch_section.index_order")
    public static final SqlColumn<Integer> indexOrder = catchSection.indexOrder;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: catch_section")
    public static final class CatchSection extends SqlTable {
        public final SqlColumn<Long> elementHashId = column("element_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> debugMessage = column("debug_message", JDBCType.VARCHAR);

        public final SqlColumn<Long> parameterHashId = column("parameter_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> typeHashId = column("type_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> locationHashId = column("location_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Long> tryStatementHashId = column("try_statement_hash_id", JDBCType.BIGINT);

        public final SqlColumn<Integer> indexOrder = column("index_order", JDBCType.INTEGER);

        public CatchSection() {
            super("catch_section");
        }
    }
}