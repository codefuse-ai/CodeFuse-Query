# ObjectLiteralElement

Primary key: `id: int`

```rust
schema ObjectLiteralElement {
  @primary id: int,
}
```
## ObjectLiteralElement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ObjectLiteralElement) -> *Node;
```
## ObjectLiteralElement::getIndex

```rust
pub fn getIndex(self: ObjectLiteralElement) -> int;
```
## ObjectLiteralElement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ObjectLiteralElement) -> int;
```
## ObjectLiteralElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ObjectLiteralElement) -> int;
```
## ObjectLiteralElement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ObjectLiteralElement) -> Node;
```
## ObjectLiteralElement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ObjectLiteralElement) -> FunctionLikeDeclaration;
```
## ObjectLiteralElement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ObjectLiteralElement) -> File;
```
## ObjectLiteralElement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ObjectLiteralElement, level: int) -> Node;
```
## ObjectLiteralElement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ObjectLiteralElement) -> string;
```
## ObjectLiteralElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ObjectLiteralElement) -> int;
```
## ObjectLiteralElement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ObjectLiteralElement) -> *FunctionLikeDeclaration;
```
## ObjectLiteralElement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ObjectLiteralElement, level: int) -> *Node;
```
## ObjectLiteralElement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ObjectLiteralElement) -> int;
```
## ObjectLiteralElement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ObjectLiteralElement) -> *Modifier;
```
## ObjectLiteralElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ObjectLiteralElement) -> int;
```
## ObjectLiteralElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ObjectLiteralElement) -> int;
```
## ObjectLiteralElement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ObjectLiteralElement, i: int) -> Node;
```
## ObjectLiteralElement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ObjectLiteralElement) -> TopLevelDO;
```
## ObjectLiteralElement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ObjectLiteralElement, i: int) -> Decorator;
```
## ObjectLiteralElement::getName

```rust
/**
     * Gets the name of this ObjectLiteralElement.
     *
     * A SpreadAssignment doesn't have a name.
     * TODO: add handling for Accessors.
     */
```
```rust
pub fn getName(self: ObjectLiteralElement) -> string;
```
## ObjectLiteralElement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ObjectLiteralElement) -> int;
```
## ObjectLiteralElement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ObjectLiteralElement) -> *Comment;
```
## ObjectLiteralElement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ObjectLiteralElement) -> *Comment;
```
## ObjectLiteralElement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ObjectLiteralElement) -> *Node;
```
## ObjectLiteralElement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ObjectLiteralElement) -> Node;
```
## ObjectLiteralElement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ObjectLiteralElement, i: int) -> Modifier;
```
## ObjectLiteralElement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ObjectLiteralElement) -> string;
```
## ObjectLiteralElement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ObjectLiteralElement) -> *Decorator;
```
## ObjectLiteralElement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ObjectLiteralElement) -> Symbol;
```
## ObjectLiteralElement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ObjectLiteralElement) -> Location;
```
## ObjectLiteralElement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ObjectLiteralElement;
```
## ObjectLiteralElement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ObjectLiteralElement) -> *Node;
```
## ObjectLiteralElement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ObjectLiteralElement) -> *Comment;
```
## ObjectLiteralElement::is\<T\>

```rust
pub fn is<T>(self: ObjectLiteralElement) -> bool;
```
## ObjectLiteralElement::to\<T\>

```rust
pub fn to<T>(self: ObjectLiteralElement) -> <any>;
```
## ObjectLiteralElement::key\_neq

```rust
pub fn key_neq(self: ObjectLiteralElement, object: <any>) -> bool;
```
## ObjectLiteralElement::key\_eq

```rust
pub fn key_eq(self: ObjectLiteralElement, object: <any>) -> bool;
```
## ObjectLiteralElement::to\_set

```rust
pub fn to_set(self: ObjectLiteralElement) -> *ObjectLiteralElement;
```
