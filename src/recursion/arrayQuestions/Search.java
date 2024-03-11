package recursion.arrayQuestions;

import java.beans.Introspector;
import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {

        int arr[] = new int[] {2,4,2,8,6,8,43,2};
        System.out.println(search(new int[] {2,4,2,8,6,43,2}, 6, 0));
        System.out.println(search2(new int[] {2,4,2,8,6,43,2}, 6, 0));
        System.out.println(searchReverce(arr, 6, arr.length-1));
      searchAllIndex(arr, 2, 0);
        System.out.println(list);
        System.out.println(searchAllIndex(arr, 2, 0, new ArrayList<Integer>()));
        System.out.println(searchImportent(arr, 8, 0));
    }

    static int search(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return search(arr, target, index+1);
    }

    static boolean search2(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }

        return arr[index] == target || search2(arr, target, index+1);
    }

    static int searchReverce(int[] arr, int target, int index){
        if (index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return searchReverce(arr, target, index-1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void searchAllIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
         searchAllIndex(arr, target, index+1);

    }

    static ArrayList searchAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
      return   searchAllIndex(arr, target, index+1, list);

    }


    //he said its important "below one"
    //for more info watch 59:00:00 "recorsion array"
    static ArrayList<Integer> searchImportent(int arr[], int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        list.addAll(searchImportent(arr, target, index+1));
        return list;
    }

}
