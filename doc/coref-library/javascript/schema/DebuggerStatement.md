# DebuggerStatement

Primary key: `id: int`

```rust
schema DebuggerStatement {
  @primary id: int,
}
```
## DebuggerStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: DebuggerStatement) -> Location;
```
## DebuggerStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: DebuggerStatement) -> Symbol;
```
## DebuggerStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: DebuggerStatement) -> *Decorator;
```
## DebuggerStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: DebuggerStatement) -> string;
```
## DebuggerStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: DebuggerStatement, i: int) -> Modifier;
```
## DebuggerStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: DebuggerStatement) -> *Comment;
```
## DebuggerStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: DebuggerStatement) -> *Node;
```
## DebuggerStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: DebuggerStatement) -> *Node;
```
## DebuggerStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: DebuggerStatement) -> Node;
```
## DebuggerStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: DebuggerStatement) -> int;
```
## DebuggerStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: DebuggerStatement) -> TopLevelDO;
```
## DebuggerStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: DebuggerStatement, i: int) -> Decorator;
```
## DebuggerStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: DebuggerStatement) -> int;
```
## DebuggerStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: DebuggerStatement) -> *Modifier;
```
## DebuggerStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DebuggerStatement) -> int;
```
## DebuggerStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: DebuggerStatement, i: int) -> Node;
```
## DebuggerStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DebuggerStatement) -> int;
```
## DebuggerStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DebuggerStatement) -> *FunctionLikeDeclaration;
```
## DebuggerStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: DebuggerStatement, level: int) -> *Node;
```
## DebuggerStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DebuggerStatement) -> int;
```
## DebuggerStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: DebuggerStatement) -> string;
```
## DebuggerStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: DebuggerStatement, level: int) -> Node;
```
## DebuggerStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: DebuggerStatement) -> File;
```
## DebuggerStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: DebuggerStatement) -> *Comment;
```
## DebuggerStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: DebuggerStatement) -> *Comment;
```
## DebuggerStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: DebuggerStatement) -> Node;
```
## DebuggerStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: DebuggerStatement) -> FunctionLikeDeclaration;
```
## DebuggerStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DebuggerStatement) -> int;
```
## DebuggerStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: DebuggerStatement) -> int;
```
## DebuggerStatement::getIndex

```rust
pub fn getIndex(self: DebuggerStatement) -> int;
```
## DebuggerStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: DebuggerStatement) -> *Node;
```
## DebuggerStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *DebuggerStatement;
```
