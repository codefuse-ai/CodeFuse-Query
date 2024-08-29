// Based on https://code.alipay.com/codeinsight_thirdparty/index7
// Copyright (C), 2016-2018, Sourcebrella, Inc Ltd - All rights reserved.
// Unauthorized copying, using, modifying of this file, via any medium is
// strictly prohibited.
// Proprietary and confidential.
//
// Author: Kai Luo<luokai@sbrella.com>
// File Description:
// Creation Date: 2018-05-30
// Modification History: Created.

#ifndef SBRELLA_C7_SWITCHER_H
#define SBRELLA_C7_SWITCHER_H

namespace sbrella {
namespace c7 {

template <typename T>
class Switcher {
public:
    Switcher(T &var) : var_(&var), orig_val_(var) {}
    Switcher(T &var, T tempVal) : var_(&var), orig_val_(var) { var = tempVal; }
    ~Switcher() { *var_ = orig_val_; }

private:
    T *var_;
    T orig_val_;
};
} // namespace c7
} // namespace sbrella

#endif // SBRELLA_C7_SWITCHER_H
