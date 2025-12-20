public class MultidimensionalArray {
    public static void main (String[] args) {
        int[][] arr = {{1, 3, 5},
                       {7, 4, 54, 53, 23},
                       {12, 32, 9, 0,}};


        // prints length of evrery array row.
        System.out.println("Length of Row 1: " + arr[0].length);
        System.out.println("Length of Row 2: " + arr[1].length);
        System.out.println("Length of Row 3: " + arr[2].length);
    }
}