set(src StorageFacade.cpp)

add_library(Storage STATIC ${src})

target_include_directories(Storage PUBLIC ${SqliteOrm_INCLUDE_DIRS})
