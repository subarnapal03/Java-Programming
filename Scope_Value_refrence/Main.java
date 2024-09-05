package Scope_Value_refrence;
class Algebra {
    int a = 10; //Member level scope
    int b = 5; //Member level scope

    int add() {
        int p = 20; //Method level scope
        int q = 30; //Method level scope
    return p + q;
    }
    int sub(){
        return a - b;
    }
}
public class Main {

}
