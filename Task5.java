import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.print("Enter an index: ");
        int index = sc.nextInt();
        
        if (index >= 0 && index < str.length()) {
            System.out.println("The character at index " + index + " is: " + str.charAt(index));
        } else {
            System.out.println("Invalid index! The index should be between 0 and " + (str.length() - 1));
        }
        
        sc.close();
    }
}
