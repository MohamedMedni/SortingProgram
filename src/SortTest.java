public class SortTest {
    public static void main(String[] args) {
        //Test1
        System.out.println("Test1");
        int[] arr1 = Sorter.sort(new int[]{55, -11, -50, 100});
        System.out.println("expected: -50 -11 55 100");
        System.out.print("Received: ");
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i] + " ");
        }

        //Test2
        System.out.println("");
        System.out.println("Test2");
        int[] arr2 = Sorter.sort(new int[]{76, 11, -55, 2, 16, -21, 7, 88});
        System.out.println("expected: -55 -21 2 7 11 16 76 88");
        System.out.print("Received: ");
        for (int i = 0; i < arr2.length ; i++) {
            System.out.print(arr2[i] + " ");
        }

        //Test3
        System.out.println("");
        System.out.println("Test3");
        int[] arr3 = Sorter.sort(new int[]{2, 16, -21, 7, 88});
        System.out.println("expected: -21 2 7 16 88");
        System.out.print("Received: ");
        for (int i = 0; i < arr3.length ; i++) {
            System.out.print(arr3[i] + " ");
        }

        //Test4
        System.out.println("");
        System.out.println("Test4");
        int[] arr4 = Sorter.sort(new int[]{4, -1, 0, -4, 1});
        System.out.println("expected: -4 -1 0 1 4");
        System.out.print("Received: ");
        for (int i = 0; i < arr4.length ; i++) {
            System.out.print(arr4[i] + " ");
        }

        //Test5
        System.out.println("");
        System.out.println("Test5");
        int[] arr5 = Sorter.sort(new int[]{10, 1, -29, 5, 89, 22});
        System.out.println("expected: -29 1 5 10 22 89");
        System.out.print("Received: ");
        for (int i = 0; i < arr5.length ; i++) {
            System.out.print(arr5[i] + " ");
        }
    }

}
