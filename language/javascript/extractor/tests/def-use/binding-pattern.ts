const [, a, , b = 4] = [1, 2, 3];
const { x, b: y, ...z } = { x: 1, b: 2, c: 3, d: 4 };

console.log(a);
console.log(b);
console.log(x);
console.log(y);
console.log(z);
