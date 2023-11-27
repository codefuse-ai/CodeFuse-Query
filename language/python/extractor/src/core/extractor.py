import ast
import logging
import tokenize
from pathlib import Path

from core.idgenerator import get_ast_element_oid, get_single_comment_element_oid
from model.parent import Parent

parent_dict = dict()
logger = logging.getLogger()


class Extractor(ast.NodeVisitor):
    def __init__(self, storage, file, src_path, tree, line_count_dict):
        self.storage = storage
        self.file = file
        self.src_path = src_path
        self.tree = tree
        self.line_count_dict = line_count_dict
        self.getParent()
        self.visit(self.tree)
        self.visit_single_line_comment()

    def getParent(self):
        try:
            for node in ast.walk(self.tree):
                node.debug_message = ast.unparse(node)
                index = 0
                for child in ast.iter_child_nodes(node):
                    child.parent = node
                    child.debug_message = ast.unparse(child)
                    child.index = index
                    index += 1
        except IndexError:
            logger.error(f"Index Error when parsing node: {node}")

    def get_parent(self, node):
        s = get_ast_element_oid(node, node.debug_message,
                                self.file.relative_path)
        # expression statement and its expression has the same printable text,
        # so add type name to verify them
        if parent_dict.get(s):
            return parent_dict.get(s)
        else:
            coref_parent = Parent(
                parent_oid=s, parent_type=type(node).__name__)
            parent_dict[s] = coref_parent
            parent = {
                "parent_oid": coref_parent.parent_oid,
                "parent_type": coref_parent.parent_type,
            }
            self.storage.store_parent(parent)
            return coref_parent

    def get_element_oid(self, node: ast.AST) -> int:
        try:
            oid = get_ast_element_oid(
                node, node.debug_message, self.file.relative_path)
        except AttributeError:
            logger.error(
                f"Cannot calculate the oid of the node: {node} for Attribute Error on file {self.src_path}"
            )
            oid = -1
        return oid

    def generic_visit(self, node):
        element_type = type(node).__name__
        p = self.get_parent(node.parent).parent_oid
        oid = self.get_element_oid(node)
        if isinstance(node, ast.operator):
            self.visit_operator(node)
        elif isinstance(node, ast.cmpop):
            self.visit_cmpop(node)
        elif isinstance(node, ast.boolop):
            self.visit_boolop(node)
        elif isinstance(node, ast.unaryop):
            self.visit_unaryop(node)
        else:
            try:
                element = {
                    "oid": oid,
                    "value": node.debug_message,
                    "type": element_type,
                    "parent_oid": p,
                }
                self.calculate_location(node, oid)
            except (IndexError, AttributeError):
                element = {
                    "oid": oid,
                    "value": node.debug_message,
                    "type": element_type,
                    "parent_oid": p,
                }
                self.calculate_location(node, oid)
                print(element)
            self.storage.store_element(element)
        ast.NodeVisitor.generic_visit(self, node)

    def calculate_location(self, node, oid):
        """
        Calculate and store the location info, start_line, end_line, start_column, end_column for a locatable ast node.
        Args:
            node: a locatable ast node
            oid: the coref oid for the node
        Returns: None
        """
        location = {
            "element_oid": oid,
            "file_oid": self.file.element_oid,
            "start_line_number": node.lineno,
            "start_column_number": node.col_offset,
            "end_line_number": node.end_lineno,
            "end_column_number": node.end_col_offset,
        }
        self.calculate_number_of_lines(node, oid)
        self.storage.store_location(location)

    def calculate_number_of_lines(self, node: ast.AST, oid):
        """
        Calculate and store the number of lines for a locatable ast node.
        Args:
            node: a locatable ast node
            oid: the coref oid for the node
        Returns: None
        """
        code_num = 0
        blank_num = 0
        comment_num = 0
        for key in range(node.lineno, node.end_lineno + 1):
            if self.line_count_dict.get(key) == 1:
                comment_num += 1
            elif self.line_count_dict.get(key) == 0:
                blank_num += 1
            else:
                code_num += 1
        number_of_lines = {
            "element_oid": oid,
            "number_of_total_lines": code_num + blank_num + comment_num,
            "number_of_valid_lines": code_num,
            "number_of_comment_lines": comment_num,
        }
        self.storage.store_number_of_lines(number_of_lines)

    def visit_single_line_comment(self):
        with open(self.src_path, "r", errors="ignore") as source:
            for token, text, start_loc, end_loc, src in tokenize.generate_tokens(
                source.readline
            ):
                if token == tokenize.COMMENT:
                    cc = get_single_comment_element_oid(
                        text, self.file.relative_path, start_loc, end_loc
                    )
                    location = {
                        "element_oid": cc,
                        "file_oid": self.file.element_oid,
                        "start_line_number": start_loc[0],
                        "start_column_number": start_loc[1],
                        "end_line_number": end_loc[0],
                        "end_column_number": end_loc[1],
                    }
                    self.storage.store_location(location)
                    comment = {
                        "element_oid": cc,
                        "text": text,
                        "parent_oid": self.file.element_oid,
                        "location_oid": cc,
                    }
                    self.storage.store_comment(comment)

    def visit_docstring_comment(self, node, id):
        text = ast.get_docstring(node, False)
        if text is not None:
            d = get_ast_element_oid(node, text, self.file.relative_path)
            docstring_comment = {
                "element_oid": d,
                "text": text,
                "documented_element_oid": id,
            }
            self.storage.store_docstring_comment(docstring_comment)

    def generate_locatable_element(self, node, oid):
        p_oid = self.get_parent(node.parent).parent_oid
        element = {
            "element_oid": oid,
            "type": type(node).__name__,
            "element_index": node.index,
            "parent_oid": p_oid,
            "location_oid": oid,
            "printable_text": node.debug_message,
        }
        self.calculate_location(node, oid)
        return element

    def visit_statement(self, node: ast.stmt, oid):
        """
        stmt = FunctionDef(identifier name, arguments args, stmt* body, expr* decorator_list, expr? returns, string? type_comment)
         | AsyncFunctionDef(identifier name, arguments args, stmt* body, expr* decorator_list, expr? returns, string? type_comment)
         | ClassDef(identifier name, expr* bases, keyword* keywords, stmt* body, expr* decorator_list)
         | Return(expr? value)
         | Delete(expr* targets)
         | Assign(expr* targets, expr value, string? type_comment)
         | AugAssign(expr target, operator op, expr value)
         | AnnAssign(expr target, expr annotation, expr? value, int simple)
         | For(expr target, expr iter, stmt* body, stmt* orelse, string? type_comment)
         | AsyncFor(expr target, expr iter, stmt* body, stmt* orelse, string? type_comment)
         | While(expr test, stmt* body, stmt* orelse)
         | If(expr test, stmt* body, stmt* orelse)
         | With(withitem* items, stmt* body, string? type_comment)
         | AsyncWith(withitem* items, stmt* body, string? type_comment)
         | Match(expr subject, match_case* cases)
         | Raise(expr? exc, expr? cause)
         | Try(stmt* body, excepthandler* handlers, stmt* orelse, stmt* finalbody)
         | Assert(expr test, expr? msg)
         | Import(alias* names)
         | ImportFrom(identifier? module, alias* names, int? level)
         | Global(identifier* names)
         | Nonlocal(identifier* names)
         | Expr(expr value)
         | Pass
         | Break
         | Continue
         There is no general visitor for ast.stmt type, so call it in every sub statement class visitor.
         Save common info, i.e., location oid, parent oid, printable text, type in statement table.
        :param node: an ast statement node.
        :param oid: generated oid for the node
        :return: null
        """
        statement = self.generate_locatable_element(node, oid)
        self.storage.store_stmt(statement)

    def visit_expression(self, node: ast.expr, oid):
        """
        expr = BoolOp(boolop op, expr* values)
         | NamedExpr(expr target, expr value)
         | BinOp(expr left, operator op, expr right)
         | UnaryOp(unaryop op, expr operand)
         | Lambda(arguments args, expr body)
         | IfExp(expr test, expr body, expr orelse)
         | Dict(expr* keys, expr* values)
         | Set(expr* elts)
         | ListComp(expr elt, comprehension* generators)
         | SetComp(expr elt, comprehension* generators)
         | DictComp(expr key, expr value, comprehension* generators)
         | GeneratorExp(expr elt, comprehension* generators)
         | Await(expr value)
         | Yield(expr? value)
         | YieldFrom(expr value)
         | Compare(expr left, cmpop* ops, expr* comparators)
         | Call(expr func, expr* args, keyword* keywords)
         | FormattedValue(expr value, int conversion, expr? format_spec)
         | JoinedStr(expr* values)
         | Constant(constant value, string? kind)
         | Attribute(expr value, identifier attr, expr_context ctx)
         | Subscript(expr value, expr slice, expr_context ctx)
         | Starred(expr value, expr_context ctx)
         | Name(identifier id, expr_context ctx)
         | List(expr* elts, expr_context ctx)
         | Tuple(expr* elts, expr_context ctx)
         | Slice(expr? lower, expr? upper, expr? step)
        There is no general visitor for ast.expr type, so call it in every sub expression class visitor.
         Save common info, i.e., location oid, parent oid, printable text, type in expression table.
        :param node: an ast expression node.
        :param oid: generated oid for the node
        :return: null
        """
        expression = self.generate_locatable_element(node, oid)
        self.storage.store_expr(expression)

    def visit_boolop(self, node: ast.boolop):
        """
        boolop = And | Or, which has no location info, no printable text info, so omit this node.
        :param node: ast.operator
        :return: null
        """
        pass

    def visit_operator(self, node: ast.operator):
        """
        operator = Add | Sub | Mult | MatMult | Div | Mod | Pow | LShift | RShift | BitOr | BitXor | BitAnd |
        FloorDiv, which has no location info, no printable text info, so omit this node. :param node: ast.operator
        :return: null
        """
        pass

    def visit_cmpop(self, node: ast.cmpop):
        """
        cmpop = Eq | NotEq | Lt | LtE | Gt | GtE | Is | IsNot | In | NotIn, which has no location info, no printable
        text info, so omit this node. :param node: ast.cmpop :return: null
        """
        pass

    def visit_unaryop(self, node: ast.unaryop):
        """
        unaryop = Invert | Not | UAdd | USub, which has no location info, no printable text info, so omit this node.
        :param node: ast.unaryop
        :return: null
        """
        pass

    def visit_Global(self, node: ast.Global):
        oid = self.get_element_oid(node)
        statement = {"element_oid": oid, "names": node.names[0]}
        self.storage.store_global_stmt(statement)
        self.visit_statement(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Nonlocal(self, node: ast.Nonlocal):
        oid = self.get_element_oid(node)
        statement = {"element_oid": oid, "names": node.names[0]}
        self.storage.store_non_local_stmt(statement)
        self.visit_statement(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_NamedExpr(self, node: ast.NamedExpr):
        oid = self.get_element_oid(node)
        expression = {
            "element_oid": oid,
            "target_oid": self.get_element_oid(node.target),
            "value_oid": self.get_element_oid(node.value),
        }
        self.storage.store_named_expr(expression)
        self.visit_expression(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Expr(self, node: ast.Expr):
        oid = self.get_element_oid(node)
        statement = {"element_oid": oid,
                     "value_oid": self.get_element_oid(node.value)}
        self.storage.store_expression_stmt(statement)
        self.visit_statement(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_FormattedValue(self, node: ast.FormattedValue):
        oid = self.get_element_oid(node)
        formatted_value = {
            "element_oid": oid,
            "value_oid": self.get_element_oid(node.value),
        }
        self.storage.store_formatted_value_expr(formatted_value)
        self.visit_expression(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_AnnAssign(self, node: ast.AnnAssign):
        oid = self.get_element_oid(node)
        ann_statement = {
            "element_oid": oid,
            "annotation_oid": self.get_element_oid(node.annotation),
            "target_oid": self.get_element_oid(node.target),
            "is_simple": node.simple,
        }
        self.storage.store_ann_assign_stmt(ann_statement)
        self.visit_statement(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Return(self, node: ast.Return):
        oid = self.get_element_oid(node)
        is_return_empty = 1 if node.value is None else 0
        return_statement = {"element_oid": oid,
                            "is_return_empty": is_return_empty}
        self.storage.store_return_stmt(return_statement)
        self.visit_statement(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Break(self, node: ast.Break):
        oid = self.get_element_oid(node)
        self.visit_statement(node, oid)
        statement = {"element_oid": oid}
        self.storage.store_break_stmt(statement)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Name(self, node: ast.Name):
        oid = self.get_element_oid(node)
        name_expression = {"element_oid": oid,
                           "ctx_type": type(node.ctx).__name__}
        self.storage.store_name_expr(name_expression)
        self.visit_expression(node, oid)
        # print(node.ctx, node.id, node.lineno, self.src_path)
        # for i in ast.iter_child_nodes(node):
        #     print(i, node.id, node.lineno, oid, self.src_path)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Load(self, node: ast.Load):
        oid = self.get_element_oid(node)
        expr_context = {
            "element_oid": oid,
            "parent_oid": self.get_parent(node.parent).parent_oid,
            "printable_text": "Load",
        }
        self.storage.store_expr_context(expr_context)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Store(self, node: ast.Store):
        oid = self.get_element_oid(node)
        expr_context = {
            "element_oid": oid,
            "parent_oid": self.get_parent(node.parent).parent_oid,
            "printable_text": "Store",
        }
        self.storage.store_expr_context(expr_context)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Del(self, node: ast.Del):
        oid = self.get_element_oid(node)
        expr_context = {
            "element_oid": oid,
            "parent_oid": self.get_parent(node.parent).parent_oid,
            "printable_text": "Del",
        }
        self.storage.store_expr_context(expr_context)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_arguments(self, node: ast.arguments):
        oid = get_ast_element_oid(
            node, node.debug_message, self.file.relative_path)
        arguments = {
            "element_oid": oid,
            "parent_oid": self.get_parent(node.parent).parent_oid,
            "printable_text": node.debug_message,
        }
        self.storage.store_arguments(arguments)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Module(self, node: ast.Module):
        oid = get_ast_element_oid(
            node, node.debug_message, self.file.relative_path)
        module = {
            "element_oid": oid,
            "name": Path(self.file.name).stem,
            "file_oid": self.file.element_oid,
            "location_oid": oid,
        }
        self.storage.store_module(module)
        self.visit_docstring_comment(node, oid)
        location = {
            "element_oid": oid,
            "file_oid": self.file.element_oid,
            "start_line_number": 1,
            "start_column_number": 0,
            "end_line_number": len(self.line_count_dict),
            "end_column_number": 0,
        }
        self.storage.store_location(location)
        self.generate_scope_enclosing_stmt_or_expr(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_comprehension(self, node: ast.comprehension):
        """
        this element has no lineno attribute, so share the same location with its parent node location
        :param node: ast.comprehension
        :return: null
        """
        a = self.get_element_oid(node.iter)
        b = self.get_element_oid(node.target)
        comprehension = {
            "element_oid": self.get_element_oid(node),
            "target_expr_oid": b,
            "iter_expr_oid": a,
            "element_index": node.index,
            "parent_oid": self.get_parent(node.parent).parent_oid,
            "printable_text": node.debug_message,
        }
        self.storage.store_comprehension(comprehension)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_withitem(self, node: ast.withitem):
        oid = self.get_element_oid(node)
        p_oid = self.get_parent(node.parent).parent_oid
        withitem = {
            "element_oid": oid,
            "printable_text": node.debug_message,
            "element_index": node.index,
            "parent_oid": p_oid,
        }
        self.storage.store_withitem(withitem)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_BoolOp(self, node: ast.BoolOp):
        oid = self.get_element_oid(node)
        bool_expression = {
            "element_oid": oid,
            "type": type(node.op).__name__,
            "size": len(node.values) - 1,
        }
        self.storage.store_bool_expr(bool_expression)
        self.visit_expression(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def generate_scope_enclosing_stmt_or_expr(self, node, oid):
        enclosing_dict = dict()
        self.generate_enclosing_list(node, enclosing_dict, oid)
        for key, value in enclosing_dict.items():
            if isinstance(key, ast.stmt):
                scope_enclosing_stmt = {
                    "statement_oid": value[0],
                    "scope_oid": value[1],
                }
                self.storage.store_scope_enclosing_stmt(scope_enclosing_stmt)
            else:
                scope_enclosing_expr = {
                    "expression_oid": value[0],
                    "scope_oid": value[1],
                }
                self.storage.store_scope_enclosing_expr(scope_enclosing_expr)

    def generate_enclosing_list(self, node, enclosing_dict, oid):
        """
        Recursively to find statement or expression in the scope (class or function)
        Args:
            oid: scope oid
            node: ast.ClassDef or ast.FunctionDef
            enclosing_dict: the enclosing dict

        Returns: enclosing_dict

        """
        for child in ast.iter_child_nodes(node):
            c_oid = self.get_element_oid(child)
            if isinstance(child, ast.ClassDef) or isinstance(child, ast.FunctionDef):
                enclosing_dict[child] = [c_oid, oid]
                self.generate_enclosing_list(child, enclosing_dict, c_oid)
            elif isinstance(child, ast.stmt) or isinstance(child, ast.expr):
                enclosing_dict[child] = [c_oid, oid]
                self.generate_enclosing_list(child, enclosing_dict, oid)
            else:
                self.generate_enclosing_list(child, enclosing_dict, oid)
        return enclosing_dict

    def generate_decorated_relation(self, node: ast.AST, oid):
        for i in node.decorator_list:
            d_oid = self.get_element_oid(i)
            decorator = {
                "element_oid": d_oid,
                "type": type(i).__name__,
                "printable_text": i.debug_message,
            }
            self.storage.store_decorator(decorator)
            relation = {"decorator_oid": d_oid, "decorated_element_oid": oid}
            self.storage.store_decorated_relation(relation)

    def visit_FunctionDef(self, node: ast.FunctionDef):
        oid = self.get_element_oid(node)
        function_def = {"element_oid": oid, "name": node.name}
        self.storage.store_function_def_stmt(function_def)
        self.visit_docstring_comment(node, oid)
        self.visit_statement(node, oid)
        if node.decorator_list is not None:
            self.generate_decorated_relation(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_ClassDef(self, node: ast.ClassDef):
        oid = self.get_element_oid(node)
        self.visit_docstring_comment(node, oid)
        class_def = {"element_oid": oid, "name": node.name}
        self.storage.store_class_def_stmt(class_def)
        self.visit_statement(node, oid)
        if node.decorator_list is not None:
            self.generate_decorated_relation(node, oid)
        for i in node.bases:
            relation = {"base_oid": self.get_element_oid(i), "class_oid": oid}
            self.storage.store_class_hierarchy(relation)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_If(self, node: ast.If):
        oid = self.get_element_oid(node)
        if_statement = {"element_oid": oid}
        self.storage.store_if_stmt(if_statement)
        self.visit_statement(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_IfExp(self, node: ast.IfExp):
        oid = self.get_element_oid(node)
        if_expression = {"element_oid": oid}
        self.storage.store_if_expr(if_expression)
        self.visit_expression(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_For(self, node: ast.For):
        oid = self.get_element_oid(node)
        for_statement = {"element_oid": oid}
        self.storage.store_for_stmt(for_statement)
        self.visit_statement(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_While(self, node: ast.While):
        oid = self.get_element_oid(node)
        while_statement = {"element_oid": oid}
        self.storage.store_while_stmt(while_statement)
        self.visit_statement(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Try(self, node: ast.Try):
        oid = self.get_element_oid(node)
        try_statement = {"element_oid": oid}
        self.storage.store_try_stmt(try_statement)
        self.visit_statement(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_ExceptHandler(self, node: ast.ExceptHandler):
        ast.NodeVisitor.generic_visit(self, node)
        oid = self.get_element_oid(node)
        p_oid = self.get_parent(node.parent).parent_oid
        handler = {
            "element_oid": oid,
            "element_index": node.index,
            "parent_oid": p_oid,
            "location_oid": oid,
            "printable_text": node.debug_message,
        }
        self.storage.store_except_handler(handler)
        self.calculate_location(node, oid)

    def visit_BinOp(self, node: ast.BinOp):
        ast.NodeVisitor.generic_visit(self, node)
        oid = self.get_element_oid(node)
        handler = {
            "element_oid": oid,
            "left_expr_oid": self.get_element_oid(node.left),
            "opcode": node.op.__doc__,
            "right_expr_oid": self.get_element_oid(node.right),
        }
        self.storage.store_bin_expr(handler)
        self.visit_expression(node, oid)

    def visit_Match(self, node: ast.Match):
        ast.NodeVisitor.generic_visit(self, node)
        oid = self.get_element_oid(node)
        statement = {
            "element_oid": oid,
            "subject_oid": self.get_element_oid(node.subject),
        }
        self.storage.store_match_stmt(statement)
        self.visit_statement(node, oid)

    def visit_match_case(self, node: ast.match_case):
        ast.NodeVisitor.generic_visit(self, node)
        oid = self.get_element_oid(node)
        p_oid = self.get_parent(node.parent).parent_oid
        pattern_oid = self.get_element_oid(node.pattern)

        node.lineno = node.pattern.lineno
        node.col_offset = node.pattern.col_offset
        if node.body is not None:
            i = len(node.body)
            node.end_lineno = node.body[i - 1].end_lineno
            node.end_col_offset = node.body[i - 1].end_col_offset
        else:
            node.end_lineno = node.pattern.end_lineno
            node.end_col_offset = node.pattern.end_col_offset

        is_default = 1 if isinstance(node.pattern, ast.MatchAs) else 0
        statement = {
            "element_oid": oid,
            "pattern_oid": pattern_oid,
            "element_index": node.index,
            "parent_oid": p_oid,
            "location_oid": oid,
            "printable_text": node.debug_message,
            "is_default": is_default,
        }
        self.storage.store_match_case(statement)
        self.calculate_location(node, oid)

    def visit_Constant(self, node: ast.Constant):
        ast.NodeVisitor.generic_visit(self, node)
        oid = self.get_element_oid(node)
        if isinstance(node, ast.Num):
            value = "Num"
        elif isinstance(node, ast.Str):
            value = "Str"
        elif isinstance(node, ast.Bytes):
            value = "Bytes"
        elif isinstance(node, ast.Ellipsis):
            value = "Ellipsis"
        elif isinstance(node, ast.NameConstant):
            value = "NameConstant"
        else:
            value = "Constant"
        constant = {"element_oid": oid, "value": value}
        self.storage.store_constant(constant)
        self.visit_expression(node, oid)

    def visit_arg(self, node: ast.arg):
        ast.NodeVisitor.generic_visit(self, node)
        oid = self.get_element_oid(node)
        p_oid = self.get_parent(node.parent).parent_oid
        annotation_oid = (
            self.get_element_oid(
                node.annotation) if node.annotation is not None else -1
        )
        arg = {
            "element_oid": oid,
            "annotation": annotation_oid,
            "element_index": node.index,
            "parent_oid": p_oid,
            "location_oid": oid,
            "printable_text": node.arg,
        }
        self.storage.store_arg(arg)
        self.calculate_location(node, oid)

    def visit_keyword(self, node: ast.keyword):
        ast.NodeVisitor.generic_visit(self, node)
        oid = self.get_element_oid(node)
        p_oid = self.get_parent(node.parent).parent_oid
        value = node.arg if node.arg is not None else "None"
        value_oid = self.get_element_oid(
            node.value) if node.value is not None else -1
        keyword = {
            "element_oid": oid,
            "arg_value": value,
            "value_oid": value_oid,
            "element_index": node.index,
            "parent_oid": p_oid,
            "location_oid": oid,
            "printable_text": node.debug_message,
        }
        self.storage.store_keyword(keyword)
        self.calculate_location(node, oid)

    def visit_Slice(self, node: ast.Slice):
        ast.NodeVisitor.generic_visit(self, node)
        oid = self.get_element_oid(node)
        p_oid = self.get_parent(node.parent).parent_oid
        has_step = 1 if node.step is not None else 0
        slice = {
            "element_oid": oid,
            "element_index": node.index,
            "parent_oid": p_oid,
            "location_oid": oid,
            "printable_text": node.debug_message,
            "has_step": has_step,
        }
        self.storage.store_slice(slice)
        self.calculate_location(node, oid)

    def visit_Call(self, node: ast.Call):
        ast.NodeVisitor.generic_visit(self, node)
        oid = self.get_element_oid(node)
        expr = {"element_oid": oid,
                "expr_func_oid": self.get_element_oid(node.func)}
        self.storage.store_call_expr(expr)
        self.visit_expression(node, oid)

    def visit_Attribute(self, node: ast.Attribute):
        ast.NodeVisitor.generic_visit(self, node)
        oid = self.get_element_oid(node)
        expression = {
            "element_oid": oid,
            "value_oid": self.get_element_oid(node.value),
            "ctx_type": type(node.ctx).__name__,
        }
        self.storage.store_attribute_expr(expression)
        self.visit_expression(node, oid)

    def visit_Import(self, node: ast.Import):
        oid = self.get_element_oid(node)
        statement = {"element_oid": oid}
        self.storage.store_import_stmt(statement)
        self.visit_statement(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_ImportFrom(self, node: ast.ImportFrom):
        oid = self.get_element_oid(node)
        module = node.module if node.module is not None else "."
        statement = {"element_oid": oid, "module": module, "level": node.level}
        self.storage.store_import_from_stmt(statement)
        self.visit_statement(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_alias(self, node: ast.alias):
        oid = self.get_element_oid(node)
        p_oid = self.get_parent(node.parent).parent_oid
        value = node.debug_message
        name = node.name
        asname = node.asname if node.asname is not None else "None"
        alias = {
            "element_oid": oid,
            "name": name,
            "asname": asname,
            "element_index": node.index,
            "parent_oid": p_oid,
            "location_oid": oid,
            "printable_text": value,
        }
        self.storage.store_alias(alias)
        self.calculate_location(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Await(self, node: ast.Await):
        oid = self.get_element_oid(node)
        expression = {
            "element_oid": oid,
            "expr_value_oid": self.get_element_oid(node.value),
        }
        self.storage.store_await_expr(expression)
        self.visit_expression(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Compare(self, node: ast.Compare):
        oid = self.get_element_oid(node)
        expression = {
            "element_oid": oid,
            "left_expr_oid": self.get_element_oid(node.left),
        }
        self.storage.store_compare_expr(expression)
        self.visit_expression(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Subscript(self, node: ast.Subscript):
        oid = self.get_element_oid(node)
        self.visit_expression(node, oid)
        expression = {
            "element_oid": oid,
            "value_oid": self.get_element_oid(node.value),
            "slice_oid": self.get_element_oid(node.slice),
            "ctx": type(node.ctx).__name__,
        }
        self.storage.store_subscript_expr(expression)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Dict(self, node: ast.Dict):
        oid = self.get_element_oid(node)
        self.visit_expression(node, oid)
        expression = {"element_oid": oid, "size": len(node.keys)}
        self.storage.store_dict_expr(expression)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_DictComp(self, node: ast.DictComp):
        oid = self.get_element_oid(node)
        expression = {"element_oid": oid,
                      "comprehension_size": len(node.generators)}
        self.storage.store_dict_comp_expr(expression)
        self.visit_expression(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_GeneratorExp(self, node: ast.GeneratorExp):
        oid = self.get_element_oid(node)
        self.visit_expression(node, oid)
        expression = {"element_oid": oid,
                      "elt_oid": self.get_element_oid(node.elt)}
        self.storage.store_generator_expr(expression)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_JoinedStr(self, node: ast.JoinedStr):
        oid = self.get_element_oid(node)
        self.visit_expression(node, oid)
        expression = {"element_oid": oid, "size": len(node.values)}
        self.storage.store_joined_str_expr(expression)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Lambda(self, node: ast.Lambda):
        oid = self.get_element_oid(node)
        self.visit_expression(node, oid)
        expression = {"element_oid": oid}
        self.storage.store_lambda_expr(expression)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_List(self, node: ast.List):
        oid = self.get_element_oid(node)
        self.visit_expression(node, oid)
        expression = {
            "element_oid": oid,
            "elt_size": len(node.elts),
            "ctx": type(node.ctx).__name__,
        }
        self.storage.store_list_expr(expression)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_ListComp(self, node: ast.ListComp):
        oid = self.get_element_oid(node)
        self.visit_expression(node, oid)
        expression = {
            "element_oid": oid,
            "elt_oid": self.get_element_oid(node.elt),
            "generator_size": len(node.generators),
        }
        self.storage.store_list_comp_expr(expression)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Set(self, node: ast.Set):
        oid = self.get_element_oid(node)
        self.visit_expression(node, oid)
        expression = {"element_oid": oid, "elt_size": len(node.elts)}
        self.storage.store_set_expr(expression)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_SetComp(self, node: ast.SetComp):
        oid = self.get_element_oid(node)
        self.visit_expression(node, oid)
        expression = {
            "element_oid": oid,
            "elt_oid": self.get_element_oid(node.elt),
            "generator_size": len(node.generators),
        }
        self.storage.store_set_comp_expr(expression)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Starred(self, node: ast.Starred):
        oid = self.get_element_oid(node)
        self.visit_expression(node, oid)
        expression = {"element_oid": oid, "ctx": type(node.ctx).__name__}
        self.storage.store_starred_expr(expression)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Tuple(self, node: ast.Tuple):
        oid = self.get_element_oid(node)
        self.visit_expression(node, oid)
        expression = {
            "element_oid": oid,
            "elt_size": len(node.elts),
            "ctx": type(node.ctx).__name__,
        }
        self.storage.store_tuple_expr(expression)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_UnaryOp(self, node: ast.UnaryOp):
        oid = self.get_element_oid(node)
        self.visit_expression(node, oid)
        expression = {
            "element_oid": oid,
            "op_code": type(node.op).__name__,
            "operand_oid": self.get_element_oid(node.operand),
        }
        self.storage.store_unary_op_expr(expression)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Yield(self, node: ast.Yield):
        oid = self.get_element_oid(node)
        self.visit_expression(node, oid)
        expression = {"element_oid": oid}
        self.storage.store_yield_expr(expression)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_YieldFrom(self, node: ast.YieldFrom):
        oid = self.get_element_oid(node)
        self.visit_expression(node, oid)
        expression = {"element_oid": oid,
                      "value": self.get_element_oid(node.value)}
        self.storage.store_yield_from_expr(expression)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Assign(self, node: ast.Assign):
        oid = self.get_element_oid(node)
        self.visit_statement(node, oid)
        statement = {
            "element_oid": oid,
            "value_oid": self.get_element_oid(node.value),
            "targets_size": len(node.targets),
        }
        self.storage.store_assign_stmt(statement)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_AsyncFor(self, node: ast.AsyncFor):
        oid = self.get_element_oid(node)
        self.visit_statement(node, oid)
        statement = {"element_oid": oid}
        self.storage.store_async_for_stmt(statement)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_AsyncWith(self, node: ast.AsyncWith):
        oid = self.get_element_oid(node)
        self.visit_statement(node, oid)
        statement = {"element_oid": oid}
        self.storage.store_async_with_stmt(statement)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_AsyncFunctionDef(self, node: ast.AsyncFunctionDef):
        oid = self.get_element_oid(node)
        self.visit_statement(node, oid)
        statement = {"element_oid": oid, "name": node.name}
        self.storage.store_async_function_def_stmt(statement)
        self.generate_scope_enclosing_stmt_or_expr(node, oid)
        self.visit_docstring_comment(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Continue(self, node: ast.Continue):
        oid = self.get_element_oid(node)
        statement = {"element_oid": oid}
        self.storage.store_continue_stmt(statement)
        self.visit_statement(node, oid)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Delete(self, node: ast.Delete):
        oid = self.get_element_oid(node)
        self.visit_statement(node, oid)
        statement = {"element_oid": oid, "targets_size": len(node.targets)}
        self.storage.store_delete_stmt(statement)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Pass(self, node: ast.Pass):
        oid = self.get_element_oid(node)
        self.visit_statement(node, oid)
        statement = {"element_oid": oid}
        self.storage.store_pass_stmt(statement)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Raise(self, node: ast.Raise):
        oid = self.get_element_oid(node)
        self.visit_statement(node, oid)
        statement = {"element_oid": oid}
        self.storage.store_raise_stmt(statement)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_AugAssign(self, node: ast.AugAssign):
        oid = self.get_element_oid(node)
        self.visit_statement(node, oid)
        statement = {
            "element_oid": oid,
            "op_code": type(node.op).__name__,
            "value_expr_oid": self.get_element_oid(node.value),
            "target_expr_oid": self.get_element_oid(node.target),
        }
        self.storage.store_augassign_stmt(statement)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_With(self, node: ast.With):
        oid = self.get_element_oid(node)
        self.visit_statement(node, oid)
        statement = {"element_oid": oid}
        self.storage.store_with_stmt(statement)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Assert(self, node: ast.Assert):
        oid = self.get_element_oid(node)
        self.visit_statement(node, oid)
        statement = {
            "element_oid": oid,
            "assert_condition_oid": self.get_element_oid(node.test),
        }
        self.storage.store_assert_stmt(statement)
        ast.NodeVisitor.generic_visit(self, node)

    def visit_Expression(self, node: ast.Expression):
        ast.NodeVisitor.generic_visit(self, node)
