#!python3

"""根据 Druid AST 生成 Java 相关文件

Author: 友恒 <zhengxunjin.zx@antgroup.com>

"""

import json
import re
from pathlib import Path
from typing import Callable, Dict, List, Optional, Set, Tuple

from jinja2 import Environment, FileSystemLoader
from dataclasses import dataclass, field

JAVA_TYPE_2_SQLITE_MAP = {
    "String": "TEXT",
    "Integer": "INTEGER",
    "int": "INTEGER",
    "Boolean": "INTEGER",
    "boolean": "INTEGER",
    
    # Convert java.lang.Number and all of its sub classes to be stored as string or int in COREF
    "Number": "TEXT",
    "Byte": "INTEGER",
    "byte": "INTEGER",
    "Short": "INTEGER",
    "short": "INTEGER",
    "Long": "TEXT",
    "long": "TEXT",
    "Float": "TEXT",
    "float": "TEXT",
    "Double": "TEXT",
    "Double": "TEXT",   
}

SQLITE_TYPE_2_GODEL_MAP = {
    "TEXT": "string",
    "INTEGER": "int",
}

# Some method column name triggers Java/SQLite/Godel reserved word error so rename it
RESERVED_WORD_CONVERT_MAP = {
    'final': 'is_final',
}

# Black listing some Druid classes to be ignored during code generation
NODE_BLACK_LIST = ('SQLJSONValueExpr', 'TDDLHint', 'DB2IntermediateResultTableSource', 'OracleLobParameters', 'PhoenixUpsertStatement', 'PrestoSelectStatement')

# Black listing some Druid methods to be ignored during code generation
METHOD_BLACK_LIST = ('getDbType', 'getChildren')

# Black listing some Druid methods which return unsupported arguments.
# They will be ignored during code generation. The pattern of this black list should be in regex
METHOD_RETURN_TYPE_BLACK_LIST_REGEX = ('byte\[\]', '^List<List<.*>>$', '^Map<.*>$')

@dataclass
class Method:
    def __hash__(self):
        return hash(self.name + self.return_type)
    
    # Original method name
    name: str
    # Name in column(snake case). e.g. Given `getDatabaseName`, its column name should be `database_name`
    column_name: str
    return_type: str
    # Return type in SQLite
    return_type_in_sqlite: str
    # Return type in Godel. e.g. For return type of List<SQLColumnDefinition> in Java, we should return
    # SQLColumnDefinition in Godel
    return_type_in_godel: str
    is_return_type_an_ast_class: bool

@dataclass
class Node:
    def __hash__(self):
        return hash(self.qualified_name)
    
    qualified_name: str
    # Original class name
    name: str
    # Name stored in SQLite(snake_case)
    table_name: str
    method_list: List[Method]
    super_class_name: str
    db_type: str
    is_abstract: bool
    parent_node: "Node" = None
    # A list containing all nearest ancestors of this node who are abstract.
    # Different code should be generated for them
    abstract_parent_node_list: List["Node"] = field(default_factory=list)
    

def camel_to_snake(name):
    name = re.sub('(.)([A-Z][a-z]+)', r'\1_\2', name)
    return re.sub('([a-z0-9])([A-Z])', r'\1_\2', name).lower()


def is_method_return_type_black_listed(method_return_type: str):
    for r in METHOD_RETURN_TYPE_BLACK_LIST_REGEX:
        if re.search(r, method_return_type):
            return True
        
    return False

