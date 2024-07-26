package LeetCode;
import java.util.*;

public class CountInversion {
	public static void main(String	args[]){
        CountInversion cn = new CountInversion();
		Scanner sc = new Scanner(System.in);
		long[] arr = new long[]{2, 4, 1, 3, 5};

		long count = cn.inversionCount2(arr, arr.length);
		System.out.println(count);
	}

//	public int countInversion(int[] arr, int n){
//		int count = 0;
//		for(int i = 0; i < n; i++){
//			for(int j = i+1; j<n; j++){
//				if(arr[i] > arr[j]) count++;
//			}
//		}
//		return count;
//	}

	static long inversionCount2(long arr[], int n) {
		return mergeAndCount(arr, 0, n-1);
	}

	public static long mergeAndCount(long [] arr, int l, int r){
		long count = 0;
		if(l <  r){
			int mid = (l + r) /2;
			count += mergeAndCount(arr, l, mid);
			count += mergeAndCount(arr, mid + 1, r);
			count += merge(arr, l, mid, r);
		}
		return count;
	}

	public static long merge(long[] arr, int l, int mid, int r){
		int i = 0, j = 0, k = l;
		long count = 0;
		long[] left = Arrays.copyOfRange(arr, l, mid+1);
		long[] right = Arrays.copyOfRange(arr, mid+1, r + 1);

		while(i < left.length && j < right.length){
			if(left[i] <= right[j]){
				arr[k++] = left[i++];
			}else{
				arr[k++] = right[j++];
				count += (mid+1) - (l + i);
			}
		}
		while(i < left.length){
			arr[k++] = left[i++];
		}
		while(j < right.length){
			arr[k++] = right[j++];
		}
		return count;
	}
	
}
