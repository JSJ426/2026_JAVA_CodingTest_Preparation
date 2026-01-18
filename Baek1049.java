import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] Package = new int[51];
        int[] Each = new int[51];
        int cheapestPackage = Integer.MAX_VALUE;
        int cheapestEach = Integer.MAX_VALUE;
        int quotientN = N / 6;
        int remainderN = N % 6;

        for(int i = 0; i < M; i++){
            Package[i] = sc.nextInt();
            Each[i] = sc.nextInt();
        }

        for(int i = 0; i < M; i++){
            if(Package[i] < cheapestPackage){
                  cheapestPackage = Package[i];
            }
        }


        for(int i = 0; i < M; i++){
            if(Each[i] < cheapestEach){
                  cheapestEach = Each[i];
            }
        }


        if(N > 6){
            int allEach = N * cheapestEach;
            int allPackage;
            int mixed = quotientN * cheapestPackage + remainderN * cheapestEach;

            if(remainderN == 0){
                allPackage = quotientN * cheapestPackage;
            } else {
                allPackage = (quotientN + 1) * cheapestPackage;
            }

            if(allEach <= allPackage && allEach <= mixed){
                System.out.println(allEach);
            } else if(allPackage <= mixed){
                System.out.println(allPackage);
            } else {
                System.out.println(mixed);
            }
        } else {  // N <= 6
            if(cheapestPackage < N * cheapestEach){
                System.out.println(cheapestPackage);
            } else {
                System.out.println(N * cheapestEach);
            }
        }
    }
}


/* 끊어진 기타 줄 n개를 구입하기 위해 6줄짜리 패키지의 가격과 낱개 줄의 가격을 비교해
가장 싸게 구입할 수 있는 방법을 자동으로 계산해주는 프로그램입니다

1. 끊어진 기타 줄 n개를 입력 받습니다
2. 브랜드 별로 6개 패키지 상품과 낱개가 있어 브랜드 개수 m을 입력 받습니다
3. 브랜드 별로 패키지와 낱개 상품 가격을 저장하기 위한 배열 Package[]와 Each[]를 생성합니다
4. 가장 저렴한 가격만 알면 되기 때문에 cheapestPackage, cheapestEach 변수에 가장 저렴한
   패키지 가격과 낱개의 가격을 저장합니다
5. 이후 끊어진 줄 n이 6개 이상일 경우 구매한 줄이 조금 남더라도 패키지로 모두 구매할 경우
   가장 저렴하다면 패키지만, 낱개로만 구매하는게 가장 저렴하다면 낱개로만 또는 패키지와 낱개를
   섞어 구매하는게 가장 저렴하다면(몫과 나머지를 사용) 이렇게 구매하는 방식의 조건문을
   사용해 계산
6. n이 6 이하일 경우 패키지 하나를 사는 가격과 낱개로 구매할 경우 가격을 비교해 출력

번외
- 문제를 풀다가 조건을 생각하는 부분이 생각보다 복잡해져 min,max를 활용하면 좋겠다는 생각에
  구글링을 하다 math.min이라는 문법을 보게 됨
- 우선은 풀고 있는 노가다 코드를 완성시켜서 math.min을 사용하기 전에 조건이 어떻게 나눠져야 
  할지 머리속에 잘 담기게 계속 고민해보자 해서 위 코드를 완성
- 이후 math.min을 사용한 코드를 확인
    int case1 = N * cheapestEach;                                        // 전부 낱개
    int case2 = ((N + 5) / 6) * cheapestPackage;                         // 전부 패키지 (올림)
    int case3 = quotientN * cheapestPackage + remainderN * cheapestEach; // 패키지 + 나머지 낱개

    System.out.println(Math.min(Math.min(case1, case2), case3));
  단 4줄이면 완성되는 코드!, 앞으로 문제 풀 때 적용시키면 될 듯
