# JsxElement

Primary key: `id: int`

```rust
schema JsxElement {
  @primary id: int,
}
```
## JsxElement::getADescendant

```java
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

```java
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

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: JsxElement) -> int;
```
## JsxElement::getAnAncestorByLevel

```java
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

```java
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

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: JsxElement) -> FunctionLikeDeclaration;
```
## JsxElement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: JsxElement) -> *Comment;
```
## JsxElement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: JsxElement) -> *Comment;
```
## JsxElement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxElement) -> *FunctionLikeDeclaration;
```
## JsxElement::getADescendantByLevel

```java
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

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: JsxElement) -> int;
```
## JsxElement::getAModifier

```java
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

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: JsxElement, i: int) -> Node;
```
## JsxElement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: JsxElement, i: int) -> Decorator;
```
## JsxElement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: JsxElement) -> TopLevelDO;
```
## JsxElement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: JsxElement) -> int;
```
## JsxElement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: JsxElement) -> Node;
```
## JsxElement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: JsxElement) -> Node;
```
## JsxElement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: JsxElement) -> *Node;
```
## JsxElement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: JsxElement) -> *Node;
```
## JsxElement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: JsxElement) -> *Comment;
```
## JsxElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *JsxElement;
```
## JsxElement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: JsxElement) -> Location;
```
## JsxElement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: JsxElement) -> Symbol;
```
## JsxElement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: JsxElement) -> *Decorator;
```
## JsxElement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: JsxElement, i: int) -> Modifier;
```
## JsxElement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: JsxElement) -> string;
```
