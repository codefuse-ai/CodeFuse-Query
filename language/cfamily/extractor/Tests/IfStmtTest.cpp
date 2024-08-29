

#include "Common.hpp"

TEST_CASE("IfStatement", "[cxx]") {
    setup();

    SECTION("if stmt check") {
        runClangTool(IF_STMT_SAMPLE_FILE);
        auto storage = coref::Storage::getInstance().getStorage();
        REQUIRE(storage->get_all<coref::IfStatement>().size() == 1);
        REQUIRE(storage->get_all<coref::ElseStatementInIf>().size() == 0);
    }

    SECTION("if else stmt check") {
        runClangTool(IF_ELSE_STMT_SAMPLE_FILE);
        auto storage = coref::Storage::getInstance().getStorage();
        REQUIRE(storage->get_all<coref::IfStatement>().size() == 1);
        REQUIRE(storage->get_all<coref::ElseStatementInIf>().size() == 1);
    }
}
