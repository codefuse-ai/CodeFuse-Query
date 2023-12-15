# PropertyName

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema PropertyName extends Node {
  @primary id: int
}
```
## PropertyName::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PropertyName) -> *Node;
```
## PropertyName::getIndex

```rust
pub fn getIndex(self: PropertyName) -> int;
```
## PropertyName::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PropertyName) -> int;
```
## PropertyName::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PropertyName) -> int;
```
## PropertyName::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PropertyName) -> Node;
```
## PropertyName::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PropertyName) -> FunctionLikeDeclaration;
```
## PropertyName::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PropertyName) -> File;
```
## PropertyName::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PropertyName, level: int) -> Node;
```
## PropertyName::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PropertyName) -> string;
```
## PropertyName::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PropertyName) -> int;
```
## PropertyName::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PropertyName) -> *FunctionLikeDeclaration;
```
## PropertyName::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PropertyName, level: int) -> *Node;
```
## PropertyName::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PropertyName) -> int;
```
## PropertyName::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PropertyName) -> *Modifier;
```
## PropertyName::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PropertyName) -> int;
```
## PropertyName::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PropertyName) -> int;
```
## PropertyName::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PropertyName, i: int) -> Node;
```
## PropertyName::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PropertyName) -> TopLevelDO;
```
## PropertyName::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PropertyName, i: int) -> Decorator;
```
## PropertyName::getName

```java
/**
* Gets the name of this PropertyName.
*
* If this PropertyName is a ComputedPropertyName, it doesn't have a name
*/
```
```rust
pub fn getName(self: PropertyName) -> string;
```
## PropertyName::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PropertyName) -> int;
```
## PropertyName::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PropertyName) -> *Comment;
```
## PropertyName::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PropertyName) -> *Comment;
```
## PropertyName::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PropertyName) -> *Node;
```
## PropertyName::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PropertyName) -> Node;
```
## PropertyName::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PropertyName, i: int) -> Modifier;
```
## PropertyName::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PropertyName) -> string;
```
## PropertyName::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PropertyName) -> *Decorator;
```
## PropertyName::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PropertyName) -> Symbol;
```
## PropertyName::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PropertyName) -> Location;
```
## PropertyName::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PropertyName;
```
## PropertyName::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PropertyName) -> *Node;
```
## PropertyName::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PropertyName) -> *Comment;
```
