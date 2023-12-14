# TupleTypeNode

Inherit from [TypeNode](./TypeNode.md)

Primary key: `id: int`

```rust
schema TupleTypeNode extends TypeNode {
  @primary id: int,
}
```
## TupleTypeNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TupleTypeNode) -> Location;
```
## TupleTypeNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TupleTypeNode) -> Symbol;
```
## TupleTypeNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TupleTypeNode) -> *Decorator;
```
## TupleTypeNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TupleTypeNode) -> string;
```
## TupleTypeNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TupleTypeNode, i: int) -> Modifier;
```
## TupleTypeNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TupleTypeNode) -> *Comment;
```
## TupleTypeNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TupleTypeNode) -> *Node;
```
## TupleTypeNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TupleTypeNode) -> *Node;
```
## TupleTypeNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TupleTypeNode) -> Node;
```
## TupleTypeNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TupleTypeNode) -> int;
```
## TupleTypeNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TupleTypeNode) -> TopLevelDO;
```
## TupleTypeNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TupleTypeNode, i: int) -> Decorator;
```
## TupleTypeNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TupleTypeNode) -> int;
```
## TupleTypeNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TupleTypeNode) -> *Modifier;
```
## TupleTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TupleTypeNode) -> int;
```
## TupleTypeNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TupleTypeNode, i: int) -> Node;
```
## TupleTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TupleTypeNode) -> int;
```
## TupleTypeNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TupleTypeNode) -> *FunctionLikeDeclaration;
```
## TupleTypeNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TupleTypeNode, level: int) -> *Node;
```
## TupleTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TupleTypeNode) -> int;
```
## TupleTypeNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TupleTypeNode) -> string;
```
## TupleTypeNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TupleTypeNode, level: int) -> Node;
```
## TupleTypeNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TupleTypeNode) -> File;
```
## TupleTypeNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TupleTypeNode) -> *Comment;
```
## TupleTypeNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TupleTypeNode) -> *Comment;
```
## TupleTypeNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TupleTypeNode) -> Node;
```
## TupleTypeNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TupleTypeNode) -> FunctionLikeDeclaration;
```
## TupleTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TupleTypeNode) -> int;
```
## TupleTypeNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TupleTypeNode) -> int;
```
## TupleTypeNode::getIndex

```rust
pub fn getIndex(self: TupleTypeNode) -> int;
```
## TupleTypeNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TupleTypeNode) -> *Node;
```
## TupleTypeNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TupleTypeNode;
```
