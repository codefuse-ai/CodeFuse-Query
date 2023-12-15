# NoSubstitutionTemplateLiteralToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema NoSubstitutionTemplateLiteralToken extends Token {
  @primary id: int
}
```
## NoSubstitutionTemplateLiteralToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: NoSubstitutionTemplateLiteralToken) -> Location;
```
## NoSubstitutionTemplateLiteralToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: NoSubstitutionTemplateLiteralToken) -> Symbol;
```
## NoSubstitutionTemplateLiteralToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: NoSubstitutionTemplateLiteralToken) -> *Decorator;
```
## NoSubstitutionTemplateLiteralToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: NoSubstitutionTemplateLiteralToken) -> string;
```
## NoSubstitutionTemplateLiteralToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: NoSubstitutionTemplateLiteralToken, i: int) -> Modifier;
```
## NoSubstitutionTemplateLiteralToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: NoSubstitutionTemplateLiteralToken) -> *Comment;
```
## NoSubstitutionTemplateLiteralToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: NoSubstitutionTemplateLiteralToken) -> *Node;
```
## NoSubstitutionTemplateLiteralToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: NoSubstitutionTemplateLiteralToken) -> *Node;
```
## NoSubstitutionTemplateLiteralToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: NoSubstitutionTemplateLiteralToken) -> Node;
```
## NoSubstitutionTemplateLiteralToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: NoSubstitutionTemplateLiteralToken) -> int;
```
## NoSubstitutionTemplateLiteralToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: NoSubstitutionTemplateLiteralToken) -> TopLevelDO;
```
## NoSubstitutionTemplateLiteralToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: NoSubstitutionTemplateLiteralToken, i: int) -> Decorator;
```
## NoSubstitutionTemplateLiteralToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: NoSubstitutionTemplateLiteralToken) -> int;
```
## NoSubstitutionTemplateLiteralToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: NoSubstitutionTemplateLiteralToken) -> *Modifier;
```
## NoSubstitutionTemplateLiteralToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NoSubstitutionTemplateLiteralToken) -> int;
```
## NoSubstitutionTemplateLiteralToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: NoSubstitutionTemplateLiteralToken, i: int) -> Node;
```
## NoSubstitutionTemplateLiteralToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NoSubstitutionTemplateLiteralToken) -> int;
```
## NoSubstitutionTemplateLiteralToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NoSubstitutionTemplateLiteralToken) -> *FunctionLikeDeclaration;
```
## NoSubstitutionTemplateLiteralToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: NoSubstitutionTemplateLiteralToken, level: int) -> *Node;
```
## NoSubstitutionTemplateLiteralToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NoSubstitutionTemplateLiteralToken) -> int;
```
## NoSubstitutionTemplateLiteralToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: NoSubstitutionTemplateLiteralToken) -> string;
```
## NoSubstitutionTemplateLiteralToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: NoSubstitutionTemplateLiteralToken, level: int) -> Node;
```
## NoSubstitutionTemplateLiteralToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: NoSubstitutionTemplateLiteralToken) -> File;
```
## NoSubstitutionTemplateLiteralToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: NoSubstitutionTemplateLiteralToken) -> *Comment;
```
## NoSubstitutionTemplateLiteralToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: NoSubstitutionTemplateLiteralToken) -> *Comment;
```
## NoSubstitutionTemplateLiteralToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: NoSubstitutionTemplateLiteralToken) -> Node;
```
## NoSubstitutionTemplateLiteralToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: NoSubstitutionTemplateLiteralToken) -> FunctionLikeDeclaration;
```
## NoSubstitutionTemplateLiteralToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NoSubstitutionTemplateLiteralToken) -> int;
```
## NoSubstitutionTemplateLiteralToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: NoSubstitutionTemplateLiteralToken) -> int;
```
## NoSubstitutionTemplateLiteralToken::getIndex

```rust
pub fn getIndex(self: NoSubstitutionTemplateLiteralToken) -> int;
```
## NoSubstitutionTemplateLiteralToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: NoSubstitutionTemplateLiteralToken) -> *Node;
```
## NoSubstitutionTemplateLiteralToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NoSubstitutionTemplateLiteralToken;
```
