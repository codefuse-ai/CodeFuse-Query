# ObjectLiteralExpression

Inherit from [PrimaryExpression](./PrimaryExpression.md)

Primary key: `id: int`

```rust
schema ObjectLiteralExpression extends PrimaryExpression {
  @primary id: int
}
```
## ObjectLiteralExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ObjectLiteralExpression) -> *Node;
```
## ObjectLiteralExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ObjectLiteralExpression) -> int;
```
## ObjectLiteralExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ObjectLiteralExpression) -> string;
```
## ObjectLiteralExpression::getExpression

```rust
pub fn getExpression(self: ObjectLiteralExpression) -> Expression;
```
## ObjectLiteralExpression::getIndex

```rust
pub fn getIndex(self: ObjectLiteralExpression) -> int;
```
## ObjectLiteralExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ObjectLiteralExpression) -> int;
```
## ObjectLiteralExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ObjectLiteralExpression, level: int) -> Node;
```
## ObjectLiteralExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ObjectLiteralExpression) -> File;
```
## ObjectLiteralExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ObjectLiteralExpression) -> int;
```
## ObjectLiteralExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ObjectLiteralExpression) -> FunctionLikeDeclaration;
```
## ObjectLiteralExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ObjectLiteralExpression) -> *Comment;
```
## ObjectLiteralExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ObjectLiteralExpression) -> *Comment;
```
## ObjectLiteralExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ObjectLiteralExpression) -> *FunctionLikeDeclaration;
```
## ObjectLiteralExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ObjectLiteralExpression, level: int) -> *Node;
```
## ObjectLiteralExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ObjectLiteralExpression) -> int;
```
## ObjectLiteralExpression::getPropertyAssignmentByName

```java
/**
* Get the PropertyAssignment of this ObjectLiteralExpression by name.
*/
```
```rust
pub fn getPropertyAssignmentByName(self: ObjectLiteralExpression, name: string) -> PropertyAssignment;
```
## ObjectLiteralExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ObjectLiteralExpression) -> int;
```
## ObjectLiteralExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ObjectLiteralExpression) -> *Modifier;
```
## ObjectLiteralExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ObjectLiteralExpression) -> int;
```
## ObjectLiteralExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ObjectLiteralExpression, i: int) -> Node;
```
## ObjectLiteralExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ObjectLiteralExpression) -> TopLevelDO;
```
## ObjectLiteralExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ObjectLiteralExpression, i: int) -> Decorator;
```
## ObjectLiteralExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ObjectLiteralExpression) -> Node;
```
## ObjectLiteralExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ObjectLiteralExpression) -> Node;
```
## ObjectLiteralExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ObjectLiteralExpression) -> *Node;
```
## ObjectLiteralExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ObjectLiteralExpression) -> *Node;
```
## ObjectLiteralExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ObjectLiteralExpression) -> *Comment;
```
## ObjectLiteralExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ObjectLiteralExpression;
```
## ObjectLiteralExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ObjectLiteralExpression) -> Location;
```
## ObjectLiteralExpression::getPropertyByName

```java
/**
* Get the property of this ObjectLiteralExpression by name.
*/
```
```rust
pub fn getPropertyByName(self: ObjectLiteralExpression, name: string) -> ObjectLiteralElement;
```
## ObjectLiteralExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ObjectLiteralExpression) -> Symbol;
```
## ObjectLiteralExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ObjectLiteralExpression) -> *Decorator;
```
## ObjectLiteralExpression::hasProperty

```java
/**
* Determine whether this ObjectLiteralExpression has a property with the specified name.
*/
```
```rust
pub fn hasProperty(self: ObjectLiteralExpression, name: string) -> bool;
```
## ObjectLiteralExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ObjectLiteralExpression, i: int) -> Modifier;
```
## ObjectLiteralExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ObjectLiteralExpression) -> string;
```
## ObjectLiteralExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ObjectLiteralExpression) -> int;
```
## ObjectLiteralExpression::getProperty

```java
/**
* Get the `i`th property.
*/
```
```rust
pub fn getProperty(self: ObjectLiteralExpression, i: int) -> ObjectLiteralElement;
```
## ObjectLiteralExpression::getAProperty

```java
/**
* Get a property, which is an ObjectLiteralElement.
*/
```
```rust
pub fn getAProperty(self: ObjectLiteralExpression) -> *ObjectLiteralElement;
```
