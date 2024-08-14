
package com.alipay.codequery.model;

import com.alipay.codequery.dal.mybatis.domain.XmlNamespace;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;



@Data
@AllArgsConstructor
@ToString
public class XmlNamespaceModel extends XmlLocatable {
    private int              id;
    private String           prefixName;
    private String           URI;
    private int              fileId;
    private int              elementId;
    private XmlLocationModel location;
    private XmlHasNamespace xmlHasNamespace;

    public XmlNamespace extractNs() {
        return new XmlNamespace(this.id, this.prefixName, this.URI, getLocation().getId());
    }


}
