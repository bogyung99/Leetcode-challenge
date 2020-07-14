import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        boolean result = true;

        HashSet<Integer> hs = new HashSet<Integer>();

    	hs.add(n);

    	while(true) {
    		if(n == 1){
                result = true;
                break;
            }

    		n = cp(n);

    		if(hs.contains(n)) {
    			result = false;
    			break;
    		}

    		hs.add(n);
        }

        return result;
        
    }

    private int cp(int a) {
        int num = 0;

    	while(a != 0) {
    		num += (a % 10) * (a % 10);
    		a /= 10;
    	}	

    	a = num;

        return a;
    }
}