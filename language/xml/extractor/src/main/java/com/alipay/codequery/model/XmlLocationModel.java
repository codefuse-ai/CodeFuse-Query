
package com.alipay.codequery.model;

import com.alipay.codequery.dal.mybatis.domain.XmlLocation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class XmlLocationModel {
    private int id;
    private int startLineNumber;
    private int startColumnNumber;
    private int endLineNumber;
    private int endColumnNumber;
    private int fileId;

    public XmlLocation extractLocation() {
        XmlLocation location = new XmlLocation();
        location.setId(this.id);
        location.setFileId(fileId);
        location.setStartLineNumber(this.startLineNumber);
        location.setStartColumnNumber(this.startColumnNumber);
        location.setEndLineNumber(this.endLineNumber);
        location.setEndColumnNumber(this.endColumnNumber);
        return location;
    }

}