import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num frm 1 to 100");
        int a= sc.nextInt();
        int grade=a/10;
        switch(grade)
        {
            case 10:
            System.out.println("A+ grade");
            break;
            case 9:
                System.out.println("A grade");
                break;
            case 8:
                System.out.println("B grade");
                break;
            case 7:
                System.out.println("C grade");
                break;
            default:
                System.out.println("Fail");

        }
    }
}
