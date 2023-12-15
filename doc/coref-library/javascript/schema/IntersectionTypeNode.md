# IntersectionTypeNode

Inherit from [TypeNode](./TypeNode.md)

Primary key: `id: int`

```rust
schema IntersectionTypeNode extends TypeNode {
  @primary id: int
}
```
## IntersectionTypeNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: IntersectionTypeNode) -> Location;
```
## IntersectionTypeNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: IntersectionTypeNode) -> Symbol;
```
## IntersectionTypeNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: IntersectionTypeNode) -> *Decorator;
```
## IntersectionTypeNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: IntersectionTypeNode) -> string;
```
## IntersectionTypeNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: IntersectionTypeNode, i: int) -> Modifier;
```
## IntersectionTypeNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: IntersectionTypeNode) -> *Comment;
```
## IntersectionTypeNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: IntersectionTypeNode) -> *Node;
```
## IntersectionTypeNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: IntersectionTypeNode) -> *Node;
```
## IntersectionTypeNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: IntersectionTypeNode) -> Node;
```
## IntersectionTypeNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: IntersectionTypeNode) -> *Comment;
```
## IntersectionTypeNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: IntersectionTypeNode) -> *Comment;
```
## IntersectionTypeNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: IntersectionTypeNode) -> int;
```
## IntersectionTypeNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: IntersectionTypeNode) -> TopLevelDO;
```
## IntersectionTypeNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: IntersectionTypeNode, i: int) -> Decorator;
```
## IntersectionTypeNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: IntersectionTypeNode) -> int;
```
## IntersectionTypeNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: IntersectionTypeNode) -> *Modifier;
```
## IntersectionTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: IntersectionTypeNode) -> int;
```
## IntersectionTypeNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: IntersectionTypeNode, i: int) -> Node;
```
## IntersectionTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: IntersectionTypeNode) -> int;
```
## IntersectionTypeNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: IntersectionTypeNode) -> *FunctionLikeDeclaration;
```
## IntersectionTypeNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: IntersectionTypeNode, level: int) -> *Node;
```
## IntersectionTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: IntersectionTypeNode) -> int;
```
## IntersectionTypeNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: IntersectionTypeNode) -> string;
```
## IntersectionTypeNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: IntersectionTypeNode) -> File;
```
## IntersectionTypeNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: IntersectionTypeNode, level: int) -> Node;
```
## IntersectionTypeNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: IntersectionTypeNode) -> FunctionLikeDeclaration;
```
## IntersectionTypeNode::getAType

```rust
pub fn getAType(self: IntersectionTypeNode) -> *TypeNode;
```
## IntersectionTypeNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: IntersectionTypeNode) -> Node;
```
## IntersectionTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: IntersectionTypeNode) -> int;
```
## IntersectionTypeNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: IntersectionTypeNode) -> int;
```
## IntersectionTypeNode::getIndex

```rust
pub fn getIndex(self: IntersectionTypeNode) -> int;
```
## IntersectionTypeNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: IntersectionTypeNode) -> *Node;
```
## IntersectionTypeNode::getType

```rust
pub fn getType(self: IntersectionTypeNode, i: int) -> TypeNode;
```
## IntersectionTypeNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *IntersectionTypeNode;
```
