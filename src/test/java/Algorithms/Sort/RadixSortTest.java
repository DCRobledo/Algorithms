package Algorithms.Sort;
import org.junit.Test;
import org.junit.Before;    
    
public class RadixSortTest {
    RadixSort rs;

    int array[] = {1, 4, 2, 7, 4, -10, 20, -3};
    int expected[] = {-10, -3, 1, 2, 4, 4, 7, 20};

    @Before
    public void setup(){
        rs = new RadixSort();
    }
        
    @Test
    public void test() {
        
    }
}
    