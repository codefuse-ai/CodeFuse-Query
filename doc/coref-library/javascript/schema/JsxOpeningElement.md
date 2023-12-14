# JsxOpeningElement

Primary key: `id: int`

```rust
schema JsxOpeningElement {
  @primary id: int,
}
```
## JsxOpeningElement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: JsxOpeningElement) -> Location;
```
## JsxOpeningElement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: JsxOpeningElement) -> Symbol;
```
## JsxOpeningElement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: JsxOpeningElement) -> *Decorator;
```
## JsxOpeningElement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: JsxOpeningElement) -> string;
```
## JsxOpeningElement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: JsxOpeningElement, i: int) -> Modifier;
```
## JsxOpeningElement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: JsxOpeningElement) -> *Comment;
```
## JsxOpeningElement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: JsxOpeningElement) -> *Node;
```
## JsxOpeningElement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: JsxOpeningElement) -> *Comment;
```
## JsxOpeningElement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: JsxOpeningElement) -> *Comment;
```
## JsxOpeningElement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: JsxOpeningElement) -> int;
```
## JsxOpeningElement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: JsxOpeningElement) -> TopLevelDO;
```
## JsxOpeningElement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: JsxOpeningElement, i: int) -> Decorator;
```
## JsxOpeningElement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: JsxOpeningElement) -> int;
```
## JsxOpeningElement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: JsxOpeningElement) -> *Modifier;
```
## JsxOpeningElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: JsxOpeningElement) -> int;
```
## JsxOpeningElement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: JsxOpeningElement, i: int) -> Node;
```
## JsxOpeningElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: JsxOpeningElement) -> int;
```
## JsxOpeningElement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxOpeningElement) -> *FunctionLikeDeclaration;
```
## JsxOpeningElement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: JsxOpeningElement, level: int) -> *Node;
```
## JsxOpeningElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: JsxOpeningElement) -> int;
```
## JsxOpeningElement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: JsxOpeningElement) -> string;
```
## JsxOpeningElement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: JsxOpeningElement) -> *Node;
```
## JsxOpeningElement::getParent

```rust
pub fn getParent(self: JsxOpeningElement) -> JsxElement;
```
## JsxOpeningElement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: JsxOpeningElement) -> Node;
```
## JsxOpeningElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: JsxOpeningElement) -> int;
```
## JsxOpeningElement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: JsxOpeningElement) -> FunctionLikeDeclaration;
```
## JsxOpeningElement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: JsxOpeningElement) -> File;
```
## JsxOpeningElement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: JsxOpeningElement, level: int) -> Node;
```
## JsxOpeningElement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: JsxOpeningElement) -> int;
```
## JsxOpeningElement::getIndex

```rust
pub fn getIndex(self: JsxOpeningElement) -> int;
```
## JsxOpeningElement::getCallee

```rust
/**
     * Gets the callee of this JSX opening element.
     */
```
```rust
pub fn getCallee(self: JsxOpeningElement) -> FunctionLikeDeclaration;
```
## JsxOpeningElement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: JsxOpeningElement) -> *Node;
```
## JsxOpeningElement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *JsxOpeningElement;
```
## JsxOpeningElement::is\<T\>

```rust
pub fn is<T>(self: JsxOpeningElement) -> bool;
```
## JsxOpeningElement::to\<T\>

```rust
pub fn to<T>(self: JsxOpeningElement) -> <any>;
```
## JsxOpeningElement::key\_neq

```rust
pub fn key_neq(self: JsxOpeningElement, object: <any>) -> bool;
```
## JsxOpeningElement::key\_eq

```rust
pub fn key_eq(self: JsxOpeningElement, object: <any>) -> bool;
```
## JsxOpeningElement::to\_set

```rust
pub fn to_set(self: JsxOpeningElement) -> *JsxOpeningElement;
```
