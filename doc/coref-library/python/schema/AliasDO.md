# AliasDO

Primary key: `element_oid: int`

```rust
schema AliasDO {
  printable_text: string,
  location_oid: int,
  element_index: int,
  parent_oid: int,
  asname: string,
  name: string,
  @primary element_oid: int,
}
```
## AliasDO::getLocationOid

```java
/**
* @brief gets the location oid of this element.
* @return int
*/
```
```rust
pub fn getLocationOid(self: AliasDO) -> int;
```
## AliasDO::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: AliasDO) -> string;
```
## AliasDO::getAsname

```java
/**
* @brief gets the asname of this element.
* @return string
*/
```
```rust
pub fn getAsname(self: AliasDO) -> string;
```
## AliasDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: AliasDO) -> int;
```
## AliasDO::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: AliasDO) -> int;
```
## AliasDO::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: AliasDO) -> string;
```
## AliasDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *AliasDO;
```
