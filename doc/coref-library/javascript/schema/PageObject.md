# PageObject

Primary key: `id: int`

```rust
schema PageObject {
  @primary id: int,
}
```
## PageObject::getAProperty

```rust
/**
     * Get a property, which is an ObjectLiteralElement.
     */
```
```rust
pub fn getAProperty(self: PageObject) -> *ObjectLiteralElement;
```
## PageObject::getProperty

```rust
/**
     * Get the `i`th property.
     */
```
```rust
pub fn getProperty(self: PageObject, i: int) -> ObjectLiteralElement;
```
## PageObject::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PageObject) -> int;
```
## PageObject::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PageObject) -> string;
```
## PageObject::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PageObject, i: int) -> Modifier;
```
## PageObject::hasProperty

```rust
/**
     * Determine whether this ObjectLiteralExpression has a property with the specified name.
     */
```
```rust
pub fn hasProperty(self: PageObject, name: string) -> bool;
```
## PageObject::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PageObject) -> *Decorator;
```
## PageObject::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PageObject) -> Symbol;
```
## PageObject::getPropertyByName

```rust
/**
     * Get the property of this ObjectLiteralExpression by name.
     */
```
```rust
pub fn getPropertyByName(self: PageObject, name: string) -> ObjectLiteralElement;
```
## PageObject::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PageObject) -> Location;
```
## PageObject::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PageObject) -> *Comment;
```
## PageObject::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PageObject) -> *Node;
```
## PageObject::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PageObject) -> *Node;
```
## PageObject::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PageObject) -> Node;
```
## PageObject::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PageObject) -> Node;
```
## PageObject::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PageObject, i: int) -> Decorator;
```
## PageObject::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PageObject) -> TopLevelDO;
```
## PageObject::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PageObject) -> int;
```
## PageObject::getAModifier

```rust
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

```rust
/**
     * Get the PropertyAssignment of this ObjectLiteralExpression by name.
     */
```
```rust
pub fn getPropertyAssignmentByName(self: PageObject, name: string) -> PropertyAssignment;
```
## PageObject::getChild

```rust
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

```rust
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

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PageObject) -> *FunctionLikeDeclaration;
```
## PageObject::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PageObject) -> *Comment;
```
## PageObject::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PageObject) -> *Comment;
```
## PageObject::getEnclosingFunction

```rust
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

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PageObject) -> File;
```
## PageObject::getAnAncestorByLevel

```rust
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

```rust
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

```rust
pub fn __all__(db: JavascriptDB) -> *PageObject;
```
## PageObject::getExpression

```rust
pub fn getExpression(self: PageObject) -> Expression;
```
## PageObject::getRelativePath

```rust
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

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PageObject) -> *Node;
```
## PageObject::is\<T\>

```rust
pub fn is<T>(self: PageObject) -> bool;
```
## PageObject::to\<T\>

```rust
pub fn to<T>(self: PageObject) -> <any>;
```
## PageObject::key\_neq

```rust
pub fn key_neq(self: PageObject, object: <any>) -> bool;
```
## PageObject::key\_eq

```rust
pub fn key_eq(self: PageObject, object: <any>) -> bool;
```
## PageObject::to\_set

```rust
pub fn to_set(self: PageObject) -> *PageObject;
```
