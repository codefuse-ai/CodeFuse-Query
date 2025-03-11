import json
import logging
import argparse
import os.path
import re
import shlex
import subprocess
import threading
import tempfile


def get_lines_from_file(file_name, start_line, end_line):
    content = ""
    with open(file_name, 'r') as file:
        for line_num, line in enumerate(file, start=1):
            if start_line <= line_num <= end_line:
                content += line
            elif line_num > end_line:
                break
    return content


def getLineNumber(txt, pl):
    num = txt[:pl].count("\n") + 1  # 加一是因为第一行没有换行符在前
    return num


def find_nth_occurrence(main_string, sub_string, n):
    start_index = -1
    for _ in range(n):
        start_index = main_string.find(sub_string, start_index + 1)
        if start_index == -1:
            break
    return start_index


def longest_consecutive_spaces(string):
    max_count = 0
    current_count = 0
    for char in string:
        if char == ' ':
            current_count += 1
        else:
            current_count = 0
        if current_count > max_count:
            max_count = current_count
    result = ""
    for _ in range(0, max_count):
        result = result + " "
    return result


def commentExtract(path):
    result = list()
    bds0 = r'//.*'  # 标准匹配单行注释
    bds1 = r'\/\*(?:[^\*]|\*+[^\/\*])*\*+\/'  # 标准匹配多行注释  可匹配跨行注释
    target0 = re.compile(bds0)  # 单行注释
    target = re.compile(bds1)  # 编译正则表达式

    f = open(path, 'r', encoding='utf-8')
    data = f.read()

    num = dict()
    result0 = target0.findall(data)
    # print("单行注释：")
    for i in result0:
        if i not in num:
            num[i] = 0
        num[i] = num[i] + 1
        result.append({"startLine": getLineNumber(data, find_nth_occurrence(data, i, num[i])),
                       "endLine": getLineNumber(data, find_nth_occurrence(data, i, num[i]) + len(i)),
                       "comment": longest_consecutive_spaces(i) + i})
    result1 = target.findall(data)
    # print("多行注释：")
    for i in result1:
        if i not in num:
            num[i] = 0
        num[i] = num[i] + 1
        result.append({"startLine": getLineNumber(data, find_nth_occurrence(data, i, num[i])),
                       "endLine": getLineNumber(data, find_nth_occurrence(data, i, num[i]) + len(i)),
                       "comment": i})

    return result


def output_stream(stream):
    for line in iter(stream.readline, b''):
        output = line.strip()
        if output:
            print(output)


class run:
    def __init__(self, cmd, timeout_seconds):
        self.cmd = cmd
        self.timeout_seconds = timeout_seconds

    def subrun(self):
        print("execute : " + shlex.join(self.cmd))
        try:
            process = subprocess.Popen(self.cmd, stdout=subprocess.PIPE, stderr=subprocess.STDOUT,
                                       encoding="utf-8")

            output_thread = threading.Thread(target=output_stream, args=(process.stdout,))
            output_thread.daemon = True  # 设置为守护线程
            output_thread.start()

            process.wait(timeout=self.timeout_seconds)

            if process.returncode is None:
                # 超时处理
                process.kill()
                logging.error("execute time > %s s, time out, You can add -t option to adjust timeout",
                              self.timeout_seconds)
            return_code = process.wait()
            return return_code
        except Exception as e:
            logging.error("execute error: %s", e)
            return -1


def get_database(path):
    f = open(path, 'r', encoding='utf-8')
    pattern = r'database ArkTsDB\s*\{(.*?^\})'
    matches = re.findall(pattern, f.read(), re.DOTALL | re.MULTILINE)
    res = ""
    for match in matches:
        res = "database ArkTsDB {\n    " + match.strip()
    return res


