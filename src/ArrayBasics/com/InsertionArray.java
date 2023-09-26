package ArrayBasics.com;

import java.util.Arrays;

public class InsertionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertAtspecificPosition();
		insertAt0thPosition();
		insertAtLastPosition();
	}
	public static void insertAtspecificPosition() {
		int num[]= {10,20,30,40,50};
		int elementToinsert = 25;
		int elementAtIndex = 2;
		int num1[] =new int[num.length +1];
		System.out.println("Array before :" +Arrays.toString(num));
		for(int i = 0,j=0; i<num1.length;i++) {
			if(i ==elementAtIndex ) {
				num1[i]=elementToinsert;
				
			}else {
				num1[i]=num[j++];
			}
		}
		System.out.println("Array after :" +Arrays.toString(num1));

		
	}
	public static void insertAt0thPosition() {
		int num[]= {10,20,30,40,50};
		int elementToinsert = 25;
		int elementAtIndex = 0;
		int num1[] =new int[num.length +1];
		System.out.println("Array before :" +Arrays.toString(num));
		for(int i = 0,j=0; i<num1.length;i++) {
			if(i ==elementAtIndex ) {
				num1[i]=elementToinsert;
				
			}else {
				num1[i]=num[j++];
			}
		}
		System.out.println("Array after :" +Arrays.toString(num1));
		
	}
	
	public static void insertAtLastPosition() {
		int num[]= {10,20,30,40,50};
		int elementToinsert = 25;
		int elementAtIndex = num.length;
		int num1[] =new int[num.length +1];
		System.out.println("Array before :" +Arrays.toString(num));
		for(int i = 0,j=0; i<num1.length;i++) {
			if(i ==elementAtIndex ) {
				num1[i]=elementToinsert;
				
			}else {
				num1[i]=num[j++];
			}
		}
		System.out.println("Array after :" +Arrays.toString(num1));
		
	}
	

}
