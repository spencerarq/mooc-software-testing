package tudelft.numfinder;

public class NumFinder {
    private int smallest;
    private int largest;

    public void find(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array vazio ou nulo não é permitido!");
        }

        // Inicialize as variáveis com o primeiro elemento do array
        smallest = nums[0];
        largest = nums[0];

        for (int n : nums) {
            if (n < smallest) {
                smallest = n;
            } else if (n > largest) { // Mantenha o else if original
                largest = n;
            }
        }
    }

    public int getSmallest() {
        return smallest;
    }

    public int getLargest() {
        return largest;
    }
}