# ImportTypeNode

Inherit from [NodeWithTypeArguments](./NodeWithTypeArguments.md)

Primary key: `id: int`

```rust
schema ImportTypeNode extends NodeWithTypeArguments {
  @primary id: int
}
```
## ImportTypeNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ImportTypeNode) -> *Node;
```
## ImportTypeNode::getIndex

```rust
pub fn getIndex(self: ImportTypeNode) -> int;
```
## ImportTypeNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ImportTypeNode) -> int;
```
## ImportTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ImportTypeNode) -> int;
```
## ImportTypeNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ImportTypeNode) -> FunctionLikeDeclaration;
```
## ImportTypeNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ImportTypeNode) -> Node;
```
## ImportTypeNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ImportTypeNode) -> *Comment;
```
## ImportTypeNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ImportTypeNode) -> *Comment;
```
## ImportTypeNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ImportTypeNode) -> File;
```
## ImportTypeNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ImportTypeNode, level: int) -> Node;
```
## ImportTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ImportTypeNode) -> int;
```
## ImportTypeNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ImportTypeNode) -> string;
```
## ImportTypeNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ImportTypeNode) -> *FunctionLikeDeclaration;
```
## ImportTypeNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ImportTypeNode, level: int) -> *Node;
```
## ImportTypeNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ImportTypeNode) -> int;
```
## ImportTypeNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ImportTypeNode) -> *Modifier;
```
## ImportTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ImportTypeNode) -> int;
```
## ImportTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ImportTypeNode) -> int;
```
## ImportTypeNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ImportTypeNode, i: int) -> Node;
```
## ImportTypeNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ImportTypeNode, i: int) -> Decorator;
```
## ImportTypeNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ImportTypeNode) -> TopLevelDO;
```
## ImportTypeNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ImportTypeNode) -> int;
```
## ImportTypeNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ImportTypeNode) -> Node;
```
## ImportTypeNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ImportTypeNode) -> *Node;
```
## ImportTypeNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ImportTypeNode) -> *Node;
```
## ImportTypeNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ImportTypeNode) -> *Comment;
```
## ImportTypeNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ImportTypeNode) -> Symbol;
```
## ImportTypeNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ImportTypeNode) -> *Decorator;
```
## ImportTypeNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ImportTypeNode, i: int) -> Modifier;
```
## ImportTypeNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ImportTypeNode) -> string;
```
## ImportTypeNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ImportTypeNode;
```
## ImportTypeNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ImportTypeNode) -> Location;
```
