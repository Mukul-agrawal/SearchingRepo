package exponential;

import binary.BinarySearch;


public class ExponentialSearch {
    public int exponentialSearch(int[] array, int target, int length) {
        if (array[0] == target)
            return array[0];
        int i = 1;
        while (i < length && array[i] <= target) {
            i = i * 2;
        }
        return new BinarySearch().recursiveBinary(array, target, i / 2, Math.min(i, length));
    }
}
