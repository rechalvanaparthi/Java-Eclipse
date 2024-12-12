
public class Sorting {
	public static void main(String[] args) {
		int[] arr= {5,1,8,2,9,0};
		int temp = 0;
		
		                //  ASCENDING ORDER
		System.out.println("Array Elements in Ascending Order");
		
		for(int i=0; i< arr.length; i++) {
			for(int j= i+1 ; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		System.out.println(arr[i]);
		}
		               //   DESCENDING ORDER
		System.out.println("Array Elements in Descending Order");
		
		for(int i=0; i< arr.length; i++) {
			for(int j= i+1 ; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		System.out.println(arr[i]);
		}
	}

}
