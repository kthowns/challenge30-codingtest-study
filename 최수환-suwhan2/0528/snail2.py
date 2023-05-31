'''
의사코드

1. 입력받기
2. 2차원 리스트 만들기
3. 범위를 벗어나는지 확인하는 함수 
4. 방향을 달팽이 방향으로 dx,dy테크닉 정의, 시작점 정의
5. 숫자를 입력하는 반복문
    1. 만약 범위를 벗어나거나 0이 아니라면 방향 바꾸기
    2. 숫자 입력
6. 출력
'''

n,m = map(int,input().split())
answer = [
    [0]*m 
    for _ in range(n)
    ]

def in_range(x,y):         #범위를 벗어나는지 확인하는 함수정의
    return 0<=x and x<n and 0<=y and y<m

dxs,dys=[1,0,-1,0],[0,1,0,-1]
x,y = 0,0
dir_num=0
answer[x][y]=1

for i in range(2,n*m+1):
    nx,ny = x + dxs[dir_num],y+dys[dir_num]

    if not in_range(nx, ny) or answer[nx][ny] != 0:
        dir_num = (dir_num+1)%4
    
    x,y= x + dxs[dir_num], y + dys[dir_num]
    answer[x][y]=i

for i in range(n):
    for j in range(m):
        print(answer[i][j], end=' ')
    print()
