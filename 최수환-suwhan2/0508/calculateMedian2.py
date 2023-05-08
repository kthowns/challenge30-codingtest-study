'''
의사코드

1. 입력값 받기
2. 홀수번째만 시행하는 반복문
    1. 홀수번째 인덱스까지만 추출해 a리스트에 저장
    2. 정렬
    3. 중앙값 출력

'''


n=int(input())
nunmberList=list(map(int, input().split()))

for i in range(0,n,2):
    a=nunmberList[0:i+1]
    a.sort()
    print(a[(i // 2)], end=" ")
