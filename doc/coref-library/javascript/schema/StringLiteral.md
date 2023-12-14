# StringLiteral

Primary key: `id: int`

```rust
schema StringLiteral {
  @primary id: int,
}
```
## StringLiteral::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: StringLiteral) -> Node;
```
## StringLiteral::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: StringLiteral) -> Location;
```
## StringLiteral::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: StringLiteral) -> *Decorator;
```
## StringLiteral::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: StringLiteral) -> Symbol;
```
## StringLiteral::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: StringLiteral) -> *Comment;
```
## StringLiteral::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: StringLiteral) -> *Node;
```
## StringLiteral::getValue

```rust
/**
     * Gets the value of this literal, as a string.
     */
```
```rust
pub fn getValue(self: StringLiteral) -> string;
```
## StringLiteral::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: StringLiteral) -> *Node;
```
## StringLiteral::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: StringLiteral) -> Node;
```
## StringLiteral::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: StringLiteral) -> int;
```
## StringLiteral::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: StringLiteral) -> TopLevelDO;
```
## StringLiteral::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: StringLiteral, i: int) -> Decorator;
```
## StringLiteral::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: StringLiteral) -> int;
```
## StringLiteral::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: StringLiteral) -> int;
```
## StringLiteral::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: StringLiteral) -> *Modifier;
```
## StringLiteral::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: StringLiteral, i: int) -> Node;
```
## StringLiteral::getStartLineNumber

```rust
pub fn getStartLineNumber(self: StringLiteral) -> int;
```
## StringLiteral::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: StringLiteral, level: int) -> *Node;
```
## StringLiteral::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: StringLiteral) -> *FunctionLikeDeclaration;
```
## StringLiteral::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: StringLiteral) -> *Comment;
```
## StringLiteral::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: StringLiteral) -> *Comment;
```
## StringLiteral::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: StringLiteral) -> FunctionLikeDeclaration;
```
## StringLiteral::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: StringLiteral) -> int;
```
## StringLiteral::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: StringLiteral) -> File;
```
## StringLiteral::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: StringLiteral, level: int) -> Node;
```
## StringLiteral::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: StringLiteral) -> int;
```
## StringLiteral::getIndex

```rust
pub fn getIndex(self: StringLiteral) -> int;
```
## StringLiteral::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *StringLiteral;
```
## StringLiteral::getEndLineNumber

```rust
pub fn getEndLineNumber(self: StringLiteral) -> int;
```
## StringLiteral::getExpression

```rust
pub fn getExpression(self: StringLiteral) -> Expression;
```
## StringLiteral::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: StringLiteral) -> string;
```
## StringLiteral::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: StringLiteral) -> *Node;
```
## StringLiteral::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: StringLiteral) -> string;
```
## StringLiteral::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: StringLiteral, i: int) -> Modifier;
```
## StringLiteral::getString

```rust
pub fn getString(self: StringLiteral) -> string;
```
## StringLiteral::is\<T\>

```rust
pub fn is<T>(self: StringLiteral) -> bool;
```
## StringLiteral::to\<T\>

```rust
pub fn to<T>(self: StringLiteral) -> <any>;
```
## StringLiteral::key\_neq

```rust
pub fn key_neq(self: StringLiteral, object: <any>) -> bool;
```
## StringLiteral::key\_eq

```rust
pub fn key_eq(self: StringLiteral, object: <any>) -> bool;
```
## StringLiteral::to\_set

```rust
pub fn to_set(self: StringLiteral) -> *StringLiteral;
```
