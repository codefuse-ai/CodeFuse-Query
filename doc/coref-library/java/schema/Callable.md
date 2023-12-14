# Callable

Primary key: `id: int`

```rust
schema Callable {
  @primary id: int,
}
```
## Callable::getAnAncestorCallee

```rust
/**
     * @brief gets an ancestor callee of the callable, if any
     * @return Callable 
     */
```
```rust
pub fn getAnAncestorCallee(self: Callable) -> *Callable;
```
## Callable::getCallee

```rust
/**
     * @brief gets the callee of the callable
     * @return Callable 
     */
```
```rust
pub fn getCallee(self: Callable) -> *Callable;
```
## Callable::getAnAncestorCaller

```rust
/**
     * @brief gets an ancestor caller of the callable, if any
     * @return Callable 
     */
```
```rust
pub fn getAnAncestorCaller(self: Callable) -> *Callable;
```
## Callable::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: Callable) -> *ElementParent;
```
## Callable::getName

```rust
/**
     * @brief gets the name of the callable
     * @return string 
     */
```
```rust
pub fn getName(self: Callable) -> string;
```
## Callable::getBelongedClass

```rust
/**
     * @brief gets the parent of the Callable element.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getBelongedClass(self: Callable) -> ClassOrInterface;
```
## Callable::getPolyCallable

```rust
/**
     * @brief gets the polymorphism methods of the method, if any.
     * @return Method 
     */
```
```rust
pub fn getPolyCallable(self: Callable) -> *Callable;
```
## Callable::getSize

```rust
/**
     * @brief gets the size for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: Callable) -> NumberOfLines;
```
## Callable::getBelongedInterface

```rust
/**
     * @brief gets the parent of the Callable element.
     * @return Interface 
     */
```
```rust
pub fn getBelongedInterface(self: Callable) -> Interface;
```
## Callable::getReturnType

```rust
/**
     * @brief gets the type for the element.
     * @return Type
     */
```
```rust
pub fn getReturnType(self: Callable) -> Type;
```
## Callable::getParameter

```rust
/**
     * @brief gets the parameter of the method, if any.
     * @return Parameter 
     */
```
```rust
pub fn getParameter(self: Callable) -> *Parameter;
```
## Callable::getEnclosedAnonymousMethod

```rust
/**
     * @brief gets the anonymous method enclosed by it.
     * @return AnonymousMethod 
     */
```
```rust
pub fn getEnclosedAnonymousMethod(self: Callable) -> *AnonymousMethod;
```
## Callable::getType

```rust
/**
     * @brief gets the name of the callable
     * @return string 
     */
```
```rust
pub fn getType(self: Callable) -> Type;
```
## Callable::getBody

```rust
/**
     * @brief gets the body of the method.
     * @return CodeBlock 
     */
```
```rust
pub fn getBody(self: Callable) -> CodeBlock;
```
## Callable::getSignature

```rust
/**
     * @brief gets the name of the callable
     * @return string 
     */
```
```rust
pub fn getSignature(self: Callable) -> string;
```
## Callable::getAnnotation

```rust
/**
     * @brief gets the annotation of the Callable element.
     * @return Annotation 
     */
```
```rust
pub fn getAnnotation(self: Callable) -> *Annotation;
```
## Callable::getCaller

```rust
/**
     * @brief gets the caller of the callable
     * @return Callable 
     */
```
```rust
pub fn getCaller(self: Callable) -> *Callable;
```
## Callable::getModifier

```rust
/**
     * @brief gets the modifier of the callable.
     * @return Modifier 
     */
```
```rust
pub fn getModifier(self: Callable) -> *Modifier;
```
## Callable::getCalleeFromAnonymousMethod

```rust
/**
     * @brief gets the extra callee from enclosed anonymous method.
     * @return callee 
     */
```
```rust
pub fn getCalleeFromAnonymousMethod(self: Callable) -> *Callable;
```
## Callable::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: Callable) -> Location;
```
## Callable::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *Callable;
```
## Callable::is\<T\>

```rust
pub fn is<T>(self: Callable) -> bool;
```
## Callable::to\<T\>

```rust
pub fn to<T>(self: Callable) -> <any>;
```
## Callable::key\_neq

```rust
pub fn key_neq(self: Callable, object: <any>) -> bool;
```
## Callable::key\_eq

```rust
pub fn key_eq(self: Callable, object: <any>) -> bool;
```
## Callable::to\_set

```rust
pub fn to_set(self: Callable) -> *Callable;
```
