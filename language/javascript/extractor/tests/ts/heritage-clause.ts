interface Animal {
  name: string;
}

interface Bear extends Animal {
  honey: boolean;
}

class Cat implements Animal {
  name = 'Cat';
}
