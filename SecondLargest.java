public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 35, 40, 25};

        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements may be equal).");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }
}
