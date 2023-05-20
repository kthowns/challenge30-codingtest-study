import java.util.Scanner;
/*
의사코드
1. 2진수를 입력받는다
2. 문자열로 입력받은 2진수를 문자형 배열로 변환
3. StringBuilder로 문자형 배열이 변경이 가능하도록 만든다( 문자열은 변경이 불가능하기 때문 )
4. 2진수의 0인 자리를 찾는다
    4-1. 2진수의 값이 0이 나오면 그 자리 수를 1로 바꾸고 break를 한다
    4-2. 2진수 값이 1이 나올때마다 count를 1씩 증가시킨다
5. count의 크기가 배열의 크기 - 1과 같다면 배열의 크기 - 1의 값을 0으로 만든다
6. 문자형 배열을 문자열로 변화시키고 2진수를 10진수로 변화시킨다
7. 10진수로 변경된 값을 출력한다
 */
public class StrangeBinary {
    static Scanner sc = new Scanner(System.in);
    static int count = 0;
    public static void main(String[] args){
        char[] binaryList = stringToChar();
        StringBuilder tmp = new StringBuilder(new String(binaryList));
        calculateBinary(binaryList, tmp);
        int resultNumber = charToInteger(tmp);
        System.out.println(resultNumber);
    }

    /**
     * 문자형 배열을 문자열로 변환하고 10진수 정수로 변경하는 함수
     * @param tmp 문자형을 변경하기 위한 StringBuilder 클래스 변경
     * @return 10진수 정수
     */
    private static int charToInteger(StringBuilder tmp) {
        String resultBinary = tmp.toString();
        int resultNumber = Integer.parseInt(resultBinary, 2);
        return resultNumber;
    }

    /**
     * 진수의 값을 변경하는 함수
     * @param binaryList 문자형 배열
     * @param tmp 문자형을 변경하기 위한 StringBuilder 클래스 변경
     */
    private static void calculateBinary(char[] binaryList, StringBuilder tmp) {
        for(int i = 0; i < binaryList.length; i++){
            if(binaryList[i] == '0'){
                tmp.setCharAt(i, '1');
                break;
            }
            else{
                count++;
            }
        }
        if(count == binaryList.length){
            tmp.setCharAt(binaryList.length - 1,'0');
        }
    }

    /**
     * 문자열 변수를 문자형 배열로 변환한다
     * @return 문자형 배열
     */
    private static char[] stringToChar() {
        String binary = sc.nextLine();
        char[] binaryList = binary.toCharArray();
        return binaryList;
    }
}
