# NoSubstitutionTemplateLiteral

Primary key: `id: int`

```rust
schema NoSubstitutionTemplateLiteral {
  @primary id: int,
}
```
## NoSubstitutionTemplateLiteral::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: NoSubstitutionTemplateLiteral) -> Node;
```
## NoSubstitutionTemplateLiteral::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: NoSubstitutionTemplateLiteral) -> string;
```
## NoSubstitutionTemplateLiteral::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: NoSubstitutionTemplateLiteral, i: int) -> Modifier;
```
## NoSubstitutionTemplateLiteral::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: NoSubstitutionTemplateLiteral) -> Location;
```
## NoSubstitutionTemplateLiteral::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: NoSubstitutionTemplateLiteral) -> *Decorator;
```
## NoSubstitutionTemplateLiteral::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: NoSubstitutionTemplateLiteral) -> Symbol;
```
## NoSubstitutionTemplateLiteral::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: NoSubstitutionTemplateLiteral) -> *Comment;
```
## NoSubstitutionTemplateLiteral::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: NoSubstitutionTemplateLiteral) -> *Node;
```
## NoSubstitutionTemplateLiteral::getValue

```java
/**
* Gets the value of this literal, as a string.
*/
```
```rust
pub fn getValue(self: NoSubstitutionTemplateLiteral) -> string;
```
## NoSubstitutionTemplateLiteral::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: NoSubstitutionTemplateLiteral) -> *Node;
```
## NoSubstitutionTemplateLiteral::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: NoSubstitutionTemplateLiteral) -> Node;
```
## NoSubstitutionTemplateLiteral::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: NoSubstitutionTemplateLiteral) -> int;
```
## NoSubstitutionTemplateLiteral::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: NoSubstitutionTemplateLiteral) -> TopLevelDO;
```
## NoSubstitutionTemplateLiteral::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: NoSubstitutionTemplateLiteral, i: int) -> Decorator;
```
## NoSubstitutionTemplateLiteral::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: NoSubstitutionTemplateLiteral) -> int;
```
## NoSubstitutionTemplateLiteral::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NoSubstitutionTemplateLiteral) -> int;
```
## NoSubstitutionTemplateLiteral::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: NoSubstitutionTemplateLiteral) -> *Modifier;
```
## NoSubstitutionTemplateLiteral::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: NoSubstitutionTemplateLiteral, i: int) -> Node;
```
## NoSubstitutionTemplateLiteral::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NoSubstitutionTemplateLiteral) -> int;
```
## NoSubstitutionTemplateLiteral::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: NoSubstitutionTemplateLiteral, level: int) -> *Node;
```
## NoSubstitutionTemplateLiteral::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NoSubstitutionTemplateLiteral) -> *FunctionLikeDeclaration;
```
## NoSubstitutionTemplateLiteral::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: NoSubstitutionTemplateLiteral) -> *Comment;
```
## NoSubstitutionTemplateLiteral::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: NoSubstitutionTemplateLiteral) -> *Comment;
```
## NoSubstitutionTemplateLiteral::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: NoSubstitutionTemplateLiteral) -> FunctionLikeDeclaration;
```
## NoSubstitutionTemplateLiteral::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NoSubstitutionTemplateLiteral) -> int;
```
## NoSubstitutionTemplateLiteral::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: NoSubstitutionTemplateLiteral) -> File;
```
## NoSubstitutionTemplateLiteral::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: NoSubstitutionTemplateLiteral, level: int) -> Node;
```
## NoSubstitutionTemplateLiteral::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: NoSubstitutionTemplateLiteral) -> int;
```
## NoSubstitutionTemplateLiteral::getIndex

```rust
pub fn getIndex(self: NoSubstitutionTemplateLiteral) -> int;
```
## NoSubstitutionTemplateLiteral::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NoSubstitutionTemplateLiteral;
```
## NoSubstitutionTemplateLiteral::getExpression

```rust
pub fn getExpression(self: NoSubstitutionTemplateLiteral) -> Expression;
```
## NoSubstitutionTemplateLiteral::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: NoSubstitutionTemplateLiteral) -> string;
```
## NoSubstitutionTemplateLiteral::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NoSubstitutionTemplateLiteral) -> int;
```
## NoSubstitutionTemplateLiteral::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: NoSubstitutionTemplateLiteral) -> *Node;
```
