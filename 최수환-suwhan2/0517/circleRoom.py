'''
의사코드
1. 최소 거리를 구하기 위해 최대거리 초기화
2. 리스트를 만들어 입력받기
3. 최소거리 찾기
    1. 비교할 방의 순서에 따른 거리 계산
    2. 대소비교
4. 출력
i와j 의 차로
'''

import sys

INT_MAX = sys.maxsize
mindistance = INT_MAX

#입력부
N=int(input()) 

limitpeople=[0]*N
for i in range(N):
    limitpeople[i]=int(input())


def findMinDistance(N,limitpeople,mindistance):
    for i in range(N):
        sumnumber=0
    
        for j in range(N):            #거리 구하기
            
            if i<j:
                sumnumber += (j-i)*limitpeople[j]
            elif i>j:  
                sumnumber += (N-i+j)*limitpeople[j]
            else:
                continue

        mindistance=min(mindistance,sumnumber) #최소거리 비교
    
    return mindistance

#연산
mindistance = findMinDistance(N,limitpeople,mindistance)

#출력
print(mindistance)


