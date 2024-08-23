

import com.alibaba.druid.DbType;
import com.alibaba.druid.sql.ast.SQLObject;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.statement.SQLColumnDefinition;
import com.alibaba.druid.sql.dialect.odps.ast.OdpsCreateTableStatement;
import com.alibaba.druid.sql.dialect.odps.visitor.OdpsASTVisitor;
import com.alibaba.druid.sql.parser.SQLParserFeature;
import com.alibaba.druid.sql.parser.SQLParserUtils;
import com.alibaba.druid.sql.parser.SQLStatementParser;
import com.alibaba.druid.sql.visitor.SQLASTVisitorAdapter;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class FakeNullParentTest {

    static class TestVisitor extends SQLASTVisitorAdapter implements OdpsASTVisitor {
        @Override
        public boolean visit(OdpsCreateTableStatement x) {
            List<SQLObject> children = x.getChildren();
            for (SQLObject child: children) {
                if (child instanceof SQLColumnDefinition) {
                    // This is not OK!!
                    // Due to Druid's issue(see https://github.com/alibaba/druid/issues/4992),
                    // a SQLColumnDefinition shouldn't have a null parent. Its parent should
                    // be set to an OdpsCreateTableStatement.
                    // So If this test cannot be passed, it means that the issue is fixed and the code
                    // should be refactored.
                    Assert.assertNull(child.getParent());
                }
            }
            return true;
        }
    }

    @Test
    public void testParentOfSQLColumnDefinitionIsNull() {
        String sqlContent = "CREATE TABLE IF NOT EXISTS test_table \n" +
                "(\n" +
                "  user_id STRING COMMENT\"userid\"\n" +
                "  ,user_features STRING COMMENT\"用户特征\"\n" +
                ")\n" +
                ";";

        SQLStatementParser parser = SQLParserUtils.createSQLStatementParser(
                sqlContent,
                DbType.odps,
                //SQLParserFeature.PrintSQLWhileParsingFailed,
                SQLParserFeature.KeepSourceLocation,
                SQLParserFeature.KeepComments
        );

        List<SQLStatement> sqlStatements = parser.parseStatementList();
        TestVisitor visitor = new TestVisitor();

        for (SQLStatement sqlStatement: sqlStatements) {
            sqlStatement.accept(visitor);
        }
    }
}