import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] array = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.print("Enter the target number: ");
            int target = scanner.nextInt();

            int count = 0;
            for (int num : array) {
                if (num == target) {
                    count++;
                }
            }

            System.out.println("Occurrences of " + target + ": " + count);
        } finally {
            scanner.close();
        }
    }
}


