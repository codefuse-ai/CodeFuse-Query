

#ifndef COREF_CFAMILY_SRC_EXTRACTOR_ASTUTIL_HPP
#define COREF_CFAMILY_SRC_EXTRACTOR_ASTUTIL_HPP

#include <clang/Tooling/Tooling.h>

using namespace llvm;

bool getRootRelativePath(StringRef &absolutePath, StringRef &relativePath);

#endif // COREF_CFAMILY_SRC_EXTRACTOR_ASTUTIL_HPP
