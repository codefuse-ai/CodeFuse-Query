# TypeQueryNode

Inherit from [TypeNode](./TypeNode.md)

Primary key: `id: int`

```rust
schema TypeQueryNode extends TypeNode {
  @primary id: int
}
```
## TypeQueryNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TypeQueryNode) -> Location;
```
## TypeQueryNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TypeQueryNode) -> Symbol;
```
## TypeQueryNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TypeQueryNode) -> *Decorator;
```
## TypeQueryNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TypeQueryNode) -> string;
```
## TypeQueryNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TypeQueryNode, i: int) -> Modifier;
```
## TypeQueryNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TypeQueryNode) -> *Comment;
```
## TypeQueryNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TypeQueryNode) -> *Node;
```
## TypeQueryNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TypeQueryNode) -> *Node;
```
## TypeQueryNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TypeQueryNode) -> Node;
```
## TypeQueryNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TypeQueryNode) -> int;
```
## TypeQueryNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TypeQueryNode) -> TopLevelDO;
```
## TypeQueryNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TypeQueryNode, i: int) -> Decorator;
```
## TypeQueryNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TypeQueryNode) -> int;
```
## TypeQueryNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TypeQueryNode) -> *Modifier;
```
## TypeQueryNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TypeQueryNode) -> int;
```
## TypeQueryNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TypeQueryNode, i: int) -> Node;
```
## TypeQueryNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TypeQueryNode) -> int;
```
## TypeQueryNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TypeQueryNode) -> *FunctionLikeDeclaration;
```
## TypeQueryNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TypeQueryNode, level: int) -> *Node;
```
## TypeQueryNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TypeQueryNode) -> int;
```
## TypeQueryNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TypeQueryNode) -> string;
```
## TypeQueryNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TypeQueryNode, level: int) -> Node;
```
## TypeQueryNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TypeQueryNode) -> File;
```
## TypeQueryNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TypeQueryNode) -> *Comment;
```
## TypeQueryNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TypeQueryNode) -> *Comment;
```
## TypeQueryNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TypeQueryNode) -> Node;
```
## TypeQueryNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TypeQueryNode) -> FunctionLikeDeclaration;
```
## TypeQueryNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TypeQueryNode) -> int;
```
## TypeQueryNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TypeQueryNode) -> int;
```
## TypeQueryNode::getIndex

```rust
pub fn getIndex(self: TypeQueryNode) -> int;
```
## TypeQueryNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TypeQueryNode) -> *Node;
```
## TypeQueryNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TypeQueryNode;
```
