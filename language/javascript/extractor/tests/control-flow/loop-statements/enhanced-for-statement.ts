async function test() {
  const arr = [3, 5, 7];
  arr.foo = 'hello';

  for (const i in arr) {
    console.log(i);
  }
  // "0" "1" "2" "foo"

  for await (const j of arr) {
    console.log(j);
  }
  // 3 5 7
}
