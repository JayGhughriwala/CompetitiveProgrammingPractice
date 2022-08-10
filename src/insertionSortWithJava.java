// Insertion sort
// Date Time :- 05:01 PM 10/08/2022 at home
import java.util.Scanner;
public class insertionSortWithJava {
    public static void insertionSortMeth(int[] arr)
    {
        int n = arr.length;
        for(int i=1;i<n;i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;
        }
    }
    public static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        // Now Entering a values from the user in an array
        for(int i=0;i<array.length;i++)
        {
            System.out.print("Enter the value of the array[\"i+1\"] --> ");
            array[i] = sc.nextInt();
        }
        // Now I am calling a insertion Sort Method
        System.out.println("Before Sorting -- > ");
        printArray(array);
        insertionSortMeth(array);
        System.out.println("\nAfter Sorting -- > ");
        printArray(array);
    }
}
