public class p45 {

    public static Boolean isDow(int mat[][]) {
        int N = 4;
        for (int i = 1; i < N - 1; i++)
            for (int j = i + 1; j < N; j++)
                if (mat[i][j] != 0)
                    return false;
        return true;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 0, 0, 0 },
                { 1, 4, 0, 0 },
                { 4, 6, 2, 0 },
                { 0, 4, 7, 6 } };
        if (isDow(mat))
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
