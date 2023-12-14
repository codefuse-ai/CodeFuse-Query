# MemberExpression

Primary key: `id: int`

```rust
schema MemberExpression {
  @primary id: int,
}
```
## MemberExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: MemberExpression) -> *Node;
```
## MemberExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MemberExpression) -> int;
```
## MemberExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: MemberExpression) -> string;
```
## MemberExpression::getExpression

```rust
pub fn getExpression(self: MemberExpression) -> Expression;
```
## MemberExpression::getIndex

```rust
pub fn getIndex(self: MemberExpression) -> int;
```
## MemberExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: MemberExpression) -> int;
```
## MemberExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: MemberExpression, level: int) -> Node;
```
## MemberExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: MemberExpression) -> File;
```
## MemberExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MemberExpression) -> int;
```
## MemberExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: MemberExpression) -> FunctionLikeDeclaration;
```
## MemberExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: MemberExpression) -> *Comment;
```
## MemberExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: MemberExpression) -> *Comment;
```
## MemberExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MemberExpression) -> *FunctionLikeDeclaration;
```
## MemberExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: MemberExpression, level: int) -> *Node;
```
## MemberExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: MemberExpression) -> int;
```
## MemberExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: MemberExpression) -> *Modifier;
```
## MemberExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MemberExpression) -> int;
```
## MemberExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MemberExpression) -> int;
```
## MemberExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: MemberExpression, i: int) -> Node;
```
## MemberExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: MemberExpression, i: int) -> Decorator;
```
## MemberExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: MemberExpression) -> TopLevelDO;
```
## MemberExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: MemberExpression) -> int;
```
## MemberExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: MemberExpression) -> Node;
```
## MemberExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: MemberExpression) -> Node;
```
## MemberExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: MemberExpression) -> *Node;
```
## MemberExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: MemberExpression) -> *Node;
```
## MemberExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: MemberExpression) -> *Comment;
```
## MemberExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: MemberExpression) -> Symbol;
```
## MemberExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: MemberExpression) -> *Decorator;
```
## MemberExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: MemberExpression) -> Location;
```
## MemberExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *MemberExpression;
```
## MemberExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: MemberExpression, i: int) -> Modifier;
```
## MemberExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: MemberExpression) -> string;
```
## MemberExpression::is\<T\>

```rust
pub fn is<T>(self: MemberExpression) -> bool;
```
## MemberExpression::to\<T\>

```rust
pub fn to<T>(self: MemberExpression) -> <any>;
```
## MemberExpression::key\_neq

```rust
pub fn key_neq(self: MemberExpression, object: <any>) -> bool;
```
## MemberExpression::key\_eq

```rust
pub fn key_eq(self: MemberExpression, object: <any>) -> bool;
```
## MemberExpression::to\_set

```rust
pub fn to_set(self: MemberExpression) -> *MemberExpression;
```
