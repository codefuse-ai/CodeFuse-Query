# RestTypeNode

Inherit from [TypeNode](./TypeNode.md)

Primary key: `id: int`

```rust
schema RestTypeNode extends TypeNode {
  @primary id: int,
}
```
## RestTypeNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: RestTypeNode) -> Location;
```
## RestTypeNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: RestTypeNode) -> Symbol;
```
## RestTypeNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: RestTypeNode) -> *Decorator;
```
## RestTypeNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: RestTypeNode) -> string;
```
## RestTypeNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: RestTypeNode, i: int) -> Modifier;
```
## RestTypeNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: RestTypeNode) -> *Comment;
```
## RestTypeNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: RestTypeNode) -> *Node;
```
## RestTypeNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: RestTypeNode) -> *Node;
```
## RestTypeNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: RestTypeNode) -> Node;
```
## RestTypeNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: RestTypeNode) -> int;
```
## RestTypeNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: RestTypeNode) -> TopLevelDO;
```
## RestTypeNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: RestTypeNode, i: int) -> Decorator;
```
## RestTypeNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: RestTypeNode) -> int;
```
## RestTypeNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: RestTypeNode) -> *Modifier;
```
## RestTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RestTypeNode) -> int;
```
## RestTypeNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: RestTypeNode, i: int) -> Node;
```
## RestTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RestTypeNode) -> int;
```
## RestTypeNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RestTypeNode) -> *FunctionLikeDeclaration;
```
## RestTypeNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: RestTypeNode, level: int) -> *Node;
```
## RestTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RestTypeNode) -> int;
```
## RestTypeNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: RestTypeNode) -> string;
```
## RestTypeNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: RestTypeNode, level: int) -> Node;
```
## RestTypeNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: RestTypeNode) -> File;
```
## RestTypeNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: RestTypeNode) -> *Comment;
```
## RestTypeNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: RestTypeNode) -> *Comment;
```
## RestTypeNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: RestTypeNode) -> Node;
```
## RestTypeNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: RestTypeNode) -> FunctionLikeDeclaration;
```
## RestTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RestTypeNode) -> int;
```
## RestTypeNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: RestTypeNode) -> int;
```
## RestTypeNode::getIndex

```rust
pub fn getIndex(self: RestTypeNode) -> int;
```
## RestTypeNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: RestTypeNode) -> *Node;
```
## RestTypeNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *RestTypeNode;
```
