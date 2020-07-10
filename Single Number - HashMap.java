import java.util.HashMap;
import java.util.Map;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> ht = new HashMap<>();
        
        for(int i : nums){
            ht.put(i, ht.getOrDefault(i, 0) + 1); // 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환한다.
        }
        
        for(int i : nums){
            if(ht.get(i) == 1) // 중복이 아닌 키는 값이 1으로 저장되있음
                return i;
        }
        
        return 0; // 중복되지 않은 키가 하나 존재하기 때문에 기본 리턴
    }
}
}