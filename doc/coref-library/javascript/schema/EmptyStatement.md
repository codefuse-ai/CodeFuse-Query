# EmptyStatement

Primary key: `id: int`

```rust
schema EmptyStatement {
  @primary id: int,
}
```
## EmptyStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: EmptyStatement) -> Location;
```
## EmptyStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: EmptyStatement) -> Symbol;
```
## EmptyStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: EmptyStatement) -> *Decorator;
```
## EmptyStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: EmptyStatement) -> string;
```
## EmptyStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: EmptyStatement, i: int) -> Modifier;
```
## EmptyStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: EmptyStatement) -> *Comment;
```
## EmptyStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: EmptyStatement) -> *Node;
```
## EmptyStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: EmptyStatement) -> *Node;
```
## EmptyStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: EmptyStatement) -> Node;
```
## EmptyStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: EmptyStatement) -> int;
```
## EmptyStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: EmptyStatement) -> TopLevelDO;
```
## EmptyStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: EmptyStatement, i: int) -> Decorator;
```
## EmptyStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: EmptyStatement) -> int;
```
## EmptyStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: EmptyStatement) -> *Modifier;
```
## EmptyStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: EmptyStatement) -> int;
```
## EmptyStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: EmptyStatement, i: int) -> Node;
```
## EmptyStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: EmptyStatement) -> int;
```
## EmptyStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: EmptyStatement) -> *FunctionLikeDeclaration;
```
## EmptyStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: EmptyStatement, level: int) -> *Node;
```
## EmptyStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: EmptyStatement) -> int;
```
## EmptyStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: EmptyStatement) -> string;
```
## EmptyStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: EmptyStatement, level: int) -> Node;
```
## EmptyStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: EmptyStatement) -> File;
```
## EmptyStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: EmptyStatement) -> *Comment;
```
## EmptyStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: EmptyStatement) -> *Comment;
```
## EmptyStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: EmptyStatement) -> Node;
```
## EmptyStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: EmptyStatement) -> FunctionLikeDeclaration;
```
## EmptyStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: EmptyStatement) -> int;
```
## EmptyStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: EmptyStatement) -> int;
```
## EmptyStatement::getIndex

```rust
pub fn getIndex(self: EmptyStatement) -> int;
```
## EmptyStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: EmptyStatement) -> *Node;
```
## EmptyStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *EmptyStatement;
```
## EmptyStatement::is\<T\>

```rust
pub fn is<T>(self: EmptyStatement) -> bool;
```
## EmptyStatement::to\<T\>

```rust
pub fn to<T>(self: EmptyStatement) -> <any>;
```
## EmptyStatement::key\_neq

```rust
pub fn key_neq(self: EmptyStatement, object: <any>) -> bool;
```
## EmptyStatement::key\_eq

```rust
pub fn key_eq(self: EmptyStatement, object: <any>) -> bool;
```
## EmptyStatement::to\_set

```rust
pub fn to_set(self: EmptyStatement) -> *EmptyStatement;
```
