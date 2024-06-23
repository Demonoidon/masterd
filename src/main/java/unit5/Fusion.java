package unit5;

import java.util.Arrays;

public class Fusion {
    public static void main(String[] args) {
        int[] ar1 = {9, 11, 13, 15};
        int[] ar2 = {2, 10, 12};
        int[] ar3 = fusion2pointers(ar1, ar2);
        System.out.println(Arrays.toString(ar3));
    }

    private static int[] fusion(int[] ar1, int[] ar2) {
        int[] ar = new int[ar1.length + ar2.length];
        System.arraycopy(ar1, 0, ar, 0, ar1.length);
        System.arraycopy(ar2, 0, ar, ar1.length, ar2.length);
        Arrays.sort(ar);
        return ar;
    }

    private static int[] fusion2pointers(int[] ar1, int[] ar2) {
        int[] ar = new int[ar1.length + ar2.length];
        int p1 = 0;
        int p2 = 0;
        int p = 0;
        while (p < ar.length) {
            System.out.println(p1);
            System.out.println(p2);
            if (p1 >= ar1.length) {
                ar[p] = ar2[p2];
                p2++;

            } else if (p2 >= ar2.length) {
                ar[p] = ar1[p1];
                p1++;

            } else if (ar1[p1] > ar2[p2]) {
                ar[p] = ar2[p2];
                p2++;
            } else {
                ar[p] = ar1[p1];
                p1++;
            }
            p++;
        }
        return ar;
    }
}
