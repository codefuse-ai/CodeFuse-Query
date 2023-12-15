# ComponentObject

Inherit from [ObjectLiteralExpression](./ObjectLiteralExpression.md)

Primary key: `id: int`

```rust
schema ComponentObject extends ObjectLiteralExpression {
  @primary id: int
}
```
## ComponentObject::getAProperty

```java
/**
* Get a property, which is an ObjectLiteralElement.
*/
```
```rust
pub fn getAProperty(self: ComponentObject) -> *ObjectLiteralElement;
```
## ComponentObject::getProperty

```java
/**
* Get the `i`th property.
*/
```
```rust
pub fn getProperty(self: ComponentObject, i: int) -> ObjectLiteralElement;
```
## ComponentObject::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ComponentObject) -> int;
```
## ComponentObject::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ComponentObject) -> string;
```
## ComponentObject::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ComponentObject, i: int) -> Modifier;
```
## ComponentObject::hasProperty

```java
/**
* Determine whether this ObjectLiteralExpression has a property with the specified name.
*/
```
```rust
pub fn hasProperty(self: ComponentObject, name: string) -> bool;
```
## ComponentObject::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ComponentObject) -> *Decorator;
```
## ComponentObject::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ComponentObject) -> Symbol;
```
## ComponentObject::getPropertyByName

```java
/**
* Get the property of this ObjectLiteralExpression by name.
*/
```
```rust
pub fn getPropertyByName(self: ComponentObject, name: string) -> ObjectLiteralElement;
```
## ComponentObject::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ComponentObject) -> Location;
```
## ComponentObject::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ComponentObject) -> *Comment;
```
## ComponentObject::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ComponentObject) -> *Node;
```
## ComponentObject::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ComponentObject) -> *Node;
```
## ComponentObject::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ComponentObject) -> Node;
```
## ComponentObject::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ComponentObject) -> Node;
```
## ComponentObject::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ComponentObject, i: int) -> Decorator;
```
## ComponentObject::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ComponentObject) -> TopLevelDO;
```
## ComponentObject::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ComponentObject) -> int;
```
## ComponentObject::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ComponentObject) -> *Modifier;
```
## ComponentObject::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ComponentObject) -> int;
```
## ComponentObject::getPropertyAssignmentByName

```java
/**
* Get the PropertyAssignment of this ObjectLiteralExpression by name.
*/
```
```rust
pub fn getPropertyAssignmentByName(self: ComponentObject, name: string) -> PropertyAssignment;
```
## ComponentObject::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ComponentObject, i: int) -> Node;
```
## ComponentObject::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ComponentObject) -> int;
```
## ComponentObject::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ComponentObject, level: int) -> *Node;
```
## ComponentObject::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ComponentObject) -> *FunctionLikeDeclaration;
```
## ComponentObject::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ComponentObject) -> *Comment;
```
## ComponentObject::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ComponentObject) -> *Comment;
```
## ComponentObject::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ComponentObject) -> FunctionLikeDeclaration;
```
## ComponentObject::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ComponentObject) -> int;
```
## ComponentObject::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ComponentObject) -> File;
```
## ComponentObject::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ComponentObject, level: int) -> Node;
```
## ComponentObject::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ComponentObject) -> int;
```
## ComponentObject::getIndex

```rust
pub fn getIndex(self: ComponentObject) -> int;
```
## ComponentObject::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ComponentObject;
```
## ComponentObject::getExpression

```rust
pub fn getExpression(self: ComponentObject) -> Expression;
```
## ComponentObject::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ComponentObject) -> string;
```
## ComponentObject::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ComponentObject) -> int;
```
## ComponentObject::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ComponentObject) -> *Node;
```
