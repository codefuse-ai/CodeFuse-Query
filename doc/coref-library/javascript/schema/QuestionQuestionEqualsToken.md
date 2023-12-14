# QuestionQuestionEqualsToken

Primary key: `id: int`

```rust
schema QuestionQuestionEqualsToken {
  @primary id: int,
}
```
## QuestionQuestionEqualsToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: QuestionQuestionEqualsToken) -> Location;
```
## QuestionQuestionEqualsToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: QuestionQuestionEqualsToken) -> Symbol;
```
## QuestionQuestionEqualsToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: QuestionQuestionEqualsToken) -> *Decorator;
```
## QuestionQuestionEqualsToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: QuestionQuestionEqualsToken) -> string;
```
## QuestionQuestionEqualsToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: QuestionQuestionEqualsToken, i: int) -> Modifier;
```
## QuestionQuestionEqualsToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: QuestionQuestionEqualsToken) -> *Comment;
```
## QuestionQuestionEqualsToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: QuestionQuestionEqualsToken) -> *Node;
```
## QuestionQuestionEqualsToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: QuestionQuestionEqualsToken) -> *Node;
```
## QuestionQuestionEqualsToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: QuestionQuestionEqualsToken) -> Node;
```
## QuestionQuestionEqualsToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: QuestionQuestionEqualsToken) -> int;
```
## QuestionQuestionEqualsToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: QuestionQuestionEqualsToken) -> TopLevelDO;
```
## QuestionQuestionEqualsToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: QuestionQuestionEqualsToken, i: int) -> Decorator;
```
## QuestionQuestionEqualsToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: QuestionQuestionEqualsToken) -> int;
```
## QuestionQuestionEqualsToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: QuestionQuestionEqualsToken) -> *Modifier;
```
## QuestionQuestionEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: QuestionQuestionEqualsToken) -> int;
```
## QuestionQuestionEqualsToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: QuestionQuestionEqualsToken, i: int) -> Node;
```
## QuestionQuestionEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: QuestionQuestionEqualsToken) -> int;
```
## QuestionQuestionEqualsToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: QuestionQuestionEqualsToken) -> *FunctionLikeDeclaration;
```
## QuestionQuestionEqualsToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: QuestionQuestionEqualsToken, level: int) -> *Node;
```
## QuestionQuestionEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: QuestionQuestionEqualsToken) -> int;
```
## QuestionQuestionEqualsToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: QuestionQuestionEqualsToken) -> string;
```
## QuestionQuestionEqualsToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: QuestionQuestionEqualsToken, level: int) -> Node;
```
## QuestionQuestionEqualsToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: QuestionQuestionEqualsToken) -> File;
```
## QuestionQuestionEqualsToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: QuestionQuestionEqualsToken) -> *Comment;
```
## QuestionQuestionEqualsToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: QuestionQuestionEqualsToken) -> *Comment;
```
## QuestionQuestionEqualsToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: QuestionQuestionEqualsToken) -> Node;
```
## QuestionQuestionEqualsToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: QuestionQuestionEqualsToken) -> FunctionLikeDeclaration;
```
## QuestionQuestionEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: QuestionQuestionEqualsToken) -> int;
```
## QuestionQuestionEqualsToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: QuestionQuestionEqualsToken) -> int;
```
## QuestionQuestionEqualsToken::getIndex

```rust
pub fn getIndex(self: QuestionQuestionEqualsToken) -> int;
```
## QuestionQuestionEqualsToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: QuestionQuestionEqualsToken) -> *Node;
```
## QuestionQuestionEqualsToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *QuestionQuestionEqualsToken;
```
