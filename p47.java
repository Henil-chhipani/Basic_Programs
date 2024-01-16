public class p47 {
    public static void main(String[] args) {
        int i, j, rows;
        rows = 5;
        for (i = 0; i <= rows; i++) {
            for (j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                if (i == rows || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
