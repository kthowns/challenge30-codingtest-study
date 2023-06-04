'''
좌표평면 위의 특정 구역 2
의사코드
1. 점의 개수 n을 받는다.
2. n번의 x와 y 좌표를 lst에 넣는다.
3. n번 반복한다.
4. 반복할때마다 lst요소를 순차적으로 1개씩 뺀다.
5. 뺀후 x의 최대값과 최소값, y의 최대값과 최소값 을 구해서 직각 사각형의 넓이는 구한다.
6. 직각 사각형의 최소값을 구해서 출력한다.
'''
import sys

Max = sys.maxsize

n = int(input())
lst =[]

for i in range(n):
    a, b = map(int,input().split())
    lst.append([a, b])

for i in range(n):
    lst2 = lst.copy()
    del lst2[i]
    
    lst2 = sorted(lst2, key= lambda x : x[0])
    x_min = lst2[0][0]
    x_max = lst2[n-2][0]

    lst2 = sorted(lst2, key= lambda x : x[1])
    y_min = lst2[0][1]
    y_max = lst2[n-2][1]

    area = (x_max - x_min) * (y_max - y_min)
    if area < Max:
        Max = area

print(Max)
