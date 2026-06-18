package sortingalgorithm;

public class MergeTwoArray {

    public static int[] sort(int[] arr, int[] brr) {
        int[] crr = new int[arr.length + brr.length];
        int i = 0, j = 0, k = 0;
        while(i < arr.length && j < brr.length) {
            if(arr[i] < brr[j]) {
                crr[k] = arr[i];
                i++;
            }
            else {
                crr[k] = brr[j];
                j++;
            }
            k++;
        }
        while(i < arr.length) {
            crr[k] = arr[i];
            i++;
            k++;
        }
        while(j < brr.length) {
            crr[k] = brr[j];
            j++;
            k++;
        }
        return crr;
    }
    public static void main(String[] args) {
        int arr[] = {10, 30, 50};
        int brr[] = {20, 40, 60};
        int result[] = sort(arr, brr);
        System.out.println("Merged array:");
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

