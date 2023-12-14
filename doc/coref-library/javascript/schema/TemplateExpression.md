# TemplateExpression

Inherit from [PrimaryExpression](./PrimaryExpression.md)

Primary key: `id: int`

```rust
schema TemplateExpression extends PrimaryExpression {
  @primary id: int,
}
```
## TemplateExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TemplateExpression) -> *Node;
```
## TemplateExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateExpression) -> int;
```
## TemplateExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TemplateExpression) -> string;
```
## TemplateExpression::getExpression

```rust
pub fn getExpression(self: TemplateExpression) -> Expression;
```
## TemplateExpression::getIndex

```rust
pub fn getIndex(self: TemplateExpression) -> int;
```
## TemplateExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TemplateExpression) -> int;
```
## TemplateExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TemplateExpression, level: int) -> Node;
```
## TemplateExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TemplateExpression) -> File;
```
## TemplateExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateExpression) -> int;
```
## TemplateExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TemplateExpression) -> FunctionLikeDeclaration;
```
## TemplateExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TemplateExpression) -> *Comment;
```
## TemplateExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TemplateExpression) -> *Comment;
```
## TemplateExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TemplateExpression) -> int;
```
## TemplateExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TemplateExpression) -> *Modifier;
```
## TemplateExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateExpression) -> int;
```
## TemplateExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateExpression) -> int;
```
## TemplateExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TemplateExpression, i: int) -> Node;
```
## TemplateExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TemplateExpression, i: int) -> Decorator;
```
## TemplateExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TemplateExpression) -> TopLevelDO;
```
## TemplateExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TemplateExpression) -> int;
```
## TemplateExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TemplateExpression) -> Node;
```
## TemplateExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TemplateExpression) -> Node;
```
## TemplateExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TemplateExpression) -> *Node;
```
## TemplateExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TemplateExpression) -> *Node;
```
## TemplateExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TemplateExpression) -> *Comment;
```
## TemplateExpression::getHead

```rust
pub fn getHead(self: TemplateExpression) -> TemplateHead;
```
## TemplateExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TemplateExpression) -> *Decorator;
```
## TemplateExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TemplateExpression) -> Symbol;
```
## TemplateExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TemplateExpression, i: int) -> Modifier;
```
## TemplateExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TemplateExpression) -> string;
```
## TemplateExpression::getATemplateSpan

```rust
pub fn getATemplateSpan(self: TemplateExpression) -> *TemplateSpan;
```
## TemplateExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TemplateExpression) -> Location;
```
## TemplateExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateExpression;
```
## TemplateExpression::getTemplateSpan

```rust
pub fn getTemplateSpan(self: TemplateExpression, i: int) -> TemplateSpan;
```
## TemplateExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateExpression) -> *FunctionLikeDeclaration;
```
## TemplateExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TemplateExpression, level: int) -> *Node;
```
