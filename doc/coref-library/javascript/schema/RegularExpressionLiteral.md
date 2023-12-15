# RegularExpressionLiteral

Inherit from [LiteralExpression](./LiteralExpression.md)

Primary key: `id: int`

```rust
schema RegularExpressionLiteral extends LiteralExpression {
  @primary id: int
}
```
## RegularExpressionLiteral::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: RegularExpressionLiteral) -> Node;
```
## RegularExpressionLiteral::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: RegularExpressionLiteral) -> string;
```
## RegularExpressionLiteral::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: RegularExpressionLiteral, i: int) -> Modifier;
```
## RegularExpressionLiteral::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: RegularExpressionLiteral) -> Location;
```
## RegularExpressionLiteral::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: RegularExpressionLiteral) -> *Decorator;
```
## RegularExpressionLiteral::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: RegularExpressionLiteral) -> Symbol;
```
## RegularExpressionLiteral::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: RegularExpressionLiteral) -> *Comment;
```
## RegularExpressionLiteral::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: RegularExpressionLiteral) -> *Node;
```
## RegularExpressionLiteral::getValue

```java
/**
* Gets the value of this literal, as a string.
*/
```
```rust
pub fn getValue(self: RegularExpressionLiteral) -> string;
```
## RegularExpressionLiteral::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: RegularExpressionLiteral) -> *Node;
```
## RegularExpressionLiteral::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: RegularExpressionLiteral) -> Node;
```
## RegularExpressionLiteral::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: RegularExpressionLiteral) -> int;
```
## RegularExpressionLiteral::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: RegularExpressionLiteral) -> TopLevelDO;
```
## RegularExpressionLiteral::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: RegularExpressionLiteral, i: int) -> Decorator;
```
## RegularExpressionLiteral::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: RegularExpressionLiteral) -> int;
```
## RegularExpressionLiteral::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RegularExpressionLiteral) -> int;
```
## RegularExpressionLiteral::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: RegularExpressionLiteral) -> *Modifier;
```
## RegularExpressionLiteral::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: RegularExpressionLiteral, i: int) -> Node;
```
## RegularExpressionLiteral::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RegularExpressionLiteral) -> int;
```
## RegularExpressionLiteral::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: RegularExpressionLiteral, level: int) -> *Node;
```
## RegularExpressionLiteral::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RegularExpressionLiteral) -> *FunctionLikeDeclaration;
```
## RegularExpressionLiteral::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: RegularExpressionLiteral) -> *Comment;
```
## RegularExpressionLiteral::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: RegularExpressionLiteral) -> *Comment;
```
## RegularExpressionLiteral::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: RegularExpressionLiteral) -> FunctionLikeDeclaration;
```
## RegularExpressionLiteral::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RegularExpressionLiteral) -> int;
```
## RegularExpressionLiteral::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: RegularExpressionLiteral) -> File;
```
## RegularExpressionLiteral::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: RegularExpressionLiteral, level: int) -> Node;
```
## RegularExpressionLiteral::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: RegularExpressionLiteral) -> int;
```
## RegularExpressionLiteral::getIndex

```rust
pub fn getIndex(self: RegularExpressionLiteral) -> int;
```
## RegularExpressionLiteral::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *RegularExpressionLiteral;
```
## RegularExpressionLiteral::getExpression

```rust
pub fn getExpression(self: RegularExpressionLiteral) -> Expression;
```
## RegularExpressionLiteral::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: RegularExpressionLiteral) -> string;
```
## RegularExpressionLiteral::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RegularExpressionLiteral) -> int;
```
## RegularExpressionLiteral::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: RegularExpressionLiteral) -> *Node;
```
