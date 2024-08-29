
#include "Common.hpp"

using namespace std;
using namespace coref;

TEST_CASE("C++ pointer type check", "[cxx]") {
    setup();
    runClangTool(TYPE_SAMPLE_FILE);

    vector<string> expectedPointeeType{"int", "SampleClass"};

    auto actualPointeeType = coref::StorageFacade::getPointeeType();

    REQUIRE_THAT(expectedPointeeType, Catch::Matchers::UnorderedEquals(actualPointeeType));
}


TEST_CASE("OC pointer type check", "[oc]") {
    setup();

    runClangTool(OBJC_CLASS_DEPEND_SAMPLE1, true);

    vector<string> expectedPointeeType{"A", "B"};

    auto actualPointeeType = coref::StorageFacade::getPointeeType();

    REQUIRE_THAT(expectedPointeeType, Catch::Matchers::UnorderedEquals(actualPointeeType));
}
