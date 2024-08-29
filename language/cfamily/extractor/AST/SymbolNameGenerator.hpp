// Based on https://code.alipay.com/codeinsight_thirdparty/index7
// Copyright (C), 2016-present, Sourcebrella, Inc Ltd - All rights reserved.
// Unauthorized copying, using, modifying of this file, via any medium is
// strictly prohibited.
// Proprietary and confidential.
//
// Author: Kai Luo<luokai@sbrella.com>
// File Description:
// Creation Date: 2018-05-30
// Modification History: Created.
// clang-format off
#ifndef SBRELLA_C7_NAME_GENERATOR_H
#define SBRELLA_C7_NAME_GENERATOR_H

#include "clang/AST/Decl.h"

#include <string>
#include <memory>

namespace sbrella {
namespace c7 {

class NameGeneratorImpl;

class NameGenerator {
public:
    NameGenerator(clang::NamedDecl *originalDecl, std::string &output);
    ~NameGenerator();

    void Visit(clang::NamedDecl *decl) const;

    const std::string& getSymbolName() const;

    bool hasError() const;

private:
    std::unique_ptr<NameGeneratorImpl> _impl;
};

} // namespace c7
} // namespace sbrella

#endif // SBRELLA_C7_NAME_GENERATOR_H
// clang-format on
