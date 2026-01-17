import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] dp = new int[2][41];

        int T = sc.nextInt();

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 2; i < 41; i++){
            dp[0][i] = dp[0][i-1] + dp[0][i-2];  
            dp[1][i] = dp[1][i-1] + dp[1][i-2];
        }

        for (int i = 0; i < T; i++){
            int n = sc.nextInt();

            System.out.println(dp[0][n] + " " + dp[1][n]);
        }
    }
}


/* 처음에 dp의 개념을 몰라 1003번 문제에서 제시 해준 피보나치 코드를 통해 결과값이 나오도록 작성하였으나 '시간초과'의 이유로 틀림
   dp 개념을 공부하고 다시 도전
   '반복되는 계산을 줄인다'가 핵심인 dp의 개념을 배열로 녹여냄
   int[][] dp = new int[2][41]; -> 배열이 2줄이고, 각 41칸씩 존재하는 2차원 배열 생성

    dp[0][0] = 1; -> 0이 1개(match)
    dp[0][1] = 0; -> 0이 0개(miss_match)
    dp[1][0] = 0; -> 1이 0개(miss_match)
    dp[1][1] = 1; -> 1이 1개(match)

    피보나치 수열의 파싱 작업은 결국 0과 1이 몇개 나오냐로 구분되기 때문에 dp의 0과 1의 기본값을 고정,
    이후 for문을 통해 40칸까지 모두 dp개념을 적용시켜 값을 채우고
    n을 입력받으면 dp를 통해 반복 된 계산을 줄여 시간 초과 없이 성공할 수 있음*/

   
