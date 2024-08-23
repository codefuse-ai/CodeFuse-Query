package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlSelectItem implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.alias")
    private String alias;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.alias2")
    private String alias2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.alias_list")
    private String aliasList;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.expr_oid")
    private Long exprOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.is_connect_by_root")
    private Integer isConnectByRoot;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.is_udtf_select_item")
    private Integer isUdtfSelectItem;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    public SqlSelectItem(Long oid, String alias, String alias2, String aliasList, Long exprOid, Integer isConnectByRoot, Integer isUdtfSelectItem) {
        this.oid = oid;
        this.alias = alias;
        this.alias2 = alias2;
        this.aliasList = aliasList;
        this.exprOid = exprOid;
        this.isConnectByRoot = isConnectByRoot;
        this.isUdtfSelectItem = isUdtfSelectItem;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    public SqlSelectItem() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.alias")
    public String getAlias() {
        return alias;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.alias")
    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.alias2")
    public String getAlias2() {
        return alias2;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.alias2")
    public void setAlias2(String alias2) {
        this.alias2 = alias2 == null ? null : alias2.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.alias_list")
    public String getAliasList() {
        return aliasList;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.alias_list")
    public void setAliasList(String aliasList) {
        this.aliasList = aliasList == null ? null : aliasList.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.expr_oid")
    public Long getExprOid() {
        return exprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.expr_oid")
    public void setExprOid(Long exprOid) {
        this.exprOid = exprOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.is_connect_by_root")
    public Integer getIsConnectByRoot() {
        return isConnectByRoot;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.is_connect_by_root")
    public void setIsConnectByRoot(Integer isConnectByRoot) {
        this.isConnectByRoot = isConnectByRoot;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.is_udtf_select_item")
    public Integer getIsUdtfSelectItem() {
        return isUdtfSelectItem;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select_item.is_udtf_select_item")
    public void setIsUdtfSelectItem(Integer isUdtfSelectItem) {
        this.isUdtfSelectItem = isUdtfSelectItem;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
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
        SqlSelectItem other = (SqlSelectItem) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getAlias() == null ? other.getAlias() == null : this.getAlias().equals(other.getAlias()))
            && (this.getAlias2() == null ? other.getAlias2() == null : this.getAlias2().equals(other.getAlias2()))
            && (this.getAliasList() == null ? other.getAliasList() == null : this.getAliasList().equals(other.getAliasList()))
            && (this.getExprOid() == null ? other.getExprOid() == null : this.getExprOid().equals(other.getExprOid()))
            && (this.getIsConnectByRoot() == null ? other.getIsConnectByRoot() == null : this.getIsConnectByRoot().equals(other.getIsConnectByRoot()))
            && (this.getIsUdtfSelectItem() == null ? other.getIsUdtfSelectItem() == null : this.getIsUdtfSelectItem().equals(other.getIsUdtfSelectItem()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getAlias() == null) ? 0 : getAlias().hashCode());
        result = prime * result + ((getAlias2() == null) ? 0 : getAlias2().hashCode());
        result = prime * result + ((getAliasList() == null) ? 0 : getAliasList().hashCode());
        result = prime * result + ((getExprOid() == null) ? 0 : getExprOid().hashCode());
        result = prime * result + ((getIsConnectByRoot() == null) ? 0 : getIsConnectByRoot().hashCode());
        result = prime * result + ((getIsUdtfSelectItem() == null) ? 0 : getIsUdtfSelectItem().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select_item")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", alias=").append(alias);
        sb.append(", alias2=").append(alias2);
        sb.append(", aliasList=").append(aliasList);
        sb.append(", exprOid=").append(exprOid);
        sb.append(", isConnectByRoot=").append(isConnectByRoot);
        sb.append(", isUdtfSelectItem=").append(isUdtfSelectItem);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}