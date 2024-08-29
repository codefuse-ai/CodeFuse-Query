

#include "StorageFacade.hpp"

using namespace coref;

void StorageFacade::initOrm(const std::string &sqliteDbPath) {
    coref::Storage::getInstance().initialize(sqliteDbPath);
}
