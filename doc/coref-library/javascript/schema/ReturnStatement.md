# ReturnStatement

Primary key: `id: int`

```rust
schema ReturnStatement {
  @primary id: int,
}
```
## ReturnStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ReturnStatement) -> Location;
```
## ReturnStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ReturnStatement) -> Symbol;
```
## ReturnStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ReturnStatement) -> *Decorator;
```
## ReturnStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ReturnStatement) -> string;
```
## ReturnStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ReturnStatement, i: int) -> Modifier;
```
## ReturnStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ReturnStatement) -> *Comment;
```
## ReturnStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ReturnStatement) -> *Node;
```
## ReturnStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ReturnStatement) -> *Node;
```
## ReturnStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ReturnStatement) -> Node;
```
## ReturnStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ReturnStatement) -> int;
```
## ReturnStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ReturnStatement) -> TopLevelDO;
```
## ReturnStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ReturnStatement, i: int) -> Decorator;
```
## ReturnStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ReturnStatement) -> int;
```
## ReturnStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ReturnStatement) -> *Modifier;
```
## ReturnStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ReturnStatement) -> int;
```
## ReturnStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ReturnStatement, i: int) -> Node;
```
## ReturnStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ReturnStatement) -> int;
```
## ReturnStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ReturnStatement, level: int) -> *Node;
```
## ReturnStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ReturnStatement) -> *FunctionLikeDeclaration;
```
## ReturnStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ReturnStatement) -> *Comment;
```
## ReturnStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ReturnStatement) -> *Comment;
```
## ReturnStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ReturnStatement) -> Node;
```
## ReturnStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ReturnStatement) -> int;
```
## ReturnStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ReturnStatement) -> FunctionLikeDeclaration;
```
## ReturnStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ReturnStatement) -> File;
```
## ReturnStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ReturnStatement, level: int) -> Node;
```
## ReturnStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ReturnStatement) -> int;
```
## ReturnStatement::getIndex

```rust
pub fn getIndex(self: ReturnStatement) -> int;
```
## ReturnStatement::getExpression

```rust
/**
     * Get the expression that specifies the returned value, if any.
     */
```
```rust
pub fn getExpression(self: ReturnStatement) -> Expression;
```
## ReturnStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ReturnStatement) -> string;
```
## ReturnStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ReturnStatement) -> int;
```
## ReturnStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ReturnStatement) -> *Node;
```
## ReturnStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ReturnStatement;
```
## ReturnStatement::is\<T\>

```rust
pub fn is<T>(self: ReturnStatement) -> bool;
```
## ReturnStatement::to\<T\>

```rust
pub fn to<T>(self: ReturnStatement) -> <any>;
```
## ReturnStatement::key\_neq

```rust
pub fn key_neq(self: ReturnStatement, object: <any>) -> bool;
```
## ReturnStatement::key\_eq

```rust
pub fn key_eq(self: ReturnStatement, object: <any>) -> bool;
```
## ReturnStatement::to\_set

```rust
pub fn to_set(self: ReturnStatement) -> *ReturnStatement;
```
