public class Task9 {
    public static void main(String[] args) {
        System.out.println(compute());
    }
    public static String compute() {
        int ans = 0;
        for (int x = 0; x < 1000; x++) {
            if (x % 3 == 0 || x % 5 == 0) {
                ans += x;
            }
        }
        return Integer.toString(ans);
    }
}
