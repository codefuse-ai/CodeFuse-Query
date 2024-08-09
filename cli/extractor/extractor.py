import logging

import psutil

from run.runner import Runner
from sparrow_schema.schema import sparrow


class Extractor:
    # 若添加抽取器，请命名为language_extractor,并完成language_extractor_cmd函数实现执行指令, 可被相应展示与执行
    cfamily_extractor = ""
    go_extractor = ""
    java_extractor = ""
    javascript_extractor = ""
    properties_extractor = ""
    python_extractor = ""
    sql_extractor = ""
    swift_extractor = ""
    xml_extractor = ""

    def __init__(self):
        Extractor.cfamily_extractor = sparrow.home / "language" / "cfamily" / "extractor" / "usr" / "bin" / "coref-cfamily-src-extractor"
        Extractor.go_extractor = sparrow.home / "language" / "go" / "extractor" / "coref-go-src-extractor"
        Extractor.java_extractor = sparrow.home / "language" / "java" / "extractor" / "coref-java-src-extractor_deploy.jar"
        Extractor.javascript_extractor = sparrow.home / "language" / "javascript" / "extractor" / "coref-javascript-src-extractor"
        Extractor.properties_extractor = sparrow.home / "language" / "properties" / "extractor" / "coref-properties-src-extractor_deploy.jar"
        Extractor.python_extractor = sparrow.home / "language" / "python" / "extractor" / "coref-python-src-extractor"
        Extractor.sql_extractor = sparrow.home / "language" / "sql" / "extractor" / "coref-sql-src-extractor_deploy.jar"
        Extractor.swift_extractor = sparrow.home / "language" / "swift" / "extractor" / "usr" / "bin" / "coref-swift-src-extractor"
        Extractor.xml_extractor = sparrow.home / "language" / "xml" / "extractor" / "coref-xml-extractor_deploy.jar"


def cfamily_extractor_cmd(source_root, database, options):
    return [
        str(Extractor.cfamily_extractor),
        f"--compile-commands={source_root}",
        f"--output-db-path={database}"
    ]


def go_extractor_cmd(source_root, database, options):
    cmd = list()
    cmd += [str(Extractor.go_extractor)]
    if options:
        for (key, value) in options.items():
            if key == "extract-config":
                for tmp in value.split(","):
                    cmd += ["-ex", tmp]
            elif key == "go-build-flag":
                for tmp in value.split(","):
                    cmd += [tmp]
            else:
                logging.warning("unsupported config name: %s for Go extractor.", key)
    cmd += ["-o", str(database/"coref_go_src.db")]
    cmd += [str(source_root)]
    return cmd


def java_extractor_cmd(source_root, database, options):
    cmd = list()
    cmd += jar_extractor_cmd(Extractor.java_extractor, source_root, database)
    if options:
        for (key, value) in options.items():
            if key == "white-list" or key == "whiteList":
                cmd += ["-w=", value]
            elif key == "cp":
                cmd += ["-cp=", value]
            elif key == "classpath":
                cmd += ["--classpath=", value]
            elif key == "incremental":
                if value == "true":
                    cmd += ["--incremental"]
                    cmd += ["--cache-dir=" + options.get("cache-dir", "null")]
                    cmd += ["--commit=" + options.get("commit", "null")]
                    cmd += ["--remote-cache-type=" + options.get("remote-cache-type", "null")]
                    cmd += ["--oss-bucket=" + options.get("oss-bucket", "null")]
                    cmd += ["--oss-config-file=" + options.get("oss-config-file", "null")]
                    cmd += ["--oss-path-prefix=" + options.get("oss-path-prefix", "null")]
                else:
                    logging.warning("java.incremental does not take effect, please use java.incremental=true")
            else:
                if key != "cache-dir" and key != "commit" and key != "remote-cache-type" and \
                        key != "oss-bucket" and key != "oss-config-file" and key != "oss-path-prefix":
                    logging.warning("unsupported config name:%s for java extractor.", key)
    if "incremental" not in options or options["incremental"] != "true":
        cmd += ["--parallel"]
    return cmd


