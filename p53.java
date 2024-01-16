public class p53 {
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // recursive implementation
    static int LcmOfArray(int[] arr, int idx) {

        // lcm(a,b) = (a*b/gcd(a,b))
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int a = arr[idx];
        int b = LcmOfArray(arr, idx + 1);
        return (a * b / gcd(a, b)); //
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 8, 44 };
        System.out.print("LCM: " + LcmOfArray(arr, 0) + "\n");

    }
}
