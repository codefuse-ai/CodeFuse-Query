function test() {
  let i = 0;

  while (i < 5) {
    if (i === 1) {
      continue;
    }

    if (i < 3) {
      break;
    }

    if (i > 4) {
      return;
    }

    console.log(i);
    i++;
  }
}
