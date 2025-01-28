import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        
        String concatenated = str1 + " " + str2;
        String vowels = "aeiouAEIOU";
        
        for (int i = 0; i < concatenated.length(); i++) {
            if (vowels.indexOf(concatenated.charAt(i)) != -1) {
                System.out.println("Vowel " + concatenated.charAt(i) + " at index " + i);
            }
        }
        
        sc.close();
    }
}

