# MethodElement

Primary key: `id: int`

```rust
schema MethodElement {
  @primary id: int,
}
```
## MethodElement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: MethodElement) -> Location;
```
## MethodElement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: MethodElement) -> Symbol;
```
## MethodElement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: MethodElement) -> *Decorator;
```
## MethodElement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: MethodElement) -> string;
```
## MethodElement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: MethodElement, i: int) -> Modifier;
```
## MethodElement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: MethodElement) -> *Comment;
```
## MethodElement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: MethodElement) -> *Node;
```
## MethodElement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: MethodElement) -> *Node;
```
## MethodElement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: MethodElement) -> Node;
```
## MethodElement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: MethodElement) -> int;
```
## MethodElement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: MethodElement) -> TopLevelDO;
```
## MethodElement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: MethodElement, i: int) -> Decorator;
```
## MethodElement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: MethodElement) -> int;
```
## MethodElement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: MethodElement) -> *Modifier;
```
## MethodElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MethodElement) -> int;
```
## MethodElement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: MethodElement, i: int) -> Node;
```
## MethodElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MethodElement) -> int;
```
## MethodElement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MethodElement) -> *FunctionLikeDeclaration;
```
## MethodElement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: MethodElement, level: int) -> *Node;
```
## MethodElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MethodElement) -> int;
```
## MethodElement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: MethodElement) -> string;
```
## MethodElement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: MethodElement, level: int) -> Node;
```
## MethodElement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: MethodElement) -> File;
```
## MethodElement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: MethodElement) -> *Comment;
```
## MethodElement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: MethodElement) -> *Comment;
```
## MethodElement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: MethodElement) -> Node;
```
## MethodElement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: MethodElement) -> FunctionLikeDeclaration;
```
## MethodElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MethodElement) -> int;
```
## MethodElement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: MethodElement) -> int;
```
## MethodElement::getIndex

```rust
pub fn getIndex(self: MethodElement) -> int;
```
## MethodElement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: MethodElement) -> *Node;
```
## MethodElement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *MethodElement;
```
## MethodElement::is\<T\>

```rust
pub fn is<T>(self: MethodElement) -> bool;
```
## MethodElement::to\<T\>

```rust
pub fn to<T>(self: MethodElement) -> <any>;
```
## MethodElement::key\_neq

```rust
pub fn key_neq(self: MethodElement, object: <any>) -> bool;
```
## MethodElement::key\_eq

```rust
pub fn key_eq(self: MethodElement, object: <any>) -> bool;
```
## MethodElement::to\_set

```rust
pub fn to_set(self: MethodElement) -> *MethodElement;
```
