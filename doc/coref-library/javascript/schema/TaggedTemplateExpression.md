# TaggedTemplateExpression

Inherit from [MemberExpression](./MemberExpression.md)

Primary key: `id: int`

```rust
schema TaggedTemplateExpression extends MemberExpression {
  @primary id: int
}
```
## TaggedTemplateExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TaggedTemplateExpression) -> string;
```
## TaggedTemplateExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TaggedTemplateExpression, i: int) -> Modifier;
```
## TaggedTemplateExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TaggedTemplateExpression) -> Location;
```
## TaggedTemplateExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TaggedTemplateExpression) -> *Decorator;
```
## TaggedTemplateExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TaggedTemplateExpression) -> Symbol;
```
## TaggedTemplateExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TaggedTemplateExpression) -> *Comment;
```
## TaggedTemplateExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TaggedTemplateExpression) -> *Node;
```
## TaggedTemplateExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TaggedTemplateExpression) -> *Node;
```
## TaggedTemplateExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TaggedTemplateExpression) -> Node;
```
## TaggedTemplateExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TaggedTemplateExpression) -> Node;
```
## TaggedTemplateExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TaggedTemplateExpression) -> int;
```
## TaggedTemplateExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TaggedTemplateExpression) -> int;
```
## TaggedTemplateExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TaggedTemplateExpression) -> *Modifier;
```
## TaggedTemplateExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TaggedTemplateExpression) -> int;
```
## TaggedTemplateExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TaggedTemplateExpression, i: int) -> Node;
```
## TaggedTemplateExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TaggedTemplateExpression) -> int;
```
## TaggedTemplateExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TaggedTemplateExpression, level: int) -> *Node;
```
## TaggedTemplateExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TaggedTemplateExpression) -> *FunctionLikeDeclaration;
```
## TaggedTemplateExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TaggedTemplateExpression) -> *Comment;
```
## TaggedTemplateExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TaggedTemplateExpression) -> *Comment;
```
## TaggedTemplateExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TaggedTemplateExpression) -> FunctionLikeDeclaration;
```
## TaggedTemplateExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TaggedTemplateExpression) -> int;
```
## TaggedTemplateExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TaggedTemplateExpression) -> File;
```
## TaggedTemplateExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TaggedTemplateExpression, level: int) -> Node;
```
## TaggedTemplateExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TaggedTemplateExpression) -> int;
```
## TaggedTemplateExpression::getIndex

```rust
pub fn getIndex(self: TaggedTemplateExpression) -> int;
```
## TaggedTemplateExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TaggedTemplateExpression;
```
## TaggedTemplateExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TaggedTemplateExpression) -> int;
```
## TaggedTemplateExpression::getExpression

```rust
pub fn getExpression(self: TaggedTemplateExpression) -> Expression;
```
## TaggedTemplateExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TaggedTemplateExpression) -> string;
```
## TaggedTemplateExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TaggedTemplateExpression) -> *Node;
```
## TaggedTemplateExpression::getCallee

```java
/**
* Gets the callee of this tagged template expression.
*/
```
```rust
pub fn getCallee(self: TaggedTemplateExpression) -> FunctionLikeDeclaration;
```
## TaggedTemplateExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TaggedTemplateExpression) -> TopLevelDO;
```
## TaggedTemplateExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TaggedTemplateExpression, i: int) -> Decorator;
```
## TaggedTemplateExpression::getTag

```rust
pub fn getTag(self: TaggedTemplateExpression) -> LeftHandSideExpression;
```
