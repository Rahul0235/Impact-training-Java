public class EvenNumbers {
    public static void main(String[] args) {
        int[] arr = {5, 10, 13, 22, 36, 41};

        System.out.print("Even numbers in the array: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
   