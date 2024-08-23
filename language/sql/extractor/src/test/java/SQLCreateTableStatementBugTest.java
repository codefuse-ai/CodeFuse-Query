

import com.alibaba.druid.DbType;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement;
import com.alibaba.druid.sql.dialect.odps.visitor.OdpsASTVisitor;
import com.alibaba.druid.sql.parser.SQLParserFeature;
import com.alibaba.druid.sql.parser.SQLParserUtils;
import com.alibaba.druid.sql.parser.SQLStatementParser;
import com.alibaba.druid.sql.visitor.SQLASTVisitorAdapter;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThrows;


public class SQLCreateTableStatementBugTest {

    static class TestVisitor extends SQLASTVisitorAdapter implements OdpsASTVisitor {
        @Override
        public boolean visit(SQLCreateTableStatement x) {
            List<String> comments = x.getColumnComments();
            return true;
        }
    }

    @Test
    public void testNullPointerExceptionFromGetColumnCommentsOfSQLCreateTableStatement() {
        String sqlContent = "CREATE TABLE IF NOT EXISTS test_table \n" +
                "(\n" +
                "  user_id STRING COMMENT\"userid\"\n" +
                "  ,user_features STRING COMMENT\"用户特征\"\n" +
                "  ,column_without_comment STRING\n" +
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
        SQLCreateTableStatementBugTest.TestVisitor visitor = new SQLCreateTableStatementBugTest.TestVisitor();

        // This is not OK!!
        // Due to Druid's issue(see https://github.com/alibaba/druid/issues/5014),
        // Method SQLCreateTableStatement#getColumnComments throws NullPointerException.
        // If this test cannot be passed, it means that the issue is fixed,
        // and we can remove this test case.
        assertThrows(NullPointerException.class, () -> {
            for (SQLStatement sqlStatement: sqlStatements) {
                sqlStatement.accept(visitor);
            }
        });
    }
}