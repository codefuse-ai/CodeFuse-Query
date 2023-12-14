# ThisTypeNode

Inherit from [TypeNode](./TypeNode.md)

Primary key: `id: int`

```rust
schema ThisTypeNode extends TypeNode {
  @primary id: int,
}
```
## ThisTypeNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ThisTypeNode) -> Location;
```
## ThisTypeNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ThisTypeNode) -> Symbol;
```
## ThisTypeNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ThisTypeNode) -> *Decorator;
```
## ThisTypeNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ThisTypeNode) -> string;
```
## ThisTypeNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ThisTypeNode, i: int) -> Modifier;
```
## ThisTypeNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ThisTypeNode) -> *Comment;
```
## ThisTypeNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ThisTypeNode) -> *Node;
```
## ThisTypeNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ThisTypeNode) -> *Node;
```
## ThisTypeNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ThisTypeNode) -> Node;
```
## ThisTypeNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ThisTypeNode) -> int;
```
## ThisTypeNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ThisTypeNode) -> TopLevelDO;
```
## ThisTypeNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ThisTypeNode, i: int) -> Decorator;
```
## ThisTypeNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ThisTypeNode) -> int;
```
## ThisTypeNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ThisTypeNode) -> *Modifier;
```
## ThisTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ThisTypeNode) -> int;
```
## ThisTypeNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ThisTypeNode, i: int) -> Node;
```
## ThisTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ThisTypeNode) -> int;
```
## ThisTypeNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ThisTypeNode) -> *FunctionLikeDeclaration;
```
## ThisTypeNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ThisTypeNode, level: int) -> *Node;
```
## ThisTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ThisTypeNode) -> int;
```
## ThisTypeNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ThisTypeNode) -> string;
```
## ThisTypeNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ThisTypeNode, level: int) -> Node;
```
## ThisTypeNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ThisTypeNode) -> File;
```
## ThisTypeNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ThisTypeNode) -> *Comment;
```
## ThisTypeNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ThisTypeNode) -> *Comment;
```
## ThisTypeNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ThisTypeNode) -> Node;
```
## ThisTypeNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ThisTypeNode) -> FunctionLikeDeclaration;
```
## ThisTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ThisTypeNode) -> int;
```
## ThisTypeNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ThisTypeNode) -> int;
```
## ThisTypeNode::getIndex

```rust
pub fn getIndex(self: ThisTypeNode) -> int;
```
## ThisTypeNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ThisTypeNode) -> *Node;
```
## ThisTypeNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ThisTypeNode;
```
