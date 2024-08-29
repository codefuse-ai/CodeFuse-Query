

#ifndef COREF_CFAMILY_SRC_EXTRACTOR_HASH_HPP
#define COREF_CFAMILY_SRC_EXTRACTOR_HASH_HPP

#include "Coref/CorefDef.hpp"

namespace coref {
class Hash {
  public:
    static CorefOid hashString(const std::string &value);
};
} // namespace coref

#endif // COREF_CFAMILY_SRC_EXTRACTOR_HASH_HPP
