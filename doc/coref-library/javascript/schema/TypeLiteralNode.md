# TypeLiteralNode

Inherit from [TypeNode](./TypeNode.md)

Primary key: `id: int`

```rust
schema TypeLiteralNode extends TypeNode {
  @primary id: int
}
```
## TypeLiteralNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TypeLiteralNode) -> Location;
```
## TypeLiteralNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TypeLiteralNode) -> Symbol;
```
## TypeLiteralNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TypeLiteralNode) -> *Decorator;
```
## TypeLiteralNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TypeLiteralNode) -> string;
```
## TypeLiteralNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TypeLiteralNode, i: int) -> Modifier;
```
## TypeLiteralNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TypeLiteralNode) -> *Comment;
```
## TypeLiteralNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TypeLiteralNode) -> *Node;
```
## TypeLiteralNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TypeLiteralNode) -> *Node;
```
## TypeLiteralNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TypeLiteralNode) -> Node;
```
## TypeLiteralNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TypeLiteralNode) -> int;
```
## TypeLiteralNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TypeLiteralNode) -> TopLevelDO;
```
## TypeLiteralNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TypeLiteralNode, i: int) -> Decorator;
```
## TypeLiteralNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TypeLiteralNode) -> int;
```
## TypeLiteralNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TypeLiteralNode) -> *Modifier;
```
## TypeLiteralNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TypeLiteralNode) -> int;
```
## TypeLiteralNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TypeLiteralNode, i: int) -> Node;
```
## TypeLiteralNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TypeLiteralNode) -> int;
```
## TypeLiteralNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TypeLiteralNode) -> *FunctionLikeDeclaration;
```
## TypeLiteralNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TypeLiteralNode, level: int) -> *Node;
```
## TypeLiteralNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TypeLiteralNode) -> int;
```
## TypeLiteralNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TypeLiteralNode) -> string;
```
## TypeLiteralNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TypeLiteralNode, level: int) -> Node;
```
## TypeLiteralNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TypeLiteralNode) -> File;
```
## TypeLiteralNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TypeLiteralNode) -> *Comment;
```
## TypeLiteralNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TypeLiteralNode) -> *Comment;
```
## TypeLiteralNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TypeLiteralNode) -> Node;
```
## TypeLiteralNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TypeLiteralNode) -> FunctionLikeDeclaration;
```
## TypeLiteralNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TypeLiteralNode) -> int;
```
## TypeLiteralNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TypeLiteralNode) -> int;
```
## TypeLiteralNode::getIndex

```rust
pub fn getIndex(self: TypeLiteralNode) -> int;
```
## TypeLiteralNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TypeLiteralNode) -> *Node;
```
## TypeLiteralNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TypeLiteralNode;
```