def parse_druid_sql_ast(druid_sql_ast_list: List) -> Tuple[List[Node], Dict[str, List[Node]], Dict[Node, List[Node]], List[str]]:
    class_qualified_name_map: Dict[str, Node] = {}
    node_list: List[Node] = []
    
    # Construct parent map, key is interface name, value is a list of node.
    # The node in the list is an AST class implementing this interface.
    implements_interface_map: Dict[str, List[Node]] = {}
    
    # Construct parent map, key is abstract class name, value is a list of node.
    # The node in the list is an AST class extending this abstract class.
    extends_abstract_class_map: Dict[Node, List[Node]] = {}
    
    for item in druid_sql_ast_list:
        qualified_name = item['qualifiedName']
        class_name = item['className']
        method_name = item['methodName']
        return_type_name = item['returnTypeName']
        super_class_name = item['superClassName']
        is_abstract = bool(item['isAbstract'])
        is_return_type_an_ast_class = bool(item['isReturnTypeAnAstClass'])
        implements_interface_name = item['implementsInterfaceName']
        
        if qualified_name not in class_qualified_name_map:
            search_db_type = re.search('\.(\w+)\.ast.*', qualified_name)
            
            # Deal with `com.alibaba.druid.sql.dialect.hive.stmt.*` case
            if search_db_type is None:
                search_db_type = re.search('dialect\.(\w+)', qualified_name)
            
            db_type = search_db_type.group(1)
            
            table_name = camel_to_snake(class_name)
                
            class_qualified_name_map[qualified_name] = Node(
                qualified_name=qualified_name,
                name=class_name,
                table_name=table_name,
                method_list=[],
                super_class_name=super_class_name,
                db_type=db_type,
                is_abstract=is_abstract,
            )
        
        if implements_interface_name:
            if implements_interface_name not in implements_interface_map:
                implements_interface_map[implements_interface_name] = []
            implements_interface_map[implements_interface_name].append(class_qualified_name_map[qualified_name])
            
        method_column_name = re.sub('^get', r'', method_name)
        method_column_name = camel_to_snake(method_column_name)
        
        if method_column_name in RESERVED_WORD_CONVERT_MAP:
            method_column_name = RESERVED_WORD_CONVERT_MAP[method_column_name]
        
        method_return_type_in_sqlite = None
        
        search_type_in_list = re.search('^List<(.*)>$', return_type_name)
        # When return type is of List, deal with the inner type:
        if search_type_in_list:
            method_return_type_in_godel = search_type_in_list.group(1)
            # Deal with return type of List<String>, List<Long> etc. They should be stored as string
            if method_return_type_in_godel in JAVA_TYPE_2_SQLITE_MAP:
                method_return_type_in_sqlite = 'TEXT'
                method_return_type_in_godel = SQLITE_TYPE_2_GODEL_MAP[method_return_type_in_sqlite]
        # When return type is not a list:
        else:
            if return_type_name in JAVA_TYPE_2_SQLITE_MAP:
                method_return_type_in_sqlite = JAVA_TYPE_2_SQLITE_MAP[return_type_name]
                method_return_type_in_godel = SQLITE_TYPE_2_GODEL_MAP[method_return_type_in_sqlite]
            else:
                # If return type is an AST class, extract its oid to DB
                if is_return_type_an_ast_class:
                    method_return_type_in_sqlite = 'INTEGER'
                    method_return_type_in_godel = return_type_name
                    method_column_name += "_oid"
                else:
                    method_return_type_in_sqlite = 'TEXT'
                    method_return_type_in_godel = SQLITE_TYPE_2_GODEL_MAP[method_return_type_in_sqlite]
        
        # Special case: SQLDoubleExpr::getNumber SQLFloatExpr::getNumber
        if class_name in ('SQLDoubleExpr', 'SQLFloatExpr'):
            if method_name == 'getNumber' and return_type_name == 'Number':
                continue
        
        if method_name == "":
            continue
        
        class_qualified_name_map[qualified_name].method_list.append(
            Method(
                name=method_name,
                column_name=method_column_name,
                return_type=return_type_name,
                return_type_in_sqlite=method_return_type_in_sqlite,
                return_type_in_godel=method_return_type_in_godel,
                is_return_type_an_ast_class=is_return_type_an_ast_class,
            )
        )
        
    for item in class_qualified_name_map.values():
        node_list.append(item)
    
    for node in node_list:
        # Add parent node to node.parent_node. If parent is not in class_qualified_name_map,
        # set node.parent_node to None
        node.parent_node = class_qualified_name_map.get(node.super_class_name, None)
        # Remove duplicated methods from methods list and sort the list
        node.method_list = sorted(list(set(node.method_list)), key=lambda m: m.column_name)
    
    # Add abstract AST nodes to extends_abstract_class_map and
    # record the inheritance relationship
    for node in node_list:
        if node.parent_node and node.parent_node.is_abstract:
            if node.parent_node not in extends_abstract_class_map:
                extends_abstract_class_map[node.parent_node] = []
            extends_abstract_class_map[node.parent_node].append(node)
    
    for interface_name, implements_node_list in implements_interface_map.items():
        # Remove duplicated node from nodes list and sort the list
        implements_interface_map[interface_name] = sorted(list(set(implements_node_list)), key=lambda t: t.qualified_name)
                    
    node_name_set: Set[str] = set(map(lambda node: node.name, class_qualified_name_map.values()))
    for node in node_list:
        for method in node.method_list:
            return_type_in_godel = method.return_type_in_godel
            # Post proces to deal with method return type of List<Item>, List<ElseIf>, List<List<SQLAssignItem>>.
            # They are nested class/enum, not an AST node, they should be stored as string
            if method.return_type.startswith('List<') and return_type_in_godel:
                if return_type_in_godel not in implements_interface_map \
                    and return_type_in_godel not in node_name_set \
                    and return_type_in_godel != 'SQLObject':
                        method.return_type_in_sqlite = 'TEXT'
                        method.return_type_in_godel = SQLITE_TYPE_2_GODEL_MAP[method.return_type_in_sqlite]
            
            # Post process to deal with method return type of SQLExpr, SQLStatement.
            # They are interfaces. Extract their oid to DB .
            if method.return_type in implements_interface_map:
                method.return_type_in_sqlite = 'INTEGER'
                method.return_type_in_godel = method.return_type
                method.column_name += "_oid"
    
    # Post process to construct a list of all nearest ancestors of a node who are abstract.
    # Add to the list until one's parent(or its parent's parent, etc.) is not abstract
    for node in node_list:
        parent = node.parent_node
        while parent and parent.is_abstract:
            node.abstract_parent_node_list.append(parent)
            parent = parent.parent_node
    
    # Construct db_type_list
    db_type_set = set()
    for node in node_list:
        db_type_set.add(node.db_type)
    db_type_list = list(sorted(db_type_set))
    
    return sorted(node_list, key=lambda t: t.qualified_name), implements_interface_map, extends_abstract_class_map, db_type_list


