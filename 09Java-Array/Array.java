import java.util.Scanner;
public class Array {
   public static void main(String[] args) {
    //Array Example in Java

    // int[] numbers = {1, 2, 3, 4, 5};
    // // Accessing elements of the array
    // System.out.println("First element: " + numbers[0]);
    // System.out.println("Second element: " + numbers[1]);

    // for (int i = 0; i < numbers.length; i++) {
    //     System.out.println("Element at index " + i + ": " + numbers[i]);
    // }
     Scanner sc = new Scanner(System.in);
    //user input array
    System.out.println("Enter the size of the array:");
    int n=sc.nextInt();
    int[] arr= new int[n];
    for(int i=0;i<n;i++){
        System.out.println("Enter element "+(i+1)+":");
        arr[i]=sc.nextInt();
    }
    System.out.println("The elements in the array are:");
    for(int i=0;i<n;i++){
        System.out.println(arr[i]); 
    }

   } 
}
/*
* What is an Array in Java?
An array in Java is a data structure that can hold a fixed number of values of the same type. It is a container object that allows you to store multiple values in a single variable, instead of declaring separate variables for each value. Arrays in Java are zero-indexed, meaning that the first element is accessed with index 0, the second element with index 1, and so on.

? Key features of arrays in Java:
1. Fixed Size: Once an array is created, its size cannot be changed. You must specify the size of the array when you create it.
2. Homogeneous: All elements in an array must be of the same type (e.g., int, double, String).
3. Zero-Indexed: The first element of the array is accessed with index 0, the second element with index 1, and so on.
4. Contiguous Memory: Arrays are stored in contiguous memory locations, which allows for efficient access to elements.
5. Multidimensional Arrays: Java supports multidimensional arrays, which are arrays of arrays (e.g., 2D arrays, 3D arrays).
6. Array Length: The length of an array can be obtained using the length property (e.g., arr.length).

Types of Arrays in Java:
1. One-Dimensional Arrays: A simple array that holds a single list of values (e.g., int[] numbers = {1, 2, 3, 4, 5};).
2. Multidimensional Arrays: Arrays that hold arrays as their elements (e.g., int[][] matrix = {{1, 2}, {3, 4}};).
3. Jagged Arrays: Arrays of arrays where the inner arrays can have different lengths (e.g., int[][] jaggedArray = {{1, 2}, {3, 4, 5}};).

*/
