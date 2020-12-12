package Algorithms.Sort;

public class SelectionSort {
    public int getMinIndex(int[] array, int startPosition) {
        int minIndex = startPosition;

        for (int i = startPosition; i < array.length; i++)
            if(array[i] < array[minIndex]) minIndex = i;

        return minIndex;
    }

    public void selectionSort(int [] array) {
        for(int sorted = 0; sorted < array.length; sorted++) {
            int minIndex = getMinIndex(array, sorted);

            int temp = array[sorted];
            array[sorted] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
