function test_try_catch(i: number) {
  i = 0;
  try {
    i = 1;
  } catch (error) {
    i = 2;
    console.error(i);
  }
  i = -1;
}

function test_try_catch_finally(i: number) {
  i = 0;
  try {
    i = 1;
  } catch (error) {
    i = 2;
    console.error(i);
  } finally {
    i = 3;
  }
  i = -1;
}
