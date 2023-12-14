# BreakStatement

Primary key: `id: int`

```rust
schema BreakStatement {
  @primary id: int,
}
```
## BreakStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BreakStatement) -> Location;
```
## BreakStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BreakStatement) -> Symbol;
```
## BreakStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BreakStatement) -> *Decorator;
```
## BreakStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BreakStatement) -> string;
```
## BreakStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BreakStatement, i: int) -> Modifier;
```
## BreakStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BreakStatement) -> *Comment;
```
## BreakStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BreakStatement) -> *Node;
```
## BreakStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BreakStatement) -> *Node;
```
## BreakStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BreakStatement) -> Node;
```
## BreakStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BreakStatement) -> int;
```
## BreakStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BreakStatement) -> TopLevelDO;
```
## BreakStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BreakStatement, i: int) -> Decorator;
```
## BreakStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BreakStatement) -> int;
```
## BreakStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BreakStatement) -> *Modifier;
```
## BreakStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BreakStatement) -> int;
```
## BreakStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BreakStatement, i: int) -> Node;
```
## BreakStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BreakStatement) -> int;
```
## BreakStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BreakStatement) -> *FunctionLikeDeclaration;
```
## BreakStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BreakStatement, level: int) -> *Node;
```
## BreakStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BreakStatement) -> int;
```
## BreakStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BreakStatement) -> string;
```
## BreakStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BreakStatement, level: int) -> Node;
```
## BreakStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BreakStatement) -> File;
```
## BreakStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BreakStatement) -> *Comment;
```
## BreakStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BreakStatement) -> *Comment;
```
## BreakStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BreakStatement) -> Node;
```
## BreakStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BreakStatement) -> FunctionLikeDeclaration;
```
## BreakStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BreakStatement) -> int;
```
## BreakStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BreakStatement) -> int;
```
## BreakStatement::getIndex

```rust
pub fn getIndex(self: BreakStatement) -> int;
```
## BreakStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BreakStatement) -> *Node;
```
## BreakStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BreakStatement;
```
## BreakStatement::is\<T\>

```rust
pub fn is<T>(self: BreakStatement) -> bool;
```
## BreakStatement::to\<T\>

```rust
pub fn to<T>(self: BreakStatement) -> <any>;
```
## BreakStatement::key\_neq

```rust
pub fn key_neq(self: BreakStatement, object: <any>) -> bool;
```
## BreakStatement::key\_eq

```rust
pub fn key_eq(self: BreakStatement, object: <any>) -> bool;
```
## BreakStatement::to\_set

```rust
pub fn to_set(self: BreakStatement) -> *BreakStatement;
```
