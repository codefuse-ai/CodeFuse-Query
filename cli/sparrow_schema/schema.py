import logging
from pathlib import Path


class sparrow:
    home = ""
    godel_1_0 = ""
    godel_script = ""
    language = ""
    lib = ""
    lib_1_0 = ""
    lib_script = ""
    version = ""

    def __init__(self, sparrow_home):
        sparrow.home = Path(sparrow_home).expanduser().resolve()
        sparrow.godel_1_0 = sparrow.home/"godel-1.0"/"usr"/"bin"/"godel"
        sparrow.godel_script = sparrow.home/"godel-script"/"usr"/"bin"/"godel"
        sparrow.language = sparrow.home/"language"
        sparrow.lib = sparrow.home/"lib"
        sparrow.lib_1_0 = sparrow.home/"lib-1.0"
        sparrow.lib_script = sparrow.home/"lib-script"
        version_path = sparrow.home/"version.txt"
        if version_path.exists():
            try:
                with open(version_path, "r") as f:
                    content = f.read()
                    sparrow.version = content
            except PermissionError as pe:
                sparrow.version = "no version file found!"
                logging.warning(f"can not open version.txt: {str(pe)}")
            except Exception as e:
                sparrow.version = "no version file found!"
                logging.warning(f"can not get version: {str(e)}")
        else:
            sparrow.version = "no version file found!"
            logging.warning("no version file found!")
