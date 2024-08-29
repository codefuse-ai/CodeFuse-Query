

#include "CorefUri.hpp"
#include "Utils/Hash.hpp"
#include <llvm/Support/FormatVariadic.h>

using namespace coref;

// The signature already includes the file path
std::string CorefUri::URI_TEMPLATE = "coref://{0}?path={1}";

CorefUri::CorefUri(const std::string &corpus, const std::string &file)
    : _corpus(corpus), _file(file) {}

std::string CorefUri::getCorpus() const { return _corpus; }

void CorefUri::setCorpus(std::string corpus) { _corpus = corpus; }

std::string CorefUri::getFile() const { return _file; }

void CorefUri::setFile(std::string file) { _file = file; }

std::string CorefUri::getSignature() const { return _signature; }

void CorefUri::setSignature(std::string signature) { _signature = signature; }

std::string CorefUri::generateCorefUri(const std::string &corpus, const std::string &signature) {
    if (corpus.empty() || signature.empty()) {
        // "Empty corpus or file or signature"
        return std::string();
    }

    return llvm::formatv(URI_TEMPLATE.c_str(), corpus, signature).str();
}

CorefOid CorefUri::generateOId(const std::string &corpus, const std::string &signature) {
    return Hash::hashString(generateCorefUri(corpus, signature));
}

CorefOid CorefUri::generateCorpusOId(const std::string &corpus) {
    return Hash::hashString(llvm::formatv("coref://{0}", corpus).str());
}

CorefOid CorefUri::generateFileOId(const std::string &corpus, const std::string &file) {
    return Hash::hashString(llvm::formatv(CorefUri::URI_TEMPLATE.c_str(), corpus, file).str());
}
