import json
from pathlib import Path

if __name__ == "__main__":
    
    dot_file_content = """
digraph G {
    center=true;
    rankdir=LR;
    //edge [color=red];
    concentrate=true;
    layout=dot;
    node [  // 设置所有节点的属性
        fontname = "Microsoft YaHei",
        fontsize = 12,
        shape = "Mrecord",
        color="skyblue",
        style="filled"
    ];
    edge [  // 设置所有边的属性
        fontname = "Microsoft YaHei",
        fontsize = 12,
        color="darkgreen"
    ];
        
    """
    script_path = Path(__file__)
    dir_name = Path(script_path).parent
    
    with open(dir_name / "FindDruidSqlAstNodes.json", 'r') as fp:
        class_hierarchy = json.load(fp)
        for class_relation in class_hierarchy:
            # print(class_relation)
            className: str = class_relation['className']
            superClassName: str = class_relation['superClassName']
            
            # if className.endswith('Impl'):
            #     className = className.removesuffix("Impl")
            
            # if superClassName.endswith('Impl'):
            #     superClassName = superClassName.removesuffix("Impl")
                
            dot_file_content += f"""
    {className} -> {superClassName}"""
    
    dot_file_content += """
}"""

    with open(dir_name / "druid_sql_ast_nodes_class_diagram.dot", 'w') as fp:
        fp.write(dot_file_content)