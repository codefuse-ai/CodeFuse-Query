# CatchClause

Primary key: `id: int`

```rust
schema CatchClause {
  @primary id: int,
}
```
## CatchClause::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: CatchClause) -> Location;
```
## CatchClause::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: CatchClause) -> Symbol;
```
## CatchClause::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: CatchClause) -> *Decorator;
```
## CatchClause::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: CatchClause) -> string;
```
## CatchClause::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: CatchClause, i: int) -> Modifier;
```
## CatchClause::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: CatchClause) -> *Comment;
```
## CatchClause::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: CatchClause) -> *Node;
```
## CatchClause::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: CatchClause) -> *Comment;
```
## CatchClause::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: CatchClause) -> *Comment;
```
## CatchClause::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: CatchClause) -> int;
```
## CatchClause::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: CatchClause, i: int) -> Decorator;
```
## CatchClause::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: CatchClause) -> TopLevelDO;
```
## CatchClause::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: CatchClause) -> int;
```
## CatchClause::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: CatchClause) -> *Modifier;
```
## CatchClause::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CatchClause) -> int;
```
## CatchClause::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: CatchClause, i: int) -> Node;
```
## CatchClause::getVariableDeclaration

```rust
/**
     * Gets the variable declaration of this CatchClause.
     */
```
```rust
pub fn getVariableDeclaration(self: CatchClause) -> VariableDeclaration;
```
## CatchClause::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CatchClause) -> int;
```
## CatchClause::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CatchClause) -> *FunctionLikeDeclaration;
```
## CatchClause::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: CatchClause, level: int) -> *Node;
```
## CatchClause::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CatchClause) -> int;
```
## CatchClause::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: CatchClause) -> string;
```
## CatchClause::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: CatchClause, level: int) -> Node;
```
## CatchClause::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: CatchClause) -> *Node;
```
## CatchClause::getBlock

```rust
/**
     * Gets the catch block of this CatchClause.
     */
```
```rust
pub fn getBlock(self: CatchClause) -> BlockStatement;
```
## CatchClause::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: CatchClause) -> File;
```
## CatchClause::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: CatchClause) -> Node;
```
## CatchClause::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: CatchClause) -> FunctionLikeDeclaration;
```
## CatchClause::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CatchClause) -> int;
```
## CatchClause::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: CatchClause) -> int;
```
## CatchClause::getIndex

```rust
pub fn getIndex(self: CatchClause) -> int;
```
## CatchClause::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: CatchClause) -> *Node;
```
## CatchClause::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: CatchClause) -> Node;
```
## CatchClause::haveVariableDeclaration

```rust
/**
     * Determine this CatchClause has variable declaration or not.
     */
```
```rust
pub fn haveVariableDeclaration(self: CatchClause) -> bool;
```
## CatchClause::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *CatchClause;
```
## CatchClause::is\<T\>

```rust
pub fn is<T>(self: CatchClause) -> bool;
```
## CatchClause::to\<T\>

```rust
pub fn to<T>(self: CatchClause) -> <any>;
```
## CatchClause::key\_neq

```rust
pub fn key_neq(self: CatchClause, object: <any>) -> bool;
```
## CatchClause::key\_eq

```rust
pub fn key_eq(self: CatchClause, object: <any>) -> bool;
```
## CatchClause::to\_set

```rust
pub fn to_set(self: CatchClause) -> *CatchClause;
```
