# ImportTypeNode

Primary key: `id: int`

```rust
schema ImportTypeNode {
  @primary id: int,
}
```
## ImportTypeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ImportTypeNode) -> *Node;
```
## ImportTypeNode::getIndex

```rust
pub fn getIndex(self: ImportTypeNode) -> int;
```
## ImportTypeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ImportTypeNode) -> int;
```
## ImportTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ImportTypeNode) -> int;
```
## ImportTypeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ImportTypeNode) -> FunctionLikeDeclaration;
```
## ImportTypeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ImportTypeNode) -> Node;
```
## ImportTypeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ImportTypeNode) -> *Comment;
```
## ImportTypeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ImportTypeNode) -> *Comment;
```
## ImportTypeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ImportTypeNode) -> File;
```
## ImportTypeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ImportTypeNode, level: int) -> Node;
```
## ImportTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ImportTypeNode) -> int;
```
## ImportTypeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ImportTypeNode) -> string;
```
## ImportTypeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ImportTypeNode) -> *FunctionLikeDeclaration;
```
## ImportTypeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ImportTypeNode, level: int) -> *Node;
```
## ImportTypeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ImportTypeNode) -> int;
```
## ImportTypeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ImportTypeNode) -> *Modifier;
```
## ImportTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ImportTypeNode) -> int;
```
## ImportTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ImportTypeNode) -> int;
```
## ImportTypeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ImportTypeNode, i: int) -> Node;
```
## ImportTypeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ImportTypeNode, i: int) -> Decorator;
```
## ImportTypeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ImportTypeNode) -> TopLevelDO;
```
## ImportTypeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ImportTypeNode) -> int;
```
## ImportTypeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ImportTypeNode) -> Node;
```
## ImportTypeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ImportTypeNode) -> *Node;
```
## ImportTypeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ImportTypeNode) -> *Node;
```
## ImportTypeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ImportTypeNode) -> *Comment;
```
## ImportTypeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ImportTypeNode) -> Symbol;
```
## ImportTypeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ImportTypeNode) -> *Decorator;
```
## ImportTypeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ImportTypeNode, i: int) -> Modifier;
```
## ImportTypeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ImportTypeNode) -> string;
```
## ImportTypeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ImportTypeNode;
```
## ImportTypeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ImportTypeNode) -> Location;
```
## ImportTypeNode::is\<T\>

```rust
pub fn is<T>(self: ImportTypeNode) -> bool;
```
## ImportTypeNode::to\<T\>

```rust
pub fn to<T>(self: ImportTypeNode) -> <any>;
```
## ImportTypeNode::key\_neq

```rust
pub fn key_neq(self: ImportTypeNode, object: <any>) -> bool;
```
## ImportTypeNode::key\_eq

```rust
pub fn key_eq(self: ImportTypeNode, object: <any>) -> bool;
```
## ImportTypeNode::to\_set

```rust
pub fn to_set(self: ImportTypeNode) -> *ImportTypeNode;
```
