# IndexedAccessTypeNode

Primary key: `id: int`

```rust
schema IndexedAccessTypeNode {
  @primary id: int,
}
```
## IndexedAccessTypeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: IndexedAccessTypeNode) -> Location;
```
## IndexedAccessTypeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: IndexedAccessTypeNode) -> Symbol;
```
## IndexedAccessTypeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: IndexedAccessTypeNode) -> *Decorator;
```
## IndexedAccessTypeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: IndexedAccessTypeNode) -> string;
```
## IndexedAccessTypeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: IndexedAccessTypeNode, i: int) -> Modifier;
```
## IndexedAccessTypeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: IndexedAccessTypeNode) -> *Comment;
```
## IndexedAccessTypeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: IndexedAccessTypeNode) -> *Node;
```
## IndexedAccessTypeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: IndexedAccessTypeNode) -> *Node;
```
## IndexedAccessTypeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: IndexedAccessTypeNode) -> Node;
```
## IndexedAccessTypeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: IndexedAccessTypeNode) -> *Comment;
```
## IndexedAccessTypeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: IndexedAccessTypeNode) -> *Comment;
```
## IndexedAccessTypeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: IndexedAccessTypeNode) -> int;
```
## IndexedAccessTypeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: IndexedAccessTypeNode) -> TopLevelDO;
```
## IndexedAccessTypeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: IndexedAccessTypeNode, i: int) -> Decorator;
```
## IndexedAccessTypeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: IndexedAccessTypeNode, i: int) -> Node;
```
## IndexedAccessTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: IndexedAccessTypeNode) -> int;
```
## IndexedAccessTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: IndexedAccessTypeNode) -> int;
```
## IndexedAccessTypeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: IndexedAccessTypeNode) -> int;
```
## IndexedAccessTypeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: IndexedAccessTypeNode) -> *Modifier;
```
## IndexedAccessTypeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: IndexedAccessTypeNode) -> *FunctionLikeDeclaration;
```
## IndexedAccessTypeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: IndexedAccessTypeNode, level: int) -> *Node;
```
## IndexedAccessTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: IndexedAccessTypeNode) -> int;
```
## IndexedAccessTypeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: IndexedAccessTypeNode) -> string;
```
## IndexedAccessTypeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: IndexedAccessTypeNode) -> Node;
```
## IndexedAccessTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: IndexedAccessTypeNode) -> int;
```
## IndexedAccessTypeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: IndexedAccessTypeNode) -> FunctionLikeDeclaration;
```
## IndexedAccessTypeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: IndexedAccessTypeNode) -> File;
```
## IndexedAccessTypeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: IndexedAccessTypeNode, level: int) -> Node;
```
## IndexedAccessTypeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: IndexedAccessTypeNode) -> int;
```
## IndexedAccessTypeNode::getIndexType

```rust
pub fn getIndexType(self: IndexedAccessTypeNode) -> TypeNode;
```
## IndexedAccessTypeNode::getIndex

```rust
pub fn getIndex(self: IndexedAccessTypeNode) -> int;
```
## IndexedAccessTypeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *IndexedAccessTypeNode;
```
## IndexedAccessTypeNode::getObjectType

```rust
pub fn getObjectType(self: IndexedAccessTypeNode) -> TypeNode;
```
## IndexedAccessTypeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: IndexedAccessTypeNode) -> *Node;
```
## IndexedAccessTypeNode::is\<T\>

```rust
pub fn is<T>(self: IndexedAccessTypeNode) -> bool;
```
## IndexedAccessTypeNode::to\<T\>

```rust
pub fn to<T>(self: IndexedAccessTypeNode) -> <any>;
```
## IndexedAccessTypeNode::key\_neq

```rust
pub fn key_neq(self: IndexedAccessTypeNode, object: <any>) -> bool;
```
## IndexedAccessTypeNode::key\_eq

```rust
pub fn key_eq(self: IndexedAccessTypeNode, object: <any>) -> bool;
```
## IndexedAccessTypeNode::to\_set

```rust
pub fn to_set(self: IndexedAccessTypeNode) -> *IndexedAccessTypeNode;
```
