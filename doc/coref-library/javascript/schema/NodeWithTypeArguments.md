# NodeWithTypeArguments

Inherit from [TypeNode](./TypeNode.md)

Primary key: `id: int`

```rust
schema NodeWithTypeArguments extends TypeNode {
  @primary id: int,
}
```
## NodeWithTypeArguments::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: NodeWithTypeArguments) -> Location;
```
## NodeWithTypeArguments::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: NodeWithTypeArguments) -> Symbol;
```
## NodeWithTypeArguments::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: NodeWithTypeArguments) -> *Decorator;
```
## NodeWithTypeArguments::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: NodeWithTypeArguments) -> string;
```
## NodeWithTypeArguments::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: NodeWithTypeArguments, i: int) -> Modifier;
```
## NodeWithTypeArguments::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: NodeWithTypeArguments) -> *Comment;
```
## NodeWithTypeArguments::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: NodeWithTypeArguments) -> *Node;
```
## NodeWithTypeArguments::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: NodeWithTypeArguments) -> *Node;
```
## NodeWithTypeArguments::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: NodeWithTypeArguments) -> Node;
```
## NodeWithTypeArguments::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: NodeWithTypeArguments) -> int;
```
## NodeWithTypeArguments::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: NodeWithTypeArguments) -> TopLevelDO;
```
## NodeWithTypeArguments::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: NodeWithTypeArguments, i: int) -> Decorator;
```
## NodeWithTypeArguments::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: NodeWithTypeArguments) -> int;
```
## NodeWithTypeArguments::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: NodeWithTypeArguments) -> *Modifier;
```
## NodeWithTypeArguments::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NodeWithTypeArguments) -> int;
```
## NodeWithTypeArguments::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: NodeWithTypeArguments, i: int) -> Node;
```
## NodeWithTypeArguments::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NodeWithTypeArguments) -> int;
```
## NodeWithTypeArguments::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NodeWithTypeArguments) -> *FunctionLikeDeclaration;
```
## NodeWithTypeArguments::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: NodeWithTypeArguments, level: int) -> *Node;
```
## NodeWithTypeArguments::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NodeWithTypeArguments) -> int;
```
## NodeWithTypeArguments::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: NodeWithTypeArguments) -> string;
```
## NodeWithTypeArguments::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: NodeWithTypeArguments, level: int) -> Node;
```
## NodeWithTypeArguments::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: NodeWithTypeArguments) -> File;
```
## NodeWithTypeArguments::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: NodeWithTypeArguments) -> *Comment;
```
## NodeWithTypeArguments::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: NodeWithTypeArguments) -> *Comment;
```
## NodeWithTypeArguments::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: NodeWithTypeArguments) -> Node;
```
## NodeWithTypeArguments::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: NodeWithTypeArguments) -> FunctionLikeDeclaration;
```
## NodeWithTypeArguments::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NodeWithTypeArguments) -> int;
```
## NodeWithTypeArguments::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: NodeWithTypeArguments) -> int;
```
## NodeWithTypeArguments::getIndex

```rust
pub fn getIndex(self: NodeWithTypeArguments) -> int;
```
## NodeWithTypeArguments::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: NodeWithTypeArguments) -> *Node;
```
## NodeWithTypeArguments::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NodeWithTypeArguments;
```
