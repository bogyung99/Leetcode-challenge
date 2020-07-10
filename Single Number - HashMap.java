import java.util.HashMap;
import java.util.Map;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> ht = new HashMap<>();

        for (int i : nums) {
            ht.put(i, ht.getOrDefault(i, 0) + 1);  // 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환한다.
        }
        
        for (int i : nums) {
            if (ht(i) == 1) {   // 중복된 것이 없으면 키 값이 1이니까
                
            return i;
            }
        }
        
        return 0; // 무조건 중복이 없는게 있기 때문에 그냥 기본 리턴
    }
}