# ArrayTypeNode

Primary key: `id: int`

```rust
schema ArrayTypeNode {
  @primary id: int,
}
```
## ArrayTypeNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ArrayTypeNode) -> Location;
```
## ArrayTypeNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ArrayTypeNode) -> Symbol;
```
## ArrayTypeNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ArrayTypeNode) -> *Decorator;
```
## ArrayTypeNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ArrayTypeNode) -> string;
```
## ArrayTypeNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ArrayTypeNode, i: int) -> Modifier;
```
## ArrayTypeNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ArrayTypeNode) -> *Comment;
```
## ArrayTypeNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ArrayTypeNode) -> *Node;
```
## ArrayTypeNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ArrayTypeNode) -> *Node;
```
## ArrayTypeNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ArrayTypeNode) -> Node;
```
## ArrayTypeNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ArrayTypeNode) -> int;
```
## ArrayTypeNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ArrayTypeNode) -> TopLevelDO;
```
## ArrayTypeNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ArrayTypeNode, i: int) -> Decorator;
```
## ArrayTypeNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ArrayTypeNode) -> int;
```
## ArrayTypeNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ArrayTypeNode) -> *Modifier;
```
## ArrayTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ArrayTypeNode) -> int;
```
## ArrayTypeNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ArrayTypeNode, i: int) -> Node;
```
## ArrayTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ArrayTypeNode) -> int;
```
## ArrayTypeNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ArrayTypeNode) -> *FunctionLikeDeclaration;
```
## ArrayTypeNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ArrayTypeNode, level: int) -> *Node;
```
## ArrayTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ArrayTypeNode) -> int;
```
## ArrayTypeNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ArrayTypeNode) -> string;
```
## ArrayTypeNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ArrayTypeNode, level: int) -> Node;
```
## ArrayTypeNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ArrayTypeNode) -> File;
```
## ArrayTypeNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ArrayTypeNode) -> *Comment;
```
## ArrayTypeNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ArrayTypeNode) -> *Comment;
```
## ArrayTypeNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ArrayTypeNode) -> Node;
```
## ArrayTypeNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ArrayTypeNode) -> FunctionLikeDeclaration;
```
## ArrayTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ArrayTypeNode) -> int;
```
## ArrayTypeNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ArrayTypeNode) -> int;
```
## ArrayTypeNode::getIndex

```rust
pub fn getIndex(self: ArrayTypeNode) -> int;
```
## ArrayTypeNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ArrayTypeNode) -> *Node;
```
## ArrayTypeNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ArrayTypeNode;
```
