'''
아름 다운 수열2
의사코드
1. N, M을 입력받는다
2. 두 수열을 lst, lst2에 입력받는다.
3. M 크기만큼의 N 크기의 수열을 탐색하기 위해 (N - M + 1)번 반복한다.
4. N 수열내의 범위와 M수열을 서로 정렬하고 비교한다.
5. 같으면 cnt += 1 해주고 출력한다.
'''
N, M = map(int,input().split())

lst = list(map(int,input().split()))
lst2 = list(map(int,input().split()))

cnt = 0
for i in range(N - M + 1):
    if sorted(lst[i:i+M]) == sorted(lst2):
        cnt+=1

print(cnt)