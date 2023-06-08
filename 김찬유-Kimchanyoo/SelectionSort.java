import java.util.Scanner;
/*
의사코드
selection_sort(A[1..N]) { # A[1..N]을 오름차순 정렬한다.
    for last <- N downto 2 {
        A[1..last]중 가장 큰 수 A[i]를 찾는다
        if (last != i) then A[last] <-> A[i]  # last와 i가 서로 다르면 A[last]와 A[i]를 교환
    }
}
에 의거하여 계산
1. 입력받는다
2. 배열의 끝에서부터 i값을 잡고 max값을 i로 정한다
    2-1. j의 범위를 i-1부터 0까지 1씩 마이너스하는 식으로 정한다
    2-2. 배열 j번째 값이 배열 max번째 값보다 크면 max를 j로 정한다
    2-3. max값이 i가 아니라면 i번째 값과 max번째 값을 서로 바꾼다
        2-3-1. 값을 바꿀때마다 count를 1씩 증가시킨다
    2-4. count가 k, 즉 입력받은 교환 횟수와 같다면 correct를 true로 반환하고 break한다
3. correct가 true라면 배열을 출력하고 아니면 -1을 출력한다
 */
public class SelectionSort {
    static Scanner sc = new Scanner(System.in);
    static boolean correct = false;
    public static void main(String[] args){
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] inputList = new int[N];
        for(int i = 0; i < N; i++){
            inputList[i] = sc.nextInt();
        }

        selectionSort(N, K, inputList);

        if(correct){
            for(int e : inputList){
                System.out.print(e + " ");
            }
        }
        else{
            System.out.println(-1);
        }
    }

    private static void selectionSort(int N, int K, int[] inputList) {
        int count = 0;
        for(int i = N - 1; i > 0; i--){
            int max = i;
            for(int j = i - 1; j >= 0; j--){
                if(inputList[j] > inputList[max]){
                    max = j;
                }
            }
            if(max != i){
                int temp = inputList[i];
                inputList[i] = inputList[max];
                inputList[max] = temp;
                count++;
            }

            if(count == K){
                correct = true;
                break;
            }
        }
    }
}
