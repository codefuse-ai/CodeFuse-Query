# ObjectDO

Primary key: `oid: int`

```rust
schema ObjectDO {
  debug_info: string,
  name: string,
  kind: int,
  @primary oid: int
}
```
## ObjectDO::getDebugInfo

```java
/**
* @brief gets the debug info of this element.
* @return string
*/
```
```rust
pub fn getDebugInfo(self: ObjectDO) -> string;
```
## ObjectDO::getKind

```java
/**
* @brief gets the kind of this element.
* @return int
*/
```
```rust
pub fn getKind(self: ObjectDO) -> int;
```
## ObjectDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: ObjectDO) -> string;
```
## ObjectDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ObjectDO;
```
