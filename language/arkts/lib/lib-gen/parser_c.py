import json
import sys
from pathlib import Path

from tree_sitter_languages import get_parser

# Create a Tree-sitter parser and set the language to C++
parser = get_parser('cpp')

class_name = None


def get_real_str(text):
    return str(text).split("'")[1]


def get_func_name(node):
    if node.type == "field_identifier" or node.type == "identifier":
        return get_real_str(node.text)
    res = None
    for child in node.children:
        tmp = get_func_name(child)
        if not res and tmp:
            res = tmp
    return res


def get_identifier(node):
    if node.type == "field_identifier" or node.type == "identifier" or node.type == "pointer_declarator":
        return get_real_str(node.text)
    res = None
    for child in node.children:
        tmp = get_identifier(child)
        if not res and tmp:
            res = tmp
    return res


def get_params(node):
    res = dict()
    if node.type == "parameter_declaration":
        tmp = len(node.children) - 1
        res[get_real_str(node.children[tmp].text)] = get_real_str(node.children[tmp - 1].text)
    for child in node.children:
        res.update(get_params(child))
    return res


def get_type(node):
    res = None
    if node.type == "qualified_identifier" or node.type == "type_identifier" or node.type == "primitive_type":
        return get_real_str(node.text)
    for child in node.children:
        tmp = get_type(child)
        if not res and tmp:
            res = tmp
    return res


def get_info(node):
    print(str(node.type) + " : " + str(node.text))
    for child in node.children:
        get_info(child)


def dfs_node(node, table):
    global class_name
    if node.type == "preproc_function_def":
        return
    if node.type == "field_declaration":
        # 类函数仅申明,或为类成员变量
        node_text = get_real_str(node.text)
        if "enum " in node_text:
            return
        if "(" in node_text and ")" in node_text:
            if " " not in node_text:
                return
            if "func" not in table:
                table["func"] = dict()
            func_name = get_func_name(node)
            func_return_type = get_type(node)
            table["func"][func_name] = dict()
            table["func"][func_name]["return_type"] = func_return_type
            if func_name == class_name:
                table["func"][func_name]["return_type"] = class_name
            table["func"][func_name]["params"] = get_params(node)
        else:
            if "Field" not in table:
                table["Field"] = dict()
            table["Field"][get_identifier(node)] = get_type(node)
    elif node.type == "function_definition":
        if "func" not in table:
            table["func"] = dict()
        # 构造函数与析构函数不处理
        if "~" in str(node.text):
            return
        func_name = get_func_name(node)
        func_return_type = get_type(node)
        table["func"][func_name] = dict()
        table["func"][func_name]["return_type"] = func_return_type
        if func_name == class_name:
            table["func"][func_name]["return_type"] = class_name
        table["func"][func_name]["params"] = get_params(node)
    elif node.type == "class_specifier":
        child_table = dict()
        fa_class = None
        for child in node.children:
            if child.type == "type_identifier":
                class_name = get_real_str(child.text)
                table[class_name] = child_table
            if child.type == "base_class_clause":
                fa_class = get_real_str(child.text).rsplit(" ", 1)[-1]
            dfs_node(child, child_table)
        if fa_class:
            table[class_name]["fa"] = fa_class
    else:
        for child in node.children:
            dfs_node(child, table)


def info_extract(content):
    tree = parser.parse(bytes(content, 'utf8'))
    tmp = dict()
    dfs_node(tree.root_node, tmp)
    return tmp


def header_file(path):
    tmp = list()
    path = Path(path)
    if path.is_dir():
        for file in path.rglob(f"*.h"):
            tmp.append(file)
    elif path.is_file() and path.suffix == ".h":
        tmp.append(path)
    return tmp


def main():
    if len(sys.argv) != 2:
        print("Usage: python parse_headers.py <path-to-header.h>")
        sys.exit(1)
    header_file_list = header_file(sys.argv[1])
    res = dict()
    for header_path in header_file_list:
        with open(header_path, 'r', encoding='utf8') as file:
            print(header_path)
            content = file.read()
            tmp = info_extract(content)
            if tmp:
                for key, value in tmp.items():
                    if key not in res or len(res[key]) == 0:
                        res[key] = value
                    if len(value) != 0:
                        res[key] = value
    with open("../arkTs_schema.json", "w") as f:
        f.write(json.dumps(res, indent=4))


if __name__ == "__main__":
    main()
