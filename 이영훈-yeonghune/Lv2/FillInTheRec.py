'''
빙빙 돌며 숫자 사각형 채우기2
의사 코드
1. n, m을 입력받는다.
2. dxs, dys를 dir에 맞게 선언한다.
3. 방향에 맞는 x와 y 좌표의 예측을 계산하고 유효한지 판단한다.
4. 유효하지 않으면 방향을 반시계 방향으로 튼다. (격자를 벗어나거나, 이미 할당된 적이 있는 좌표일 경우)
5. 출력한다.
'''

n, m = map(int, input().split())

lst = [[0] *m for _ in range(n)]

#dir에 따른 방향값
dxs, dys = [0, 1, 0, -1], [1, 0, -1 , 0]
x, y =0, 0
dir = 0

for i in range(0, n * m):
    lst[y][x] = i+1

    #방향에 맞는 다음 (x, y)좌표 예측
    nx, ny = x + dxs[dir], y + dys[dir]

    #nx와 ny가 행렬 크기를 벗어나면 방향을 트는 연산
    if nx >= m or ny >= n:
        dir = (dir + 1)%4
    
    #nx와 ny가 행렬 크기 안에 있지만, 기존에 값이 0이 아니면(값이 배정 된적 있으면) 방향을 트는 연산
    if ny <n and nx <m:
        if lst[ny][nx] != 0:
            dir = (dir + 1)%4
        
    x, y = x + dxs[dir], y + dys[dir]
    
for i in range(n):
    for j in range(m):
        print(lst[i][j], end = ' ')
    print()