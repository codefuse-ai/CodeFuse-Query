# JsxElement

Primary key: `id: int`

```rust
schema JsxElement {
  @primary id: int,
}
```
## JsxElement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: JsxElement) -> *Node;
```
## JsxElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: JsxElement) -> int;
```
## JsxElement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: JsxElement) -> string;
```
## JsxElement::getExpression

```rust
pub fn getExpression(self: JsxElement) -> Expression;
```
## JsxElement::getIndex

```rust
pub fn getIndex(self: JsxElement) -> int;
```
## JsxElement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: JsxElement) -> int;
```
## JsxElement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: JsxElement, level: int) -> Node;
```
## JsxElement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: JsxElement) -> File;
```
## JsxElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: JsxElement) -> int;
```
## JsxElement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: JsxElement) -> FunctionLikeDeclaration;
```
## JsxElement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: JsxElement) -> *Comment;
```
## JsxElement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: JsxElement) -> *Comment;
```
## JsxElement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxElement) -> *FunctionLikeDeclaration;
```
## JsxElement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: JsxElement, level: int) -> *Node;
```
## JsxElement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: JsxElement) -> int;
```
## JsxElement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: JsxElement) -> *Modifier;
```
## JsxElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: JsxElement) -> int;
```
## JsxElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: JsxElement) -> int;
```
## JsxElement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: JsxElement, i: int) -> Node;
```
## JsxElement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: JsxElement, i: int) -> Decorator;
```
## JsxElement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: JsxElement) -> TopLevelDO;
```
## JsxElement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: JsxElement) -> int;
```
## JsxElement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: JsxElement) -> Node;
```
## JsxElement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: JsxElement) -> Node;
```
## JsxElement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: JsxElement) -> *Node;
```
## JsxElement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: JsxElement) -> *Node;
```
## JsxElement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: JsxElement) -> *Comment;
```
## JsxElement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *JsxElement;
```
## JsxElement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: JsxElement) -> Location;
```
## JsxElement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: JsxElement) -> Symbol;
```
## JsxElement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: JsxElement) -> *Decorator;
```
## JsxElement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: JsxElement, i: int) -> Modifier;
```
## JsxElement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: JsxElement) -> string;
```
## JsxElement::is\<T\>

```rust
pub fn is<T>(self: JsxElement) -> bool;
```
## JsxElement::to\<T\>

```rust
pub fn to<T>(self: JsxElement) -> <any>;
```
## JsxElement::key\_neq

```rust
pub fn key_neq(self: JsxElement, object: <any>) -> bool;
```
## JsxElement::key\_eq

```rust
pub fn key_eq(self: JsxElement, object: <any>) -> bool;
```
## JsxElement::to\_set

```rust
pub fn to_set(self: JsxElement) -> *JsxElement;
```
