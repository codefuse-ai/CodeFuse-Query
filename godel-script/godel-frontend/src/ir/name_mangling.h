#pragma once

#include "godel-frontend/src/ir/ir_context.h"
#include "godel-frontend/src/ir/lir.h"
#include "godel-frontend/src/symbol.h"

namespace godel {

std::string field_name_mangling(const std::string&, const symbol&);

}