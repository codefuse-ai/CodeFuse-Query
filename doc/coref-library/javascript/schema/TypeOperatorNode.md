# TypeOperatorNode

Inherit from [TypeNode](./TypeNode.md)

Primary key: `id: int`

```rust
schema TypeOperatorNode extends TypeNode {
  @primary id: int,
}
```
## TypeOperatorNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TypeOperatorNode) -> Symbol;
```
## TypeOperatorNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TypeOperatorNode) -> *Decorator;
```
## TypeOperatorNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TypeOperatorNode) -> string;
```
## TypeOperatorNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TypeOperatorNode, i: int) -> Modifier;
```
## TypeOperatorNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TypeOperatorNode) -> *Comment;
```
## TypeOperatorNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TypeOperatorNode) -> *Node;
```
## TypeOperatorNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TypeOperatorNode) -> *Node;
```
## TypeOperatorNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TypeOperatorNode) -> Node;
```
## TypeOperatorNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TypeOperatorNode) -> *Comment;
```
## TypeOperatorNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TypeOperatorNode) -> *Comment;
```
## TypeOperatorNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TypeOperatorNode) -> int;
```
## TypeOperatorNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TypeOperatorNode) -> TopLevelDO;
```
## TypeOperatorNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TypeOperatorNode, i: int) -> Decorator;
```
## TypeOperatorNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TypeOperatorNode) -> int;
```
## TypeOperatorNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TypeOperatorNode) -> *Modifier;
```
## TypeOperatorNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TypeOperatorNode) -> int;
```
## TypeOperatorNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TypeOperatorNode, i: int) -> Node;
```
## TypeOperatorNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TypeOperatorNode) -> int;
```
## TypeOperatorNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TypeOperatorNode) -> *FunctionLikeDeclaration;
```
## TypeOperatorNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TypeOperatorNode, level: int) -> *Node;
```
## TypeOperatorNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TypeOperatorNode) -> int;
```
## TypeOperatorNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TypeOperatorNode) -> string;
```
## TypeOperatorNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TypeOperatorNode, level: int) -> Node;
```
## TypeOperatorNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TypeOperatorNode) -> File;
```
## TypeOperatorNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TypeOperatorNode) -> int;
```
## TypeOperatorNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TypeOperatorNode) -> FunctionLikeDeclaration;
```
## TypeOperatorNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TypeOperatorNode) -> Node;
```
## TypeOperatorNode::getIndex

```rust
pub fn getIndex(self: TypeOperatorNode) -> int;
```
## TypeOperatorNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TypeOperatorNode) -> Location;
```
## TypeOperatorNode::getOperator

```rust
pub fn getOperator(self: TypeOperatorNode) -> KeywordToken;
```
## TypeOperatorNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TypeOperatorNode) -> *Node;
```
## TypeOperatorNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TypeOperatorNode;
```
## TypeOperatorNode::getType

```rust
pub fn getType(self: TypeOperatorNode) -> TypeNode;
```
## TypeOperatorNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TypeOperatorNode) -> int;
```
