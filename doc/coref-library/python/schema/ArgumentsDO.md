# ArgumentsDO

Primary key: `element_oid: int`

```rust
schema ArgumentsDO {
  printable_text: string,
  parent_oid: int,
  @primary element_oid: int
}
```
## ArgumentsDO::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: ArgumentsDO) -> string;
```
## ArgumentsDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: ArgumentsDO) -> int;
```
## ArgumentsDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ArgumentsDO;
```
