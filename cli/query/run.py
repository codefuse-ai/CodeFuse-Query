import json
import logging
import os.path
import re
import shutil
import sqlite3
import tempfile
import time
from pathlib import Path

from run.runner import Runner
from sparrow_schema.schema import sparrow
from godel.godel_compiler import execute, precompiled


def get_files(target_path, suffix) -> list:
    path = Path(target_path).expanduser().resolve()
    if not path.exists():
        logging.error("file or dir not exist %s", path)
        return []
    result = []
    if path.is_dir():
        for file in path.rglob(f"*{suffix}"):
            result.append(file)
    elif path.is_file() and path.suffix == suffix:
        result.append(path)
    return result


# 结果是否为空判断
def check_is_empty_query_result(output_path, output_format):
    query_result = "EMPTY"
    if output_format == "sqlite":
        query_result = "NOT-EMPTY"
        # # 连接到 SQLite 数据库
        # conn = sqlite3.connect(output_path)
        # cursor = conn.cursor()
        # # 构建 SQL 查询语句
        # try:
        #     # 执行查询
        #     query = "SELECT name FROM sqlite_master WHERE type='table'"
        #     cursor.execute(query)
        #     tables = cursor.fetchall()
        #     cursor.execute(query)
        #     for table_name in tables:
        #         query = f"SELECT COUNT(*) FROM  \"{table_name}\""
        #         cursor.execute(query)
        #         result = cursor.fetchone()
        #         row_count = result[0] if result else 0
        #
        #         # 返回是否为空的布尔值
        #         if row_count != 0:
        #             query_result = "NOT-EMPTY"
        # except sqlite3.Error as e:
        #     print(f"An error occurred: {e}")
        #     return False  # 如果表不存在，也可以返回 False 或处理异常
        # finally:
        #     # 关闭连接
        #     cursor.close()
        #     conn.close()
    else:
        try:
            with open(output_path, "r") as f:
                content = f.read()
                if output_format == "json":
                    if not content.startswith("[]"):
                        query_result = "NOT-EMPTY"
                elif output_format == "csv":
                    if content is not None:
                        query_result = "NOT-EMPTY"
        except FileNotFoundError:
            logging.warning("%s not exist, Please check the script to see if there is output", output_path)
        except PermissionError as pe:
            logging.warning(f"can not open output file: {str(pe)}")
        except Exception as e:
            logging.warning(f"can not get output: {str(e)}")
    return query_result


def conf_check(args):
    for godel_dir in args.godel_dir:
        path = Path(godel_dir).expanduser().resolve()
        if not path.exists():
            logging.error("conf error: godel file or dir %s not exist, "
                          "Please redefine the directory or file by --gdl or -gdl", str(path))
            return False
    output_path = Path(args.output).expanduser().resolve()
    if not output_path.exists():
        logging.warning("%s not exists, it will be created", str(output_path))
        try:
            output_path.mkdir(parents=True)
            logging.info("%s success build", str(output_path))
        except Exception as e:
            logging.error("can not to create output directory %s: %s", str(output_path), e)
            return False
    if not output_path.is_dir():
        logging.error("conf error: output need to be dir,"
                      "Please redefine the directory by --output or -o")
        return False
    if args.database:
        database_path = Path(args.database).expanduser().resolve()
        if not database_path.exists():
            logging.error("conf error: database does not exist, "
                          "Please redefine the database by --database or -d")
            return False
        if not database_path.is_dir():
            logging.error("conf error: need to be dir, "
                          "Please redefine the database by --database or -d")
            return False
        db_exist = False
        for file in database_path.iterdir():
            if file.suffix == ".db":
                db_exist = True
            else:
                continue
            file_size = file.stat().st_size
            # 格式化文件大小
            size_units = ["B", "KB", "MB", "GB", "TB"]
            unit_index = 0
            while file_size >= 1024 and unit_index < len(size_units) - 1:
                file_size /= 1024
                unit_index += 1
            logging.info(f"database {file} size: {file_size:.2f} {size_units[unit_index]}")
        if not db_exist:
            logging.error("conf error: There is no data in the specified database directory")
            return False
    else:
        logging.warning("conf warning: There is no database, please make sure that this"
                        " gdl script can be executed without a database")
    return True


def get_lines_from_file(file_name, start_line, end_line):
    content = ""
    with open(file_name, 'r') as file:
        for line_num, line in enumerate(file, start=1):
            if start_line <= line_num <= end_line:
                content += line
            elif line_num > end_line:
                break
    return content


