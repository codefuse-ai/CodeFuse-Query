# JsxExpression

Primary key: `id: int`

```rust
schema JsxExpression {
  @primary id: int,
}
```
## JsxExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: JsxExpression) -> Location;
```
## JsxExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: JsxExpression) -> Symbol;
```
## JsxExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: JsxExpression) -> *Decorator;
```
## JsxExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: JsxExpression) -> string;
```
## JsxExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: JsxExpression, i: int) -> Modifier;
```
## JsxExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: JsxExpression) -> *Comment;
```
## JsxExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: JsxExpression) -> *Node;
```
## JsxExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: JsxExpression) -> *Node;
```
## JsxExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: JsxExpression) -> Node;
```
## JsxExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: JsxExpression) -> int;
```
## JsxExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: JsxExpression) -> TopLevelDO;
```
## JsxExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: JsxExpression, i: int) -> Decorator;
```
## JsxExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: JsxExpression) -> int;
```
## JsxExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: JsxExpression) -> *Modifier;
```
## JsxExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: JsxExpression) -> int;
```
## JsxExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: JsxExpression, i: int) -> Node;
```
## JsxExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: JsxExpression) -> int;
```
## JsxExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxExpression) -> *FunctionLikeDeclaration;
```
## JsxExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: JsxExpression, level: int) -> *Node;
```
## JsxExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: JsxExpression) -> int;
```
## JsxExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: JsxExpression) -> string;
```
## JsxExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: JsxExpression, level: int) -> Node;
```
## JsxExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: JsxExpression) -> File;
```
## JsxExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: JsxExpression) -> *Comment;
```
## JsxExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: JsxExpression) -> *Comment;
```
## JsxExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: JsxExpression) -> Node;
```
## JsxExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: JsxExpression) -> FunctionLikeDeclaration;
```
## JsxExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: JsxExpression) -> int;
```
## JsxExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: JsxExpression) -> int;
```
## JsxExpression::getIndex

```rust
pub fn getIndex(self: JsxExpression) -> int;
```
## JsxExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: JsxExpression) -> *Node;
```
## JsxExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *JsxExpression;
```
## JsxExpression::is\<T\>

```rust
pub fn is<T>(self: JsxExpression) -> bool;
```
## JsxExpression::to\<T\>

```rust
pub fn to<T>(self: JsxExpression) -> <any>;
```
## JsxExpression::key\_neq

```rust
pub fn key_neq(self: JsxExpression, object: <any>) -> bool;
```
## JsxExpression::key\_eq

```rust
pub fn key_eq(self: JsxExpression, object: <any>) -> bool;
```
## JsxExpression::to\_set

```rust
pub fn to_set(self: JsxExpression) -> *JsxExpression;
```
