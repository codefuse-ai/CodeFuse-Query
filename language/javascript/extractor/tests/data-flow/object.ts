const prop1 = {
  a: 'a',
  o: {
    x: 'x',
    y: 'y',
  },
};

const { result: prop2 } = getResult();

const {
  result: {
    config: { m },
  },
} = {
  result: {
    config: {
      m: 'm',
    },
  },
};

const otherProps = {
  prop4: 'prop4',
  prop5: prop1,
};

otherProps.prop6 = 'prop6';

const result = {
  prop1,
  prop2,
  prop3: m,
  ...otherProps,
};
