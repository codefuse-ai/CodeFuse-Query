# ForStatement

Primary key: `id: int`

```rust
schema ForStatement {
  @primary id: int,
}
```
## ForStatement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ForStatement) -> Location;
```
## ForStatement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ForStatement) -> Symbol;
```
## ForStatement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ForStatement) -> *Decorator;
```
## ForStatement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ForStatement) -> string;
```
## ForStatement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ForStatement, i: int) -> Modifier;
```
## ForStatement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ForStatement) -> *Comment;
```
## ForStatement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ForStatement) -> *Node;
```
## ForStatement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ForStatement) -> *Node;
```
## ForStatement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ForStatement) -> Node;
```
## ForStatement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ForStatement) -> *Comment;
```
## ForStatement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ForStatement) -> *Comment;
```
## ForStatement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ForStatement) -> int;
```
## ForStatement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ForStatement) -> TopLevelDO;
```
## ForStatement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ForStatement, i: int) -> Decorator;
```
## ForStatement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ForStatement, i: int) -> Node;
```
## ForStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ForStatement) -> int;
```
## ForStatement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ForStatement) -> int;
```
## ForStatement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ForStatement) -> *Modifier;
```
## ForStatement::getBody

```rust
/** 
     * Gets the body of this `for` loop.
     */
```
```rust
pub fn getBody(self: ForStatement) -> Statement;
```
## ForStatement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ForStatement) -> *FunctionLikeDeclaration;
```
## ForStatement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ForStatement, level: int) -> *Node;
```
## ForStatement::getInitializer

```rust
/** 
     * Gets the Initializer of this `for` loop.
     */
```
```rust
pub fn getInitializer(self: ForStatement) -> ForInitializer;
```
## ForStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ForStatement) -> int;
```
## ForStatement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ForStatement) -> string;
```
## ForStatement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ForStatement, level: int) -> Node;
```
## ForStatement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ForStatement) -> File;
```
## ForStatement::hasCondition

```rust
/**
     * Determine this ForStatement has condition expr.
     */
```
```rust
pub fn hasCondition(self: ForStatement) -> bool;
```
## ForStatement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ForStatement) -> FunctionLikeDeclaration;
```
## ForStatement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ForStatement) -> Node;
```
## ForStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ForStatement) -> int;
```
## ForStatement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ForStatement) -> int;
```
## ForStatement::getIndex

```rust
pub fn getIndex(self: ForStatement) -> int;
```
## ForStatement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ForStatement) -> *Node;
```
## ForStatement::hasIncrementor

```rust
/**
     * Determine this ForStatement has incrementor expr.
     */
```
```rust
pub fn hasIncrementor(self: ForStatement) -> bool;
```
## ForStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ForStatement) -> int;
```
## ForStatement::getCondition

```rust
/** 
     * Gets the boolean condition of this `for` loop.
     */
```
```rust
pub fn getCondition(self: ForStatement) -> Expression;
```
## ForStatement::getIncrementor

```rust
/** 
     * Gets the incrementor of this `for` loop.
    */
```
```rust
pub fn getIncrementor(self: ForStatement) -> Expression;
```
## ForStatement::hasInitializer

```rust
/**
     * Determine this ForStatement has initializer expr.
     */
```
```rust
pub fn hasInitializer(self: ForStatement) -> bool;
```
## ForStatement::getInitializerIndex

```rust
/**
     * Gets the initializer index of this for loop.
     */
```
```rust
pub fn getInitializerIndex(self: ForStatement) -> int;
```
## ForStatement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ForStatement;
```
## ForStatement::is\<T\>

```rust
pub fn is<T>(self: ForStatement) -> bool;
```
## ForStatement::to\<T\>

```rust
pub fn to<T>(self: ForStatement) -> <any>;
```
## ForStatement::key\_neq

```rust
pub fn key_neq(self: ForStatement, object: <any>) -> bool;
```
## ForStatement::key\_eq

```rust
pub fn key_eq(self: ForStatement, object: <any>) -> bool;
```
## ForStatement::to\_set

```rust
pub fn to_set(self: ForStatement) -> *ForStatement;
```
