# InferTypeNode

Primary key: `id: int`

```rust
schema InferTypeNode {
  @primary id: int,
}
```
## InferTypeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: InferTypeNode) -> Location;
```
## InferTypeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: InferTypeNode) -> Symbol;
```
## InferTypeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: InferTypeNode) -> *Decorator;
```
## InferTypeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: InferTypeNode) -> string;
```
## InferTypeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: InferTypeNode, i: int) -> Modifier;
```
## InferTypeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: InferTypeNode) -> *Comment;
```
## InferTypeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: InferTypeNode) -> *Node;
```
## InferTypeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: InferTypeNode) -> *Node;
```
## InferTypeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: InferTypeNode) -> Node;
```
## InferTypeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: InferTypeNode) -> int;
```
## InferTypeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: InferTypeNode) -> TopLevelDO;
```
## InferTypeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: InferTypeNode, i: int) -> Decorator;
```
## InferTypeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: InferTypeNode) -> int;
```
## InferTypeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: InferTypeNode) -> *Modifier;
```
## InferTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: InferTypeNode) -> int;
```
## InferTypeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: InferTypeNode, i: int) -> Node;
```
## InferTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: InferTypeNode) -> int;
```
## InferTypeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: InferTypeNode) -> *FunctionLikeDeclaration;
```
## InferTypeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: InferTypeNode, level: int) -> *Node;
```
## InferTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: InferTypeNode) -> int;
```
## InferTypeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: InferTypeNode) -> string;
```
## InferTypeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: InferTypeNode, level: int) -> Node;
```
## InferTypeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: InferTypeNode) -> File;
```
## InferTypeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: InferTypeNode) -> *Comment;
```
## InferTypeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: InferTypeNode) -> *Comment;
```
## InferTypeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: InferTypeNode) -> Node;
```
## InferTypeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: InferTypeNode) -> FunctionLikeDeclaration;
```
## InferTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: InferTypeNode) -> int;
```
## InferTypeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: InferTypeNode) -> int;
```
## InferTypeNode::getIndex

```rust
pub fn getIndex(self: InferTypeNode) -> int;
```
## InferTypeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: InferTypeNode) -> *Node;
```
## InferTypeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *InferTypeNode;
```
## InferTypeNode::is\<T\>

```rust
pub fn is<T>(self: InferTypeNode) -> bool;
```
## InferTypeNode::to\<T\>

```rust
pub fn to<T>(self: InferTypeNode) -> <any>;
```
## InferTypeNode::key\_neq

```rust
pub fn key_neq(self: InferTypeNode, object: <any>) -> bool;
```
## InferTypeNode::key\_eq

```rust
pub fn key_eq(self: InferTypeNode, object: <any>) -> bool;
```
## InferTypeNode::to\_set

```rust
pub fn to_set(self: InferTypeNode) -> *InferTypeNode;
```
