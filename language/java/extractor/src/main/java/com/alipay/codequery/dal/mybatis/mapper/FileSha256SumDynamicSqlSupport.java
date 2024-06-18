package com.alipay.codequery.dal.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FileSha256SumDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    public static final FileSha256Sum fileSha256Sum = new FileSha256Sum();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file_sha256_sum.file_hash_id")
    public static final SqlColumn<Long> fileHashId = fileSha256Sum.fileHashId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: file_sha256_sum.value")
    public static final SqlColumn<String> value = fileSha256Sum.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: file_sha256_sum")
    public static final class FileSha256Sum extends SqlTable {
        public final SqlColumn<Long> fileHashId = column("file_hash_id", JDBCType.BIGINT);

        public final SqlColumn<String> value = column("value", JDBCType.VARCHAR);

        public FileSha256Sum() {
            super("file_sha256_sum");
        }
    }
}