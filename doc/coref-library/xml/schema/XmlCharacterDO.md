# XmlCharacterDO

Primary key: `id: int`

```rust
schema XmlCharacterDO {
  location_id: int,
  index_order: int,
  is_cdata: int,
  parentid: int,
  text: string,
  @primary id: int,
}
```
## XmlCharacterDO::isCdata

```rust
/**
     * @brief check whether the element is Cdata or not.
     * @return int 
     */
```
```rust
pub fn isCdata(self: XmlCharacterDO) -> int;
```
## XmlCharacterDO::getParentid

```rust
/**
     * @brief gets the parent id of the element.
     * @return int
     */
```
```rust
pub fn getParentid(self: XmlCharacterDO) -> int;
```
## XmlCharacterDO::getIndex

```rust
/**
     * @brief gets the index of the element.
     * @return int 
     */
```
```rust
pub fn getIndex(self: XmlCharacterDO) -> int;
```
## XmlCharacterDO::getText

```rust
/**
     * @brief gets the text of the element.
     * @return string 
     */
```
```rust
pub fn getText(self: XmlCharacterDO) -> string;
```
## XmlCharacterDO::getLocationId

```rust
/**
     * @brief gets the location id of this element.
     * @return int
     */
```
```rust
pub fn getLocationId(self: XmlCharacterDO) -> int;
```
## XmlCharacterDO::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlCharacterDO;
```
## XmlCharacterDO::is\<T\>

```rust
pub fn is<T>(self: XmlCharacterDO) -> bool;
```
## XmlCharacterDO::to\<T\>

```rust
pub fn to<T>(self: XmlCharacterDO) -> <any>;
```
## XmlCharacterDO::key\_neq

```rust
pub fn key_neq(self: XmlCharacterDO, object: <any>) -> bool;
```
## XmlCharacterDO::key\_eq

```rust
pub fn key_eq(self: XmlCharacterDO, object: <any>) -> bool;
```
## XmlCharacterDO::to\_set

```rust
pub fn to_set(self: XmlCharacterDO) -> *XmlCharacterDO;
```
