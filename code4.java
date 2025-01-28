public class code4 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 2, 4};
        int n = arr.length + 1;
        int total = (n * (n + 1)) / 2;
        int sum = 0;
        
        for (int num : arr) {
            sum += num;
        }
        
        System.out.println(total - sum);
    }
}

