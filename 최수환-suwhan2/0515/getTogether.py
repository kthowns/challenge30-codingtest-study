'''
의사코드

1. 거리의 최솟값을 구해야 하므로 최소거리 기본값을 최대로 잡고 초기화
2. 입력받기
3. 도착할 집을 i로 설정후 반복
    1. 거리계산을 위해 설정한 집을 j로 반복
        1. 사람수 * 거리
    2. 최소거리 정하기
4. 최소거리 출력
'''

import sys

INT_MAX = sys.maxsize

n=int(input())
people=list(map(int,input().split()))

min_distance = INT_MAX

for i in range(0,n):
    distance = 0

    for j in range(0,n):         #특정 집으로 모일때 총 이동거리 구하기
        distance += people[j] * abs(i-j) 
    
    min_distance = min(min_distance , distance)    #이동거리중 최솟값 찾기

print(min_distance)
