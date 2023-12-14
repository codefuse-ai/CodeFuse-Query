# TypePredicateNode

Primary key: `id: int`

```rust
schema TypePredicateNode {
  @primary id: int,
}
```
## TypePredicateNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TypePredicateNode) -> Location;
```
## TypePredicateNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TypePredicateNode) -> Symbol;
```
## TypePredicateNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TypePredicateNode) -> *Decorator;
```
## TypePredicateNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TypePredicateNode) -> string;
```
## TypePredicateNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TypePredicateNode, i: int) -> Modifier;
```
## TypePredicateNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TypePredicateNode) -> *Comment;
```
## TypePredicateNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TypePredicateNode) -> *Node;
```
## TypePredicateNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TypePredicateNode) -> *Node;
```
## TypePredicateNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TypePredicateNode) -> Node;
```
## TypePredicateNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TypePredicateNode) -> int;
```
## TypePredicateNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TypePredicateNode) -> TopLevelDO;
```
## TypePredicateNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TypePredicateNode, i: int) -> Decorator;
```
## TypePredicateNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TypePredicateNode) -> int;
```
## TypePredicateNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TypePredicateNode) -> *Modifier;
```
## TypePredicateNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TypePredicateNode) -> int;
```
## TypePredicateNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TypePredicateNode, i: int) -> Node;
```
## TypePredicateNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TypePredicateNode) -> int;
```
## TypePredicateNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TypePredicateNode) -> *FunctionLikeDeclaration;
```
## TypePredicateNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TypePredicateNode, level: int) -> *Node;
```
## TypePredicateNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TypePredicateNode) -> int;
```
## TypePredicateNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TypePredicateNode) -> string;
```
## TypePredicateNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TypePredicateNode, level: int) -> Node;
```
## TypePredicateNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TypePredicateNode) -> File;
```
## TypePredicateNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TypePredicateNode) -> *Comment;
```
## TypePredicateNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TypePredicateNode) -> *Comment;
```
## TypePredicateNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TypePredicateNode) -> Node;
```
## TypePredicateNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TypePredicateNode) -> FunctionLikeDeclaration;
```
## TypePredicateNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TypePredicateNode) -> int;
```
## TypePredicateNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TypePredicateNode) -> int;
```
## TypePredicateNode::getIndex

```rust
pub fn getIndex(self: TypePredicateNode) -> int;
```
## TypePredicateNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TypePredicateNode) -> *Node;
```
## TypePredicateNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TypePredicateNode;
```
## TypePredicateNode::is\<T\>

```rust
pub fn is<T>(self: TypePredicateNode) -> bool;
```
## TypePredicateNode::to\<T\>

```rust
pub fn to<T>(self: TypePredicateNode) -> <any>;
```
## TypePredicateNode::key\_neq

```rust
pub fn key_neq(self: TypePredicateNode, object: <any>) -> bool;
```
## TypePredicateNode::key\_eq

```rust
pub fn key_eq(self: TypePredicateNode, object: <any>) -> bool;
```
## TypePredicateNode::to\_set

```rust
pub fn to_set(self: TypePredicateNode) -> *TypePredicateNode;
```
