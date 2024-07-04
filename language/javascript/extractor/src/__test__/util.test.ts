import { hashToInt64 } from '../util';

describe(hashToInt64, () => {
  test('hashToInt64', () => {
    expect(hashToInt64('test')).toBe(2975348720976108454n);
    expect(hashToInt64('jest')).toBe(-7710744583274308193n);
  });
});
