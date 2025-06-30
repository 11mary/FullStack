class Student {
    String name="mary";
    int age=22;
}
class dog{
    String name="azuu";
    int age=30;
    String breed="Lab";
}
public class Classobject{
    public static void main(String[] args) {
        Student obj=new Student();
        dog obj1=new dog();
        System.out.println("Student name is " +obj.name);
        System.out.println("Student age is " +obj.age);
        System.out.println("Dog name is " +obj1.name);
        System.out.println("Dog age is " +obj1.age);
        System.out.println("Dog breed is " +obj1.breed);


    }

}