package com.alipay.codequery.coref.core;

import com.alipay.codequery.coref.model.Type;
import com.alipay.codequery.coref.storage.IStorage;
import com.alipay.codequery.util.PsiUtil;
import com.alipay.codequery.coref.util.HashUtil;
import org.jetbrains.kotlin.com.intellij.psi.*;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class SharedManager {

    public static final Set<String> RESOLVED_ANNOTATION_SET = Collections.synchronizedSet(new HashSet<>());
    public static final Map<String, Long> FILE_MAP = new ConcurrentHashMap<>();
    private static final Map<String, Type> TYPE_MAP = new ConcurrentHashMap<>();

    public static void clear() {
        RESOLVED_ANNOTATION_SET.clear();
        FILE_MAP.clear();
        TYPE_MAP.clear();
    }

    public static Type getType(IStorage storage, PsiType type) {
        String qualifiedName = PsiUtil.getQualifiedNameIfPossible(type);
        if (type instanceof PsiPrimitiveType) {
            for (Type.PrimitiveType primitiveType : Type.PrimitiveType.values()) {
                if (primitiveType.name.equals(qualifiedName)) {
                    return new Type((long) primitiveType.index);
                }
            }
        } else if (type instanceof PsiMethodReferenceType || type instanceof PsiArrayType || type instanceof PsiClassType) {
            return TYPE_MAP.computeIfAbsent(qualifiedName, (k) -> {
                Long hashId = HashUtil.hashString(k);
                Type elementType = new Type(hashId);
                elementType.qualifiedName = k;
                elementType.name = PsiUtil.getNameIfPossible(type);
                storage.storeReferenceType(elementType);
                return elementType;
            });
        }
        return new Type((long) -1);
    }
}
