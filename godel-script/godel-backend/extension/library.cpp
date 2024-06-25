#include "souffle/SymbolTable.h"
#include "souffle/RecordTable.h"
#include <cassert>

extern "C" souffle::RamDomain get_field_by_index(souffle::SymbolTable* symbolTable, souffle::RecordTable* recordTable, souffle::RamDomain arg, souffle::RamDomain total, souffle::RamDomain index) {
    assert(symbolTable && "NULL symbol table");
    assert(recordTable && "NULL record table");
    assert(arg != 0);

    const souffle::RamDomain* myTuple = recordTable->unpack(arg, total);
    return myTuple[index];
}
