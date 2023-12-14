# ExprContextDO

Primary key: `element_oid: int`

```rust
schema ExprContextDO {
  printable_text: string,
  parent_oid: int,
  @primary element_oid: int,
}
```
## ExprContextDO::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: ExprContextDO) -> string;
```
## ExprContextDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: ExprContextDO) -> int;
```
## ExprContextDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ExprContextDO;
```
