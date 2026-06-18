package sortingalgorithm;

public class Quicksort {

	static int partition(int arr[], int left, int right) {
		int pivot = arr[left];
		int i = left;
		int j = right;
		while (i < j) {
			while (arr[i] <= pivot && i < right) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i < j) {
				swap(arr, i, j);
			}
		}
		swap(arr, left, j);
		return j;
	}

	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void quickSort(int arr[], int left, int right) {
		if (left < right) {
			int pivotIndex = partition(arr, left, right);
			quickSort(arr, left, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, right);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 40, 10, 30, 20 };
		quickSort(arr, 0, arr.length - 1);
		int i = 0;
		while (i < arr.length) {
			System.out.print(arr[i] + " ");
			i++;
		}
	}
}