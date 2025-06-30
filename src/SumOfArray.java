public class SumOfArray {
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("totyal sum is"+sum);
    }
}
