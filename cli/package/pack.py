import zipfile
import package.manifest as manifest
import os
import logging
from pathlib import Path

def pack_to_zip():
    project = manifest.manifest_read()
    if not manifest.manifest_check(project):
        return
    if len(project["name"]) == 0:
        logging.error("Failed to pack, project name is empty.")
        return
    zipfile_name = project["name"] + ".zip"
    output = zipfile.ZipFile(zipfile_name, "w")
    for file in project["workspace"]:
        if os.path.isdir(file):
            for root, dirs, files in os.walk(file):
                for f in files:
                    logging.info("Pack " + os.path.join(root, f))
                    output.write(os.path.join(root, f))
        elif os.path.isfile(file):
            logging.info("Pack " + file)
            output.write(file)
    output.write("manifest.json")
    output.close()
    logging.info("Successfully generate " + zipfile_name)

def unpack_from_zip(zip_path):
    if not os.path.exists(zip_path):
        logging.error("Cannot find zip file \"" + zip_path + "\"")
        return
    name = Path(zip_path).stem
    logging.info("Extract " + zip_path + " to godel_modules/" + name)
    zipfile.ZipFile(zip_path).extractall("godel_modules/" + name)