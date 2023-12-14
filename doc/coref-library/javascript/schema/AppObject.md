# AppObject

Primary key: `id: int`

```rust
schema AppObject {
  @primary id: int,
}
```
## AppObject::getAProperty

```rust
/**
     * Get a property, which is an ObjectLiteralElement.
     */
```
```rust
pub fn getAProperty(self: AppObject) -> *ObjectLiteralElement;
```
## AppObject::getProperty

```rust
/**
     * Get the `i`th property.
     */
```
```rust
pub fn getProperty(self: AppObject, i: int) -> ObjectLiteralElement;
```
## AppObject::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AppObject) -> int;
```
## AppObject::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AppObject) -> string;
```
## AppObject::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AppObject, i: int) -> Modifier;
```
## AppObject::hasProperty

```rust
/**
     * Determine whether this ObjectLiteralExpression has a property with the specified name.
     */
```
```rust
pub fn hasProperty(self: AppObject, name: string) -> bool;
```
## AppObject::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AppObject) -> *Decorator;
```
## AppObject::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AppObject) -> Symbol;
```
## AppObject::getPropertyByName

```rust
/**
     * Get the property of this ObjectLiteralExpression by name.
     */
```
```rust
pub fn getPropertyByName(self: AppObject, name: string) -> ObjectLiteralElement;
```
## AppObject::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AppObject) -> Location;
```
## AppObject::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AppObject) -> *Comment;
```
## AppObject::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AppObject) -> *Node;
```
## AppObject::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AppObject) -> *Node;
```
## AppObject::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AppObject) -> Node;
```
## AppObject::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AppObject) -> Node;
```
## AppObject::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AppObject, i: int) -> Decorator;
```
## AppObject::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AppObject) -> TopLevelDO;
```
## AppObject::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AppObject) -> int;
```
## AppObject::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AppObject) -> *Modifier;
```
## AppObject::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AppObject) -> int;
```
## AppObject::getPropertyAssignmentByName

```rust
/**
     * Get the PropertyAssignment of this ObjectLiteralExpression by name.
     */
```
```rust
pub fn getPropertyAssignmentByName(self: AppObject, name: string) -> PropertyAssignment;
```
## AppObject::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AppObject, i: int) -> Node;
```
## AppObject::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AppObject) -> int;
```
## AppObject::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AppObject, level: int) -> *Node;
```
## AppObject::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AppObject) -> *FunctionLikeDeclaration;
```
## AppObject::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AppObject) -> *Comment;
```
## AppObject::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AppObject) -> *Comment;
```
## AppObject::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AppObject) -> FunctionLikeDeclaration;
```
## AppObject::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AppObject) -> int;
```
## AppObject::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AppObject) -> File;
```
## AppObject::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AppObject, level: int) -> Node;
```
## AppObject::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AppObject) -> int;
```
## AppObject::getIndex

```rust
pub fn getIndex(self: AppObject) -> int;
```
## AppObject::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AppObject;
```
## AppObject::getExpression

```rust
pub fn getExpression(self: AppObject) -> Expression;
```
## AppObject::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AppObject) -> string;
```
## AppObject::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AppObject) -> int;
```
## AppObject::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AppObject) -> *Node;
```
## AppObject::is\<T\>

```rust
pub fn is<T>(self: AppObject) -> bool;
```
## AppObject::to\<T\>

```rust
pub fn to<T>(self: AppObject) -> <any>;
```
## AppObject::key\_neq

```rust
pub fn key_neq(self: AppObject, object: <any>) -> bool;
```
## AppObject::key\_eq

```rust
pub fn key_eq(self: AppObject, object: <any>) -> bool;
```
## AppObject::to\_set

```rust
pub fn to_set(self: AppObject) -> *AppObject;
```
