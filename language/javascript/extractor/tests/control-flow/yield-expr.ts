function* test(arg: number | string) {
  if (arg == 1) {
    yield 2;
  }
  arg = 2;
}
