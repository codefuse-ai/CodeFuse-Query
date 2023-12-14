# EnumConstant

Inherit from [EnumConstantDO](./EnumConstantDO.md)

Primary key: `element_hash_id: int`

```rust
schema EnumConstant extends EnumConstantDO {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  printable_text: string,
}
```
## EnumConstant::getName

```java
/**
* @brief gets the name of this element.
* @return string
*/
```
```rust
pub fn getName(self: EnumConstant) -> string;
```
## EnumConstant::getPrintableText

```java
/**
* @brief gets a printed representation of this element, including its structure where applicable.
* @return string.
*/
```
```rust
pub fn getPrintableText(self: EnumConstant) -> string;
```
## EnumConstant::getValueByIndex

```java
/**
* @brief gets the value of the element by a given index.
* @return Expression 
*/
```
```rust
pub fn getValueByIndex(self: EnumConstant, i: int) -> Expression;
```
## EnumConstant::getValueList

```java
/**
* @brief gets the value list of the element.
* @return ExpressionList 
*/
```
```rust
pub fn getValueList(self: EnumConstant) -> ExpressionList;
```
## EnumConstant::getType

```java
/**
* @brief gets the type of the element.
* @return Type 
*/
```
```rust
pub fn getType(self: EnumConstant) -> Type;
```
## EnumConstant::getLocationHashId

```java
/**
* @brief gets the location hash id of this element.
* @return int
*/
```
```rust
pub fn getLocationHashId(self: EnumConstant) -> int;
```
## EnumConstant::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *EnumConstant;
```
## EnumConstant::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: EnumConstant) -> Location;
```
## EnumConstant::getDefaultValue

```java
/**
* @brief gets the default value of the element.
* @return string 
*/
```
```rust
pub fn getDefaultValue(self: EnumConstant) -> string;
```
## EnumConstant::getParentHashId

```java
/**
* @brief gets the parent hash id of this element.
* @return int
*/
```
```rust
pub fn getParentHashId(self: EnumConstant) -> int;
```
## EnumConstant::getParent

```java
/**
* @brief gets the ast element parent of the element.
* @return ElementParent 
*/
```
```rust
pub fn getParent(self: EnumConstant) -> Class;
```
## EnumConstant::getInitializer

```java
/**
* @brief gets the class body attached to the enum constant declaration.
* @return AnonymousClass 
*/
```
```rust
pub fn getInitializer(self: EnumConstant) -> AnonymousClass;
```
## EnumConstant::getValueByField

```java
/**
* @brief gets the corresponding enum value of the element by a given field, if any.
* @return Expression 
*/
```
```rust
pub fn getValueByField(self: EnumConstant, f: Field) -> Expression;
```
## EnumConstant::getMatchedFieldByIndex

```java
/**
* @brief gets the corresponding field of the element by a given index, if any.
* @return Field 
*/
```
```rust
pub fn getMatchedFieldByIndex(self: EnumConstant, i: int) -> Field;
```
## EnumConstant::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: EnumConstant) -> *ElementParent;
```
