public class Sorter {
    public static int[] sort(int[] unsorted) {
        int temp = 0;
        for (int i = 0; i < unsorted.length; i++) {
            for (int j = i + 1; j < unsorted.length; j++) {
                if (unsorted[j] < unsorted[i]) {
                    temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }
        return unsorted;
    }
}
