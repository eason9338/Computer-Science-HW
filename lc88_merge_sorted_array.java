class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1;// pointer to nums1[]
        int b = n - 1;// pointer to nums2[]
        int i = m + n -1;//pointer to last element
        while(a >= 0 && b >= 0){ 
            if(nums1[a] < nums2[b]){
                nums1[i] = nums2[b];
                b--;
            }else{
                nums1[i] = nums1[a];
                a--;
            }
            
            i--;
        }
        
        while(b >= 0){
            nums1[i] = nums2[b];
            i--;
            b--;
        }
    }
}