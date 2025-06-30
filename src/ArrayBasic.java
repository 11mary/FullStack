public class ArrayBasic {
    public static void main(String[] args) {
        int array[] = {7,11,17,5,9,4,56,7};
        array[5]=10; //modify ----array[index number]=changing value
        for( int i=0; i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}