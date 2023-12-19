import subprocess
import json
import os
import sys

def delete_head_spaces(comment: str) -> str:
    if comment.find("//") == 0:
        return comment
    result = ""
    for string in comment.split("\n"):
        temp = ""
        is_space_flag = True
        for ch in string:
            if is_space_flag and (ch == ' ' or ch == '\t'):
                continue
            is_space_flag = False
            temp += ch
        result += temp + "\n"
    if result[-1] == "\n":
        return result[:-1]
    return result

def match_schema_comment(comment_list, schema) -> str:
    schema_location = schema["location"]
    for comment in comment_list:
        comment_location = comment["location"]
        if comment_location[3] < schema_location[1]-1:
            continue
        if comment_location[3] > schema_location[1]:
            continue
        return delete_head_spaces(comment["content"])
    return ""

def match_comment(comment_list, function) -> str:
    function_location = function["location"]
    for comment in comment_list:
        comment_location = comment["location"]
        if comment_location[3] < function_location[1]-1:
            continue
        if comment_location[3] > function_location[1]:
            continue
        return delete_head_spaces(comment["content"])
    return ""

def raw_string(name: str) -> str:
    name = name.replace("_", "\\_")
    name = name.replace("<", "\\<")
    name = name.replace(">", "\\>")
    return name

def dump_type(type_struct):
    result = "*" if type_struct["is_set"] == "true" else ""
    result += type_struct["name"]
    return result

def dump_function(function):
    result = "pub fn " + function["name"] + "("
    for param in function["parameter"]:
        result += param["name"] + ": "
        result += dump_type(param["type"]) + ", "
    if result[-1] == " ":
        result = result[:-2]
    result += ") -> "
    result += dump_type(function["return"]) + ";"
    return result

def dump_function_parameter(function, link_dir = "./schema/", link_db_path = "./database.html") -> str:
    basic_type = ["int", "float", "string", "bool"]
    result = ""
    for param in function["parameter"]:
        result += "* Parameter `" + raw_string(param["name"]) + "`: "
        if param["type"]["name"] in basic_type:
            result += "`" + dump_type(param["type"]) + "`\n"
        elif param["type"]["name"] in database_map.keys():
            result += "[`" + dump_type(param["type"]) + "`](" + link_db_path + ")\n"
        else:
            result += "[`" + dump_type(param["type"]) + "`](" + link_dir + param["type"]["name"] + ".html)\n"
    if function["return"]["name"] in basic_type:
        result += "* Return `" + dump_type(function["return"]) + "`\n"
    elif function["return"]["name"] in database_map.keys():
        result += "* Return [`" + dump_type(function["return"]) + "`](" + link_db_path + ")\n"
    else:
        result += "* Return [`" + dump_type(function["return"]) + "`](" + link_dir + function["return"]["name"] + ".html)\n"
    return result

database_map = {}
def dump_database(database) -> str:
    database_map[database["name"]] = 1
    result = "## " + database["name"] + "\n\n"
    for table in database["table"]:
        result += "* " + table["name"] + ": "
        result += "[*" + table["type"]["name"] + "](./schema/" + table["type"]["name"] + ".html)\n"
    return result

def dump_schema(comment_list, schema) -> str:
    result = "---\n"
    result += "layout: default\n"
    result += "---\n\n"
    result += "# " + schema["name"] + "\n\n"
    comment_of_schema = match_schema_comment(comment_list, schema)
    if len(comment_of_schema) > 0:
        result += "```java\n" + comment_of_schema + "\n```\n"
    if len(schema["parent"]) > 0:
        result += "Inherit from [" + schema["parent"] + "](" + "./" + schema["parent"] + ".html)\n\n"
    for field in schema["fields"]:
        if field["primary"]=="true":
            result += "Primary key: `" + field["name"] + ": "
            result += dump_type(field["type"]) + "`\n\n"
            break
    result += "```typescript\n"
    result += "schema " + schema["name"]
    if len(schema["parent"]) > 0:
        result += " extends " + schema["parent"]
    result += " {\n"
    for field in schema["fields"]:
        result += "  "
        if field["primary"]=="true":
            result += "@primary "
        result += field["name"] + ": "
        result += dump_type(field["type"]) + ",\n"
    if result[-2:] == ",\n":
        result = result[:-2] + "\n"
    result += "}\n"
    result += "```\n"
    for method in schema["methods"]:
        if method["is_public"]=="false":
            continue
        if method["name"] in ["is<T>", "to<T>", "key_eq", "key_neq", "to_set"]:
            continue
        result += "## " + schema["name"] + "::" + raw_string(method["name"]) + "\n\n"
        if method["name"] == "__all__":
            result += "Data constraint method.\n\n"
        comment = match_comment(comment_list, method)
        if len(comment) > 0:
            result += "```java\n" + comment + "\n```\n"
        result += dump_function_parameter(method, "./", "../database.html") + "\n"
        result += "```rust\n"
        result += dump_function(method) + "\n"
        result += "```\n"
    return result

def dfs_visit_schema_hierarchy(schema, schema_list, indent: str) -> str:
    result = indent + "* [" + schema["name"] + "](./schema/" + schema["name"] + ".html)\n"
    for i in schema_list:
        if i["parent"] == schema["name"]:
            result += dfs_visit_schema_hierarchy(i, schema_list, indent + "  ")
    return result

def dump_schema_tree_view(schema_list) -> str:
    root_schema = []
    for schema in schema_list:
        if len(schema["parent"]) == 0:
            root_schema.append(schema)
    result = ""
    for i in root_schema:
        result += dfs_visit_schema_hierarchy(i, schema_list, "")
    return result

