# LiteralExpression

Primary key: `id: int`

```rust
schema LiteralExpression {
  @primary id: int,
}
```
## LiteralExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: LiteralExpression) -> *Node;
```
## LiteralExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LiteralExpression) -> int;
```
## LiteralExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: LiteralExpression) -> string;
```
## LiteralExpression::getExpression

```rust
pub fn getExpression(self: LiteralExpression) -> Expression;
```
## LiteralExpression::getIndex

```rust
pub fn getIndex(self: LiteralExpression) -> int;
```
## LiteralExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: LiteralExpression) -> int;
```
## LiteralExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: LiteralExpression, level: int) -> Node;
```
## LiteralExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: LiteralExpression) -> File;
```
## LiteralExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LiteralExpression) -> int;
```
## LiteralExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: LiteralExpression) -> FunctionLikeDeclaration;
```
## LiteralExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: LiteralExpression) -> *Comment;
```
## LiteralExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: LiteralExpression) -> *Comment;
```
## LiteralExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: LiteralExpression, level: int) -> *Node;
```
## LiteralExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LiteralExpression) -> *FunctionLikeDeclaration;
```
## LiteralExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LiteralExpression) -> int;
```
## LiteralExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: LiteralExpression, i: int) -> Node;
```
## LiteralExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LiteralExpression) -> int;
```
## LiteralExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: LiteralExpression) -> int;
```
## LiteralExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: LiteralExpression) -> *Modifier;
```
## LiteralExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: LiteralExpression, i: int) -> Decorator;
```
## LiteralExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: LiteralExpression) -> TopLevelDO;
```
## LiteralExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: LiteralExpression) -> int;
```
## LiteralExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: LiteralExpression) -> Node;
```
## LiteralExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: LiteralExpression) -> *Node;
```
## LiteralExpression::getValue

```rust
/**
     * Gets the value of this literal, as a string.
     */
```
```rust
pub fn getValue(self: LiteralExpression) -> string;
```
## LiteralExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: LiteralExpression) -> *Node;
```
## LiteralExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: LiteralExpression) -> *Comment;
```
## LiteralExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: LiteralExpression) -> Symbol;
```
## LiteralExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: LiteralExpression) -> *Decorator;
```
## LiteralExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: LiteralExpression) -> Location;
```
## LiteralExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *LiteralExpression;
```
## LiteralExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: LiteralExpression, i: int) -> Modifier;
```
## LiteralExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: LiteralExpression) -> string;
```
## LiteralExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: LiteralExpression) -> Node;
```
## LiteralExpression::is\<T\>

```rust
pub fn is<T>(self: LiteralExpression) -> bool;
```
## LiteralExpression::to\<T\>

```rust
pub fn to<T>(self: LiteralExpression) -> <any>;
```
## LiteralExpression::key\_neq

```rust
pub fn key_neq(self: LiteralExpression, object: <any>) -> bool;
```
## LiteralExpression::key\_eq

```rust
pub fn key_eq(self: LiteralExpression, object: <any>) -> bool;
```
## LiteralExpression::to\_set

```rust
pub fn to_set(self: LiteralExpression) -> *LiteralExpression;
```
