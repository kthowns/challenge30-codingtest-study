'''
런타임 에러가 남

tmp로 swap해서 풀었더니 런타임 에러
우선순위 큐로 돌렸더니 계속 런타임 에러가 난다.
IDE에서는 돌아가는데 백준에서 돌리니 런타임 에러간 나는 문제점을 해결하지 못함


의사코드
1. 큐 import
2. 입력받기
3. 우선순위 큐 생성
4. 큐에 넣기
  1. k보다 클경우 먼저 출력해버리기(k까지만 진행하기 위해서)
5. 우선순위 큐에 남은 원소들 출력
'''

from queue import PriorityQueue

N,K = map(int,input().split())
array = list(map(int,intput().split()))

'''
N,K = 4,1
array=[62,23,32,15]
'''

que = PriorityQueue()

for i in range(N):
    que.put(array[i])
    if i>=K:
        print(que.get(), end=" ")  

while que:
    print(que.get(), end=" ")
