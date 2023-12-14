# JsxSelfClosingElement

Primary key: `id: int`

```rust
schema JsxSelfClosingElement {
  @primary id: int,
}
```
## JsxSelfClosingElement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: JsxSelfClosingElement) -> *Node;
```
## JsxSelfClosingElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: JsxSelfClosingElement) -> int;
```
## JsxSelfClosingElement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: JsxSelfClosingElement) -> string;
```
## JsxSelfClosingElement::getExpression

```rust
pub fn getExpression(self: JsxSelfClosingElement) -> Expression;
```
## JsxSelfClosingElement::getIndex

```rust
pub fn getIndex(self: JsxSelfClosingElement) -> int;
```
## JsxSelfClosingElement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: JsxSelfClosingElement) -> int;
```
## JsxSelfClosingElement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: JsxSelfClosingElement, level: int) -> Node;
```
## JsxSelfClosingElement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: JsxSelfClosingElement) -> File;
```
## JsxSelfClosingElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: JsxSelfClosingElement) -> int;
```
## JsxSelfClosingElement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: JsxSelfClosingElement) -> FunctionLikeDeclaration;
```
## JsxSelfClosingElement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: JsxSelfClosingElement) -> *Comment;
```
## JsxSelfClosingElement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: JsxSelfClosingElement) -> *Comment;
```
## JsxSelfClosingElement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxSelfClosingElement) -> *FunctionLikeDeclaration;
```
## JsxSelfClosingElement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: JsxSelfClosingElement, level: int) -> *Node;
```
## JsxSelfClosingElement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: JsxSelfClosingElement) -> int;
```
## JsxSelfClosingElement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: JsxSelfClosingElement) -> *Modifier;
```
## JsxSelfClosingElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: JsxSelfClosingElement) -> int;
```
## JsxSelfClosingElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: JsxSelfClosingElement) -> int;
```
## JsxSelfClosingElement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: JsxSelfClosingElement, i: int) -> Node;
```
## JsxSelfClosingElement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: JsxSelfClosingElement, i: int) -> Decorator;
```
## JsxSelfClosingElement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: JsxSelfClosingElement) -> TopLevelDO;
```
## JsxSelfClosingElement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: JsxSelfClosingElement) -> int;
```
## JsxSelfClosingElement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: JsxSelfClosingElement) -> Node;
```
## JsxSelfClosingElement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: JsxSelfClosingElement) -> Node;
```
## JsxSelfClosingElement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: JsxSelfClosingElement) -> *Node;
```
## JsxSelfClosingElement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: JsxSelfClosingElement) -> *Node;
```
## JsxSelfClosingElement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: JsxSelfClosingElement) -> *Comment;
```
## JsxSelfClosingElement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *JsxSelfClosingElement;
```
## JsxSelfClosingElement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: JsxSelfClosingElement) -> Location;
```
## JsxSelfClosingElement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: JsxSelfClosingElement) -> Symbol;
```
## JsxSelfClosingElement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: JsxSelfClosingElement) -> *Decorator;
```
## JsxSelfClosingElement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: JsxSelfClosingElement, i: int) -> Modifier;
```
## JsxSelfClosingElement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: JsxSelfClosingElement) -> string;
```
## JsxSelfClosingElement::is\<T\>

```rust
pub fn is<T>(self: JsxSelfClosingElement) -> bool;
```
## JsxSelfClosingElement::to\<T\>

```rust
pub fn to<T>(self: JsxSelfClosingElement) -> <any>;
```
## JsxSelfClosingElement::key\_neq

```rust
pub fn key_neq(self: JsxSelfClosingElement, object: <any>) -> bool;
```
## JsxSelfClosingElement::key\_eq

```rust
pub fn key_eq(self: JsxSelfClosingElement, object: <any>) -> bool;
```
## JsxSelfClosingElement::to\_set

```rust
pub fn to_set(self: JsxSelfClosingElement) -> *JsxSelfClosingElement;
```
