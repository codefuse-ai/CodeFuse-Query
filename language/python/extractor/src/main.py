import argparse
import ast
import hashlib
import logging
import multiprocessing
import os.path
import sys
import time

from core.extractor import Extractor
from core.idgenerator import get_oid, calculate_file_cache
from core.storage import Storage
from model.file import File


class ProgressBarPainter(object):
    TypeOriginal = 1
    TypeScaleInLine = 2

    def __init__(self):
        self.DefaultType = ProgressBarPainter.TypeScaleInLine
        self.CurrentProgress = 0.0
        self.TerminatorSize = 60

        self.ProgressBarChar = "*"
        self.ScaleBarChar = "-"
        self.ScaleBarEndChar = None
        self.Paint50 = True
        self.Paint25And75 = True

    def set_progress_type(self, _type):
        """Only support TypeOriginal and TypeScaleInLine mode."""
        self.DefaultType = _type

    def paint_progress_bar_scale(self, width):
        def get_two_char_with_bar_columns(subwidth):
            partition = int(subwidth / 2)
            column_left = partition - 1
            column_right = subwidth - partition - 1
            return column_left, column_right

        def paint_progress_bar_scale_two_char_with_bar(
            column_left, column_right, chars
        ):
            paint(self.ScaleBarChar * column_left)
            paint(chars)
            paint(self.ScaleBarChar * column_right)

        paint = sys.stdout.write
        flush = sys.stdout.flush
        # Paint
        if self.ScaleBarEndChar is None:
            paint("0")
            paint(self.ScaleBarChar)
        else:
            paint(self.ScaleBarEndChar)
            paint("0")
        column_0_100 = width - 6
        if self.Paint50 and column_0_100 >= 4:  # Paint 50
            column_0_50, column_50_100 = get_two_char_with_bar_columns(column_0_100)
            if self.Paint25And75 and column_0_50 >= 4 and column_50_100 >= 4:
                paint_progress_bar_scale_two_char_with_bar(
                    *get_two_char_with_bar_columns(column_0_50), "25"
                )
                if self.Paint50:
                    paint("50")
                else:
                    paint(self.ScaleBarChar * 2)
                paint_progress_bar_scale_two_char_with_bar(
                    *get_two_char_with_bar_columns(column_50_100), "75"
                )
            else:
                paint_progress_bar_scale_two_char_with_bar(
                    column_0_50, column_50_100, "50"
                )
        else:
            paint(self.ScaleBarChar * column_0_100)
        if self.ScaleBarEndChar is None:
            paint(self.ScaleBarChar)
            paint("100")
        else:
            paint("100")
            paint(self.ScaleBarEndChar)
        paint("\n")
        flush()

    def paint_progress_bar(self, msg, percent: float):
        if self.DefaultType == ProgressBarPainter.TypeOriginal:
            delta = percent - self.CurrentProgress
            if delta <= 0 or delta * self.TerminatorSize < 1:
                return
            # Base:
            # Compiling[#####...] 100%
            self.paint_progress_bar_1(msg, 1.0 * percent)
            self.CurrentProgress = percent
        elif self.DefaultType == ProgressBarPainter.TypeScaleInLine:
            # Other:
            #           0--25--75--100
            # Compiling **************
            # More six chars.
            column = self.TerminatorSize + 6
            delta = percent - self.CurrentProgress
            if delta <= 0 or delta * column < 1:
                return
            msg_max_width = 12
            if 0.0 == self.CurrentProgress:
                sys.stdout.write(" " * msg_max_width)
                self.paint_progress_bar_scale(column)
                sys.stdout.write(msg)
                sys.stdout.write(" " * (msg_max_width - len(msg)))

            self.CurrentProgress += int(delta * column) * 1.0 / column
            sys.stdout.write(self.ProgressBarChar * int(delta * column))
            if percent >= 1:
                sys.stdout.write("\n")
            sys.stdout.flush()

    def paint_over(self):
        if self.CurrentProgress != 0.0:
            self.paint_progress_bar("", 1.0)

    def paint_progress_bar_1(self, msg, progress):
        """progress a float range from 0 to 1"""
        print(
            "{0:9}[{1:<{2}}] {3:>3d}%\r".format(
                msg,
                "#" * int(progress * self.TerminatorSize),
                self.TerminatorSize,
                int(progress * 100),
            ),
            end="",
        )

        sys.stdout.flush()


