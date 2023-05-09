import java.util.*;
/*
의사코드
1. 두개의 단어를 입력받는다
2. 단어의 길이를 검사한다
    2-1. 단어의 길이가 다르면 No를 출력한다
    2-2. 단어의 길이가 같으면 char배열로 단어를 변환한다
        2-2-1. 배열을 정렬시키고 char배열을 String으로 다시 변환한다
        2-2-2. 문자열이 동일하다면 Yes를 출력시키고 No라고 출력한다.
 */
public class CompareStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if(s1.length() != s2.length()){
            System.out.println("No");
            return;
        }
        else{
            char[] s1_temp = s1.toCharArray();
            char[] s2_temp = s2.toCharArray();
            Arrays.sort(s1_temp);
            Arrays.sort(s2_temp);
            s1 = String.valueOf(s1_temp);
            s2 = String.valueOf(s2_temp);
            if(s1.equals(s2)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
