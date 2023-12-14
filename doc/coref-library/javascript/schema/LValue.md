# LValue

Primary key: `id: int`

```rust
schema LValue {
  @primary id: int,
}
```
## LValue::getRefName

```rust
/**
     * Get the name of this RefExpr.
     */
```
```rust
pub fn getRefName(self: LValue) -> string;
```
## LValue::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: LValue, level: int) -> Node;
```
## LValue::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: LValue) -> string;
```
## LValue::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: LValue, i: int) -> Modifier;
```
## LValue::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: LValue) -> *Decorator;
```
## LValue::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: LValue) -> Symbol;
```
## LValue::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: LValue) -> *Comment;
```
## LValue::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: LValue) -> *Node;
```
## LValue::hasSymbol

```rust
/**
     * Determine whether this RefExpr has symbol.
     */
```
```rust
pub fn hasSymbol(self: LValue) -> bool;
```
## LValue::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: LValue) -> File;
```
## LValue::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: LValue) -> Node;
```
## LValue::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: LValue) -> *Node;
```
## LValue::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: LValue, i: int) -> Decorator;
```
## LValue::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: LValue) -> TopLevelDO;
```
## LValue::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: LValue) -> int;
```
## LValue::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: LValue, i: int) -> Node;
```
## LValue::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LValue) -> int;
```
## LValue::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LValue) -> int;
```
## LValue::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: LValue) -> int;
```
## LValue::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: LValue) -> *Modifier;
```
## LValue::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LValue) -> *FunctionLikeDeclaration;
```
## LValue::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: LValue, level: int) -> *Node;
```
## LValue::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LValue) -> int;
```
## LValue::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: LValue) -> string;
```
## LValue::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: LValue) -> *Comment;
```
## LValue::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: LValue) -> *Comment;
```
## LValue::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: LValue) -> Node;
```
## LValue::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: LValue) -> FunctionLikeDeclaration;
```
## LValue::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LValue) -> int;
```
## LValue::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: LValue) -> int;
```
## LValue::getIndex

```rust
pub fn getIndex(self: LValue) -> int;
```
## LValue::getDefNode

```rust
/**
     * Get the defination node in cfg.
     */
```
```rust
pub fn getDefNode(self: LValue) -> ControlFlowNode;
```
## LValue::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: LValue) -> *Node;
```
## LValue::getRhs

```rust
/**
     * Get the source of the expression that is written to this LValue.
     */
```
```rust
pub fn getRhs(self: LValue) -> Expression;
```
## LValue::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: LValue) -> Location;
```
## LValue::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *LValue;
```
## LValue::is\<T\>

```rust
pub fn is<T>(self: LValue) -> bool;
```
## LValue::to\<T\>

```rust
pub fn to<T>(self: LValue) -> <any>;
```
## LValue::key\_neq

```rust
pub fn key_neq(self: LValue, object: <any>) -> bool;
```
## LValue::key\_eq

```rust
pub fn key_eq(self: LValue, object: <any>) -> bool;
```
## LValue::to\_set

```rust
pub fn to_set(self: LValue) -> *LValue;
```
