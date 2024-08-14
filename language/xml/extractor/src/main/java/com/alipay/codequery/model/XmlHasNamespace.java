
package com.alipay.codequery.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;


@Data
@AllArgsConstructor
@ToString
public class XmlHasNamespace {
    private int id;
    private int elementId;
    private int namespaceId;
    private int containerId;


    public XmlHasNamespace extractXmlHasNameSpace() {
      return new XmlHasNamespace(this.id, this.elementId, this.namespaceId, this.containerId);
    }
}
