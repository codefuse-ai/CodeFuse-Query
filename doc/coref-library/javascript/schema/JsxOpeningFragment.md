# JsxOpeningFragment

Inherit from [Expression](./Expression.md)

Primary key: `id: int`

```rust
schema JsxOpeningFragment extends Expression {
  @primary id: int
}
```
## JsxOpeningFragment::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: JsxOpeningFragment) -> Location;
```
## JsxOpeningFragment::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: JsxOpeningFragment) -> Symbol;
```
## JsxOpeningFragment::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: JsxOpeningFragment) -> *Decorator;
```
## JsxOpeningFragment::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: JsxOpeningFragment) -> string;
```
## JsxOpeningFragment::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: JsxOpeningFragment, i: int) -> Modifier;
```
## JsxOpeningFragment::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: JsxOpeningFragment) -> *Comment;
```
## JsxOpeningFragment::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: JsxOpeningFragment) -> *Node;
```
## JsxOpeningFragment::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: JsxOpeningFragment) -> int;
```
## JsxOpeningFragment::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: JsxOpeningFragment) -> TopLevelDO;
```
## JsxOpeningFragment::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: JsxOpeningFragment, i: int) -> Decorator;
```
## JsxOpeningFragment::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: JsxOpeningFragment) -> int;
```
## JsxOpeningFragment::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: JsxOpeningFragment) -> *Modifier;
```
## JsxOpeningFragment::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: JsxOpeningFragment) -> int;
```
## JsxOpeningFragment::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: JsxOpeningFragment, i: int) -> Node;
```
## JsxOpeningFragment::getStartLineNumber

```rust
pub fn getStartLineNumber(self: JsxOpeningFragment) -> int;
```
## JsxOpeningFragment::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: JsxOpeningFragment, level: int) -> *Node;
```
## JsxOpeningFragment::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxOpeningFragment) -> *FunctionLikeDeclaration;
```
## JsxOpeningFragment::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: JsxOpeningFragment) -> *Comment;
```
## JsxOpeningFragment::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: JsxOpeningFragment) -> *Comment;
```
## JsxOpeningFragment::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: JsxOpeningFragment) -> *Node;
```
## JsxOpeningFragment::getParent

```rust
pub fn getParent(self: JsxOpeningFragment) -> JsxFragment;
```
## JsxOpeningFragment::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: JsxOpeningFragment) -> Node;
```
## JsxOpeningFragment::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: JsxOpeningFragment) -> int;
```
## JsxOpeningFragment::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: JsxOpeningFragment) -> FunctionLikeDeclaration;
```
## JsxOpeningFragment::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: JsxOpeningFragment) -> File;
```
## JsxOpeningFragment::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: JsxOpeningFragment, level: int) -> Node;
```
## JsxOpeningFragment::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: JsxOpeningFragment) -> int;
```
## JsxOpeningFragment::getIndex

```rust
pub fn getIndex(self: JsxOpeningFragment) -> int;
```
## JsxOpeningFragment::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: JsxOpeningFragment) -> string;
```
## JsxOpeningFragment::getEndLineNumber

```rust
pub fn getEndLineNumber(self: JsxOpeningFragment) -> int;
```
## JsxOpeningFragment::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: JsxOpeningFragment) -> *Node;
```
## JsxOpeningFragment::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *JsxOpeningFragment;
```
