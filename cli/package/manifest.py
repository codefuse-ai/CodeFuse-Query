import json
import os
import logging
from sparrow_schema.schema import *

# manifest.json format example:
# {
#   "name": "package_name",
#   "version": "package_version",
#   "compiler-version": "godel_compiler_version",
#   "workspace": [
#     "path/of/godel/file.gdl",
#     "path/of/godel/file.gdl"
#   ],
#   "dependency": {
#     "package_name": "version_number",
#     "package_name": "version_number",
#   }
# }

def manifest_create():
    if os.path.exists("manifest.json"):
        logging.error("manifest.json exists in this directory")
        return
    manifest = {}
    manifest["name"] = ""
    manifest["version"] = "0.0.1"
    manifest["compiler-version"] = ""
    manifest["workspace"] = []
    manifest["dependency"] = {}
    json.dump(manifest, open("manifest.json", "w"))
    logging.info("Successfully generate manifest.json")

def manifest_read():
    if not os.path.exists("manifest.json"):
        return
    return json.load(open("manifest.json"))

def manifest_check(manifest_object) -> bool:
    if type(manifest_object) != dict:
        logging.error("There is no manifest.json file in this directory")
        return False
    if not "name" in manifest_object:
        logging.error("There is no name field in the manifest.json file")
        return False
    if not "version" in manifest_object:
        logging.error("There is no version field in the manifest.json file")
        return False
    if not "compiler-version" in manifest_object:
        logging.error("There is no compiler-version field in the manifest.json file")
        return False
    if not "workspace" in manifest_object:
        logging.error("There is no workspace field in the manifest.json file")
        return False
    if not "dependency" in manifest_object:
        logging.error("There is no dependency field in the manifest.json file")
        return False
    return True
