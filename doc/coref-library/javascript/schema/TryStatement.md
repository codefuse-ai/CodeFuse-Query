# TryStatement

Primary key: `id: int`

```rust
schema TryStatement {
  @primary id: int,
}
```
## TryStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TryStatement) -> Location;
```
## TryStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TryStatement) -> Symbol;
```
## TryStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TryStatement) -> *Decorator;
```
## TryStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TryStatement) -> string;
```
## TryStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TryStatement, i: int) -> Modifier;
```
## TryStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TryStatement) -> *Comment;
```
## TryStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TryStatement) -> *Node;
```
## TryStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TryStatement) -> *Comment;
```
## TryStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TryStatement) -> *Comment;
```
## TryStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TryStatement) -> int;
```
## TryStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TryStatement) -> TopLevelDO;
```
## TryStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TryStatement, i: int) -> Decorator;
```
## TryStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TryStatement) -> int;
```
## TryStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TryStatement) -> *Modifier;
```
## TryStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TryStatement) -> int;
```
## TryStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TryStatement, i: int) -> Node;
```
## TryStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TryStatement) -> int;
```
## TryStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TryStatement) -> *FunctionLikeDeclaration;
```
## TryStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TryStatement, level: int) -> *Node;
```
## TryStatement::getTryBlock

```rust
/** 
     * Gets the body of this `try` statement. 
     */
```
```rust
pub fn getTryBlock(self: TryStatement) -> BlockStatement;
```
## TryStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TryStatement) -> int;
```
## TryStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TryStatement) -> string;
```
## TryStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TryStatement, level: int) -> Node;
```
## TryStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TryStatement) -> File;
```
## TryStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TryStatement) -> int;
```
## TryStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TryStatement) -> Node;
```
## TryStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TryStatement) -> FunctionLikeDeclaration;
```
## TryStatement::haveFinallyBlock

```rust
/**
     * Determine whether this TryStatement has finally block or not.
     */
```
```rust
pub fn haveFinallyBlock(self: TryStatement) -> bool;
```
## TryStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TryStatement) -> *Node;
```
## TryStatement::getCatchClause

```rust
/** 
     * Gets the `catch` clause of this `try` statement, if any. 
     */
```
```rust
pub fn getCatchClause(self: TryStatement) -> CatchClause;
```
## TryStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TryStatement) -> *Node;
```
## TryStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TryStatement) -> Node;
```
## TryStatement::getFinallyBlock

```rust
/** 
     * Gets the `finally` block of this `try` statement, if any. 
     */
```
```rust
pub fn getFinallyBlock(self: TryStatement) -> BlockStatement;
```
## TryStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TryStatement;
```
## TryStatement::getIndex

```rust
pub fn getIndex(self: TryStatement) -> int;
```
## TryStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TryStatement) -> int;
```
## TryStatement::is\<T\>

```rust
pub fn is<T>(self: TryStatement) -> bool;
```
## TryStatement::to\<T\>

```rust
pub fn to<T>(self: TryStatement) -> <any>;
```
## TryStatement::key\_neq

```rust
pub fn key_neq(self: TryStatement, object: <any>) -> bool;
```
## TryStatement::key\_eq

```rust
pub fn key_eq(self: TryStatement, object: <any>) -> bool;
```
## TryStatement::to\_set

```rust
pub fn to_set(self: TryStatement) -> *TryStatement;
```
