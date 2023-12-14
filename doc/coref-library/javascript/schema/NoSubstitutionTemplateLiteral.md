# NoSubstitutionTemplateLiteral

Primary key: `id: int`

```rust
schema NoSubstitutionTemplateLiteral {
  @primary id: int,
}
```
## NoSubstitutionTemplateLiteral::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NoSubstitutionTemplateLiteral) -> Node;
```
## NoSubstitutionTemplateLiteral::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NoSubstitutionTemplateLiteral) -> string;
```
## NoSubstitutionTemplateLiteral::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NoSubstitutionTemplateLiteral, i: int) -> Modifier;
```
## NoSubstitutionTemplateLiteral::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NoSubstitutionTemplateLiteral) -> Location;
```
## NoSubstitutionTemplateLiteral::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NoSubstitutionTemplateLiteral) -> *Decorator;
```
## NoSubstitutionTemplateLiteral::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NoSubstitutionTemplateLiteral) -> Symbol;
```
## NoSubstitutionTemplateLiteral::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NoSubstitutionTemplateLiteral) -> *Comment;
```
## NoSubstitutionTemplateLiteral::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NoSubstitutionTemplateLiteral) -> *Node;
```
## NoSubstitutionTemplateLiteral::getValue

```rust
/**
     * Gets the value of this literal, as a string.
     */
```
```rust
pub fn getValue(self: NoSubstitutionTemplateLiteral) -> string;
```
## NoSubstitutionTemplateLiteral::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NoSubstitutionTemplateLiteral) -> *Node;
```
## NoSubstitutionTemplateLiteral::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NoSubstitutionTemplateLiteral) -> Node;
```
## NoSubstitutionTemplateLiteral::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NoSubstitutionTemplateLiteral) -> int;
```
## NoSubstitutionTemplateLiteral::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NoSubstitutionTemplateLiteral) -> TopLevelDO;
```
## NoSubstitutionTemplateLiteral::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NoSubstitutionTemplateLiteral, i: int) -> Decorator;
```
## NoSubstitutionTemplateLiteral::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NoSubstitutionTemplateLiteral) -> int;
```
## NoSubstitutionTemplateLiteral::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NoSubstitutionTemplateLiteral) -> int;
```
## NoSubstitutionTemplateLiteral::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NoSubstitutionTemplateLiteral) -> *Modifier;
```
## NoSubstitutionTemplateLiteral::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NoSubstitutionTemplateLiteral, i: int) -> Node;
```
## NoSubstitutionTemplateLiteral::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NoSubstitutionTemplateLiteral) -> int;
```
## NoSubstitutionTemplateLiteral::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NoSubstitutionTemplateLiteral, level: int) -> *Node;
```
## NoSubstitutionTemplateLiteral::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NoSubstitutionTemplateLiteral) -> *FunctionLikeDeclaration;
```
## NoSubstitutionTemplateLiteral::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NoSubstitutionTemplateLiteral) -> *Comment;
```
## NoSubstitutionTemplateLiteral::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NoSubstitutionTemplateLiteral) -> *Comment;
```
## NoSubstitutionTemplateLiteral::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NoSubstitutionTemplateLiteral) -> FunctionLikeDeclaration;
```
## NoSubstitutionTemplateLiteral::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NoSubstitutionTemplateLiteral) -> int;
```
## NoSubstitutionTemplateLiteral::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NoSubstitutionTemplateLiteral) -> File;
```
## NoSubstitutionTemplateLiteral::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NoSubstitutionTemplateLiteral, level: int) -> Node;
```
## NoSubstitutionTemplateLiteral::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NoSubstitutionTemplateLiteral) -> int;
```
## NoSubstitutionTemplateLiteral::getIndex

```rust
pub fn getIndex(self: NoSubstitutionTemplateLiteral) -> int;
```
## NoSubstitutionTemplateLiteral::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NoSubstitutionTemplateLiteral;
```
## NoSubstitutionTemplateLiteral::getExpression

```rust
pub fn getExpression(self: NoSubstitutionTemplateLiteral) -> Expression;
```
## NoSubstitutionTemplateLiteral::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NoSubstitutionTemplateLiteral) -> string;
```
## NoSubstitutionTemplateLiteral::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NoSubstitutionTemplateLiteral) -> int;
```
## NoSubstitutionTemplateLiteral::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NoSubstitutionTemplateLiteral) -> *Node;
```
## NoSubstitutionTemplateLiteral::is\<T\>

```rust
pub fn is<T>(self: NoSubstitutionTemplateLiteral) -> bool;
```
## NoSubstitutionTemplateLiteral::to\<T\>

```rust
pub fn to<T>(self: NoSubstitutionTemplateLiteral) -> <any>;
```
## NoSubstitutionTemplateLiteral::key\_neq

```rust
pub fn key_neq(self: NoSubstitutionTemplateLiteral, object: <any>) -> bool;
```
## NoSubstitutionTemplateLiteral::key\_eq

```rust
pub fn key_eq(self: NoSubstitutionTemplateLiteral, object: <any>) -> bool;
```
## NoSubstitutionTemplateLiteral::to\_set

```rust
pub fn to_set(self: NoSubstitutionTemplateLiteral) -> *NoSubstitutionTemplateLiteral;
```
