import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> ht1 = new HashMap<>();
        HashMap<Integer, Integer> ht2 = new HashMap<>();
        
        int m = 0;
        int cp = 0;
        
        while(n != cp){
            int sum = 0;
            int s = 0;
            cp = n;
            
            for(int i = 0; n > 0; i++){
                ht1.put(i, n % 10); // 각각 숫자 배열
                sum++; // 자릿수
                n /= 10;
            }
        
            for(int i = 0; i < sum; i++){
                s += ht1.get(i) * ht1.get(i);
            }
        
            ht2.put(m, s);
            n = s;
            
            m++;
        }
        
        if(n == 1)
            return true;
        else
            return false;
        
    }
}