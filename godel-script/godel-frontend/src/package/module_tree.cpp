#include "module_tree.h"

#include <iostream>
#include <vector>

namespace package {

void module_tree::insert(const std::string& full_path) {
    std::vector<std::string> paths;
    size_t last = 0, pos = full_path.find("::", 0);
    while(pos!=std::string::npos) {
        paths.push_back(full_path.substr(last, pos - last));
        last = pos + 2;
        pos = full_path.find("::", last);
    }
    if (last!=full_path.length()) {
        paths.push_back(full_path.substr(last, pos - last));
    }
    insert_core(paths);
}

void module_tree::insert_core(const std::vector<std::string>& paths) {
    if (!paths.size()) {
        return;
    }
    module_tree_node* ptr = nullptr;
    auto gen_path = paths[0];
    if (!root.count(paths[0])) {
        ptr = new module_tree_node(paths[0], gen_path);
        root[paths[0]] = ptr;
    } else {
        ptr = root.at(paths[0]);
    }
    for(size_t i = 1; i < paths.size(); i++) {
        gen_path += "::" + paths[i];
        if (!ptr->next.count(paths[i])) {
            auto tmp = new module_tree_node(paths[i], gen_path);
            ptr->next[paths[i]] = tmp;
            ptr = tmp;
        } else {
            ptr = ptr->next.at(paths[i]);
        }
    }
}

void module_tree::dump_node(module_tree_node* node) {
    std::clog << "  ";
    for(const auto& i : indent) {
        std::clog << i;
    }
    if (node->next.empty()) {
            std::clog << "[module] ";
        } else {
            std::clog << "[package] ";
        }
    std::clog << node->node_name;
    if (node->full_path.length()) {
        std::clog << " => " << node->full_path;
    }
    std::clog << "\n";
    if (indent.back()=="+--") {
        indent.back() = "    ";
    } else if (indent.back()=="|--") {
        indent.back() = "|   ";
    }
    indent.push_back("    ");
    size_t index = 0;
    for(const auto& i : node->next) {
        indent.back() = (index==node->next.size()-1)? "+--":"|--";
        dump_node(i.second);
        ++index;
    }
    indent.pop_back();
}

void module_tree::dump() {
    size_t index = 0;
    for(const auto& i : root) {
        indent = {index==root.size()-1? "+--":"|--"};
        dump_node(i.second);
        ++index;
    }
}

}