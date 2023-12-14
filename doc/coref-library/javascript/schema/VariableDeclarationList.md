# VariableDeclarationList

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema VariableDeclarationList extends Node {
  @primary id: int,
}
```
## VariableDeclarationList::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: VariableDeclarationList) -> *Node;
```
## VariableDeclarationList::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: VariableDeclarationList) -> int;
```
## VariableDeclarationList::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: VariableDeclarationList) -> int;
```
## VariableDeclarationList::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: VariableDeclarationList) -> Node;
```
## VariableDeclarationList::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: VariableDeclarationList) -> FunctionLikeDeclaration;
```
## VariableDeclarationList::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: VariableDeclarationList) -> File;
```
## VariableDeclarationList::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: VariableDeclarationList, level: int) -> Node;
```
## VariableDeclarationList::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: VariableDeclarationList) -> string;
```
## VariableDeclarationList::getEndLineNumber

```rust
pub fn getEndLineNumber(self: VariableDeclarationList) -> int;
```
## VariableDeclarationList::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: VariableDeclarationList) -> Location;
```
## VariableDeclarationList::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: VariableDeclarationList) -> *FunctionLikeDeclaration;
```
## VariableDeclarationList::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: VariableDeclarationList, level: int) -> *Node;
```
## VariableDeclarationList::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: VariableDeclarationList) -> int;
```
## VariableDeclarationList::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: VariableDeclarationList) -> *Modifier;
```
## VariableDeclarationList::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: VariableDeclarationList) -> int;
```
## VariableDeclarationList::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: VariableDeclarationList, i: int) -> Node;
```
## VariableDeclarationList::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: VariableDeclarationList) -> int;
```
## VariableDeclarationList::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: VariableDeclarationList) -> TopLevelDO;
```
## VariableDeclarationList::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: VariableDeclarationList, i: int) -> Decorator;
```
## VariableDeclarationList::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: VariableDeclarationList) -> *Node;
```
## VariableDeclarationList::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: VariableDeclarationList) -> Node;
```
## VariableDeclarationList::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: VariableDeclarationList) -> *Comment;
```
## VariableDeclarationList::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: VariableDeclarationList) -> *Comment;
```
## VariableDeclarationList::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: VariableDeclarationList) -> *Node;
```
## VariableDeclarationList::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: VariableDeclarationList) -> *Comment;
```
## VariableDeclarationList::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: VariableDeclarationList, i: int) -> Modifier;
```
## VariableDeclarationList::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: VariableDeclarationList) -> string;
```
## VariableDeclarationList::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: VariableDeclarationList) -> *Decorator;
```
## VariableDeclarationList::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: VariableDeclarationList) -> Symbol;
```
## VariableDeclarationList::getIndex

```rust
pub fn getIndex(self: VariableDeclarationList) -> int;
```
## VariableDeclarationList::getVariableDeclarationCount

```java
/**
* get the count of the variable declarations
*/
```
```rust
pub fn getVariableDeclarationCount(self: VariableDeclarationList) -> int;
```
## VariableDeclarationList::getStartLineNumber

```rust
pub fn getStartLineNumber(self: VariableDeclarationList) -> int;
```
## VariableDeclarationList::getVariableDeclaration

```java
/**
* get the variable declaration with given
*/
```
```rust
pub fn getVariableDeclaration(self: VariableDeclarationList, i: int) -> VariableDeclaration;
```
## VariableDeclarationList::getAVariableDeclaration

```java
/**
* get a variable declaration
*/
```
```rust
pub fn getAVariableDeclaration(self: VariableDeclarationList) -> *VariableDeclaration;
```
## VariableDeclarationList::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *VariableDeclarationList;
```
