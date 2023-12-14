# IndexSignatureDeclaration

Primary key: `id: int`

```rust
schema IndexSignatureDeclaration {
  @primary id: int,
}
```
## IndexSignatureDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: IndexSignatureDeclaration) -> Location;
```
## IndexSignatureDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: IndexSignatureDeclaration) -> Symbol;
```
## IndexSignatureDeclaration::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: IndexSignatureDeclaration) -> *Decorator;
```
## IndexSignatureDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: IndexSignatureDeclaration) -> string;
```
## IndexSignatureDeclaration::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: IndexSignatureDeclaration, i: int) -> Modifier;
```
## IndexSignatureDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: IndexSignatureDeclaration) -> *Comment;
```
## IndexSignatureDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: IndexSignatureDeclaration) -> *Node;
```
## IndexSignatureDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: IndexSignatureDeclaration) -> *Node;
```
## IndexSignatureDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: IndexSignatureDeclaration) -> Node;
```
## IndexSignatureDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: IndexSignatureDeclaration) -> int;
```
## IndexSignatureDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: IndexSignatureDeclaration) -> TopLevelDO;
```
## IndexSignatureDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: IndexSignatureDeclaration, i: int) -> Decorator;
```
## IndexSignatureDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: IndexSignatureDeclaration) -> int;
```
## IndexSignatureDeclaration::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: IndexSignatureDeclaration) -> *Modifier;
```
## IndexSignatureDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: IndexSignatureDeclaration) -> int;
```
## IndexSignatureDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: IndexSignatureDeclaration, i: int) -> Node;
```
## IndexSignatureDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: IndexSignatureDeclaration) -> int;
```
## IndexSignatureDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: IndexSignatureDeclaration) -> *FunctionLikeDeclaration;
```
## IndexSignatureDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: IndexSignatureDeclaration, level: int) -> *Node;
```
## IndexSignatureDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: IndexSignatureDeclaration) -> int;
```
## IndexSignatureDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: IndexSignatureDeclaration) -> string;
```
## IndexSignatureDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: IndexSignatureDeclaration, level: int) -> Node;
```
## IndexSignatureDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: IndexSignatureDeclaration) -> File;
```
## IndexSignatureDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: IndexSignatureDeclaration) -> *Comment;
```
## IndexSignatureDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: IndexSignatureDeclaration) -> *Comment;
```
## IndexSignatureDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: IndexSignatureDeclaration) -> Node;
```
## IndexSignatureDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: IndexSignatureDeclaration) -> FunctionLikeDeclaration;
```
## IndexSignatureDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: IndexSignatureDeclaration) -> int;
```
## IndexSignatureDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: IndexSignatureDeclaration) -> int;
```
## IndexSignatureDeclaration::getIndex

```rust
pub fn getIndex(self: IndexSignatureDeclaration) -> int;
```
## IndexSignatureDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: IndexSignatureDeclaration) -> *Node;
```
## IndexSignatureDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *IndexSignatureDeclaration;
```
