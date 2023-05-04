import java.util.*;

/*
의사코드
1. 입력할 원소의 개수 n을 정해준다
2. 수열 A와 B의 원소를 입력한다
3. 각 수열에서 값이 같은 원소가 있을 때마다 count를 증가시킨다
    3.1 count의 값이 n과 같으면 "Yes"를 출력한다
    3.2 count의 값이 n과 다르면 "No"를 출력한다
*/
public class SimliarListCompare {
    public static void main(String[] args) {
        int count = 0;
        int i;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for (i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i] != B[j]) {
                    continue;
                } else {
                    count++;
                    break;
                }
            }
        }
        if (count == n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}