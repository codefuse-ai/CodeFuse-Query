# QuestionQuestionEqualsToken

Primary key: `id: int`

```rust
schema QuestionQuestionEqualsToken {
  @primary id: int,
}
```
## QuestionQuestionEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: QuestionQuestionEqualsToken) -> Location;
```
## QuestionQuestionEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: QuestionQuestionEqualsToken) -> Symbol;
```
## QuestionQuestionEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: QuestionQuestionEqualsToken) -> *Decorator;
```
## QuestionQuestionEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: QuestionQuestionEqualsToken) -> string;
```
## QuestionQuestionEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: QuestionQuestionEqualsToken, i: int) -> Modifier;
```
## QuestionQuestionEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: QuestionQuestionEqualsToken) -> *Comment;
```
## QuestionQuestionEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: QuestionQuestionEqualsToken) -> *Node;
```
## QuestionQuestionEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: QuestionQuestionEqualsToken) -> *Node;
```
## QuestionQuestionEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: QuestionQuestionEqualsToken) -> Node;
```
## QuestionQuestionEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: QuestionQuestionEqualsToken) -> int;
```
## QuestionQuestionEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: QuestionQuestionEqualsToken) -> TopLevelDO;
```
## QuestionQuestionEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: QuestionQuestionEqualsToken, i: int) -> Decorator;
```
## QuestionQuestionEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: QuestionQuestionEqualsToken) -> int;
```
## QuestionQuestionEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: QuestionQuestionEqualsToken) -> *Modifier;
```
## QuestionQuestionEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: QuestionQuestionEqualsToken) -> int;
```
## QuestionQuestionEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: QuestionQuestionEqualsToken, i: int) -> Node;
```
## QuestionQuestionEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: QuestionQuestionEqualsToken) -> int;
```
## QuestionQuestionEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: QuestionQuestionEqualsToken) -> *FunctionLikeDeclaration;
```
## QuestionQuestionEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: QuestionQuestionEqualsToken, level: int) -> *Node;
```
## QuestionQuestionEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: QuestionQuestionEqualsToken) -> int;
```
## QuestionQuestionEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: QuestionQuestionEqualsToken) -> string;
```
## QuestionQuestionEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: QuestionQuestionEqualsToken, level: int) -> Node;
```
## QuestionQuestionEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: QuestionQuestionEqualsToken) -> File;
```
## QuestionQuestionEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: QuestionQuestionEqualsToken) -> *Comment;
```
## QuestionQuestionEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: QuestionQuestionEqualsToken) -> *Comment;
```
## QuestionQuestionEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: QuestionQuestionEqualsToken) -> Node;
```
## QuestionQuestionEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: QuestionQuestionEqualsToken) -> FunctionLikeDeclaration;
```
## QuestionQuestionEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: QuestionQuestionEqualsToken) -> int;
```
## QuestionQuestionEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: QuestionQuestionEqualsToken) -> int;
```
## QuestionQuestionEqualsToken::getIndex

```rust
pub fn getIndex(self: QuestionQuestionEqualsToken) -> int;
```
## QuestionQuestionEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: QuestionQuestionEqualsToken) -> *Node;
```
## QuestionQuestionEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *QuestionQuestionEqualsToken;
```
## QuestionQuestionEqualsToken::is\<T\>

```rust
pub fn is<T>(self: QuestionQuestionEqualsToken) -> bool;
```
## QuestionQuestionEqualsToken::to\<T\>

```rust
pub fn to<T>(self: QuestionQuestionEqualsToken) -> <any>;
```
## QuestionQuestionEqualsToken::key\_neq

```rust
pub fn key_neq(self: QuestionQuestionEqualsToken, object: <any>) -> bool;
```
## QuestionQuestionEqualsToken::key\_eq

```rust
pub fn key_eq(self: QuestionQuestionEqualsToken, object: <any>) -> bool;
```
## QuestionQuestionEqualsToken::to\_set

```rust
pub fn to_set(self: QuestionQuestionEqualsToken) -> *QuestionQuestionEqualsToken;
```
