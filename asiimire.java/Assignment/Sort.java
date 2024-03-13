package Assignment;
import java.util.Scanner;
import java.util.Arrays;
public class  Sort {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=scan.nextInt();
        int [] array =new int[n];
		System.out.println("enter all elements: ");
        for(int i=0;i<n;i++){//i means index
            array[i]=scan.nextInt();
        }
        
        System.out.println("the elements of the array are: "+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("the sorted array is "+Arrays.toString(array));
    }
    
}
