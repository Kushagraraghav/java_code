import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        
        String concatenated = str1 + " " + str2;
        String reversed = "";
        
        for (int i = concatenated.length() - 1; i >= 0; i--) {
            reversed += concatenated.charAt(i);
        }
        
        System.out.println("Reversed string: " + reversed);
        
        sc.close();
    }
}
