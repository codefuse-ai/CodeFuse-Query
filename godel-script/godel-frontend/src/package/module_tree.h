
#pragma once

#include <cstring>
#include <sstream>
#include <vector>
#include <unordered_map>

namespace package {

struct module_tree_node {
    // node short name, for example: godelscript
    std::string node_name;
    // node full path, for example: coref::godelscript
    std::string full_path;
    // child nodes/packages
    std::unordered_map<std::string, module_tree_node*> next;

    module_tree_node(const std::string& name, const std::string& path):
        node_name(name), full_path(path) {}
    ~module_tree_node() {
        // recursively delete all child nodes
        for(auto& i : next) {
            delete i.second;
        }
    }
};

class module_tree {
private:
    // tree root
    std::unordered_map<std::string, module_tree_node*> root;
    // used for dump
    std::vector<std::string> indent;

private:
    void insert_core(const std::vector<std::string>&);
    void dump_node(module_tree_node*);

public:
    ~module_tree() {
        // recursively delete all child nodes
        for(auto& i : root) {
            delete i.second;
        }
    }
    const auto& get_root() const { return root; }
    bool empty() const { return root.empty(); }
    void insert(const std::string&);
    void dump();
};

}