# IntersectionTypeNode

Primary key: `id: int`

```rust
schema IntersectionTypeNode {
  @primary id: int,
}
```
## IntersectionTypeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: IntersectionTypeNode) -> Location;
```
## IntersectionTypeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: IntersectionTypeNode) -> Symbol;
```
## IntersectionTypeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: IntersectionTypeNode) -> *Decorator;
```
## IntersectionTypeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: IntersectionTypeNode) -> string;
```
## IntersectionTypeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: IntersectionTypeNode, i: int) -> Modifier;
```
## IntersectionTypeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: IntersectionTypeNode) -> *Comment;
```
## IntersectionTypeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: IntersectionTypeNode) -> *Node;
```
## IntersectionTypeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: IntersectionTypeNode) -> *Node;
```
## IntersectionTypeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: IntersectionTypeNode) -> Node;
```
## IntersectionTypeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: IntersectionTypeNode) -> *Comment;
```
## IntersectionTypeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: IntersectionTypeNode) -> *Comment;
```
## IntersectionTypeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: IntersectionTypeNode) -> int;
```
## IntersectionTypeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: IntersectionTypeNode) -> TopLevelDO;
```
## IntersectionTypeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: IntersectionTypeNode, i: int) -> Decorator;
```
## IntersectionTypeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: IntersectionTypeNode) -> int;
```
## IntersectionTypeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: IntersectionTypeNode) -> *Modifier;
```
## IntersectionTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: IntersectionTypeNode) -> int;
```
## IntersectionTypeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: IntersectionTypeNode, i: int) -> Node;
```
## IntersectionTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: IntersectionTypeNode) -> int;
```
## IntersectionTypeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: IntersectionTypeNode) -> *FunctionLikeDeclaration;
```
## IntersectionTypeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: IntersectionTypeNode, level: int) -> *Node;
```
## IntersectionTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: IntersectionTypeNode) -> int;
```
## IntersectionTypeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: IntersectionTypeNode) -> string;
```
## IntersectionTypeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: IntersectionTypeNode) -> File;
```
## IntersectionTypeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: IntersectionTypeNode, level: int) -> Node;
```
## IntersectionTypeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: IntersectionTypeNode) -> FunctionLikeDeclaration;
```
## IntersectionTypeNode::getAType

```rust
pub fn getAType(self: IntersectionTypeNode) -> *TypeNode;
```
## IntersectionTypeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: IntersectionTypeNode) -> Node;
```
## IntersectionTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: IntersectionTypeNode) -> int;
```
## IntersectionTypeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: IntersectionTypeNode) -> int;
```
## IntersectionTypeNode::getIndex

```rust
pub fn getIndex(self: IntersectionTypeNode) -> int;
```
## IntersectionTypeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: IntersectionTypeNode) -> *Node;
```
## IntersectionTypeNode::getType

```rust
pub fn getType(self: IntersectionTypeNode, i: int) -> TypeNode;
```
## IntersectionTypeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *IntersectionTypeNode;
```
## IntersectionTypeNode::is\<T\>

```rust
pub fn is<T>(self: IntersectionTypeNode) -> bool;
```
## IntersectionTypeNode::to\<T\>

```rust
pub fn to<T>(self: IntersectionTypeNode) -> <any>;
```
## IntersectionTypeNode::key\_neq

```rust
pub fn key_neq(self: IntersectionTypeNode, object: <any>) -> bool;
```
## IntersectionTypeNode::key\_eq

```rust
pub fn key_eq(self: IntersectionTypeNode, object: <any>) -> bool;
```
## IntersectionTypeNode::to\_set

```rust
pub fn to_set(self: IntersectionTypeNode) -> *IntersectionTypeNode;
```
