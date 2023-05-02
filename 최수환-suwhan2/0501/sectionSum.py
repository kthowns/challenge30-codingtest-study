#이제 입력값 받는 법을 좀 알겠다...적응하는 중
'''
의사코드

1. 정수 두개 받기
2. 리스트를 만들면서 리스트에 정수들 넣기
3. m번 만큼 반복해 구간합 구하기
    1. 구간합 초기화
    2. 구간 입력 받기
    3. 구간합 구하기
    4. 출력

'''

n,m=map(int, input().split())
A = list(map(int, input().split()))

for i in range(1,m+1):
    sum=0
    a1 ,a2= map(int, input().split())
    for j in range(a1,a2+1):
        sum+=A[j-1]
    print(sum)
