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

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TopLevel) -> int;
```
## TopLevel::getAStatement

```java
/**
* Get a statement of this top-level.
*/
```
```rust
pub fn getAStatement(self: TopLevel) -> *Statement;
```
## TopLevel::getText

```java
/**
* Gets the text of this top-level.
*/
```
```rust
pub fn getText(self: TopLevel) -> string;
```
## TopLevel::getADescendant

```java
/**
* Gets a descendant of this top-level.
*/
```
```rust
pub fn getADescendant(self: TopLevel) -> *Node;
```
## TopLevel::getLocation

```java
/**
* Gets the location of this top-level.
*/
```
```rust
pub fn getLocation(self: TopLevel) -> Location;
```
## TopLevel::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TopLevel;
```
## TopLevel::getAChild

```java
/**
* Gets a child node of this top-level.
*/
```
```rust
pub fn getAChild(self: TopLevel) -> *Node;
```
## TopLevel::getStatementCount

```java
/**
* Get the number of statements in this top-level.
*/
```
```rust
pub fn getStatementCount(self: TopLevel) -> int;
```
## TopLevel::getADescendantByLevel

```java
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

```java
/**
* Get the `i`th statement of this top-level.
*/
```
```rust
pub fn getStatement(self: TopLevel, i: int) -> Statement;
```
## TopLevel::getChild

```java
/**
* Gets the `i`th child of this top-level.
*/
```
```rust
pub fn getChild(self: TopLevel, i: int) -> Node;
```