def javascript_extractor_cmd(source_root, database, options):
    cmd = list()
    cmd += [str(Extractor.javascript_extractor), "extract"] + \
           ["--src", str(source_root)] + \
           ["--db", str(database/"coref_javascript_src.db")]
    if options:
        for (key, value) in options.items():
            if key == "black-list" or key == "blacklist":
                cmd += ["--blacklist"]
                for tmp in value.split(','):
                    cmd += [tmp]
            elif key == "use-gitignore":
                if value == "true":
                    cmd += ["--use-gitignore"]
                else:
                    logging.warning("javascript.use-gitignore does not take effect, please use "
                                    "javascript.use-gitignore=true")
            elif key == "extract-dist":
                if value == "true":
                    cmd += ["--extract-dist"]
                else:
                    logging.warning("javascript.extract-dist does not take effect, please use "
                                    "javascript.extract-dist=true")
            elif key == "extract-deps":
                if value == "true":
                    cmd += ["--extract-deps"]
                else:
                    logging.warning("javascript.extract-deps does not take effect, please use "
                                    "javascript.extract-deps=true")
            elif key == "file-size-limit":
                cmd += ["--file-size-limit", value]
            else:
                logging.warning("unsupported config name:%s for javascript extractor.", key)
    return cmd


def properties_extractor_cmd(source_root, database, options):
    cmd = jar_extractor_cmd(Extractor.properties_extractor, source_root, database)
    return cmd


def python_extractor_cmd(source_root, database, options):
    cmd = list()
    cmd += [str(Extractor.python_extractor), "-s", str(source_root), "-d", str(database)]
    return cmd


def sql_extractor_cmd(source_root, database, options):
    cmd = list()
    cmd += jar_extractor_cmd(Extractor.sql_extractor, source_root, database)
    if "sql-dialect-type" in options:
        cmd += ["--sql-dialect-type", options["sql-dialect-type"]]
    return cmd


def swift_extractor(source_root, database, options):
    cmd = list()
    cmd += [str(Extractor.swift_extractor), str(source_root), str(database)]
    if options:
        for (key, value) in options.items():
            if key == "corpus":
                for tmp in value.split(","):
                    cmd += ["--corpus", tmp]
            else:
                logging.warning("unsupported config name:%s for Swift extractor.", key)
    return cmd


def xml_extractor_cmd(source_root, database, options):
    cmd = jar_extractor_cmd(Extractor.xml_extractor, source_root, database)
    return cmd


def jar_extractor_cmd(extractor_path, source_root, database):
    # 获取内存信息
    mem = psutil.virtual_memory()
    total_memory = mem.total
    pod_memory_limit = get_pod_memory_limit()
    if pod_memory_limit != 0:
        total_memory = pod_memory_limit
    total_memory_gb = round(total_memory / (1024 ** 3))
    logging.info("current memory is : %s GB", total_memory_gb)
    xmx = max(total_memory_gb - 1, 6)
    logging.info("final -Xmx is: %s GB", xmx)
    cmd = list()
    cmd += ["java", "-jar", "-Xmx" + str(xmx) + "g", str(extractor_path)]
    cmd += [str(source_root), str(database)]
    return cmd


def extractor_run(language, source_root, database, timeout, options):
    function_name = language + "_extractor_cmd"
    if function_name in globals():
        # 通过语言名确定函数名并直接调用对应抽取器执行函数，获取执行指令
        function = globals()[function_name]
        cmd = function(source_root, database, options)
        if cmd == -1:
            logging.error("option error")
            logging.error("Failed to obtain the %s extractor", language)
            return -1
        tmp = Runner(cmd, timeout)
        return tmp.subrun()
    else:
        logging.error("Not supported language: %s", language)
        return -1


def get_pod_memory_limit():
    # cgroup 文件系统路径
    memory_limit_path = "/sys/fs/cgroup/memory/memory.limit_in_bytes"
    memory_limit = 0
    try:
        with open(memory_limit_path, 'r') as f:
            memory_limit = int(f.read().strip())
    except FileNotFoundError:
        pass
    except PermissionError:
        logging.error("Permission denied when accessing cgroup files.")
    except IOError as e:
        logging.error(f"IO error occurred when accessing cgroup files: {e}")
    except Exception as e:
        logging.error(f"An unexpected error occurred: {e}")
    return memory_limit



