package unit5;

public class Iteration {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[3];
        arr2[0] = 4;
        arr2[1] = 5;
        arr2[2] = 6;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        for (int elem : arr2) {
            System.out.println(elem);
        }
    }
}
