# MappedTypeNode

Inherit from [TypeNode](./TypeNode.md)

Primary key: `id: int`

```rust
schema MappedTypeNode extends TypeNode {
  @primary id: int
}
```
## MappedTypeNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: MappedTypeNode) -> Location;
```
## MappedTypeNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: MappedTypeNode) -> Symbol;
```
## MappedTypeNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: MappedTypeNode) -> *Decorator;
```
## MappedTypeNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: MappedTypeNode) -> string;
```
## MappedTypeNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: MappedTypeNode, i: int) -> Modifier;
```
## MappedTypeNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: MappedTypeNode) -> *Comment;
```
## MappedTypeNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: MappedTypeNode) -> *Node;
```
## MappedTypeNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: MappedTypeNode) -> *Node;
```
## MappedTypeNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: MappedTypeNode) -> Node;
```
## MappedTypeNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: MappedTypeNode) -> int;
```
## MappedTypeNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: MappedTypeNode) -> TopLevelDO;
```
## MappedTypeNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: MappedTypeNode, i: int) -> Decorator;
```
## MappedTypeNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: MappedTypeNode) -> int;
```
## MappedTypeNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: MappedTypeNode) -> *Modifier;
```
## MappedTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MappedTypeNode) -> int;
```
## MappedTypeNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: MappedTypeNode, i: int) -> Node;
```
## MappedTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MappedTypeNode) -> int;
```
## MappedTypeNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MappedTypeNode) -> *FunctionLikeDeclaration;
```
## MappedTypeNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: MappedTypeNode, level: int) -> *Node;
```
## MappedTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MappedTypeNode) -> int;
```
## MappedTypeNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: MappedTypeNode) -> string;
```
## MappedTypeNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: MappedTypeNode, level: int) -> Node;
```
## MappedTypeNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: MappedTypeNode) -> File;
```
## MappedTypeNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: MappedTypeNode) -> *Comment;
```
## MappedTypeNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: MappedTypeNode) -> *Comment;
```
## MappedTypeNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: MappedTypeNode) -> Node;
```
## MappedTypeNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: MappedTypeNode) -> FunctionLikeDeclaration;
```
## MappedTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MappedTypeNode) -> int;
```
## MappedTypeNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: MappedTypeNode) -> int;
```
## MappedTypeNode::getIndex

```rust
pub fn getIndex(self: MappedTypeNode) -> int;
```
## MappedTypeNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: MappedTypeNode) -> *Node;
```
## MappedTypeNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *MappedTypeNode;
```
