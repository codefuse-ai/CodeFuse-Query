# TopLevel

Primary key: `oid: int`

```rust
schema TopLevel {
  @primary oid: int,
  kind: int,
  location_oid: int,
}
```
## TopLevel::getKind

```rust
pub fn getKind(self: TopLevel) -> int;
```
## TopLevel::getLocationOid

```rust
pub fn getLocationOid(self: TopLevel) -> int;
```
## TopLevel::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TopLevel) -> int;
```
## TopLevel::getAStatement

```rust
/**
     * Get a statement of this top-level.
     */
```
```rust
pub fn getAStatement(self: TopLevel) -> *Statement;
```
## TopLevel::getText

```rust
/**
     * Gets the text of this top-level.
     */
```
```rust
pub fn getText(self: TopLevel) -> string;
```
## TopLevel::getADescendant

```rust
/**
     * Gets a descendant of this top-level.
     */
```
```rust
pub fn getADescendant(self: TopLevel) -> *Node;
```
## TopLevel::getLocation

```rust
/**
     * Gets the location of this top-level.
     */
```
```rust
pub fn getLocation(self: TopLevel) -> Location;
```
## TopLevel::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TopLevel;
```
## TopLevel::getAChild

```rust
/**
     * Gets a child node of this top-level.
     */
```
```rust
pub fn getAChild(self: TopLevel) -> *Node;
```
## TopLevel::getStatementCount

```rust
/**
     * Get the number of statements in this top-level.
     */
```
```rust
pub fn getStatementCount(self: TopLevel) -> int;
```
## TopLevel::getADescendantByLevel

```rust
/**
     * Gets a descendant of this top-level by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TopLevel, level: int) -> *Node;
```
## TopLevel::getStatement

```rust
/**
     * Get the `i`th statement of this top-level.
     */
```
```rust
pub fn getStatement(self: TopLevel, i: int) -> Statement;
```
## TopLevel::getChild

```rust
/**
     * Gets the `i`th child of this top-level.
     */
```
```rust
pub fn getChild(self: TopLevel, i: int) -> Node;
```
## TopLevel::is\<T\>

```rust
pub fn is<T>(self: TopLevel) -> bool;
```
## TopLevel::to\<T\>

```rust
pub fn to<T>(self: TopLevel) -> <any>;
```
## TopLevel::key\_neq

```rust
pub fn key_neq(self: TopLevel, object: <any>) -> bool;
```
## TopLevel::key\_eq

```rust
pub fn key_eq(self: TopLevel, object: <any>) -> bool;
```
## TopLevel::to\_set

```rust
pub fn to_set(self: TopLevel) -> *TopLevel;
```
