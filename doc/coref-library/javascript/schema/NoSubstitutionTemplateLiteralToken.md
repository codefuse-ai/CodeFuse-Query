# NoSubstitutionTemplateLiteralToken

Primary key: `id: int`

```rust
schema NoSubstitutionTemplateLiteralToken {
  @primary id: int,
}
```
## NoSubstitutionTemplateLiteralToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NoSubstitutionTemplateLiteralToken) -> Location;
```
## NoSubstitutionTemplateLiteralToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NoSubstitutionTemplateLiteralToken) -> Symbol;
```
## NoSubstitutionTemplateLiteralToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NoSubstitutionTemplateLiteralToken) -> *Decorator;
```
## NoSubstitutionTemplateLiteralToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NoSubstitutionTemplateLiteralToken) -> string;
```
## NoSubstitutionTemplateLiteralToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NoSubstitutionTemplateLiteralToken, i: int) -> Modifier;
```
## NoSubstitutionTemplateLiteralToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NoSubstitutionTemplateLiteralToken) -> *Comment;
```
## NoSubstitutionTemplateLiteralToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NoSubstitutionTemplateLiteralToken) -> *Node;
```
## NoSubstitutionTemplateLiteralToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NoSubstitutionTemplateLiteralToken) -> *Node;
```
## NoSubstitutionTemplateLiteralToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NoSubstitutionTemplateLiteralToken) -> Node;
```
## NoSubstitutionTemplateLiteralToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NoSubstitutionTemplateLiteralToken) -> int;
```
## NoSubstitutionTemplateLiteralToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NoSubstitutionTemplateLiteralToken) -> TopLevelDO;
```
## NoSubstitutionTemplateLiteralToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NoSubstitutionTemplateLiteralToken, i: int) -> Decorator;
```
## NoSubstitutionTemplateLiteralToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NoSubstitutionTemplateLiteralToken) -> int;
```
## NoSubstitutionTemplateLiteralToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NoSubstitutionTemplateLiteralToken) -> *Modifier;
```
## NoSubstitutionTemplateLiteralToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NoSubstitutionTemplateLiteralToken) -> int;
```
## NoSubstitutionTemplateLiteralToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NoSubstitutionTemplateLiteralToken, i: int) -> Node;
```
## NoSubstitutionTemplateLiteralToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NoSubstitutionTemplateLiteralToken) -> int;
```
## NoSubstitutionTemplateLiteralToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NoSubstitutionTemplateLiteralToken) -> *FunctionLikeDeclaration;
```
## NoSubstitutionTemplateLiteralToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NoSubstitutionTemplateLiteralToken, level: int) -> *Node;
```
## NoSubstitutionTemplateLiteralToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NoSubstitutionTemplateLiteralToken) -> int;
```
## NoSubstitutionTemplateLiteralToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NoSubstitutionTemplateLiteralToken) -> string;
```
## NoSubstitutionTemplateLiteralToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NoSubstitutionTemplateLiteralToken, level: int) -> Node;
```
## NoSubstitutionTemplateLiteralToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NoSubstitutionTemplateLiteralToken) -> File;
```
## NoSubstitutionTemplateLiteralToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NoSubstitutionTemplateLiteralToken) -> *Comment;
```
## NoSubstitutionTemplateLiteralToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NoSubstitutionTemplateLiteralToken) -> *Comment;
```
## NoSubstitutionTemplateLiteralToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NoSubstitutionTemplateLiteralToken) -> Node;
```
## NoSubstitutionTemplateLiteralToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NoSubstitutionTemplateLiteralToken) -> FunctionLikeDeclaration;
```
## NoSubstitutionTemplateLiteralToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NoSubstitutionTemplateLiteralToken) -> int;
```
## NoSubstitutionTemplateLiteralToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NoSubstitutionTemplateLiteralToken) -> int;
```
## NoSubstitutionTemplateLiteralToken::getIndex

```rust
pub fn getIndex(self: NoSubstitutionTemplateLiteralToken) -> int;
```
## NoSubstitutionTemplateLiteralToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NoSubstitutionTemplateLiteralToken) -> *Node;
```
## NoSubstitutionTemplateLiteralToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NoSubstitutionTemplateLiteralToken;
```
## NoSubstitutionTemplateLiteralToken::is\<T\>

```rust
pub fn is<T>(self: NoSubstitutionTemplateLiteralToken) -> bool;
```
## NoSubstitutionTemplateLiteralToken::to\<T\>

```rust
pub fn to<T>(self: NoSubstitutionTemplateLiteralToken) -> <any>;
```
## NoSubstitutionTemplateLiteralToken::key\_neq

```rust
pub fn key_neq(self: NoSubstitutionTemplateLiteralToken, object: <any>) -> bool;
```
## NoSubstitutionTemplateLiteralToken::key\_eq

```rust
pub fn key_eq(self: NoSubstitutionTemplateLiteralToken, object: <any>) -> bool;
```
## NoSubstitutionTemplateLiteralToken::to\_set

```rust
pub fn to_set(self: NoSubstitutionTemplateLiteralToken) -> *NoSubstitutionTemplateLiteralToken;
```
