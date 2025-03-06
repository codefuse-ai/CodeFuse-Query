import argparse
import json
import re

from jinja2 import Environment, FileSystemLoader, PackageLoader

typeTable = dict()
addFunc = list()# addFunc record all possible additional function information
specialFunc = list()


def is_all_english(s):
    return all('A' <= c <= 'Z' or 'a' <= c <= 'z' for c in s)


def is_strict_prefix(first, second):
    # 第二个字符串需要以第一个字符串开始，
    # 并且在这之后紧接着 "_"，后面是其他字符
    prefix = first + "_"

    # 检查第一个字符串紧接着 "_" 是否是第二个字符串的前缀
    if second.startswith(prefix):
        # 获取开始匹配的点之后的字符串
        suffix = second[len(prefix):]

        # 如果后续字符串不为空，则返回该后续字符串
        if suffix:
            return suffix
        else:
            return False
    else:
        return False


def replace_last(source_string, old, new):
    # 查找最后一个匹配项的位置
    pos = source_string.rfind(old)
    # 如果找到，将字符串分成两部分并仅替换最后一部分
    if pos != -1:
        source_string = source_string[:pos] + source_string[pos:].replace(old, new, 1)
    return source_string


def lower_first_letter(s):
    if not s or not isinstance(s, str):
        return s
    return s[:1].lower() + s[1:]


