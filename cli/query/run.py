import logging
import time
from pathlib import Path

from godel.godel_compiler import execute


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
        logging.error("conf error: output directory %s does not exist, "
                      "Please redefine the directory or file by --output or -o", str(output_path))
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
    status = 1
    # 目前先各自执行:
    start_time = time.time()
    for godel_query_script in godel_path_list:
        output = str(Path(args.output).expanduser().resolve()/(godel_query_script.stem + "." + args.format))
        if args.database:
            database = str(Path(args.database).expanduser().resolve())
            return_code = execute(godel_query_script, database, output, args.timeout - (time.time() - start_time),
                                  args.format, args.verbose)
        else:
            return_code = execute(godel_query_script, None, output, args.timeout - (time.time() - start_time),
                                  args.format, args.verbose)
        if return_code == 0:
            query_result = check_is_empty_query_result(output, args.format)
            logging.info("Task %s is %s, result is %s, execution time is  %.2fs.",
                         str(godel_query_script), "success", query_result, time.time() - start_time)
        else:
            status = 0
            logging.error("Task %s is %s, result is %s, execution time is  %.2fs.",
                          str(godel_query_script), "fail", "null", time.time() - start_time)
            logging.error("%s execute error, please check by log", str(godel_query_script))
    if status == 1:
        logging.info("run success")
    else:
        logging.error("run fail, please check by log")
        raise RuntimeError("run fail")
    return
