# SymbolKeyword

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema SymbolKeyword extends Token {
  @primary id: int,
}
```
## SymbolKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: SymbolKeyword) -> Location;
```
## SymbolKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: SymbolKeyword) -> Symbol;
```
## SymbolKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: SymbolKeyword) -> *Decorator;
```
## SymbolKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: SymbolKeyword) -> string;
```
## SymbolKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: SymbolKeyword, i: int) -> Modifier;
```
## SymbolKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: SymbolKeyword) -> *Comment;
```
## SymbolKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: SymbolKeyword) -> *Node;
```
## SymbolKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: SymbolKeyword) -> *Node;
```
## SymbolKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: SymbolKeyword) -> Node;
```
## SymbolKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: SymbolKeyword) -> int;
```
## SymbolKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: SymbolKeyword) -> TopLevelDO;
```
## SymbolKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: SymbolKeyword, i: int) -> Decorator;
```
## SymbolKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: SymbolKeyword) -> int;
```
## SymbolKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: SymbolKeyword) -> *Modifier;
```
## SymbolKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SymbolKeyword) -> int;
```
## SymbolKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: SymbolKeyword, i: int) -> Node;
```
## SymbolKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SymbolKeyword) -> int;
```
## SymbolKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SymbolKeyword) -> *FunctionLikeDeclaration;
```
## SymbolKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: SymbolKeyword, level: int) -> *Node;
```
## SymbolKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SymbolKeyword) -> int;
```
## SymbolKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: SymbolKeyword) -> string;
```
## SymbolKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: SymbolKeyword, level: int) -> Node;
```
## SymbolKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: SymbolKeyword) -> File;
```
## SymbolKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: SymbolKeyword) -> *Comment;
```
## SymbolKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: SymbolKeyword) -> *Comment;
```
## SymbolKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: SymbolKeyword) -> Node;
```
## SymbolKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: SymbolKeyword) -> FunctionLikeDeclaration;
```
## SymbolKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SymbolKeyword) -> int;
```
## SymbolKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: SymbolKeyword) -> int;
```
## SymbolKeyword::getIndex

```rust
pub fn getIndex(self: SymbolKeyword) -> int;
```
## SymbolKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: SymbolKeyword) -> *Node;
```
## SymbolKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *SymbolKeyword;
```
