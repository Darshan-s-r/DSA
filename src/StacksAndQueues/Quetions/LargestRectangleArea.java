package StacksAndQueues.Quetions;

import java.util.Arrays;
import java.util.Stack;

class LargestRectangleArea {
    public static void main(String[] args) {
        int []heights = {2,1,5,6,2,3};
        int largestArea = largestRectangleAreaOpt(heights);
        System.out.println(largestArea);
    }
    ////////optimized
    static public int largestRectangleAreaOpt(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;

        stack.push(0);
        for (int i = 1; i < heights.length; i++) {
            while(!stack.isEmpty() && heights[i] < heights[stack.peek()]){
                max = getMax(heights, stack, max, i);
            }
            stack.push(i);
        }
        int i = heights.length;
        while(!stack.isEmpty()){
            max = getMax(heights, stack, max, i);
        }
        return max;
    }

    private static int getMax(int[] arr, Stack<Integer> stack, int max, int i){
        int area;
        int popped = stack.pop();
        if(stack.isEmpty()){
            area = arr[popped] * i;
        }else{
           area = arr[popped] * (i - 1 - stack.peek());
        }
        return Math.max(max, area);
    }
   static public int largestRectangleArea(int[] heights) {
//       Arrays.sort(heights);
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int lMax = 0;
            int rMax = heights[i];
            for (int j = i+1; j < heights.length; j++) {
                if(heights[i]<=heights[j]){
                    rMax += heights[i];
                }else{
                    break;
                }
            }
            for (int j = i-1; j >=0 ; j--) {
                if(heights[i]<=heights[j]){
                    lMax += heights[i];
                }else{
                    break;
                }
            }
            int tMax = lMax + rMax;
            if(max < tMax){
                max = tMax;
            }
        }
        return max;
    }
}