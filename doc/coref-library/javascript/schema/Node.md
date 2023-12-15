# Node

Primary key: `id: int`

```rust
schema Node {
  @primary id: int
}
```
## Node::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: Node) -> *Decorator;
```
## Node::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: Node) -> Symbol;
```
## Node::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: Node, i: int) -> Modifier;
```
## Node::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: Node) -> string;
```
## Node::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: Node) -> *Comment;
```
## Node::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: Node) -> *Comment;
```
## Node::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: Node) -> *Comment;
```
## Node::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: Node, i: int) -> Decorator;
```
## Node::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: Node) -> TopLevelDO;
```
## Node::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: Node) -> int;
```
## Node::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: Node) -> *Node;
```
## Node::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: Node) -> Node;
```
## Node::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: Node) -> *Node;
```
## Node::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: Node) -> *Modifier;
```
## Node::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: Node) -> int;
```
## Node::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: Node) -> int;
```
## Node::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: Node, level: int) -> *Node;
```
## Node::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: Node) -> *FunctionLikeDeclaration;
```
## Node::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: Node, i: int) -> Node;
```
## Node::getStartLineNumber

```rust
pub fn getStartLineNumber(self: Node) -> int;
```
## Node::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *Node;
```
## Node::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: Node) -> Location;
```
## Node::getEndLineNumber

```rust
pub fn getEndLineNumber(self: Node) -> int;
```
## Node::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: Node) -> string;
```
## Node::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: Node, level: int) -> Node;
```
## Node::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: Node) -> File;
```
## Node::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: Node) -> FunctionLikeDeclaration;
```
## Node::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: Node) -> Node;
```
## Node::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: Node) -> int;
```
## Node::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: Node) -> int;
```
## Node::getIndex

```rust
pub fn getIndex(self: Node) -> int;
```
## Node::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: Node) -> *Node;
```
