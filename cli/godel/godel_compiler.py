import logging
import tempfile
import time
from pathlib import Path

from run.runner import Runner
from sparrow_schema.schema import sparrow


def godel_version_judge(path) -> str:
    # 判断脚本对应的godel编译器版本
    result = "script"
    try:
        with open(path, "r") as f:
            tmp = f.readline()
            if "1.0" in tmp:
                result = "1.0"
    except Exception as e:
        logging.error(f"godel version judge error: {str(e)}")
    return result


def get_godel_compile(path):
    version = godel_version_judge(path)
    godel = ""
    if version == "1.0":
        godel = sparrow.godel_1_0
    elif version == "script":
        godel = sparrow.godel_script
    return godel


def backend_execute(path, database, output, timeout, output_format, verbose):
    godel = get_godel_compile(path)
    version = godel_version_judge(path)
    cmd = list()
    cmd += [str(godel), str(path), "--run-souffle-directly", "--package-path"]
    cmd += [str(sparrow.lib_1_0)]
    if database is not None:
        cmd += ["--souffle-fact-dir", database]
    cmd += ["--souffle-output-format", output_format, "--souffle-output-path", output]
    if verbose:
        cmd += ["--verbose"]
    tmp = Runner(cmd, timeout)
    return tmp.subrun()


def execute(path, database, output, timeout, output_format, verbose):
    godel = get_godel_compile(path)
    version = godel_version_judge(path)
    cmd = list()
    if version == "script":
        # godel-script两步编译，实际执行后端为1.0
        with tempfile.NamedTemporaryFile(suffix='.gdl') as temp_file:
            cmd += [str(godel), str(path), "-p", str(sparrow.lib_1_0), "-o", temp_file.name]
            if verbose:
                cmd += ["--verbose"]
            tmp = Runner(cmd, timeout)
            start_time = time.time()
            return_code = tmp.subrun()
            if return_code != 0:
                logging.error("%s compile error, please check it yourself", str(path))
                return -1
            logging.info("godel-script compile time: %.2fs", time.time() - start_time)
            return backend_execute(Path(temp_file.name), database, output, timeout, output_format, verbose)
    else:
        return backend_execute(path, database, output, timeout, output_format, verbose)
