# DecoratorDO

Primary key: `element_oid: int`

```rust
schema DecoratorDO {
  printable_text: string,
  type: string,
  @primary element_oid: int,
}
```
## DecoratorDO::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: DecoratorDO) -> string;
```
## DecoratorDO::getType

```rust
/**
     * @brief gets the type of this element.
     * @return string
     */
```
```rust
pub fn getType(self: DecoratorDO) -> string;
```
## DecoratorDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *DecoratorDO;
```
## DecoratorDO::is\<T\>

```rust
pub fn is<T>(self: DecoratorDO) -> bool;
```
## DecoratorDO::to\<T\>

```rust
pub fn to<T>(self: DecoratorDO) -> <any>;
```
## DecoratorDO::key\_neq

```rust
pub fn key_neq(self: DecoratorDO, object: <any>) -> bool;
```
## DecoratorDO::key\_eq

```rust
pub fn key_eq(self: DecoratorDO, object: <any>) -> bool;
```
## DecoratorDO::to\_set

```rust
pub fn to_set(self: DecoratorDO) -> *DecoratorDO;
```
