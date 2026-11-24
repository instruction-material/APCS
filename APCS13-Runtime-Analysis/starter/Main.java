public class Main {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4};
        System.out.println(f1(10));
        System.out.println(f2(10));
        System.out.println(f3(3, 7));
        System.out.println(f4(128));
        System.out.println(f5(values));
        System.out.println(f6(values));
    }

    public static int f1(int n) {
        int count = 0;
        for (int i = 0; i < 2 * n; i++) {
            count++;
        }
        return count;
    }

    public static int f2(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count++;
            }
        }
        return count;
    }

    public static int f3(int n, int m) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                count++;
            }
        }
        return count;
    }

    public static int f4(int n) {
        int count = 0;
        while (n > 0) {
            n /= 2;
            count++;
        }
        return count;
    }

    public static int f5(int[] arr) {
        int count = 0;
        for (int num1 : arr) {
            for (int num2 : arr) {
                count++;
            }
        }
        return count;
    }

    public static int f6(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                count++;
            }
            count++;
        }
        return count;
    }
}
