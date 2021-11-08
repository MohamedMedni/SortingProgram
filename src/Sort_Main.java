public class Sort_Main {

    public static void main(int[] args) {
            Sorter.sort(args); // calling sort method from Sorter.java
            System.out.println();
    }

    public static void main(String[] args) {
        int row = args.length;     // Initialize the array row
        int [] arr = new int [row];
        for ( int i = 0; i < row; i++ ) {
            try {
                arr[i] = Integer.parseInt(args[i]); // Convert integer
            } catch (NumberFormatException e) {
                System.err.println("Failed trying to parse a non-numeric argument, " + arr[i]);
               }
            }
          main(arr); // calling main method
        }

}
