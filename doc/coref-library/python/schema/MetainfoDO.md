# MetainfoDO

Primary key: `oid: int`

```rust
schema MetainfoDO {
  program_oid: int,
  value: string,
  kind: string,
  @primary oid: int,
}
```
## MetainfoDO::getProgramOid

```rust
/**
     * @brief gets the program oid of this element.
     * @return int
     */
```
```rust
pub fn getProgramOid(self: MetainfoDO) -> int;
```
## MetainfoDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: MetainfoDO) -> string;
```
## MetainfoDO::getKind

```rust
/**
     * @brief gets the kind of this element.
     * @return string
     */
```
```rust
pub fn getKind(self: MetainfoDO) -> string;
```
## MetainfoDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *MetainfoDO;
```
## MetainfoDO::is\<T\>

```rust
pub fn is<T>(self: MetainfoDO) -> bool;
```
## MetainfoDO::to\<T\>

```rust
pub fn to<T>(self: MetainfoDO) -> <any>;
```
## MetainfoDO::key\_neq

```rust
pub fn key_neq(self: MetainfoDO, object: <any>) -> bool;
```
## MetainfoDO::key\_eq

```rust
pub fn key_eq(self: MetainfoDO, object: <any>) -> bool;
```
## MetainfoDO::to\_set

```rust
pub fn to_set(self: MetainfoDO) -> *MetainfoDO;
```
