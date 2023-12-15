# Variable

Primary key: `id: int`

```rust
schema Variable {
  @primary id: int
}
```
## Variable::getDirectUsage

```java
/**
* @brief gets the directly usage of the element.
* @return ReferenceExpression 
*/
```
```rust
pub fn getDirectUsage(self: Variable) -> *ReferenceExpression;
```
## Variable::getLocation

```java
/**
* @brief gets the location of the element.
* @return Location 
*/
```
```rust
pub fn getLocation(self: Variable) -> Location;
```
## Variable::getType

```java
/**
* @brief gets the type of the element.
* @return Type 
*/
```
```rust
pub fn getType(self: Variable) -> Type;
```
## Variable::getName

```java
/**
* @brief gets the name of the element.
* @return string 
*/
```
```rust
pub fn getName(self: Variable) -> string;
```
## Variable::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Variable;
```
