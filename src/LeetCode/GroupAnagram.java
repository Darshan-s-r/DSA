package LeetCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
//https://leetcode.com/problems/group-anagrams/
public class GroupAnagram {
    public static void main(String[] args) {
        String [] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
   static public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, String> map = new HashMap<>();
        sort(strs, map);
        List<List<String>> ans = new ArrayList<>();
        int i = 0;
        while(i< strs.length){
            String str0 = strs[i];
            String str = map.get(strs[i]);
            if(!contains(ans, str0)){
                List<String> List = new ArrayList<>();
                List.add(str0);
                int j = i+1;
                while(j<strs.length){
                    String str1 = map.get(strs[j]);
                    String str2 = strs[j];
                    if(str.equals(str1)){
                        List.add(str2);
                    }
                    j++;
                }
                ans.add(List);
            }
            i++;
        }
return ans;
    }

    static boolean contains(List<List<String>> list, String str) {
        for (List<String> subList : list) {
            if (subList.contains(str)) {
                return true;
            }
        }
        return false;
    }

    static void sort(String[] strs, HashMap<String, String> map){
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            String str1 = strs[i];
            char[] ch =str.toCharArray();
            Arrays.sort(ch);
            map.put(str1, String.valueOf(ch));
        }
    }
}
