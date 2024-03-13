package Assignment;
import java.util.*;
public class Arrays {
    public static void main (String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of array elements");//prompts the user to enter the size of the array
		int x=scan.nextInt();
		int [] array =new int[x];
		System.out.println("enter all elements: ");//prompts for entry of array elements
		for(int i=0;i<x;i++){
			array[i]=scan.nextInt();
		}
		for(int i=0;i<x;i++){
			for(int k=i+1;k<x;k++){
				if(array[i]>array[k]){
					int m=array[i];//if k is greater than ithen i will swap them with m 
					array[i]=array[k];
					array[k]=m;
				}
			}
		}
		System.out.println("sorted list");
		for(int i=0;i<x-1;i++){
			System.out.println(array[i]);
		}
		System.out.println(array[x-1]);
		}}