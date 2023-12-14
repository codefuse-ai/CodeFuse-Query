# BindingElement

Primary key: `id: int`

```rust
schema BindingElement {
  @primary id: int,
}
```
## BindingElement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BindingElement) -> *Node;
```
## BindingElement::getIndex

```rust
pub fn getIndex(self: BindingElement) -> int;
```
## BindingElement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BindingElement) -> int;
```
## BindingElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BindingElement) -> int;
```
## BindingElement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BindingElement) -> Node;
```
## BindingElement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BindingElement) -> FunctionLikeDeclaration;
```
## BindingElement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BindingElement) -> Location;
```
## BindingElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BindingElement) -> int;
```
## BindingElement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BindingElement, i: int) -> Node;
```
## BindingElement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BindingElement) -> *FunctionLikeDeclaration;
```
## BindingElement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BindingElement, level: int) -> *Node;
```
## BindingElement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BindingElement) -> int;
```
## BindingElement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BindingElement) -> TopLevelDO;
```
## BindingElement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BindingElement, i: int) -> Decorator;
```
## BindingElement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BindingElement) -> *Comment;
```
## BindingElement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BindingElement) -> *Comment;
```
## BindingElement::getParent

```rust
pub fn getParent(self: BindingElement) -> BindingPattern;
```
## BindingElement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BindingElement) -> *Node;
```
## BindingElement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BindingElement) -> *Node;
```
## BindingElement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BindingElement) -> *Comment;
```
## BindingElement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BindingElement) -> string;
```
## BindingElement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BindingElement, i: int) -> Modifier;
```
## BindingElement::hasInitializer

```rust
/**
     * Determines whether this BindingElement has the initializer.
     */
```
```rust
pub fn hasInitializer(self: BindingElement) -> bool;
```
## BindingElement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BindingElement) -> File;
```
## BindingElement::getNameNode

```rust
/**
     * Get the name node.
     */
```
```rust
pub fn getNameNode(self: BindingElement) -> BindingName;
```
## BindingElement::getPropertyNameString

```rust
pub fn getPropertyNameString(self: BindingElement) -> string;
```
## BindingElement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BindingElement, level: int) -> Node;
```
## BindingElement::hasPropertyName

```rust
pub fn hasPropertyName(self: BindingElement) -> bool;
```
## BindingElement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BindingElement) -> Symbol;
```
## BindingElement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BindingElement) -> *Decorator;
```
## BindingElement::getDotDotDotToken

```rust
/**
     * Gets the `...` token.
     */
```
```rust
pub fn getDotDotDotToken(self: BindingElement) -> DotDotDotToken;
```
## BindingElement::getPropertyName

```rust
/**
     * Get the bound property name node (only in object binding pattern).
     */
```
```rust
pub fn getPropertyName(self: BindingElement) -> PropertyName;
```
## BindingElement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BindingElement) -> string;
```
## BindingElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BindingElement) -> int;
```
## BindingElement::getInitializer

```rust
/**
     * Get the initialization expression.
     */
```
```rust
pub fn getInitializer(self: BindingElement) -> Expression;
```
## BindingElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BindingElement) -> int;
```
## BindingElement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BindingElement) -> int;
```
## BindingElement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BindingElement) -> *Modifier;
```
## BindingElement::isRest

```rust
/**
     * Whether this binding element is a rest element.
     */
```
```rust
pub fn isRest(self: BindingElement) -> bool;
```
## BindingElement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BindingElement;
```
## BindingElement::is\<T\>

```rust
pub fn is<T>(self: BindingElement) -> bool;
```
## BindingElement::to\<T\>

```rust
pub fn to<T>(self: BindingElement) -> <any>;
```
## BindingElement::key\_neq

```rust
pub fn key_neq(self: BindingElement, object: <any>) -> bool;
```
## BindingElement::key\_eq

```rust
pub fn key_eq(self: BindingElement, object: <any>) -> bool;
```
## BindingElement::to\_set

```rust
pub fn to_set(self: BindingElement) -> *BindingElement;
```
