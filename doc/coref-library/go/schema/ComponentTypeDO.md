# ComponentTypeDO

Primary key: `oid: int`

```rust
schema ComponentTypeDO {
  tp: int,
  name: string,
  index: int,
  parent: int,
  @primary oid: int,
}
```
## ComponentTypeDO::getIndex

```java
/**
* @brief gets the index of this element.
* @return int
*/
```
```rust
pub fn getIndex(self: ComponentTypeDO) -> int;
```
## ComponentTypeDO::getTp

```java
/**
* @brief gets the tp of this element.
* @return int
*/
```
```rust
pub fn getTp(self: ComponentTypeDO) -> int;
```
## ComponentTypeDO::getParent

```java
/**
* @brief gets the parent of this element.
* @return int
*/
```
```rust
pub fn getParent(self: ComponentTypeDO) -> int;
```
## ComponentTypeDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: ComponentTypeDO) -> string;
```
## ComponentTypeDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ComponentTypeDO;
```
