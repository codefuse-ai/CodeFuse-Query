# EnumConstant

Primary key: `element_hash_id: int`

```rust
schema EnumConstant {
  @primary element_hash_id: int,
  name: string,
  location_hash_id: int,
  parent_hash_id: int,
  printable_text: string,
}
```
## EnumConstant::getName

```rust
/**
     * @brief gets the name of this element.
     * @return string
     */
```
```rust
pub fn getName(self: EnumConstant) -> string;
```
## EnumConstant::getPrintableText

```rust
/**
     * @brief gets a printed representation of this element, including its structure where applicable.
     * @return string.
     */
```
```rust
pub fn getPrintableText(self: EnumConstant) -> string;
```
## EnumConstant::getValueByIndex

```rust
/**
     * @brief gets the value of the element by a given index.
     * @return Expression 
     */
```
```rust
pub fn getValueByIndex(self: EnumConstant, i: int) -> Expression;
```
## EnumConstant::getValueList

```rust
/**
     * @brief gets the value list of the element.
     * @return ExpressionList 
     */
```
```rust
pub fn getValueList(self: EnumConstant) -> ExpressionList;
```
## EnumConstant::getType

```rust
/**
     * @brief gets the type of the element.
     * @return Type 
     */
```
```rust
pub fn getType(self: EnumConstant) -> Type;
```
## EnumConstant::getLocationHashId

```rust
/**
     * @brief gets the location hash id of this element.
     * @return int
     */
```
```rust
pub fn getLocationHashId(self: EnumConstant) -> int;
```
## EnumConstant::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *EnumConstant;
```
## EnumConstant::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: EnumConstant) -> Location;
```
## EnumConstant::getDefaultValue

```rust
/**
     * @brief gets the default value of the element.
     * @return string 
     */
```
```rust
pub fn getDefaultValue(self: EnumConstant) -> string;
```
## EnumConstant::getParentHashId

```rust
/**
     * @brief gets the parent hash id of this element.
     * @return int
     */
```
```rust
pub fn getParentHashId(self: EnumConstant) -> int;
```
## EnumConstant::getParent

```rust
/**
     * @brief gets the ast element parent of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getParent(self: EnumConstant) -> Class;
```
## EnumConstant::getInitializer

```rust
/**
     * @brief gets the class body attached to the enum constant declaration.
     * @return AnonymousClass 
     */
```
```rust
pub fn getInitializer(self: EnumConstant) -> AnonymousClass;
```
## EnumConstant::getValueByField

```rust
/**
     * @brief gets the corresponding enum value of the element by a given field, if any.
     * @return Expression 
     */
```
```rust
pub fn getValueByField(self: EnumConstant, f: Field) -> Expression;
```
## EnumConstant::getMatchedFieldByIndex

```rust
/**
     * @brief gets the corresponding field of the element by a given index, if any.
     * @return Field 
     */
```
```rust
pub fn getMatchedFieldByIndex(self: EnumConstant, i: int) -> Field;
```
## EnumConstant::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: EnumConstant) -> *ElementParent;
```
## EnumConstant::is\<T\>

```rust
pub fn is<T>(self: EnumConstant) -> bool;
```
## EnumConstant::to\<T\>

```rust
pub fn to<T>(self: EnumConstant) -> <any>;
```
## EnumConstant::key\_neq

```rust
pub fn key_neq(self: EnumConstant, object: <any>) -> bool;
```
## EnumConstant::key\_eq

```rust
pub fn key_eq(self: EnumConstant, object: <any>) -> bool;
```
## EnumConstant::to\_set

```rust
pub fn to_set(self: EnumConstant) -> *EnumConstant;
```
