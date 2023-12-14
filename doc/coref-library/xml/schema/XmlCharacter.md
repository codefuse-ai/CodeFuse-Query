# XmlCharacter

Primary key: `id: int`

```rust
schema XmlCharacter {
  @primary id: int,
  text: string,
  parentid: int,
  is_cdata: int,
  index_order: int,
  location_id: int,
}
```
## XmlCharacter::getText

```rust
/**
     * @brief gets the text of the element.
     * @return string 
     */
```
```rust
pub fn getText(self: XmlCharacter) -> string;
```
## XmlCharacter::getIndex

```rust
/**
     * @brief gets the index of the element.
     * @return int 
     */
```
```rust
pub fn getIndex(self: XmlCharacter) -> int;
```
## XmlCharacter::getParentid

```rust
/**
     * @brief gets the parent id of the element.
     * @return int
     */
```
```rust
pub fn getParentid(self: XmlCharacter) -> int;
```
## XmlCharacter::isCdata

```rust
/**
     * @brief check whether the element is Cdata or not.
     * @return int 
     */
```
```rust
pub fn isCdata(self: XmlCharacter) -> int;
```
## XmlCharacter::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: XmlCharacter) -> Location;
```
## XmlCharacter::getBelongedElement

```rust
/**
     * @brief gets the belonged xml element of this xml character.
     * @return XmlElement 
     */
```
```rust
pub fn getBelongedElement(self: XmlCharacter) -> XmlElement;
```
## XmlCharacter::getLocationId

```rust
/**
     * @brief gets the location id of this element.
     * @return int
     */
```
```rust
pub fn getLocationId(self: XmlCharacter) -> int;
```
## XmlCharacter::\_\_all\_\_

```rust
pub fn __all__(db: XmlDB) -> *XmlCharacter;
```
## XmlCharacter::is\<T\>

```rust
pub fn is<T>(self: XmlCharacter) -> bool;
```
## XmlCharacter::to\<T\>

```rust
pub fn to<T>(self: XmlCharacter) -> <any>;
```
## XmlCharacter::key\_neq

```rust
pub fn key_neq(self: XmlCharacter, object: <any>) -> bool;
```
## XmlCharacter::key\_eq

```rust
pub fn key_eq(self: XmlCharacter, object: <any>) -> bool;
```
## XmlCharacter::to\_set

```rust
pub fn to_set(self: XmlCharacter) -> *XmlCharacter;
```
