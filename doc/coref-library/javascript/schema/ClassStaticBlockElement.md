# ClassStaticBlockElement

Primary key: `id: int`

```rust
schema ClassStaticBlockElement {
  @primary id: int,
}
```
## ClassStaticBlockElement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ClassStaticBlockElement) -> Location;
```
## ClassStaticBlockElement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ClassStaticBlockElement) -> Symbol;
```
## ClassStaticBlockElement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ClassStaticBlockElement) -> *Decorator;
```
## ClassStaticBlockElement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ClassStaticBlockElement) -> string;
```
## ClassStaticBlockElement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ClassStaticBlockElement, i: int) -> Modifier;
```
## ClassStaticBlockElement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ClassStaticBlockElement) -> *Comment;
```
## ClassStaticBlockElement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ClassStaticBlockElement) -> *Node;
```
## ClassStaticBlockElement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ClassStaticBlockElement) -> *Node;
```
## ClassStaticBlockElement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ClassStaticBlockElement) -> Node;
```
## ClassStaticBlockElement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ClassStaticBlockElement) -> int;
```
## ClassStaticBlockElement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ClassStaticBlockElement) -> TopLevelDO;
```
## ClassStaticBlockElement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ClassStaticBlockElement, i: int) -> Decorator;
```
## ClassStaticBlockElement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ClassStaticBlockElement) -> int;
```
## ClassStaticBlockElement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ClassStaticBlockElement) -> *Modifier;
```
## ClassStaticBlockElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ClassStaticBlockElement) -> int;
```
## ClassStaticBlockElement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ClassStaticBlockElement, i: int) -> Node;
```
## ClassStaticBlockElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ClassStaticBlockElement) -> int;
```
## ClassStaticBlockElement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ClassStaticBlockElement) -> *FunctionLikeDeclaration;
```
## ClassStaticBlockElement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ClassStaticBlockElement, level: int) -> *Node;
```
## ClassStaticBlockElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ClassStaticBlockElement) -> int;
```
## ClassStaticBlockElement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ClassStaticBlockElement) -> string;
```
## ClassStaticBlockElement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ClassStaticBlockElement, level: int) -> Node;
```
## ClassStaticBlockElement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ClassStaticBlockElement) -> File;
```
## ClassStaticBlockElement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ClassStaticBlockElement) -> *Comment;
```
## ClassStaticBlockElement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ClassStaticBlockElement) -> *Comment;
```
## ClassStaticBlockElement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ClassStaticBlockElement) -> Node;
```
## ClassStaticBlockElement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ClassStaticBlockElement) -> FunctionLikeDeclaration;
```
## ClassStaticBlockElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ClassStaticBlockElement) -> int;
```
## ClassStaticBlockElement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ClassStaticBlockElement) -> int;
```
## ClassStaticBlockElement::getIndex

```rust
pub fn getIndex(self: ClassStaticBlockElement) -> int;
```
## ClassStaticBlockElement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ClassStaticBlockElement) -> *Node;
```
## ClassStaticBlockElement::\_\_all\_\_

```rust
// ClassStaticBlockDeclaration
```
```rust
pub fn __all__(db: JavascriptDB) -> *ClassStaticBlockElement;
```
## ClassStaticBlockElement::is\<T\>

```rust
pub fn is<T>(self: ClassStaticBlockElement) -> bool;
```
## ClassStaticBlockElement::to\<T\>

```rust
pub fn to<T>(self: ClassStaticBlockElement) -> <any>;
```
## ClassStaticBlockElement::key\_neq

```rust
pub fn key_neq(self: ClassStaticBlockElement, object: <any>) -> bool;
```
## ClassStaticBlockElement::key\_eq

```rust
pub fn key_eq(self: ClassStaticBlockElement, object: <any>) -> bool;
```
## ClassStaticBlockElement::to\_set

```rust
pub fn to_set(self: ClassStaticBlockElement) -> *ClassStaticBlockElement;
```
