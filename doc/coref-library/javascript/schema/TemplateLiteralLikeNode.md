# TemplateLiteralLikeNode

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema TemplateLiteralLikeNode extends Node {
  @primary id: int,
}
```
## TemplateLiteralLikeNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TemplateLiteralLikeNode) -> *Node;
```
## TemplateLiteralLikeNode::getIndex

```rust
pub fn getIndex(self: TemplateLiteralLikeNode) -> int;
```
## TemplateLiteralLikeNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TemplateLiteralLikeNode) -> int;
```
## TemplateLiteralLikeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateLiteralLikeNode) -> int;
```
## TemplateLiteralLikeNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TemplateLiteralLikeNode) -> Node;
```
## TemplateLiteralLikeNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TemplateLiteralLikeNode) -> FunctionLikeDeclaration;
```
## TemplateLiteralLikeNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TemplateLiteralLikeNode) -> File;
```
## TemplateLiteralLikeNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TemplateLiteralLikeNode, level: int) -> Node;
```
## TemplateLiteralLikeNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TemplateLiteralLikeNode) -> string;
```
## TemplateLiteralLikeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateLiteralLikeNode) -> int;
```
## TemplateLiteralLikeNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateLiteralLikeNode) -> *FunctionLikeDeclaration;
```
## TemplateLiteralLikeNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TemplateLiteralLikeNode, level: int) -> *Node;
```
## TemplateLiteralLikeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateLiteralLikeNode) -> int;
```
## TemplateLiteralLikeNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TemplateLiteralLikeNode, i: int) -> Node;
```
## TemplateLiteralLikeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateLiteralLikeNode) -> int;
```
## TemplateLiteralLikeNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TemplateLiteralLikeNode) -> int;
```
## TemplateLiteralLikeNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TemplateLiteralLikeNode) -> *Modifier;
```
## TemplateLiteralLikeNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TemplateLiteralLikeNode) -> TopLevelDO;
```
## TemplateLiteralLikeNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TemplateLiteralLikeNode, i: int) -> Decorator;
```
## TemplateLiteralLikeNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TemplateLiteralLikeNode) -> int;
```
## TemplateLiteralLikeNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TemplateLiteralLikeNode) -> *Comment;
```
## TemplateLiteralLikeNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TemplateLiteralLikeNode) -> *Comment;
```
## TemplateLiteralLikeNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TemplateLiteralLikeNode) -> Node;
```
## TemplateLiteralLikeNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TemplateLiteralLikeNode) -> *Node;
```
## TemplateLiteralLikeNode::getValue

```java
/**
* Gets the value of this literal-like node, as a string.
*/
```
```rust
pub fn getValue(self: TemplateLiteralLikeNode) -> string;
```
## TemplateLiteralLikeNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TemplateLiteralLikeNode) -> *Node;
```
## TemplateLiteralLikeNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TemplateLiteralLikeNode) -> *Comment;
```
## TemplateLiteralLikeNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TemplateLiteralLikeNode, i: int) -> Modifier;
```
## TemplateLiteralLikeNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TemplateLiteralLikeNode) -> string;
```
## TemplateLiteralLikeNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TemplateLiteralLikeNode) -> *Decorator;
```
## TemplateLiteralLikeNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TemplateLiteralLikeNode) -> Symbol;
```
## TemplateLiteralLikeNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TemplateLiteralLikeNode) -> Location;
```
## TemplateLiteralLikeNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateLiteralLikeNode;
```
