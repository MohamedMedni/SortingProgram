import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        //test 1
        System.out.println("test 1");
        int[] arr1 = {30, 0, 4, 100};
        int[] expected = {30, 0, 4, 100};
        test(arr1, expected);

        //test 2
        System.out.println("test 2");
        int[] arr2 = {20, 0, -4, 100, 30};
        int[] expected2 = {-4, 0, 20, 30, 100};
        test(arr2, expected2);

        //test 3
        System.out.println("test 3");
        int[] arr3 = {};
        int[] expected3 = {};
        test(arr3, expected3);

        //test 4
        System.out.println("test 4");
        int[] arr4 = {-55, -2, -4};
        int[] expected4 = {-55, -4, -2};
        test(arr4, expected4);

        //test 5
        System.out.println("test 5");
        int[] arr5 = {33, 11, 1, 4};
        int[] expected5 = {11, 1, 33, 4};
        test(arr5, expected5);
    }

        public static void test(int[] arr, int[] expected) {
            Sorter.sort(arr);
            System.out.println("Reserved: " + Arrays.toString(arr));
            System.out.println("expected: " + Arrays.toString(expected));
            if(Arrays.equals(arr,expected)){
                System.out.println("Success result");
            }
            if(!Arrays.equals(arr,expected)){
                System.out.println("Failed result");
            }
        }

}
