function test_case_body_is_not_block(i: number) {
  let x = 0;
  switch (i) {
    case 1:
      x = 1;
      x = -1;
    case 2:
      x = 2;
      x = -2;
    default:
      x = 666;
      x = -666;
  }
  console.log(x);
}

function test_with_break(i: number) {
  let x = 0;
  switch (i) {
    case 1:
      x = 1;
      break;
    case 2:
      x = 2;
    default:
      x = 666;
  }
  console.log(x);
}
