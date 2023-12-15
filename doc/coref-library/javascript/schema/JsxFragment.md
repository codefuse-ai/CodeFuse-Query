# JsxFragment

Inherit from [PrimaryExpression](./PrimaryExpression.md)

Primary key: `id: int`

```rust
schema JsxFragment extends PrimaryExpression {
  @primary id: int
}
```
## JsxFragment::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: JsxFragment) -> *Node;
```
## JsxFragment::getEndLineNumber

```rust
pub fn getEndLineNumber(self: JsxFragment) -> int;
```
## JsxFragment::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: JsxFragment) -> string;
```
## JsxFragment::getExpression

```rust
pub fn getExpression(self: JsxFragment) -> Expression;
```
## JsxFragment::getIndex

```rust
pub fn getIndex(self: JsxFragment) -> int;
```
## JsxFragment::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: JsxFragment) -> int;
```
## JsxFragment::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: JsxFragment, level: int) -> Node;
```
## JsxFragment::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: JsxFragment) -> File;
```
## JsxFragment::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: JsxFragment) -> int;
```
## JsxFragment::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: JsxFragment) -> FunctionLikeDeclaration;
```
## JsxFragment::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: JsxFragment) -> *Comment;
```
## JsxFragment::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: JsxFragment) -> *Comment;
```
## JsxFragment::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxFragment) -> *FunctionLikeDeclaration;
```
## JsxFragment::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: JsxFragment, level: int) -> *Node;
```
## JsxFragment::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: JsxFragment) -> int;
```
## JsxFragment::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: JsxFragment) -> *Modifier;
```
## JsxFragment::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: JsxFragment) -> int;
```
## JsxFragment::getStartLineNumber

```rust
pub fn getStartLineNumber(self: JsxFragment) -> int;
```
## JsxFragment::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: JsxFragment, i: int) -> Node;
```
## JsxFragment::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: JsxFragment, i: int) -> Decorator;
```
## JsxFragment::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: JsxFragment) -> TopLevelDO;
```
## JsxFragment::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: JsxFragment) -> int;
```
## JsxFragment::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: JsxFragment) -> Node;
```
## JsxFragment::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: JsxFragment) -> Node;
```
## JsxFragment::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: JsxFragment) -> *Node;
```
## JsxFragment::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: JsxFragment) -> *Node;
```
## JsxFragment::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: JsxFragment) -> *Comment;
```
## JsxFragment::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *JsxFragment;
```
## JsxFragment::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: JsxFragment) -> Location;
```
## JsxFragment::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: JsxFragment) -> Symbol;
```
## JsxFragment::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: JsxFragment) -> *Decorator;
```
## JsxFragment::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: JsxFragment, i: int) -> Modifier;
```
## JsxFragment::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: JsxFragment) -> string;
```
