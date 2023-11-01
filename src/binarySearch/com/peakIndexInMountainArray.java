package binarySearch.com;

public class peakIndexInMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {0,10,5,2};
		System.out.println(PeakIndexInMountainArray(arr));

	}
	public static int PeakIndexInMountainArray(int[] arr) {
		int peakElement = 0;
		for(int i =0; i<arr.length;i++) {
			if(arr[i]> peakElement) {
				peakElement=i;
			}
		}
		return peakElement;   
	   }

}
