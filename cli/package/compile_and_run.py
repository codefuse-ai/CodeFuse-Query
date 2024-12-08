import os
import subprocess

from query.run import get_files
from sparrow_schema.schema import *


def compile_query_and_get_reference(compiler, library_directory, query, output_directory):
    logging.info("Compile " + str(query) + " to " + output_directory + "/out.gdl")
    arg = [
        compiler, "-p", library_directory,
        str(query), "-u", "-o", output_directory + "/out.gdl"
    ]
    result = subprocess.run(arg, stdout=subprocess.PIPE)

    if result.returncode != 0:
        logging.error("Compile " + str(query) + " failed")
        return

    reference = result.stdout.decode()
    reference = reference.split("\n")
    reference.pop()
    return reference


def create_compiled_library_directory(directory_path) -> bool:
    if not os.path.exists(directory_path):
        os.mkdir(directory_path)
        return True
    if not os.path.isdir(directory_path):
        logging.error("\"" + directory_path + "\" is not a directory, failed to create")
        return False
    return True


def compile_referenced_library_files(compiler_path, library_directory, reference_list, output_directory):
    compile_fail_count = 0
    for reference in reference_list:
        # module name is the first word of the line
        module_name = reference[:reference.find(" ")]
        # library file path is after the space
        library_file_path = reference[reference.find(" ") + 1:]
        # output path is the module name with "::" replaced by "."
        output_path = output_directory + "/lib/"
        output_path += module_name.replace("::", ".") + ".gdl"
        # compile the library file to the output path
        result = subprocess.run([
            compiler_path, "-p", library_directory, library_file_path, "-o", output_path
        ])
        # check if compilation failed
        if result.returncode != 0:
            compile_fail_count += 1
            logging.error("Failed to compile " + output_path)
        else:
            logging.info("Compile " + library_file_path + " to " + output_path)

    if compile_fail_count != 0:
        return False
    return True


def compile_and_run(compiler_path,
                    library_path,
                    query_file,
                    executable_path,
                    database_path="",
                    verbose_mode=False):
    output_directory = "out"
    output_file = output_directory + "/" + query_file.stem + ".json"
    logging.info("Start executing " + str(query_file))
    if not create_compiled_library_directory(output_directory):
        return
    if not create_compiled_library_directory(output_directory + "/lib"):
        return
    reference_list = compile_query_and_get_reference(
        compiler_path,
        library_path,
        query_file,
        output_directory
    )
    if type(reference_list) != list:
        return
    if not compile_referenced_library_files(
            compiler_path,
            library_path,
            reference_list,
            output_directory
    ):
        return
    args = [
        executable_path,
        output_directory + "/out.gdl",
        "--package-path",
        output_directory + "/lib",
        "--run-souffle-directly",
        "--souffle-output-format",
        "json",
        "--souffle-output-path",
        output_file
    ]
    if type(database_path) == str and len(database_path) > 0:
        args.append("--souffle-fact-dir")
        args.append(database_path)
    if verbose_mode:
        args.append("--verbose")
    result = subprocess.run(args)
    logging.info("Excution exited with code " + str(result.returncode) + ". Check result in " + output_file)


def package_run(args):
    verbose_flag = args.verbose
    database_path = args.database
    godel_path_list = []
    for godel_dir in args.godel_dir:
        godel_path_list += get_files(godel_dir, ".gdl")
        godel_path_list += get_files(godel_dir, ".gs")
    if not godel_path_list:
        logging.error("There is no godel script(ends with .gs or .gdl) in the specified directory,"
                      "Please redefine the directory or file by --gdl or -gdl")
        raise ValueError("path lib error")
    if not os.path.exists("./godel_modules"):
        logging.error("Expect godel_modules directory here, "
                      "use package create --install to install packages into godel_modules")
        return
    for godel_path in godel_path_list:
        compile_and_run(
            sparrow.godel_script,
            "./godel_modules",
            godel_path,
            sparrow.godel_1_0,
            database_path,
            verbose_flag
        )
    return
