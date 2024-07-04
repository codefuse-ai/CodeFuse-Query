function test(arg: number | string) {
  // arg type: number, string
  if (typeof arg === 'number') {
    // arg type is narrowed to: number
    if (arg == 0) {
      arg += 1;
    }
  } else {
    // arg type is narrowed to: string
    arg += 'xy';
  }
  console.log(arg);
}
