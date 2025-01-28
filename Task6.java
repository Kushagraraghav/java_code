import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        int index = str.indexOf(ch);
        
        if (index != -1) {
            System.out.println("The index of character '" + ch + "' is: " + index);
        } else {
            System.out.println("Character not found in the string.");
        }
        
        sc.close();
    }
}
