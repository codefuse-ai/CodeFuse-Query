# JsxAttributeInitializer

Primary key: `id: int`

```rust
schema JsxAttributeInitializer {
  @primary id: int,
}
```
## JsxAttributeInitializer::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: JsxAttributeInitializer) -> *Node;
```
## JsxAttributeInitializer::getIndex

```rust
pub fn getIndex(self: JsxAttributeInitializer) -> int;
```
## JsxAttributeInitializer::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: JsxAttributeInitializer) -> int;
```
## JsxAttributeInitializer::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: JsxAttributeInitializer) -> int;
```
## JsxAttributeInitializer::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: JsxAttributeInitializer) -> Node;
```
## JsxAttributeInitializer::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: JsxAttributeInitializer) -> FunctionLikeDeclaration;
```
## JsxAttributeInitializer::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: JsxAttributeInitializer) -> File;
```
## JsxAttributeInitializer::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: JsxAttributeInitializer, level: int) -> Node;
```
## JsxAttributeInitializer::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: JsxAttributeInitializer) -> string;
```
## JsxAttributeInitializer::getEndLineNumber

```rust
pub fn getEndLineNumber(self: JsxAttributeInitializer) -> int;
```
## JsxAttributeInitializer::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxAttributeInitializer) -> *FunctionLikeDeclaration;
```
## JsxAttributeInitializer::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: JsxAttributeInitializer, level: int) -> *Node;
```
## JsxAttributeInitializer::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: JsxAttributeInitializer) -> int;
```
## JsxAttributeInitializer::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: JsxAttributeInitializer) -> *Modifier;
```
## JsxAttributeInitializer::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: JsxAttributeInitializer) -> int;
```
## JsxAttributeInitializer::getStartLineNumber

```rust
pub fn getStartLineNumber(self: JsxAttributeInitializer) -> int;
```
## JsxAttributeInitializer::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: JsxAttributeInitializer, i: int) -> Node;
```
## JsxAttributeInitializer::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: JsxAttributeInitializer, i: int) -> Decorator;
```
## JsxAttributeInitializer::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: JsxAttributeInitializer) -> TopLevelDO;
```
## JsxAttributeInitializer::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: JsxAttributeInitializer) -> int;
```
## JsxAttributeInitializer::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: JsxAttributeInitializer) -> *Comment;
```
## JsxAttributeInitializer::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: JsxAttributeInitializer) -> *Comment;
```
## JsxAttributeInitializer::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: JsxAttributeInitializer) -> Node;
```
## JsxAttributeInitializer::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: JsxAttributeInitializer) -> *Node;
```
## JsxAttributeInitializer::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: JsxAttributeInitializer) -> *Node;
```
## JsxAttributeInitializer::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: JsxAttributeInitializer) -> *Comment;
```
## JsxAttributeInitializer::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: JsxAttributeInitializer, i: int) -> Modifier;
```
## JsxAttributeInitializer::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: JsxAttributeInitializer) -> string;
```
## JsxAttributeInitializer::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: JsxAttributeInitializer) -> *Decorator;
```
## JsxAttributeInitializer::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: JsxAttributeInitializer) -> Symbol;
```
## JsxAttributeInitializer::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: JsxAttributeInitializer) -> Location;
```
## JsxAttributeInitializer::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *JsxAttributeInitializer;
```
