
#include "Common.hpp"
#include "AST/CorefASTFrontendAction.hpp"
#include <clang/Tooling/Tooling.h>
#include <fstream>
#include <memory>

using namespace sqlite_orm;

bool readCppfile(const char *file, std::string &content) {
    std::ifstream infile;
    infile.open(file, std::ios::in);
    if (infile.is_open()) {
        content.clear();
        std::string temp;
        while (std::getline(infile, temp)) {
            content += temp;
            content += "\n";
        }
        infile.close();
        return true;
    }
    return false;
}

const char *testDbFilename = ":memory:";
// todo: objc compilation args.
const std::vector<std::string> argsForObjc = {"-ObjC", "-framework", "Foundation"};

void setup() { coref::StorageFacade::initOrm(testDbFilename); }

void runClangTool(const char *cppFile, bool isObjc) {
    std::string content;
    if (!readCppfile(cppFile, content)) {
        std::cerr << "no such file: " << cppFile << "\n";
        return;
    }

    std::vector<std::string> blacklistDir;
    auto factory = std::make_unique<clang::tooling::FrontendActionFactory *>(
        new coref::CorefFrontendActionFactory("Not Specified", blacklistDir));
    if (isObjc) {
        clang::tooling::runToolOnCodeWithArgs((*factory)->create(), content, argsForObjc);
    } else {
        clang::tooling::runToolOnCode((*factory)->create(), content);
    }
}