def main():
    parser = argparse.ArgumentParser(description='arkTs-lib-split')
    parser.add_argument("--split", "-s", dest="split", nargs="*", required=True, help='the file need to be cut')
    parser.add_argument("--class-belong-conf", "-c", nargs="*", dest="belong", required=True, help='the conf')
    parser.add_argument("--func-belong-conf", "-f", nargs="*", dest="funcBelong", required=True, help='the conf')
    parser.add_argument("--godel-script", "-g", dest="godel", required=True, help='godel script compiler')
    parser.add_argument("--output", "-out", dest="output", required=True, help='output dir')
    args = parser.parse_args()
    class_belong = dict()
    func_belong = dict()
    schema = dict()
    impl = dict()
    util = dict()
    output_dir = args.output
    if not os.path.isdir(output_dir):
        logging.error("please give a exist dir to store output")
        exit(-1)
    for conf in args.belong:
        with open(conf, "r") as f:
            class_belong.update(json.load(f))
    for conf in args.funcBelong:
        with open(conf, "r") as f:
            func_belong.update(json.load(f))
    # 先将所有文件合并保证lib可通过语法检查
    filenames = args.split

    # 创建一个临时文件来存储合并后的内容
    with tempfile.NamedTemporaryFile(mode='w+', delete=False) as gdl_merge_file:
        # 遍历文件名列表
        for filename in filenames:
            try:
                # 打开每个文件并读取内容
                with open(filename, 'r') as f:
                    # 将文件内容写入临时文件
                    gdl_merge_file.write(f.read() + "\n")
            except FileNotFoundError:
                print(f'File {filename} not found. Skipping.')
            except IOError as e:
                print(f'Error reading file {filename}. Reason: {e}')
    # 获取临时文件的名称
    merge_file_name = gdl_merge_file.name
    # 处理每个schema, impl
    with tempfile.NamedTemporaryFile(mode='w+', delete=False) as tmp:
        cmd = [str(args.godel), merge_file_name, "-l", tmp.name]
        cmd_run = run(cmd, 3600)
        cmd_run.subrun()
        lib_data = json.load(tmp)
        comment_data = commentExtract(merge_file_name)
        for impl_info in lib_data["impl"]:
            impl_name = impl_info["name"]
            # 掐头去尾方便合并
            impl_txt = get_lines_from_file(impl_info["location"]["filename"],
                                           impl_info["location"]["begin_line"] + 1,
                                           impl_info["location"]["end_line"] - 1)
            if impl_name not in impl:
                impl[impl_name] = impl_txt
            else:
                impl[impl_name] += "\n" + impl_txt
        for impl_name in impl.keys():
            impl[impl_name] = "impl " + impl_name + " {\n" + impl[impl_name] + "}"
        for schema_info in lib_data["schema"]:
            schema_name = schema_info["name"]
            schema_txt = get_lines_from_file(schema_info["location"]["filename"],
                                             schema_info["location"]["begin_line"],
                                             schema_info["location"]["end_line"])
            for comment in comment_data:
                if comment['endLine'] == schema_info["location"]["begin_line"] - 1:
                    schema_txt = comment['comment'] + "\n" + schema_txt
            schema[schema_name] = schema_txt
        # 外部方法处理
        for func in lib_data["funcs"]:
            # 外部方法标识
            if func["schema"] == "":
                func_name = func["name"]
                func_txt = get_lines_from_file(func["location"]["filename"],
                                               func["location"]["begin_line"],
                                               func["location"]["end_line"])
                for comment in comment_data:
                    if comment['endLine'] == func["location"]["begin_line"] - 1:
                        func_txt = comment['comment'] + "\n" + func_txt
                util[func_name] = func_txt
    for schema_name in schema.keys():
        if schema_name not in class_belong and not schema_name.endswith("DO"):
            logging.error("")
            continue
        # DO类存储到DOClass.gdl中
        if schema_name.endswith("DO"):
            with open(os.path.join(os.path.join(output_dir, "DOClass.gdl")), 'a') as f:
                # 将文件内容写入临时文件
                f.write(schema[schema_name] + "\n")
        else:
            with open(os.path.join(os.path.join(output_dir, class_belong[schema_name] + ".gdl")), 'a') as f:
                # 将文件内容写入临时文件
                f.write(schema[schema_name] + "\n")
                f.write(impl[schema_name] + "\n\n")
    with open(os.path.join(os.path.join(output_dir, "DOClass.gdl")), 'a') as f:
        f.write(get_database(merge_file_name) + "\n")
    for func_name in util.keys():
        if func_name in func_belong:
            with open(os.path.join(os.path.join(output_dir, func_belong[func_name] + ".gdl")), 'a') as f:
                f.write(util[func_name] + "\n")
        else:
            with open(os.path.join(os.path.join(output_dir, "util.gdl")), 'a') as f:
                f.write(util[func_name] + "\n")


if __name__ == "__main__":
    main()
