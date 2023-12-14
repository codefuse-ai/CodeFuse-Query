# InferTypeNode

Primary key: `id: int`

```rust
schema InferTypeNode {
  @primary id: int,
}
```
## InferTypeNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: InferTypeNode) -> Location;
```
## InferTypeNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: InferTypeNode) -> Symbol;
```
## InferTypeNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: InferTypeNode) -> *Decorator;
```
## InferTypeNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: InferTypeNode) -> string;
```
## InferTypeNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: InferTypeNode, i: int) -> Modifier;
```
## InferTypeNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: InferTypeNode) -> *Comment;
```
## InferTypeNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: InferTypeNode) -> *Node;
```
## InferTypeNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: InferTypeNode) -> *Node;
```
## InferTypeNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: InferTypeNode) -> Node;
```
## InferTypeNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: InferTypeNode) -> int;
```
## InferTypeNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: InferTypeNode) -> TopLevelDO;
```
## InferTypeNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: InferTypeNode, i: int) -> Decorator;
```
## InferTypeNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: InferTypeNode) -> int;
```
## InferTypeNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: InferTypeNode) -> *Modifier;
```
## InferTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: InferTypeNode) -> int;
```
## InferTypeNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: InferTypeNode, i: int) -> Node;
```
## InferTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: InferTypeNode) -> int;
```
## InferTypeNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: InferTypeNode) -> *FunctionLikeDeclaration;
```
## InferTypeNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: InferTypeNode, level: int) -> *Node;
```
## InferTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: InferTypeNode) -> int;
```
## InferTypeNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: InferTypeNode) -> string;
```
## InferTypeNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: InferTypeNode, level: int) -> Node;
```
## InferTypeNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: InferTypeNode) -> File;
```
## InferTypeNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: InferTypeNode) -> *Comment;
```
## InferTypeNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: InferTypeNode) -> *Comment;
```
## InferTypeNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: InferTypeNode) -> Node;
```
## InferTypeNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: InferTypeNode) -> FunctionLikeDeclaration;
```
## InferTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: InferTypeNode) -> int;
```
## InferTypeNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: InferTypeNode) -> int;
```
## InferTypeNode::getIndex

```rust
pub fn getIndex(self: InferTypeNode) -> int;
```
## InferTypeNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: InferTypeNode) -> *Node;
```
## InferTypeNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *InferTypeNode;
```
