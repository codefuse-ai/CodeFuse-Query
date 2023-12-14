# TemplateLiteralTypeNode

Inherit from [TypeNode](./TypeNode.md)

Primary key: `id: int`

```rust
schema TemplateLiteralTypeNode extends TypeNode {
  @primary id: int,
}
```
## TemplateLiteralTypeNode::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TemplateLiteralTypeNode) -> Location;
```
## TemplateLiteralTypeNode::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TemplateLiteralTypeNode) -> string;
```
## TemplateLiteralTypeNode::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TemplateLiteralTypeNode, i: int) -> Modifier;
```
## TemplateLiteralTypeNode::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TemplateLiteralTypeNode) -> *Comment;
```
## TemplateLiteralTypeNode::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TemplateLiteralTypeNode) -> *Node;
```
## TemplateLiteralTypeNode::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TemplateLiteralTypeNode) -> *Node;
```
## TemplateLiteralTypeNode::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TemplateLiteralTypeNode) -> Node;
```
## TemplateLiteralTypeNode::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TemplateLiteralTypeNode) -> *Comment;
```
## TemplateLiteralTypeNode::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TemplateLiteralTypeNode) -> *Comment;
```
## TemplateLiteralTypeNode::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TemplateLiteralTypeNode) -> int;
```
## TemplateLiteralTypeNode::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TemplateLiteralTypeNode, i: int) -> Decorator;
```
## TemplateLiteralTypeNode::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TemplateLiteralTypeNode) -> TopLevelDO;
```
## TemplateLiteralTypeNode::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TemplateLiteralTypeNode) -> int;
```
## TemplateLiteralTypeNode::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TemplateLiteralTypeNode) -> *Modifier;
```
## TemplateLiteralTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateLiteralTypeNode) -> int;
```
## TemplateLiteralTypeNode::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TemplateLiteralTypeNode, i: int) -> Node;
```
## TemplateLiteralTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateLiteralTypeNode) -> int;
```
## TemplateLiteralTypeNode::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TemplateLiteralTypeNode, level: int) -> *Node;
```
## TemplateLiteralTypeNode::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateLiteralTypeNode) -> *FunctionLikeDeclaration;
```
## TemplateLiteralTypeNode::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TemplateLiteralTypeNode, level: int) -> Node;
```
## TemplateLiteralTypeNode::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TemplateLiteralTypeNode) -> File;
```
## TemplateLiteralTypeNode::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TemplateLiteralTypeNode) -> Node;
```
## TemplateLiteralTypeNode::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TemplateLiteralTypeNode) -> FunctionLikeDeclaration;
```
## TemplateLiteralTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateLiteralTypeNode) -> int;
```
## TemplateLiteralTypeNode::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TemplateLiteralTypeNode) -> int;
```
## TemplateLiteralTypeNode::getIndex

```rust
pub fn getIndex(self: TemplateLiteralTypeNode) -> int;
```
## TemplateLiteralTypeNode::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateLiteralTypeNode;
```
## TemplateLiteralTypeNode::getTemplateSpan

```rust
pub fn getTemplateSpan(self: TemplateLiteralTypeNode, i: int) -> TemplateLiteralTypeSpan;
```
## TemplateLiteralTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateLiteralTypeNode) -> int;
```
## TemplateLiteralTypeNode::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TemplateLiteralTypeNode) -> string;
```
## TemplateLiteralTypeNode::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TemplateLiteralTypeNode) -> Symbol;
```
## TemplateLiteralTypeNode::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TemplateLiteralTypeNode) -> *Decorator;
```
## TemplateLiteralTypeNode::getHead

```rust
pub fn getHead(self: TemplateLiteralTypeNode) -> TemplateHead;
```
## TemplateLiteralTypeNode::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TemplateLiteralTypeNode) -> *Node;
```
## TemplateLiteralTypeNode::getATemplateSpan

```rust
pub fn getATemplateSpan(self: TemplateLiteralTypeNode) -> *TemplateLiteralTypeSpan;
```
