# NotEmittedStatement

Primary key: `id: int`

```rust
schema NotEmittedStatement {
  @primary id: int,
}
```
## NotEmittedStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NotEmittedStatement) -> Location;
```
## NotEmittedStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NotEmittedStatement) -> Symbol;
```
## NotEmittedStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NotEmittedStatement) -> *Decorator;
```
## NotEmittedStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NotEmittedStatement) -> string;
```
## NotEmittedStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NotEmittedStatement, i: int) -> Modifier;
```
## NotEmittedStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NotEmittedStatement) -> *Comment;
```
## NotEmittedStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NotEmittedStatement) -> *Node;
```
## NotEmittedStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NotEmittedStatement) -> *Node;
```
## NotEmittedStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NotEmittedStatement) -> Node;
```
## NotEmittedStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NotEmittedStatement) -> int;
```
## NotEmittedStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NotEmittedStatement) -> TopLevelDO;
```
## NotEmittedStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NotEmittedStatement, i: int) -> Decorator;
```
## NotEmittedStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NotEmittedStatement) -> int;
```
## NotEmittedStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NotEmittedStatement) -> *Modifier;
```
## NotEmittedStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NotEmittedStatement) -> int;
```
## NotEmittedStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NotEmittedStatement, i: int) -> Node;
```
## NotEmittedStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NotEmittedStatement) -> int;
```
## NotEmittedStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NotEmittedStatement) -> *FunctionLikeDeclaration;
```
## NotEmittedStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NotEmittedStatement, level: int) -> *Node;
```
## NotEmittedStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NotEmittedStatement) -> int;
```
## NotEmittedStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NotEmittedStatement) -> string;
```
## NotEmittedStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NotEmittedStatement, level: int) -> Node;
```
## NotEmittedStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NotEmittedStatement) -> File;
```
## NotEmittedStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NotEmittedStatement) -> *Comment;
```
## NotEmittedStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NotEmittedStatement) -> *Comment;
```
## NotEmittedStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NotEmittedStatement) -> Node;
```
## NotEmittedStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NotEmittedStatement) -> FunctionLikeDeclaration;
```
## NotEmittedStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NotEmittedStatement) -> int;
```
## NotEmittedStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NotEmittedStatement) -> int;
```
## NotEmittedStatement::getIndex

```rust
pub fn getIndex(self: NotEmittedStatement) -> int;
```
## NotEmittedStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NotEmittedStatement) -> *Node;
```
## NotEmittedStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NotEmittedStatement;
```
## NotEmittedStatement::is\<T\>

```rust
pub fn is<T>(self: NotEmittedStatement) -> bool;
```
## NotEmittedStatement::to\<T\>

```rust
pub fn to<T>(self: NotEmittedStatement) -> <any>;
```
## NotEmittedStatement::key\_neq

```rust
pub fn key_neq(self: NotEmittedStatement, object: <any>) -> bool;
```
## NotEmittedStatement::key\_eq

```rust
pub fn key_eq(self: NotEmittedStatement, object: <any>) -> bool;
```
## NotEmittedStatement::to\_set

```rust
pub fn to_set(self: NotEmittedStatement) -> *NotEmittedStatement;
```
