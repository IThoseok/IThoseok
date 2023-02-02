class Solution {
    
    public int solution(int n) {
        int[] a = new int[n];
        //String[] b = new String[n];
        a[0] =1;
        for(int i=1;i<=n-1;i++){
            a[i]=a[i-1]+1;
            if((a[i]/10)%10==3){
                a[i]+=10;
            }
            if(a[i]%3==0){
                a[i]+=1;
                if(a[i]%10==3){
                    a[i]+=1;
                }
            }else if(a[i]%10==3){
                a[i]+=1;
                if(a[i]%3==0){
                    a[i]+=1;
                }
            }
        }
        
        return a[n-1];
    }
}