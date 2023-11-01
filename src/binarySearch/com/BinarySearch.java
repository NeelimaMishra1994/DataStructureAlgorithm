package binarySearch.com;

public class BinarySearch {

	public static void main(String[] args) {
		int [] nums= {2,4,6,9,11,12,14,20,36,48};
		int target = 136;
		int ans = binarySearch(nums,target);
		System.out.println(ans);
	}
	private static int binarySearch(int[] arr, int target) {	
		int start =0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(target > arr[mid]) {
				start= mid+1;
			}
			else if(target <arr[mid]) {
				end = mid-1;
			}
			else {
				//ans found
				return mid;
			}
		}
		return -1;
	}
} 	