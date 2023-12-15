# DecoratorDO

Primary key: `element_oid: int`

```rust
schema DecoratorDO {
  printable_text: string,
  type: string,
  @primary element_oid: int
}
```
## DecoratorDO::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: DecoratorDO) -> string;
```
## DecoratorDO::getType

```java
/**
* @brief gets the type of this element.
* @return string
*/
```
```rust
pub fn getType(self: DecoratorDO) -> string;
```
## DecoratorDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *DecoratorDO;
```
