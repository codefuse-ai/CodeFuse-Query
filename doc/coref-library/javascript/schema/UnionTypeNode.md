# UnionTypeNode

Primary key: `id: int`

```rust
schema UnionTypeNode {
  @primary id: int,
}
```
## UnionTypeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: UnionTypeNode) -> Location;
```
## UnionTypeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: UnionTypeNode) -> Symbol;
```
## UnionTypeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: UnionTypeNode) -> *Decorator;
```
## UnionTypeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: UnionTypeNode) -> string;
```
## UnionTypeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: UnionTypeNode, i: int) -> Modifier;
```
## UnionTypeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: UnionTypeNode) -> *Comment;
```
## UnionTypeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: UnionTypeNode) -> *Node;
```
## UnionTypeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: UnionTypeNode) -> *Node;
```
## UnionTypeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: UnionTypeNode) -> Node;
```
## UnionTypeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: UnionTypeNode) -> *Comment;
```
## UnionTypeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: UnionTypeNode) -> *Comment;
```
## UnionTypeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: UnionTypeNode) -> int;
```
## UnionTypeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: UnionTypeNode) -> TopLevelDO;
```
## UnionTypeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: UnionTypeNode, i: int) -> Decorator;
```
## UnionTypeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: UnionTypeNode) -> int;
```
## UnionTypeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: UnionTypeNode) -> *Modifier;
```
## UnionTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: UnionTypeNode) -> int;
```
## UnionTypeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: UnionTypeNode, i: int) -> Node;
```
## UnionTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: UnionTypeNode) -> int;
```
## UnionTypeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: UnionTypeNode) -> *FunctionLikeDeclaration;
```
## UnionTypeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: UnionTypeNode, level: int) -> *Node;
```
## UnionTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: UnionTypeNode) -> int;
```
## UnionTypeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: UnionTypeNode) -> string;
```
## UnionTypeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: UnionTypeNode) -> File;
```
## UnionTypeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: UnionTypeNode, level: int) -> Node;
```
## UnionTypeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: UnionTypeNode) -> FunctionLikeDeclaration;
```
## UnionTypeNode::getAType

```rust
pub fn getAType(self: UnionTypeNode) -> *TypeNode;
```
## UnionTypeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: UnionTypeNode) -> Node;
```
## UnionTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: UnionTypeNode) -> int;
```
## UnionTypeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: UnionTypeNode) -> int;
```
## UnionTypeNode::getIndex

```rust
pub fn getIndex(self: UnionTypeNode) -> int;
```
## UnionTypeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: UnionTypeNode) -> *Node;
```
## UnionTypeNode::getType

```rust
pub fn getType(self: UnionTypeNode, i: int) -> TypeNode;
```
## UnionTypeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *UnionTypeNode;
```
## UnionTypeNode::is\<T\>

```rust
pub fn is<T>(self: UnionTypeNode) -> bool;
```
## UnionTypeNode::to\<T\>

```rust
pub fn to<T>(self: UnionTypeNode) -> <any>;
```
## UnionTypeNode::key\_neq

```rust
pub fn key_neq(self: UnionTypeNode, object: <any>) -> bool;
```
## UnionTypeNode::key\_eq

```rust
pub fn key_eq(self: UnionTypeNode, object: <any>) -> bool;
```
## UnionTypeNode::to\_set

```rust
pub fn to_set(self: UnionTypeNode) -> *UnionTypeNode;
```
