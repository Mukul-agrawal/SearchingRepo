package binary;

public class BinarySearch {
    public int recursiveBinary(int[] array, int target, int first, int last) {
        if (first > last)
            return -1;
        else {
            int mid = (first + last) / 2;
            if (array[mid] == target)
                return array[mid];
            else if (array[mid] > target)
                return recursiveBinary(array, target, first, mid - 1);
            else if (array[mid] < target)
                return recursiveBinary(array, target, mid + 1, last);

        }
        return -1;
    }
}
