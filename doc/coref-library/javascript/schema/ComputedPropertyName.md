# ComputedPropertyName

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema ComputedPropertyName extends Node {
  @primary id: int,
}
```
## ComputedPropertyName::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ComputedPropertyName) -> *Node;
```
## ComputedPropertyName::getIndex

```rust
pub fn getIndex(self: ComputedPropertyName) -> int;
```
## ComputedPropertyName::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ComputedPropertyName) -> int;
```
## ComputedPropertyName::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ComputedPropertyName) -> int;
```
## ComputedPropertyName::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ComputedPropertyName) -> Node;
```
## ComputedPropertyName::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ComputedPropertyName) -> FunctionLikeDeclaration;
```
## ComputedPropertyName::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ComputedPropertyName) -> File;
```
## ComputedPropertyName::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ComputedPropertyName, level: int) -> Node;
```
## ComputedPropertyName::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ComputedPropertyName) -> *FunctionLikeDeclaration;
```
## ComputedPropertyName::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ComputedPropertyName, level: int) -> *Node;
```
## ComputedPropertyName::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ComputedPropertyName) -> int;
```
## ComputedPropertyName::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ComputedPropertyName) -> *Modifier;
```
## ComputedPropertyName::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ComputedPropertyName) -> int;
```
## ComputedPropertyName::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ComputedPropertyName) -> int;
```
## ComputedPropertyName::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ComputedPropertyName, i: int) -> Node;
```
## ComputedPropertyName::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ComputedPropertyName) -> TopLevelDO;
```
## ComputedPropertyName::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ComputedPropertyName, i: int) -> Decorator;
```
## ComputedPropertyName::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ComputedPropertyName) -> int;
```
## ComputedPropertyName::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ComputedPropertyName) -> *Comment;
```
## ComputedPropertyName::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ComputedPropertyName) -> *Comment;
```
## ComputedPropertyName::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ComputedPropertyName) -> Node;
```
## ComputedPropertyName::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ComputedPropertyName) -> *Node;
```
## ComputedPropertyName::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ComputedPropertyName) -> *Node;
```
## ComputedPropertyName::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ComputedPropertyName) -> *Comment;
```
## ComputedPropertyName::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ComputedPropertyName, i: int) -> Modifier;
```
## ComputedPropertyName::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ComputedPropertyName) -> string;
```
## ComputedPropertyName::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ComputedPropertyName) -> *Decorator;
```
## ComputedPropertyName::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ComputedPropertyName) -> Symbol;
```
## ComputedPropertyName::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ComputedPropertyName) -> Location;
```
## ComputedPropertyName::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ComputedPropertyName) -> string;
```
## ComputedPropertyName::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ComputedPropertyName) -> int;
```
## ComputedPropertyName::getExpression

```rust
pub fn getExpression(self: ComputedPropertyName) -> Expression;
```
## ComputedPropertyName::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ComputedPropertyName;
```
