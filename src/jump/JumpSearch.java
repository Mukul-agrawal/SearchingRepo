package jump;

public class JumpSearch {
    public int jumpSearch(int[] array, int target) {
        int length = array.length;
        int step = (int) Math.floor(Math.sqrt(length));
        int prev = 0;
        while (array[Math.min(step, length) - 1] < target) {
            prev = step;
            step = (int) (step + Math.floor((Math.sqrt(length))));
            if (prev >= length) {
                return -1;
            }

        }
        while (array[prev] < target) {
            if (prev == Math.min(step, length))
                return -1;
            prev++;
        }
        if (array[prev] == target)
            return array[prev];
        return -1;
    }
}
