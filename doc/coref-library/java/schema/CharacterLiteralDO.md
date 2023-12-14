# CharacterLiteralDO

Primary key: `element_hash_id: int`

```rust
schema CharacterLiteralDO {
  value: string,
  @primary element_hash_id: int,
}
```
## CharacterLiteralDO::getValue

```rust
/**
     * @brief gets the value of this element.
     * @return string
     */
```
```rust
pub fn getValue(self: CharacterLiteralDO) -> string;
```
## CharacterLiteralDO::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *CharacterLiteralDO;
```
## CharacterLiteralDO::is\<T\>

```rust
pub fn is<T>(self: CharacterLiteralDO) -> bool;
```
## CharacterLiteralDO::to\<T\>

```rust
pub fn to<T>(self: CharacterLiteralDO) -> <any>;
```
## CharacterLiteralDO::key\_neq

```rust
pub fn key_neq(self: CharacterLiteralDO, object: <any>) -> bool;
```
## CharacterLiteralDO::key\_eq

```rust
pub fn key_eq(self: CharacterLiteralDO, object: <any>) -> bool;
```
## CharacterLiteralDO::to\_set

```rust
pub fn to_set(self: CharacterLiteralDO) -> *CharacterLiteralDO;
```
