package com.alipay.codequery.coref.model;

public class Location extends Node {

    public File file;
    public int startLineNumber;
    public int startColumnNumber;
    public int endLineNumber;
    public int endColumnNumber;
    public LocalLocation localLocation;
    public NumberOfLines numberOfLines;

    public Location(Long hashId) {
        super(hashId);
    }

    public Location() {
    }

    public Location(Long hashId, File file, LocalLocation localLocation) {
        this.hashId = hashId;
        this.file = file;
        this.startLineNumber = localLocation.startLineNumber;
        this.startColumnNumber = localLocation.startColumnNumber;
        this.endLineNumber = localLocation.endLineNumber;
        this.endColumnNumber = localLocation.endColumnNumber;
    }
    public com.alipay.codequery.dal.mybatis.domain.Location extractLocation(){
        return new com.alipay.codequery.dal.mybatis.domain.Location(
            this.hashId,
            this.file.hashId,
            this.startLineNumber,
            this.startColumnNumber,
            this.endLineNumber,
            this.endColumnNumber);
    }
    public static class LocalLocation extends Location {
        public LocalLocation(int startLineNumber,int startColumnNumber, int endLineNumber, int endColumnNumber){
            this.startLineNumber = startLineNumber;
            this.startColumnNumber = startColumnNumber;
            this.endLineNumber = endLineNumber;
            this.endColumnNumber = endColumnNumber;
        }
    }

    public static class NumberOfLines extends Location {
        public int numberOfLines;
        public int numberOfCommentLines;
        public int numberOfCodeLines;

        public NumberOfLines(Long hashId) {
            super(hashId);
        }

        public com.alipay.codequery.dal.mybatis.domain.NumberOfLines extractNumberOfLines(){
            return new com.alipay.codequery.dal.mybatis.domain.NumberOfLines(this.hashId, this.numberOfLines,this.numberOfCodeLines,this.numberOfCommentLines);
        }
    }
}
