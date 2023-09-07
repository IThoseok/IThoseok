class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int min = 0;
        int tmp = 1;
        for(int i=arr.length-1;i>=0;i--){
            int max = 0;
            for(int j=1; j<=tmp && j<=arr[i]; j++){
			    if(tmp%j==0 && arr[i]%j==0){
				    max = j;
                    answer = (tmp*arr[i])/max;
			    }
		    }
            tmp = answer;
        }
        return answer;
    }
}