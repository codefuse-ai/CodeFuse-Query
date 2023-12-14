# WithStatement

Primary key: `id: int`

```rust
schema WithStatement {
  @primary id: int,
}
```
## WithStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: WithStatement) -> Location;
```
## WithStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: WithStatement) -> Symbol;
```
## WithStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: WithStatement) -> *Decorator;
```
## WithStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: WithStatement) -> string;
```
## WithStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: WithStatement, i: int) -> Modifier;
```
## WithStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: WithStatement) -> *Comment;
```
## WithStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: WithStatement) -> *Node;
```
## WithStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: WithStatement) -> *Node;
```
## WithStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: WithStatement) -> Node;
```
## WithStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: WithStatement) -> *Comment;
```
## WithStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: WithStatement) -> *Comment;
```
## WithStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: WithStatement) -> int;
```
## WithStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: WithStatement) -> TopLevelDO;
```
## WithStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: WithStatement, i: int) -> Decorator;
```
## WithStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: WithStatement) -> int;
```
## WithStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: WithStatement) -> *Modifier;
```
## WithStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: WithStatement) -> int;
```
## WithStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: WithStatement, i: int) -> Node;
```
## WithStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: WithStatement) -> int;
```
## WithStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: WithStatement) -> *FunctionLikeDeclaration;
```
## WithStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: WithStatement, level: int) -> *Node;
```
## WithStatement::getExpression

```rust
/**
     * Gets the expression belong to the WithStatement.
     * Each WithStatement contains one and only one expression.
     */
```
```rust
pub fn getExpression(self: WithStatement) -> Expression;
```
## WithStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: WithStatement) -> int;
```
## WithStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: WithStatement) -> string;
```
## WithStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: WithStatement) -> File;
```
## WithStatement::getStatement

```rust
/**
     * Gets the statement belong to the WithStatement.
     * Each WithStatement contains one and only one statement,
     * Multiple statements should be grounded by a BlockStatement.
     */
```
```rust
pub fn getStatement(self: WithStatement) -> Statement;
```
## WithStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: WithStatement, level: int) -> Node;
```
## WithStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: WithStatement) -> FunctionLikeDeclaration;
```
## WithStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: WithStatement) -> Node;
```
## WithStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: WithStatement) -> int;
```
## WithStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: WithStatement) -> int;
```
## WithStatement::getIndex

```rust
pub fn getIndex(self: WithStatement) -> int;
```
## WithStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: WithStatement) -> *Node;
```
## WithStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *WithStatement;
```
## WithStatement::is\<T\>

```rust
pub fn is<T>(self: WithStatement) -> bool;
```
## WithStatement::to\<T\>

```rust
pub fn to<T>(self: WithStatement) -> <any>;
```
## WithStatement::key\_neq

```rust
pub fn key_neq(self: WithStatement, object: <any>) -> bool;
```
## WithStatement::key\_eq

```rust
pub fn key_eq(self: WithStatement, object: <any>) -> bool;
```
## WithStatement::to\_set

```rust
pub fn to_set(self: WithStatement) -> *WithStatement;
```
