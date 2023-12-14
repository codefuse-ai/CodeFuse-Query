# MayInvokeExpression

Primary key: `id: int`

```rust
schema MayInvokeExpression {
  @primary id: int,
}
```
## MayInvokeExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: MayInvokeExpression) -> Location;
```
## MayInvokeExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: MayInvokeExpression) -> Symbol;
```
## MayInvokeExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: MayInvokeExpression) -> *Decorator;
```
## MayInvokeExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: MayInvokeExpression) -> string;
```
## MayInvokeExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: MayInvokeExpression, i: int) -> Modifier;
```
## MayInvokeExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: MayInvokeExpression) -> *Comment;
```
## MayInvokeExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: MayInvokeExpression) -> *Node;
```
## MayInvokeExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: MayInvokeExpression) -> *Comment;
```
## MayInvokeExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: MayInvokeExpression) -> *Comment;
```
## MayInvokeExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: MayInvokeExpression) -> int;
```
## MayInvokeExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: MayInvokeExpression) -> TopLevelDO;
```
## MayInvokeExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: MayInvokeExpression, i: int) -> Decorator;
```
## MayInvokeExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: MayInvokeExpression) -> int;
```
## MayInvokeExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: MayInvokeExpression) -> *Modifier;
```
## MayInvokeExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MayInvokeExpression) -> int;
```
## MayInvokeExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: MayInvokeExpression, i: int) -> Node;
```
## MayInvokeExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MayInvokeExpression) -> int;
```
## MayInvokeExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MayInvokeExpression) -> *FunctionLikeDeclaration;
```
## MayInvokeExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: MayInvokeExpression, level: int) -> *Node;
```
## MayInvokeExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MayInvokeExpression) -> int;
```
## MayInvokeExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: MayInvokeExpression) -> string;
```
## MayInvokeExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: MayInvokeExpression, level: int) -> Node;
```
## MayInvokeExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: MayInvokeExpression) -> File;
```
## MayInvokeExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: MayInvokeExpression) -> Node;
```
## MayInvokeExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: MayInvokeExpression) -> FunctionLikeDeclaration;
```
## MayInvokeExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MayInvokeExpression) -> int;
```
## MayInvokeExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: MayInvokeExpression) -> int;
```
## MayInvokeExpression::getIndex

```rust
pub fn getIndex(self: MayInvokeExpression) -> int;
```
## MayInvokeExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: MayInvokeExpression) -> *Node;
```
## MayInvokeExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: MayInvokeExpression) -> Node;
```
## MayInvokeExpression::hasCallee

```rust
/**
     * Determine whether this MayInvokeExpression has a callee.
     */
```
```rust
pub fn hasCallee(self: MayInvokeExpression) -> bool;
```
## MayInvokeExpression::getCallee

```rust
/**
     * Gets the callee of this MayInvokeExpression.
     */
```
```rust
pub fn getCallee(self: MayInvokeExpression) -> FunctionLikeDeclaration;
```
## MayInvokeExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: MayInvokeExpression) -> *Node;
```
## MayInvokeExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *MayInvokeExpression;
```
## MayInvokeExpression::is\<T\>

```rust
pub fn is<T>(self: MayInvokeExpression) -> bool;
```
## MayInvokeExpression::to\<T\>

```rust
pub fn to<T>(self: MayInvokeExpression) -> <any>;
```
## MayInvokeExpression::key\_neq

```rust
pub fn key_neq(self: MayInvokeExpression, object: <any>) -> bool;
```
## MayInvokeExpression::key\_eq

```rust
pub fn key_eq(self: MayInvokeExpression, object: <any>) -> bool;
```
## MayInvokeExpression::to\_set

```rust
pub fn to_set(self: MayInvokeExpression) -> *MayInvokeExpression;
```
