package LeetCode;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String [] args){
		NextPermutation per = new NextPermutation();
		int [] arr = {3, 2, 1};
		per.permutation(arr);
		System.out.println(Arrays.toString(arr));
	}

	public void permutation(int[] arr){
		int n = arr.length;
		int index = -1;
		for(int i = n-2; i>=0; i--){
			if(arr[i] < arr[i+1]){
				index = i;
				break;
			}
		}
		if(index == -1){
			reverse(arr, 0, n-1);
		}else{
			for(int j = n-1; j >= index; j--){
				if(arr[j] > arr[index]){
					swap(arr, j, index);
					break;
				}
			}
			reverse(arr, index + 1, n - 1);
		}

	}


	public void swap(int[] arr, int start, int end){
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	public void reverse(int[] arr, int start, int end){
		while(start < end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}