def compare_strings_ignore_whitespace(str1, str2):
    # 移除空格、制表符和换行符
    pattern = r'\s+'
    str1_clean = re.sub(pattern, '', str1)
    str2_clean = re.sub(pattern, '', str2)

    # 进行比较
    return str1_clean == str2_clean


# 多脚本合并执行
def merge_execute(args, gdl_list, timeout):
    start_time = time.time()
    # 各个脚本预编译
    for gdl in gdl_list:
        if not precompiled(gdl, timeout - (time.time() - start_time)):
            raise ValueError("precompiled error, Please check the script to determine syntax correctness and whether "
                             "it is a godel-script script")
    # 脚本合并, 头文件和输出合并,重名函数,重名类仅会保留一份，若类接口函数不一致也仅会保留一份。不一致部分去除
    func_name = dict()
    schema = dict()
    import_set = set()
    output = set()
    out_map = dict()
    with tempfile.NamedTemporaryFile(suffix='.gdl', mode="w+") as merge_file:
        merge_file.writelines("// script\n")
        merge_file_content = ""
        for gdl in gdl_list:
            with open(str(gdl), "r") as f:
                pattern = r'use coref::(\w+)::\*'
                for line in f:
                    if re.search(pattern, line):
                        if line not in import_set:
                            import_set.add(line)
            with tempfile.NamedTemporaryFile(suffix='.json', mode="w+") as tmp_loc:
                cmd = [str(sparrow.godel_script), str(gdl), "-l", str(tmp_loc.name)]
                tmp = Runner(cmd, timeout - (time.time() - start_time))
                status = tmp.subrun()
                if status != 0:
                    raise ValueError(gdl + " loc get error")
                with open(str(tmp_loc.name), "r") as f:
                    loc_data = json.load(f)
                for tmp in loc_data["schema"]:
                    schema_name = tmp["name"]
                    content = get_lines_from_file(gdl, tmp["location"]["begin_line"],
                                                  tmp["location"]["end_line"]) + "\n"
                    if schema_name not in schema:
                        schema[schema_name] = content
                        merge_file_content += content
                    else:
                        if not compare_strings_ignore_whitespace(content, schema[schema_name]):
                            logging.error("%s schema have different behaviors, please modify each function with the "
                                          "same name yourself.", schema_name)
                            raise ValueError("merge error: same schema")
                for tmp in loc_data["funcs"]:
                    if tmp["name"] == "main":
                        output_pattern = r'output\((\w+)\(\)\)'
                        main_content = get_lines_from_file(gdl, tmp["location"]["begin_line"],
                                                           tmp["location"]["end_line"])
                        # 在 main 中查找 output(...)
                        output_matches = re.findall(output_pattern, main_content)
                        out_map[str(gdl)] = output_matches
                        for out in output_matches:
                            if out not in output:
                                output.add(out)
                        continue
                    hash_name = tmp["name"] + "#" + tmp["schema"]
                    content = get_lines_from_file(gdl, tmp["location"]["begin_line"], tmp["location"]["end_line"])
                    if hash_name not in func_name:
                        func_name[hash_name] = content
                        if tmp["schema"] != "":
                            content = "impl " + tmp["schema"] + " {\n" + content + "\n}\n"
                        merge_file_content += content
                    else:
                        if not compare_strings_ignore_whitespace(content, func_name[hash_name]):
                            logging.error("%s function have different behaviors, please modify each function with the "
                                          "same name yourself.", tmp["name"])
                            raise ValueError("merge error: same function")
        # 头文件合并
        for tmp in import_set:
            merge_file_content = tmp + "\n" + merge_file_content
        # 输出合并
        merge_file_content += "\nfn main() {\n"
        for tmp in output:
            merge_file_content += "    output(" + tmp + "())\n"
        merge_file_content += "}\n"
        merge_file.write(merge_file_content)
        merge_file.seek(0)
        # 执行
        with tempfile.NamedTemporaryFile(suffix='.json', mode="w+") as output_file:
            output = str(output_file.name)
            if args.database:
                database = str(Path(args.database).expanduser().resolve())
                return_code = execute(merge_file.name, database, output, args.timeout - (time.time() - start_time),
                                      args.format, args.verbose)
            else:
                return_code = execute(merge_file.name, None, output, args.timeout - (time.time() - start_time),
                                      args.format, args.verbose)
            if return_code == 0:
                query_result = check_is_empty_query_result(output, args.format)
                logging.info("Task %s is %s, result is %s, execution time is %.2fs.",
                             "merge", "success", query_result, time.time() - start_time)
            else:
                logging.error("Task %s is %s, result is %s, execution time is %.2fs.",
                              "merge", "fail", "null", time.time() - start_time)
                logging.error("%s execute error, please check by log", str(merge_file))
            if return_code == 0:
                logging.info("run success")
            else:
                logging.error("run fail, There are scripts that cannot be executed among the scripts that need to be "
                              "executed. Please locate them based on the logs.")
                raise RuntimeError("run fail")
            # 输出处理: 根据各个文件的output进行分割,若后续添加注解进行输出此步骤需要修改。
            output_json = json.load(output_file)
            if isinstance(output_json, list):
                # 说明此时单文件单输出,gdl_list中只有一个文件
                for gdl in gdl_list:
                    if len(out_map[str(gdl)]) != 0:
                        output = str(Path(args.output).expanduser().resolve() / (gdl.stem + "." + args.format))
                        shutil.copy2(output_file.name, output)
            else:
                # 单文件多输出或者多文件多输出:
                for gdl in gdl_list:
                    if len(out_map[str(gdl)]) != 0:
                        output = str(Path(args.output).expanduser().resolve() / (gdl.stem + "." + args.format))
                        with open(output, "w") as f:
                            if len(out_map[str(gdl)]) == 1:
                                content = output_json[out_map[str(gdl)][0]]
                            else:
                                content = dict()
                                for tmp in out_map[str(gdl)]:
                                    content[tmp] = output_json[tmp]
                            f.write(json.dumps(content, indent=4))


