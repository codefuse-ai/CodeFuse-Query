# CallLikeExpression

Primary key: `id: int`

```rust
schema CallLikeExpression {
  @primary id: int,
}
```
## CallLikeExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: CallLikeExpression) -> Location;
```
## CallLikeExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: CallLikeExpression) -> Symbol;
```
## CallLikeExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: CallLikeExpression) -> *Decorator;
```
## CallLikeExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: CallLikeExpression) -> string;
```
## CallLikeExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: CallLikeExpression, i: int) -> Modifier;
```
## CallLikeExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: CallLikeExpression) -> *Comment;
```
## CallLikeExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: CallLikeExpression) -> *Node;
```
## CallLikeExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: CallLikeExpression) -> *Comment;
```
## CallLikeExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: CallLikeExpression) -> *Comment;
```
## CallLikeExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: CallLikeExpression) -> int;
```
## CallLikeExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: CallLikeExpression) -> TopLevelDO;
```
## CallLikeExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: CallLikeExpression, i: int) -> Decorator;
```
## CallLikeExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: CallLikeExpression) -> int;
```
## CallLikeExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: CallLikeExpression) -> *Modifier;
```
## CallLikeExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CallLikeExpression) -> int;
```
## CallLikeExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: CallLikeExpression, i: int) -> Node;
```
## CallLikeExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CallLikeExpression) -> int;
```
## CallLikeExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CallLikeExpression) -> *FunctionLikeDeclaration;
```
## CallLikeExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: CallLikeExpression, level: int) -> *Node;
```
## CallLikeExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CallLikeExpression) -> int;
```
## CallLikeExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: CallLikeExpression) -> string;
```
## CallLikeExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: CallLikeExpression, level: int) -> Node;
```
## CallLikeExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: CallLikeExpression) -> File;
```
## CallLikeExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: CallLikeExpression) -> Node;
```
## CallLikeExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: CallLikeExpression) -> FunctionLikeDeclaration;
```
## CallLikeExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CallLikeExpression) -> int;
```
## CallLikeExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: CallLikeExpression) -> int;
```
## CallLikeExpression::getIndex

```rust
pub fn getIndex(self: CallLikeExpression) -> int;
```
## CallLikeExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: CallLikeExpression) -> *Node;
```
## CallLikeExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: CallLikeExpression) -> Node;
```
## CallLikeExpression::hasCallee

```rust
/**
     * Determine whether this CallLikeExpression has a callee.
     */
```
```rust
pub fn hasCallee(self: CallLikeExpression) -> bool;
```
## CallLikeExpression::getCallee

```rust
/**
     * Gets the callee of this call-like expression.
     */
```
```rust
pub fn getCallee(self: CallLikeExpression) -> FunctionLikeDeclaration;
```
## CallLikeExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: CallLikeExpression) -> *Node;
```
## CallLikeExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *CallLikeExpression;
```
## CallLikeExpression::is\<T\>

```rust
pub fn is<T>(self: CallLikeExpression) -> bool;
```
## CallLikeExpression::to\<T\>

```rust
pub fn to<T>(self: CallLikeExpression) -> <any>;
```
## CallLikeExpression::key\_neq

```rust
pub fn key_neq(self: CallLikeExpression, object: <any>) -> bool;
```
## CallLikeExpression::key\_eq

```rust
pub fn key_eq(self: CallLikeExpression, object: <any>) -> bool;
```
## CallLikeExpression::to\_set

```rust
pub fn to_set(self: CallLikeExpression) -> *CallLikeExpression;
```
