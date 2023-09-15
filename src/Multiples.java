public class Multiples {
    public static void main(String[] args) {
        System.out.println("Multiples in 10: " + howManyMultiplesIn(10));
        System.out.println("Multiples in 1000: " + howManyMultiplesIn(1000));
    }
    private static int howManyMultiplesIn(int target) {
        int count = 0;
        for (int i = 1; i < target; i++) {
            boolean multipleOf3 = i % 3 == 0;
            boolean multipleOf5 = i % 5 == 0;

            if (multipleOf3 || multipleOf5) {
                count++;
            }
        }
        return count;
    }
}