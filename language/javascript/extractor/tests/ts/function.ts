function greeter(fn: <TypeA, TypeB>(a: TypeA, b: TypeB) => TypeA) {
  fn('Hello', 'World');
}

function printToConsole<TypeA, TypeB>(a: TypeA, b: TypeB): TypeA {
  console.log(a, b);
  return a;
}

greeter(printToConsole);
