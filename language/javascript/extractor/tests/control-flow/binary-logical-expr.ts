function test(arg: number) {
  if (arg > 0 && arg < 100) {
    if (arg < 10 || arg > 2) {
      arg += 5;
    }
  } else {
    arg += 1;
  }
  let x = arg ?? 1;
  console.log(arg);
  console.log(x);
}
