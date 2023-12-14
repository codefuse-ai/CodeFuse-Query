# ConstantDO

Primary key: `element_oid: int`

```rust
schema ConstantDO {
  value: string,
  @primary element_oid: int,
}
```
## ConstantDO::getValue

```java
/**
* @brief gets the value of this element.
* @return string
*/
```
```rust
pub fn getValue(self: ConstantDO) -> string;
```
## ConstantDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ConstantDO;
```
