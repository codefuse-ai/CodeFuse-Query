# CallSignatureDeclaration

Primary key: `id: int`

```rust
schema CallSignatureDeclaration {
  @primary id: int,
}
```
## CallSignatureDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: CallSignatureDeclaration) -> Location;
```
## CallSignatureDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: CallSignatureDeclaration) -> Symbol;
```
## CallSignatureDeclaration::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: CallSignatureDeclaration) -> *Decorator;
```
## CallSignatureDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: CallSignatureDeclaration) -> string;
```
## CallSignatureDeclaration::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: CallSignatureDeclaration, i: int) -> Modifier;
```
## CallSignatureDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: CallSignatureDeclaration) -> *Comment;
```
## CallSignatureDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: CallSignatureDeclaration) -> *Node;
```
## CallSignatureDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: CallSignatureDeclaration) -> *Node;
```
## CallSignatureDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: CallSignatureDeclaration) -> Node;
```
## CallSignatureDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: CallSignatureDeclaration) -> int;
```
## CallSignatureDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: CallSignatureDeclaration) -> TopLevelDO;
```
## CallSignatureDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: CallSignatureDeclaration, i: int) -> Decorator;
```
## CallSignatureDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: CallSignatureDeclaration) -> int;
```
## CallSignatureDeclaration::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: CallSignatureDeclaration) -> *Modifier;
```
## CallSignatureDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CallSignatureDeclaration) -> int;
```
## CallSignatureDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: CallSignatureDeclaration, i: int) -> Node;
```
## CallSignatureDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CallSignatureDeclaration) -> int;
```
## CallSignatureDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CallSignatureDeclaration) -> *FunctionLikeDeclaration;
```
## CallSignatureDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: CallSignatureDeclaration, level: int) -> *Node;
```
## CallSignatureDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CallSignatureDeclaration) -> int;
```
## CallSignatureDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: CallSignatureDeclaration) -> string;
```
## CallSignatureDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: CallSignatureDeclaration, level: int) -> Node;
```
## CallSignatureDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: CallSignatureDeclaration) -> File;
```
## CallSignatureDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: CallSignatureDeclaration) -> *Comment;
```
## CallSignatureDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: CallSignatureDeclaration) -> *Comment;
```
## CallSignatureDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: CallSignatureDeclaration) -> Node;
```
## CallSignatureDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: CallSignatureDeclaration) -> FunctionLikeDeclaration;
```
## CallSignatureDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CallSignatureDeclaration) -> int;
```
## CallSignatureDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: CallSignatureDeclaration) -> int;
```
## CallSignatureDeclaration::getIndex

```rust
pub fn getIndex(self: CallSignatureDeclaration) -> int;
```
## CallSignatureDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: CallSignatureDeclaration) -> *Node;
```
## CallSignatureDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CallSignatureDeclaration;
```
