import argparse
import json

from jinja2 import Environment, FileSystemLoader

from run.runner import Runner


def lib_gen(lib):
    # 创建一个加载器，Jinja2 会从这个目录中加载模板
    file_loader = FileSystemLoader('resources')

    # 创建一个环境对象，这个环境对象包含了配置、全局对象以及加载器
    env = Environment(loader=file_loader)

    # 加载模板，这里假设有一个名为 `template.html` 的模板文件在 templates 目录下
    template = env.get_template('template_lib_file.gdl')

    result = None
    schema_list = list()
    for class_name, class_info in lib.items():
        # 准备数据用于渲染模板
        if len(class_info) == 0:
            continue
        schema_list.append(class_name)
        data = dict()
        data["name"] = class_name
        if "Field" in class_info:
            data["schema"] = class_info["Field"]
        else:
            data["schema"] = dict()
        if "all_fields" in class_info:
            # 修改后当前元素的构造函数里面的fields应该为自身包含的field和祖先节点包含的field
            data["fields"] = class_info["all_fields"]
        if "func" in class_info:
            # 修改干掉无用的func
            data["func"] = class_info["func"]
        else:
            data["func"] = dict()
        if "fa" in class_info:
            data["extends"] = "extends " + class_info["fa"] + " "
            data["fa"] = class_info["fa"]
            data["fa_fields"] = dict()
            for tmp in data["fields"].keys():
                if tmp not in data["schema"]:
                    data["fa_fields"][tmp] = data["fields"][tmp]
        # 渲染模板，传递数据，并打印结果
        output = template.render(data)
        if not result:
            result = output
        else:
            result = result + "\n\n" + output
    data = dict()
    data["schema_list"] = schema_list
    template = env.get_template('template_lib_db_file.gdl')
    result += "\n\n" + template.render(data)
    return result


def substr_contain(haystack, needle):
    return needle.lower() in haystack.lower()


def clean_dict(original_dict):
    new_dict = {}
    for key, value in original_dict.items():
        if not value:
            value = "int"
        # 移除键首尾的 '*' 和 '_'
        clean_key = key.strip('*_')
        clean_value = value.strip('*_')
        if clean_key == "range":
            clean_key = "loc"
        # type分辨，暂时把可能是string看作string
        if substr_contain(clean_value, "string"):
            clean_value = "string"
        else:
            clean_value = "int"
        new_dict[clean_key] = clean_value
    return new_dict


def modify_json(lib):
    # 获取每个模型对应的真实field，包含父节点成员变量信息
    for class_name, class_info in lib.items():
        if len(class_info) == 0:
            continue
        class_info["all_fields"] = dict()
        if "Field" in class_info:
            class_info["all_fields"].update(class_info["Field"])
        if "fa" in class_info:
            tmp_name = class_name
            while 1:
                if "Field" in lib[tmp_name]:
                    class_info["all_fields"].update(lib[tmp_name]["Field"])
                if "fa" in lib[tmp_name]:
                    tmp_name = lib[tmp_name]["fa"]
                else:
                    break
    for class_name, class_info in lib.items():
        if "Field" in class_info:
            class_info["Field"] = clean_dict(class_info["Field"])
        if "all_fields" in class_info:
            class_info["all_fields"] = clean_dict(class_info["all_fields"])
            if "func" in class_info:
                pop_list = list()
                for key in class_info["func"].keys():
                    flag = None
                    for field in class_info["all_fields"].keys():
                        if substr_contain(key, field):
                            if substr_contain(key, "set"):
                                continue
                            flag = field
                    if not flag:
                        pop_list.append(key)
                    else:
                        class_info["func"][key]["field_key"] = flag
                for tmp in pop_list:
                    class_info["func"].pop(tmp)
    pass


def parse_args():
    parser = argparse.ArgumentParser(description='arkTs-lib-gen')
    parser.add_argument("--source", "-src", dest="src", help='arkTs AST ir path')
    parser.add_argument("--output", "-out", dest="output", help='output path')
    parser.add_argument("--json", "-json", dest="json", help='the determined lib library')
    args = parser.parse_args()
    lib = None
    if args.src:
        cmd = ["/usr/bin/python3", "./parser_c.py", args.src]
        runner = Runner(cmd, 3600)
        runner.subrun()
        with open("../arkTs_schema.json", "r") as f:
            lib = json.load(f)
    if args.json:
        with open(args.json, "r") as f:
            lib = json.load(f)
    if not lib:
        print("请给出需要生成的lib/arkTs源码目录")
        return -1
    modify_json(lib)
    res = lib_gen(lib)
    if args.output:
        with open(args.output, "w") as f:
            f.write(res)
    else:
        print(res)


if __name__ == '__main__':
    parse_args()