def json_to_sarif(sarif_data, json_data):
    rules_dict = dict()
    for bug in json_data:
        # ruleName
        if "ruleName" in bug:
            rule_id = bug.get("ruleName")
        else:
            return False
        # filePath
        if "filePath" in bug:
            file_path = bug.get("filePath")
        else:
            return False
        # startLine
        if "startLine" in bug:
            start_line = bug.get("startLine")
        else:
            return False
        # ruleDescription
        if "ruleDescription" in bug:
            rule_description = bug.get("ruleDescription")
        else:
            return False
        # bug message
        if "message" in bug:
            message = bug.get("message")
        else:
            message = rule_description
        level = "error"
        if "level" in bug:
            level = bug.get("level").lower()
        if rule_id not in rules_dict:
            rule_index = len(rules_dict)
            rules_dict[rule_id] = rule_index
            res = {
                "id": rule_id,
                "name": rule_id,
                "shortDescription": {
                    "text": rule_description
                },
                "fullDescription": {
                    "text": rule_description
                },
                "defaultConfiguration": {
                    "level": level
                }
            }
            sarif_data["runs"][0]["tool"]["driver"]["rules"].append(res)
        else:
            rule_index = rules_dict[rule_id]
        thread_flow_locations = []
        thread_flow_locations.append({
            "location": {
                "physicalLocation": {
                    "artifactLocation": {
                        "uri": file_path
                    },
                    "region": {
                        "startLine": start_line,
                        "endLine": start_line,
                        "snippet": {
                            "text": ""
                        }
                    },
                    "contextRegion": {
                        "startLine": start_line,
                        "endLine": start_line,
                        "snippet": {
                            "text": ""
                        }
                    }
                },
                "message": {
                    "text": message
                }
            }
        })
        sarif_data["runs"][0]["results"].append({
            "ruleId": rule_id,
            "ruleIndex": rule_index,
            "level": "error" if bug.get("Importance", "").lower() == "high" else "warning",
            "message": {
                "text": message
            },
            "locations": [
                {
                    "physicalLocation": {
                        "artifactLocation": {
                            "uri": thread_flow_locations[0]["location"]["physicalLocation"]["artifactLocation"][
                                "uri"]
                        },
                        "region": {
                            "startLine": thread_flow_locations[0]["location"]["physicalLocation"]["region"][
                                "startLine"],
                            "endLine": thread_flow_locations[0]["location"]["physicalLocation"]["region"][
                                "startLine"],
                            "snippet": {
                                "text": ""
                            }
                        },
                        "contextRegion": {
                            "startLine": thread_flow_locations[0]["location"]["physicalLocation"]["region"][
                                "startLine"],
                            "endLine": thread_flow_locations[0]["location"]["physicalLocation"]["region"][
                                "startLine"],
                            "snippet": {
                                "text": ""
                            }
                        }
                    },
                    "message": {
                        "text": message
                    },
                }
            ],
            "codeFlows": [
                {
                    "threadFlows": [
                        {
                            "locations": thread_flow_locations
                        }
                    ]
                }
            ]
        })
    return True


