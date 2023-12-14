# ContinueStatement

Primary key: `id: int`

```rust
schema ContinueStatement {
  @primary id: int,
}
```
## ContinueStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ContinueStatement) -> Location;
```
## ContinueStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ContinueStatement) -> Symbol;
```
## ContinueStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ContinueStatement) -> *Decorator;
```
## ContinueStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ContinueStatement) -> string;
```
## ContinueStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ContinueStatement, i: int) -> Modifier;
```
## ContinueStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ContinueStatement) -> *Comment;
```
## ContinueStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ContinueStatement) -> *Node;
```
## ContinueStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ContinueStatement) -> *Node;
```
## ContinueStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ContinueStatement) -> Node;
```
## ContinueStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ContinueStatement) -> int;
```
## ContinueStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ContinueStatement) -> TopLevelDO;
```
## ContinueStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ContinueStatement, i: int) -> Decorator;
```
## ContinueStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ContinueStatement) -> int;
```
## ContinueStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ContinueStatement) -> *Modifier;
```
## ContinueStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ContinueStatement) -> int;
```
## ContinueStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ContinueStatement, i: int) -> Node;
```
## ContinueStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ContinueStatement) -> int;
```
## ContinueStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ContinueStatement) -> *FunctionLikeDeclaration;
```
## ContinueStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ContinueStatement, level: int) -> *Node;
```
## ContinueStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ContinueStatement) -> int;
```
## ContinueStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ContinueStatement) -> string;
```
## ContinueStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ContinueStatement, level: int) -> Node;
```
## ContinueStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ContinueStatement) -> File;
```
## ContinueStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ContinueStatement) -> *Comment;
```
## ContinueStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ContinueStatement) -> *Comment;
```
## ContinueStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ContinueStatement) -> Node;
```
## ContinueStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ContinueStatement) -> FunctionLikeDeclaration;
```
## ContinueStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ContinueStatement) -> int;
```
## ContinueStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ContinueStatement) -> int;
```
## ContinueStatement::getIndex

```rust
pub fn getIndex(self: ContinueStatement) -> int;
```
## ContinueStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ContinueStatement) -> *Node;
```
## ContinueStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ContinueStatement;
```
## ContinueStatement::is\<T\>

```rust
pub fn is<T>(self: ContinueStatement) -> bool;
```
## ContinueStatement::to\<T\>

```rust
pub fn to<T>(self: ContinueStatement) -> <any>;
```
## ContinueStatement::key\_neq

```rust
pub fn key_neq(self: ContinueStatement, object: <any>) -> bool;
```
## ContinueStatement::key\_eq

```rust
pub fn key_eq(self: ContinueStatement, object: <any>) -> bool;
```
## ContinueStatement::to\_set

```rust
pub fn to_set(self: ContinueStatement) -> *ContinueStatement;
```
