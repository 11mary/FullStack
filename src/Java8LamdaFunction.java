interface A11
{
    void demo();
}
public class Java8LamdaFunction {
    public static void main(String[] args) {
        A11 obj=()-> System.out.println("Mary");
        obj.demo();
    }
}
//lamda function
/* interface A11
* {
* void demo(int a);
* {
* public class Java8LamdaFunction{
* public static void main(String[] args) {
* A11 obj=(a)-> System.out.println("Mary"+a);
* obj.demo(a);
* }
* }*/