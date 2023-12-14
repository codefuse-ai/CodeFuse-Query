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

```rust
/**
     * @brief gets the require of this element.
     * @return string
     */
```
```rust
pub fn getRequire(self: ModRequireDO) -> string;
```
## ModRequireDO::getModId

```rust
/**
     * @brief gets the mod id of this element.
     * @return int
     */
```
```rust
pub fn getModId(self: ModRequireDO) -> int;
```
## ModRequireDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *ModRequireDO;
```
## ModRequireDO::is\<T\>

```rust
pub fn is<T>(self: ModRequireDO) -> bool;
```
## ModRequireDO::to\<T\>

```rust
pub fn to<T>(self: ModRequireDO) -> <any>;
```
## ModRequireDO::key\_neq

```rust
pub fn key_neq(self: ModRequireDO, object: <any>) -> bool;
```
## ModRequireDO::key\_eq

```rust
pub fn key_eq(self: ModRequireDO, object: <any>) -> bool;
```
## ModRequireDO::to\_set

```rust
pub fn to_set(self: ModRequireDO) -> *ModRequireDO;
```
