# WithItemDO

Primary key: `element_oid: int`

```rust
schema WithItemDO {
  parent_oid: int,
  element_index: int,
  printable_text: string,
  @primary element_oid: int,
}
```
## WithItemDO::getParentOid

```rust
/**
     * @brief gets the parent oid of this element.
     * @return int
     */
```
```rust
pub fn getParentOid(self: WithItemDO) -> int;
```
## WithItemDO::getElementIndex

```rust
/**
     * @brief gets the element index of this element.
     * @return int
     */
```
```rust
pub fn getElementIndex(self: WithItemDO) -> int;
```
## WithItemDO::getPrintableText

```rust
/**
     * @brief gets the printable text of this element.
     * @return string
     */
```
```rust
pub fn getPrintableText(self: WithItemDO) -> string;
```
## WithItemDO::\_\_all\_\_

```rust
pub fn __all__(db: PythonDB) -> *WithItemDO;
```
## WithItemDO::is\<T\>

```rust
pub fn is<T>(self: WithItemDO) -> bool;
```
## WithItemDO::to\<T\>

```rust
pub fn to<T>(self: WithItemDO) -> <any>;
```
## WithItemDO::key\_neq

```rust
pub fn key_neq(self: WithItemDO, object: <any>) -> bool;
```
## WithItemDO::key\_eq

```rust
pub fn key_eq(self: WithItemDO, object: <any>) -> bool;
```
## WithItemDO::to\_set

```rust
pub fn to_set(self: WithItemDO) -> *WithItemDO;
```
