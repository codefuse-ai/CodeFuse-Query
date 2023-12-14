# ObjectBindingPattern

Inherit from [BindingPattern](./BindingPattern.md)

Primary key: `id: int`

```rust
schema ObjectBindingPattern extends BindingPattern {
  @primary id: int,
}
```
## ObjectBindingPattern::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ObjectBindingPattern) -> *Decorator;
```
## ObjectBindingPattern::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ObjectBindingPattern) -> Symbol;
```
## ObjectBindingPattern::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ObjectBindingPattern) -> string;
```
## ObjectBindingPattern::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ObjectBindingPattern, i: int) -> Modifier;
```
## ObjectBindingPattern::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ObjectBindingPattern) -> *Node;
```
## ObjectBindingPattern::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ObjectBindingPattern) -> *Node;
```
## ObjectBindingPattern::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ObjectBindingPattern) -> Node;
```
## ObjectBindingPattern::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ObjectBindingPattern) -> *Comment;
```
## ObjectBindingPattern::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ObjectBindingPattern) -> *Comment;
```
## ObjectBindingPattern::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ObjectBindingPattern) -> TopLevelDO;
```
## ObjectBindingPattern::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ObjectBindingPattern, i: int) -> Decorator;
```
## ObjectBindingPattern::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ObjectBindingPattern) -> int;
```
## ObjectBindingPattern::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ObjectBindingPattern) -> int;
```
## ObjectBindingPattern::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ObjectBindingPattern) -> *Modifier;
```
## ObjectBindingPattern::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ObjectBindingPattern) -> int;
```
## ObjectBindingPattern::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ObjectBindingPattern, i: int) -> Node;
```
## ObjectBindingPattern::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ObjectBindingPattern) -> int;
```
## ObjectBindingPattern::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ObjectBindingPattern) -> *FunctionLikeDeclaration;
```
## ObjectBindingPattern::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ObjectBindingPattern, level: int) -> *Node;
```
## ObjectBindingPattern::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ObjectBindingPattern) -> int;
```
## ObjectBindingPattern::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ObjectBindingPattern) -> string;
```
## ObjectBindingPattern::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ObjectBindingPattern, level: int) -> Node;
```
## ObjectBindingPattern::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ObjectBindingPattern) -> File;
```
## ObjectBindingPattern::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ObjectBindingPattern) -> int;
```
## ObjectBindingPattern::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ObjectBindingPattern) -> FunctionLikeDeclaration;
```
## ObjectBindingPattern::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ObjectBindingPattern) -> Node;
```
## ObjectBindingPattern::getAnElement

```rust
pub fn getAnElement(self: ObjectBindingPattern) -> *BindingElement;
```
## ObjectBindingPattern::getElement

```rust
pub fn getElement(self: ObjectBindingPattern, i: int) -> BindingElement;
```
## ObjectBindingPattern::getElementByPropertyName

```rust
pub fn getElementByPropertyName(self: ObjectBindingPattern, name: string) -> BindingElement;
```
## ObjectBindingPattern::getIndex

```rust
pub fn getIndex(self: ObjectBindingPattern) -> int;
```
## ObjectBindingPattern::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ObjectBindingPattern) -> *Node;
```
## ObjectBindingPattern::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ObjectBindingPattern) -> int;
```
## ObjectBindingPattern::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ObjectBindingPattern) -> *Comment;
```
## ObjectBindingPattern::getAElement

```java
/**
* @todo: Delete this predicates with typos
*/
```
```rust
pub fn getAElement(self: ObjectBindingPattern) -> *BindingElement;
```
## ObjectBindingPattern::getRestBindingElement

```rust
pub fn getRestBindingElement(self: ObjectBindingPattern) -> BindingElement;
```
## ObjectBindingPattern::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ObjectBindingPattern) -> Location;
```
## ObjectBindingPattern::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ObjectBindingPattern;
```
