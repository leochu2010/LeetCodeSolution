import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution88MergeSortedArray {
    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2 ,3 );
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> numList = new ArrayList<Integer>();
        for (int i = 0; i<m; i++){
            numList.add(nums1[i]);
        }
        for(int i=0; i<n;i++){
           numList.add(nums2[i]);
        }
        Collections.sort(numList);
        System.out.println(numList);
    }
}