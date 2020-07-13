import java.util.HashSet;
import java.util.Set;

class Solution {
  public int singleNumber(int[] nums) {
    int sum = 0;
    int num = 0;
      
    Set<Integer> set = new HashSet();

    for (int i : nums) {
      if (!set.contains(i)) {
        set.add(i);
        sum += i;
      }
      num += i;
    }
    return sum - (num - sum);
  }
}