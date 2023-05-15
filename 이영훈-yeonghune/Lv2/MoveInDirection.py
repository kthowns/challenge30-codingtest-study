'''
방향에 맞춰 이동
의사코드
1. N번 동안 방향과 거리를 입력받아 리스트(2차원)에 저장한다.
2. Calc 함수를 입력해서 lst 에서 방향과 거리를 추출한다.
3.1 Direction 의 방향에 따라 x 와 y를 Distance만큼 증감한다.
3.2 수행한 x와 y의 좌표를 수행한다.
'''
def Calc(lst):
    x, y = 0, 0

    for Direction, Distance in lst:
        if Direction == 'N':
            y += Distance
        if Direction == 'E':
            x += Distance
        if Direction == 'S':
            y -= Distance
        if Direction == 'W':
            x -= Distance

    print(x, y)


n = int(input())
lst = []

for i in range(n):
    Direction, Distance = input().split()
    Distance = int(Distance)
    lst.append([Direction, Distance])

Calc(lst)

 