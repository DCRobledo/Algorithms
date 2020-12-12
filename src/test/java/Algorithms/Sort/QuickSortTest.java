package Algorithms.Sort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;    
    
public class QuickSortTest {
    QuickSort qs;

    int array[] = {1, 4, 2, 7, 4, -10, 20, -3};
    int expected[] = {-10, -3, 1, 2, 4, 4, 7, 20};

    @Before
    public void setup(){
        qs = new QuickSort();
    }
        
    @Test
    public void quickSortTest() {
        qs.quickSort(array);

        assertArrayEquals(expected, array);
    }
}
    