# Decorator

Primary key: `id: int`

```rust
schema Decorator {
  @primary id: int,
}
```
## Decorator::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: Decorator) -> *Node;
```
## Decorator::getIndex

```rust
pub fn getIndex(self: Decorator) -> int;
```
## Decorator::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: Decorator) -> int;
```
## Decorator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: Decorator) -> int;
```
## Decorator::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: Decorator) -> Node;
```
## Decorator::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: Decorator) -> FunctionLikeDeclaration;
```
## Decorator::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: Decorator) -> File;
```
## Decorator::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: Decorator, level: int) -> Node;
```
## Decorator::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: Decorator) -> Location;
```
## Decorator::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: Decorator) -> *FunctionLikeDeclaration;
```
## Decorator::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: Decorator, level: int) -> *Node;
```
## Decorator::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: Decorator) -> int;
```
## Decorator::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: Decorator) -> *Modifier;
```
## Decorator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: Decorator) -> int;
```
## Decorator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: Decorator) -> int;
```
## Decorator::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: Decorator, i: int) -> Node;
```
## Decorator::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: Decorator) -> int;
```
## Decorator::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: Decorator) -> TopLevelDO;
```
## Decorator::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: Decorator, i: int) -> Decorator;
```
## Decorator::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: Decorator) -> *Comment;
```
## Decorator::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: Decorator) -> *Comment;
```
## Decorator::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: Decorator) -> *Node;
```
## Decorator::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: Decorator) -> Node;
```
## Decorator::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: Decorator, i: int) -> Modifier;
```
## Decorator::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: Decorator) -> string;
```
## Decorator::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: Decorator) -> Symbol;
```
## Decorator::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: Decorator) -> *Decorator;
```
## Decorator::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: Decorator) -> *Node;
```
## Decorator::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: Decorator) -> *Comment;
```
## Decorator::getCallee

```rust
/**
     * Gets the callee of this decorator.
     */
```
```rust
pub fn getCallee(self: Decorator) -> FunctionLikeDeclaration;
```
## Decorator::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *Decorator;
```
## Decorator::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: Decorator) -> string;
```
## Decorator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: Decorator) -> int;
```
## Decorator::getExpression

```rust
/**
     * Gets the expression.
     */
```
```rust
pub fn getExpression(self: Decorator) -> LeftHandSideExpression;
```
## Decorator::is\<T\>

```rust
pub fn is<T>(self: Decorator) -> bool;
```
## Decorator::to\<T\>

```rust
pub fn to<T>(self: Decorator) -> <any>;
```
## Decorator::key\_neq

```rust
pub fn key_neq(self: Decorator, object: <any>) -> bool;
```
## Decorator::key\_eq

```rust
pub fn key_eq(self: Decorator, object: <any>) -> bool;
```
## Decorator::to\_set

```rust
pub fn to_set(self: Decorator) -> *Decorator;
```
