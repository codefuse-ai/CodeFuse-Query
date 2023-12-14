# LiteralTypeNode

Primary key: `id: int`

```rust
schema LiteralTypeNode {
  @primary id: int,
}
```
## LiteralTypeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: LiteralTypeNode) -> Location;
```
## LiteralTypeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: LiteralTypeNode) -> Symbol;
```
## LiteralTypeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: LiteralTypeNode) -> *Decorator;
```
## LiteralTypeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: LiteralTypeNode) -> string;
```
## LiteralTypeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: LiteralTypeNode, i: int) -> Modifier;
```
## LiteralTypeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: LiteralTypeNode) -> *Comment;
```
## LiteralTypeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: LiteralTypeNode) -> *Node;
```
## LiteralTypeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: LiteralTypeNode) -> *Node;
```
## LiteralTypeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: LiteralTypeNode) -> Node;
```
## LiteralTypeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: LiteralTypeNode) -> int;
```
## LiteralTypeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: LiteralTypeNode) -> TopLevelDO;
```
## LiteralTypeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: LiteralTypeNode, i: int) -> Decorator;
```
## LiteralTypeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: LiteralTypeNode) -> int;
```
## LiteralTypeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: LiteralTypeNode) -> *Modifier;
```
## LiteralTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LiteralTypeNode) -> int;
```
## LiteralTypeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: LiteralTypeNode, i: int) -> Node;
```
## LiteralTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LiteralTypeNode) -> int;
```
## LiteralTypeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LiteralTypeNode) -> *FunctionLikeDeclaration;
```
## LiteralTypeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: LiteralTypeNode, level: int) -> *Node;
```
## LiteralTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LiteralTypeNode) -> int;
```
## LiteralTypeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: LiteralTypeNode) -> string;
```
## LiteralTypeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: LiteralTypeNode, level: int) -> Node;
```
## LiteralTypeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: LiteralTypeNode) -> File;
```
## LiteralTypeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: LiteralTypeNode) -> *Comment;
```
## LiteralTypeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: LiteralTypeNode) -> *Comment;
```
## LiteralTypeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: LiteralTypeNode) -> Node;
```
## LiteralTypeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: LiteralTypeNode) -> FunctionLikeDeclaration;
```
## LiteralTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LiteralTypeNode) -> int;
```
## LiteralTypeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: LiteralTypeNode) -> int;
```
## LiteralTypeNode::getIndex

```rust
pub fn getIndex(self: LiteralTypeNode) -> int;
```
## LiteralTypeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: LiteralTypeNode) -> *Node;
```
## LiteralTypeNode::getLiteral

```rust
pub fn getLiteral(self: LiteralTypeNode) -> Node;
```
## LiteralTypeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *LiteralTypeNode;
```
## LiteralTypeNode::is\<T\>

```rust
pub fn is<T>(self: LiteralTypeNode) -> bool;
```
## LiteralTypeNode::to\<T\>

```rust
pub fn to<T>(self: LiteralTypeNode) -> <any>;
```
## LiteralTypeNode::key\_neq

```rust
pub fn key_neq(self: LiteralTypeNode, object: <any>) -> bool;
```
## LiteralTypeNode::key\_eq

```rust
pub fn key_eq(self: LiteralTypeNode, object: <any>) -> bool;
```
## LiteralTypeNode::to\_set

```rust
pub fn to_set(self: LiteralTypeNode) -> *LiteralTypeNode;
```
