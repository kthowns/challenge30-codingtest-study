'''
한 가지로 열리는 자물쇠
의사코드
1. n과 3가지의 수를 입력받아 리스트에 저장한다.
2. 삼중 for문으로 리스트에 모든 원소가 (1, n+1)에 접근하게 한다.
3. i와 j와 k 와 리스트의 순차적인 3가지 원소의 합이 2보다 작으면 cnt+=1 을 수행한다.
4. cnt를 출력한다.
'''
n = int(input())
lst = list(map(int,input().split()))

cnt =0
for i in range(1, n + 1):
    for j in range(1, n + 1):
        for k in range(1, n + 1):
            if abs(i - lst[0]) <= 2 or abs(j - lst[1]) <= 2 or abs(k - lst[2]) <= 2:
                cnt+=1

print(cnt)