
package com.alipay.codequery.model;

import com.alipay.codequery.dal.mybatis.domain.XmlAttribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
@AllArgsConstructor
public class XmlAttributeModel extends XmlLocatable {
    private int    id;
    private int    elementId;
    private String name;
    private String value;
    private int    index;
    private int    fileId;

    private XmlLocationModel location;

    public XmlAttribute extractAttr() {
        XmlAttribute attribute = new XmlAttribute();
        attribute.setElementId(this.elementId);
        attribute.setId(this.id);
        attribute.setIndexOrder(this.index);
        attribute.setLocationId(getLocation().getId());
        attribute.setName(this.name);
        attribute.setValue(this.value);
        return attribute;
    }

}