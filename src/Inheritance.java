class Parent { //parent class

    void C() {
        System.out.println("Parent feature");
    }
}
    class child extends Parent {

        void C() {
            System.out.println("Child feature");
        }

    void M()
    {
        System.out.println("Extra feature");
    }

}
public class Inheritance {
    public static void main(String[] args) {
        child obj=new child();
        obj.C();
        obj.M();

    }
}
