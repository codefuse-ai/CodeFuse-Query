# RegularExpressionLiteralToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema RegularExpressionLiteralToken extends Token {
  @primary id: int,
}
```
## RegularExpressionLiteralToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: RegularExpressionLiteralToken) -> Location;
```
## RegularExpressionLiteralToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: RegularExpressionLiteralToken) -> Symbol;
```
## RegularExpressionLiteralToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: RegularExpressionLiteralToken) -> *Decorator;
```
## RegularExpressionLiteralToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: RegularExpressionLiteralToken) -> string;
```
## RegularExpressionLiteralToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: RegularExpressionLiteralToken, i: int) -> Modifier;
```
## RegularExpressionLiteralToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: RegularExpressionLiteralToken) -> *Comment;
```
## RegularExpressionLiteralToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: RegularExpressionLiteralToken) -> *Node;
```
## RegularExpressionLiteralToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: RegularExpressionLiteralToken) -> *Node;
```
## RegularExpressionLiteralToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: RegularExpressionLiteralToken) -> Node;
```
## RegularExpressionLiteralToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: RegularExpressionLiteralToken) -> int;
```
## RegularExpressionLiteralToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: RegularExpressionLiteralToken) -> TopLevelDO;
```
## RegularExpressionLiteralToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: RegularExpressionLiteralToken, i: int) -> Decorator;
```
## RegularExpressionLiteralToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: RegularExpressionLiteralToken) -> int;
```
## RegularExpressionLiteralToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: RegularExpressionLiteralToken) -> *Modifier;
```
## RegularExpressionLiteralToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RegularExpressionLiteralToken) -> int;
```
## RegularExpressionLiteralToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: RegularExpressionLiteralToken, i: int) -> Node;
```
## RegularExpressionLiteralToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RegularExpressionLiteralToken) -> int;
```
## RegularExpressionLiteralToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RegularExpressionLiteralToken) -> *FunctionLikeDeclaration;
```
## RegularExpressionLiteralToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: RegularExpressionLiteralToken, level: int) -> *Node;
```
## RegularExpressionLiteralToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RegularExpressionLiteralToken) -> int;
```
## RegularExpressionLiteralToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: RegularExpressionLiteralToken) -> string;
```
## RegularExpressionLiteralToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: RegularExpressionLiteralToken, level: int) -> Node;
```
## RegularExpressionLiteralToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: RegularExpressionLiteralToken) -> File;
```
## RegularExpressionLiteralToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: RegularExpressionLiteralToken) -> *Comment;
```
## RegularExpressionLiteralToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: RegularExpressionLiteralToken) -> *Comment;
```
## RegularExpressionLiteralToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: RegularExpressionLiteralToken) -> Node;
```
## RegularExpressionLiteralToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: RegularExpressionLiteralToken) -> FunctionLikeDeclaration;
```
## RegularExpressionLiteralToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RegularExpressionLiteralToken) -> int;
```
## RegularExpressionLiteralToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: RegularExpressionLiteralToken) -> int;
```
## RegularExpressionLiteralToken::getIndex

```rust
pub fn getIndex(self: RegularExpressionLiteralToken) -> int;
```
## RegularExpressionLiteralToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: RegularExpressionLiteralToken) -> *Node;
```
## RegularExpressionLiteralToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *RegularExpressionLiteralToken;
```
