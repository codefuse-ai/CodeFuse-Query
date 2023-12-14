# PropertyDeclaration

Primary key: `id: int`

```rust
schema PropertyDeclaration {
  @primary id: int,
}
```
## PropertyDeclaration::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PropertyDeclaration) -> Location;
```
## PropertyDeclaration::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PropertyDeclaration) -> *Comment;
```
## PropertyDeclaration::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PropertyDeclaration) -> *Node;
```
## PropertyDeclaration::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PropertyDeclaration) -> *Node;
```
## PropertyDeclaration::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PropertyDeclaration) -> Node;
```
## PropertyDeclaration::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PropertyDeclaration) -> *Comment;
```
## PropertyDeclaration::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PropertyDeclaration) -> *Comment;
```
## PropertyDeclaration::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PropertyDeclaration, i: int) -> Node;
```
## PropertyDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getInitializer

```rust
/**
     * Gets the initializer expression.
     */
```
```rust
pub fn getInitializer(self: PropertyDeclaration) -> Expression;
```
## PropertyDeclaration::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PropertyDeclaration) -> string;
```
## PropertyDeclaration::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PropertyDeclaration, level: int) -> Node;
```
## PropertyDeclaration::getExclamationToken

```rust
/**
     * Gets the `!` token. (Optional)
     */
```
```rust
pub fn getExclamationToken(self: PropertyDeclaration) -> ExclamationToken;
```
## PropertyDeclaration::getNameNode

```rust
/**
     * Gets the name node, which is a PropertyName.
     */
```
```rust
pub fn getNameNode(self: PropertyDeclaration) -> PropertyName;
```
## PropertyDeclaration::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PropertyDeclaration) -> File;
```
## PropertyDeclaration::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PropertyDeclaration) -> FunctionLikeDeclaration;
```
## PropertyDeclaration::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PropertyDeclaration) -> Node;
```
## PropertyDeclaration::getNameNodeIndex

```rust
/**
     * Get the index of name node.
     */
```
```rust
pub fn getNameNodeIndex(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getModifierCount

```rust
/**
     * Gets the number of modifiers.
     */
```
```rust
pub fn getModifierCount(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getIndex

```rust
pub fn getIndex(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PropertyDeclaration) -> *Node;
```
## PropertyDeclaration::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PropertyDeclaration, level: int) -> *Node;
```
## PropertyDeclaration::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PropertyDeclaration) -> *FunctionLikeDeclaration;
```
## PropertyDeclaration::getDecoratorCount

```rust
/**
     * Gets the number of decorators.
     */
```
```rust
pub fn getDecoratorCount(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PropertyDeclaration) -> int;
```
## PropertyDeclaration::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PropertyDeclaration) -> *Modifier;
```
## PropertyDeclaration::getQuestionToken

```rust
/**
     * Gets the `?` token. (Optional)
     */
```
```rust
pub fn getQuestionToken(self: PropertyDeclaration) -> QuestionToken;
```
## PropertyDeclaration::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PropertyDeclaration) -> Symbol;
```
## PropertyDeclaration::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PropertyDeclaration) -> *Decorator;
```
## PropertyDeclaration::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PropertyDeclaration) -> TopLevelDO;
```
## PropertyDeclaration::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PropertyDeclaration, i: int) -> Decorator;
```
## PropertyDeclaration::getTypeNode

```rust
/**
     * Gets the type node. (Optional)
     */
```
```rust
pub fn getTypeNode(self: PropertyDeclaration) -> TypeNode;
```
## PropertyDeclaration::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PropertyDeclaration) -> string;
```
## PropertyDeclaration::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PropertyDeclaration, i: int) -> Modifier;
```
## PropertyDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PropertyDeclaration;
```
## PropertyDeclaration::is\<T\>

```rust
pub fn is<T>(self: PropertyDeclaration) -> bool;
```
## PropertyDeclaration::to\<T\>

```rust
pub fn to<T>(self: PropertyDeclaration) -> <any>;
```
## PropertyDeclaration::key\_neq

```rust
pub fn key_neq(self: PropertyDeclaration, object: <any>) -> bool;
```
## PropertyDeclaration::key\_eq

```rust
pub fn key_eq(self: PropertyDeclaration, object: <any>) -> bool;
```
## PropertyDeclaration::to\_set

```rust
pub fn to_set(self: PropertyDeclaration) -> *PropertyDeclaration;
```
