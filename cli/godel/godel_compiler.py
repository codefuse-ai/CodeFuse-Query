import logging
import re
import chardet

from run.runner import Runner
from sparrow_schema.schema import sparrow


def get_encoding(file_path):
    with open(file_path, 'rb') as f:
        result = chardet.detect(f.read())
    return result['encoding']


def godel_version_judge(path) -> str:
    # 判断脚本对应的godel编译器版本
    result = "0.3"
    try:
        with open(path, "r", encoding=get_encoding(path)) as f:
            tmp = f.readline()
            if re.match(r'//[ \t]*script', tmp):
                result = "script"
    except Exception as e:
        logging.error(f"godel version judge error: {str(e)}")
    return result


def get_godel_compile(path):
    version = godel_version_judge(path)
    godel = ""
    if version == "0.3":
        godel = sparrow.godel_0_3
    elif version == "script":
        godel = sparrow.godel_script
    return godel


def backend_execute(path, database, output, timeout, output_format, verbose):
    godel = get_godel_compile(path)
    version = godel_version_judge(path)
    cmd = list()
    cmd += [str(godel), str(path), "--run-souffle-directly", "--package-path"]
    if version == "0.3":
        cmd += [str(sparrow.lib_03)]
    if database is not None:
        cmd += ["--souffle-fact-dir", database]
    cmd += ["--souffle-output-format", output_format, "--souffle-output-path", output]
    if verbose:
        cmd += ["--verbose"]
    tmp = Runner(cmd, timeout)
    return tmp.subrun()


def precompiled(path, timeout):
    cmd = [str(sparrow.godel_script), "-p", str(sparrow.lib_script), "--semantic-only", str(path)]
    tmp = Runner(cmd, timeout)
    status = tmp.subrun()
    if status != 0:
        return False
    return True


def execute(path, database, output, timeout, output_format, verbose):
    godel = get_godel_compile(path)
    version = godel_version_judge(path)
    cmd = list()
    if version == "script":
        # godel-script 直接执行
        cmd += [str(godel), "-p", str(sparrow.lib_script), "-f", database]
        cmd += ["-Of", "-r", str(path)]
        if output_format == "sqlite":
            cmd += ["--output-sqlite"]
        elif output_format == "csv":
            cmd += ["--output-csv"]
        else:
            cmd += ["--output-json"]
        cmd += [output]
        if verbose:
            cmd += ["--verbose"]
        tmp = Runner(cmd, timeout)
        return tmp.subrun()
    else:
        return backend_execute(path, database, output, timeout, output_format, verbose)
