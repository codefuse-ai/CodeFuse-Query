# PrivateIdentifier

Inherit from [PrimaryExpression](./PrimaryExpression.md)

Primary key: `id: int`

```rust
schema PrivateIdentifier extends PrimaryExpression {
  @primary id: int
}
```
## PrivateIdentifier::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PrivateIdentifier) -> *Node;
```
## PrivateIdentifier::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PrivateIdentifier) -> int;
```
## PrivateIdentifier::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PrivateIdentifier) -> string;
```
## PrivateIdentifier::getExpression

```rust
pub fn getExpression(self: PrivateIdentifier) -> Expression;
```
## PrivateIdentifier::getIndex

```rust
pub fn getIndex(self: PrivateIdentifier) -> int;
```
## PrivateIdentifier::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PrivateIdentifier) -> int;
```
## PrivateIdentifier::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PrivateIdentifier, level: int) -> Node;
```
## PrivateIdentifier::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PrivateIdentifier) -> File;
```
## PrivateIdentifier::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PrivateIdentifier) -> int;
```
## PrivateIdentifier::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PrivateIdentifier) -> FunctionLikeDeclaration;
```
## PrivateIdentifier::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PrivateIdentifier) -> *Comment;
```
## PrivateIdentifier::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PrivateIdentifier) -> *Comment;
```
## PrivateIdentifier::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PrivateIdentifier) -> *FunctionLikeDeclaration;
```
## PrivateIdentifier::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PrivateIdentifier, level: int) -> *Node;
```
## PrivateIdentifier::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PrivateIdentifier) -> int;
```
## PrivateIdentifier::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PrivateIdentifier) -> *Modifier;
```
## PrivateIdentifier::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PrivateIdentifier) -> int;
```
## PrivateIdentifier::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PrivateIdentifier) -> int;
```
## PrivateIdentifier::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PrivateIdentifier, i: int) -> Node;
```
## PrivateIdentifier::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PrivateIdentifier, i: int) -> Decorator;
```
## PrivateIdentifier::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PrivateIdentifier) -> TopLevelDO;
```
## PrivateIdentifier::getName

```rust
pub fn getName(self: PrivateIdentifier) -> string;
```
## PrivateIdentifier::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PrivateIdentifier) -> int;
```
## PrivateIdentifier::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PrivateIdentifier) -> Node;
```
## PrivateIdentifier::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PrivateIdentifier) -> *Node;
```
## PrivateIdentifier::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PrivateIdentifier) -> Node;
```
## PrivateIdentifier::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PrivateIdentifier) -> *Comment;
```
## PrivateIdentifier::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PrivateIdentifier) -> *Node;
```
## PrivateIdentifier::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PrivateIdentifier) -> Symbol;
```
## PrivateIdentifier::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PrivateIdentifier) -> *Decorator;
```
## PrivateIdentifier::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PrivateIdentifier) -> Location;
```
## PrivateIdentifier::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PrivateIdentifier;
```
## PrivateIdentifier::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PrivateIdentifier, i: int) -> Modifier;
```
## PrivateIdentifier::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PrivateIdentifier) -> string;
```
