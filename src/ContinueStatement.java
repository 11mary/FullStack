public class ContinueStatement {
    public static void main(String[] args) {
        int x=10;
        while(x<15)
        {
            x++;
            if(x==12)
            {
                continue;
            }
            System.out.println(x);

        }
    }
}
