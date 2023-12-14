# ConstructorTypeNode

Primary key: `id: int`

```rust
schema ConstructorTypeNode {
  @primary id: int,
}
```
## ConstructorTypeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ConstructorTypeNode) -> Location;
```
## ConstructorTypeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ConstructorTypeNode) -> Symbol;
```
## ConstructorTypeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ConstructorTypeNode) -> *Decorator;
```
## ConstructorTypeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ConstructorTypeNode) -> string;
```
## ConstructorTypeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ConstructorTypeNode, i: int) -> Modifier;
```
## ConstructorTypeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ConstructorTypeNode) -> *Comment;
```
## ConstructorTypeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ConstructorTypeNode) -> *Node;
```
## ConstructorTypeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ConstructorTypeNode) -> *Node;
```
## ConstructorTypeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ConstructorTypeNode) -> Node;
```
## ConstructorTypeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ConstructorTypeNode) -> int;
```
## ConstructorTypeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ConstructorTypeNode) -> TopLevelDO;
```
## ConstructorTypeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ConstructorTypeNode, i: int) -> Decorator;
```
## ConstructorTypeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ConstructorTypeNode) -> int;
```
## ConstructorTypeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ConstructorTypeNode) -> *Modifier;
```
## ConstructorTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ConstructorTypeNode) -> int;
```
## ConstructorTypeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ConstructorTypeNode, i: int) -> Node;
```
## ConstructorTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ConstructorTypeNode) -> int;
```
## ConstructorTypeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ConstructorTypeNode) -> *FunctionLikeDeclaration;
```
## ConstructorTypeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ConstructorTypeNode, level: int) -> *Node;
```
## ConstructorTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ConstructorTypeNode) -> int;
```
## ConstructorTypeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ConstructorTypeNode) -> string;
```
## ConstructorTypeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ConstructorTypeNode, level: int) -> Node;
```
## ConstructorTypeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ConstructorTypeNode) -> File;
```
## ConstructorTypeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ConstructorTypeNode) -> *Comment;
```
## ConstructorTypeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ConstructorTypeNode) -> *Comment;
```
## ConstructorTypeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ConstructorTypeNode) -> Node;
```
## ConstructorTypeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ConstructorTypeNode) -> FunctionLikeDeclaration;
```
## ConstructorTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ConstructorTypeNode) -> int;
```
## ConstructorTypeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ConstructorTypeNode) -> int;
```
## ConstructorTypeNode::getIndex

```rust
pub fn getIndex(self: ConstructorTypeNode) -> int;
```
## ConstructorTypeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ConstructorTypeNode) -> *Node;
```
## ConstructorTypeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ConstructorTypeNode;
```
## ConstructorTypeNode::is\<T\>

```rust
pub fn is<T>(self: ConstructorTypeNode) -> bool;
```
## ConstructorTypeNode::to\<T\>

```rust
pub fn to<T>(self: ConstructorTypeNode) -> <any>;
```
## ConstructorTypeNode::key\_neq

```rust
pub fn key_neq(self: ConstructorTypeNode, object: <any>) -> bool;
```
## ConstructorTypeNode::key\_eq

```rust
pub fn key_eq(self: ConstructorTypeNode, object: <any>) -> bool;
```
## ConstructorTypeNode::to\_set

```rust
pub fn to_set(self: ConstructorTypeNode) -> *ConstructorTypeNode;
```
