// Unique Array Elements Check Program

public class UniqueCheck {
    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 2};

        boolean Unique = true;

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    Unique = false;
                    break;
                }
            }
        }

        System.out.println((Unique) ? "All elements are unique" : "Duplicate found");
    }
}