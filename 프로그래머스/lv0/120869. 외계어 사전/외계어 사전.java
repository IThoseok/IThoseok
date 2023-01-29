class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for(String a : dic){
            int cnt = 0;
            for(int i=0;i<spell.length;i++){
                if(a.contains(spell[i])){
                    a=a.replaceAll(spell[i],"");
                    cnt++;
                }
                
                
            }
            if(a.equals("") && cnt==spell.length){
                answer++;
            }
        }
        if(answer==0){
            answer=2;
        }
        return answer;
    }
}