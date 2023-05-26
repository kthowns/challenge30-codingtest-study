'''
만나는 그 순간
의사코드
1. N, M을 입력받는다.
2. 방향, 거리 순으로 리스트에 입력한다.
3. A 와 B 각각 방향과 거리를 반영한다.
4. 발자취 리스트에 초당 좌표를 입력한다.
5. A 발자취 리스트, B 발자취 리스트 서로 같은 값을 갖는 인덱스 번호를 찾는다.
6. 인덱스 번호는 0부터 시작하니 +1 하고 출력한다.
'''
def max_list_Calc(A_Footprint, B_Footprint):
    if len(A_Footprint) > len(B_Footprint):
        max_time = len(A_Footprint)
    else:
        max_time = len(B_Footprint)
    return max_time

N, M = map(int, input().split())
lst =[]
A = 0
B = 0
A_Footprint = []
B_Footprint = []

for i in range(N+M):
    Direction, Distance = input().split()
    Distance = int(Distance)

    lst.append([Direction, Distance])

#A 발자취 입력
for i in range(N):
    Direction = lst[i][0]
    Distance = lst[i][1]

    if Direction == 'R':
        for i in range(Distance):
            A += 1
            A_Footprint.append(A)
    
    if Direction == 'L':
        for i in range(Distance):
            A -= 1
            A_Footprint.append(A)

#B 발자취 입력
for i in range(M):
    i = i+N
    
    Direction = lst[i][0]
    Distance = lst[i][1]

    if Direction == 'R':
        for i in range(Distance):
            B += 1
            B_Footprint.append(B)
    
    if Direction == 'L':
        for i in range(Distance):
            B -= 1
            B_Footprint.append(B)

max_time = max_list_Calc(A_Footprint, B_Footprint)

flag = False
for time in range(max_time):
    
    if A_Footprint[time] == B_Footprint[time]:
        print(time + 1)
        flag = True
        break

#겹치지 않는경우
if flag == False:
    print("-1")