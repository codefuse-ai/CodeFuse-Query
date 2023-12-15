# PropertyDeclaration

Inherit from [ClassElement](./ClassElement.md)

Primary key: `id: int`

```rust
schema PropertyDeclaration extends ClassElement {
  @primary id: int
}
```
## PropertyDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PropertyDeclaration) -> Location;
```
## PropertyDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PropertyDeclaration) -> *Comment;
```
## PropertyDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PropertyDeclaration) -> *Node;
```
## PropertyDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PropertyDeclaration) -> *Node;
```
## PropertyDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PropertyDeclaration) -> Node;
```
## PropertyDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PropertyDeclaration) -> *Comment;
```
## PropertyDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PropertyDeclaration) -> *Comment;
```
## PropertyDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PropertyDeclaration, i: int) -> Node;
```
## PropertyDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getInitializer

```java
/**
* Gets the initializer expression.
*/
```
```rust
pub fn getInitializer(self: PropertyDeclaration) -> Expression;
```
## PropertyDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PropertyDeclaration) -> string;
```
## PropertyDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PropertyDeclaration, level: int) -> Node;
```
## PropertyDeclaration::getExclamationToken

```java
/**
* Gets the `!` token. (Optional)
*/
```
```rust
pub fn getExclamationToken(self: PropertyDeclaration) -> ExclamationToken;
```
## PropertyDeclaration::getNameNode

```java
/**
* Gets the name node, which is a PropertyName.
*/
```
```rust
pub fn getNameNode(self: PropertyDeclaration) -> PropertyName;
```
## PropertyDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PropertyDeclaration) -> File;
```
## PropertyDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PropertyDeclaration) -> FunctionLikeDeclaration;
```
## PropertyDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PropertyDeclaration) -> Node;
```
## PropertyDeclaration::getNameNodeIndex

```java
/**
* Get the index of name node.
*/
```
```rust
pub fn getNameNodeIndex(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getModifierCount

```java
/**
* Gets the number of modifiers.
*/
```
```rust
pub fn getModifierCount(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getIndex

```rust
pub fn getIndex(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PropertyDeclaration) -> *Node;
```
## PropertyDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PropertyDeclaration, level: int) -> *Node;
```
## PropertyDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PropertyDeclaration) -> *FunctionLikeDeclaration;
```
## PropertyDeclaration::getDecoratorCount

```java
/**
* Gets the number of decorators.
*/
```
```rust
pub fn getDecoratorCount(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PropertyDeclaration) -> *Modifier;
```
## PropertyDeclaration::getQuestionToken

```java
/**
* Gets the `?` token. (Optional)
*/
```
```rust
pub fn getQuestionToken(self: PropertyDeclaration) -> QuestionToken;
```
## PropertyDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PropertyDeclaration) -> Symbol;
```
## PropertyDeclaration::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PropertyDeclaration) -> *Decorator;
```
## PropertyDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PropertyDeclaration) -> TopLevelDO;
```
## PropertyDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PropertyDeclaration, i: int) -> Decorator;
```
## PropertyDeclaration::getTypeNode

```java
/**
* Gets the type node. (Optional)
*/
```
```rust
pub fn getTypeNode(self: PropertyDeclaration) -> TypeNode;
```
## PropertyDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PropertyDeclaration) -> string;
```
## PropertyDeclaration::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PropertyDeclaration, i: int) -> Modifier;
```
## PropertyDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PropertyDeclaration;
```
