import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        
        String concatenated = str1 + " " + str2;
        int[] count = new int[256];
        
        for (char c : concatenated.toCharArray()) {
            count[c]++;
        }
        
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + ": " + count[i]);
            }
        }
        
        sc.close();
    }
}

