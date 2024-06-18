package com.alipay.codequery.coref.core;

import com.alipay.codequery.coref.util.HashUtil;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

@Setter
@Getter
public class CorefURI {

    private static String URI_TEMPLATE = "coref://%s?path=%s#%s";

    private String signature;
    private String repository;
    private String path;


    public CorefURI(String repository) {
        this.repository = repository;
    }

    public String toString() {
        return generate(repository, path, signature);
    }

    public static String generate(String repository, String path, String signature) {
        if(StringUtils.isBlank(repository)
            ||StringUtils.isBlank(path)
            || StringUtils.isBlank(signature)) {
            throw new RuntimeException("blank repository or path or signature");
        }

        return String.format(URI_TEMPLATE, repository, path, signature);
    }

    public static Long generateHashId(String repository, String path, String signature) {
        return HashUtil.hashString(generate(repository, path, signature));
    }

}
