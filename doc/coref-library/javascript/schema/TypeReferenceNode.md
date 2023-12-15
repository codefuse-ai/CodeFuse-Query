# TypeReferenceNode

Inherit from [NodeWithTypeArguments](./NodeWithTypeArguments.md)

Primary key: `id: int`

```rust
schema TypeReferenceNode extends NodeWithTypeArguments {
  @primary id: int
}
```
## TypeReferenceNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TypeReferenceNode) -> *Node;
```
## TypeReferenceNode::getIndex

```rust
pub fn getIndex(self: TypeReferenceNode) -> int;
```
## TypeReferenceNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TypeReferenceNode) -> int;
```
## TypeReferenceNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TypeReferenceNode) -> int;
```
## TypeReferenceNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TypeReferenceNode) -> FunctionLikeDeclaration;
```
## TypeReferenceNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TypeReferenceNode) -> Node;
```
## TypeReferenceNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TypeReferenceNode) -> *Comment;
```
## TypeReferenceNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TypeReferenceNode) -> *Comment;
```
## TypeReferenceNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TypeReferenceNode) -> File;
```
## TypeReferenceNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TypeReferenceNode, level: int) -> Node;
```
## TypeReferenceNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TypeReferenceNode) -> int;
```
## TypeReferenceNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TypeReferenceNode) -> string;
```
## TypeReferenceNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TypeReferenceNode) -> *FunctionLikeDeclaration;
```
## TypeReferenceNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TypeReferenceNode, level: int) -> *Node;
```
## TypeReferenceNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TypeReferenceNode) -> int;
```
## TypeReferenceNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TypeReferenceNode) -> *Modifier;
```
## TypeReferenceNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TypeReferenceNode) -> int;
```
## TypeReferenceNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TypeReferenceNode) -> int;
```
## TypeReferenceNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TypeReferenceNode, i: int) -> Node;
```
## TypeReferenceNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TypeReferenceNode, i: int) -> Decorator;
```
## TypeReferenceNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TypeReferenceNode) -> TopLevelDO;
```
## TypeReferenceNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TypeReferenceNode) -> int;
```
## TypeReferenceNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TypeReferenceNode) -> Node;
```
## TypeReferenceNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TypeReferenceNode) -> *Node;
```
## TypeReferenceNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TypeReferenceNode) -> *Node;
```
## TypeReferenceNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TypeReferenceNode) -> *Comment;
```
## TypeReferenceNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TypeReferenceNode) -> Symbol;
```
## TypeReferenceNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TypeReferenceNode) -> *Decorator;
```
## TypeReferenceNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TypeReferenceNode;
```
## TypeReferenceNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TypeReferenceNode) -> Location;
```
## TypeReferenceNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TypeReferenceNode) -> string;
```
## TypeReferenceNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TypeReferenceNode, i: int) -> Modifier;
```
## TypeReferenceNode::getTypeName

```rust
pub fn getTypeName(self: TypeReferenceNode) -> Node;
```
