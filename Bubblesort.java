package java_training_and_placement;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of array: \n");
        int size=s.nextInt();
        int []a=new int[size];
        System.out.println("enter the array:");
        for (int i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("you entered array is");
        Arrays.sort(a);
        for(int b:a){
            System.out.println(b);
        }

    }
}
