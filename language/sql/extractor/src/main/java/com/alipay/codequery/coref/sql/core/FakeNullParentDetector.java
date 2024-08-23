
package com.alipay.codequery.coref.sql.core;

import com.alibaba.druid.sql.ast.SQLObject;
import com.alibaba.druid.sql.visitor.SQLASTVisitorAdapter;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Try to detect some SQLObject whose parent is null but actually not.
 * If so, try to reset its parent to the real one.
 * <p>
 * Due to Druid's issue(see https://github.com/alibaba/druid/issues/4992), a SQLColumnDefinition can have a null parent but its parent should actually
 * be set to an OdpsCreateTableStatement. It can be fixed by invoking getChildren() from OdpsCreateTableStatement
 * and retrieve all of its children, then reset theirs parent to the real one.
 *
 * @version FakeNullParentDetector.java, v 0.1 2022/11/08
 */
@Slf4j
public class FakeNullParentDetector extends SQLASTVisitorAdapter {
    @Override
    public void preVisit(SQLObject x) {
        try {
            // Use reflection to reduce code amount
            Method m = x.getClass().getMethod("getChildren");
            @SuppressWarnings("unchecked")
            List<SQLObject> children = (List<SQLObject>) m.invoke(x);
            if (children == null) {
                return;
            }
            for (SQLObject child: children) {
                if (child.getParent() == null) {
                    log.trace("Detect an SQLObject of type {} whose parent is null but actually not. Trying to reset its parent to the real one, of type {}", child.getClass().getSimpleName(), x.getClass().getSimpleName());
                    child.setParent(x);
                }
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            // ignore all
        }
    }
}