import java.util.Scanner;

public class Task3
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        
        if (str1.length() > 0 && str2.length() > 0) {
            // Swap the first characters correctly
            char temp = str1.charAt(0);
            str1 = str2.charAt(0) + str1.substring(1);
            str2 = temp + str2.substring(1);
            
            System.out.println("After swapping the first characters:");
            System.out.println("First string: " + str1);
            System.out.println("Second string: " + str2);
        } else {
            System.out.println("Both strings must have at least one character.");
        }
        
        sc.close();
    }
}