def lib_gen(lib):
    global typeTable

    # 创建一个加载器，Jinja2 会从这个目录中加载模板
    file_loader = FileSystemLoader('resources')

    # 创建一个环境对象，这个环境对象包含了配置、全局对象以及加载器
    env = Environment(loader=file_loader)
    env.filters['lower_first'] = lower_first_letter

    # 加载模板lib_uml.gdl
    template = env.get_template('lib_uml.gdl')

    result = ""
    schema_list = list()

    for class_name, class_info in lib.items():
        # 聚合类型走其他渲染流程。
        if class_name == "AggregationType":
            continue
        # 准备数据用于渲染模板
        if len(class_info) == 0:
            continue
        schema_list.append(class_name)

        # database里的类需要通过DO获取数据
        data = dict()
        data["name"] = class_name + "DO"
        data["primary"] = class_info["primary"]
        data["schema"] = class_info["fields"]
        if data["primary"] in data["schema"]:
            data["schema"].pop(data["primary"])
        data["fields"] = class_info["fields"]
        data["func"] = dict()
        data["addFunc"] = dict()
        data["table"] = typeTable[class_name]
        data["specFunc"] = dict()
        data["isDO"] = True
        output = template.render(data)
        result = result + "\n\n" + output
        typeTable[class_name + "DO"] = data["table"]

        data = dict()
        data["typeTable"] = typeTable
        data["name"] = class_name
        if class_name in typeTable:
            data["table"] = typeTable[class_name]
        data["schema"] = class_info["fields"]
        data["primary"] = class_info["primary"]
        if data["primary"] in data["schema"]:
            data["schema"].pop(data["primary"])
        data["fields"] = dict()
        if "all_fields" in class_info:
            # 修改后当前元素的构造函数里面的fields应该为自身包含的field和祖先节点包含的field
            data["fields"].update(class_info["all_fields"])
            data["fields"].update(class_info["fields"])
        if "func" in class_info:
            data["func"] = class_info["func"]
        else:
            data["func"] = dict()
        if "fa" in class_info:
            data["extends"] = "extends " + class_info["fa"] + " "
            data["fa"] = class_info["fa"]
            data["fa_fields"] = class_info["all_fields"]
            data["nowName"] = class_name + "DO"
            for fa_field in data["fa_fields"].keys():
                if fa_field in data["schema"]:
                    data["schema"].pop(fa_field)
        # 附加函数添加
        data["addFunc"] = dict()
        for tmp in addFunc:
            fa_name = to_camel_case_rename(tmp["fa"])
            son_name = to_camel_case_rename(tmp["son"])
            fa = tmp["fa"]
            son = tmp["son"]
            name = is_strict_prefix(fa, son)
            if fa_name == class_name and name:
                name = "get" + to_camel_case_rename(name)
                if "func" not in lib[son_name]:
                    print(son + " do not have func: " + name)
                    continue
                if name not in lib[son_name]["func"]:
                    print(son + " do not have func: " + name)
                    continue
                data["addFunc"][name] = dict()
                comment = name[3:]
                comment = comment[0].lower() + comment[1:]
                data["addFunc"][name]["comment"] = "Get the " + comment
                data["addFunc"][name]["son"] = son_name
                data["addFunc"][name]["return_type"] = lib[son_name]["func"][name]["return_type"]
                if tmp["isSet"]:
                    data["addFunc"][name]["return_type"] = "*" + data["addFunc"][name]["return_type"]
                    data["addFunc"][name]["return_stmt"] = "yield " + lower_first_letter(son_name) + "." + name + "()"
                else:
                    data["addFunc"][name]["return_stmt"] = "return " + lower_first_letter(son_name) +"." + name + "()"
                # ShorthandPropertyAssignment 特殊处理添加getSymbol方法:
        if class_name == "ShorthandPropertyAssignment":
            func = "getSymbol"
            data["addFunc"][func] = dict()
            data["addFunc"][func]["son"] = "ShorthandPropertyAssignmentValueSymbol"
            data["addFunc"][func]["return_type"] = "Symbol"
            data["addFunc"][func]["return_stmt"] = "return shorthandPropertyAssignmentValueSymbol.getSymbol()"
            data["addFunc"][func]["comment"] = "Gets the value symbol associated" \
                                                   " with this shorthand property assignment"
        # 特殊函数添加
        data["specFunc"] = dict()
        for tmp in specialFunc:
            fa_name = to_camel_case_rename(tmp["fa"])
            son_name = to_camel_case_rename(tmp["son"])
            fa = tmp["fa"]
            son = tmp["son"]
            if fa_name == class_name:
                flag = False
                is_set = False
                for vvv in addFunc:
                    if fa == vvv["fa"] and son == vvv["son"]:
                        flag = True
                        is_set = vvv["isSet"]
                        break
                if not flag:
                    print("please check " + str(tmp))
                    continue
                name = "get" + to_camel_case_rename(tmp["name"])
                data["specFunc"][name] = dict()
                comment = name[3:]
                comment = comment[0].lower() + comment[1:]
                data["specFunc"][name]["comment"] = "Get the " + comment
                data["specFunc"][name]["son"] = son_name
                data["specFunc"][name]["return_type"] = son_name
                if is_set:
                    data["specFunc"][name]["return_type"] = "*" + son_name
                    data["specFunc"][name]["return_stmt"] = "yield " + lower_first_letter(son_name)
                else:
                    data["specFunc"][name]["return_stmt"] = "return " + lower_first_letter(son_name)
        # 渲染模板，传递数据，并打印结果
        output = template.render(data)
        if result == "":
            result = output
        else:
            result = result + "\n\n" + output


    # 聚合类型处理
    template = env.get_template('lib_uml_aggregation.gdl')
    for name, v in lib["AggregationType"].items():
        data = dict()
        data["name"] = name
        data["contains"] = dict()
        data["comment"] = "This type consists of the following types: ["
        for tmp in v["contains"]:
            tmp = to_camel_case_rename(tmp)
            data["comment"] += tmp + ", "
            if tmp in lib:
                if "primary" in lib[tmp]:
                    data["contains"][tmp] = lib[tmp]["primary"]
            else:
                data["contains"][tmp] = "id"
        data["comment"] = replace_last(data["comment"], ", ", "]")
        output = template.render(data)
        if result == "":
            result = output
        else:
            result = result + "\n\n" + output
    # database生成
    data = dict()
    keys = list(typeTable.keys())
    for key in keys:
        if not key.endswith("DO"):
            typeTable.pop(key)
    data["typeTable"] = typeTable
    template = env.get_template('lib_uml_db_file.gdl')
    result += "\n\n" + template.render(data)


    # kind int string mapping
    data = dict()
    data["kind_map"] = parse_kind_mapping()
    template = env.get_template('lib_kind_map.gdl')
    result += "\n\n" + template.render(data)
    return result


def to_camel_case(snake_str):
    # 将下划线样式转换为驼峰样式
    components = snake_str.split('_')
    # 除第一个单词外，其他单词首字母大写
    return components[0] + ''.join(x.title() for x in components[1:])


# 驼峰修改
def update_keys_values(d):
    global typeTable
    new_dict = {}
    for k, v in d.items():
        # 更新键
        new_key = to_camel_case(k)
        # 如果值是字典，递归更新
        if isinstance(v, dict):
            new_dict[new_key] = update_keys_values(v)
        # 如果值是字符串，也进行替换
        elif isinstance(v, str):
            tmp = to_camel_case(v)
            new_dict[new_key] = tmp
            if k == "returnType":
                if not (str_equal(tmp, "bool") or str_equal(tmp, "int") or str_equal(tmp, "string")):
                    new_dict[new_key] = to_camel_case_rename(tmp)
        elif isinstance(v, list):
            new_list = list()
            for tmp in v:
                new_list.append(to_camel_case(tmp))
            new_dict[new_key] = new_list
        else:
            # 对于其他类型，直接赋值
            new_dict[new_key] = v
    return new_dict


