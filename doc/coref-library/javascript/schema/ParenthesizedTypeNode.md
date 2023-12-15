# ParenthesizedTypeNode

Inherit from [TypeNode](./TypeNode.md)

Primary key: `id: int`

```rust
schema ParenthesizedTypeNode extends TypeNode {
  @primary id: int
}
```
## ParenthesizedTypeNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ParenthesizedTypeNode) -> Location;
```
## ParenthesizedTypeNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ParenthesizedTypeNode) -> Symbol;
```
## ParenthesizedTypeNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ParenthesizedTypeNode) -> *Decorator;
```
## ParenthesizedTypeNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ParenthesizedTypeNode) -> string;
```
## ParenthesizedTypeNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ParenthesizedTypeNode, i: int) -> Modifier;
```
## ParenthesizedTypeNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ParenthesizedTypeNode) -> *Comment;
```
## ParenthesizedTypeNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ParenthesizedTypeNode) -> *Node;
```
## ParenthesizedTypeNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ParenthesizedTypeNode) -> *Node;
```
## ParenthesizedTypeNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ParenthesizedTypeNode) -> Node;
```
## ParenthesizedTypeNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ParenthesizedTypeNode) -> int;
```
## ParenthesizedTypeNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ParenthesizedTypeNode) -> TopLevelDO;
```
## ParenthesizedTypeNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ParenthesizedTypeNode, i: int) -> Decorator;
```
## ParenthesizedTypeNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ParenthesizedTypeNode) -> int;
```
## ParenthesizedTypeNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ParenthesizedTypeNode) -> *Modifier;
```
## ParenthesizedTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ParenthesizedTypeNode) -> int;
```
## ParenthesizedTypeNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ParenthesizedTypeNode, i: int) -> Node;
```
## ParenthesizedTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ParenthesizedTypeNode) -> int;
```
## ParenthesizedTypeNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ParenthesizedTypeNode) -> *FunctionLikeDeclaration;
```
## ParenthesizedTypeNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ParenthesizedTypeNode, level: int) -> *Node;
```
## ParenthesizedTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ParenthesizedTypeNode) -> int;
```
## ParenthesizedTypeNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ParenthesizedTypeNode) -> string;
```
## ParenthesizedTypeNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ParenthesizedTypeNode, level: int) -> Node;
```
## ParenthesizedTypeNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ParenthesizedTypeNode) -> File;
```
## ParenthesizedTypeNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ParenthesizedTypeNode) -> *Comment;
```
## ParenthesizedTypeNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ParenthesizedTypeNode) -> *Comment;
```
## ParenthesizedTypeNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ParenthesizedTypeNode) -> Node;
```
## ParenthesizedTypeNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ParenthesizedTypeNode) -> FunctionLikeDeclaration;
```
## ParenthesizedTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ParenthesizedTypeNode) -> int;
```
## ParenthesizedTypeNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ParenthesizedTypeNode) -> int;
```
## ParenthesizedTypeNode::getIndex

```rust
pub fn getIndex(self: ParenthesizedTypeNode) -> int;
```
## ParenthesizedTypeNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ParenthesizedTypeNode) -> *Node;
```
## ParenthesizedTypeNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ParenthesizedTypeNode;
```
