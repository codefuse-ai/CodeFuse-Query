# EnumDeclaration

Inherit from [DeclarationStatement](./DeclarationStatement.md)

Primary key: `id: int`

```rust
schema EnumDeclaration extends DeclarationStatement {
  @primary id: int
}
```
## EnumDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: EnumDeclaration) -> *Node;
```
## EnumDeclaration::getIndex

```rust
pub fn getIndex(self: EnumDeclaration) -> int;
```
## EnumDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: EnumDeclaration) -> int;
```
## EnumDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: EnumDeclaration) -> FunctionLikeDeclaration;
```
## EnumDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: EnumDeclaration) -> Node;
```
## EnumDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: EnumDeclaration) -> *Comment;
```
## EnumDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: EnumDeclaration) -> *Comment;
```
## EnumDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: EnumDeclaration) -> File;
```
## EnumDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: EnumDeclaration, level: int) -> Node;
```
## EnumDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: EnumDeclaration) -> string;
```
## EnumDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: EnumDeclaration) -> int;
```
## EnumDeclaration::getEnumMemberCount

```java
/**
* Gets the count of EnumMember.
*/
```
```rust
pub fn getEnumMemberCount(self: EnumDeclaration) -> int;
```
## EnumDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: EnumDeclaration) -> int;
```
## EnumDeclaration::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: EnumDeclaration) -> *Modifier;
```
## EnumDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: EnumDeclaration) -> int;
```
## EnumDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: EnumDeclaration, level: int) -> *Node;
```
## EnumDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: EnumDeclaration) -> *FunctionLikeDeclaration;
```
## EnumDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: EnumDeclaration) -> int;
```
## EnumDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: EnumDeclaration, i: int) -> Node;
```
## EnumDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: EnumDeclaration, i: int) -> Decorator;
```
## EnumDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: EnumDeclaration) -> TopLevelDO;
```
## EnumDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: EnumDeclaration) -> int;
```
## EnumDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: EnumDeclaration) -> Node;
```
## EnumDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: EnumDeclaration) -> *Node;
```
## EnumDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: EnumDeclaration) -> *Node;
```
## EnumDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: EnumDeclaration) -> *Comment;
```
## EnumDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: EnumDeclaration) -> Symbol;
```
## EnumDeclaration::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: EnumDeclaration) -> *Decorator;
```
## EnumDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *EnumDeclaration;
```
## EnumDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: EnumDeclaration) -> Location;
```
## EnumDeclaration::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: EnumDeclaration, i: int) -> Modifier;
```
## EnumDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: EnumDeclaration) -> string;
```
## EnumDeclaration::getEnumMember

```java
/**
* Gets the EnumMember with index, start from 0.
*/
```
```rust
pub fn getEnumMember(self: EnumDeclaration, index: int) -> EnumMember;
```
## EnumDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: EnumDeclaration) -> int;
```
## EnumDeclaration::getIdentifier

```java
/**
* Gets the identifier this EnumDeclaration.
*/
```
```rust
pub fn getIdentifier(self: EnumDeclaration) -> Identifier;
```
## EnumDeclaration::getAEnumMember

```java
/**
* Gets a EnumMember of this EnumDeclaration.
*/
```
```rust
pub fn getAEnumMember(self: EnumDeclaration) -> *EnumMember;
```
