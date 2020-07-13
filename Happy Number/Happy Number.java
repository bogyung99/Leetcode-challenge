class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        int s = 0;
        int m = 0;
        int[] num = new int[10];
        int[] v = new int[10];
        
        v[0] = 0;
        
        while(n != v[m]){
            for(int i = 0; n > 0; i++){
                num[i] = n % 10; // 각각 숫자 배열
                sum++; // 자릿수
                n /= 10;
            }
        
            for(int i = 0; i < sum; i++){
                s += num[i] * num[i];
            }
        
            v[m] = s;
            n = v[m];
        
            m++;
        }
        
        if(n == 1)
            return true;
        else
            return false;
        
    }
}