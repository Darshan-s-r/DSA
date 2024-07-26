public class MaxSumInSubArr{

	//kadens algo
	public int MaxSumOptimal(int[] arr){
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i< arr.length; i++){
			sum = sum + arr[i];
			
			if(sum > max){
				max = sum;
			}
			if(sum < 0){
				sum = 0;
			}
				
			
		}
		return max;
	}


///////////////////////////return indices os the sub Array///////////

	public int MaxSumOptimalWithIndices(int[] arr){
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int ansStart = -1;
		int ansEnd = -1;
		int start = -1;
		for(int i = 0; i< arr.length; i++){
			if(sum == 0){
				start = i;
			}
			sum = sum + arr[i];
			
			if(sum > max){
				max = sum;
				ansStart = start;
				ansEnd = i;
			}
			if(sum < 0){
				sum = 0;
			}
				
			
		}
		System.out.println("sub array starts At " + ansStart + "and end's at " +  ansEnd);
		return max;
	}


///////////////////////////////////////
	public int MaxSum(int[] arr){
		int N = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i = 0;i< N; i++){
			
			for(int j = i; j< N; j++){
				int sum = 0;
				for(int k = i; k<= j; k++){
					sum = sum + arr[k];
}
				if(sum > max){
					max = sum;			
}

}
}
return max;
}
////////////////////////////////////

	public int MaxSum1(int[] arr){
		int N = arr.length;
		int max = Integer.MIN_VALUE;
		for(int i = 0;i< N; i++){
			int sum = 0;
			for(int j = i; j< N; j++){
				sum = sum + arr[j];
				if(sum > max){
					max = sum;			
}

}
}
return max;
}

///////////////////////////////////

public static void main(String[] args){
	MaxSumInSubArr m = new MaxSumInSubArr();
	int[] arr = new int[] {-2, -3, 4, -1, -2, 1, 5, -3};
//	System.out.println(m.MaxSum(arr));
//	System.out.println(m.MaxSum1(arr));
//	System.out.println(m.MaxSumOptimal(arr));
	System.out.println(m.MaxSumOptimalWithIndices(arr));
}
}