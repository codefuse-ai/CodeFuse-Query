
#include <iostream>

using namespace std;

class ForwardDeclarationClass;

class Animal;

class Animal {
    virtual void eat() = 0;
};

class Fish : Animal {
    virtual void eat() { cout << "Fish eat." << endl; }
    virtual void swim() { cout << "Fish swim." << endl; }
};

class Human : Animal {
    virtual void eat() { cout << "Human eat." << endl; }
    virtual void talk() { cout << "Human talk." << endl; }
};

class Mermaid : Fish, Human {
  public:
    void eat() { cout << "Mermaid eat." << endl; }
    void talk() { cout << "Mermaid talk." << endl; }
    void swim() { cout << "Mermaid swim." << endl; }
};

void hello();
void greet(string name);

extern int bar;
int bar = 10086;

void hello() { cout << "Hello World!" << endl; }

void greet(string name) { cout << "Hello " << name << endl; }

auto main() -> int {
    hello();
    string name = "Sparrow";
    greet(name);

    Mermaid m;
    m.eat();
    m.swim();
    m.talk();

    cout << "bar: " << bar << endl;

    return 0;
}