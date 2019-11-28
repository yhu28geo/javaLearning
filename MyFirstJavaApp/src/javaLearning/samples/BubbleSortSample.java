package javaLearning.samples;

public class BubbleSortSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={34,12,55,77,43,5,7,2,98};
		System.out.println("Original Array:");
		for(int n:arr) {
			System.out.print(n+" ");
		}
		System.out.println();
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			//内重循环控制每趟排序
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//输出排序后的数组：
		System.out.println("Sorted Array:");
		for(int n:arr) {
			System.out.print(n + " ");
		}
		

	}

}
