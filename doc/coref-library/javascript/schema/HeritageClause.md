# HeritageClause

Primary key: `id: int`

```rust
schema HeritageClause {
  @primary id: int,
}
```
## HeritageClause::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: HeritageClause) -> *Node;
```
## HeritageClause::getIndex

```rust
pub fn getIndex(self: HeritageClause) -> int;
```
## HeritageClause::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: HeritageClause) -> int;
```
## HeritageClause::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: HeritageClause) -> int;
```
## HeritageClause::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: HeritageClause) -> Node;
```
## HeritageClause::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: HeritageClause) -> FunctionLikeDeclaration;
```
## HeritageClause::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: HeritageClause, level: int) -> Node;
```
## HeritageClause::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: HeritageClause) -> string;
```
## HeritageClause::getEndLineNumber

```rust
pub fn getEndLineNumber(self: HeritageClause) -> int;
```
## HeritageClause::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: HeritageClause) -> Location;
```
## HeritageClause::getStartLineNumber

```rust
pub fn getStartLineNumber(self: HeritageClause) -> int;
```
## HeritageClause::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: HeritageClause) -> *FunctionLikeDeclaration;
```
## HeritageClause::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: HeritageClause, level: int) -> *Node;
```
## HeritageClause::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: HeritageClause) -> int;
```
## HeritageClause::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: HeritageClause) -> *Modifier;
```
## HeritageClause::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: HeritageClause) -> int;
```
## HeritageClause::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: HeritageClause, i: int) -> Node;
```
## HeritageClause::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: HeritageClause) -> int;
```
## HeritageClause::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: HeritageClause) -> TopLevelDO;
```
## HeritageClause::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: HeritageClause, i: int) -> Decorator;
```
## HeritageClause::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: HeritageClause) -> *Node;
```
## HeritageClause::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: HeritageClause) -> Node;
```
## HeritageClause::getAType

```rust
pub fn getAType(self: HeritageClause) -> *ExpressionWithTypeArguments;
```
## HeritageClause::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: HeritageClause) -> *Comment;
```
## HeritageClause::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: HeritageClause) -> *Comment;
```
## HeritageClause::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: HeritageClause, i: int) -> Modifier;
```
## HeritageClause::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: HeritageClause) -> string;
```
## HeritageClause::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: HeritageClause) -> Symbol;
```
## HeritageClause::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: HeritageClause) -> *Decorator;
```
## HeritageClause::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *HeritageClause;
```
## HeritageClause::getType

```rust
pub fn getType(self: HeritageClause, i: int) -> ExpressionWithTypeArguments;
```
## HeritageClause::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: HeritageClause) -> *Node;
```
## HeritageClause::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: HeritageClause) -> *Comment;
```
## HeritageClause::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: HeritageClause) -> File;
```
## HeritageClause::getToken

```rust
pub fn getToken(self: HeritageClause) -> HeritageToken;
```
