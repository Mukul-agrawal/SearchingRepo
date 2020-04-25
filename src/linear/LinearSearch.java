package linear;

public class LinearSearch {
    public int linear(int[] array, int target) {
        for (int i : array) {
            if (target == i) {
                return i;
            }
        }
        return -1;
    }
}
