# ElementDO

Primary key: `oid: int`

```rust
schema ElementDO {
  type: string,
  parent_oid: int,
  value: string,
  @primary oid: int,
}
```
## ElementDO::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: ElementDO) -> int;
```
## ElementDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: ElementDO) -> string;
```
## ElementDO::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: ElementDO) -> string;
```
## ElementDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *ElementDO;
```
## ElementDO::is\<T\>

```rust
pub fn is<T>(self: ElementDO) -> bool;
```
## ElementDO::to\<T\>

```rust
pub fn to<T>(self: ElementDO) -> <any>;
```
## ElementDO::key\_neq

```rust
pub fn key_neq(self: ElementDO, object: <any>) -> bool;
```
## ElementDO::key\_eq

```rust
pub fn key_eq(self: ElementDO, object: <any>) -> bool;
```
## ElementDO::to\_set

```rust
pub fn to_set(self: ElementDO) -> *ElementDO;
```
