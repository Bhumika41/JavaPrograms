package sortingalgorithm;

public class Mergesort {
	static void mergeSortArray(int[] arr, int start, int mid,int end)
	{
		
	      int[] crr = new int[end - start];
	      
	      int i=start,j=mid,k=0;
	       
	      while(i<mid && j<end) {
	    	  if(arr[i]<arr[j]) {
	    		  crr[k]=arr[i];
	    		  i++; k++;
	    	  }
	    	  else {
	    		  crr[k]=arr[j];
	    		  j++; k++;
	    	  }
	      }
	      
	      while(i!=mid) {
	    	  crr[k] = arr[i];
	    	  i++; k++;
	      }
	      while(j!=end) {
	    	  crr[k]=arr[j];
    		  j++; k++;
	      }
	     for(int m=0;m<crr.length;m++) {
	    	 arr[start+m] = crr[m];
	     }
	}
	      
	static void mergeSort(int[] arr,int start,int end) {
		
		if(end - start ==1)
			return;
		//if (start < end) {
           // int mid = (start + end) / 2;
		int mid = start + (end -start )/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid, end);
            mergeSortArray(arr, start, mid, end);
		//}
	}
	
	public static void main(String[] args) {
		 int[] arr ={6,7,2,8,4,5,1,3,9};
		 int start=0,end=arr.length,mid=(start+end)/2;
	      mergeSort(arr, start,end);
	       
	       for(int k=0;k<arr.length;k++) {
	    	   System.out.print(arr[k] + " ");
	       }
	}
}
