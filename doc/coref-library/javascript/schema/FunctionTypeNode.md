# FunctionTypeNode

Inherit from [TypeNode](./TypeNode.md)

Primary key: `id: int`

```rust
schema FunctionTypeNode extends TypeNode {
  @primary id: int,
}
```
## FunctionTypeNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: FunctionTypeNode) -> Location;
```
## FunctionTypeNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: FunctionTypeNode) -> Symbol;
```
## FunctionTypeNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: FunctionTypeNode) -> *Decorator;
```
## FunctionTypeNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: FunctionTypeNode) -> string;
```
## FunctionTypeNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: FunctionTypeNode, i: int) -> Modifier;
```
## FunctionTypeNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: FunctionTypeNode) -> *Comment;
```
## FunctionTypeNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: FunctionTypeNode) -> *Node;
```
## FunctionTypeNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: FunctionTypeNode) -> *Node;
```
## FunctionTypeNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: FunctionTypeNode) -> Node;
```
## FunctionTypeNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: FunctionTypeNode) -> int;
```
## FunctionTypeNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: FunctionTypeNode) -> TopLevelDO;
```
## FunctionTypeNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: FunctionTypeNode, i: int) -> Decorator;
```
## FunctionTypeNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: FunctionTypeNode) -> int;
```
## FunctionTypeNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: FunctionTypeNode) -> *Modifier;
```
## FunctionTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: FunctionTypeNode) -> int;
```
## FunctionTypeNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: FunctionTypeNode, i: int) -> Node;
```
## FunctionTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: FunctionTypeNode) -> int;
```
## FunctionTypeNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: FunctionTypeNode) -> *FunctionLikeDeclaration;
```
## FunctionTypeNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: FunctionTypeNode, level: int) -> *Node;
```
## FunctionTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: FunctionTypeNode) -> int;
```
## FunctionTypeNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: FunctionTypeNode) -> string;
```
## FunctionTypeNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: FunctionTypeNode, level: int) -> Node;
```
## FunctionTypeNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: FunctionTypeNode) -> File;
```
## FunctionTypeNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: FunctionTypeNode) -> *Comment;
```
## FunctionTypeNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: FunctionTypeNode) -> *Comment;
```
## FunctionTypeNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: FunctionTypeNode) -> Node;
```
## FunctionTypeNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: FunctionTypeNode) -> FunctionLikeDeclaration;
```
## FunctionTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: FunctionTypeNode) -> int;
```
## FunctionTypeNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: FunctionTypeNode) -> int;
```
## FunctionTypeNode::getIndex

```rust
pub fn getIndex(self: FunctionTypeNode) -> int;
```
## FunctionTypeNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: FunctionTypeNode) -> *Node;
```
## FunctionTypeNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *FunctionTypeNode;
```
