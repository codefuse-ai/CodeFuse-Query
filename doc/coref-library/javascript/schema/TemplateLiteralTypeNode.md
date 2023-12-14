# TemplateLiteralTypeNode

Primary key: `id: int`

```rust
schema TemplateLiteralTypeNode {
  @primary id: int,
}
```
## TemplateLiteralTypeNode::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TemplateLiteralTypeNode) -> Location;
```
## TemplateLiteralTypeNode::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TemplateLiteralTypeNode) -> string;
```
## TemplateLiteralTypeNode::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TemplateLiteralTypeNode, i: int) -> Modifier;
```
## TemplateLiteralTypeNode::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TemplateLiteralTypeNode) -> *Comment;
```
## TemplateLiteralTypeNode::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TemplateLiteralTypeNode) -> *Node;
```
## TemplateLiteralTypeNode::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TemplateLiteralTypeNode) -> *Node;
```
## TemplateLiteralTypeNode::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TemplateLiteralTypeNode) -> Node;
```
## TemplateLiteralTypeNode::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TemplateLiteralTypeNode) -> *Comment;
```
## TemplateLiteralTypeNode::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TemplateLiteralTypeNode) -> *Comment;
```
## TemplateLiteralTypeNode::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TemplateLiteralTypeNode) -> int;
```
## TemplateLiteralTypeNode::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TemplateLiteralTypeNode, i: int) -> Decorator;
```
## TemplateLiteralTypeNode::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TemplateLiteralTypeNode) -> TopLevelDO;
```
## TemplateLiteralTypeNode::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TemplateLiteralTypeNode) -> int;
```
## TemplateLiteralTypeNode::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TemplateLiteralTypeNode) -> *Modifier;
```
## TemplateLiteralTypeNode::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateLiteralTypeNode) -> int;
```
## TemplateLiteralTypeNode::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TemplateLiteralTypeNode, i: int) -> Node;
```
## TemplateLiteralTypeNode::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateLiteralTypeNode) -> int;
```
## TemplateLiteralTypeNode::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TemplateLiteralTypeNode, level: int) -> *Node;
```
## TemplateLiteralTypeNode::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateLiteralTypeNode) -> *FunctionLikeDeclaration;
```
## TemplateLiteralTypeNode::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TemplateLiteralTypeNode, level: int) -> Node;
```
## TemplateLiteralTypeNode::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TemplateLiteralTypeNode) -> File;
```
## TemplateLiteralTypeNode::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TemplateLiteralTypeNode) -> Node;
```
## TemplateLiteralTypeNode::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TemplateLiteralTypeNode) -> FunctionLikeDeclaration;
```
## TemplateLiteralTypeNode::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateLiteralTypeNode) -> int;
```
## TemplateLiteralTypeNode::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TemplateLiteralTypeNode) -> int;
```
## TemplateLiteralTypeNode::getIndex

```rust
pub fn getIndex(self: TemplateLiteralTypeNode) -> int;
```
## TemplateLiteralTypeNode::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateLiteralTypeNode;
```
## TemplateLiteralTypeNode::getTemplateSpan

```rust
pub fn getTemplateSpan(self: TemplateLiteralTypeNode, i: int) -> TemplateLiteralTypeSpan;
```
## TemplateLiteralTypeNode::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateLiteralTypeNode) -> int;
```
## TemplateLiteralTypeNode::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TemplateLiteralTypeNode) -> string;
```
## TemplateLiteralTypeNode::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TemplateLiteralTypeNode) -> Symbol;
```
## TemplateLiteralTypeNode::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TemplateLiteralTypeNode) -> *Decorator;
```
## TemplateLiteralTypeNode::getHead

```rust
pub fn getHead(self: TemplateLiteralTypeNode) -> TemplateHead;
```
## TemplateLiteralTypeNode::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TemplateLiteralTypeNode) -> *Node;
```
## TemplateLiteralTypeNode::getATemplateSpan

```rust
pub fn getATemplateSpan(self: TemplateLiteralTypeNode) -> *TemplateLiteralTypeSpan;
```
## TemplateLiteralTypeNode::is\<T\>

```rust
pub fn is<T>(self: TemplateLiteralTypeNode) -> bool;
```
## TemplateLiteralTypeNode::to\<T\>

```rust
pub fn to<T>(self: TemplateLiteralTypeNode) -> <any>;
```
## TemplateLiteralTypeNode::key\_neq

```rust
pub fn key_neq(self: TemplateLiteralTypeNode, object: <any>) -> bool;
```
## TemplateLiteralTypeNode::key\_eq

```rust
pub fn key_eq(self: TemplateLiteralTypeNode, object: <any>) -> bool;
```
## TemplateLiteralTypeNode::to\_set

```rust
pub fn to_set(self: TemplateLiteralTypeNode) -> *TemplateLiteralTypeNode;
```
