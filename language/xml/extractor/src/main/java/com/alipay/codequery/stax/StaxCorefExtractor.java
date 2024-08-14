package com.alipay.codequery.stax;

import com.alipay.codequery.Extractor;
import com.alipay.codequery.dal.mybatis.domain.XmlFile;
import com.alipay.codequery.model.*;
import com.alipay.codequery.util.CorefStorage;

import com.alipay.codequery.util.IdGenerator;
import com.ctc.wstx.api.WstxInputProperties;
import com.ctc.wstx.exc.WstxEOFException;
import com.ctc.wstx.sr.BasicStreamReader;
import com.ctc.wstx.stax.WstxInputFactory;
import com.sun.org.apache.xerces.internal.impl.Constants;
import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.stax2.XMLStreamLocation2;

import javax.xml.stream.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class StaxCorefExtractor {
    private static final Logger logger = LogManager.getLogger(StaxCorefExtractor.class);
    private int idcount = 0;
    private Stack<XmlElementModel> elementStack = new Stack<XmlElementModel>();
    private BasicStreamReader reader;
    private CorefStorage corefStorage;
    private File file;
    private Integer fileId;
    private String root;

    @SneakyThrows
    public StaxCorefExtractor(File file, CorefStorage corefStorage, String rootPath) {
        WstxInputFactory factory = new WstxInputFactory();
        factory.setProperty(Constants.ZEPHYR_PROPERTY_PREFIX + Constants.STAX_REPORT_CDATA_EVENT, Boolean.TRUE);
        factory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
        if (file.getName().endsWith(Extractor.AXML_EXT)) {
            configParserForAXML(factory);
        }
        this.corefStorage = corefStorage;
        this.reader = (BasicStreamReader) factory.createXMLStreamReader(new FileReader(file));
        this.file = file;
        this.root = rootPath;
        reader.getInputElementStack().addNsBinding("a", "my");
    }

    public void configParserForAXML(WstxInputFactory factory) {
        factory.getConfig().doSupportAliXMLExt(true);
        factory.getConfig().doSupportNamespaces(false);
        factory.getConfig().setInputParsingMode(WstxInputProperties.PARSING_MODE_DOCUMENTS);
        factory.getConfig().doReplaceEntityRefs(false);
    }

    public void parse() throws XMLStreamException {
        this.fileId = IdGenerator.nextID();
        handleXmlFile(file);
        boolean haveException = false;
        while (reader.hasNext()) {
            switch (reader.getEventType()) {
                case XMLStreamConstants.START_ELEMENT:
                    handleStartElement();
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    handleEndElement();
                    break;
                case XMLStreamConstants.SPACE:
                    break;
                case XMLStreamConstants.CHARACTERS:
                    // Fixed: when parsing with unexpected character, like '&', add catch clause to catch the exception, so the parsing will continue.
                    try {
                      handleChar(false);
                    }catch (Exception e) {
                      logger.error("Extraction failed, error message:{} on file {}", e.getMessage(), file.getAbsolutePath());
                    }
                    break;
                case XMLStreamConstants.PROCESSING_INSTRUCTION:
                    break;
                case XMLStreamConstants.CDATA:
                    handleChar(true);
                    break;
                case XMLStreamConstants.COMMENT:
                    handleComment();
                    break;
                case XMLStreamConstants.ENTITY_REFERENCE:
                    break;
                case XMLStreamConstants.START_DOCUMENT:
                    handleStartDocument();
                    break;
                case XMLStreamConstants.DTD:
                    hanldeDTD();
                    break;
                case XMLStreamConstants.NAMESPACE:
                    break;
                case XMLStreamConstants.END_DOCUMENT:
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + reader.getEventType());
            }
            try {
                reader.next();
            } catch (Exception e) {
                haveException = true;
                logger.error("error message:{} on file {}", e.getMessage(), file.getAbsolutePath());
                if (e instanceof WstxEOFException) {
                    break;
                }
            }
        }
        corefStorage.store();
        if (haveException) {
            throw new RuntimeException("Parse error occurred");
        }
    }

    private void handleXmlFile(File file) {
        XmlFile xmlFile = new XmlFile();
        xmlFile.setId(this.fileId);
        xmlFile.setFileName(file.getName());
        xmlFile.setRelativePath(file.getAbsolutePath().substring(root.length() + 1));
        corefStorage.addFile(xmlFile);
    }

    private void handleChar(boolean isCDATA) throws XMLStreamException {
        int start = reader.getTextStart();
        int length = reader.getTextLength();
        String text = new String(reader.getTextCharacters(), start, length);
        if (StringUtils.isNotBlank(text)) {

            XMLStreamLocation2 startLocation = reader.getStartLocation();
            XMLStreamLocation2 endLocation = reader.getEndLocation();
            XmlLocationModel location = new XmlLocationModel(IdGenerator.nextID(), startLocation.getLineNumber(),
                    startLocation.getLineNumber(),
                    endLocation.getLineNumber(), endLocation.getLineNumber(), this.fileId);

            XmlCharacterModel xmlCharacterModel = new XmlCharacterModel(IdGenerator.nextID(), text, this.elementStack.peek().getId(), -1,
                    isCDATA ? 1 : 0, -1, location);
            corefStorage.addCharacter(xmlCharacterModel);
        }
    }

    private void handleComment() throws XMLStreamException {
        String text = reader.getText();

        int parentId = this.elementStack.isEmpty() ? -1 : this.elementStack.peek().getId();
        XmlLocationModel location = new XmlLocationModel(IdGenerator.nextID(), reader.getStartLocation().getLineNumber(),
                reader.getStartLocation().getColumnNumber(),
                reader.getEndLocation().getLineNumber(), reader.getEndLocation().getColumnNumber(), this.fileId);
        XmlCommentModel comment = new XmlCommentModel(IdGenerator.nextID(), text, parentId, -1, location);
        corefStorage.addComment(comment);
    }

    private void hanldeDTD() throws XMLStreamException {
        XmlLocationModel location = new XmlLocationModel(IdGenerator.nextID(), reader.getStartLocation().getLineNumber(),
                reader.getStartLocation().getColumnNumber()
                , reader.getEndLocation().getLineNumber(), reader.getEndLocation().getColumnNumber(), this.fileId);
        XmlDTDModel dtd = new XmlDTDModel(IdGenerator.nextID(), reader.getDTDRootName(), reader.getDTDPublicId(), reader.getDTDSystemId(),
                location);
        corefStorage.addDTD(dtd);
    }

    private void handleStartElement() {
        XmlLocationModel location = new XmlLocationModel();
        XMLStreamLocation2 startLocation = ((BasicStreamReader) reader).getStartLocation();
        location.setId(IdGenerator.nextID());
        location.setStartLineNumber(startLocation.getLineNumber());
        String qName = reader.getLocalName();
        location.setStartColumnNumber(startLocation.getColumnNumber());
        String prefix = reader.getPrefix();
        int elementId = IdGenerator.nextID();
        int parentId = this.elementStack.isEmpty() ? -1 : this.elementStack.peek().getId();
        int idx = this.elementStack.isEmpty() ? 0 : this.elementStack.peek().nextIndex();
        location.setFileId(this.fileId);
        List<XmlNamespaceModel> nsList = new ArrayList<>();
        for (int i = 0; i < reader.getNamespaceCount(); i++) {
            String namespacePrefix = reader.getNamespacePrefix(i).isEmpty() ? "-1" : reader.getNamespacePrefix(i);
            String namespaceURI = reader.getNamespaceURI(i);
            int namespaceId = IdGenerator.nextID();
            XmlHasNamespace hasNamespace = new XmlHasNamespace(IdGenerator.nextID(), elementId, namespaceId, this.fileId);
            XmlNamespaceModel ns = new XmlNamespaceModel(namespaceId, namespacePrefix, namespaceURI, -1, elementId, location, hasNamespace);
            nsList.add(ns);
        }
        List<XmlAttributeModel> list = new ArrayList<>();
        for (int i = 0; i < reader.getAttributeCount(); i++) {
            String attrLocalName = reader.getAttributeLocalName(i);
            String attrPrefix = reader.getAttributePrefix(i);
            String attrName = attrPrefix.isEmpty() ? attrLocalName : attrPrefix.concat(":").concat(attrLocalName);
            String attrValue = reader.getAttributeValue(i);

            XmlAttributeModel attribute = new XmlAttributeModel(IdGenerator.nextID(), elementId, attrName, attrValue, i, -1, location);
            list.add(attribute);
        }
        XmlElementModel element = new XmlElementModel(elementId, prefix, qName, parentId, idx, -1, location, list, nsList);
        this.elementStack.push(element);
    }

    private void handleEndElement() throws XMLStreamException {
        XmlElementModel elementModel = this.elementStack.pop();
        XMLStreamLocation2 endLocation = ((BasicStreamReader) reader).getEndLocation();
        elementModel.getLocation().setEndLineNumber(endLocation.getLineNumber());
        elementModel.getLocation().setEndColumnNumber(endLocation.getColumnNumber());
        corefStorage.addElement(elementModel);

        //XmlElementMapper mapper = sqlSession.getMapper(XmlElementMapper.class);
        //mapper.insert(elementModel.extractElement());
    }

    private void handleStartDocument() throws XMLStreamException {
        String version = reader.getVersion();
        String encoding = reader.getCharacterEncodingScheme();
        XmlLocationModel location = new XmlLocationModel(IdGenerator.nextID(), reader.getStartLocation().getLineNumber(),
                reader.getStartLocation().getColumnNumber()
                , reader.getEndLocation().getLineNumber(), reader.getEndLocation().getColumnNumber(), this.fileId);
        XmlDeclarationModel dtd = new XmlDeclarationModel(IdGenerator.nextID(), version, encoding, location);
        corefStorage.addXmlEncoding(dtd);

    }
}
