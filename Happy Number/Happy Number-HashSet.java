import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        boolean result;

        HashSet<Integer> hs = new HashSet<Integer>();

    	hs.add(n);

    	while(true) {
    		if(n == 1){
                result = true;
                break;

    		cp(n);

    		if(hs.contains(n)) {
    			result = false;
    			break;
    		}

    		hs.add(n);
    	} 	

        return result;
    }

    private int cp(int n){
        int num = 0;

    	while(n != 0) {
    		num += (n % 10) * (n % 10);
    		n /= 10;
    	}	

    	n = num;

        return n;
    }
}