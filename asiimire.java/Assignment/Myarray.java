package Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Myarray {
    public static void main(String[] args) {
        int m=4;
        Scanner scan=new Scanner(System.in);
        int [] arrays=new int[m];
        System.out.println("enter the first number");
        arrays[0]=scan.nextInt();
        System.out.println("enter the next number");
        arrays[1]=scan.nextInt();
        System.out.println("the array is "+Arrays.toString(arrays));
    }
    
}
