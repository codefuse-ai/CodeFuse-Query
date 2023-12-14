# RegularExpressionLiteral

Primary key: `id: int`

```rust
schema RegularExpressionLiteral {
  @primary id: int,
}
```
## RegularExpressionLiteral::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: RegularExpressionLiteral) -> Node;
```
## RegularExpressionLiteral::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: RegularExpressionLiteral) -> string;
```
## RegularExpressionLiteral::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: RegularExpressionLiteral, i: int) -> Modifier;
```
## RegularExpressionLiteral::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: RegularExpressionLiteral) -> Location;
```
## RegularExpressionLiteral::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: RegularExpressionLiteral) -> *Decorator;
```
## RegularExpressionLiteral::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: RegularExpressionLiteral) -> Symbol;
```
## RegularExpressionLiteral::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: RegularExpressionLiteral) -> *Comment;
```
## RegularExpressionLiteral::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: RegularExpressionLiteral) -> *Node;
```
## RegularExpressionLiteral::getValue

```rust
/**
     * Gets the value of this literal, as a string.
     */
```
```rust
pub fn getValue(self: RegularExpressionLiteral) -> string;
```
## RegularExpressionLiteral::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: RegularExpressionLiteral) -> *Node;
```
## RegularExpressionLiteral::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: RegularExpressionLiteral) -> Node;
```
## RegularExpressionLiteral::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: RegularExpressionLiteral) -> int;
```
## RegularExpressionLiteral::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: RegularExpressionLiteral) -> TopLevelDO;
```
## RegularExpressionLiteral::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: RegularExpressionLiteral, i: int) -> Decorator;
```
## RegularExpressionLiteral::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: RegularExpressionLiteral) -> int;
```
## RegularExpressionLiteral::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RegularExpressionLiteral) -> int;
```
## RegularExpressionLiteral::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: RegularExpressionLiteral) -> *Modifier;
```
## RegularExpressionLiteral::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: RegularExpressionLiteral, i: int) -> Node;
```
## RegularExpressionLiteral::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RegularExpressionLiteral) -> int;
```
## RegularExpressionLiteral::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: RegularExpressionLiteral, level: int) -> *Node;
```
## RegularExpressionLiteral::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RegularExpressionLiteral) -> *FunctionLikeDeclaration;
```
## RegularExpressionLiteral::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: RegularExpressionLiteral) -> *Comment;
```
## RegularExpressionLiteral::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: RegularExpressionLiteral) -> *Comment;
```
## RegularExpressionLiteral::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: RegularExpressionLiteral) -> FunctionLikeDeclaration;
```
## RegularExpressionLiteral::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RegularExpressionLiteral) -> int;
```
## RegularExpressionLiteral::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: RegularExpressionLiteral) -> File;
```
## RegularExpressionLiteral::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: RegularExpressionLiteral, level: int) -> Node;
```
## RegularExpressionLiteral::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: RegularExpressionLiteral) -> int;
```
## RegularExpressionLiteral::getIndex

```rust
pub fn getIndex(self: RegularExpressionLiteral) -> int;
```
## RegularExpressionLiteral::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *RegularExpressionLiteral;
```
## RegularExpressionLiteral::getExpression

```rust
pub fn getExpression(self: RegularExpressionLiteral) -> Expression;
```
## RegularExpressionLiteral::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: RegularExpressionLiteral) -> string;
```
## RegularExpressionLiteral::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RegularExpressionLiteral) -> int;
```
## RegularExpressionLiteral::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: RegularExpressionLiteral) -> *Node;
```
## RegularExpressionLiteral::is\<T\>

```rust
pub fn is<T>(self: RegularExpressionLiteral) -> bool;
```
## RegularExpressionLiteral::to\<T\>

```rust
pub fn to<T>(self: RegularExpressionLiteral) -> <any>;
```
## RegularExpressionLiteral::key\_neq

```rust
pub fn key_neq(self: RegularExpressionLiteral, object: <any>) -> bool;
```
## RegularExpressionLiteral::key\_eq

```rust
pub fn key_eq(self: RegularExpressionLiteral, object: <any>) -> bool;
```
## RegularExpressionLiteral::to\_set

```rust
pub fn to_set(self: RegularExpressionLiteral) -> *RegularExpressionLiteral;
```