if len(sys.argv) != 2:
    print("Usage: python this_file.py godel_script_executable_path")
    exit(-1)

godel_compiler_path = sys.argv[1]
markdown_output_path = "./godel-api"
input_file_directory = "./.coref-api-build"

dirs = [
    "./godel-api",
    "./godel-api/cfamily",
    "./godel-api/go",
    "./godel-api/java",
    "./godel-api/javascript",
    "./godel-api/properties",
    "./godel-api/python",
    "./godel-api/sql",
    "./godel-api/xml",
    "./godel-api/cfamily/schema",
    "./godel-api/go/schema",
    "./godel-api/java/schema",
    "./godel-api/javascript/schema",
    "./godel-api/properties/schema",
    "./godel-api/python/schema",
    "./godel-api/sql/schema",
    "./godel-api/xml/schema"
]
for d in dirs:
    if not os.path.exists(d):
        os.mkdir(d)

input_file_list = []
for (path, dirname, filename) in os.walk(input_file_directory):
    for file in filename:
        input_file_list.append({"path": path, "name": file})

name_mapper = {
    "coref.cfamily.gdl": "cfamily",
    "coref.go.gdl": "go",
    "coref.java.gdl": "java",
    "coref.javascript.gdl": "javascript",
    "coref.properties.gdl": "properties",
    "coref.python.gdl": "python",
    "coref.sql.gdl": "sql",
    "coref.xml.gdl": "xml"
}

semantic_dict = {}
for file in input_file_list:
    file_full_path = file["path"] + "/" + file["name"]
    print("Extract semantic info from " + file_full_path)
    result = subprocess.run(
        [godel_compiler_path, "--dump-lsp", file_full_path],
        stdout=subprocess.PIPE,
        stderr=subprocess.DEVNULL
    )
    if result.returncode!=0:
        continue
    semantic_dict[file["name"]] = result.stdout.decode("utf-8")

for file in input_file_list:
    file_full_path = file["path"] + "/" + file["name"]
    print("Generate markdown for " + file_full_path)
    semantic_info = json.loads(semantic_dict[file["name"]])
    comment_list = semantic_info["comments"]

    output_data = "---\n"
    output_data += "title: \"coref::" + name_mapper[file["name"]] + "\"\n"
    output_data += "layout: default\n"
    output_data += "has_children: true\n"
    output_data += "parent: \"COREF Library Reference\"\n"
    output_data += "---\n"
    output_data += "# COREF Library Reference for " + name_mapper[file["name"]] + "\n\n"
    output_data += "* coref::" + name_mapper[file["name"]] + " [database](./database.html)\n" 
    output_data += "* coref::" + name_mapper[file["name"]] + " [function](./function.html)\n"
    output_data += "* coref::" + name_mapper[file["name"]] + " [schema](./schema.html)\n"
    output_file_path = markdown_output_path + "/" + name_mapper[file["name"]] + "/reference.md"
    open(output_file_path, "w").write(output_data)

    output_data = "---\n"
    output_data += "title: \"database\"\n"
    output_data += "layout: default\n"
    output_data += "parent: \"coref::" + name_mapper[file["name"]] + "\"\n"
    output_data += "grand_parent: \"COREF Library Reference\"\n"
    output_data += "---\n"
    output_data += "# Database of " + file["name"] + "\n\n"
    database_list = semantic_info["semantic"]["database"]
    for database in database_list:
        output_data += dump_database(database)
    output_file_path = markdown_output_path + "/" + name_mapper[file["name"]] + "/database.md"
    print("Generate", output_file_path)
    open(output_file_path, "w").write(output_data)

    function_list = semantic_info["semantic"]["function"]
    output_data = "---\n"
    output_data += "title: \"function\"\n"
    output_data += "layout: default\n"
    output_data += "parent: \"coref::" + name_mapper[file["name"]] + "\"\n"
    output_data += "grand_parent: \"COREF Library Reference\"\n"
    output_data += "---\n"
    output_data += "# Global Function of " + file["name"] + "\n\n"
    for function in function_list:
        if len(function["location"][0]) == 0:
            continue
        if function["is_public"]=="false":
            continue
        output_data += "## " + function["name"] + "\n\n"
        comment = match_comment(comment_list, function)
        if len(comment) > 0:
            output_data += "```java\n" + comment + "\n```\n"
        output_data += dump_function_parameter(function) + "\n"
        output_data += "```rust\n"
        output_data += dump_function(function) + "\n"
        output_data += "```\n"
    output_file_path = markdown_output_path + "/" + name_mapper[file["name"]] + "/function.md"
    print("Generate", output_file_path)
    open(output_file_path, "w").write(output_data)

    schema_list = semantic_info["semantic"]["schema"]
    print("Generate schema documents for", file_full_path, ":", len(schema_list))
    for schema in schema_list:
        output_data = dump_schema(comment_list, schema)
        output_file_path = markdown_output_path + "/" + name_mapper[file["name"]] + "/schema/" + schema["name"] + ".md"
        open(output_file_path, "w").write(output_data)
    
    output_data = "---\n"
    output_data += "title: \"schema\"\n"
    output_data += "layout: default\n"
    output_data += "parent: \"coref::" + name_mapper[file["name"]] + "\"\n"
    output_data += "grand_parent: \"COREF Library Reference\"\n"
    output_data += "---\n"
    output_data += "# Schema of " + file["name"] + "\n\n"
    output_data += dump_schema_tree_view(schema_list)
    output_file_path = markdown_output_path + "/" + name_mapper[file["name"]] + "/schema.md"
    open(output_file_path, "w").write(output_data)
    print("Generate schema documents for", file_full_path, ": Done")