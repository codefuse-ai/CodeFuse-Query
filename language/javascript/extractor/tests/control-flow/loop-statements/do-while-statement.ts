function test() {
  let i = 0;
  do {
    if (i === 1) {
      continue;
    }

    console.log(i);

    if (i < 3) {
      break;
    }

    if (i > 5) {
      return;
    }

    i += 1;
  } while (i < 4);
}
