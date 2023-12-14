# UnionTypeNode

Primary key: `id: int`

```rust
schema UnionTypeNode {
  @primary id: int,
}
```
## UnionTypeNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: UnionTypeNode) -> Location;
```
## UnionTypeNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: UnionTypeNode) -> Symbol;
```
## UnionTypeNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: UnionTypeNode) -> *Decorator;
```
## UnionTypeNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: UnionTypeNode) -> string;
```
## UnionTypeNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: UnionTypeNode, i: int) -> Modifier;
```
## UnionTypeNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: UnionTypeNode) -> *Comment;
```
## UnionTypeNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: UnionTypeNode) -> *Node;
```
## UnionTypeNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: UnionTypeNode) -> *Node;
```
## UnionTypeNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: UnionTypeNode) -> Node;
```
## UnionTypeNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: UnionTypeNode) -> *Comment;
```
## UnionTypeNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: UnionTypeNode) -> *Comment;
```
## UnionTypeNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: UnionTypeNode) -> int;
```
## UnionTypeNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: UnionTypeNode) -> TopLevelDO;
```
## UnionTypeNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: UnionTypeNode, i: int) -> Decorator;
```
## UnionTypeNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: UnionTypeNode) -> int;
```
## UnionTypeNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: UnionTypeNode) -> *Modifier;
```
## UnionTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: UnionTypeNode) -> int;
```
## UnionTypeNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: UnionTypeNode, i: int) -> Node;
```
## UnionTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: UnionTypeNode) -> int;
```
## UnionTypeNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: UnionTypeNode) -> *FunctionLikeDeclaration;
```
## UnionTypeNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: UnionTypeNode, level: int) -> *Node;
```
## UnionTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: UnionTypeNode) -> int;
```
## UnionTypeNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: UnionTypeNode) -> string;
```
## UnionTypeNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: UnionTypeNode) -> File;
```
## UnionTypeNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: UnionTypeNode, level: int) -> Node;
```
## UnionTypeNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: UnionTypeNode) -> FunctionLikeDeclaration;
```
## UnionTypeNode::getAType

```rust
pub fn getAType(self: UnionTypeNode) -> *TypeNode;
```
## UnionTypeNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: UnionTypeNode) -> Node;
```
## UnionTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: UnionTypeNode) -> int;
```
## UnionTypeNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: UnionTypeNode) -> int;
```
## UnionTypeNode::getIndex

```rust
pub fn getIndex(self: UnionTypeNode) -> int;
```
## UnionTypeNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: UnionTypeNode) -> *Node;
```
## UnionTypeNode::getType

```rust
pub fn getType(self: UnionTypeNode, i: int) -> TypeNode;
```
## UnionTypeNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *UnionTypeNode;
```
