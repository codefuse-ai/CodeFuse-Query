# ComprehensionDO

Primary key: `element_oid: int`

```rust
schema ComprehensionDO {
  parent_oid: int,
  element_index: int,
  printable_text: string,
  iter_expr_oid: int,
  target_expr_oid: int,
  @primary element_oid: int,
}
```
## ComprehensionDO::getPrintableText

```java
/**
* @brief gets the printable text of this element.
* @return string
*/
```
```rust
pub fn getPrintableText(self: ComprehensionDO) -> string;
```
## ComprehensionDO::getParentOid

```java
/**
* @brief gets the parent oid of this element.
* @return int
*/
```
```rust
pub fn getParentOid(self: ComprehensionDO) -> int;
```
## ComprehensionDO::getElementIndex

```java
/**
* @brief gets the element index of this element.
* @return int
*/
```
```rust
pub fn getElementIndex(self: ComprehensionDO) -> int;
```
## ComprehensionDO::getIterExprOid

```java
/**
* @brief gets the iter expr oid of this element.
* @return int
*/
```
```rust
pub fn getIterExprOid(self: ComprehensionDO) -> int;
```
## ComprehensionDO::getTargetExprOid

```java
/**
* @brief gets the target expr oid of this element.
* @return int
*/
```
```rust
pub fn getTargetExprOid(self: ComprehensionDO) -> int;
```
## ComprehensionDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: PythonDB) -> *ComprehensionDO;
```
