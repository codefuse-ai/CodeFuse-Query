function* test(arg: number | string) {
  (arg as string) += '';
  console.log(arg);
}
