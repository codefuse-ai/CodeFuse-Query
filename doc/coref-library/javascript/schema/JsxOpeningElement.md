# JsxOpeningElement

Primary key: `id: int`

```rust
schema JsxOpeningElement {
  @primary id: int,
}
```
## JsxOpeningElement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: JsxOpeningElement) -> Location;
```
## JsxOpeningElement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: JsxOpeningElement) -> Symbol;
```
## JsxOpeningElement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: JsxOpeningElement) -> *Decorator;
```
## JsxOpeningElement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: JsxOpeningElement) -> string;
```
## JsxOpeningElement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: JsxOpeningElement, i: int) -> Modifier;
```
## JsxOpeningElement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: JsxOpeningElement) -> *Comment;
```
## JsxOpeningElement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: JsxOpeningElement) -> *Node;
```
## JsxOpeningElement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: JsxOpeningElement) -> *Comment;
```
## JsxOpeningElement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: JsxOpeningElement) -> *Comment;
```
## JsxOpeningElement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: JsxOpeningElement) -> int;
```
## JsxOpeningElement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: JsxOpeningElement) -> TopLevelDO;
```
## JsxOpeningElement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: JsxOpeningElement, i: int) -> Decorator;
```
## JsxOpeningElement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: JsxOpeningElement) -> int;
```
## JsxOpeningElement::getAModifier

```java
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

```java
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

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxOpeningElement) -> *FunctionLikeDeclaration;
```
## JsxOpeningElement::getADescendantByLevel

```java
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

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: JsxOpeningElement) -> string;
```
## JsxOpeningElement::getAChild

```java
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

```java
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

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: JsxOpeningElement) -> FunctionLikeDeclaration;
```
## JsxOpeningElement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: JsxOpeningElement) -> File;
```
## JsxOpeningElement::getAnAncestorByLevel

```java
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

```java
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

```java
/**
* Gets the callee of this JSX opening element.
*/
```
```rust
pub fn getCallee(self: JsxOpeningElement) -> FunctionLikeDeclaration;
```
## JsxOpeningElement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: JsxOpeningElement) -> *Node;
```
## JsxOpeningElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *JsxOpeningElement;
```
