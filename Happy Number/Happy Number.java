import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> ht = new HashMap<>();
        
        int m = 0;
        int cp = 0;
        
        while(n != cp){
            int sum = 0;
            int s = 0;
            cp = n;
            
            for(int i = 0; n > 0; i++){
                ht.put(i, n % 10); // 각각 숫자 배열
                sum++; // 자릿수
                n /= 10;
            }
        
            for(int i = 0; i < sum; i++){
                s += ht.get(i) * ht.get(i);
            }
        
            n = s;
            
            m++;
        }
        
        if(n == 1)
            return true;
        else
            return false;
        
    }
}