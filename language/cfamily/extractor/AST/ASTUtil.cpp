

#include "ASTUtil.hpp"

using namespace llvm;

/// Get Root-Relative path of the given file
/// \param absoluteFile
/// \param relativeFile
/// \return true if root-relative path solved, or false
bool getRootRelativePath(StringRef &absolutePath, StringRef &relativePath) {
    SmallString<256> cwd;
    sys::fs::current_path(cwd);
    auto npos = cwd.rfind(sys::path::get_separator().data());
    if (absolutePath.contains(cwd.substr(0, npos))) {
        relativePath = absolutePath.substr(npos);
        return true;
    }
    relativePath = absolutePath;
    return false;
}