def log_config():
    logger.setLevel(logging.DEBUG)

    console_handler = logging.StreamHandler()
    console_handler.setLevel(logging.DEBUG)

    file_handler = logging.FileHandler("log.log", mode="w")
    file_handler.setLevel(logging.NOTSET)

    formatter = logging.Formatter(
        "%(asctime)s - %(name)s - %(levelname)s - %(message)s"
    )
    console_handler.setFormatter(formatter)
    file_handler.setFormatter(formatter)

    logger.addHandler(console_handler)
    logger.addHandler(file_handler)


def main():
    start_time = time.perf_counter()

    parser = argparse.ArgumentParser(add_help=False)
    parser.add_argument(
        "-s",
        "--src-dir",
        type=str,
        help="please input the source code directory path",
        required=True,
    )
    parser.add_argument(
        "-d",
        "--db-dir",
        type=str,
        help="please input the database directory path",
        required=True,
    )
    parser.add_argument(
        "-h",
        "--help",
        action="help",
        help="this is coref python extractor, please specify source "
        "code root path and storage directory path of database, "
        "either relative path or absolute path is acceptable.",
    )
    argv = parser.parse_args()
    src_dir = argv.src_dir
    db_dir = argv.db_dir

    global root_dir
    root_dir = os.path.abspath(src_dir)
    db_dst_dir = os.path.abspath(db_dir)

    logger.info(f"Start extracting on: {root_dir}")
    storage = Storage(db_dst_dir)

    global file_list
    file_list = dict()

    create_program_node(root_dir, storage)

    size = len(file_list)
    logger.info(f"There are total: {size} python files")
    for idx, file in enumerate(file_list.values()):
        extract_file(storage, file, 0)

    total_parse_time = time.perf_counter() - start_time
    logger.info(f"Start commit records to db on: {db_dst_dir}")
    storage.commit()
    total_time = time.perf_counter() - start_time
    total_insert_db_time = total_time - total_parse_time
    logger.info(
        f"Total execution time is: {total_time} s, total extraction time is: {total_parse_time} s, total db "
        f"insertion time is: {total_insert_db_time} s"
    )


def extract_file(storage, file, i):
    src_path = os.path.join(root_dir, file.relative_path)
    line_count_dict = count_line_num(src_path, file, storage)
    with open(src_path, "r", errors="ignore") as source:
        import warnings

        warnings.filterwarnings("ignore")
        try:
            tree = ast.parse(source.read())
            Extractor(storage, file, src_path, tree, line_count_dict)
            if i != 0:
                modified_file = {
                    "element_oid": file.element_oid,
                    "relative_path": file.relative_path,
                }
                storage.store_modified_file(modified_file)
        except SyntaxError as e:
            logger.error(
                f"Extracting syntax error (i.e., unsupported python 2.x files, indentation errors) on file {file.relative_path}"
            )
            parse_error_file = {
                "element_oid": file.element_oid,
                "relative_path": file.relative_path,
                "error_message": e.msg,
                "error_text": e.text,
            }
            storage.store_parse_error_file(parse_error_file)


def create_program_node(root_path, storage):
    absolute_prefix_path = os.path.abspath(root_path)
    oid = get_oid(absolute_prefix_path)
    program = {"program_oid": oid, "absolute_prefix_path": absolute_prefix_path}
    storage.store_program(program)
    visit_folder(root_path, storage, oid)


