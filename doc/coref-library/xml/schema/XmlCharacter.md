# XmlCharacter

Inherit from [XmlCharacterDO](./XmlCharacterDO.md)

Primary key: `id: int`

```rust
schema XmlCharacter extends XmlCharacterDO {
  @primary id: int,
  text: string,
  parentid: int,
  is_cdata: int,
  index_order: int,
  location_id: int,
}
```
## XmlCharacter::getText

```java
/**
* @brief gets the text of the element.
* @return string 
*/
```
```rust
pub fn getText(self: XmlCharacter) -> string;
```
## XmlCharacter::getIndex

```java
/**
* @brief gets the index of the element.
* @return int 
*/
```
```rust
pub fn getIndex(self: XmlCharacter) -> int;
```
## XmlCharacter::getParentid

```java
/**
* @brief gets the parent id of the element.
* @return int
*/
```
```rust
pub fn getParentid(self: XmlCharacter) -> int;
```
## XmlCharacter::isCdata

```java
/**
* @brief check whether the element is Cdata or not.
* @return int 
*/
```
```rust
pub fn isCdata(self: XmlCharacter) -> int;
```
## XmlCharacter::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: XmlCharacter) -> Location;
```
## XmlCharacter::getBelongedElement

```java
/**
* @brief gets the belonged xml element of this xml character.
* @return XmlElement 
*/
```
```rust
pub fn getBelongedElement(self: XmlCharacter) -> XmlElement;
```
## XmlCharacter::getLocationId

```java
/**
* @brief gets the location id of this element.
* @return int
*/
```
```rust
pub fn getLocationId(self: XmlCharacter) -> int;
```
## XmlCharacter::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: XmlDB) -> *XmlCharacter;
```
