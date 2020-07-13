class Solution {
    public boolean isHappy(int n) {
        int n1 = 0;
        int n2 = 0;
        int sum1 = 0;
        int sum2 = 1;        
     
        n / 10 = n1;
        n % 10 = n2;
        
        while(sum1 == sum2){
            n1*n1 + n2*n2 = sum1;
            sum1 / 10 = n1;
            sum1 % 10 = n2;
            n1*n1 + n2*n2 = sum2;
        }
        
        if(sum1 == 1){
            answer = "true";
            return answer; 
        }
        else{
            answer = "true";
            return answer;
        }
    }
}