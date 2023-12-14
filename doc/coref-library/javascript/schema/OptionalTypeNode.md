# OptionalTypeNode

Inherit from [TypeNode](./TypeNode.md)

Primary key: `id: int`

```rust
schema OptionalTypeNode extends TypeNode {
  @primary id: int,
}
```
## OptionalTypeNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: OptionalTypeNode) -> Location;
```
## OptionalTypeNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: OptionalTypeNode) -> Symbol;
```
## OptionalTypeNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: OptionalTypeNode) -> *Decorator;
```
## OptionalTypeNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: OptionalTypeNode) -> string;
```
## OptionalTypeNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: OptionalTypeNode, i: int) -> Modifier;
```
## OptionalTypeNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: OptionalTypeNode) -> *Comment;
```
## OptionalTypeNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: OptionalTypeNode) -> *Node;
```
## OptionalTypeNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: OptionalTypeNode) -> *Node;
```
## OptionalTypeNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: OptionalTypeNode) -> Node;
```
## OptionalTypeNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: OptionalTypeNode) -> int;
```
## OptionalTypeNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: OptionalTypeNode) -> TopLevelDO;
```
## OptionalTypeNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: OptionalTypeNode, i: int) -> Decorator;
```
## OptionalTypeNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: OptionalTypeNode) -> int;
```
## OptionalTypeNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: OptionalTypeNode) -> *Modifier;
```
## OptionalTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: OptionalTypeNode) -> int;
```
## OptionalTypeNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: OptionalTypeNode, i: int) -> Node;
```
## OptionalTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: OptionalTypeNode) -> int;
```
## OptionalTypeNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: OptionalTypeNode) -> *FunctionLikeDeclaration;
```
## OptionalTypeNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: OptionalTypeNode, level: int) -> *Node;
```
## OptionalTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: OptionalTypeNode) -> int;
```
## OptionalTypeNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: OptionalTypeNode) -> string;
```
## OptionalTypeNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: OptionalTypeNode, level: int) -> Node;
```
## OptionalTypeNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: OptionalTypeNode) -> File;
```
## OptionalTypeNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: OptionalTypeNode) -> *Comment;
```
## OptionalTypeNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: OptionalTypeNode) -> *Comment;
```
## OptionalTypeNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: OptionalTypeNode) -> Node;
```
## OptionalTypeNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: OptionalTypeNode) -> FunctionLikeDeclaration;
```
## OptionalTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: OptionalTypeNode) -> int;
```
## OptionalTypeNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: OptionalTypeNode) -> int;
```
## OptionalTypeNode::getIndex

```rust
pub fn getIndex(self: OptionalTypeNode) -> int;
```
## OptionalTypeNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: OptionalTypeNode) -> *Node;
```
## OptionalTypeNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *OptionalTypeNode;
```
