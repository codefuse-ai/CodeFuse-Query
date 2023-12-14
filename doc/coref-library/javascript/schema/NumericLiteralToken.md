# NumericLiteralToken

Primary key: `id: int`

```rust
schema NumericLiteralToken {
  @primary id: int,
}
```
## NumericLiteralToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: NumericLiteralToken) -> Location;
```
## NumericLiteralToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: NumericLiteralToken) -> Symbol;
```
## NumericLiteralToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: NumericLiteralToken) -> *Decorator;
```
## NumericLiteralToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: NumericLiteralToken) -> string;
```
## NumericLiteralToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: NumericLiteralToken, i: int) -> Modifier;
```
## NumericLiteralToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: NumericLiteralToken) -> *Comment;
```
## NumericLiteralToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: NumericLiteralToken) -> *Node;
```
## NumericLiteralToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: NumericLiteralToken) -> *Node;
```
## NumericLiteralToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: NumericLiteralToken) -> Node;
```
## NumericLiteralToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: NumericLiteralToken) -> int;
```
## NumericLiteralToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: NumericLiteralToken) -> TopLevelDO;
```
## NumericLiteralToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: NumericLiteralToken, i: int) -> Decorator;
```
## NumericLiteralToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: NumericLiteralToken) -> int;
```
## NumericLiteralToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: NumericLiteralToken) -> *Modifier;
```
## NumericLiteralToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NumericLiteralToken) -> int;
```
## NumericLiteralToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: NumericLiteralToken, i: int) -> Node;
```
## NumericLiteralToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NumericLiteralToken) -> int;
```
## NumericLiteralToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NumericLiteralToken) -> *FunctionLikeDeclaration;
```
## NumericLiteralToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: NumericLiteralToken, level: int) -> *Node;
```
## NumericLiteralToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NumericLiteralToken) -> int;
```
## NumericLiteralToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: NumericLiteralToken) -> string;
```
## NumericLiteralToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: NumericLiteralToken, level: int) -> Node;
```
## NumericLiteralToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: NumericLiteralToken) -> File;
```
## NumericLiteralToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: NumericLiteralToken) -> *Comment;
```
## NumericLiteralToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: NumericLiteralToken) -> *Comment;
```
## NumericLiteralToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: NumericLiteralToken) -> Node;
```
## NumericLiteralToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: NumericLiteralToken) -> FunctionLikeDeclaration;
```
## NumericLiteralToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NumericLiteralToken) -> int;
```
## NumericLiteralToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: NumericLiteralToken) -> int;
```
## NumericLiteralToken::getIndex

```rust
pub fn getIndex(self: NumericLiteralToken) -> int;
```
## NumericLiteralToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: NumericLiteralToken) -> *Node;
```
## NumericLiteralToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NumericLiteralToken;
```
