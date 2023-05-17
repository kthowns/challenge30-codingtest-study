'''
의사코드

1. n입력받기
2. nxn의 이차원리스트 만들기
3. 1또는0 받아서 넣기
4. 1x3블럭 두개의 최댓값을 구하기 위해 두개의 최댓값 초기화, 겹치지 않기 위해 활용할 maxi 초기화
5. 첫 블럭의 최댓값 구하기
    1. 블럭이 격자를 벗어나기 못하게 n-2번 반복하며 최댓값 구하기
    2. 최대일때 i값을 maxi에 저장(최대일떄 i 값을 저장하기 위해 max를 사용하지 않고 if 문으로 비교)
6. 두번째 블럭의 최댓값 구하기
    1. 위와 같은 방법으로 최댓값을 구하나 i가 maxi와 같으면 continue
7. 두 최댓값을 구해 총 최댓값(finalmax_cnt) 계산
8. 1x3블럭이 두개이므로 나란히 놓여야 하는데 따로따로 구하다보니 그러지 못하는 경우가 발생
    ex) 0 0 0 0 1 1 0 1  에서 최댓값을 구하면 첫블럭후 자리가 없어 두번째 블럭이 들어가지 못해 최댓값이 3이 아니라 2가 나온다
    1. n이 6이상일때
    2. 1x6크기의 블럭으로 최댓값을 구하고
    3. finalmax_cnt와 비교후 큰값 출력

'''
n = int(input())   
arr = [[0] * n] * n                
for i in range(n): 
    arr[i]=list(map(int,input().split()))

max_cnt = 0
maxi = 0
max_cnt2 = 0

for i in range(n):
    for j in range(n - 2):
        if max_cnt<arr[i][j] + arr[i][j + 1]+arr[i][j+2]:
            max_cnt=arr[i][j] + arr[i][j + 1]+arr[i][j+2]
            maxi=i
                
for i in range(n):
    for j in range(n - 2):
        if max_cnt2<arr[i][j] + arr[i][j + 1]+arr[i][j+2]:
            if i==maxi:
                continue
            max_cnt2=arr[i][j] + arr[i][j + 1]+arr[i][j+2]

finalmax_cnt = max_cnt+max_cnt2

if n>=6:
    for i in range(n):
        for j in range(n - 5):
            finalmax_cnt = max(finalmax_cnt, arr[i][j] + arr[i][j + 1]+arr[i][j+2]+arr[i][j+3]+arr[i][j+4]+arr[i][j+5])
            
print(finalmax_cnt)
