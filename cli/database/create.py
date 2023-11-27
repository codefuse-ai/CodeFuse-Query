import json
import re
import time
from pathlib import Path

from extractor.extractor import *


def conf_check(args):
    src_path = Path(args.source_root).expanduser().resolve()
    if not src_path.exists():
        logging.error("source not exist, Please redefine the directory or file by --source-root or -s")
        return False
    output_path = Path(args.output).expanduser().resolve()
    if not output_path.exists():
        logging.warning("%s not exists, it will be created", str(output_path))
        try:
            output_path.mkdir(parents=True)
            logging.info("%s success build", str(output_path))
        except Exception as e:
            logging.error("can not to create database directory %s: %s", str(output_path), e)
            return False
    if args.extraction_config_file:
        extraction_config_file_path = Path(args.output).expanduser().resolve()
        if not extraction_config_file_path.exists():
            logging.error("extraction_config_file: %s not exists, please redefine by --extraction-config-file",
                          args.extraction_config_file)
            return False
    return True


def memory_statistics():
    memory = psutil.virtual_memory()

    # 获取总内存大小（以字节为单位）
    total_memory = memory.total

    # 格式化内存大小
    size_units = ["B", "KB", "MB", "GB", "TB"]
    unit_index = 0
    while total_memory >= 1024 and unit_index < len(size_units) - 1:
        total_memory /= 1024
        unit_index += 1
    logging.info(f"current memory is : {total_memory:.2f} {size_units[unit_index]}")
    logging.info(f"final -Xmx is : {max(total_memory - 1, 6):.2f} {size_units[unit_index]}")


def conf_option_deal(args):
    options = dict()
    if args.extraction_config_file:
        try:
            with open(args.extraction_config_file, "r") as f:
                options = json.load(f)
        except Exception as e:
            logging.error(e)
            return -1
    for language in args.language:
        options[language] = dict()
    if args.extraction_config:
        # 要求option必须是a.b=c的形式，a为语言名，若不是报错
        pattern = r'^(.+)\.(.+)\=(.+)$'
        for tmp in args.extraction_config:
            match = re.match(pattern, tmp)
            if match:
                language = match.group(1)
                key = match.group(2)
                value = match.group(3)
                # 若option与需要抽取的语言对不上, 报错并返回配置错误
                if language not in args.language:
                    logging.error("option language error: %s does not need to be extracted", language)
                    return -1
                options[language][key] = value
            else:
                logging.error("option format error: %s, it need like java.a=b", tmp)
                return -1
    return options


def database_create(args):
    if not conf_check(args):
        logging.error("configuration error, Please check conf")
        raise ValueError("configuration error")
    options = conf_option_deal(args)
    if options == -1:
        logging.error("configuration error, Please check conf")
        raise ValueError("configuration error")
    memory_statistics()
    timeout = args.timeout
    extractor_fail = list()
    for language in args.language:
        output_path = Path(args.output).expanduser().resolve()
        src_path = Path(args.source_root).expanduser().resolve()
        now_output_path = output_path / ("coref_" + language + "_src.db")
        # 给用户反悔机会,若添加overwrite选项则直接覆盖存量数据
        if now_output_path.exists():
            logging.info(f"{now_output_path} will be create")
            if not args.overwrite:
                user_input = input(f"file {now_output_path} Already exists, do you want to overwrite it? (y/n): ")
                if user_input.lower() != "y":
                    logging.warning(" %s will use old version data", language)
                    continue
        start_time = time.time()
        return_code = extractor_run(language, src_path, output_path, timeout, options[language])
        if return_code == 0:
            logging.info("Finish extracting data source %s with %s language Extractor, extraction is Success, "
                         "execution time is %.2fs.", args.source_root, language, time.time() - start_time)
        else:
            extractor_fail.append(language)
            logging.error("%s extracting error with %s language Extractor, please check by log",
                          args.source_root, language)
        timeout = timeout - time.time() + start_time
        if timeout < 0:
            logging.error("extract fail: timeout")
            raise RuntimeError("timeout")
    if len(extractor_fail) > 0:
        for language in extractor_fail:
            logging.error("%s extract fail, please check log", language)
        logging.error("extract fail")
        raise RuntimeError("extract fail")
    else:
        logging.info("extract success")
    return
