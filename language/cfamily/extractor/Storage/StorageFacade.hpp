
#ifndef COREF_CFAMILY_SRC_EXTRACTOR_STORAGEFACADE_HPP
#define COREF_CFAMILY_SRC_EXTRACTOR_STORAGEFACADE_HPP

#include "Model/Models.hpp"
#include "Storage.hpp"

namespace coref {

class StorageFacade {
  public:
    static void initOrm(const std::string &sqliteDbPath);

    template <typename T> static inline void insertClassObj(T &&obj) {
        auto storage = coref::Storage::getInstance().getStorage();
        auto statement = storage->prepare(replace(std::forward<T>(obj)));
        storage->execute(statement);
    }

    static inline void transaction(const std::function<bool()> &f) {
        auto storage = coref::Storage::getInstance().getStorage();
        storage->transaction(f);
    }

    static inline bool checkFileObjExist(CorefOid programOid, CorefOid fileOid) {
        auto storage = coref::Storage::getInstance().getStorage();
        auto statement = storage->prepare(
            select(&File::oid, from<File>(),
                   where(c(&File::oid) == fileOid and c(&File::programOid) == programOid)));
        return !storage->execute(statement).empty();
    }

    static inline std::string getDeclNameByOid(CorefOid oid) {
        auto storage = coref::Storage::getInstance().getStorage();
        auto names = storage->select(&NamedDeclaration::name, from<NamedDeclaration>(),
                                     where(c(&NamedDeclaration::oid) == oid));
        if (names.empty()) {
            return "";
        }
        return names[0];
    }

    static inline std::vector<CorefOid> getOidByDeclName(const std::string &declName) {
        auto storage = coref::Storage::getInstance().getStorage();
        auto ids = storage->select(&NamedDeclaration::oid, from<NamedDeclaration>(),
                                   where(c(&NamedDeclaration::name) == declName));
        return ids;
    }

    static inline std::vector<std::string> getPointeeType() {
        auto storage = coref::Storage::getInstance().getStorage();
        auto actualPointeeType =
            storage->select(&Type::debugMessage, from<Type, PointerType>(),
                            where(sqlite_orm::is_equal(&PointerType::pointeeTypeOid, &Type::oid)));
        return actualPointeeType;
    }

    static inline std::vector<std::string> getSymbolNames() {
        auto storage = coref::Storage::getInstance().getStorage();
        return storage->select(&SymbolTable::symbolName, from<SymbolTable>());
    }

    static bool checkDeclOidExist(CorefOid oid) {
        auto storage = coref::Storage::getInstance().getStorage();
        auto oIds = storage->select(&Declaration::oid, from<Declaration>(),
                                    where(c(&Declaration::oid) == oid));
        return !oIds.empty();
    }
};
} // namespace coref

#endif // COREF_CFAMILY_SRC_EXTRACTOR_STORAGEFACADE_HPP