def output_to_sarif(args):
    # 脚本收集
    godel_path_list = list()
    for godel_dir in args.godel_dir:
        godel_path_list += get_files(godel_dir, ".gdl")
        godel_path_list += get_files(godel_dir, ".gs")
    sarif_data = {
        "version": "2.1.0",
        "$schema": "https://schemastore.azurewebsites.net/schemas/json/sarif-2.1.0.json",
        "runs": [
            {
                "tool": {
                    "driver": {
                        "name": "Custom Tool",
                        "informationUri": "https://example.com",
                        "rules": []
                    }
                },
                "results": []
            }
        ]
    }
    # 获取脚本对应的结果并写入sarif报告中
    for godel_query_script in godel_path_list:
        output = str(Path(args.output).expanduser().resolve() / (godel_query_script.stem + "." + args.format))
        if not os.path.exists(output):
            logging.warning("%s does not exist, it seems that there is a problem with the %s, please check the script",
                            output, str(godel_query_script))
            continue
        with open(output, "r") as f:
            output_json = json.load(f)
        # 脚本单输出直接转
        if isinstance(output_json, list):
            status = json_to_sarif(sarif_data, output_json)
            if not status:
                logging.warning("The output of %s needs to include filePath, startLine, ruleName，ruleDescription. it "
                                "can not trans to sarif", godel_query_script)
            else:
                logging.info("%s trans to sarif success", godel_query_script)
        # 脚本多输出分别转过去
        else:
            trans = True
            for key, value in output_json.items():
                status = json_to_sarif(sarif_data, value)
                if not status:
                    logging.warning("The output of %s %s needs to include filePath, startLine, "
                                    "ruleName，ruleDescription. it can not trans to sarif", godel_query_script, key)
                    trans = False
            if trans:
                logging.info("%s trans to sarif success", godel_query_script)

    output = str(Path(args.output).expanduser().resolve() / ("sparrow-cli-report.sarif"))
    with open(output, "w") as f:
        f.write(json.dumps(sarif_data, indent=4))


def query_run(args):
    # conf 检查
    if not conf_check(args):
        logging.error("configuration error, Please check conf")
        raise ValueError("configuration error")
    # 脚本收集
    godel_path_list = list()
    for godel_dir in args.godel_dir:
        godel_path_list += get_files(godel_dir, ".gdl")
        godel_path_list += get_files(godel_dir, ".gs")
    if not godel_path_list:
        logging.error("There is no godel script(ends with .gs or .gdl) in the specified directory,"
                      "Please redefine the directory or file by --gdl or -gdl")
        raise ValueError("path lib error")

    # 不同执行选项:
    if args.merge:
        logging.warning("When merging execution, please make sure that single reservation of functions or classes "
                        "with the same name will not affect the execution results.")
        merge_execute(args, godel_path_list, args.timeout)
        if args.sarif:
            output_to_sarif(args)
        return
    status = 1
    # 目前先各自执行:
    start_time = time.time()
    for godel_query_script in godel_path_list:
        output = str(Path(args.output).expanduser().resolve() / (godel_query_script.stem + "." + args.format))
        if args.database:
            database = str(Path(args.database).expanduser().resolve())
            return_code = execute(godel_query_script, database, output, args.timeout - (time.time() - start_time),
                                  args.format, args.verbose)
        else:
            return_code = execute(godel_query_script, None, output, args.timeout - (time.time() - start_time),
                                  args.format, args.verbose)
        if return_code == 0:
            query_result = check_is_empty_query_result(output, args.format)
            logging.info("Task %s is %s, result is %s, execution time is %.2fs.",
                         str(godel_query_script), "success", query_result, time.time() - start_time)
        else:
            status = 0
            logging.error("Task %s is %s, result is %s, execution time is %.2fs.",
                          str(godel_query_script), "fail", "null", time.time() - start_time)
            logging.error("%s execute error, please check by log", str(godel_query_script))
    if args.sarif:
        output_to_sarif(args)
    if status == 1:
        logging.info("run success")
    else:
        logging.error("run fail, There are scripts that cannot be executed among the scripts that need to be "
                      "executed. Please locate them based on the logs.")
        raise RuntimeError("run fail")
    return
