# GödelScript Syntax

Back to [README.md](../README.md#documents)

GödelScript Syntax Spec,
Usage Document see [GödelScript Program](./language-reference/program.md)。

## Identifier / Literal / Annotation
```ebnf
identifier = (* basic token *);
number_literal = (* basic token *);
string_literal = (* basic token *);
literal = number_literal | string_literal;
```

## Annotation
```ebnf
prop_pair = identifier "=" string_literal;
annotation =
    "@" identifier ["(" string_literal ")"] |
    "@" identifier ["(" [prop_pair [{"," prop_pair}]] ")"];
```

Example:

```rust
this_is_an_identifier
12345
"string literal"
```

Annotation example:

```rust
@inline
fn get(a: Method) -> bool {
    ...
}
```

## Program

About main program, [Click](./language-reference/program.md)。

```ebnf
program = {use_stmt} {
    {function_decl} |
    {enum_decl} |
    {schema_decl} |
    {use_decl} |
    {impl_decl} |
    {database_decl} |
    {query_decl}
};
```

## Declaration

### Function

Function Usage [Documents](./language-reference/functions.md)。

```ebnf
function_decl =
    [{annotation}]
    "fn" id "(" [params] ")" ["->" type_def]
    [ ";" | ("{" block_stmt "}")];
params = param {"," param};
param = identifier [":" param_type_def];
param_type_def = ["*"] identifier;
block_stmt = {statement};
```

### Enum

Enum Usage [Documents](./language-reference/enums.md)。

```ebnf
enum_decl = "enum" identifier "{" [identifier {"," identifier}] "}";
```

### Schema

Schema Usage [Documents](./language-reference/schemas.md)。

```ebnf
schema_decl =
    "schema" identifier ["extends" type_def] "{" [schema_members] "}";
schema_members = schema_member {"," schema_member};
schema_member = [anno] id ":" type_def;
```

### Database

Database Usage [Documents](./language-reference/databases.md)。

```ebnf
database_decl = "database" identifier "{" [database_tables] "}";
database_tables = database_table {"," database_table};
database_table = identifier ":" type_def ["as" string_literal];
```

### Use / Import

Package Manager / Symbol Import
[Documents](./language-reference/import.md)。

```ebnf
use_stmt = "use" identifier {"::" identifier} ["::" ("*"|multi_use)];
multi_use = "{" identifier {"," identifier} "}";
```

### Implement

Impl Usage [Documents](./language-reference/impl.md)。

```ebnf
impl_decl = "impl" identifier ["for" identifier] "{" {function_decl} "}";
```

### GödelScript Query

Query Usage [Documents](./language-reference/queries.md)。

```ebnf
query_decl =
    "query" identifier
    "from" from_list
    ["where" or_expr]
    "select" select_list;
from_list = from_def {"," from_def};
from_def = identifier "in" or_expr;
select_list = select_column {"," select_column};
select_column = or_expr ["as" identifier];
```

## Statement

GödelScript statement
[Documents](./language-reference/functions.md#statement)。

```ebnf
statement =
    let_stmt |
    cond_stmt |
    for_stmt |
    match_stmt |
    fact_stmt |
    ret_stmt |
    in_block_expr;

def = identifier [":" type_def];
type_def = identifier ["::" identifier];
```

### Let Statement
```ebnf
let_stmt = "let" "(" let_def ")" "{" [statement] "}";
let_def = def "=" expression {"," def "=" expression};
```

### Condition Statement
```ebnf
cond_stmt = if_stmt {elsif_stmt} [else_stmt];
if_stmt = "if" "(" expression ")" "{" [statement] "}";
elsif_stmt = "else" "if" "(" expression ")" "{" [statement] "}";
else_stmt = "else" "{" [statement] "}";
```

### For Statement
```ebnf
for_stmt = "for" "(" for_def  ")" "{" [statement] "}";
for_def = def "in" expression {"," def "in" expression};
```

### Match Statement
```ebnf
match_stmt = "match" "(" expression ")" "{" [match_pairs] "}";
match_pairs = match_pair {"," match_pair};
match_pair = literal "=>" statement;
```

### Fact Statement
```ebnf
fact_stmt = "[" fact_data {"," fact_data} "]";
fact_data = "{"
    (number_literal | string_literal)
    {"," (number_literal | string_literal)}
"}";
```

### Return Statement
```ebnf
ret_stmt = ("return" | "yield") or_expr;
```

### In Block Expression (as Statement)
```ebnf
in_block_expr = expression;
```

## Expression

GödelScript Expression [Documents](./language-reference/functions.md#expression)。

```ebnf
expression = or_expr;
```

### Calculation
```ebnf
or_expr = and_expr {"||" and_expr};
and_expr = (not_expr | cmp_expr) {"&&" (not_expr | cmp_expr)};
curved_expr = "(" or_expr ")";
unary_expr = "-" (symcall | curved_calc_expr | unary_expr);
not_expr = "!" cmp_expr;
cmp_expr =
    additive_expr
    [("=" | "!=" | "<" | "<=" | ">" | ">=" | "in") additive_expr];
additive_expr = multiple_expr {("+" | "-") multiple_expr};
multiple_expr =
    (symcall | curved_expr | unary_expr)
    {("*" | "/") (symcall | curved_expr | unary_expr)};
```

### Call Expression
```ebnf
symcall = symhead {sympath | symget};
symhead =
    identifier [initializer|funcall]
    | literal
    | curved_expr
    ;
sympath = "::" identifier [funcall];
symget = "." identifier [funcall];

funcall = "(" [arglist] ")";
arglist = or_expr {"," or_expr};
```

### Initializer

Usage: [Initializer List](./language-reference/functions.md#initializer-list)

```ebnf
initializer = "{" [initializer_pair ","] "}";
initializer_pair = identifier ":" or_expr;
```

Back to [README.md](../README.md#documents)
