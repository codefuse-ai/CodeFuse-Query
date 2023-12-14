# OptionalTypeNode

Primary key: `id: int`

```rust
schema OptionalTypeNode {
  @primary id: int,
}
```
## OptionalTypeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: OptionalTypeNode) -> Location;
```
## OptionalTypeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: OptionalTypeNode) -> Symbol;
```
## OptionalTypeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: OptionalTypeNode) -> *Decorator;
```
## OptionalTypeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: OptionalTypeNode) -> string;
```
## OptionalTypeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: OptionalTypeNode, i: int) -> Modifier;
```
## OptionalTypeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: OptionalTypeNode) -> *Comment;
```
## OptionalTypeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: OptionalTypeNode) -> *Node;
```
## OptionalTypeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: OptionalTypeNode) -> *Node;
```
## OptionalTypeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: OptionalTypeNode) -> Node;
```
## OptionalTypeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: OptionalTypeNode) -> int;
```
## OptionalTypeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: OptionalTypeNode) -> TopLevelDO;
```
## OptionalTypeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: OptionalTypeNode, i: int) -> Decorator;
```
## OptionalTypeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: OptionalTypeNode) -> int;
```
## OptionalTypeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: OptionalTypeNode) -> *Modifier;
```
## OptionalTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: OptionalTypeNode) -> int;
```
## OptionalTypeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: OptionalTypeNode, i: int) -> Node;
```
## OptionalTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: OptionalTypeNode) -> int;
```
## OptionalTypeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: OptionalTypeNode) -> *FunctionLikeDeclaration;
```
## OptionalTypeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: OptionalTypeNode, level: int) -> *Node;
```
## OptionalTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: OptionalTypeNode) -> int;
```
## OptionalTypeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: OptionalTypeNode) -> string;
```
## OptionalTypeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: OptionalTypeNode, level: int) -> Node;
```
## OptionalTypeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: OptionalTypeNode) -> File;
```
## OptionalTypeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: OptionalTypeNode) -> *Comment;
```
## OptionalTypeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: OptionalTypeNode) -> *Comment;
```
## OptionalTypeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: OptionalTypeNode) -> Node;
```
## OptionalTypeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: OptionalTypeNode) -> FunctionLikeDeclaration;
```
## OptionalTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: OptionalTypeNode) -> int;
```
## OptionalTypeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: OptionalTypeNode) -> int;
```
## OptionalTypeNode::getIndex

```rust
pub fn getIndex(self: OptionalTypeNode) -> int;
```
## OptionalTypeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: OptionalTypeNode) -> *Node;
```
## OptionalTypeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *OptionalTypeNode;
```
## OptionalTypeNode::is\<T\>

```rust
pub fn is<T>(self: OptionalTypeNode) -> bool;
```
## OptionalTypeNode::to\<T\>

```rust
pub fn to<T>(self: OptionalTypeNode) -> <any>;
```
## OptionalTypeNode::key\_neq

```rust
pub fn key_neq(self: OptionalTypeNode, object: <any>) -> bool;
```
## OptionalTypeNode::key\_eq

```rust
pub fn key_eq(self: OptionalTypeNode, object: <any>) -> bool;
```
## OptionalTypeNode::to\_set

```rust
pub fn to_set(self: OptionalTypeNode) -> *OptionalTypeNode;
```
