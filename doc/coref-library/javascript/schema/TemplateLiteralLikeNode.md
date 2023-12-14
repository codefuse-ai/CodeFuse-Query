# TemplateLiteralLikeNode

Primary key: `id: int`

```rust
schema TemplateLiteralLikeNode {
  @primary id: int,
}
```
## TemplateLiteralLikeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TemplateLiteralLikeNode) -> *Node;
```
## TemplateLiteralLikeNode::getIndex

```rust
pub fn getIndex(self: TemplateLiteralLikeNode) -> int;
```
## TemplateLiteralLikeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TemplateLiteralLikeNode) -> int;
```
## TemplateLiteralLikeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateLiteralLikeNode) -> int;
```
## TemplateLiteralLikeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TemplateLiteralLikeNode) -> Node;
```
## TemplateLiteralLikeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TemplateLiteralLikeNode) -> FunctionLikeDeclaration;
```
## TemplateLiteralLikeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TemplateLiteralLikeNode) -> File;
```
## TemplateLiteralLikeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TemplateLiteralLikeNode, level: int) -> Node;
```
## TemplateLiteralLikeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TemplateLiteralLikeNode) -> string;
```
## TemplateLiteralLikeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateLiteralLikeNode) -> int;
```
## TemplateLiteralLikeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateLiteralLikeNode) -> *FunctionLikeDeclaration;
```
## TemplateLiteralLikeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TemplateLiteralLikeNode, level: int) -> *Node;
```
## TemplateLiteralLikeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateLiteralLikeNode) -> int;
```
## TemplateLiteralLikeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TemplateLiteralLikeNode, i: int) -> Node;
```
## TemplateLiteralLikeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateLiteralLikeNode) -> int;
```
## TemplateLiteralLikeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TemplateLiteralLikeNode) -> int;
```
## TemplateLiteralLikeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TemplateLiteralLikeNode) -> *Modifier;
```
## TemplateLiteralLikeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TemplateLiteralLikeNode) -> TopLevelDO;
```
## TemplateLiteralLikeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TemplateLiteralLikeNode, i: int) -> Decorator;
```
## TemplateLiteralLikeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TemplateLiteralLikeNode) -> int;
```
## TemplateLiteralLikeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TemplateLiteralLikeNode) -> *Comment;
```
## TemplateLiteralLikeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TemplateLiteralLikeNode) -> *Comment;
```
## TemplateLiteralLikeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TemplateLiteralLikeNode) -> Node;
```
## TemplateLiteralLikeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TemplateLiteralLikeNode) -> *Node;
```
## TemplateLiteralLikeNode::getValue

```rust
/**
     * Gets the value of this literal-like node, as a string.
     */
```
```rust
pub fn getValue(self: TemplateLiteralLikeNode) -> string;
```
## TemplateLiteralLikeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TemplateLiteralLikeNode) -> *Node;
```
## TemplateLiteralLikeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TemplateLiteralLikeNode) -> *Comment;
```
## TemplateLiteralLikeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TemplateLiteralLikeNode, i: int) -> Modifier;
```
## TemplateLiteralLikeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TemplateLiteralLikeNode) -> string;
```
## TemplateLiteralLikeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TemplateLiteralLikeNode) -> *Decorator;
```
## TemplateLiteralLikeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TemplateLiteralLikeNode) -> Symbol;
```
## TemplateLiteralLikeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TemplateLiteralLikeNode) -> Location;
```
## TemplateLiteralLikeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateLiteralLikeNode;
```
## TemplateLiteralLikeNode::is\<T\>

```rust
pub fn is<T>(self: TemplateLiteralLikeNode) -> bool;
```
## TemplateLiteralLikeNode::to\<T\>

```rust
pub fn to<T>(self: TemplateLiteralLikeNode) -> <any>;
```
## TemplateLiteralLikeNode::key\_neq

```rust
pub fn key_neq(self: TemplateLiteralLikeNode, object: <any>) -> bool;
```
## TemplateLiteralLikeNode::key\_eq

```rust
pub fn key_eq(self: TemplateLiteralLikeNode, object: <any>) -> bool;
```
## TemplateLiteralLikeNode::to\_set

```rust
pub fn to_set(self: TemplateLiteralLikeNode) -> *TemplateLiteralLikeNode;
```
