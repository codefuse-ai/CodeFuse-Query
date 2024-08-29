

#include "Common.hpp"

using namespace std;
using namespace coref;

TEST_CASE("Symbol name of cxx", "cxx") {
    setup();

    runClangTool(CLASS_SAMPLE_FILE);
    auto symbolNames = coref::StorageFacade::getSymbolNames();

    // Class
    REQUIRE(count(symbolNames.begin(), symbolNames.end(), "$class$Animal") == 2);
    REQUIRE(count(symbolNames.begin(), symbolNames.end(), "$class$Fish") == 1);
    REQUIRE(count(symbolNames.begin(), symbolNames.end(), "$class$Human") == 1);
    REQUIRE(count(symbolNames.begin(), symbolNames.end(), "$class$Mermaid") == 1);

    // Function
    REQUIRE(count(symbolNames.begin(), symbolNames.end(), "$class$Animal::$func$eat()") == 1);
    REQUIRE(count(symbolNames.begin(), symbolNames.end(), "$func$hello()") == 2);
    REQUIRE(count(symbolNames.begin(), symbolNames.end(), "$func$greet(std::string)") == 2);

    // Variable
    REQUIRE(count(symbolNames.begin(), symbolNames.end(), "$var$bar") == 2);
    REQUIRE(count(symbolNames.begin(), symbolNames.end(),
                    "input.cc@d41d8cd98f00b204e9800998ecf8427e/"
                    "$func$greet(std::string)::$var$name") == 1);
    REQUIRE(count(symbolNames.begin(), symbolNames.end(),
                    "input.cc@d41d8cd98f00b204e9800998ecf8427e/"
                    "$func$greet(std::string)::$var$name") == 1);
    REQUIRE(count(symbolNames.begin(), symbolNames.end(),
                    "input.cc@d41d8cd98f00b204e9800998ecf8427e@839/"
                    "$func$greet(std::string)::$var$name") == 1);
    REQUIRE(count(symbolNames.begin(), symbolNames.end(),
                    "input.cc@d41d8cd98f00b204e9800998ecf8427e@977/"
                    "$func$main()::$var$m") == 1);
}



TEST_CASE("Symbol name of oc", "[oc]") {
    setup();

    runClangTool(OBJC_CLASS_SAMPLE_FILE, true);
    auto symbolNames = coref::StorageFacade::getSymbolNames();

    // Class
    REQUIRE(count(symbolNames.begin(), symbolNames.end(), "$obj_c_class$Person") == 2);
    REQUIRE(count(symbolNames.begin(), symbolNames.end(), "$obj_c_class$Employee") == 2);
    REQUIRE(count(symbolNames.begin(), symbolNames.end(), "$obj_c_class$Quit") == 2);
    REQUIRE(count(symbolNames.begin(), symbolNames.end(),
                    "$obj_c_protocol$ForwardDeclarationProtocol") == 2);

    // Function
    REQUIRE(count(symbolNames.begin(), symbolNames.end(),
                    "$obj_c_class$Person::$func$sayHello()") == 2);
    REQUIRE(count(symbolNames.begin(), symbolNames.end(),
                    "$obj_c_class$Employee::$func$sayHello()") == 2);
    REQUIRE(count(symbolNames.begin(), symbolNames.end(),
                    "$obj_c_class$Quit::$func$sayBye:(int)") == 2);

    // Variable
    REQUIRE(count(symbolNames.begin(), symbolNames.end(),
                    "input.cc@d41d8cd98f00b204e9800998ecf8427e/"
                    "$obj_c_class$Quit::$func$sayBye:(int)::$var$employeeNumber") == 2);
}