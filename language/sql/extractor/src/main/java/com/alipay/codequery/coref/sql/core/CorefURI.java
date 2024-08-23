package com.alipay.codequery.coref.sql.core;

import com.alipay.codequery.coref.sql.util.HashUtil;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class CorefURI {

    private static String URI_TEMPLATE = "coref://%s?path=%s#%s";

    private String signature;
    private String corpus;
    private String path;


    public CorefURI(String corpus) {
        this.corpus = corpus;
    }

    public String toString() {
        return generate(corpus, path, signature);
    }

    public static String generate(String corpus, String path, String signature) {
        if(StringUtils.isBlank(corpus)
            || StringUtils.isBlank(path)
            || StringUtils.isBlank(signature)) {
            throw new RuntimeException("blank corpus or path or signature");
        }

        return String.format(URI_TEMPLATE, corpus, path, signature);
    }

    public Long generateCorpusOid() {
        return CorefURI.generateCorpusOid(corpus);
    }

    public static Long generateCorpusOid(String corpus) {
        return HashUtil.hashString(String.format("coref://%s", corpus));
    }

    public Long generateOid(String signature) {
        return HashUtil.hashString(generate(corpus, path, signature));
    }

    public Long generateFileOid() {
        return HashUtil.hashString(String.format("coref://%s?path=%s", corpus, path));
    }
}
