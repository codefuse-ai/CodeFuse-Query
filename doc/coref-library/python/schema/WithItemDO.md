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

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: WithItemDO) -> int;
```
## WithItemDO::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: WithItemDO) -> int;
```
## WithItemDO::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: WithItemDO) -> string;
```
## WithItemDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *WithItemDO;
```
