class TestClass {
  f1: string;
  f2: number;

  constructor(f1: string, f2: number) {
    this.f1 = f1;
    this.f2 = f2;
  }
}

function test() {
  let tc = new TestClass('h', 2);
  console.log(tc);
}
