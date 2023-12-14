# ExpressionStatement

Primary key: `id: int`

```rust
schema ExpressionStatement {
  @primary id: int,
}
```
## ExpressionStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ExpressionStatement) -> Location;
```
## ExpressionStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ExpressionStatement) -> Symbol;
```
## ExpressionStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ExpressionStatement) -> *Decorator;
```
## ExpressionStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ExpressionStatement) -> string;
```
## ExpressionStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ExpressionStatement, i: int) -> Modifier;
```
## ExpressionStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ExpressionStatement) -> *Comment;
```
## ExpressionStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ExpressionStatement) -> *Node;
```
## ExpressionStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ExpressionStatement) -> *Node;
```
## ExpressionStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ExpressionStatement) -> Node;
```
## ExpressionStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ExpressionStatement) -> TopLevelDO;
```
## ExpressionStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ExpressionStatement, i: int) -> Decorator;
```
## ExpressionStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ExpressionStatement) -> *Modifier;
```
## ExpressionStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ExpressionStatement, i: int) -> Node;
```
## ExpressionStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ExpressionStatement, level: int) -> *Node;
```
## ExpressionStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExpressionStatement) -> *FunctionLikeDeclaration;
```
## ExpressionStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ExpressionStatement) -> *Comment;
```
## ExpressionStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ExpressionStatement) -> *Comment;
```
## ExpressionStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ExpressionStatement) -> Node;
```
## ExpressionStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ExpressionStatement) -> FunctionLikeDeclaration;
```
## ExpressionStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ExpressionStatement) -> File;
```
## ExpressionStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ExpressionStatement, level: int) -> Node;
```
## ExpressionStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getIndex

```rust
pub fn getIndex(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getExpression

```rust
pub fn getExpression(self: ExpressionStatement) -> Expression;
```
## ExpressionStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ExpressionStatement) -> string;
```
## ExpressionStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ExpressionStatement) -> *Node;
```
## ExpressionStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ExpressionStatement;
```
## ExpressionStatement::is\<T\>

```rust
pub fn is<T>(self: ExpressionStatement) -> bool;
```
## ExpressionStatement::to\<T\>

```rust
pub fn to<T>(self: ExpressionStatement) -> <any>;
```
## ExpressionStatement::key\_neq

```rust
pub fn key_neq(self: ExpressionStatement, object: <any>) -> bool;
```
## ExpressionStatement::key\_eq

```rust
pub fn key_eq(self: ExpressionStatement, object: <any>) -> bool;
```
## ExpressionStatement::to\_set

```rust
pub fn to_set(self: ExpressionStatement) -> *ExpressionStatement;
```
