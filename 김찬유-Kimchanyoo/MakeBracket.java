import java.util.Scanner;
/*
의사코드
1. 문자 '(', ')'로만 이루어진 문자열을 입력받는다
2. 문자열을 문자형 배열로 만든다
3. ((과 ))이 나오는 경우의 수를 판단한다
    3-1. 배열의 0번째부터 배열의 크기 -1까지 연속해서 ((이 나오는 경우와
         배열의 2번째부터 배열의 크기 -1까지 연속해서 ))이 나오는 경우가 나올때 마다 countBrackets를 1씩 증가시킨다
4. countBrackets를 출력한다.
 */
public class MakeBracket {
    static Scanner sc = new Scanner(System.in);
    static final int MAX_LENGTH = 100;
    static char[] BracketList = new char[MAX_LENGTH];
    static int countBrackets = 0;
    public static void main(String[] args){
        String brackets = sc.next();
        for(int i = 0; i < brackets.length(); i++){
            BracketList[i] = brackets.charAt(i);
        }

        calculateBrackets(brackets);

        System.out.println(countBrackets);
    }

    /**
     * 괄호 쌍을 판별하는 함수
     * @param brackets 괄호들이 들어있는 문자열
     */
    private static void calculateBrackets(String brackets) {
        for(int i = 0; i < brackets.length()-1; i++){
            for(int j = i + 2; j < brackets.length()-1; j++){
                if((BracketList[i] == '(') && (BracketList[i+1] == '(')
                        && (BracketList[j] == ')') && (BracketList[j+1] == ')')){
                    countBrackets++;
                }
            }
        }
    }
}
