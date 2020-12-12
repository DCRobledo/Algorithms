package Algorithms.Sort;

public class QuickSort {
    private void swap(int array[], int indexOne, int indexTwo){
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

    private int partition(int array[], int left, int right, int pivot){
        while(left<=right) {
            while(array[left]<pivot) left++;
            while(array[right]>pivot) right--;

            if(left <= right) {
                swap(array, left, right);
                left++; right--;
            }
        }
        return left;
    }

    private void quickSort(int array[], int left, int right){
        if(left < right) {
            int pivot = array[(left + right)/2];
            int index = partition(array, left, right, pivot);

            quickSort(array, left, index - 1);
            quickSort(array, index, right);
        }
    }

    public void quickSort(int array[]) {
        quickSort(array, 0, array.length - 1);
    }
}
