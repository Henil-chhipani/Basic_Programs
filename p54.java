public class p54 {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 } };
        int toatal = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (i == j) {
                    toatal = toatal + a[i][j];
                }

            }
        }
        System.out.println(toatal);
    }
}
