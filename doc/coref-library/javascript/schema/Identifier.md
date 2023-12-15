# Identifier

Inherit from [PrimaryExpression](./PrimaryExpression.md)

Primary key: `id: int`

```rust
schema Identifier extends PrimaryExpression {
  @primary id: int
}
```
## Identifier::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: Identifier) -> *Node;
```
## Identifier::getEndLineNumber

```rust
pub fn getEndLineNumber(self: Identifier) -> int;
```
## Identifier::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: Identifier) -> string;
```
## Identifier::getExpression

```rust
pub fn getExpression(self: Identifier) -> Expression;
```
## Identifier::getIndex

```rust
pub fn getIndex(self: Identifier) -> int;
```
## Identifier::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: Identifier) -> int;
```
## Identifier::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: Identifier, level: int) -> Node;
```
## Identifier::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: Identifier) -> File;
```
## Identifier::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: Identifier) -> int;
```
## Identifier::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: Identifier) -> FunctionLikeDeclaration;
```
## Identifier::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: Identifier) -> *Comment;
```
## Identifier::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: Identifier) -> *Comment;
```
## Identifier::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: Identifier) -> *FunctionLikeDeclaration;
```
## Identifier::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: Identifier, level: int) -> *Node;
```
## Identifier::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: Identifier) -> int;
```
## Identifier::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: Identifier) -> *Modifier;
```
## Identifier::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: Identifier) -> int;
```
## Identifier::getStartLineNumber

```rust
pub fn getStartLineNumber(self: Identifier) -> int;
```
## Identifier::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: Identifier, i: int) -> Node;
```
## Identifier::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: Identifier, i: int) -> Decorator;
```
## Identifier::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: Identifier) -> TopLevelDO;
```
## Identifier::getName

```rust
pub fn getName(self: Identifier) -> string;
```
## Identifier::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: Identifier) -> int;
```
## Identifier::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: Identifier) -> Node;
```
## Identifier::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: Identifier) -> *Node;
```
## Identifier::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: Identifier) -> Node;
```
## Identifier::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: Identifier) -> *Comment;
```
## Identifier::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: Identifier) -> *Node;
```
## Identifier::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: Identifier) -> Symbol;
```
## Identifier::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: Identifier) -> *Decorator;
```
## Identifier::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: Identifier) -> Location;
```
## Identifier::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *Identifier;
```
## Identifier::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: Identifier, i: int) -> Modifier;
```
## Identifier::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: Identifier) -> string;
```
