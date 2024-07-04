function test() {
  for (let i = 0; i < 3; i++) {
    console.log(i);
  }

  for (let j = 0; j < 4; ) {
    console.log(j);
    j++;
  }

  let k = 0;
  for (; ; k++) {
    if (k > 5) {
      break;
    }
    console.log(k);
  }
}
