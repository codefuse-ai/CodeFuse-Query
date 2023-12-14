# TypeReferenceNode

Primary key: `id: int`

```rust
schema TypeReferenceNode {
  @primary id: int,
}
```
## TypeReferenceNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TypeReferenceNode) -> *Node;
```
## TypeReferenceNode::getIndex

```rust
pub fn getIndex(self: TypeReferenceNode) -> int;
```
## TypeReferenceNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TypeReferenceNode) -> int;
```
## TypeReferenceNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TypeReferenceNode) -> int;
```
## TypeReferenceNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TypeReferenceNode) -> FunctionLikeDeclaration;
```
## TypeReferenceNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TypeReferenceNode) -> Node;
```
## TypeReferenceNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TypeReferenceNode) -> *Comment;
```
## TypeReferenceNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TypeReferenceNode) -> *Comment;
```
## TypeReferenceNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TypeReferenceNode) -> File;
```
## TypeReferenceNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TypeReferenceNode, level: int) -> Node;
```
## TypeReferenceNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TypeReferenceNode) -> int;
```
## TypeReferenceNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TypeReferenceNode) -> string;
```
## TypeReferenceNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TypeReferenceNode) -> *FunctionLikeDeclaration;
```
## TypeReferenceNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TypeReferenceNode, level: int) -> *Node;
```
## TypeReferenceNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TypeReferenceNode) -> int;
```
## TypeReferenceNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TypeReferenceNode) -> *Modifier;
```
## TypeReferenceNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TypeReferenceNode) -> int;
```
## TypeReferenceNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TypeReferenceNode) -> int;
```
## TypeReferenceNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TypeReferenceNode, i: int) -> Node;
```
## TypeReferenceNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TypeReferenceNode, i: int) -> Decorator;
```
## TypeReferenceNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TypeReferenceNode) -> TopLevelDO;
```
## TypeReferenceNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TypeReferenceNode) -> int;
```
## TypeReferenceNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TypeReferenceNode) -> Node;
```
## TypeReferenceNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TypeReferenceNode) -> *Node;
```
## TypeReferenceNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TypeReferenceNode) -> *Node;
```
## TypeReferenceNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TypeReferenceNode) -> *Comment;
```
## TypeReferenceNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TypeReferenceNode) -> Symbol;
```
## TypeReferenceNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TypeReferenceNode) -> *Decorator;
```
## TypeReferenceNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TypeReferenceNode;
```
## TypeReferenceNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TypeReferenceNode) -> Location;
```
## TypeReferenceNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TypeReferenceNode) -> string;
```
## TypeReferenceNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TypeReferenceNode, i: int) -> Modifier;
```
## TypeReferenceNode::getTypeName

```rust
pub fn getTypeName(self: TypeReferenceNode) -> Node;
```
## TypeReferenceNode::is\<T\>

```rust
pub fn is<T>(self: TypeReferenceNode) -> bool;
```
## TypeReferenceNode::to\<T\>

```rust
pub fn to<T>(self: TypeReferenceNode) -> <any>;
```
## TypeReferenceNode::key\_neq

```rust
pub fn key_neq(self: TypeReferenceNode, object: <any>) -> bool;
```
## TypeReferenceNode::key\_eq

```rust
pub fn key_eq(self: TypeReferenceNode, object: <any>) -> bool;
```
## TypeReferenceNode::to\_set

```rust
pub fn to_set(self: TypeReferenceNode) -> *TypeReferenceNode;
```
