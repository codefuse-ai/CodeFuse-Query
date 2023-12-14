# KeywordTypeNode

Primary key: `id: int`

```rust
schema KeywordTypeNode {
  @primary id: int,
}
```
## KeywordTypeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: KeywordTypeNode) -> Location;
```
## KeywordTypeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: KeywordTypeNode) -> Symbol;
```
## KeywordTypeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: KeywordTypeNode) -> *Decorator;
```
## KeywordTypeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: KeywordTypeNode) -> string;
```
## KeywordTypeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: KeywordTypeNode, i: int) -> Modifier;
```
## KeywordTypeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: KeywordTypeNode) -> *Comment;
```
## KeywordTypeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: KeywordTypeNode) -> *Node;
```
## KeywordTypeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: KeywordTypeNode) -> *Node;
```
## KeywordTypeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: KeywordTypeNode) -> Node;
```
## KeywordTypeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: KeywordTypeNode) -> int;
```
## KeywordTypeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: KeywordTypeNode) -> TopLevelDO;
```
## KeywordTypeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: KeywordTypeNode, i: int) -> Decorator;
```
## KeywordTypeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: KeywordTypeNode) -> int;
```
## KeywordTypeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: KeywordTypeNode) -> *Modifier;
```
## KeywordTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: KeywordTypeNode) -> int;
```
## KeywordTypeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: KeywordTypeNode, i: int) -> Node;
```
## KeywordTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: KeywordTypeNode) -> int;
```
## KeywordTypeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: KeywordTypeNode) -> *FunctionLikeDeclaration;
```
## KeywordTypeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: KeywordTypeNode, level: int) -> *Node;
```
## KeywordTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: KeywordTypeNode) -> int;
```
## KeywordTypeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: KeywordTypeNode) -> string;
```
## KeywordTypeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: KeywordTypeNode, level: int) -> Node;
```
## KeywordTypeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: KeywordTypeNode) -> File;
```
## KeywordTypeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: KeywordTypeNode) -> *Comment;
```
## KeywordTypeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: KeywordTypeNode) -> *Comment;
```
## KeywordTypeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: KeywordTypeNode) -> Node;
```
## KeywordTypeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: KeywordTypeNode) -> FunctionLikeDeclaration;
```
## KeywordTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: KeywordTypeNode) -> int;
```
## KeywordTypeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: KeywordTypeNode) -> int;
```
## KeywordTypeNode::getIndex

```rust
pub fn getIndex(self: KeywordTypeNode) -> int;
```
## KeywordTypeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: KeywordTypeNode) -> *Node;
```
## KeywordTypeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *KeywordTypeNode;
```
## KeywordTypeNode::is\<T\>

```rust
pub fn is<T>(self: KeywordTypeNode) -> bool;
```
## KeywordTypeNode::to\<T\>

```rust
pub fn to<T>(self: KeywordTypeNode) -> <any>;
```
## KeywordTypeNode::key\_neq

```rust
pub fn key_neq(self: KeywordTypeNode, object: <any>) -> bool;
```
## KeywordTypeNode::key\_eq

```rust
pub fn key_eq(self: KeywordTypeNode, object: <any>) -> bool;
```
## KeywordTypeNode::to\_set

```rust
pub fn to_set(self: KeywordTypeNode) -> *KeywordTypeNode;
```
