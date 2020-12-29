package Algorithms.Search;

public class BinarySearch {
    private int binarySearch(int[] array, int target, int left, int right) {
        int middle = (right + left) / 2;

        if (array[middle] == target) return middle;

        if (left >= right) return -1;

        if (array[middle] > target) return binarySearch(array, target, left, middle - 1);
        return binarySearch(array, target, middle + 1, right);
    }

    public int binarySearch(int[] array, int target) {
        return binarySearch(array, target, 0, array.length - 1);
    }
}
