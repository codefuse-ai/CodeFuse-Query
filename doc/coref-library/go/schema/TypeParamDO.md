# TypeParamDO

Primary key: `oid: int`

```rust
schema TypeParamDO {
  index: int,
  parent: int,
  tp: int,
  bound: int,
  name: string,
  @primary oid: int,
}
```
## TypeParamDO::getBound

```java
/**
* @brief gets the bound of this element.
* @return int
*/
```
```rust
pub fn getBound(self: TypeParamDO) -> int;
```
## TypeParamDO::getParent

```java
/**
* @brief gets the parent of this element.
* @return int
*/
```
```rust
pub fn getParent(self: TypeParamDO) -> int;
```
## TypeParamDO::getIndex

```java
/**
* @brief gets the index of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: TypeParamDO) -> int;
```
## TypeParamDO::getTp

```java
/**
* @brief gets the tp of this element.
* @return int
*/
```
```rust
pub fn getTp(self: TypeParamDO) -> int;
```
## TypeParamDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: TypeParamDO) -> string;
```
## TypeParamDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *TypeParamDO;
```
