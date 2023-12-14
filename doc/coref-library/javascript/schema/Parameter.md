# Parameter

Primary key: `id: int`

```rust
schema Parameter {
  @primary id: int,
}
```
## Parameter::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: Parameter) -> *Node;
```
## Parameter::getIndex

```rust
pub fn getIndex(self: Parameter) -> int;
```
## Parameter::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: Parameter) -> int;
```
## Parameter::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: Parameter) -> int;
```
## Parameter::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: Parameter) -> Node;
```
## Parameter::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: Parameter) -> FunctionLikeDeclaration;
```
## Parameter::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: Parameter, level: int) -> Node;
```
## Parameter::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: Parameter) -> Location;
```
## Parameter::getStartLineNumber

```rust
pub fn getStartLineNumber(self: Parameter) -> int;
```
## Parameter::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: Parameter, i: int) -> Node;
```
## Parameter::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: Parameter) -> *FunctionLikeDeclaration;
```
## Parameter::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: Parameter, level: int) -> *Node;
```
## Parameter::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: Parameter) -> int;
```
## Parameter::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: Parameter) -> int;
```
## Parameter::getQuestionToken

```java
/**
* Gets the `?` token of this parameter declaration.
*/
```
```rust
pub fn getQuestionToken(self: Parameter) -> QuestionToken;
```
## Parameter::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: Parameter) -> *Modifier;
```
## Parameter::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: Parameter) -> int;
```
## Parameter::isRestParameter

```java
/**
* Determines whether this parameter declaration is a rest parameter.
*/
```
```rust
pub fn isRestParameter(self: Parameter) -> bool;
```
## Parameter::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: Parameter) -> TopLevelDO;
```
## Parameter::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: Parameter, i: int) -> Decorator;
```
## Parameter::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: Parameter) -> *Comment;
```
## Parameter::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: Parameter) -> *Comment;
```
## Parameter::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: Parameter) -> Node;
```
## Parameter::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: Parameter) -> *Node;
```
## Parameter::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: Parameter) -> *Node;
```
## Parameter::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: Parameter) -> *Comment;
```
## Parameter::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: Parameter) -> string;
```
## Parameter::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: Parameter, i: int) -> Modifier;
```
## Parameter::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: Parameter) -> Symbol;
```
## Parameter::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: Parameter) -> *Decorator;
```
## Parameter::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *Parameter;
```
## Parameter::getType

```java
/**
* Gets the type node of this parameter.
*/
```
```rust
pub fn getType(self: Parameter) -> TypeNode;
```
## Parameter::hasInitializer

```java
/**
* Determines whether this parameter has the initializer.
*/
```
```rust
pub fn hasInitializer(self: Parameter) -> bool;
```
## Parameter::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: Parameter) -> File;
```
## Parameter::getNameNode

```java
/**
* Gets the name of this parameter declaration.
*/
```
```rust
pub fn getNameNode(self: Parameter) -> BindingName;
```
## Parameter::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: Parameter) -> string;
```
## Parameter::getEndLineNumber

```rust
pub fn getEndLineNumber(self: Parameter) -> int;
```
## Parameter::getInitializer

```java
/**
* Gets the initializer expression of this parameter.
*/
```
```rust
pub fn getInitializer(self: Parameter) -> Expression;
```
## Parameter::isOptionalParameter

```java
/**
* Determines whether this parameter declaration is an optional parameter, which means it has a `?` token.
*/
```
```rust
pub fn isOptionalParameter(self: Parameter) -> bool;
```
## Parameter::getDotDotDotToken

```java
/**
* Gets the `...` token of this parameter declaration.
*/
```
```rust
pub fn getDotDotDotToken(self: Parameter) -> DotDotDotToken;
```
