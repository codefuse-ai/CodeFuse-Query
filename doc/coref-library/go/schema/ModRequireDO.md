# ModRequireDO

Primary key: `oid: int`

```rust
schema ModRequireDO {
  require: string,
  mod_id: int,
  @primary oid: int,
}
```
## ModRequireDO::getRequire

```java
/**
* @brief gets the require of this element.
* @return string
*/
```
```rust
pub fn getRequire(self: ModRequireDO) -> string;
```
## ModRequireDO::getModId

```java
/**
* @brief gets the mod id of this element.
* @return int
*/
```
```rust
pub fn getModId(self: ModRequireDO) -> int;
```
## ModRequireDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *ModRequireDO;
```
