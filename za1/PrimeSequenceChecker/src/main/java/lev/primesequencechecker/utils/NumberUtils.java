package utils;

public class NumberUtils {
    public int[] AllPrimeNums (int n) {
        if (n <= 2) {
            return new int[0];
        }

        boolean[] isComposite = new boolean[n];
        int count = 0;

        for (int i = 2; i * i < n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                count++;
            }
        }

        int[] result = new int[count];
        int idx = 0;
        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                result[idx++] = i;
            }
        }

        return result;
    }
}
