package Algorithms.Search;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;    
    
public class BinarySearchTest {
    BinarySearch bs;

    public int[] array = {-3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8};

    @Before
    public void setup(){
        bs = new BinarySearch();
    }
        
    @Test
    public void binarySearchCorrectTest() {
        assertEquals(2, bs.binarySearch(array, -1));
    }

    @Test
    public void binarySearchWrongTest() {
        assertEquals(-1, bs.binarySearch(array, 10));
    }
}
    