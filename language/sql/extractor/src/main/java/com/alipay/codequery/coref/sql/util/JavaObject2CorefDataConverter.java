
package com.alipay.codequery.coref.sql.util;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


@Slf4j
public class JavaObject2CorefDataConverter {
    /**
     * Convert a SQLObject's method return result to
     *
     * @param x instance represented by Class `T`
     * @param function The function to be applied on `x`
     * @param castToType Type to be cast from the function result type to COREF data type. It can only be String or Integer.
     *                   Otherwise, A `ClassCastException` will be thrown
     * @param originalMethodName The original method name of function. Just for debug and log
     * @param <T> The function input type
     * @param <R> The function result type
     * @param <V> The COREF data type to be returned
     * @return The COREF data represented by Class `V`
     */
    public static <T, R, V> V convert(T x, Function<T, R> function, Class<V> castToType, String originalMethodName) {
        R result = null;
        // Due to Druid's issue(see https://github.com/alibaba/druid/issues/5014),
        // A SQLObject's method can possibly throw an exception. We shouldn't let the extractor interrupted by this
        // so just catch the exception and ignore it.
        try {
            result = function.apply(x);
        } catch (Exception ignored) {
            // Ignore
            log.warn("Calling Druid's method {}#{}() throws an exception {}. Ignoring it and trying to return a default value.",
                    x.getClass().getSimpleName(),
                    originalMethodName,
                    ignored);
        }

        if (!String.class.isAssignableFrom(castToType) && !Integer.class.isAssignableFrom(castToType)) {
            throw new ClassCastException(String.format("Cannot cast Result of %s::%s() to %s",
                    x.getClass().getSimpleName(),
                    originalMethodName,
                    castToType.getSimpleName()));
        }

        // Set default value if result is null.
        if (result == null) {
            return getDefaultCastValue(null, castToType);
        // Use XXX.class.isInstance instead of `instanceof` operator below
        // to consider the case when result is primitive data type. In this case, result isn't a class instance
        // , and it can't be used with `instanceof` operator.
        } else if (Boolean.class.isInstance(result)) {
            int corefResult = Boolean.TRUE.equals(result) ? 1 : 0;
            return safeCast(corefResult, castToType);
        } else if (Integer.class.isInstance(result) || Byte.class.isInstance(result) || Short.class.isInstance(result)) {
            int corefResult = ((Number) result).intValue();
            return safeCast(corefResult, castToType);
        } else if (Number.class.isInstance(result)) {
            String corefResult = result.toString();
            return safeCast(corefResult, castToType);
        } else if (result instanceof String) {
            String corefResult = (String) result;
            return safeCast(corefResult, castToType);
        } else if (result instanceof List) {
            String corefResult = result.toString();
            return safeCast(corefResult, castToType);
        } else if (result.getClass().isArray()) {
            String corefResult = Arrays.toString((Object[]) result);
            return safeCast(corefResult, castToType);
        } else {
            return getDefaultCastValue(result, castToType);
        }
    }

    /**
     * Check if an object can be cast to a specific type
     * and cast without throwing a ClassCastException exception
     *
     * @param object The object to be cast
     * @param castToType The instance of the Class V to cast the object to
     * @param <V> The Type of the class
     * @return The object with type V
     */
    private static <V> V safeCast(Object object, Class<V> castToType) {
        if (castToType != null && castToType.isInstance(object)) {
            return castToType.cast(object);
        } else {
            return getDefaultCastValue(object, castToType);
        }
    }

    private static <V> V getDefaultCastValue(Object object, Class<V> castToType) {
        if (String.class.isAssignableFrom(castToType)) {
            return castToType.cast(object != null ? object.toString() : "");
        } else {
            return castToType.cast(0);
        }
    }
}