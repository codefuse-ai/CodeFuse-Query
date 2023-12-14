# Type

Primary key: `oid: int`

```rust
schema Type {
  @primary oid: int,
  kind: int,
  raw_string: string,
  format_string: string,
}
```
## Type::isNamedType

```rust
pub fn isNamedType(self: Type) -> bool;
```
## Type::isRecvchanType

```rust
pub fn isRecvchanType(self: Type) -> bool;
```
## Type::isPointerType

```rust
pub fn isPointerType(self: Type) -> bool;
```
## Type::isSliceType

```rust
pub fn isSliceType(self: Type) -> bool;
```
## Type::isTypeParamtype

```rust
pub fn isTypeParamtype(self: Type) -> bool;
```
## Type::isFloatLiteraltype

```rust
pub fn isFloatLiteraltype(self: Type) -> bool;
```
## Type::isIntLiteraltype

```rust
pub fn isIntLiteraltype(self: Type) -> bool;
```
## Type::isBoolLiteraltype

```rust
pub fn isBoolLiteraltype(self: Type) -> bool;
```
## Type::isUnsafepointerType

```rust
pub fn isUnsafepointerType(self: Type) -> bool;
```
## Type::isStringexprType

```rust
pub fn isStringexprType(self: Type) -> bool;
```
## Type::isStructType

```rust
pub fn isStructType(self: Type) -> bool;
```
## Type::isComplex128Type

```rust
pub fn isComplex128Type(self: Type) -> bool;
```
## Type::isComplex64Type

```rust
pub fn isComplex64Type(self: Type) -> bool;
```
## Type::isTypesetLiteraltype

```rust
pub fn isTypesetLiteraltype(self: Type) -> bool;
```
## Type::isUint32Type

```rust
pub fn isUint32Type(self: Type) -> bool;
```
## Type::isFloat64Type

```rust
pub fn isFloat64Type(self: Type) -> bool;
```
## Type::isTupleType

```rust
pub fn isTupleType(self: Type) -> bool;
```
## Type::isNilLiteraltype

```rust
pub fn isNilLiteraltype(self: Type) -> bool;
```
## Type::isStringLiteraltype

```rust
pub fn isStringLiteraltype(self: Type) -> bool;
```
## Type::isFloat32Type

```rust
pub fn isFloat32Type(self: Type) -> bool;
```
## Type::isMapType

```rust
pub fn isMapType(self: Type) -> bool;
```
## Type::isUint64Type

```rust
pub fn isUint64Type(self: Type) -> bool;
```
## Type::isUint16Type

```rust
pub fn isUint16Type(self: Type) -> bool;
```
## Type::isUint8Type

```rust
pub fn isUint8Type(self: Type) -> bool;
```
## Type::isUintType

```rust
pub fn isUintType(self: Type) -> bool;
```
## Type::isSendchanType

```rust
pub fn isSendchanType(self: Type) -> bool;
```
## Type::isInt64Type

```rust
pub fn isInt64Type(self: Type) -> bool;
```
## Type::isArrayType

```rust
pub fn isArrayType(self: Type) -> bool;
```
## Type::isInt8Type

```rust
pub fn isInt8Type(self: Type) -> bool;
```
## Type::isInt16Type

```rust
pub fn isInt16Type(self: Type) -> bool;
```
## Type::isUintptrType

```rust
pub fn isUintptrType(self: Type) -> bool;
```
## Type::isComplexLiteraltype

```rust
pub fn isComplexLiteraltype(self: Type) -> bool;
```
## Type::getName

```rust
pub fn getName(self: Type) -> string;
```
## Type::isInvalidType

```rust
pub fn isInvalidType(self: Type) -> bool;
```
## Type::isIntType

```rust
pub fn isIntType(self: Type) -> bool;
```
## Type::isRuneLiteraltype

```rust
pub fn isRuneLiteraltype(self: Type) -> bool;
```
## Type::isBoolexprType

```rust
pub fn isBoolexprType(self: Type) -> bool;
```
## Type::isInterfaceType

```rust
pub fn isInterfaceType(self: Type) -> bool;
```
## Type::getExpr

```rust
pub fn getExpr(self: Type) -> *Expr;
```
## Type::isSignatureType

```rust
pub fn isSignatureType(self: Type) -> bool;
```
## Type::\_\_all\_\_

```rust
pub fn __all__(db: GoDB) -> *Type;
```
## Type::getFormatString

```rust
pub fn getFormatString(self: Type) -> *string;
```
## Type::getRawString

```rust
pub fn getRawString(self: Type) -> *string;
```
## Type::isSendrcvchanType

```rust
pub fn isSendrcvchanType(self: Type) -> bool;
```
## Type::isInt32Type

```rust
pub fn isInt32Type(self: Type) -> bool;
```
## Type::getKind

```rust
pub fn getKind(self: Type) -> int;
```
## Type::is\<T\>

```rust
pub fn is<T>(self: Type) -> bool;
```
## Type::to\<T\>

```rust
pub fn to<T>(self: Type) -> <any>;
```
## Type::key\_neq

```rust
pub fn key_neq(self: Type, object: <any>) -> bool;
```
## Type::key\_eq

```rust
pub fn key_eq(self: Type, object: <any>) -> bool;
```
## Type::to\_set

```rust
pub fn to_set(self: Type) -> *Type;
```
