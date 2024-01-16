public class p44 {

    public static Boolean isUp(int mat[][]) {
        int N = 4;
        for (int i = 1; i < N; i++)
            for (int j = 0; j < i; j++)
                if (mat[i][j] != 0)
                    return false;
        return true;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 5, 3 },
                { 0, 4, 7, 2 },
                { 0, 0, 2, 5 },
                { 0, 0, 0, 9 } };
        if (isUp(mat))
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
