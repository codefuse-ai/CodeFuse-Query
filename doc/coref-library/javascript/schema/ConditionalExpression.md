# ConditionalExpression

Primary key: `id: int`

```rust
schema ConditionalExpression {
  @primary id: int,
}
```
## ConditionalExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ConditionalExpression) -> Location;
```
## ConditionalExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ConditionalExpression) -> Symbol;
```
## ConditionalExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ConditionalExpression) -> *Decorator;
```
## ConditionalExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ConditionalExpression) -> string;
```
## ConditionalExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ConditionalExpression, i: int) -> Modifier;
```
## ConditionalExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ConditionalExpression) -> *Comment;
```
## ConditionalExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ConditionalExpression) -> *Node;
```
## ConditionalExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ConditionalExpression) -> *Node;
```
## ConditionalExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ConditionalExpression) -> Node;
```
## ConditionalExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ConditionalExpression) -> *Comment;
```
## ConditionalExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ConditionalExpression) -> *Comment;
```
## ConditionalExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ConditionalExpression) -> int;
```
## ConditionalExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ConditionalExpression) -> TopLevelDO;
```
## ConditionalExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ConditionalExpression, i: int) -> Decorator;
```
## ConditionalExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ConditionalExpression) -> int;
```
## ConditionalExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ConditionalExpression) -> *Modifier;
```
## ConditionalExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ConditionalExpression) -> int;
```
## ConditionalExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ConditionalExpression, i: int) -> Node;
```
## ConditionalExpression::getCondition

```rust
pub fn getCondition(self: ConditionalExpression) -> Expression;
```
## ConditionalExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ConditionalExpression) -> int;
```
## ConditionalExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ConditionalExpression) -> *FunctionLikeDeclaration;
```
## ConditionalExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ConditionalExpression, level: int) -> *Node;
```
## ConditionalExpression::getElse

```rust
pub fn getElse(self: ConditionalExpression) -> Expression;
```
## ConditionalExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ConditionalExpression) -> int;
```
## ConditionalExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ConditionalExpression) -> string;
```
## ConditionalExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ConditionalExpression) -> int;
```
## ConditionalExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ConditionalExpression) -> FunctionLikeDeclaration;
```
## ConditionalExpression::getABranch

```rust
pub fn getABranch(self: ConditionalExpression) -> *Expression;
```
## ConditionalExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ConditionalExpression) -> Node;
```
## ConditionalExpression::getIndex

```rust
pub fn getIndex(self: ConditionalExpression) -> int;
```
## ConditionalExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ConditionalExpression) -> *Node;
```
## ConditionalExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ConditionalExpression;
```
## ConditionalExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ConditionalExpression, level: int) -> Node;
```
## ConditionalExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ConditionalExpression) -> File;
```
## ConditionalExpression::getThen

```rust
pub fn getThen(self: ConditionalExpression) -> Expression;
```
## ConditionalExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ConditionalExpression) -> int;
```
