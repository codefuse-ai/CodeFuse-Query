# JsxSelfClosingElement

Primary key: `id: int`

```rust
schema JsxSelfClosingElement {
  @primary id: int,
}
```
## JsxSelfClosingElement::getADescendant

```java
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

```java
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

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: JsxSelfClosingElement) -> int;
```
## JsxSelfClosingElement::getAnAncestorByLevel

```java
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

```java
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

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: JsxSelfClosingElement) -> FunctionLikeDeclaration;
```
## JsxSelfClosingElement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: JsxSelfClosingElement) -> *Comment;
```
## JsxSelfClosingElement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: JsxSelfClosingElement) -> *Comment;
```
## JsxSelfClosingElement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxSelfClosingElement) -> *FunctionLikeDeclaration;
```
## JsxSelfClosingElement::getADescendantByLevel

```java
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

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: JsxSelfClosingElement) -> int;
```
## JsxSelfClosingElement::getAModifier

```java
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

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: JsxSelfClosingElement, i: int) -> Node;
```
## JsxSelfClosingElement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: JsxSelfClosingElement, i: int) -> Decorator;
```
## JsxSelfClosingElement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: JsxSelfClosingElement) -> TopLevelDO;
```
## JsxSelfClosingElement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: JsxSelfClosingElement) -> int;
```
## JsxSelfClosingElement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: JsxSelfClosingElement) -> Node;
```
## JsxSelfClosingElement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: JsxSelfClosingElement) -> Node;
```
## JsxSelfClosingElement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: JsxSelfClosingElement) -> *Node;
```
## JsxSelfClosingElement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: JsxSelfClosingElement) -> *Node;
```
## JsxSelfClosingElement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: JsxSelfClosingElement) -> *Comment;
```
## JsxSelfClosingElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *JsxSelfClosingElement;
```
## JsxSelfClosingElement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: JsxSelfClosingElement) -> Location;
```
## JsxSelfClosingElement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: JsxSelfClosingElement) -> Symbol;
```
## JsxSelfClosingElement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: JsxSelfClosingElement) -> *Decorator;
```
## JsxSelfClosingElement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: JsxSelfClosingElement, i: int) -> Modifier;
```
## JsxSelfClosingElement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: JsxSelfClosingElement) -> string;
```
