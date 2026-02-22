import java.util.Scanner;
public class MultiDimensionalArray {
    public static void main(String[] args) {
        //user input for 2D array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        //input elements of the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element at position (" + i + ", " + j + "):");
                matrix[i][j] = sc.nextInt();
            }
        }
        //output elements of the 2D array
        System.out.println("The elements in the 2D array are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");   
            }
        }
    }
}
