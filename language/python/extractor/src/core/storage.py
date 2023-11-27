import os
import shutil
import sys

from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker, scoped_session

from model.alias import Alias
from model.annotation_assignment_statement import AnnotationAssignmentStatement
from model.arg import Arg
from model.arguments import Argument
from model.assert_statement import AssertStatement
from model.assignment_statement import AssignmentStatement
from model.async_for_statement import AsyncForStatement
from model.async_function_def_statement import AsyncFunctionDefStatement
from model.async_with_statement import AsyncWithStatement
from model.attribute_expression import AttributeExpression
from model.augmented_assignment_statement import AugmentedAssignmentStatement
from model.await_expression import AwaitExpression
from model.bin_op_expression import BinOpExpression
from model.boolean_op_expression import BooleanOpExpression
from model.break_statement import BreakStatement
from model.call_expression import CallExpression
from model.class_def_statement import ClassDefStatement
from model.class_hierarchy import ClassHierarchy
from model.comment import Comment
from model.compare_expression import CompareExpression
from model.comprehension import Comprehension
from model.constant import Constant
from model.container_parent import ContainerParent
from model.continue_statement import ContinueStatement
from model.decorated_relation import DecoratedRelation
from model.decorator import Decorator
from model.delete_statement import DeleteStatement
from model.dict_comp_expression import DictCompExpression
from model.dict_expression import DictExpression
from model.docstring_comment import DocstringComment
from model.element import Element, Base
from model.except_handler import ExceptHandler
from model.expr_context import ExprContext
from model.expression import Expression
from model.expression_statement import ExpressionStatement
from model.file import File
from model.file_md5_sum import FileMd5Sum
from model.file_sha256_sum import FileSha256Sum
from model.folder import Folder
from model.for_statement import ForStatement
from model.formatted_value_expression import FormattedValueExpression
from model.function_def_statement import FunctionDefStatement
from model.generator_expression import GeneratorExpression
from model.global_statement import GlobalStatement
from model.if_expression import IfExpression
from model.if_statement import IfStatement
from model.import_from_statement import ImportFromStatement
from model.import_statement import ImportStatement
from model.joined_str_expression import JoinedStrExpression
from model.keyword import Keyword
from model.lambda_expression import LambdaExpression
from model.list_comp_expression import ListCompExpression
from model.list_expression import ListExpression
from model.location import Location
from model.match_case import MatchCase
from model.match_statement import MatchStatement
from model.modified_2to3_file import Modified2to3File
from model.module import Module
from model.name_expression import NameExpression
from model.named_expression import NamedExpression
from model.non_local_statement import NonLocalStatement
from model.number_of_lines import NumberOfLines
from model.parent import Parent
from model.parse_error_file import ParseErrorFile
from model.pass_statement import PassStatement
from model.program import Program
from model.raise_statement import RaiseStatement
from model.return_statement import ReturnStatement
from model.scope_enclosing_expression import ScopeEnclosingExpression
from model.scope_enclosing_statement import ScopeEnclosingStatement
from model.set_comp_expression import SetCompExpression
from model.set_expression import SetExpression
from model.slice import Slice
from model.starred_expression import StarredExpression
from model.statement import Statement
from model.subscript_expression import SubscriptExpression
from model.try_statement import TryStatement
from model.tuple_expression import TupleExpression
from model.unary_op_expression import UnaryOpExpression
from model.while_statement import WhileStatement
from model.with_item import WithItem
from model.with_statement import WithStatement
from model.yield_expression import YieldExpression
from model.yield_from_expression import YieldFromExpression

object_dict = dict()
session = scoped_session(sessionmaker())
engine = None


