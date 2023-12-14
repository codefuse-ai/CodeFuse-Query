# RefExpr

Primary key: `id: int`

```rust
schema RefExpr {
  @primary id: int,
}
```
## RefExpr::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: RefExpr) -> *Node;
```
## RefExpr::getIndex

```rust
pub fn getIndex(self: RefExpr) -> int;
```
## RefExpr::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: RefExpr) -> int;
```
## RefExpr::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RefExpr) -> int;
```
## RefExpr::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: RefExpr) -> Node;
```
## RefExpr::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: RefExpr) -> FunctionLikeDeclaration;
```
## RefExpr::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: RefExpr) -> string;
```
## RefExpr::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RefExpr) -> int;
```
## RefExpr::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: RefExpr) -> Location;
```
## RefExpr::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RefExpr) -> *FunctionLikeDeclaration;
```
## RefExpr::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: RefExpr, level: int) -> *Node;
```
## RefExpr::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: RefExpr) -> int;
```
## RefExpr::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: RefExpr) -> *Modifier;
```
## RefExpr::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RefExpr) -> int;
```
## RefExpr::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RefExpr) -> int;
```
## RefExpr::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: RefExpr, i: int) -> Node;
```
## RefExpr::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: RefExpr) -> int;
```
## RefExpr::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: RefExpr) -> TopLevelDO;
```
## RefExpr::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: RefExpr, i: int) -> Decorator;
```
## RefExpr::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: RefExpr) -> *Comment;
```
## RefExpr::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: RefExpr) -> *Comment;
```
## RefExpr::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: RefExpr) -> *Node;
```
## RefExpr::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: RefExpr) -> Node;
```
## RefExpr::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: RefExpr) -> File;
```
## RefExpr::hasSymbol

```java
/**
* Determine whether this RefExpr has symbol.
*/
```
```rust
pub fn hasSymbol(self: RefExpr) -> bool;
```
## RefExpr::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: RefExpr) -> *Node;
```
## RefExpr::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: RefExpr) -> *Comment;
```
## RefExpr::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: RefExpr) -> Symbol;
```
## RefExpr::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: RefExpr) -> *Decorator;
```
## RefExpr::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: RefExpr, i: int) -> Modifier;
```
## RefExpr::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: RefExpr) -> string;
```
## RefExpr::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: RefExpr, level: int) -> Node;
```
## RefExpr::getRefName

```java
/**
* Get the name of this RefExpr.
*/
```
```rust
pub fn getRefName(self: RefExpr) -> string;
```
## RefExpr::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *RefExpr;
```
