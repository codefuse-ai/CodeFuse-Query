# ObjectLiteralExpression

Primary key: `id: int`

```rust
schema ObjectLiteralExpression {
  @primary id: int,
}
```
## ObjectLiteralExpression::getADescendant

```rust
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

```rust
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

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ObjectLiteralExpression) -> int;
```
## ObjectLiteralExpression::getAnAncestorByLevel

```rust
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

```rust
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

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ObjectLiteralExpression) -> FunctionLikeDeclaration;
```
## ObjectLiteralExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ObjectLiteralExpression) -> *Comment;
```
## ObjectLiteralExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ObjectLiteralExpression) -> *Comment;
```
## ObjectLiteralExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ObjectLiteralExpression) -> *FunctionLikeDeclaration;
```
## ObjectLiteralExpression::getADescendantByLevel

```rust
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

```rust
/**
     * Get the PropertyAssignment of this ObjectLiteralExpression by name.
     */
```
```rust
pub fn getPropertyAssignmentByName(self: ObjectLiteralExpression, name: string) -> PropertyAssignment;
```
## ObjectLiteralExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ObjectLiteralExpression) -> int;
```
## ObjectLiteralExpression::getAModifier

```rust
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

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ObjectLiteralExpression, i: int) -> Node;
```
## ObjectLiteralExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ObjectLiteralExpression) -> TopLevelDO;
```
## ObjectLiteralExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ObjectLiteralExpression, i: int) -> Decorator;
```
## ObjectLiteralExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ObjectLiteralExpression) -> Node;
```
## ObjectLiteralExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ObjectLiteralExpression) -> Node;
```
## ObjectLiteralExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ObjectLiteralExpression) -> *Node;
```
## ObjectLiteralExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ObjectLiteralExpression) -> *Node;
```
## ObjectLiteralExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ObjectLiteralExpression) -> *Comment;
```
## ObjectLiteralExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ObjectLiteralExpression;
```
## ObjectLiteralExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ObjectLiteralExpression) -> Location;
```
## ObjectLiteralExpression::getPropertyByName

```rust
/**
     * Get the property of this ObjectLiteralExpression by name.
     */
```
```rust
pub fn getPropertyByName(self: ObjectLiteralExpression, name: string) -> ObjectLiteralElement;
```
## ObjectLiteralExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ObjectLiteralExpression) -> Symbol;
```
## ObjectLiteralExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ObjectLiteralExpression) -> *Decorator;
```
## ObjectLiteralExpression::hasProperty

```rust
/**
     * Determine whether this ObjectLiteralExpression has a property with the specified name.
     */
```
```rust
pub fn hasProperty(self: ObjectLiteralExpression, name: string) -> bool;
```
## ObjectLiteralExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ObjectLiteralExpression, i: int) -> Modifier;
```
## ObjectLiteralExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ObjectLiteralExpression) -> string;
```
## ObjectLiteralExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ObjectLiteralExpression) -> int;
```
## ObjectLiteralExpression::getProperty

```rust
/**
     * Get the `i`th property.
     */
```
```rust
pub fn getProperty(self: ObjectLiteralExpression, i: int) -> ObjectLiteralElement;
```
## ObjectLiteralExpression::getAProperty

```rust
/**
     * Get a property, which is an ObjectLiteralElement.
     */
```
```rust
pub fn getAProperty(self: ObjectLiteralExpression) -> *ObjectLiteralElement;
```
## ObjectLiteralExpression::is\<T\>

```rust
pub fn is<T>(self: ObjectLiteralExpression) -> bool;
```
## ObjectLiteralExpression::to\<T\>

```rust
pub fn to<T>(self: ObjectLiteralExpression) -> <any>;
```
## ObjectLiteralExpression::key\_neq

```rust
pub fn key_neq(self: ObjectLiteralExpression, object: <any>) -> bool;
```
## ObjectLiteralExpression::key\_eq

```rust
pub fn key_eq(self: ObjectLiteralExpression, object: <any>) -> bool;
```
## ObjectLiteralExpression::to\_set

```rust
pub fn to_set(self: ObjectLiteralExpression) -> *ObjectLiteralExpression;
```
