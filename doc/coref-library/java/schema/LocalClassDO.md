# LocalClassDO

Primary key: `element_hash_id: int`

```rust
schema LocalClassDO {
  parent_hash_id: int,
  printable_text: string,
  location_hash_id: int,
  name: string,
  @primary element_hash_id: int,
}
```
## LocalClassDO::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: LocalClassDO) -> int;
```
## LocalClassDO::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: LocalClassDO) -> string;
```
## LocalClassDO::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: LocalClassDO) -> int;
```
## LocalClassDO::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: LocalClassDO) -> string;
```
## LocalClassDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *LocalClassDO;
```
## LocalClassDO::is\<T\>

```rust
pub fn is<T>(self: LocalClassDO) -> bool;
```
## LocalClassDO::to\<T\>

```rust
pub fn to<T>(self: LocalClassDO) -> <any>;
```
## LocalClassDO::key\_neq

```rust
pub fn key_neq(self: LocalClassDO, object: <any>) -> bool;
```
## LocalClassDO::key\_eq

```rust
pub fn key_eq(self: LocalClassDO, object: <any>) -> bool;
```
## LocalClassDO::to\_set

```rust
pub fn to_set(self: LocalClassDO) -> *LocalClassDO;
```
