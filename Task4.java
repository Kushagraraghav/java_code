import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.print("Enter an index: ");
        int index = sc.nextInt();
        
        if (index >= 0 && index < str.length()) {
            System.out.println("Character at index " + index + ": " + str.charAt(index));
        } else {
            System.out.println("Invalid index! Please enter a valid index.");
        }
        
        sc.close();
    }
}

