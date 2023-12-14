# TypeLiteralNode

Primary key: `id: int`

```rust
schema TypeLiteralNode {
  @primary id: int,
}
```
## TypeLiteralNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TypeLiteralNode) -> Location;
```
## TypeLiteralNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TypeLiteralNode) -> Symbol;
```
## TypeLiteralNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TypeLiteralNode) -> *Decorator;
```
## TypeLiteralNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TypeLiteralNode) -> string;
```
## TypeLiteralNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TypeLiteralNode, i: int) -> Modifier;
```
## TypeLiteralNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TypeLiteralNode) -> *Comment;
```
## TypeLiteralNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TypeLiteralNode) -> *Node;
```
## TypeLiteralNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TypeLiteralNode) -> *Node;
```
## TypeLiteralNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TypeLiteralNode) -> Node;
```
## TypeLiteralNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TypeLiteralNode) -> int;
```
## TypeLiteralNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TypeLiteralNode) -> TopLevelDO;
```
## TypeLiteralNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TypeLiteralNode, i: int) -> Decorator;
```
## TypeLiteralNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TypeLiteralNode) -> int;
```
## TypeLiteralNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TypeLiteralNode) -> *Modifier;
```
## TypeLiteralNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TypeLiteralNode) -> int;
```
## TypeLiteralNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TypeLiteralNode, i: int) -> Node;
```
## TypeLiteralNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TypeLiteralNode) -> int;
```
## TypeLiteralNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TypeLiteralNode) -> *FunctionLikeDeclaration;
```
## TypeLiteralNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TypeLiteralNode, level: int) -> *Node;
```
## TypeLiteralNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TypeLiteralNode) -> int;
```
## TypeLiteralNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TypeLiteralNode) -> string;
```
## TypeLiteralNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TypeLiteralNode, level: int) -> Node;
```
## TypeLiteralNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TypeLiteralNode) -> File;
```
## TypeLiteralNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TypeLiteralNode) -> *Comment;
```
## TypeLiteralNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TypeLiteralNode) -> *Comment;
```
## TypeLiteralNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TypeLiteralNode) -> Node;
```
## TypeLiteralNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TypeLiteralNode) -> FunctionLikeDeclaration;
```
## TypeLiteralNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TypeLiteralNode) -> int;
```
## TypeLiteralNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TypeLiteralNode) -> int;
```
## TypeLiteralNode::getIndex

```rust
pub fn getIndex(self: TypeLiteralNode) -> int;
```
## TypeLiteralNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TypeLiteralNode) -> *Node;
```
## TypeLiteralNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TypeLiteralNode;
```
## TypeLiteralNode::is\<T\>

```rust
pub fn is<T>(self: TypeLiteralNode) -> bool;
```
## TypeLiteralNode::to\<T\>

```rust
pub fn to<T>(self: TypeLiteralNode) -> <any>;
```
## TypeLiteralNode::key\_neq

```rust
pub fn key_neq(self: TypeLiteralNode, object: <any>) -> bool;
```
## TypeLiteralNode::key\_eq

```rust
pub fn key_eq(self: TypeLiteralNode, object: <any>) -> bool;
```
## TypeLiteralNode::to\_set

```rust
pub fn to_set(self: TypeLiteralNode) -> *TypeLiteralNode;
```
