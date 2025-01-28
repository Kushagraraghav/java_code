import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        
        String concatenated = str1 + " " + str2;
        String[] words = concatenated.split(" ");
        
        for (String word : words) {
            System.out.println(word);
        }
        
        sc.close();
    }
}

