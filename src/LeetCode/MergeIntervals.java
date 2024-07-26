package LeetCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
		if (intervals.length == 0) {
			return new int[0][];
		}
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
	int[] currentInterval = intervals[0];
	List<int []> list = new ArrayList<>();
	list.add(currentInterval);
	for(int[] interval : intervals){
		int currentEnd = currentInterval[1];
		int nextStart = interval[0];
		int nextEnd = interval[1];
		if(nextStart <= currentEnd){
			currentInterval[1] = Math.max(currentInterval[1], nextEnd);
		}else{
			currentInterval = interval;
			list.add(currentInterval);
		}
	}
	return list.toArray(new int[list.size()][]);
    }


    public static void main(String[] args){
	MergeIntervals mi = new MergeIntervals();

	int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
	  int[][] mergedIntervals = mi.merge(intervals);

        // Print the merged intervals
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
