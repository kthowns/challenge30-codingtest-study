import java.util.PriorityQueue;
import java.util.Scanner;
public class BubbleSort {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int K = sc.nextInt();

        /**
         * 단순 버블정렬을 사용한 방식
        int count = 0;

        int[] bubbleList = new int[N];

        for(int i = 0; i < N; i++){
            bubbleList[i] = sc.nextInt();
        }

        for(int i = 0; i < bubbleList.length; i++) {
            for(int j = 0 ; j < bubbleList.length - i - 1 ; j++) {
                if(bubbleList[j] > bubbleList[j+1]) {
                    int temp = bubbleList[j+1];
                    bubbleList[j+1] = bubbleList[j];
                    bubbleList[j] = temp;
                }
            }
            count++;
            if(K == count){
                break;
            }
        }

        for(int x : bubbleList){
            System.out.print(x + " ");
        }
         */
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<N; i++){
            pq.offer(sc.nextInt());
            // 우선순위 큐에서 범위를 k + 1개로 두고 오름차순으로 정리하여 작은걸 출력한다
            if(i>=K){
                System.out.print(pq.poll() + " ");
            }
        }
        // 큐에 남아있는 것을 출력한다
        while(!pq.isEmpty()){
            System.out.print(pq.poll() + " ");
        }
    }
}
