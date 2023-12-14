# MiniObject

Inherit from [ObjectLiteralExpression](./ObjectLiteralExpression.md)

Primary key: `id: int`

```rust
schema MiniObject extends ObjectLiteralExpression {
  @primary id: int,
}
```
## MiniObject::getAProperty

```java
/**
* Get a property, which is an ObjectLiteralElement.
*/
```
```rust
pub fn getAProperty(self: MiniObject) -> *ObjectLiteralElement;
```
## MiniObject::getProperty

```java
/**
* Get the `i`th property.
*/
```
```rust
pub fn getProperty(self: MiniObject, i: int) -> ObjectLiteralElement;
```
## MiniObject::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: MiniObject) -> int;
```
## MiniObject::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: MiniObject) -> string;
```
## MiniObject::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: MiniObject, i: int) -> Modifier;
```
## MiniObject::hasProperty

```java
/**
* Determine whether this ObjectLiteralExpression has a property with the specified name.
*/
```
```rust
pub fn hasProperty(self: MiniObject, name: string) -> bool;
```
## MiniObject::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: MiniObject) -> *Decorator;
```
## MiniObject::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: MiniObject) -> Symbol;
```
## MiniObject::getPropertyByName

```java
/**
* Get the property of this ObjectLiteralExpression by name.
*/
```
```rust
pub fn getPropertyByName(self: MiniObject, name: string) -> ObjectLiteralElement;
```
## MiniObject::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: MiniObject) -> Location;
```
## MiniObject::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: MiniObject) -> *Comment;
```
## MiniObject::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: MiniObject) -> *Node;
```
## MiniObject::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: MiniObject) -> *Node;
```
## MiniObject::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: MiniObject) -> Node;
```
## MiniObject::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: MiniObject) -> Node;
```
## MiniObject::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: MiniObject, i: int) -> Decorator;
```
## MiniObject::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: MiniObject) -> TopLevelDO;
```
## MiniObject::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: MiniObject) -> int;
```
## MiniObject::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: MiniObject) -> *Modifier;
```
## MiniObject::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MiniObject) -> int;
```
## MiniObject::getPropertyAssignmentByName

```java
/**
* Get the PropertyAssignment of this ObjectLiteralExpression by name.
*/
```
```rust
pub fn getPropertyAssignmentByName(self: MiniObject, name: string) -> PropertyAssignment;
```
## MiniObject::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: MiniObject, i: int) -> Node;
```
## MiniObject::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MiniObject) -> int;
```
## MiniObject::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: MiniObject, level: int) -> *Node;
```
## MiniObject::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MiniObject) -> *FunctionLikeDeclaration;
```
## MiniObject::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: MiniObject) -> *Comment;
```
## MiniObject::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: MiniObject) -> *Comment;
```
## MiniObject::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: MiniObject) -> FunctionLikeDeclaration;
```
## MiniObject::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MiniObject) -> int;
```
## MiniObject::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: MiniObject) -> File;
```
## MiniObject::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: MiniObject, level: int) -> Node;
```
## MiniObject::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: MiniObject) -> int;
```
## MiniObject::getIndex

```rust
pub fn getIndex(self: MiniObject) -> int;
```
## MiniObject::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *MiniObject;
```
## MiniObject::getExpression

```rust
pub fn getExpression(self: MiniObject) -> Expression;
```
## MiniObject::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: MiniObject) -> string;
```
## MiniObject::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MiniObject) -> int;
```
## MiniObject::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: MiniObject) -> *Node;
```
