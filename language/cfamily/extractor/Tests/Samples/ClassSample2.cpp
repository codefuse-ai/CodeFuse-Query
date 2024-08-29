
#include <iostream>
using namespace std;
class A {
  public:
    void hello() { cout << "hello world.\n"; }
    //    void hello2(int i, float i2){
    //        cout << i << "\n";
    //        cout << i2 << "\n";
    //    }
    static void static_hello() { cout << "static hello world.\n"; }
};

class B {
  private:
    A m_a;

  public:
    //    void call1(){
    //        A a;
    //        a.hello();
    //    }
    //    void call2(){
    //        A* a = new A;
    //        a->hello();
    //    }
    //    void call3(A* a){
    //        a->hello();
    //    }
    //    void call4(A& a){
    //        int i = 0;
    //        float f = 1.0;
    //        a.hello2(i, f);
    //    }
    //    void call5(){
    //        m_a.hello();
    //    }
    void call6() { A::static_hello(); }
};

int main() {
    //    B b;
    //    b.call1();
    //    b.call2();
    //    b.call3();
    //    b.call4();
    //    b.call5();
    //    b.call6();
}
