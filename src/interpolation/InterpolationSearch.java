package interpolation;

public class InterpolationSearch {
    public int interpolationSearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high && target >= array[low] && target <= array[high]) {
            if (low == high) {
                if (array[low] == target)
                    return array[low];
                else
                    return -1;
            }
            int pos = low + (((high - low) / (array[high] - array[low])) * (target - array[low]));
            if (array[pos] == target)
                return array[pos];
            if (array[pos] < target)
                low = pos + 1;
            else
                high = pos - 1;
        }
        return -1;
    }

}
