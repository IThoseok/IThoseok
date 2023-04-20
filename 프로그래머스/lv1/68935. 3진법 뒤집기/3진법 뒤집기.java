import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
//          List<Integer> list = new ArrayList<>();
//         int pow = 0;
//         for(int i = 0;i<=17;i++){
//             if(n<Math.pow(3,i)){
//                 pow = i-1;
//                 break;
//             }
//         }
        
//         Loop : for(int i=pow;i>=0;i--){
//             if(n>Math.pow(3,i)){
//                 for(int j=2;j>0;j--){
//                     if(n>=j*Math.pow(3,i)){
//                         list.add(0,j);
//                         n-=j*Math.pow(3,i);
//                         if(n==0){break Loop;}
//                         break;
//                     }
//                 }
//             }else{
//                 list.add(0,0);
//             }
            
//         }

        // for(int i=0;i<list.size();i++){
        //     if(list.get(i)!=0){
        //         for(int j =0;j<list.size()-i;j++){
        //             pow=list.size()-(1+i+j);  
        //             answer+=list.get(i+j)*Math.pow(3,pow);
        //         }
        //         return answer;
        //     } 
        // }
        String reverse = "";
        // for(Integer toString : list){
        //     reverse+= Integer.toString(toString);
        // }
        // reverse=Integer.parseInt(reverse)+"";
//         for(int i=0;i<reverse.length();i++){
//             pow=reverse.length()-(1+i);

//             answer+=(reverse.charAt(i)-48)*Math.pow(3,pow);
//         }
        while(n>0){
            reverse += Integer.toString(n%3);
            n/=3;
        }
        
        return Integer.parseInt(reverse,3);
    }
}