def render_templates(
    env: Environment,
    node_list: List[Node],
    implements_interface_map: Dict[str, List[Node]],
    extends_abstract_class_map: Dict[Node, List[Node]],
    db_type_list: List[str],
    filter_func: Optional[Callable[[str], bool]] = None):
    templates = env.list_templates(filter_func=filter_func) if filter_func else env.list_templates(extensions='j2')
    for template_name in templates:
        template = env.get_template(template_name)

        template_path = Path(template.filename)
        rendered_path = (template_path.parent / template_path.stem).resolve()
        print(f'Generated successfully to {rendered_path}')
        with open(rendered_path, 'w') as f:
            f.write(template.render(node_list=node_list,
                                    implements_interface_map=implements_interface_map,
                                    extends_abstract_class_map=extends_abstract_class_map,
                                    db_type_list=db_type_list,
                                    NODE_BLACK_LIST=NODE_BLACK_LIST,
                                    JAVA_TYPE_2_SQLITE_MAP=JAVA_TYPE_2_SQLITE_MAP,
                                    METHOD_BLACK_LIST=METHOD_BLACK_LIST,
                                    METHOD_RETURN_TYPE_BLACK_LIST_REGEX=METHOD_RETURN_TYPE_BLACK_LIST_REGEX))


if __name__ == '__main__':
    script_path = Path(__file__)

    dir_name = Path(script_path).parent
    with open(Path(dir_name, 'FindDruidSqlAstAllPublicGetterMethods.json'), 'r', encoding='utf-8') as fp:
        druid_sql_ast_list = json.load(fp)
    
    node_list: List[Node]
    implements_interface_map: Dict[str, List[Node]]
    extends_abstract_class_map: Dict[Node, List[Node]]
    db_type_list: List[str]
    node_list, implements_interface_map, extends_abstract_class_map, db_type_list = parse_druid_sql_ast(druid_sql_ast_list)
    
    env = Environment(loader=FileSystemLoader(dir_name.parent.parent),
                      extensions=['jinja2_strcase.StrcaseExtension'],
                      keep_trailing_newline=True)
    
    env.tests["method_return_type_black_listed"] = is_method_return_type_black_listed
        
    render_templates(env, node_list, implements_interface_map, extends_abstract_class_map, db_type_list, lambda x: x in ('coref_er_diagram.puml.j2', 'src/main/java/com/alipay/codequery/coref/sql/core/CorefVisitor.java.j2', 'src/main/java/com/alipay/codequery/coref/sql/DbTypeEnum.java.j2'))
    
    env.loader = FileSystemLoader(Path(dir_name, '..', '..', '..', 'lib'))
    render_templates(env, node_list, implements_interface_map, extends_abstract_class_map, db_type_list, lambda x: x in ('Node.gdl.j2', 'BaseNode.gdl.j2'))