def str_equal(haystack, needle):
    return needle.lower() in haystack.lower()


def parse_relationships(text, pattern):
    # 定义正则表达式模式来匹配所需的元素
    matches = pattern.finditer(text)

    result = []
    for match in matches:
        # 根据关系类型设置isSet的值
        is_set = True if match.group(2) == "{" else False

        # 构建最终的字典对象
        relationship = {
            'fa': match.group('fa'),
            'son': match.group('son'),
            'isSet': is_set
        }
        result.append(relationship)

    return result


def parse_kind_mapping():
    with open("resources/kind_map.txt", "r") as f:
        text = f.read()
    # 定义正则表达式模式，匹配标识符和对应的数字
    pattern = re.compile(r'(\w+)\s=\s(\d+),')

    # 使用字典存储映射关系
    mapping = {}

    # 查找所有匹配的项，并填充字典
    for match in pattern.finditer(text):
        identifier = match.group(1)  # 捕获标识符
        number = int(match.group(2))  # 捕获对应的数字，并转换为整型
        mapping[number] = identifier

    return mapping


def parse_entity_relationships(text):
    # 定义正则表达式模式来匹配父实体(fa)、子实体的名称(name)、以及子实体类型(son)
    pattern = re.compile(
        r"(.+?)' (?P<name>\w+)\s+(?P<son>\w+)(.+?)",  # 捕获子实体名称和子实体类型
        re.DOTALL
    )
    entity_pattern = re.compile(r'entity\s+(\w+)(?:\s+extends\s+([\w\s,]+))?\s*\{(.+?)\}', re.DOTALL)

    # 查找所有匹配项
    matches = entity_pattern.finditer(text)

    # 用于储存各关系的列表
    result = []

    # 遍历匹配项，构建结果
    for match in matches:
        entity_name = match.group(1)
        attributes_text = match.group(3)
        attributes = pattern.finditer(attributes_text)
        for tmp in attributes:
            relationship = {
                'fa': entity_name,
                'son': tmp.group("son"),
                'name': tmp.group("name"),
            }
            result.append(relationship)

    # 返回解析后的关系列表
    return result

def data_extract(file_path):
    global addFunc
    global specialFunc

    # 从文件中读取数据
    with open(file_path, 'r') as file:
        text = file.read()

    entity_pattern = re.compile(r'entity\s+(\w+)(?:\s+extends\s+([\w\s,]+))?\s*\{(.+?)\}', re.DOTALL)

    attribute_pattern = re.compile(r'^\s*(\w+):\s*(\w+)(\s+<<PK>>)?\s*(\w+)?\s*$', re.MULTILINE)

    # 解析实体名称、继承的类和属性
    matches = entity_pattern.finditer(text)

    res = dict()
    for match in matches:
        entity_name = match.group(1)
        extends_part = match.group(2)
        extends_classes = [cls.strip() for cls in extends_part.split(',')] if extends_part else []

        attributes_text = match.group(3)
        attributes = attribute_pattern.findall(attributes_text)

        # 构建属性字典
        schema = {}
        primary = None
        for attr in attributes:
            attr_name, attr_type, pk, return_type = attr
            if str_equal(attr_type, "boolean"):
                attr_type = "int"
                return_type = "bool"
            if str_equal(attr_type, "text"):
                attr_type = "string"
            if str_equal(attr_type, "datetime"):
                attr_type = "string"
            schema[attr_name] = {
                'type': attr_type,
            }
            if not return_type:
                return_type = attr_type
            schema[attr_name]['returnType'] = return_type
            if pk and 'PK' in pk:
                primary = attr_name
        if not primary:
            primary = "id"
            print("Warning: " + entity_name + " do not hava primary key, default id")

        # 构建结果字典
        result = {
            entity_name: {
                'schema': schema,
                "primary": primary
            }
        }
        if extends_classes:
            result[entity_name]['extends'] = extends_classes
        res.update(result)

    enum_pattern = re.compile(r'enum\s+(\w+)\s*(?:extends\s+([\w\s,]+))?\{\s*(.*?)\s*\}', re.DOTALL)
    result = dict()
    for match in enum_pattern.finditer(text):
        enum_name, extends_part, enum_values = match.groups()
        # 枚举值，移除空白，分割每一行
        values_list = [value.strip() for value in enum_values.strip().splitlines()]
        result[enum_name] = dict()
        result[enum_name]['contains'] = values_list
        # 如果有继承的部分，则也加入
        if extends_part:
            extends_list = [name.strip() for name in extends_part.split(',')]
            result[enum_name]['extends'] = extends_list

    res["AggregationType"] = result

    pattern = re.compile(
        r'(?P<fa>\w+)\s+'  # 父实体
        r'\|\|-\-o(\||\{)\s+'  # 关系类型 ('o|' 为 one-to-one, 'o{' 为 one-to-many)
        r'(?P<son>\w+)'  # 子实体
    )
    addFunc = parse_relationships(text, pattern)

    pattern = re.compile(
        r'(?P<fa>\w+)\s+\|o\-\-o(\||\{)\s+(?P<son>\w+)'
    )

    addFunc += parse_relationships(text, pattern)

    pattern = re.compile(
        r'(?P<fa>\w+)\s+'      # 匹配父实体
        r'\|\|--\|(\||\{)'             # 匹配关系标识符
        r'\s+(?P<son>\w+)'       # 匹配子实体
    )
    addFunc += parse_relationships(text, pattern)

    pattern = re.compile(
        r'(?P<fa>\w+)\s+'  # 匹配父实体
        r'\|\|-o(\||\{)'  # 匹配关系标识符
        r'\s+(?P<son>\w+)'  # 匹配子实体
    )
    addFunc += parse_relationships(text, pattern)

    specialFunc = parse_entity_relationships(text)
    return res


