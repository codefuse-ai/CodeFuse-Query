# Unknown

Primary key: `id: int`

```rust
schema Unknown {
  @primary id: int,
}
```
## Unknown::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: Unknown) -> Location;
```
## Unknown::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: Unknown) -> Symbol;
```
## Unknown::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: Unknown) -> *Decorator;
```
## Unknown::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: Unknown) -> string;
```
## Unknown::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: Unknown, i: int) -> Modifier;
```
## Unknown::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: Unknown) -> *Comment;
```
## Unknown::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: Unknown) -> *Node;
```
## Unknown::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: Unknown) -> *Node;
```
## Unknown::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: Unknown) -> Node;
```
## Unknown::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: Unknown) -> int;
```
## Unknown::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: Unknown) -> TopLevelDO;
```
## Unknown::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: Unknown, i: int) -> Decorator;
```
## Unknown::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: Unknown) -> int;
```
## Unknown::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: Unknown) -> *Modifier;
```
## Unknown::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: Unknown) -> int;
```
## Unknown::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: Unknown, i: int) -> Node;
```
## Unknown::getStartLineNumber

```rust
pub fn getStartLineNumber(self: Unknown) -> int;
```
## Unknown::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: Unknown) -> *FunctionLikeDeclaration;
```
## Unknown::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: Unknown, level: int) -> *Node;
```
## Unknown::getEndLineNumber

```rust
pub fn getEndLineNumber(self: Unknown) -> int;
```
## Unknown::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: Unknown) -> string;
```
## Unknown::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: Unknown, level: int) -> Node;
```
## Unknown::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: Unknown) -> File;
```
## Unknown::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: Unknown) -> *Comment;
```
## Unknown::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: Unknown) -> *Comment;
```
## Unknown::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: Unknown) -> Node;
```
## Unknown::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: Unknown) -> FunctionLikeDeclaration;
```
## Unknown::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: Unknown) -> int;
```
## Unknown::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: Unknown) -> int;
```
## Unknown::getIndex

```rust
pub fn getIndex(self: Unknown) -> int;
```
## Unknown::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: Unknown) -> *Node;
```
## Unknown::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *Unknown;
```
