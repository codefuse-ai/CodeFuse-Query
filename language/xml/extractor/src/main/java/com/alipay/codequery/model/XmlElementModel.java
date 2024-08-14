
package com.alipay.codequery.model;

import com.alipay.codequery.dal.mybatis.domain.XmlElement;
import com.alipay.codequery.dal.mybatis.domain.XmlElementName;
import com.alipay.codequery.dal.mybatis.domain.XmlElementPrefix;
import com.alipay.codequery.util.IdGenerator;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

import java.util.List;


@RequiredArgsConstructor
@ToString
@Data
public class XmlElementModel extends XmlLocatable {
    @NonNull
    private Integer          id;
    @NonNull
    private String           prefix;
    @NonNull
    private String           name;
    @NonNull
    private Integer          parentId;
    @NonNull
    private Integer          index;
    @NonNull
    private Integer          fileId;
    @NonNull
    private XmlLocationModel location;

    @NonNull
    private List<XmlAttributeModel> attributes;
    @NonNull
    private List<XmlNamespaceModel> nsList;

    public XmlElement extractElement() {
        return new XmlElement(this.id, this.parentId, this.index, getLocation().getId());
    }

    public XmlElementName extractElementName(){
        return new XmlElementName(IdGenerator.nextID(),this.name,this.id,getLocation().getId());
    }

    public XmlElementPrefix extractElementPrefix(){
        if(StringUtils.isNotEmpty(this.prefix)){
            return new XmlElementPrefix(IdGenerator.nextID(),this.prefix,this.id,getLocation().getId());
        }else{
            return null;
        }

    }

    private int childIndexCount = 0;

    public int nextIndex() {
        return childIndexCount++;
    }
}