def to_camel_case_rename(s):
    if not s:
        return s
    s = to_camel_case(s)
    return s[0].upper() + s[1:]


def modify_json(lib):
    global typeTable
    for tmp in lib:
        if tmp == "AggregationType":
            continue
        typeTable[to_camel_case_rename(tmp)] = tmp
    # lib = update_keys_values(lib)
    # schema 首字母需要大写
    new_dict = {}
    for k, v in lib.items():
        k = to_camel_case_rename(k)
        new_dict[k] = dict()
        new_dict[k].update(v)
        if "extends" in v:
            new_dict[k]["extends"] = list()
            for tmp in v["extends"]:
                new_dict[k]["extends"].append(to_camel_case_rename(tmp))

    lib = new_dict
    new_dict = {}
    for k, v in lib.items():
        # 聚合类型处理, field 默认只有主键id， func为各个特有类型的to函数
        if k == "AggregationType":
            new_dict[k] = lib[k]
            continue
        new_dict[k] = {}
        if "extends" in v:
            new_dict[k]["fa"] = v["extends"][0]
        new_dict[k]["fields"] = {}
        new_dict[k]["all_fields"] = {}
        new_dict[k]["func"] = {}
        new_dict[k]["primary"] = v['primary']
        for field, t in v["schema"].items():
            new_dict[k]["fields"][field] = t["type"]
            func = "get" + to_camel_case_rename(field)
            if func.endswith("Id") and func != "getId":
                func = func[:-2]
            elif func == "getId":
                func = "getPrimaryKey"
                if t["returnType"] != "int":
                    t["returnType"] = "int"
            if t["returnType"] == "bool":
                if func.startswith("getIs"):
                    func = to_camel_case_rename(field)
            new_dict[k]["func"][func] = dict()
            comment = func[3:]
            comment = comment[0].lower() + comment[1:]
            new_dict[k]["func"][func]["comment"] = "Gets the " + comment
            if func == "getPrimaryKey":
                new_dict[k]["func"][func]["comment"] = "Get primary key"
            if t["returnType"] == "int" or t["returnType"] == "string" or t["returnType"] == "bool":
                new_dict[k]["func"][func]["return_type"] = t["returnType"]
            else:
                new_dict[k]["func"][func]["return_type"] = to_camel_case_rename(t["returnType"])
            new_dict[k]["func"][func]["field_key"] = field
            new_dict[k]["func"][func]["params"] = {}
            if t["returnType"] == "int" or t["returnType"] == "string" or t["returnType"] == "bool":
                continue
            else:
                if t["returnType"] in lib:
                    new_dict[k]["func"][func]["return_type_key"] = lib[t["returnType"]]["primary"]
        # 给每个类添加primary key函数
        if "getPrimaryKey" not in new_dict[k]["func"]:
            func = "getPrimaryKey"
            new_dict[k]["func"][func] = dict()
            new_dict[k]["func"][func]["field_key"] = v['primary']
            new_dict[k]["func"][func]["params"] = {}
            new_dict[k]["func"][func]["return_type"] = "int"
            new_dict[k]["func"][func]["comment"] = "Get primary key"
        if "extends" in v:
            # 多继承添加to函数
            if len(v["extends"]) > 1:
                for tmp in v["extends"]:
                    if tmp == v["extends"][0]:
                        continue
                    func = "to" + to_camel_case_rename(tmp)
                    new_dict[k]["func"][func] = dict()
                    new_dict[k]["func"][func]["comment"] = "trans to " + func[2:] + " to use func"
                    new_dict[k]["func"][func]["return_type"] = tmp
                    new_dict[k]["func"][func]["field_key"] = lib[k]["primary"]
                    new_dict[k]["func"][func]["params"] = {}
                    if tmp in lib:
                        new_dict[k]["func"][func]["return_type_key"] = lib[tmp]["primary"]
    # 刷出来每个schema特有的数据
    lib = new_dict
    num = 0
    fa = dict()
    while 1:
        flag = 1
        for tmp in lib:
            if "fa" in lib[tmp]:
                flag = 0
        for tmp in lib["AggregationType"]:
            if "extends" in lib["AggregationType"][tmp]:
                flag = 0
        if flag:
            break
        tmp_num = num
        for tmp in lib["AggregationType"]:
            if "extends" in lib["AggregationType"][tmp]:
                erase = []
                for extends in lib["AggregationType"][tmp]["extends"]:
                    if "extends" not in lib["AggregationType"][extends]:
                        num = num + 1
                        erase.append(extends)
                        lib["AggregationType"][tmp]["contains"] += lib["AggregationType"][extends]["contains"]
                for extends in erase:
                    lib["AggregationType"][tmp]["extends"].remove(extends)
                if len(lib["AggregationType"][tmp]["extends"]) == 0:
                    lib["AggregationType"][tmp].pop("extends")
        for tmp in lib:
            if "fa" in lib[tmp]:
                faClass = lib[tmp]["fa"]
                fa[tmp] = faClass
                if faClass in lib and "fa" not in lib[faClass]:
                    num = num + 1
                    lib[tmp]["all_fields"].update(lib[faClass]["all_fields"])
                    lib[tmp]["all_fields"].update(lib[faClass]["fields"])
                    lib[tmp].pop("fa")
        if tmp_num == num:
            break
    for tmp in lib:
        if tmp == "AggregationType":
            continue
        erase_list = list()
        for k in lib[tmp]["fields"]:
            if k in lib[tmp]["all_fields"]:
                erase_list.append(k)
        for k in erase_list:
            func = "get" + to_camel_case_rename(k)
            if func in lib[tmp]["func"]:
                lib[tmp]["func"].pop(func)
            # lib[tmp]["fields"].pop(k)
        if tmp in fa:
            lib[tmp]["fa"] = fa[tmp]
    # 给具备getKind, getParentKind方法的类型添加getKindName方法
    for class_name in lib:
        if class_name == "AggregationType":
            continue
        tmp = ["getKind", "getParentKind"]
        for func in tmp:
            if func in lib[class_name]["func"]:
                # 添加getKindName or getParentKindName 函数
                new_func = func + "Name"
                lib[class_name]["func"][new_func] = dict()
                lib[class_name]["func"][new_func]["field_key"] = func + "()"
                lib[class_name]["func"][new_func]["params"] = {}
                lib[class_name]["func"][new_func]["return_type"] = "string"
                lib[class_name]["func"][new_func]["comment"] = "Get the real kind name"
                lib[class_name]["func"][new_func]["return_type"] = "string"
    with open("../data.json", "w") as f:
        f.write(json.dumps(lib, indent=4))

    return lib


def parse_args():
    parser = argparse.ArgumentParser(description='arkTs-lib-gen')
    parser.add_argument("--uml", "-uml", dest="uml", required=True, help='the uml path')
    parser.add_argument("--output", "-out", dest="output", help='output path')
    args = parser.parse_args()
    lib = None
    if args.uml:
        lib = data_extract(args.uml)
    lib = modify_json(lib)
    res = lib_gen(lib)
    if args.output:
        with open(args.output, "w") as f:
            f.write(res)
    else:
        print(res)


if __name__ == '__main__':
    parse_args()
