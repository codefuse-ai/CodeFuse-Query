# SpreadAssignment

Inherit from [ObjectLiteralElement](./ObjectLiteralElement.md)

Primary key: `id: int`

```rust
schema SpreadAssignment extends ObjectLiteralElement {
  @primary id: int
}
```
## SpreadAssignment::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: SpreadAssignment) -> *Comment;
```
## SpreadAssignment::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: SpreadAssignment) -> *Node;
```
## SpreadAssignment::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: SpreadAssignment) -> Location;
```
## SpreadAssignment::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: SpreadAssignment) -> Symbol;
```
## SpreadAssignment::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: SpreadAssignment) -> *Decorator;
```
## SpreadAssignment::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: SpreadAssignment) -> string;
```
## SpreadAssignment::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: SpreadAssignment, i: int) -> Modifier;
```
## SpreadAssignment::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: SpreadAssignment) -> *Comment;
```
## SpreadAssignment::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: SpreadAssignment) -> *Comment;
```
## SpreadAssignment::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: SpreadAssignment, i: int) -> Decorator;
```
## SpreadAssignment::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: SpreadAssignment) -> TopLevelDO;
```
## SpreadAssignment::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: SpreadAssignment) -> int;
```
## SpreadAssignment::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: SpreadAssignment) -> *Modifier;
```
## SpreadAssignment::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SpreadAssignment) -> int;
```
## SpreadAssignment::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: SpreadAssignment, i: int) -> Node;
```
## SpreadAssignment::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SpreadAssignment) -> int;
```
## SpreadAssignment::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SpreadAssignment) -> *FunctionLikeDeclaration;
```
## SpreadAssignment::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: SpreadAssignment, level: int) -> *Node;
```
## SpreadAssignment::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SpreadAssignment) -> int;
```
## SpreadAssignment::getExpression

```rust
pub fn getExpression(self: SpreadAssignment) -> Expression;
```
## SpreadAssignment::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: SpreadAssignment) -> string;
```
## SpreadAssignment::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: SpreadAssignment) -> *Node;
```
## SpreadAssignment::getParent

```rust
pub fn getParent(self: SpreadAssignment) -> ObjectLiteralExpression;
```
## SpreadAssignment::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: SpreadAssignment) -> Node;
```
## SpreadAssignment::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SpreadAssignment) -> int;
```
## SpreadAssignment::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: SpreadAssignment) -> FunctionLikeDeclaration;
```
## SpreadAssignment::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: SpreadAssignment) -> File;
```
## SpreadAssignment::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: SpreadAssignment, level: int) -> Node;
```
## SpreadAssignment::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: SpreadAssignment) -> int;
```
## SpreadAssignment::getIndex

```rust
pub fn getIndex(self: SpreadAssignment) -> int;
```
## SpreadAssignment::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *SpreadAssignment;
```
## SpreadAssignment::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: SpreadAssignment) -> int;
```
## SpreadAssignment::getName

```java
/**
* Gets the name of this ObjectLiteralElement.
*
* A SpreadAssignment doesn't have a name.
* TODO: add handling for Accessors.
*/
```
```rust
pub fn getName(self: SpreadAssignment) -> string;
```
## SpreadAssignment::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: SpreadAssignment) -> *Node;
```
