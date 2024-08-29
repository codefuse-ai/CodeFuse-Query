

#ifndef COREF_CFAMILY_SRC_EXTRACTOR_COREFURI_HPP
#define COREF_CFAMILY_SRC_EXTRACTOR_COREFURI_HPP

#include "Coref/CorefDef.hpp"

namespace coref {
class CorefUri {
  private:
    // NOLINTNEXTLINE
    static std::string URI_TEMPLATE;

    std::string _corpus;
    std::string _file;
    std::string _signature;

  public:
    CorefUri(const std::string &corpus, const std::string &file);
    std::string getCorpus() const;
    void setCorpus(std::string corpus);
    std::string getFile() const;
    void setFile(std::string file);
    std::string getSignature() const;
    void setSignature(std::string signature);

    static std::string generateCorefUri(const std::string &corpus, const std::string &signature);
    static CorefOid generateOId(const std::string &corpus, const std::string &signature);
    static CorefOid generateCorpusOId(const std::string &corpus);
    static CorefOid generateFileOId(const std::string &corpus, const std::string &file);
};
} // namespace coref

#endif // COREF_CFAMILY_SRC_EXTRACTOR_COREFURI_HPP
