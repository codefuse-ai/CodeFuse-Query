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

```rust
/**
     * @brief gets the error message of this element.
     * @return string
     */
```
```rust
pub fn getErrorMessage(self: DiagnosticDO) -> string;
```
## DiagnosticDO::getLocationId

```rust
/**
     * @brief gets the location id of this element.
     * @return int
     */
```
```rust
pub fn getLocationId(self: DiagnosticDO) -> int;
```
## DiagnosticDO::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *DiagnosticDO;
```
## DiagnosticDO::getErrorTag

```rust
/**
     * @brief gets the error tag of this element.
     * @return string
     */
```
```rust
pub fn getErrorTag(self: DiagnosticDO) -> string;
```
## DiagnosticDO::getFullErrorMessage

```rust
/**
     * @brief gets the full error message of this element.
     * @return string
     */
```
```rust
pub fn getFullErrorMessage(self: DiagnosticDO) -> string;
```
## DiagnosticDO::getSeverity

```rust
/**
     * @brief gets the severity of this element.
     * @return int
     */
```
```rust
pub fn getSeverity(self: DiagnosticDO) -> int;
```
## DiagnosticDO::is\<T\>

```rust
pub fn is<T>(self: DiagnosticDO) -> bool;
```
## DiagnosticDO::to\<T\>

```rust
pub fn to<T>(self: DiagnosticDO) -> <any>;
```
## DiagnosticDO::key\_neq

```rust
pub fn key_neq(self: DiagnosticDO, object: <any>) -> bool;
```
## DiagnosticDO::key\_eq

```rust
pub fn key_eq(self: DiagnosticDO, object: <any>) -> bool;
```
## DiagnosticDO::to\_set

```rust
pub fn to_set(self: DiagnosticDO) -> *DiagnosticDO;
```
