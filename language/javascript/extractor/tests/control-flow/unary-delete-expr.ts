interface Object {
  x?: number;
}

function test(arg: Object) {
  delete arg.x;
  let x = 1;
}
