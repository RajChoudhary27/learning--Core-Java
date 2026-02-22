public class JaggedArray {
    public static void main(String[] args) {
        // Jagged Array Example in Java
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[]{1, 2, 3};
        jaggedArray[1] = new int[]{4, 5};
        jaggedArray[2] = new int[]{6, 7, 8, 9};
        //or
        // jaggedArray[0] = new int[3];
        // jaggedArray[1] = new int[2];
        // jaggedArray[2] = new int[4];


        //user input for jagged array

        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < jaggedArray.length; i++) {
        //     System.out.println("Enter the size of row " + i + ":");
        //     int size = sc.nextInt();
        //     jaggedArray[i] = new int[size];
        //     for (int j = 0; j < size; j++) {
        //         System.out.println("Enter element at position (" + i + ", " + j + "):");
        //         jaggedArray[i][j] = sc.nextInt();
        //     }
        // }


        // Accessing elements of the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