def visit_file(path, storage, oid):
    fname = os.path.basename(path)
    suffix = fname.split(".")[1]
    file = File(
        element_oid=oid,
        relative_path=path,
        extension=suffix,
        name=fname,
        number_of_lines_oid=oid,
    )
    file_content = {
        "element_oid": oid,
        "relative_path": path,
        "extension": suffix,
        "name": fname,
        "number_of_lines_oid": oid,
    }
    storage.store_file(file_content)
    file_list[path] = file


def visit_folder(root_path, storage, parent_oid):
    root_rel_path = os.path.relpath(root_path, root_dir)
    dirs = os.listdir(root_path)

    for file in dirs:
        abs_path = os.path.join(root_path, file)
        if os.path.isdir(abs_path):
            dir_rel_path = (
                os.path.join(root_rel_path, file) if root_rel_path != "." else file
            )
            if dir_rel_path.startswith(".") or file.startswith("__"):
                pass
            else:
                dir_oid = get_oid(dir_rel_path)
                folder = {
                    "element_oid": dir_oid,
                    "qualified_name": dir_rel_path,
                    "name": file,
                    "parent_oid": parent_oid,
                }
                storage.store_folder(folder)

                visit_folder(abs_path, storage, dir_oid)
        else:
            if os.path.splitext(file)[-1] == ".py":
                file_path = (
                    os.path.join(root_rel_path, file) if root_rel_path != "." else file
                )
                sha256_value = calculate_file_cache(abs_path, hashlib.sha256())
                md5_value = calculate_file_cache(abs_path, hashlib.md5())
                file_oid = get_oid(abs_path + sha256_value + md5_value)

                container_parent = {"child_oid": file_oid, "parent_oid": parent_oid}
                storage.store_container_parent(container_parent)
                file_sha256_sum = {"file_oid": file_oid, "value": sha256_value}
                storage.store_file_sha256_sum(file_sha256_sum)
                file_md5_sum = {"file_oid": file_oid, "value": md5_value}
                storage.store_file_md5_sum(file_md5_sum)

                visit_file(file_path, storage, file_oid)


def count_line_num(
    file_path,
    file,
    storage,
    single_line_annotation="#",
    multi_line_annotation_start=('"""', "'''"),
    multi_line_annotation_end=('"""', "'''"),
):
    """
    count the number of lines in a file.
    Args:
        file_path: the src file path
        file: coref file object
        storage: storage object for saving the data
        single_line_annotation: the flag for single line comment, like '#'
        multi_line_annotation_start: the flag for multi-line comment start line, like '''
        multi_line_annotation_end:the flag for multi-line comment end line, like '''
    Returns: the dict for every line with its flog, 0 is empty, 1 is comment, 2 is code
    """
    line_count_dict = dict()
    code_num = blank_num = comment_num = 0

    with open(file_path, "r", errors="ignore") as f:
        flag = False
        count = 0
        try:
            for i in f.readlines():
                count += 1
                i = i.strip().strip("\n")
                if not i:
                    blank_num += 1
                    line_count_dict[count] = 0
                    continue
                else:
                    if i.startswith(single_line_annotation):
                        comment_num += 1
                        line_count_dict[count] = 1
                        continue
                    if not flag and i.startswith(multi_line_annotation_start):
                        comment_num += 1
                        flag = True
                        line_count_dict[count] = 1
                        continue
                    if flag:
                        comment_num += 1
                        line_count_dict[count] = 1
                        if i.endswith(multi_line_annotation_end):
                            flag = False
                        continue
                    else:
                        code_num += 1
                        line_count_dict[count] = 2
            number_of_lines = {
                "element_oid": file.element_oid,
                "number_of_total_lines": code_num + blank_num + comment_num,
                "number_of_valid_lines": code_num,
                "number_of_comment_lines": comment_num,
            }
            storage.store_number_of_lines(number_of_lines)
        except (UnicodeDecodeError, TypeError) as e:
            logger.error(f"Error occurs on file {file.name} line {e.lineno}")
    return line_count_dict


if __name__ == "__main__":
    logger = logging.getLogger()
    log_config()
    multiprocessing.freeze_support()
    file_mappings = []
    main()
