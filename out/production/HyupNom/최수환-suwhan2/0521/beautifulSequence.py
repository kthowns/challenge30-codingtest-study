'''
의사코드
1. 입력받기
2. A리스트 B리스트 만큼 슬라이싱후 소팅후 비교
3. 맞으면 카운트 +1
'''

N,M = map(int, input().split())
A=list(map(int,input().split()))
B=list(map(int,input().split()))

count=0

for i in range(N-M+1):

    if sorted(A[i:i+M])==sorted(B):
        count+=1

print(count)
