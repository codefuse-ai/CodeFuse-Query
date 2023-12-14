# Callable

Primary key: `id: int`

```rust
schema Callable {
  @primary id: int,
}
```
## Callable::getAnAncestorCallee

```java
/**
* @brief gets an ancestor callee of the callable, if any
* @return Callable 
*/
```
```rust
pub fn getAnAncestorCallee(self: Callable) -> *Callable;
```
## Callable::getCallee

```java
/**
* @brief gets the callee of the callable
* @return Callable 
*/
```
```rust
pub fn getCallee(self: Callable) -> *Callable;
```
## Callable::getAnAncestorCaller

```java
/**
* @brief gets an ancestor caller of the callable, if any
* @return Callable 
*/
```
```rust
pub fn getAnAncestorCaller(self: Callable) -> *Callable;
```
## Callable::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: Callable) -> *ElementParent;
```
## Callable::getName

```java
/**
* @brief gets the name of the callable
* @return string 
*/
```
```rust
pub fn getName(self: Callable) -> string;
```
## Callable::getBelongedClass

```java
/**
* @brief gets the parent of the Callable element.
* @return ClassOrInterface 
*/
```
```rust
pub fn getBelongedClass(self: Callable) -> ClassOrInterface;
```
## Callable::getPolyCallable

```java
/**
* @brief gets the polymorphism methods of the method, if any.
* @return Method 
*/
```
```rust
pub fn getPolyCallable(self: Callable) -> *Callable;
```
## Callable::getSize

```java
/**
* @brief gets the size for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: Callable) -> NumberOfLines;
```
## Callable::getBelongedInterface

```java
/**
* @brief gets the parent of the Callable element.
* @return Interface 
*/
```
```rust
pub fn getBelongedInterface(self: Callable) -> Interface;
```
## Callable::getReturnType

```java
/**
* @brief gets the type for the element.
* @return Type
*/
```
```rust
pub fn getReturnType(self: Callable) -> Type;
```
## Callable::getParameter

```java
/**
* @brief gets the parameter of the method, if any.
* @return Parameter 
*/
```
```rust
pub fn getParameter(self: Callable) -> *Parameter;
```
## Callable::getEnclosedAnonymousMethod

```java
/**
* @brief gets the anonymous method enclosed by it.
* @return AnonymousMethod 
*/
```
```rust
pub fn getEnclosedAnonymousMethod(self: Callable) -> *AnonymousMethod;
```
## Callable::getType

```java
/**
* @brief gets the name of the callable
* @return string 
*/
```
```rust
pub fn getType(self: Callable) -> Type;
```
## Callable::getBody

```java
/**
* @brief gets the body of the method.
* @return CodeBlock 
*/
```
```rust
pub fn getBody(self: Callable) -> CodeBlock;
```
## Callable::getSignature

```java
/**
* @brief gets the name of the callable
* @return string 
*/
```
```rust
pub fn getSignature(self: Callable) -> string;
```
## Callable::getAnnotation

```java
/**
* @brief gets the annotation of the Callable element.
* @return Annotation 
*/
```
```rust
pub fn getAnnotation(self: Callable) -> *Annotation;
```
## Callable::getCaller

```java
/**
* @brief gets the caller of the callable
* @return Callable 
*/
```
```rust
pub fn getCaller(self: Callable) -> *Callable;
```
## Callable::getModifier

```java
/**
* @brief gets the modifier of the callable.
* @return Modifier 
*/
```
```rust
pub fn getModifier(self: Callable) -> *Modifier;
```
## Callable::getCalleeFromAnonymousMethod

```java
/**
* @brief gets the extra callee from enclosed anonymous method.
* @return callee 
*/
```
```rust
pub fn getCalleeFromAnonymousMethod(self: Callable) -> *Callable;
```
## Callable::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: Callable) -> Location;
```
## Callable::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *Callable;
```
