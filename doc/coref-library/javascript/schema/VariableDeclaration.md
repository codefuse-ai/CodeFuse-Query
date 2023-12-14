# VariableDeclaration

Primary key: `id: int`

```rust
schema VariableDeclaration {
  @primary id: int,
}
```
## VariableDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: VariableDeclaration) -> *Node;
```
## VariableDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: VariableDeclaration) -> Node;
```
## VariableDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: VariableDeclaration) -> FunctionLikeDeclaration;
```
## VariableDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: VariableDeclaration, level: int) -> Node;
```
## VariableDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: VariableDeclaration) -> Location;
```
## VariableDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: VariableDeclaration, i: int) -> Node;
```
## VariableDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: VariableDeclaration) -> *Node;
```
## VariableDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: VariableDeclaration) -> Node;
```
## VariableDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: VariableDeclaration) -> *Comment;
```
## VariableDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: VariableDeclaration) -> *Comment;
```
## VariableDeclaration::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: VariableDeclaration) -> *Decorator;
```
## VariableDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: VariableDeclaration) -> Symbol;
```
## VariableDeclaration::getIndex

```rust
pub fn getIndex(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getModifierCount

```java
/**
* Gets the number of modifiers.
*/
```
```rust
pub fn getModifierCount(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: VariableDeclaration, i: int) -> Decorator;
```
## VariableDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: VariableDeclaration) -> TopLevelDO;
```
## VariableDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getNameNodeIndex

```java
/**
* Get the index of name node.
*/
```
```rust
pub fn getNameNodeIndex(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: VariableDeclaration) -> *Node;
```
## VariableDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: VariableDeclaration) -> *Comment;
```
## VariableDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: VariableDeclaration) -> *FunctionLikeDeclaration;
```
## VariableDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: VariableDeclaration, level: int) -> *Node;
```
## VariableDeclaration::getDecoratorCount

```java
/**
* Gets the number of decorators.
*/
```
```rust
pub fn getDecoratorCount(self: VariableDeclaration) -> int;
```
## VariableDeclaration::hasInitializer

```java
/**
* Determines whether this variable declaration has the initializer.
*/
```
```rust
pub fn hasInitializer(self: VariableDeclaration) -> bool;
```
## VariableDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: VariableDeclaration) -> File;
```
## VariableDeclaration::getNameNode

```java
/**
* Gets the declared variable name
*/
```
```rust
pub fn getNameNode(self: VariableDeclaration) -> BindingName;
```
## VariableDeclaration::getExclamationToken

```java
/**
* Gets the `!` token of this variable declaration. (Optional)
*/
```
```rust
pub fn getExclamationToken(self: VariableDeclaration) -> ExclamationToken;
```
## VariableDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: VariableDeclaration) -> *Modifier;
```
## VariableDeclaration::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: VariableDeclaration, i: int) -> Modifier;
```
## VariableDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: VariableDeclaration) -> string;
```
## VariableDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: VariableDeclaration) -> string;
```
## VariableDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: VariableDeclaration) -> int;
```
## VariableDeclaration::getInitializer

```java
/**
* Gets the initialization expression. (Optional)
*/
```
```rust
pub fn getInitializer(self: VariableDeclaration) -> Expression;
```
## VariableDeclaration::getTypeNode

```java
/**
* Gets the type node of the variable declaration. (Optional)
*/
```
```rust
pub fn getTypeNode(self: VariableDeclaration) -> TypeNode;
```
## VariableDeclaration::hasDefiniteAssignmentAssertion

```java
/**
* Determines whether this variable declaration has the definite assignment assertion.
*/
```
```rust
pub fn hasDefiniteAssignmentAssertion(self: VariableDeclaration) -> bool;
```
## VariableDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *VariableDeclaration;
```
