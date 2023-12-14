# AnonymousMethod

Primary key: `id: int`

```rust
schema AnonymousMethod {
  @primary id: int,
}
```
## AnonymousMethod::getLocation

```rust
/**
     * @brief gets the location for the element.
     * @return Location
     */
```
```rust
pub fn getLocation(self: AnonymousMethod) -> Location;
```
## AnonymousMethod::getCalleeFromAnonymousMethod

```rust
/**
     * @brief gets the extra callee from enclosed anonymous method.
     * @return callee 
     */
```
```rust
pub fn getCalleeFromAnonymousMethod(self: AnonymousMethod) -> *Callable;
```
## AnonymousMethod::getModifier

```rust
/**
     * @brief gets the modifier of the callable.
     * @return Modifier 
     */
```
```rust
pub fn getModifier(self: AnonymousMethod) -> *Modifier;
```
## AnonymousMethod::getNonAnonymousEnclosingCallable

```rust
/**
     * @brief gets the non anonymous enclosing callable of the element.
     * @return Callable. 
     */
```
```rust
pub fn getNonAnonymousEnclosingCallable(self: AnonymousMethod) -> Callable;
```
## AnonymousMethod::getName

```rust
/**
     * @brief gets the name of the callable
     * @return string 
     */
```
```rust
pub fn getName(self: AnonymousMethod) -> string;
```
## AnonymousMethod::getParameter

```rust
/**
     * @brief gets the parameter of the method, if any.
     * @return Parameter 
     */
```
```rust
pub fn getParameter(self: AnonymousMethod) -> *Parameter;
```
## AnonymousMethod::getCaller

```rust
/**
     * @brief gets the caller of the callable
     * @return Callable 
     */
```
```rust
pub fn getCaller(self: AnonymousMethod) -> *Callable;
```
## AnonymousMethod::getBody

```rust
/**
     * @brief gets the body of the method.
     * @return CodeBlock 
     */
```
```rust
pub fn getBody(self: AnonymousMethod) -> CodeBlock;
```
## AnonymousMethod::getAnnotation

```rust
/**
     * @brief gets the annotation of the Callable element.
     * @return Annotation 
     */
```
```rust
pub fn getAnnotation(self: AnonymousMethod) -> *Annotation;
```
## AnonymousMethod::getSignature

```rust
/**
     * @brief gets the name of the callable
     * @return string 
     */
```
```rust
pub fn getSignature(self: AnonymousMethod) -> string;
```
## AnonymousMethod::\_\_all\_\_

```rust
pub fn __all__(db: JavaDB) -> *AnonymousMethod;
```
## AnonymousMethod::getType

```rust
/**
     * @brief gets the name of the callable
     * @return string 
     */
```
```rust
pub fn getType(self: AnonymousMethod) -> Type;
```
## AnonymousMethod::getEnclosedAnonymousMethod

```rust
/**
     * @brief gets the anonymous method enclosed by it.
     * @return AnonymousMethod 
     */
```
```rust
pub fn getEnclosedAnonymousMethod(self: AnonymousMethod) -> *AnonymousMethod;
```
## AnonymousMethod::getReturnType

```rust
/**
     * @brief gets the type for the element.
     * @return Type
     */
```
```rust
pub fn getReturnType(self: AnonymousMethod) -> Type;
```
## AnonymousMethod::getBelongedInterface

```rust
/**
     * @brief gets the parent of the Callable element.
     * @return Interface 
     */
```
```rust
pub fn getBelongedInterface(self: AnonymousMethod) -> Interface;
```
## AnonymousMethod::getSize

```rust
/**
     * @brief gets the size for the element.
     * @return NumberOfLines
     */
```
```rust
pub fn getSize(self: AnonymousMethod) -> NumberOfLines;
```
## AnonymousMethod::getPolyCallable

```rust
/**
     * @brief gets the polymorphism methods of the method, if any.
     * @return Method 
     */
```
```rust
pub fn getPolyCallable(self: AnonymousMethod) -> *Callable;
```
## AnonymousMethod::getCallee

```rust
/**
     * @brief gets the callee of the callable
     * @return Callable 
     */
```
```rust
pub fn getCallee(self: AnonymousMethod) -> *Callable;
```
## AnonymousMethod::getAnAncestorCaller

```rust
/**
     * @brief gets an ancestor caller of the callable, if any
     * @return Callable 
     */
```
```rust
pub fn getAnAncestorCaller(self: AnonymousMethod) -> *Callable;
```
## AnonymousMethod::getBelongedClass

```rust
/**
     * @brief gets the parent of the Callable element.
     * @return ClassOrInterface 
     */
```
```rust
pub fn getBelongedClass(self: AnonymousMethod) -> ClassOrInterface;
```
## AnonymousMethod::getAnAncestor

```rust
/**
     * @brief gets an ancestor of the element.
     * @return ElementParent 
     */
```
```rust
pub fn getAnAncestor(self: AnonymousMethod) -> *ElementParent;
```
## AnonymousMethod::getAnAncestorCallee

```rust
/**
     * @brief gets an ancestor callee of the callable, if any
     * @return Callable 
     */
```
```rust
pub fn getAnAncestorCallee(self: AnonymousMethod) -> *Callable;
```
## AnonymousMethod::getEnclosingCallable

```rust
/**
     * @brief gets the enclosing callable of the element, if any, the enclosing callable may be an anonymousMethod as well.
     * @return Callable. 
     */
```
```rust
pub fn getEnclosingCallable(self: AnonymousMethod) -> Callable;
```
## AnonymousMethod::is\<T\>

```rust
pub fn is<T>(self: AnonymousMethod) -> bool;
```
## AnonymousMethod::to\<T\>

```rust
pub fn to<T>(self: AnonymousMethod) -> <any>;
```
## AnonymousMethod::key\_neq

```rust
pub fn key_neq(self: AnonymousMethod, object: <any>) -> bool;
```
## AnonymousMethod::key\_eq

```rust
pub fn key_eq(self: AnonymousMethod, object: <any>) -> bool;
```
## AnonymousMethod::to\_set

```rust
pub fn to_set(self: AnonymousMethod) -> *AnonymousMethod;
```
