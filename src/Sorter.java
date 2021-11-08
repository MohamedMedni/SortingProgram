public class Sorter {
    public static void sort(int[] unsorted) {
        for (int i = 0; i < unsorted.length; i++) {
            int temp;
            for (int j = 0; j < unsorted.length; j++) {
                if (unsorted[i] < unsorted[j]){
                    temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }

       for (int i = 0; i < unsorted.length - 1; i++) {
           System.out.print(unsorted[i] + " ");
       }
          System.out.print(unsorted[unsorted.length - 1]);
    }
}
