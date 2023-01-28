class Solution {
    public int solution(String my_string) {
        int answer = 0;
        //my_string=my_string.replaceAll(" ", "");
        String[] a = my_string.split(" ");
        for(int i=0;i<a.length;i++){
            if(i==0){
                answer+=Integer.parseInt(a[i]);
            }else if(i%2 == 0){
                if(a[i-1].equals("-")){
                    answer-=Integer.parseInt(a[i]);
                }else if(a[i-1].equals("+")){
                    answer+=Integer.parseInt(a[i]);
                }
            }
        }
        return answer;
    }
}