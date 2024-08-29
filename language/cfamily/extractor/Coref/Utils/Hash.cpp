

#include "Hash.hpp"

coref::CorefOid coref::Hash::hashString(const std::string &value) {
    long hash = 0L;
    if (!value.empty()) {
        for (auto v : value) {
            hash = 63 * hash + v;
        }
    }
    return hash;
}