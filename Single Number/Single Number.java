class Solution {
    public int singleNumber(int[] a) {
        int[] b = new int[100];
        int s = a[0];
        int t = 0;

        for(int i = -49; i < 50; i++){
            b[t] = i;
            t++;
        }
        
        for(int i = 0; i < 20; i++){
            int n = 0;
                
            for(int j = 0; j < a.length; j++){
                if(b[i] == a[j]){
                    n++;
                }
            }
            
            if(n == 1){
                s = b[i];
            }
        }

        return s;
    }
}