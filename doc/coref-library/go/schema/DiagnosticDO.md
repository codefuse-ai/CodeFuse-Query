# DiagnosticDO

Primary key: `oid: int`

```rust
schema DiagnosticDO {
  location_id: int,
  full_error_message: string,
  error_message: string,
  error_tag: string,
  severity: int,
  @primary oid: int,
}
```
## DiagnosticDO::getErrorMessage

```java
/**
* @brief gets the error message of this element.
* @return string
*/
```
```rust
pub fn getErrorMessage(self: DiagnosticDO) -> string;
```
## DiagnosticDO::getLocationId

```java
/**
* @brief gets the location id of this element.
* @return int
*/
```
```rust
pub fn getLocationId(self: DiagnosticDO) -> int;
```
## DiagnosticDO::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: GoDB) -> *DiagnosticDO;
```
## DiagnosticDO::getErrorTag

```java
/**
* @brief gets the error tag of this element.
* @return string
*/
```
```rust
pub fn getErrorTag(self: DiagnosticDO) -> string;
```
## DiagnosticDO::getFullErrorMessage

```java
/**
* @brief gets the full error message of this element.
* @return string
*/
```
```rust
pub fn getFullErrorMessage(self: DiagnosticDO) -> string;
```
## DiagnosticDO::getSeverity

```java
/**
* @brief gets the severity of this element.
* @return int
*/
```
```rust
pub fn getSeverity(self: DiagnosticDO) -> int;
```
