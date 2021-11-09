import org.junit.Test;
import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void SortTest1() {
        int[] arr = {2, 4, 1};
        int[] expected = {1, 2, 4};
        Sorter.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void SortTest2() {
        Sorter sorter= new Sorter();
        int[] arr = {55, -11,-50,100};
        int[] expected = {-50, -55, 55,100};
        Sorter.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void SortTest3() {
        Sorter sorter= new Sorter();
        int[] arr = {10,2, 33 };
        int[] expected = {2,10,33};
        Sorter.sort(arr);
        assertArrayEquals(expected, arr);

    }

    @Test
    public void SortTest4() {
        Sorter sorter= new Sorter();
        int[] arr = {-55, 100};
        int[] expected = {100, 100};
        Sorter.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void SortTest5() {
        Sorter sorter= new Sorter();
        int[] arr = {-55, -20,-1, 8, 20,40, 55,100};
        int[] expected = {-55, -20,-1, 8, 20,40, 55,100};
        Sorter.sort(arr);
        assertArrayEquals(expected, arr);
    }

}
