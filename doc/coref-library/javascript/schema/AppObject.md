# AppObject

Inherit from [ObjectLiteralExpression](./ObjectLiteralExpression.md)

Primary key: `id: int`

```rust
schema AppObject extends ObjectLiteralExpression {
  @primary id: int
}
```
## AppObject::getAProperty

```java
/**
* Get a property, which is an ObjectLiteralElement.
*/
```
```rust
pub fn getAProperty(self: AppObject) -> *ObjectLiteralElement;
```
## AppObject::getProperty

```java
/**
* Get the `i`th property.
*/
```
```rust
pub fn getProperty(self: AppObject, i: int) -> ObjectLiteralElement;
```
## AppObject::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AppObject) -> int;
```
## AppObject::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AppObject) -> string;
```
## AppObject::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AppObject, i: int) -> Modifier;
```
## AppObject::hasProperty

```java
/**
* Determine whether this ObjectLiteralExpression has a property with the specified name.
*/
```
```rust
pub fn hasProperty(self: AppObject, name: string) -> bool;
```
## AppObject::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AppObject) -> *Decorator;
```
## AppObject::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AppObject) -> Symbol;
```
## AppObject::getPropertyByName

```java
/**
* Get the property of this ObjectLiteralExpression by name.
*/
```
```rust
pub fn getPropertyByName(self: AppObject, name: string) -> ObjectLiteralElement;
```
## AppObject::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AppObject) -> Location;
```
## AppObject::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AppObject) -> *Comment;
```
## AppObject::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AppObject) -> *Node;
```
## AppObject::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AppObject) -> *Node;
```
## AppObject::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AppObject) -> Node;
```
## AppObject::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AppObject) -> Node;
```
## AppObject::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AppObject, i: int) -> Decorator;
```
## AppObject::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AppObject) -> TopLevelDO;
```
## AppObject::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AppObject) -> int;
```
## AppObject::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AppObject) -> *Modifier;
```
## AppObject::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AppObject) -> int;
```
## AppObject::getPropertyAssignmentByName

```java
/**
* Get the PropertyAssignment of this ObjectLiteralExpression by name.
*/
```
```rust
pub fn getPropertyAssignmentByName(self: AppObject, name: string) -> PropertyAssignment;
```
## AppObject::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AppObject, i: int) -> Node;
```
## AppObject::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AppObject) -> int;
```
## AppObject::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AppObject, level: int) -> *Node;
```
## AppObject::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AppObject) -> *FunctionLikeDeclaration;
```
## AppObject::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AppObject) -> *Comment;
```
## AppObject::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AppObject) -> *Comment;
```
## AppObject::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AppObject) -> FunctionLikeDeclaration;
```
## AppObject::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AppObject) -> int;
```
## AppObject::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AppObject) -> File;
```
## AppObject::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AppObject, level: int) -> Node;
```
## AppObject::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AppObject) -> int;
```
## AppObject::getIndex

```rust
pub fn getIndex(self: AppObject) -> int;
```
## AppObject::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AppObject;
```
## AppObject::getExpression

```rust
pub fn getExpression(self: AppObject) -> Expression;
```
## AppObject::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AppObject) -> string;
```
## AppObject::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AppObject) -> int;
```
## AppObject::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AppObject) -> *Node;
```
