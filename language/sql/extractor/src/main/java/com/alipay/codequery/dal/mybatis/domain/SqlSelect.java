package com.alipay.codequery.dal.mybatis.domain;

import java.io.Serializable;
import javax.annotation.Generated;

public class SqlSelect implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.oid")
    private Long oid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.first_query_block_oid")
    private Long firstQueryBlockOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.for_xml_options")
    private String forXmlOptions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.for_xml_options_size")
    private Integer forXmlOptionsSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.head_hint_oid")
    private Long headHintOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.hints_size")
    private Integer hintsSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.is_for_browse")
    private Integer isForBrowse;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.is_simple")
    private Integer isSimple;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.limit_oid")
    private Long limitOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.offset_oid")
    private Long offsetOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.order_by_oid")
    private Long orderByOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.query_oid")
    private Long queryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.query_block_oid")
    private Long queryBlockOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.restriction")
    private String restriction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.row_count_oid")
    private Long rowCountOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.with_sub_query_oid")
    private Long withSubQueryOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.xml_path_oid")
    private Long xmlPathOid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    public SqlSelect(Long oid, Long firstQueryBlockOid, String forXmlOptions, Integer forXmlOptionsSize, Long headHintOid, Integer hintsSize, Integer isForBrowse, Integer isSimple, Long limitOid, Long offsetOid, Long orderByOid, Long queryOid, Long queryBlockOid, String restriction, Long rowCountOid, Long withSubQueryOid, Long xmlPathOid) {
        this.oid = oid;
        this.firstQueryBlockOid = firstQueryBlockOid;
        this.forXmlOptions = forXmlOptions;
        this.forXmlOptionsSize = forXmlOptionsSize;
        this.headHintOid = headHintOid;
        this.hintsSize = hintsSize;
        this.isForBrowse = isForBrowse;
        this.isSimple = isSimple;
        this.limitOid = limitOid;
        this.offsetOid = offsetOid;
        this.orderByOid = orderByOid;
        this.queryOid = queryOid;
        this.queryBlockOid = queryBlockOid;
        this.restriction = restriction;
        this.rowCountOid = rowCountOid;
        this.withSubQueryOid = withSubQueryOid;
        this.xmlPathOid = xmlPathOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    public SqlSelect() {
        super();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.oid")
    public Long getOid() {
        return oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.oid")
    public void setOid(Long oid) {
        this.oid = oid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.first_query_block_oid")
    public Long getFirstQueryBlockOid() {
        return firstQueryBlockOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.first_query_block_oid")
    public void setFirstQueryBlockOid(Long firstQueryBlockOid) {
        this.firstQueryBlockOid = firstQueryBlockOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.for_xml_options")
    public String getForXmlOptions() {
        return forXmlOptions;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.for_xml_options")
    public void setForXmlOptions(String forXmlOptions) {
        this.forXmlOptions = forXmlOptions == null ? null : forXmlOptions.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.for_xml_options_size")
    public Integer getForXmlOptionsSize() {
        return forXmlOptionsSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.for_xml_options_size")
    public void setForXmlOptionsSize(Integer forXmlOptionsSize) {
        this.forXmlOptionsSize = forXmlOptionsSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.head_hint_oid")
    public Long getHeadHintOid() {
        return headHintOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.head_hint_oid")
    public void setHeadHintOid(Long headHintOid) {
        this.headHintOid = headHintOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.hints_size")
    public Integer getHintsSize() {
        return hintsSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.hints_size")
    public void setHintsSize(Integer hintsSize) {
        this.hintsSize = hintsSize;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.is_for_browse")
    public Integer getIsForBrowse() {
        return isForBrowse;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.is_for_browse")
    public void setIsForBrowse(Integer isForBrowse) {
        this.isForBrowse = isForBrowse;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.is_simple")
    public Integer getIsSimple() {
        return isSimple;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.is_simple")
    public void setIsSimple(Integer isSimple) {
        this.isSimple = isSimple;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.limit_oid")
    public Long getLimitOid() {
        return limitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.limit_oid")
    public void setLimitOid(Long limitOid) {
        this.limitOid = limitOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.offset_oid")
    public Long getOffsetOid() {
        return offsetOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.offset_oid")
    public void setOffsetOid(Long offsetOid) {
        this.offsetOid = offsetOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.order_by_oid")
    public Long getOrderByOid() {
        return orderByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.order_by_oid")
    public void setOrderByOid(Long orderByOid) {
        this.orderByOid = orderByOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.query_oid")
    public Long getQueryOid() {
        return queryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.query_oid")
    public void setQueryOid(Long queryOid) {
        this.queryOid = queryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.query_block_oid")
    public Long getQueryBlockOid() {
        return queryBlockOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.query_block_oid")
    public void setQueryBlockOid(Long queryBlockOid) {
        this.queryBlockOid = queryBlockOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.restriction")
    public String getRestriction() {
        return restriction;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.restriction")
    public void setRestriction(String restriction) {
        this.restriction = restriction == null ? null : restriction.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.row_count_oid")
    public Long getRowCountOid() {
        return rowCountOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.row_count_oid")
    public void setRowCountOid(Long rowCountOid) {
        this.rowCountOid = rowCountOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.with_sub_query_oid")
    public Long getWithSubQueryOid() {
        return withSubQueryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.with_sub_query_oid")
    public void setWithSubQueryOid(Long withSubQueryOid) {
        this.withSubQueryOid = withSubQueryOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.xml_path_oid")
    public Long getXmlPathOid() {
        return xmlPathOid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: sql_select.xml_path_oid")
    public void setXmlPathOid(Long xmlPathOid) {
        this.xmlPathOid = xmlPathOid;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
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
        SqlSelect other = (SqlSelect) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getFirstQueryBlockOid() == null ? other.getFirstQueryBlockOid() == null : this.getFirstQueryBlockOid().equals(other.getFirstQueryBlockOid()))
            && (this.getForXmlOptions() == null ? other.getForXmlOptions() == null : this.getForXmlOptions().equals(other.getForXmlOptions()))
            && (this.getForXmlOptionsSize() == null ? other.getForXmlOptionsSize() == null : this.getForXmlOptionsSize().equals(other.getForXmlOptionsSize()))
            && (this.getHeadHintOid() == null ? other.getHeadHintOid() == null : this.getHeadHintOid().equals(other.getHeadHintOid()))
            && (this.getHintsSize() == null ? other.getHintsSize() == null : this.getHintsSize().equals(other.getHintsSize()))
            && (this.getIsForBrowse() == null ? other.getIsForBrowse() == null : this.getIsForBrowse().equals(other.getIsForBrowse()))
            && (this.getIsSimple() == null ? other.getIsSimple() == null : this.getIsSimple().equals(other.getIsSimple()))
            && (this.getLimitOid() == null ? other.getLimitOid() == null : this.getLimitOid().equals(other.getLimitOid()))
            && (this.getOffsetOid() == null ? other.getOffsetOid() == null : this.getOffsetOid().equals(other.getOffsetOid()))
            && (this.getOrderByOid() == null ? other.getOrderByOid() == null : this.getOrderByOid().equals(other.getOrderByOid()))
            && (this.getQueryOid() == null ? other.getQueryOid() == null : this.getQueryOid().equals(other.getQueryOid()))
            && (this.getQueryBlockOid() == null ? other.getQueryBlockOid() == null : this.getQueryBlockOid().equals(other.getQueryBlockOid()))
            && (this.getRestriction() == null ? other.getRestriction() == null : this.getRestriction().equals(other.getRestriction()))
            && (this.getRowCountOid() == null ? other.getRowCountOid() == null : this.getRowCountOid().equals(other.getRowCountOid()))
            && (this.getWithSubQueryOid() == null ? other.getWithSubQueryOid() == null : this.getWithSubQueryOid().equals(other.getWithSubQueryOid()))
            && (this.getXmlPathOid() == null ? other.getXmlPathOid() == null : this.getXmlPathOid().equals(other.getXmlPathOid()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getFirstQueryBlockOid() == null) ? 0 : getFirstQueryBlockOid().hashCode());
        result = prime * result + ((getForXmlOptions() == null) ? 0 : getForXmlOptions().hashCode());
        result = prime * result + ((getForXmlOptionsSize() == null) ? 0 : getForXmlOptionsSize().hashCode());
        result = prime * result + ((getHeadHintOid() == null) ? 0 : getHeadHintOid().hashCode());
        result = prime * result + ((getHintsSize() == null) ? 0 : getHintsSize().hashCode());
        result = prime * result + ((getIsForBrowse() == null) ? 0 : getIsForBrowse().hashCode());
        result = prime * result + ((getIsSimple() == null) ? 0 : getIsSimple().hashCode());
        result = prime * result + ((getLimitOid() == null) ? 0 : getLimitOid().hashCode());
        result = prime * result + ((getOffsetOid() == null) ? 0 : getOffsetOid().hashCode());
        result = prime * result + ((getOrderByOid() == null) ? 0 : getOrderByOid().hashCode());
        result = prime * result + ((getQueryOid() == null) ? 0 : getQueryOid().hashCode());
        result = prime * result + ((getQueryBlockOid() == null) ? 0 : getQueryBlockOid().hashCode());
        result = prime * result + ((getRestriction() == null) ? 0 : getRestriction().hashCode());
        result = prime * result + ((getRowCountOid() == null) ? 0 : getRowCountOid().hashCode());
        result = prime * result + ((getWithSubQueryOid() == null) ? 0 : getWithSubQueryOid().hashCode());
        result = prime * result + ((getXmlPathOid() == null) ? 0 : getXmlPathOid().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: sql_select")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", firstQueryBlockOid=").append(firstQueryBlockOid);
        sb.append(", forXmlOptions=").append(forXmlOptions);
        sb.append(", forXmlOptionsSize=").append(forXmlOptionsSize);
        sb.append(", headHintOid=").append(headHintOid);
        sb.append(", hintsSize=").append(hintsSize);
        sb.append(", isForBrowse=").append(isForBrowse);
        sb.append(", isSimple=").append(isSimple);
        sb.append(", limitOid=").append(limitOid);
        sb.append(", offsetOid=").append(offsetOid);
        sb.append(", orderByOid=").append(orderByOid);
        sb.append(", queryOid=").append(queryOid);
        sb.append(", queryBlockOid=").append(queryBlockOid);
        sb.append(", restriction=").append(restriction);
        sb.append(", rowCountOid=").append(rowCountOid);
        sb.append(", withSubQueryOid=").append(withSubQueryOid);
        sb.append(", xmlPathOid=").append(xmlPathOid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}