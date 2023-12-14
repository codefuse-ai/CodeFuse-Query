# BindingElement

Primary key: `id: int`

```rust
schema BindingElement {
  @primary id: int,
}
```
## BindingElement::getADescendant

```java
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

```java
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

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BindingElement) -> Node;
```
## BindingElement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BindingElement) -> FunctionLikeDeclaration;
```
## BindingElement::getLocation

```java
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

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BindingElement, i: int) -> Node;
```
## BindingElement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BindingElement) -> *FunctionLikeDeclaration;
```
## BindingElement::getADescendantByLevel

```java
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

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BindingElement) -> int;
```
## BindingElement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BindingElement) -> TopLevelDO;
```
## BindingElement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BindingElement, i: int) -> Decorator;
```
## BindingElement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BindingElement) -> *Comment;
```
## BindingElement::getALeadingComment

```java
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

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BindingElement) -> *Node;
```
## BindingElement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BindingElement) -> *Node;
```
## BindingElement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BindingElement) -> *Comment;
```
## BindingElement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BindingElement) -> string;
```
## BindingElement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BindingElement, i: int) -> Modifier;
```
## BindingElement::hasInitializer

```java
/**
* Determines whether this BindingElement has the initializer.
*/
```
```rust
pub fn hasInitializer(self: BindingElement) -> bool;
```
## BindingElement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BindingElement) -> File;
```
## BindingElement::getNameNode

```java
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

```java
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

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BindingElement) -> Symbol;
```
## BindingElement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BindingElement) -> *Decorator;
```
## BindingElement::getDotDotDotToken

```java
/**
* Gets the `...` token.
*/
```
```rust
pub fn getDotDotDotToken(self: BindingElement) -> DotDotDotToken;
```
## BindingElement::getPropertyName

```java
/**
* Get the bound property name node (only in object binding pattern).
*/
```
```rust
pub fn getPropertyName(self: BindingElement) -> PropertyName;
```
## BindingElement::getRelativePath

```java
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

```java
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

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BindingElement) -> int;
```
## BindingElement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BindingElement) -> *Modifier;
```
## BindingElement::isRest

```java
/**
* Whether this binding element is a rest element.
*/
```
```rust
pub fn isRest(self: BindingElement) -> bool;
```
## BindingElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BindingElement;
```
