# RelationalOperator

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema RelationalOperator extends Token {
  @primary id: int
}
```
## RelationalOperator::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: RelationalOperator) -> Location;
```
## RelationalOperator::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: RelationalOperator) -> Symbol;
```
## RelationalOperator::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: RelationalOperator) -> *Decorator;
```
## RelationalOperator::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: RelationalOperator) -> string;
```
## RelationalOperator::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: RelationalOperator, i: int) -> Modifier;
```
## RelationalOperator::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: RelationalOperator) -> *Comment;
```
## RelationalOperator::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: RelationalOperator) -> *Node;
```
## RelationalOperator::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: RelationalOperator) -> *Node;
```
## RelationalOperator::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: RelationalOperator) -> Node;
```
## RelationalOperator::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: RelationalOperator) -> int;
```
## RelationalOperator::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: RelationalOperator) -> TopLevelDO;
```
## RelationalOperator::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: RelationalOperator, i: int) -> Decorator;
```
## RelationalOperator::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: RelationalOperator) -> int;
```
## RelationalOperator::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: RelationalOperator) -> *Modifier;
```
## RelationalOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RelationalOperator) -> int;
```
## RelationalOperator::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: RelationalOperator, i: int) -> Node;
```
## RelationalOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RelationalOperator) -> int;
```
## RelationalOperator::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RelationalOperator) -> *FunctionLikeDeclaration;
```
## RelationalOperator::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: RelationalOperator, level: int) -> *Node;
```
## RelationalOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RelationalOperator) -> int;
```
## RelationalOperator::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: RelationalOperator) -> string;
```
## RelationalOperator::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: RelationalOperator, level: int) -> Node;
```
## RelationalOperator::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: RelationalOperator) -> File;
```
## RelationalOperator::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: RelationalOperator) -> *Comment;
```
## RelationalOperator::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: RelationalOperator) -> *Comment;
```
## RelationalOperator::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: RelationalOperator) -> Node;
```
## RelationalOperator::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: RelationalOperator) -> FunctionLikeDeclaration;
```
## RelationalOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RelationalOperator) -> int;
```
## RelationalOperator::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: RelationalOperator) -> int;
```
## RelationalOperator::getIndex

```rust
pub fn getIndex(self: RelationalOperator) -> int;
```
## RelationalOperator::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: RelationalOperator) -> *Node;
```
## RelationalOperator::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *RelationalOperator;
```
