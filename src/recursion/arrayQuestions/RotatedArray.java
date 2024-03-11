package recursion.arrayQuestions;

public class RotatedArray {
    public static void main(String[] args) {
        int arr[] = {5, 6,7, 9, 22, 44, 1, 2, 3, 4, 5};
        System.out.println(search(arr, 2, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int mid = s + (e - s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[s] <= arr[mid]){
            if(target <= arr[mid] && target >=arr[s]){
                return search(arr, target, s, mid-1);
            }
            else{
                return search(arr, target, mid + 1, e);
            }

        }

//        if(arr[mid] <= arr[s]){
            if(target >= arr[mid] && target <arr[e]){
                return search(arr, target, mid+1, e);
            }
            return search(arr, target, s, mid-1);
//        }

//        if(arr[mid] >= arr[e]){
//            if(target>arr[mid] && target<arr[e]){
//                return search(arr, target, mid+1,e);
//            }
//            return search(arr, target, s, mid-1);
//        }
//        return -1;
    }
}
