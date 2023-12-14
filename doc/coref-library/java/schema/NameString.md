# NameString

Primary key: `parent_hash_id: int`

```rust
schema NameString {
  @primary parent_hash_id: int,
  value_element_hash_id: int,
  name_element_hash_id: int,
}
```
## NameString::getNameElementHashId

```rust
/**
     * @brief gets the name element hash id of this element.
     * @return int
     */
```
```rust
pub fn getNameElementHashId(self: NameString) -> int;
```
## NameString::getValueElementHashId

```rust
/**
     * @brief gets the value element hash id of this element.
     * @return int
     */
```
```rust
pub fn getValueElementHashId(self: NameString) -> int;
```
## NameString::getValue

```rust
/**
     * @brief get the referenced statement.
     * @return Statement 
     */
```
```rust
pub fn getValue(self: NameString) -> Statement;
```
## NameString::getName

```rust
/**
     * @brief get the identifier of the element.
     * @return Identifier 
     */
```
```rust
pub fn getName(self: NameString) -> Identifier;
```
## NameString::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *NameString;
```
## NameString::is\<T\>

```rust
pub fn is<T>(self: NameString) -> bool;
```
## NameString::to\<T\>

```rust
pub fn to<T>(self: NameString) -> <any>;
```
## NameString::key\_neq

```rust
pub fn key_neq(self: NameString, object: <any>) -> bool;
```
## NameString::key\_eq

```rust
pub fn key_eq(self: NameString, object: <any>) -> bool;
```
## NameString::to\_set

```rust
pub fn to_set(self: NameString) -> *NameString;
```
