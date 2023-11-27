import ast
import hashlib
import os.path


def get_oid(value):
    sha256_value = hashlib.sha256(value.encode("utf-8")).hexdigest()
    oid = int(sha256_value[0:15], 16)
    return oid


def calculate_file_cache(path, algorithm):
    size = os.path.getsize(path)
    with open(path, "rb") as f:
        while size >= 1024 * 1024:
            algorithm.update(f.read(1024 * 1024))
            size -= 1024 * 1024
        algorithm.update(f.read())
    return algorithm.hexdigest()


def get_ast_element_oid(node, value, path):
    s = type(node).__name__
    if isinstance(node, ast.Module):
        signature = f"path: {path} value: {value} type: {s}"
    else:
        try:
            l = str(node.lineno)
            l1 = str(node.col_offset)
            l2 = str(node.end_lineno)
            l3 = str(node.end_col_offset)
            signature = f"path: {path} value: {value} type: {s} s_line: {l} e_line: {l2} s_col: {l1} e_col: {l3}"
        except AttributeError:
            l = str(node.parent.lineno)
            l1 = str(node.parent.col_offset)
            l2 = str(node.parent.end_lineno)
            l3 = str(node.parent.end_col_offset)
            signature = f"path: {path} value: {value} type: {s} s_line: {l} e_line: {l2} s_col: {l1} e_col: {l3}"
    oid = get_oid(signature)
    return oid


def get_single_comment_element_oid(value, path, start_loc, end_loc):
    l = str(start_loc[0])
    l2 = str(end_loc[0])
    signature = f"path: {path} value: {value} s_line: {l} e_line: {l2}"
    oid = get_oid(signature)
    return oid
