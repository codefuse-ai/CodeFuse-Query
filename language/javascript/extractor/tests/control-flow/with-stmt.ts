function test() {
  with ([1, 2, 3]) {
    console.log(toString()); // 1,2,3
  }

  // with (1) {
  //     console.log(toString())
  // }
}
