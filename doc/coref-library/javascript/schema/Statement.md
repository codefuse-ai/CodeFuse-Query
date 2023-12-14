# Statement

Primary key: `id: int`

```rust
schema Statement {
  @primary id: int,
}
```
## Statement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: Statement) -> *Node;
```
## Statement::getIndex

```rust
pub fn getIndex(self: Statement) -> int;
```
## Statement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: Statement) -> int;
```
## Statement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: Statement) -> int;
```
## Statement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: Statement) -> Node;
```
## Statement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: Statement) -> FunctionLikeDeclaration;
```
## Statement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: Statement) -> File;
```
## Statement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: Statement, level: int) -> Node;
```
## Statement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: Statement) -> string;
```
## Statement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: Statement) -> int;
```
## Statement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: Statement) -> *FunctionLikeDeclaration;
```
## Statement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: Statement, level: int) -> *Node;
```
## Statement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: Statement) -> int;
```
## Statement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: Statement) -> *Modifier;
```
## Statement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: Statement) -> int;
```
## Statement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: Statement) -> int;
```
## Statement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: Statement, i: int) -> Node;
```
## Statement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: Statement, i: int) -> Decorator;
```
## Statement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: Statement) -> TopLevelDO;
```
## Statement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: Statement) -> int;
```
## Statement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: Statement) -> *Comment;
```
## Statement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: Statement) -> *Comment;
```
## Statement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: Statement) -> Node;
```
## Statement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: Statement) -> *Node;
```
## Statement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: Statement) -> *Node;
```
## Statement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: Statement) -> *Comment;
```
## Statement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: Statement, i: int) -> Modifier;
```
## Statement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: Statement) -> string;
```
## Statement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: Statement) -> *Decorator;
```
## Statement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: Statement) -> Symbol;
```
## Statement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: Statement) -> Location;
```
## Statement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *Statement;
```
## Statement::is\<T\>

```rust
pub fn is<T>(self: Statement) -> bool;
```
## Statement::to\<T\>

```rust
pub fn to<T>(self: Statement) -> <any>;
```
## Statement::key\_neq

```rust
pub fn key_neq(self: Statement, object: <any>) -> bool;
```
## Statement::key\_eq

```rust
pub fn key_eq(self: Statement, object: <any>) -> bool;
```
## Statement::to\_set

```rust
pub fn to_set(self: Statement) -> *Statement;
```
