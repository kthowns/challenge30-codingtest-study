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
 * 5. 
 */
public class strangejinsoo2 {
  public static void main(String[] args){

    int[] list = new int[]{1,0,1,0};

    for(int i=0;i<list.length;i++){
      if(list[i]==0){
        list[i] = 1;
      }

      System.out.println(list[i]);
    }
  }
}
