async function test(arg: number | string) {
  const num = await Promise.resolve(42);
  return num;
}
