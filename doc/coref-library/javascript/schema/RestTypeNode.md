# RestTypeNode

Primary key: `id: int`

```rust
schema RestTypeNode {
  @primary id: int,
}
```
## RestTypeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: RestTypeNode) -> Location;
```
## RestTypeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: RestTypeNode) -> Symbol;
```
## RestTypeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: RestTypeNode) -> *Decorator;
```
## RestTypeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: RestTypeNode) -> string;
```
## RestTypeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: RestTypeNode, i: int) -> Modifier;
```
## RestTypeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: RestTypeNode) -> *Comment;
```
## RestTypeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: RestTypeNode) -> *Node;
```
## RestTypeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: RestTypeNode) -> *Node;
```
## RestTypeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: RestTypeNode) -> Node;
```
## RestTypeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: RestTypeNode) -> int;
```
## RestTypeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: RestTypeNode) -> TopLevelDO;
```
## RestTypeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: RestTypeNode, i: int) -> Decorator;
```
## RestTypeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: RestTypeNode) -> int;
```
## RestTypeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: RestTypeNode) -> *Modifier;
```
## RestTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RestTypeNode) -> int;
```
## RestTypeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: RestTypeNode, i: int) -> Node;
```
## RestTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RestTypeNode) -> int;
```
## RestTypeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RestTypeNode) -> *FunctionLikeDeclaration;
```
## RestTypeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: RestTypeNode, level: int) -> *Node;
```
## RestTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RestTypeNode) -> int;
```
## RestTypeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: RestTypeNode) -> string;
```
## RestTypeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: RestTypeNode, level: int) -> Node;
```
## RestTypeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: RestTypeNode) -> File;
```
## RestTypeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: RestTypeNode) -> *Comment;
```
## RestTypeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: RestTypeNode) -> *Comment;
```
## RestTypeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: RestTypeNode) -> Node;
```
## RestTypeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: RestTypeNode) -> FunctionLikeDeclaration;
```
## RestTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RestTypeNode) -> int;
```
## RestTypeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: RestTypeNode) -> int;
```
## RestTypeNode::getIndex

```rust
pub fn getIndex(self: RestTypeNode) -> int;
```
## RestTypeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: RestTypeNode) -> *Node;
```
## RestTypeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *RestTypeNode;
```
## RestTypeNode::is\<T\>

```rust
pub fn is<T>(self: RestTypeNode) -> bool;
```
## RestTypeNode::to\<T\>

```rust
pub fn to<T>(self: RestTypeNode) -> <any>;
```
## RestTypeNode::key\_neq

```rust
pub fn key_neq(self: RestTypeNode, object: <any>) -> bool;
```
## RestTypeNode::key\_eq

```rust
pub fn key_eq(self: RestTypeNode, object: <any>) -> bool;
```
## RestTypeNode::to\_set

```rust
pub fn to_set(self: RestTypeNode) -> *RestTypeNode;
```
