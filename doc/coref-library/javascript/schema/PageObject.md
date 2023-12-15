# PageObject

Inherit from [ObjectLiteralExpression](./ObjectLiteralExpression.md)

Primary key: `id: int`

```rust
schema PageObject extends ObjectLiteralExpression {
  @primary id: int
}
```
## PageObject::getAProperty

```java
/**
* Get a property, which is an ObjectLiteralElement.
*/
```
```rust
pub fn getAProperty(self: PageObject) -> *ObjectLiteralElement;
```
## PageObject::getProperty

```java
/**
* Get the `i`th property.
*/
```
```rust
pub fn getProperty(self: PageObject, i: int) -> ObjectLiteralElement;
```
## PageObject::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PageObject) -> int;
```
## PageObject::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PageObject) -> string;
```
## PageObject::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PageObject, i: int) -> Modifier;
```
## PageObject::hasProperty

```java
/**
* Determine whether this ObjectLiteralExpression has a property with the specified name.
*/
```
```rust
pub fn hasProperty(self: PageObject, name: string) -> bool;
```
## PageObject::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PageObject) -> *Decorator;
```
## PageObject::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PageObject) -> Symbol;
```
## PageObject::getPropertyByName

```java
/**
* Get the property of this ObjectLiteralExpression by name.
*/
```
```rust
pub fn getPropertyByName(self: PageObject, name: string) -> ObjectLiteralElement;
```
## PageObject::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PageObject) -> Location;
```
## PageObject::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PageObject) -> *Comment;
```
## PageObject::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PageObject) -> *Node;
```
## PageObject::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PageObject) -> *Node;
```
## PageObject::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PageObject) -> Node;
```
## PageObject::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PageObject) -> Node;
```
## PageObject::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PageObject, i: int) -> Decorator;
```
## PageObject::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PageObject) -> TopLevelDO;
```
## PageObject::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PageObject) -> int;
```
## PageObject::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PageObject) -> *Modifier;
```
## PageObject::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PageObject) -> int;
```
## PageObject::getPropertyAssignmentByName

```java
/**
* Get the PropertyAssignment of this ObjectLiteralExpression by name.
*/
```
```rust
pub fn getPropertyAssignmentByName(self: PageObject, name: string) -> PropertyAssignment;
```
## PageObject::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PageObject, i: int) -> Node;
```
## PageObject::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PageObject) -> int;
```
## PageObject::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PageObject, level: int) -> *Node;
```
## PageObject::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PageObject) -> *FunctionLikeDeclaration;
```
## PageObject::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PageObject) -> *Comment;
```
## PageObject::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PageObject) -> *Comment;
```
## PageObject::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PageObject) -> FunctionLikeDeclaration;
```
## PageObject::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PageObject) -> int;
```
## PageObject::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PageObject) -> File;
```
## PageObject::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PageObject, level: int) -> Node;
```
## PageObject::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PageObject) -> int;
```
## PageObject::getIndex

```rust
pub fn getIndex(self: PageObject) -> int;
```
## PageObject::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PageObject;
```
## PageObject::getExpression

```rust
pub fn getExpression(self: PageObject) -> Expression;
```
## PageObject::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PageObject) -> string;
```
## PageObject::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PageObject) -> int;
```
## PageObject::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PageObject) -> *Node;
```
