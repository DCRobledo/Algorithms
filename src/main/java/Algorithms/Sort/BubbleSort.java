package Algorithms.Sort;

public class BubbleSort {
    public boolean isSorted(int array[]) {
        for(int i = 0; i<array.length-1; i++)
            if(array[i] > array[i+1]) return false;
        return true;
    }

    public void swap(int array[], int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

    public void bubbleSort(int array[]) {
        while(!isSorted(array)) {
            for(int i = 0; i < array.length - 1; i++)
                if(array[i] > array [i+1]) swap(array, i, i+1);
        }
    }
}
