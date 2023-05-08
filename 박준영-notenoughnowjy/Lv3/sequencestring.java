package Lv3;

import java.util.Scanner;
import java.util.Arrays;

/*의사 코드
 * 1. String을 입력받는다.
 * 2. 이것을 Char 배열로 넘겨줘야한다. Java ㅡ,.ㅡ;; -> PYTHON은 안념겨줘도 되는 것으로 알고 있다.
 * 3. char배열로 받은 것을 다시 String으로 받아준다. -> char배열로 바로 비교시 비교 출력이 테스트케이스처럼 안되는 경우가 발생
 * 4. 같으면 Yes 다르면 No를 출력한다.
 * 5. 처음에 ==을 사용했지만 (aba, aab) 테스트케이스에서 No가 출력되어짐. 정렬이 똑바로 되어지지 않는 것 같다 -> 이유를 알면 좋을
 */

public class sequencestring {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String firstString = sc.next();
    String secondString = sc.next();

    char[] firstChars = firstString.toCharArray();
    Arrays.sort(firstChars);
    String sortedChars1 = new String(firstChars);

    char[] secondChars = secondString.toCharArray();
    Arrays.sort(secondChars);
    String sortedChars2 = new String(secondChars);


    if(sortedChars1.equals(sortedChars2)){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }


    // if(firstChars == secondChars){
    //     System.out.println("Yes");   
    // }
    // else{
    //     System.out.println("No");
    // }
    
    }
}
