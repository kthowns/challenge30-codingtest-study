/*
 * 자리 수 단위로 완전탐색 / 이상한 진수 2
 * 0 이상의 정수 N을 2진법으로 나타낸 뒤, 그 숫자들 중 정확히
 * 한 숫자만을 바꾼 숫자 a가 주어졌을 때, 가능한 숫자 N 중 최댓값을
 * 찾는 프로그램을 작성해보세요.
 * 
 * 입력 : 
 * 1010
 * 
 * 출력 : 
 * 14
 * 
 * 의사코드
 * 
 * 1. 전체적인 코드를 탐색한다.
 * 2. 0이 있는 코드가 있으면 1로 바꾼다..?
 * 3. 인덱스 값을 입력받아서 인덱스가 작으면 바꾼다?
 * 4. 인덱스 0번째는 2^3, 첫번째 인덱스는 2^2, 두번째 인덱스는 2^1
 * 세번째 인덱스는 2^0을 한다.
 * 
 * 이번 문제는 이렇게 풀면 된다고 생각을 했지만, 다른 테스트 케이스로는 틀렸다고 나온다.
 * 
 * ps) 아니 입력 케이스 1010이라며 ,,, 왜 그러는 거야 도대체
 * 
 * 아직 문자형을 실수형으로 바꾸는 부분은 잘하지 못하므로 해설을 보고 푸는 것은 무의미 하다고 느껴졌다.
 * 그러므로 다음에 다시 풀어봐야 겠다고 생각했다
 * commit은 미해결로 올려애 겠다.
 */
public class strangejinsoo2 {
  public static void main(String[] args){

    int[] list = new int[]{1,0,1,0};

    for(int i=0;i<list.length;i++){
      if(list[i] == 0){
        list[i] = 1;
        break;
      }
    }

    int result = 0;
    int a = list.length;
    for(int i=0;i<list.length;i++){
      result = (int) (result + list[i]*(Math.pow(2, a-1-i)));
      
      // System.out.println(list[i]);
    }
    System.out.println(result);
  }
}
