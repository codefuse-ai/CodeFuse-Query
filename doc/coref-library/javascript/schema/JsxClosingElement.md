# JsxClosingElement

Primary key: `id: int`

```rust
schema JsxClosingElement {
  @primary id: int,
}
```
## JsxClosingElement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: JsxClosingElement) -> Location;
```
## JsxClosingElement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: JsxClosingElement) -> Symbol;
```
## JsxClosingElement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: JsxClosingElement) -> *Decorator;
```
## JsxClosingElement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: JsxClosingElement) -> string;
```
## JsxClosingElement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: JsxClosingElement, i: int) -> Modifier;
```
## JsxClosingElement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: JsxClosingElement) -> *Comment;
```
## JsxClosingElement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: JsxClosingElement) -> *Node;
```
## JsxClosingElement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: JsxClosingElement) -> int;
```
## JsxClosingElement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: JsxClosingElement) -> TopLevelDO;
```
## JsxClosingElement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: JsxClosingElement, i: int) -> Decorator;
```
## JsxClosingElement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: JsxClosingElement) -> int;
```
## JsxClosingElement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: JsxClosingElement) -> *Modifier;
```
## JsxClosingElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: JsxClosingElement) -> int;
```
## JsxClosingElement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: JsxClosingElement, i: int) -> Node;
```
## JsxClosingElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: JsxClosingElement) -> int;
```
## JsxClosingElement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: JsxClosingElement, level: int) -> *Node;
```
## JsxClosingElement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxClosingElement) -> *FunctionLikeDeclaration;
```
## JsxClosingElement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: JsxClosingElement) -> *Comment;
```
## JsxClosingElement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: JsxClosingElement) -> *Comment;
```
## JsxClosingElement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: JsxClosingElement) -> *Node;
```
## JsxClosingElement::getParent

```rust
pub fn getParent(self: JsxClosingElement) -> JsxElement;
```
## JsxClosingElement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: JsxClosingElement) -> Node;
```
## JsxClosingElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: JsxClosingElement) -> int;
```
## JsxClosingElement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: JsxClosingElement) -> FunctionLikeDeclaration;
```
## JsxClosingElement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: JsxClosingElement) -> File;
```
## JsxClosingElement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: JsxClosingElement, level: int) -> Node;
```
## JsxClosingElement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: JsxClosingElement) -> int;
```
## JsxClosingElement::getIndex

```rust
pub fn getIndex(self: JsxClosingElement) -> int;
```
## JsxClosingElement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: JsxClosingElement) -> string;
```
## JsxClosingElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: JsxClosingElement) -> int;
```
## JsxClosingElement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: JsxClosingElement) -> *Node;
```
## JsxClosingElement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *JsxClosingElement;
```
## JsxClosingElement::is\<T\>

```rust
pub fn is<T>(self: JsxClosingElement) -> bool;
```
## JsxClosingElement::to\<T\>

```rust
pub fn to<T>(self: JsxClosingElement) -> <any>;
```
## JsxClosingElement::key\_neq

```rust
pub fn key_neq(self: JsxClosingElement, object: <any>) -> bool;
```
## JsxClosingElement::key\_eq

```rust
pub fn key_eq(self: JsxClosingElement, object: <any>) -> bool;
```
## JsxClosingElement::to\_set

```rust
pub fn to_set(self: JsxClosingElement) -> *JsxClosingElement;
```
