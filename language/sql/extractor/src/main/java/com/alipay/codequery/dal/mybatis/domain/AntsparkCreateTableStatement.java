package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class AntsparkCreateTableStatement implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: antspark_create_table_statement.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: antspark_create_table_statement.datasource_oid")
    private Long datasourceOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: antspark_create_table_statement.meta_life_cycle_oid")
    private Long metaLifeCycleOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: antspark_create_table_statement.serde_properties")
    private String serdeProperties;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    public AntsparkCreateTableStatement(Long oid, Long datasourceOid, Long metaLifeCycleOid, String serdeProperties) {
        this.oid = oid;
        this.datasourceOid = datasourceOid;
        this.metaLifeCycleOid = metaLifeCycleOid;
        this.serdeProperties = serdeProperties;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    public AntsparkCreateTableStatement() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: antspark_create_table_statement.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: antspark_create_table_statement.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: antspark_create_table_statement.datasource_oid")
    public Long getDatasourceOid() {
        return datasourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: antspark_create_table_statement.datasource_oid")
    public void setDatasourceOid(Long datasourceOid) {
        this.datasourceOid = datasourceOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: antspark_create_table_statement.meta_life_cycle_oid")
    public Long getMetaLifeCycleOid() {
        return metaLifeCycleOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: antspark_create_table_statement.meta_life_cycle_oid")
    public void setMetaLifeCycleOid(Long metaLifeCycleOid) {
        this.metaLifeCycleOid = metaLifeCycleOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: antspark_create_table_statement.serde_properties")
    public String getSerdeProperties() {
        return serdeProperties;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: antspark_create_table_statement.serde_properties")
    public void setSerdeProperties(String serdeProperties) {
        this.serdeProperties = serdeProperties == null ? null : serdeProperties.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AntsparkCreateTableStatement other = (AntsparkCreateTableStatement) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getDatasourceOid() == null ? other.getDatasourceOid() == null : this.getDatasourceOid().equals(other.getDatasourceOid()))
            && (this.getMetaLifeCycleOid() == null ? other.getMetaLifeCycleOid() == null : this.getMetaLifeCycleOid().equals(other.getMetaLifeCycleOid()))
            && (this.getSerdeProperties() == null ? other.getSerdeProperties() == null : this.getSerdeProperties().equals(other.getSerdeProperties()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getDatasourceOid() == null) ? 0 : getDatasourceOid().hashCode());
        result = prime * result + ((getMetaLifeCycleOid() == null) ? 0 : getMetaLifeCycleOid().hashCode());
        result = prime * result + ((getSerdeProperties() == null) ? 0 : getSerdeProperties().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: antspark_create_table_statement")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", datasourceOid=").append(datasourceOid);
        sb.append(", metaLifeCycleOid=").append(metaLifeCycleOid);
        sb.append(", serdeProperties=").append(serdeProperties);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}