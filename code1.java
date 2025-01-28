import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        double avg = (marks1 + marks2 + marks3) / 3.0;
        
        if (avg >= 90) {
            System.out.println("Grade A");
        } else if (avg >= 75) {
            System.out.println("Grade B");
        } else if (avg >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }
        
        sc.close();
    }
}
