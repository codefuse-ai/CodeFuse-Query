# Variable

Primary key: `id: int`

```rust
schema Variable {
  @primary id: int,
}
```
## Variable::getDirectUsage

```rust
/**
     * @brief gets the directly usage of the element.
     * @return ReferenceExpression 
     */
```
```rust
pub fn getDirectUsage(self: Variable) -> *ReferenceExpression;
```
## Variable::getLocation

```rust
/**
     * @brief gets the location of the element.
     * @return Location 
     */
```
```rust
pub fn getLocation(self: Variable) -> Location;
```
## Variable::getType

```rust
/**
     * @brief gets the type of the element.
     * @return Type 
     */
```
```rust
pub fn getType(self: Variable) -> Type;
```
## Variable::getName

```rust
/**
     * @brief gets the name of the element.
     * @return string 
     */
```
```rust
pub fn getName(self: Variable) -> string;
```
## Variable::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Variable;
```
## Variable::is\<T\>

```rust
pub fn is<T>(self: Variable) -> bool;
```
## Variable::to\<T\>

```rust
pub fn to<T>(self: Variable) -> <any>;
```
## Variable::key\_neq

```rust
pub fn key_neq(self: Variable, object: <any>) -> bool;
```
## Variable::key\_eq

```rust
pub fn key_eq(self: Variable, object: <any>) -> bool;
```
## Variable::to\_set

```rust
pub fn to_set(self: Variable) -> *Variable;
```
