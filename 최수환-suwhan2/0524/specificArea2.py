'''
의사코드
1. n입력받기
2. 리스트안에 튜플 입력받기
3. 최소넓이 초기화
4. 하나를 제외한 경우의 수에서 넓이 계산
    1. 최대x차 최대y차로 넓이 계산
    2. 최소 넓이 찾기
5. 출력
'''

n = int(input())
segments=[(0,0)]*n
for i in range(n):
    segments[i] = tuple(map(int,input().split()))

min_area = 40000*40000


for i in range(n):
    maxX1,maxX2=0,0
    minX1,minX2=40000,40000
    for j in range(n):
        if j == i:
            continue

        x1, x2 = segments[j]
        maxX1=max(maxX1,x1)
        minX1=min(minX1,x1)

        maxX2=max(maxX2,x2)
        minX2=min(minX2,x2)

    subx1 = maxX1-minX1
    subx2 = maxX2-minX2
    area = subx1 * subx2
    min_area = min(min_area,area)

print(min_area)
