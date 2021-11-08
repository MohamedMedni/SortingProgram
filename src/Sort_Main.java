public class Sort_Main {

    public static void main(int[] args) {
            Sorter.sort(args); // calling sort method from Sorter.java
            System.out.println();
    }

    public static void main(String[] args) {
        int row = args.length;     // Initialize the array row
        int [] arr = new int [row];
        for ( int i = 0; i < row; i++ ) {
            arr[i] = Integer.parseInt(args[i]); // Convert integer
        }
          main(arr); // calling main method
        }

}
