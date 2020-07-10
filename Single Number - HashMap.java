import java.util.HashMap;
import java.util.Map;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> ht = new HashMap<>();
        
        for(int i : nums){
            ht.put(i, ht.getOrDefault(i, 0) + 1);
        }
        
        for(int i : nums){
            if(ht.get(i) == 1)
                return i;
        }
        
        return 0;
    }
}
}