function test() {
  const Rectangle = class {
    height: number;
    width: number;

    constructor(height: number, width: number) {
      this.height = height;
      this.width = width;
    }

    area() {
      return this.height * this.width;
    }
  };

  console.log(new Rectangle(5, 8).area());
}

test();
