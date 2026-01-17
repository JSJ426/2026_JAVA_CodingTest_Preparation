import java.util.Scanner;

public class Baek25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;

        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum+=(a * b);
        }

        if (X == sum){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}


/* 영수증 총액과 물건의 개수 (각 물건의 금액 * 개수)가 일치하는지 구하는 문제
   X가 총액이고, 물건의 개수를 입력 받기 위해 테스트 케이스 변수 N을 선언,
   for 문을 통해 물건의 개수만큼 가격 a와 개수b를 입력받으면서 하나의 입력이 끝날 때 마다 a*b결과값을 sum에 저장 후 누적
   만약 X와 sum이 같다면 "Yes"출력, 아니라면 "No" 출력 */
