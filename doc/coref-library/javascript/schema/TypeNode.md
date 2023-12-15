# TypeNode

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema TypeNode extends Node {
  @primary id: int
}
```
## TypeNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TypeNode) -> *Node;
```
## TypeNode::getIndex

```rust
pub fn getIndex(self: TypeNode) -> int;
```
## TypeNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TypeNode) -> int;
```
## TypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TypeNode) -> int;
```
## TypeNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TypeNode) -> Node;
```
## TypeNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TypeNode) -> FunctionLikeDeclaration;
```
## TypeNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TypeNode) -> File;
```
## TypeNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TypeNode, level: int) -> Node;
```
## TypeNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TypeNode) -> string;
```
## TypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TypeNode) -> int;
```
## TypeNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TypeNode) -> *FunctionLikeDeclaration;
```
## TypeNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TypeNode, level: int) -> *Node;
```
## TypeNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TypeNode) -> int;
```
## TypeNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TypeNode) -> *Modifier;
```
## TypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TypeNode) -> int;
```
## TypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TypeNode) -> int;
```
## TypeNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TypeNode, i: int) -> Node;
```
## TypeNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TypeNode, i: int) -> Decorator;
```
## TypeNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TypeNode) -> TopLevelDO;
```
## TypeNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TypeNode) -> int;
```
## TypeNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TypeNode) -> *Comment;
```
## TypeNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TypeNode) -> *Comment;
```
## TypeNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TypeNode) -> Node;
```
## TypeNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TypeNode) -> *Node;
```
## TypeNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TypeNode) -> *Node;
```
## TypeNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TypeNode) -> *Comment;
```
## TypeNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TypeNode, i: int) -> Modifier;
```
## TypeNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TypeNode) -> string;
```
## TypeNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TypeNode) -> *Decorator;
```
## TypeNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TypeNode) -> Symbol;
```
## TypeNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TypeNode) -> Location;
```
## TypeNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TypeNode;
```
