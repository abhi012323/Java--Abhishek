package Array;
import java.util.*;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        //outer layer
        for(int i = 0 ; i< nums.length;i++){
            //inner layer
            for(int j= i+1 ;j<nums.length ;j++){
                if(nums[i]== nums[j]){
                    return true;
                }
            }
            
        }
        return false ;
        
    }
}
public class Main {
        public Static int main(String(args)){
        Solution sol = new Solution();
        int[] nums = {1,2,3,3};
        System.out.println(sol.hasduplicate(nums));
    }
    
}
