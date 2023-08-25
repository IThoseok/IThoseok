class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        while(a!=b){
            if(a%2==1 && b%2==1){ //ab둘다 홀수
                a++;
                b++;
            }else if(a%2==1){ //a만
                a++;
            }else if(b%2==1){
                b++;
            }
            a /= 2;
            b /= 2;
            answer++;
        }

        return answer;
    }
}