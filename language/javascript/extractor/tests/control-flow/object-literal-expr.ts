function test() {
  let obj = {
    id: 5,
    name: 'www',
    dump() {
      console.log(this.id);
    },
  };

  obj.dump();
}