class Storage:
    def __init__(self, dest_path):
        self.db_dst_path = self.copy_db_file(dest_path)
        self.create_session(self.db_dst_path)
        self.insert_cache = {}
        self.primary_key_cache = {}
        pass

    @staticmethod
    def copy_db_file(dest_path):
        src_dir = os.path.dirname(os.path.dirname(os.path.realpath(__file__)))
        src_file = os.path.join(src_dir, "resources/coref_python_src.db")

        # Check if src_file exists, if not, create the database schema
        if not os.path.isfile(src_file):
            print("%s does not exist! Creating the database schema." % src_file)
            sql_file = os.path.join(src_dir, "resources/coref_python_src.sql")
            if not os.path.isfile(sql_file):
                print("%s does not exist!" % sql_file)
                return None

            engine = create_engine("sqlite:///" + src_file, echo=False)
            Session = sessionmaker(bind=engine)
            session = Session()

            with open(sql_file, "r") as f:
                sql_statements = f.read()
                statements = sql_statements.split(";")
                for statement in statements:
                    session.execute(statement)
                session.commit()

            session.close()

        db_file_name = os.path.split(src_file)[1]
        if not os.path.exists(dest_path):
            os.makedirs(dest_path)
        db_dst_path = os.path.join(dest_path, db_file_name)
        shutil.copy(src_file, db_dst_path)
        return db_dst_path

    @staticmethod
    def create_session(db_file):
        global engine
        if db_file is None:
            print("Database preparation failed!")
            sys.exit(-1)

        engine = create_engine("sqlite:///" + db_file, echo=False)
        session.remove()
        session.configure(bind=engine, autoflush=False, expire_on_commit=False)
        Base.metadata.drop_all(engine)
        Base.metadata.create_all(engine)

    def store_program(self, root):
        self.insert(Program, root)

    def store_container_parent(self, container):
        self.insert(ContainerParent, container)

    def store_parse_error_file(self, error):
        self.insert(ParseErrorFile, error)

    def store_modified_file(self, file):
        self.insert(Modified2to3File, file)

    def store_parent(self, parent):
        self.insert(Parent, parent)

    def store_file(self, file):
        self.insert(File, file)

    def store_comment(self, comment):
        self.insert(Comment, comment)

    def store_docstring_comment(self, comment):
        self.insert(DocstringComment, comment)

    def store_folder(self, folder):
        self.insert(Folder, folder)

    def store_element(self, element):
        self.insert(Element, element)

    def store_location(self, location):
        self.insert(Location, location)

    def store_module(self, module):
        self.insert(Module, module)

    def store_arguments(self, arguments):
        self.insert(Argument, arguments)

    def store_constant(self, constant):
        self.insert(Constant, constant)

    def store_expr_context(self, context):
        self.insert(ExprContext, context)

    def store_alias(self, alias):
        self.insert(Alias, alias)

    def store_comprehension(self, comprehension):
        self.insert(Comprehension, comprehension)

    def store_scope_enclosing_stmt(self, enclosing):
        self.insert(ScopeEnclosingStatement, enclosing)

    def store_scope_enclosing_expr(self, enclosing):
        self.insert(ScopeEnclosingExpression, enclosing)

    def store_function_def_stmt(self, statement):
        self.insert(FunctionDefStatement, statement)

    def store_if_stmt(self, statement):
        self.insert(IfStatement, statement)

    def store_for_stmt(self, statement):
        self.insert(ForStatement, statement)

    def store_while_stmt(self, statement):
        self.insert(WhileStatement, statement)

    def store_try_stmt(self, statement):
        self.insert(TryStatement, statement)

    def store_ann_assign_stmt(self, statement):
        self.insert(AnnotationAssignmentStatement, statement)

    def store_except_handler(self, handler):
        self.insert(ExceptHandler, handler)

    def store_if_expr(self, expression):
        self.insert(IfExpression, expression)

    def store_name_expr(self, expression):
        self.insert(NameExpression, expression)

    def store_formatted_value_expr(self, expression):
        self.insert(FormattedValueExpression, expression)

    def store_bool_expr(self, expression):
        self.insert(BooleanOpExpression, expression)

    def store_bin_expr(self, expression):
        self.insert(BinOpExpression, expression)

    def store_call_expr(self, expression):
        self.insert(CallExpression, expression)

    def store_attribute_expr(self, expression):
        self.insert(AttributeExpression, expression)

    def store_await_expr(self, expression):
        self.insert(AwaitExpression, expression)

    def store_compare_expr(self, expression):
        self.insert(CompareExpression, expression)

    def store_dict_expr(self, expression):
        self.insert(DictExpression, expression)

    def store_dict_comp_expr(self, expression):
        self.insert(DictCompExpression, expression)

    def store_generator_expr(self, expression):
        self.insert(GeneratorExpression, expression)

    def store_joined_str_expr(self, expression):
        self.insert(JoinedStrExpression, expression)

    def store_lambda_expr(self, expression):
        self.insert(LambdaExpression, expression)

    def store_list_expr(self, expression):
        self.insert(ListExpression, expression)

    def store_list_comp_expr(self, expression):
        self.insert(ListCompExpression, expression)

    def store_set_expr(self, expression):
        self.insert(SetExpression, expression)

    def store_set_comp_expr(self, expression):
        self.insert(SetCompExpression, expression)

    def store_starred_expr(self, expression):
        self.insert(StarredExpression, expression)

    def store_tuple_expr(self, expression):
        self.insert(TupleExpression, expression)

    def store_unary_op_expr(self, expression):
        self.insert(UnaryOpExpression, expression)

    def store_yield_expr(self, expression):
        self.insert(YieldExpression, expression)

    def store_yield_from_expr(self, expression):
        self.insert(YieldFromExpression, expression)

    def store_named_expr(self, expression):
        self.insert(NamedExpression, expression)

    def store_subscript_expr(self, expression):
        self.insert(SubscriptExpression, expression)

    def store_arg(self, arg):
        self.insert(Arg, arg)

    def store_keyword(self, keyword):
        self.insert(Keyword, keyword)

    def store_slice(self, slice):
        self.insert(Slice, slice)

    def store_withitem(self, withitem):
        self.insert(WithItem, withitem)

    def store_class_def_stmt(self, statement):
        self.insert(ClassDefStatement, statement)

    def store_break_stmt(self, statement):
        self.insert(BreakStatement, statement)

    def store_stmt(self, statement):
        self.insert(Statement, statement)

    def store_expr(self, expression):
        self.insert(Expression, expression)

    def store_return_stmt(self, stmt):
        self.insert(ReturnStatement, stmt)

    def store_global_stmt(self, stmt):
        self.insert(GlobalStatement, stmt)

    def store_non_local_stmt(self, stmt):
        self.insert(NonLocalStatement, stmt)

    def store_expression_stmt(self, stmt):
        self.insert(ExpressionStatement, stmt)

    def store_match_stmt(self, statement):
        self.insert(MatchStatement, statement)

    def store_import_stmt(self, statement):
        self.insert(ImportStatement, statement)

    def store_import_from_stmt(self, statement):
        self.insert(ImportFromStatement, statement)

    def store_assign_stmt(self, statement):
        self.insert(AssignmentStatement, statement)

    def store_continue_stmt(self, statement):
        self.insert(ContinueStatement, statement)

    def store_pass_stmt(self, statement):
        self.insert(PassStatement, statement)

    def store_assert_stmt(self, statement):
        self.insert(AssertStatement, statement)

    def store_with_stmt(self, statement):
        self.insert(WithStatement, statement)

    def store_delete_stmt(self, statement):
        self.insert(DeleteStatement, statement)

    def store_raise_stmt(self, statement):
        self.insert(RaiseStatement, statement)

    def store_augassign_stmt(self, statement):
        self.insert(AugmentedAssignmentStatement, statement)

    def store_async_for_stmt(self, statement):
        self.insert(AsyncForStatement, statement)

    def store_async_with_stmt(self, statement):
        self.insert(AsyncWithStatement, statement)

    def store_async_function_def_stmt(self, statement):
        self.insert(AsyncFunctionDefStatement, statement)

    def store_decorator(self, decorator):
        self.insert(Decorator, decorator)

    def store_decorated_relation(self, relation):
        self.insert(DecoratedRelation, relation)

    def store_class_hierarchy(self, relation):
        self.insert(ClassHierarchy, relation)

    def store_match_case(self, case):
        self.insert(MatchCase, case)

    def store_file_md5_sum(self, md5_sum):
        self.insert(FileMd5Sum, md5_sum)

    def store_file_sha256_sum(self, sha256_sum):
        self.insert(FileSha256Sum, sha256_sum)

    def store_number_of_lines(self, lines):
        self.insert(NumberOfLines, lines)

    @staticmethod
    def get_primary_key_field_base(type_object: type) -> str:
        result = None
        for field, value in type_object.__dict__.items():
            if (not field.startswith("__")) and (
                getattr(value, "primary_key", None) is True
            ):  # 'is True' is necessary
                # If two primary_keys, please check and modify this code.
                assert result is None
                result = field
        # If there is crashed, please check the code which is generated.
        assert result is not None
        return result

    def get_primary_key_field(self, type_object: type) -> str:
        if type_object not in self.primary_key_cache:
            result = self.get_primary_key_field_base(type_object)
            self.primary_key_cache[type_object] = result
            return result
        else:
            return self.primary_key_cache[type_object]

    def insert(self, type_object, object):
        key = object[self.get_primary_key_field(type_object)]

        if type_object not in self.insert_cache:
            self.insert_cache[type_object] = set()
        if key in self.insert_cache[type_object]:
            return
        self.insert_cache[type_object].add(key)

        if object_dict.get(type_object):
            object_dict[type_object].append(object)
        else:
            object_dict.update({type_object: [object]})

    def commit(self):
        for key, value in object_dict.items():
            session.bulk_insert_mappings(key, value)
        session.commit()
        object_dict.clear()
