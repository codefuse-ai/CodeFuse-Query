# ExpressionWithTypeArguments

Inherit from [NodeWithTypeArguments](./NodeWithTypeArguments.md)

Primary key: `id: int`

```rust
schema ExpressionWithTypeArguments extends NodeWithTypeArguments {
  @primary id: int
}
```
## ExpressionWithTypeArguments::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ExpressionWithTypeArguments) -> *Node;
```
## ExpressionWithTypeArguments::getIndex

```rust
pub fn getIndex(self: ExpressionWithTypeArguments) -> int;
```
## ExpressionWithTypeArguments::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ExpressionWithTypeArguments) -> int;
```
## ExpressionWithTypeArguments::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExpressionWithTypeArguments) -> int;
```
## ExpressionWithTypeArguments::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ExpressionWithTypeArguments) -> FunctionLikeDeclaration;
```
## ExpressionWithTypeArguments::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ExpressionWithTypeArguments) -> Node;
```
## ExpressionWithTypeArguments::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ExpressionWithTypeArguments) -> *Comment;
```
## ExpressionWithTypeArguments::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ExpressionWithTypeArguments) -> *Comment;
```
## ExpressionWithTypeArguments::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ExpressionWithTypeArguments) -> File;
```
## ExpressionWithTypeArguments::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ExpressionWithTypeArguments, level: int) -> Node;
```
## ExpressionWithTypeArguments::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExpressionWithTypeArguments) -> int;
```
## ExpressionWithTypeArguments::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ExpressionWithTypeArguments) -> string;
```
## ExpressionWithTypeArguments::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExpressionWithTypeArguments) -> *FunctionLikeDeclaration;
```
## ExpressionWithTypeArguments::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ExpressionWithTypeArguments, level: int) -> *Node;
```
## ExpressionWithTypeArguments::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ExpressionWithTypeArguments) -> int;
```
## ExpressionWithTypeArguments::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ExpressionWithTypeArguments) -> *Modifier;
```
## ExpressionWithTypeArguments::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExpressionWithTypeArguments) -> int;
```
## ExpressionWithTypeArguments::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExpressionWithTypeArguments) -> int;
```
## ExpressionWithTypeArguments::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ExpressionWithTypeArguments, i: int) -> Node;
```
## ExpressionWithTypeArguments::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ExpressionWithTypeArguments, i: int) -> Decorator;
```
## ExpressionWithTypeArguments::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ExpressionWithTypeArguments) -> TopLevelDO;
```
## ExpressionWithTypeArguments::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ExpressionWithTypeArguments) -> int;
```
## ExpressionWithTypeArguments::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ExpressionWithTypeArguments) -> Node;
```
## ExpressionWithTypeArguments::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ExpressionWithTypeArguments) -> *Node;
```
## ExpressionWithTypeArguments::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ExpressionWithTypeArguments) -> *Node;
```
## ExpressionWithTypeArguments::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ExpressionWithTypeArguments) -> *Comment;
```
## ExpressionWithTypeArguments::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ExpressionWithTypeArguments) -> Symbol;
```
## ExpressionWithTypeArguments::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ExpressionWithTypeArguments) -> *Decorator;
```
## ExpressionWithTypeArguments::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ExpressionWithTypeArguments, i: int) -> Modifier;
```
## ExpressionWithTypeArguments::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ExpressionWithTypeArguments) -> string;
```
## ExpressionWithTypeArguments::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ExpressionWithTypeArguments;
```
## ExpressionWithTypeArguments::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ExpressionWithTypeArguments) -> Location;
```
