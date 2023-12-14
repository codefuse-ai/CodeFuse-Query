# HeritageClause

Primary key: `id: int`

```rust
schema HeritageClause {
  @primary id: int,
}
```
## HeritageClause::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: HeritageClause) -> *Node;
```
## HeritageClause::getIndex

```rust
pub fn getIndex(self: HeritageClause) -> int;
```
## HeritageClause::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: HeritageClause) -> int;
```
## HeritageClause::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: HeritageClause) -> int;
```
## HeritageClause::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: HeritageClause) -> Node;
```
## HeritageClause::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: HeritageClause) -> FunctionLikeDeclaration;
```
## HeritageClause::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: HeritageClause, level: int) -> Node;
```
## HeritageClause::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: HeritageClause) -> string;
```
## HeritageClause::getEndLineNumber

```rust
pub fn getEndLineNumber(self: HeritageClause) -> int;
```
## HeritageClause::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: HeritageClause) -> Location;
```
## HeritageClause::getStartLineNumber

```rust
pub fn getStartLineNumber(self: HeritageClause) -> int;
```
## HeritageClause::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: HeritageClause) -> *FunctionLikeDeclaration;
```
## HeritageClause::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: HeritageClause, level: int) -> *Node;
```
## HeritageClause::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: HeritageClause) -> int;
```
## HeritageClause::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: HeritageClause) -> *Modifier;
```
## HeritageClause::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: HeritageClause) -> int;
```
## HeritageClause::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: HeritageClause, i: int) -> Node;
```
## HeritageClause::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: HeritageClause) -> int;
```
## HeritageClause::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: HeritageClause) -> TopLevelDO;
```
## HeritageClause::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: HeritageClause, i: int) -> Decorator;
```
## HeritageClause::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: HeritageClause) -> *Node;
```
## HeritageClause::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: HeritageClause) -> Node;
```
## HeritageClause::getAType

```rust
pub fn getAType(self: HeritageClause) -> *ExpressionWithTypeArguments;
```
## HeritageClause::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: HeritageClause) -> *Comment;
```
## HeritageClause::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: HeritageClause) -> *Comment;
```
## HeritageClause::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: HeritageClause, i: int) -> Modifier;
```
## HeritageClause::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: HeritageClause) -> string;
```
## HeritageClause::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: HeritageClause) -> Symbol;
```
## HeritageClause::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: HeritageClause) -> *Decorator;
```
## HeritageClause::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *HeritageClause;
```
## HeritageClause::getType

```rust
pub fn getType(self: HeritageClause, i: int) -> ExpressionWithTypeArguments;
```
## HeritageClause::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: HeritageClause) -> *Node;
```
## HeritageClause::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: HeritageClause) -> *Comment;
```
## HeritageClause::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: HeritageClause) -> File;
```
## HeritageClause::getToken

```rust
pub fn getToken(self: HeritageClause) -> HeritageToken;
```
## HeritageClause::is\<T\>

```rust
pub fn is<T>(self: HeritageClause) -> bool;
```
## HeritageClause::to\<T\>

```rust
pub fn to<T>(self: HeritageClause) -> <any>;
```
## HeritageClause::key\_neq

```rust
pub fn key_neq(self: HeritageClause, object: <any>) -> bool;
```
## HeritageClause::key\_eq

```rust
pub fn key_eq(self: HeritageClause, object: <any>) -> bool;
```
## HeritageClause::to\_set

```rust
pub fn to_set(self: HeritageClause) -> *HeritageClause;
```
