#!/usr/bin/env python

import argparse
import os
import sys
import logging
import json
import functools

def is_module_file(filepath: str):
    assert filepath is not None
    assert os.path.exists(filepath)
    assert os.path.isfile(filepath)
    basename = os.path.basename(filepath)
    if basename.startswith("@") and (basename.endswith(".d.ts") or basename.endswith(".d.ets")):
        return True
    return False

def list_module_file_in_sdk(sdk):
    filepaths = []
    for sdkpath in sdk:
        if not os.path.exists(sdkpath):
            logging.error("sdk path does not exists, path: %s" % sdk)
            sys.exit(-1)
        if os.path.isfile(sdkpath):
            if is_module_file(sdkpath):
                filepaths.append(sdkpath)
        elif os.path.isdir(sdkpath):
            for dirpath, dirnames, filenames in os.walk(sdkpath):
                for filename in filenames:
                    filepath = os.path.join(dirpath, filename)
                    if is_module_file(filepath):
                        filepaths.append(filepath)
    return filepaths

def replace_filepaths(filepaths, replace):
    if replace is None:
        return filepaths
    assert filepaths is not None
    (from_path, to_path) = replace
    assert from_path is not None
    assert to_path is not None
    if not (from_path.startswith("/") and to_path.startswith("/")):
        logging.error("From path and to path in replace must start from '/', from path: %s,\
                      to path: %s" % (from_path, to_path))
        sys.exit(-1)
    if from_path.endswith("/"):
        from_path = from_path[0, -1]
    if end_path.endswith("/"):
        end_path = end_path[0, -1]
    nw_filepaths = []
    for file in filepaths:
        nw_filepaths.append(file.replace(from_path, to_path))
    return nw_filepaths

def sort_module_paths(path1, path2):
    def string_compare(str1, str2):
        if str1 == str2:
            return 0
        if str1 > str2:
            return 1
        else:
            return -1
    if path1 == path2:
        return 0
    # both in /ets/ directory
    if "/ets/" in path1 and "/ets/" in path2:
        return string_compare(path1, path2)
    # neither in /ets/ directory
    elif "/ets/" not in path1 and "/ets/" not in path2:
        return string_compare(path1, path2)
    # one of them in /ets/ directory
    if "/ets/" in path1:
        return -1
    else:
        return 1

def generate_paths(filepaths, paths):
    assert filepaths is not None
    if os.path.exists(paths):
        if os.path.isdir(paths):
            logging.error("paths exists and it's a directory, path: %s" % paths)
            sys.exit(-1)
        if os.path.isfile(paths):
            logging.warning("paths will be overrided, path: %s" % paths)
    paths_obj = {}
    for filepath in filepaths:
        basename = os.path.basename(filepath)
        if basename.endswith(".d.ts"):
            module_name = basename[:-5]
        elif basename.endswith(".d.ets"):
            module_name = basename[:-6]
        else:
            continue

        if module_name in paths_obj:
            paths_obj[module_name].append(filepath)
        else:
            paths_obj[module_name] = [filepath]
    for module_name in paths_obj:
        paths_obj[module_name].sort(key=functools.cmp_to_key (sort_module_paths))
    with open(paths, "w") as f:
        json.dump(paths_obj, f, indent=4)
    return paths_obj

def parse_args():
    parser = argparse.ArgumentParser(description="generate-paths",
                                     formatter_class=argparse.RawTextHelpFormatter)
    parser.add_argument("--sdk", dest="sdk", nargs="+", type=str, required=True, help="The file path of harmony sdk directory.")
    parser.add_argument("--paths", dest="paths", type=str, default="paths.json", help="The file path of generated paths file.")
    parser.add_argument("--replace", nargs=2, metavar=('from_path', 'to_path'), help="Replace file path from from_path to to_path.")
    return parser.parse_args()

def main():
    args = parse_args()
    sdk = args.sdk
    paths = args.paths
    replace = args.replace
    filepaths = list_module_file_in_sdk(sdk)
    filepaths = replace_filepaths(filepaths, replace)
    generate_paths(filepaths, paths)

if __name__ == '__main__':
    main()
