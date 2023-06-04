'''
좌우로 움직이는 로봇
의사코드
1. n, m을 입력받는다.
2. 거리, 방향을 입력받으면서 방향에 맞춰 거리만큼 for 문을 이용하여 A_footprint에 삽입한다.
3. 거리, 방향을 입력받으면서 방향에 맞춰 거리만큼 for 문을 이용하여 B_footprint에 삽입한다.
5. 이동한 시간이 다를수 있기때문에, 더 작은 Cnt의 발자취를 다른 발자취의 크기에 맞춰 마지막 인덱스값을 계속 추가한다.
6. for문을 활용하여 같은 시간에 같은 좌표에 있으면서 직전에 같은 좌표에 있지 않은 인덱스의 개수를 측정하고 출력한다.
'''

# 변수 선언 및 입력
n, m = (map(int, input().split()))
A_footprint, B_footprint = [0] * (1000000 + 1), [0] * (1000000 + 1)

A_cnt = 1
for i in range(n):
    Distance, Direction = input().split()
    for j in range(int(Distance)):
        A_footprint[A_cnt] = A_footprint[A_cnt -1] + (1 if Direction == 'R' else -1)
        A_cnt += 1
    
B_cnt = 1
for i in range(m):
    Distance, Direction = input().split()
    for j in range(int(Distance)):
        B_footprint[B_cnt] = B_footprint[B_cnt -1] + (1 if Direction == 'R' else -1)
        B_cnt += 1

if A_cnt < B_cnt:
    for i in range(A_cnt,B_cnt):
        A_footprint[i] = A_footprint[i-1]
elif A_cnt > B_cnt:
    for i in range(B_cnt, A_cnt):
        B_footprint[i] = B_footprint[i-1]

result = 0
max_time = max(A_cnt, B_cnt)
for i in range(1, max_time):
    if A_footprint[i] == B_footprint[i] and (A_footprint[i - 1] != B_footprint[i-1]):
        result +=1

print(result)

