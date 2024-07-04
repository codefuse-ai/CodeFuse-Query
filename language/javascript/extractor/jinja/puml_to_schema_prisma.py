#! python3

""" 根据 coref-javascript-er.puml 生成 schema.prisma 文件

Author: 张玉 <zy249870@antgroup.com>

"""

import argparse
import os
import re
from xmlrpc.client import boolean
from dataclasses import dataclass
from pathlib import Path
from typing import List, Optional

from jinja2 import Environment, FileSystemLoader
from jinja2_strcase.jinja2_strcase import to_lower_camel

prisma_type_map = {
    "INTEGER": "Int",
    "TEXT": "String",
    "DATETIME": "DateTime",
}

PRISMA_OID_TYPE = "BigInt"
OID_SUFFIX = "oid"

gdl_type_map = {
    "INTEGER": "int",
    "TEXT": "string",
    "DATETIME": "string",
}

script_dir_path = os.path.dirname(__file__)

@dataclass
class Column:
    name: str
    type: str
    prisma_type: str
    gdl_type: str
    is_pk: bool = False


@dataclass
class Table:
    name: str
    column_list: List[Column]
    pk_index: int


def parse_args():
    """ 解析脚本的参数

    Returns: 
        解析后的 args 对象

    """

    parser = argparse.ArgumentParser(description='Convert Plantuml ER file to prisma.schema')
    parser.add_argument("puml_er_file", type=argparse.FileType(encoding="utf-8", errors="replace"))
    parser.add_argument(
        "--prisma-schema", "--output", "-o", 
        dest="output_path", 
        default=script_dir_path
    )

    return parser.parse_args()


def parse_puml_er(puml_er_str: str) -> List[Table]:
    """ 解析 puml ER 图的内容

    Format:
        entity location {
            oid: INTEGER
            file_oid: INTEGER
            start_line_number: INTEGER
            start_column_number: INTEGER
            end_line_number: INTEGER
            end_column_number: INTEGER
        }

    Returns: 
        table_list: 解析后的 Table 列表

    """

    table_list: List[Table] = []

    # 匹配每一个 ER 图中 entity 的内容
    entity_regex = r"(?<=\nentity ).+ \{[^\}]+\}"
    matches = re.finditer(entity_regex, puml_er_str, re.MULTILINE)
    for match in matches:
        entity_str = match.group()

        # 匹配表名
        table_name_regex = r".+(?= \{)"
        table_name_match = re.search(
            pattern=table_name_regex,
            string=entity_str
        )
        if table_name_match is None:
            continue
        table_name = table_name_match.group()

        # 匹配全部列的内容
        column_content_regex = r"(?<=\{).+(?=\})"
        column_content_match = re.search(
            pattern=column_content_regex,
            string=entity_str,
            flags=re.MULTILINE | re.DOTALL
        )
        if column_content_match is None:
            continue
        column_content = column_content_match.group().strip()

        # 获取每一个列名和类型
        column_desc_list = [x.strip() for x in column_content.splitlines()]
        column_desc_list = [x for x in column_desc_list if x]
        column_list: List[Column] = []
        pk_index = 0
        for column_desc in column_desc_list:
            column_desc_list = [x.strip() for x in column_desc.split(" ")]
            column_desc_list = [x for x in column_desc_list if  x]
            column_name = column_desc_list[0]
            if column_name.endswith(":"):
                column_name = column_name[:-1]
                        
            column_type = column_desc_list[1]
            column_prisma_type = PRISMA_OID_TYPE if column_name.endswith(OID_SUFFIX) else prisma_type_map.get(column_type)
            if column_prisma_type is None:
                raise RuntimeError(f"Cannot convert column type to prisma type: {column_type}")
            column_gdl_type = gdl_type_map.get(column_type)
            if column_gdl_type is None:
                raise RuntimeError(f"Cannot convert column type to gdl type: {column_type}")

            is_pk =  len(column_desc_list) == 3 and column_desc_list[2] == "<<PK>>"
            if is_pk:
                pk_index = len(column_list)

            column = Column(
                name=column_name,
                type=column_type,
                prisma_type=column_prisma_type,
                gdl_type=column_gdl_type,
                is_pk=is_pk,
            )
            column_list.append(column)

        table = Table(
            name=table_name,
            column_list=column_list,
            pk_index=pk_index,
        )

        table_list.append(table)

    return table_list


def generate_doclass_predicate_params(table: Table, column: Optional[Column] = None) -> List[str]:
    """ 生成 godel DOClass 中的 predicate 参数列表

    Args:
        table:      表
        column:     列，如果不指定则生成 DOClass 的构造函数参数列表

    Returns: 
        param_list: godel DOClass 中的 predicate 参数列表

    """
    param_list = ["_"] * len(table.column_list)
    param_list[table.pk_index] = "this"
    if column and not column.is_pk:
        index = table.column_list.index(column)
        param_list[index] = to_lower_camel(column.name)
    
    return param_list


def main():
    args = parse_args()
    puml_er_file = args.puml_er_file
    puml_er_str = puml_er_file.read()
    table_list = parse_puml_er(puml_er_str=puml_er_str)
    puml_er_file.close()

    jinja_env = Environment(
        loader=FileSystemLoader(
            searchpath=script_dir_path
        ),
        extensions=["jinja2_strcase.StrcaseExtension"]
    )

    def test():
        return ['_'] * 10

    for template_name in jinja_env.list_templates(extensions="j2"):
        template = jinja_env.get_template(template_name)
        rendered_content = template.render(
            table_list=table_list,
            generate_doclass_predicate_params=generate_doclass_predicate_params
        )
        rendered_path = Path(args.output_path, Path(template_name).stem)
        with open(rendered_path, 'w') as f:
            f.write(rendered_content)


if __name__ == '__main__':
    main()
