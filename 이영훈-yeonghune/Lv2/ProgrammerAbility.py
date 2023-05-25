'''
개발자의 능력3
의사코드
1. 6명의 알고리즘능력을 수치화해서 리스트에 넣는다.
2. 3중 for문을 활용해서 선택할 수 있는 3개의 모든 경우의수를 구한다.
3. get_diff 함수를 통해 고른 3개와 전체를 빼고 평균을낸다.
4. Minimum과 대소비교를 한다.
5. Minimum보다 작으면 Minimum을 초기화한다.
'''

import sys

lst = list(map(int,input().split()))

def get_diff(i, j, k):
    sum1 = lst[i] + lst[j] + lst[k]
    sum2 = sum(lst) - sum1
    return abs(sum1 - sum2)

Minimum = sys.maxsize
for i in range(6):
    for j in range(i+1, 6):
        for k in range(j+1, 6):
            Minimum = min(Minimum, get_diff(i,j,k))

print(Minimum)
