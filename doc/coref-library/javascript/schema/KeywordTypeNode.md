# KeywordTypeNode

Inherit from [TypeNode](./TypeNode.md)

Primary key: `id: int`

```rust
schema KeywordTypeNode extends TypeNode {
  @primary id: int
}
```
## KeywordTypeNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: KeywordTypeNode) -> Location;
```
## KeywordTypeNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: KeywordTypeNode) -> Symbol;
```
## KeywordTypeNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: KeywordTypeNode) -> *Decorator;
```
## KeywordTypeNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: KeywordTypeNode) -> string;
```
## KeywordTypeNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: KeywordTypeNode, i: int) -> Modifier;
```
## KeywordTypeNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: KeywordTypeNode) -> *Comment;
```
## KeywordTypeNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: KeywordTypeNode) -> *Node;
```
## KeywordTypeNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: KeywordTypeNode) -> *Node;
```
## KeywordTypeNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: KeywordTypeNode) -> Node;
```
## KeywordTypeNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: KeywordTypeNode) -> int;
```
## KeywordTypeNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: KeywordTypeNode) -> TopLevelDO;
```
## KeywordTypeNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: KeywordTypeNode, i: int) -> Decorator;
```
## KeywordTypeNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: KeywordTypeNode) -> int;
```
## KeywordTypeNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: KeywordTypeNode) -> *Modifier;
```
## KeywordTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: KeywordTypeNode) -> int;
```
## KeywordTypeNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: KeywordTypeNode, i: int) -> Node;
```
## KeywordTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: KeywordTypeNode) -> int;
```
## KeywordTypeNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: KeywordTypeNode) -> *FunctionLikeDeclaration;
```
## KeywordTypeNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: KeywordTypeNode, level: int) -> *Node;
```
## KeywordTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: KeywordTypeNode) -> int;
```
## KeywordTypeNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: KeywordTypeNode) -> string;
```
## KeywordTypeNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: KeywordTypeNode, level: int) -> Node;
```
## KeywordTypeNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: KeywordTypeNode) -> File;
```
## KeywordTypeNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: KeywordTypeNode) -> *Comment;
```
## KeywordTypeNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: KeywordTypeNode) -> *Comment;
```
## KeywordTypeNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: KeywordTypeNode) -> Node;
```
## KeywordTypeNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: KeywordTypeNode) -> FunctionLikeDeclaration;
```
## KeywordTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: KeywordTypeNode) -> int;
```
## KeywordTypeNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: KeywordTypeNode) -> int;
```
## KeywordTypeNode::getIndex

```rust
pub fn getIndex(self: KeywordTypeNode) -> int;
```
## KeywordTypeNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: KeywordTypeNode) -> *Node;
```
## KeywordTypeNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *KeywordTypeNode;
```
