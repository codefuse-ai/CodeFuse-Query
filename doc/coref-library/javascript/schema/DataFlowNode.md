# DataFlowNode

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema DataFlowNode extends Node {
  @primary id: int
}
```
## DataFlowNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: DataFlowNode) -> *Node;
```
## DataFlowNode::getIndex

```rust
pub fn getIndex(self: DataFlowNode) -> int;
```
## DataFlowNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: DataFlowNode) -> int;
```
## DataFlowNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DataFlowNode) -> int;
```
## DataFlowNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: DataFlowNode) -> Node;
```
## DataFlowNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: DataFlowNode) -> FunctionLikeDeclaration;
```
## DataFlowNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: DataFlowNode) -> File;
```
## DataFlowNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: DataFlowNode, level: int) -> Node;
```
## DataFlowNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: DataFlowNode) -> string;
```
## DataFlowNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DataFlowNode) -> int;
```
## DataFlowNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: DataFlowNode) -> Location;
```
## DataFlowNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: DataFlowNode) -> int;
```
## DataFlowNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: DataFlowNode) -> *Modifier;
```
## DataFlowNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DataFlowNode) -> int;
```
## DataFlowNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DataFlowNode) -> int;
```
## DataFlowNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: DataFlowNode, i: int) -> Node;
```
## DataFlowNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: DataFlowNode, level: int) -> *Node;
```
## DataFlowNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DataFlowNode) -> *FunctionLikeDeclaration;
```
## DataFlowNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: DataFlowNode) -> int;
```
## DataFlowNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: DataFlowNode, i: int) -> Decorator;
```
## DataFlowNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: DataFlowNode) -> TopLevelDO;
```
## DataFlowNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: DataFlowNode) -> *Comment;
```
## DataFlowNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: DataFlowNode) -> *Comment;
```
## DataFlowNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: DataFlowNode) -> Node;
```
## DataFlowNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: DataFlowNode) -> *Node;
```
## DataFlowNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: DataFlowNode) -> *Node;
```
## DataFlowNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: DataFlowNode) -> *Comment;
```
## DataFlowNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: DataFlowNode, i: int) -> Modifier;
```
## DataFlowNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: DataFlowNode) -> string;
```
## DataFlowNode::getAPredecessor

```rust
pub fn getAPredecessor(self: DataFlowNode) -> *DataFlowNode;
```
## DataFlowNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: DataFlowNode) -> Symbol;
```
## DataFlowNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: DataFlowNode) -> *Decorator;
```
## DataFlowNode::getASuccessor

```rust
pub fn getASuccessor(self: DataFlowNode) -> *DataFlowNode;
```
## DataFlowNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *DataFlowNode;
```
