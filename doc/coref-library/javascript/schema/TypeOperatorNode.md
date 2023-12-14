# TypeOperatorNode

Primary key: `id: int`

```rust
schema TypeOperatorNode {
  @primary id: int,
}
```
## TypeOperatorNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TypeOperatorNode) -> Symbol;
```
## TypeOperatorNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TypeOperatorNode) -> *Decorator;
```
## TypeOperatorNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TypeOperatorNode) -> string;
```
## TypeOperatorNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TypeOperatorNode, i: int) -> Modifier;
```
## TypeOperatorNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TypeOperatorNode) -> *Comment;
```
## TypeOperatorNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TypeOperatorNode) -> *Node;
```
## TypeOperatorNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TypeOperatorNode) -> *Node;
```
## TypeOperatorNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TypeOperatorNode) -> Node;
```
## TypeOperatorNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TypeOperatorNode) -> *Comment;
```
## TypeOperatorNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TypeOperatorNode) -> *Comment;
```
## TypeOperatorNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TypeOperatorNode) -> int;
```
## TypeOperatorNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TypeOperatorNode) -> TopLevelDO;
```
## TypeOperatorNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TypeOperatorNode, i: int) -> Decorator;
```
## TypeOperatorNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TypeOperatorNode) -> int;
```
## TypeOperatorNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TypeOperatorNode) -> *Modifier;
```
## TypeOperatorNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TypeOperatorNode) -> int;
```
## TypeOperatorNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TypeOperatorNode, i: int) -> Node;
```
## TypeOperatorNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TypeOperatorNode) -> int;
```
## TypeOperatorNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TypeOperatorNode) -> *FunctionLikeDeclaration;
```
## TypeOperatorNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TypeOperatorNode, level: int) -> *Node;
```
## TypeOperatorNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TypeOperatorNode) -> int;
```
## TypeOperatorNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TypeOperatorNode) -> string;
```
## TypeOperatorNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TypeOperatorNode, level: int) -> Node;
```
## TypeOperatorNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TypeOperatorNode) -> File;
```
## TypeOperatorNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TypeOperatorNode) -> int;
```
## TypeOperatorNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TypeOperatorNode) -> FunctionLikeDeclaration;
```
## TypeOperatorNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TypeOperatorNode) -> Node;
```
## TypeOperatorNode::getIndex

```rust
pub fn getIndex(self: TypeOperatorNode) -> int;
```
## TypeOperatorNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TypeOperatorNode) -> Location;
```
## TypeOperatorNode::getOperator

```rust
pub fn getOperator(self: TypeOperatorNode) -> KeywordToken;
```
## TypeOperatorNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TypeOperatorNode) -> *Node;
```
## TypeOperatorNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TypeOperatorNode;
```
## TypeOperatorNode::getType

```rust
pub fn getType(self: TypeOperatorNode) -> TypeNode;
```
## TypeOperatorNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TypeOperatorNode) -> int;
```
## TypeOperatorNode::is\<T\>

```rust
pub fn is<T>(self: TypeOperatorNode) -> bool;
```
## TypeOperatorNode::to\<T\>

```rust
pub fn to<T>(self: TypeOperatorNode) -> <any>;
```
## TypeOperatorNode::key\_neq

```rust
pub fn key_neq(self: TypeOperatorNode, object: <any>) -> bool;
```
## TypeOperatorNode::key\_eq

```rust
pub fn key_eq(self: TypeOperatorNode, object: <any>) -> bool;
```
## TypeOperatorNode::to\_set

```rust
pub fn to_set(self: TypeOperatorNode) -> *TypeOperatorNode;
```
