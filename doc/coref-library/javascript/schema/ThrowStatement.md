# ThrowStatement

Primary key: `id: int`

```rust
schema ThrowStatement {
  @primary id: int,
}
```
## ThrowStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ThrowStatement) -> Location;
```
## ThrowStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ThrowStatement) -> Symbol;
```
## ThrowStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ThrowStatement) -> *Decorator;
```
## ThrowStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ThrowStatement) -> string;
```
## ThrowStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ThrowStatement, i: int) -> Modifier;
```
## ThrowStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ThrowStatement) -> *Comment;
```
## ThrowStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ThrowStatement) -> *Node;
```
## ThrowStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ThrowStatement) -> *Node;
```
## ThrowStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ThrowStatement) -> Node;
```
## ThrowStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ThrowStatement) -> int;
```
## ThrowStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ThrowStatement) -> TopLevelDO;
```
## ThrowStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ThrowStatement, i: int) -> Decorator;
```
## ThrowStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ThrowStatement) -> int;
```
## ThrowStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ThrowStatement) -> *Modifier;
```
## ThrowStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ThrowStatement) -> int;
```
## ThrowStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ThrowStatement, i: int) -> Node;
```
## ThrowStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ThrowStatement) -> int;
```
## ThrowStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ThrowStatement, level: int) -> *Node;
```
## ThrowStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ThrowStatement) -> *FunctionLikeDeclaration;
```
## ThrowStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ThrowStatement) -> *Comment;
```
## ThrowStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ThrowStatement) -> *Comment;
```
## ThrowStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ThrowStatement) -> Node;
```
## ThrowStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ThrowStatement) -> int;
```
## ThrowStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ThrowStatement) -> FunctionLikeDeclaration;
```
## ThrowStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ThrowStatement) -> File;
```
## ThrowStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ThrowStatement, level: int) -> Node;
```
## ThrowStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ThrowStatement) -> int;
```
## ThrowStatement::getIndex

```rust
pub fn getIndex(self: ThrowStatement) -> int;
```
## ThrowStatement::getExpression

```rust
/**
     * Gets the expression throwed by this ThrowStatement.
     */
```
```rust
pub fn getExpression(self: ThrowStatement) -> Expression;
```
## ThrowStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ThrowStatement) -> string;
```
## ThrowStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ThrowStatement) -> int;
```
## ThrowStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ThrowStatement) -> *Node;
```
## ThrowStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ThrowStatement;
```
## ThrowStatement::is\<T\>

```rust
pub fn is<T>(self: ThrowStatement) -> bool;
```
## ThrowStatement::to\<T\>

```rust
pub fn to<T>(self: ThrowStatement) -> <any>;
```
## ThrowStatement::key\_neq

```rust
pub fn key_neq(self: ThrowStatement, object: <any>) -> bool;
```
## ThrowStatement::key\_eq

```rust
pub fn key_eq(self: ThrowStatement, object: <any>) -> bool;
```
## ThrowStatement::to\_set

```rust
pub fn to_set(self: ThrowStatement) -> *ThrowStatement;
```
