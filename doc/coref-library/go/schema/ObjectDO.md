# ObjectDO

Primary key: `oid: int`

```rust
schema ObjectDO {
  debug_info: string,
  name: string,
  kind: int,
  @primary oid: int,
}
```
## ObjectDO::getDebugInfo

```rust
/**
     * @brief gets the debug info of this element.
     * @return string
     */
```
```rust
pub fn getDebugInfo(self: ObjectDO) -> string;
```
## ObjectDO::getKind

```rust
/**
     * @brief gets the kind of this element.
     * @return int
     */
```
```rust
pub fn getKind(self: ObjectDO) -> int;
```
## ObjectDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: ObjectDO) -> string;
```
## ObjectDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *ObjectDO;
```
## ObjectDO::is\<T\>

```rust
pub fn is<T>(self: ObjectDO) -> bool;
```
## ObjectDO::to\<T\>

```rust
pub fn to<T>(self: ObjectDO) -> <any>;
```
## ObjectDO::key\_neq

```rust
pub fn key_neq(self: ObjectDO, object: <any>) -> bool;
```
## ObjectDO::key\_eq

```rust
pub fn key_eq(self: ObjectDO, object: <any>) -> bool;
```
## ObjectDO::to\_set

```rust
pub fn to_set(self: ObjectDO) -> *ObjectDO;
```
