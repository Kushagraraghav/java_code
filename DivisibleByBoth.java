public class DivisibleByBoth 
{
    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 10; i <= 950; i++) {
            if (i % 6 == 0 && i % 9 == 0) {
                sum += i;
            }
        }
        
        System.out.println("The sum of numbers divisible by both 6 and 9 is: " + sum);
    }

}
