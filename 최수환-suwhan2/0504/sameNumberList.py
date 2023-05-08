'''
의사코드

1. 수열비교함수 정의
    1. 수열길이만큼 반복
    2. 다른 숫자 발견시 No출력후 빠져나오기
    3. 수열끝까지 비교후 이상없을시 Yes출력

2. 메인함수
    1. n받기
    2. A,B 수열 리스트로 받기
    3. A,B 정렬
    4. 함수사용

'''

def compareNumber(n,A,B):
    for i in range(0,n):
        if A[i] != B[i]:
            print('No')
            break
        elif i==n-1:
            print('Yes')

def main():
    n=int(input())

    A=list(map(int,input().split()))
    B=list(map(int,input().split()))

    A.sort()
    B.sort()
    compareNumber(n,A,B)

main()
