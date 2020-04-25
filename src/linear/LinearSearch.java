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

    public int recursiveLinear(int[] array, int target, int posMin) {
        if (posMin == array.length)
            return -1;
        else if (array[posMin] == target)
            return array[posMin];
        else
            return recursiveLinear(array, target, posMin + 1);
    }
}
