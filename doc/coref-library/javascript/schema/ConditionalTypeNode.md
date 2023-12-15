# ConditionalTypeNode

Inherit from [TypeNode](./TypeNode.md)

Primary key: `id: int`

```rust
schema ConditionalTypeNode extends TypeNode {
  @primary id: int
}
```
## ConditionalTypeNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ConditionalTypeNode) -> Location;
```
## ConditionalTypeNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ConditionalTypeNode) -> Symbol;
```
## ConditionalTypeNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ConditionalTypeNode) -> *Decorator;
```
## ConditionalTypeNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ConditionalTypeNode) -> string;
```
## ConditionalTypeNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ConditionalTypeNode, i: int) -> Modifier;
```
## ConditionalTypeNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ConditionalTypeNode) -> *Comment;
```
## ConditionalTypeNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ConditionalTypeNode) -> *Node;
```
## ConditionalTypeNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ConditionalTypeNode) -> *Node;
```
## ConditionalTypeNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ConditionalTypeNode) -> Node;
```
## ConditionalTypeNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ConditionalTypeNode) -> *Comment;
```
## ConditionalTypeNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ConditionalTypeNode) -> *Comment;
```
## ConditionalTypeNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ConditionalTypeNode) -> int;
```
## ConditionalTypeNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ConditionalTypeNode) -> TopLevelDO;
```
## ConditionalTypeNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ConditionalTypeNode, i: int) -> Decorator;
```
## ConditionalTypeNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ConditionalTypeNode, i: int) -> Node;
```
## ConditionalTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ConditionalTypeNode) -> int;
```
## ConditionalTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ConditionalTypeNode) -> int;
```
## ConditionalTypeNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ConditionalTypeNode) -> int;
```
## ConditionalTypeNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ConditionalTypeNode) -> *Modifier;
```
## ConditionalTypeNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ConditionalTypeNode) -> *FunctionLikeDeclaration;
```
## ConditionalTypeNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ConditionalTypeNode, level: int) -> *Node;
```
## ConditionalTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ConditionalTypeNode) -> int;
```
## ConditionalTypeNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ConditionalTypeNode) -> string;
```
## ConditionalTypeNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ConditionalTypeNode, level: int) -> Node;
```
## ConditionalTypeNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ConditionalTypeNode) -> File;
```
## ConditionalTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ConditionalTypeNode) -> int;
```
## ConditionalTypeNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ConditionalTypeNode) -> FunctionLikeDeclaration;
```
## ConditionalTypeNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ConditionalTypeNode) -> Node;
```
## ConditionalTypeNode::getIndex

```rust
pub fn getIndex(self: ConditionalTypeNode) -> int;
```
## ConditionalTypeNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ConditionalTypeNode) -> int;
```
## ConditionalTypeNode::getElseType

```rust
pub fn getElseType(self: ConditionalTypeNode) -> TypeNode;
```
## ConditionalTypeNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ConditionalTypeNode) -> *Node;
```
## ConditionalTypeNode::getCheckType

```rust
pub fn getCheckType(self: ConditionalTypeNode) -> TypeNode;
```
## ConditionalTypeNode::getThenType

```rust
pub fn getThenType(self: ConditionalTypeNode) -> TypeNode;
```
## ConditionalTypeNode::getExtendsType

```rust
pub fn getExtendsType(self: ConditionalTypeNode) -> TypeNode;
```
## ConditionalTypeNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ConditionalTypeNode;
```
