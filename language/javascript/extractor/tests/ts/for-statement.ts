let i = 0;

for (; i < 5; i++) {
  console.log(i);
}

for (i = 0; ; ) {
  console.log(i);

  if (i === 1) {
    continue;
  }

  if (i > 4) {
    break;
  }

  i++;
}
