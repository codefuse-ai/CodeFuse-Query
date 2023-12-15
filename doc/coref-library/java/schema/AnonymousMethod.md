# AnonymousMethod

Inherit from [Callable](./Callable.md)

Primary key: `id: int`

```rust
schema AnonymousMethod extends Callable {
  @primary id: int
}
```
## AnonymousMethod::getLocation

```java
/**
* @brief gets the location for the element.
* @return Location
*/
```
```rust
pub fn getLocation(self: AnonymousMethod) -> Location;
```
## AnonymousMethod::getCalleeFromAnonymousMethod

```java
/**
* @brief gets the extra callee from enclosed anonymous method.
* @return callee 
*/
```
```rust
pub fn getCalleeFromAnonymousMethod(self: AnonymousMethod) -> *Callable;
```
## AnonymousMethod::getModifier

```java
/**
* @brief gets the modifier of the callable.
* @return Modifier 
*/
```
```rust
pub fn getModifier(self: AnonymousMethod) -> *Modifier;
```
## AnonymousMethod::getNonAnonymousEnclosingCallable

```java
/**
* @brief gets the non anonymous enclosing callable of the element.
* @return Callable. 
*/
```
```rust
pub fn getNonAnonymousEnclosingCallable(self: AnonymousMethod) -> Callable;
```
## AnonymousMethod::getName

```java
/**
* @brief gets the name of the callable
* @return string 
*/
```
```rust
pub fn getName(self: AnonymousMethod) -> string;
```
## AnonymousMethod::getParameter

```java
/**
* @brief gets the parameter of the method, if any.
* @return Parameter 
*/
```
```rust
pub fn getParameter(self: AnonymousMethod) -> *Parameter;
```
## AnonymousMethod::getCaller

```java
/**
* @brief gets the caller of the callable
* @return Callable 
*/
```
```rust
pub fn getCaller(self: AnonymousMethod) -> *Callable;
```
## AnonymousMethod::getBody

```java
/**
* @brief gets the body of the method.
* @return CodeBlock 
*/
```
```rust
pub fn getBody(self: AnonymousMethod) -> CodeBlock;
```
## AnonymousMethod::getAnnotation

```java
/**
* @brief gets the annotation of the Callable element.
* @return Annotation 
*/
```
```rust
pub fn getAnnotation(self: AnonymousMethod) -> *Annotation;
```
## AnonymousMethod::getSignature

```java
/**
* @brief gets the name of the callable
* @return string 
*/
```
```rust
pub fn getSignature(self: AnonymousMethod) -> string;
```
## AnonymousMethod::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavaDB) -> *AnonymousMethod;
```
## AnonymousMethod::getType

```java
/**
* @brief gets the name of the callable
* @return string 
*/
```
```rust
pub fn getType(self: AnonymousMethod) -> Type;
```
## AnonymousMethod::getEnclosedAnonymousMethod

```java
/**
* @brief gets the anonymous method enclosed by it.
* @return AnonymousMethod 
*/
```
```rust
pub fn getEnclosedAnonymousMethod(self: AnonymousMethod) -> *AnonymousMethod;
```
## AnonymousMethod::getReturnType

```java
/**
* @brief gets the type for the element.
* @return Type
*/
```
```rust
pub fn getReturnType(self: AnonymousMethod) -> Type;
```
## AnonymousMethod::getBelongedInterface

```java
/**
* @brief gets the parent of the Callable element.
* @return Interface 
*/
```
```rust
pub fn getBelongedInterface(self: AnonymousMethod) -> Interface;
```
## AnonymousMethod::getSize

```java
/**
* @brief gets the size for the element.
* @return NumberOfLines
*/
```
```rust
pub fn getSize(self: AnonymousMethod) -> NumberOfLines;
```
## AnonymousMethod::getPolyCallable

```java
/**
* @brief gets the polymorphism methods of the method, if any.
* @return Method 
*/
```
```rust
pub fn getPolyCallable(self: AnonymousMethod) -> *Callable;
```
## AnonymousMethod::getCallee

```java
/**
* @brief gets the callee of the callable
* @return Callable 
*/
```
```rust
pub fn getCallee(self: AnonymousMethod) -> *Callable;
```
## AnonymousMethod::getAnAncestorCaller

```java
/**
* @brief gets an ancestor caller of the callable, if any
* @return Callable 
*/
```
```rust
pub fn getAnAncestorCaller(self: AnonymousMethod) -> *Callable;
```
## AnonymousMethod::getBelongedClass

```java
/**
* @brief gets the parent of the Callable element.
* @return ClassOrInterface 
*/
```
```rust
pub fn getBelongedClass(self: AnonymousMethod) -> ClassOrInterface;
```
## AnonymousMethod::getAnAncestor

```java
/**
* @brief gets an ancestor of the element.
* @return ElementParent 
*/
```
```rust
pub fn getAnAncestor(self: AnonymousMethod) -> *ElementParent;
```
## AnonymousMethod::getAnAncestorCallee

```java
/**
* @brief gets an ancestor callee of the callable, if any
* @return Callable 
*/
```
```rust
pub fn getAnAncestorCallee(self: AnonymousMethod) -> *Callable;
```
## AnonymousMethod::getEnclosingCallable

```java
/**
* @brief gets the enclosing callable of the element, if any, the enclosing callable may be an anonymousMethod as well.
* @return Callable. 
*/
```
```rust
pub fn getEnclosingCallable(self: AnonymousMethod) -> Callable;
```
