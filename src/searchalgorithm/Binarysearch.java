package searchalgorithm;

public class Binarysearch {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8,9,10};
		int target=8;
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				System.out.println("Found at :"+mid);
				break;
			}
			else if(target>arr[mid]){
				low=mid+1;
			}else {
				high=mid-1;
			}
			
		}
	}
}
