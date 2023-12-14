# BindingPattern

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema BindingPattern extends Node {
  @primary id: int,
}
```
## BindingPattern::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BindingPattern) -> *Node;
```
## BindingPattern::getIndex

```rust
pub fn getIndex(self: BindingPattern) -> int;
```
## BindingPattern::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BindingPattern) -> int;
```
## BindingPattern::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BindingPattern) -> int;
```
## BindingPattern::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BindingPattern) -> FunctionLikeDeclaration;
```
## BindingPattern::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BindingPattern) -> File;
```
## BindingPattern::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BindingPattern, level: int) -> Node;
```
## BindingPattern::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BindingPattern) -> string;
```
## BindingPattern::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BindingPattern) -> int;
```
## BindingPattern::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BindingPattern) -> Location;
```
## BindingPattern::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BindingPattern) -> *FunctionLikeDeclaration;
```
## BindingPattern::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BindingPattern, level: int) -> *Node;
```
## BindingPattern::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BindingPattern) -> int;
```
## BindingPattern::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BindingPattern) -> *Modifier;
```
## BindingPattern::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BindingPattern) -> int;
```
## BindingPattern::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BindingPattern) -> int;
```
## BindingPattern::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BindingPattern, i: int) -> Node;
```
## BindingPattern::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BindingPattern) -> int;
```
## BindingPattern::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BindingPattern, i: int) -> Decorator;
```
## BindingPattern::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BindingPattern) -> TopLevelDO;
```
## BindingPattern::getElement

```rust
pub fn getElement(self: BindingPattern, i: int) -> ArrayBindingElement;
```
## BindingPattern::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BindingPattern) -> Node;
```
## BindingPattern::getAnElement

```rust
pub fn getAnElement(self: BindingPattern) -> *ArrayBindingElement;
```
## BindingPattern::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BindingPattern) -> *Comment;
```
## BindingPattern::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BindingPattern) -> *Comment;
```
## BindingPattern::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BindingPattern) -> Node;
```
## BindingPattern::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BindingPattern) -> *Node;
```
## BindingPattern::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BindingPattern) -> *Node;
```
## BindingPattern::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BindingPattern) -> *Comment;
```
## BindingPattern::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BindingPattern, i: int) -> Modifier;
```
## BindingPattern::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BindingPattern) -> string;
```
## BindingPattern::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BindingPattern) -> Symbol;
```
## BindingPattern::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BindingPattern) -> *Decorator;
```
## BindingPattern::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BindingPattern;
```
