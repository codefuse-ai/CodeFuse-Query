# ConstructorTypeNode

Inherit from [TypeNode](./TypeNode.md)

Primary key: `id: int`

```rust
schema ConstructorTypeNode extends TypeNode {
  @primary id: int
}
```
## ConstructorTypeNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ConstructorTypeNode) -> Location;
```
## ConstructorTypeNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ConstructorTypeNode) -> Symbol;
```
## ConstructorTypeNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ConstructorTypeNode) -> *Decorator;
```
## ConstructorTypeNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ConstructorTypeNode) -> string;
```
## ConstructorTypeNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ConstructorTypeNode, i: int) -> Modifier;
```
## ConstructorTypeNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ConstructorTypeNode) -> *Comment;
```
## ConstructorTypeNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ConstructorTypeNode) -> *Node;
```
## ConstructorTypeNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ConstructorTypeNode) -> *Node;
```
## ConstructorTypeNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ConstructorTypeNode) -> Node;
```
## ConstructorTypeNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ConstructorTypeNode) -> int;
```
## ConstructorTypeNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ConstructorTypeNode) -> TopLevelDO;
```
## ConstructorTypeNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ConstructorTypeNode, i: int) -> Decorator;
```
## ConstructorTypeNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ConstructorTypeNode) -> int;
```
## ConstructorTypeNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ConstructorTypeNode) -> *Modifier;
```
## ConstructorTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ConstructorTypeNode) -> int;
```
## ConstructorTypeNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ConstructorTypeNode, i: int) -> Node;
```
## ConstructorTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ConstructorTypeNode) -> int;
```
## ConstructorTypeNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ConstructorTypeNode) -> *FunctionLikeDeclaration;
```
## ConstructorTypeNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ConstructorTypeNode, level: int) -> *Node;
```
## ConstructorTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ConstructorTypeNode) -> int;
```
## ConstructorTypeNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ConstructorTypeNode) -> string;
```
## ConstructorTypeNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ConstructorTypeNode, level: int) -> Node;
```
## ConstructorTypeNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ConstructorTypeNode) -> File;
```
## ConstructorTypeNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ConstructorTypeNode) -> *Comment;
```
## ConstructorTypeNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ConstructorTypeNode) -> *Comment;
```
## ConstructorTypeNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ConstructorTypeNode) -> Node;
```
## ConstructorTypeNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ConstructorTypeNode) -> FunctionLikeDeclaration;
```
## ConstructorTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ConstructorTypeNode) -> int;
```
## ConstructorTypeNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ConstructorTypeNode) -> int;
```
## ConstructorTypeNode::getIndex

```rust
pub fn getIndex(self: ConstructorTypeNode) -> int;
```
## ConstructorTypeNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ConstructorTypeNode) -> *Node;
```
## ConstructorTypeNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ConstructorTypeNode;
```
