'''
의사코드

1. N,T 입력받기
2. 격자에 숫자를 넣기 위해 2차원 리스트 초기화
3. L,R,F 문자열 입력받기
4. 격자에 숫자를 입력받아 채워넣기
    1. 임시 리스트에 한줄을 넣고
    2. i,j for문으로 하나씩 array에 넣기
5. x,y 시작점 설정
6. 총합을 시작점의 숫자로 초기화
7. 벗어나는지 검사하는 함수 정의
8. dx,dy 설정
    1. +1할경우 오른쪽으로 돌기
    2. -1할경우 왼쪽으로 돌기
9. 문자열에 따른 명령 시행하는 for문
    1. L일시 dx,dy -1 하지만 0일때는 3으로 변경
    2. R일시 dx,dy +1 하지만 3일떄는 0으로 변경
    3. F일시 dx,dy 적용해서 더하기
        1. 임시 nx,ny로 범위를 벗어나는지 검사
        2. 벗어난다면 무시(continue)
        3. 안벗어난다면 더하기
        4. 총합에 숫자 더하기
10. 총합 출력
'''


N, T = map(int, input().split())
array = [[0]*N for _ in range(N)]      #격자를 저장할 2차원 배열
command = list(input())

for i in range(N):               #격자속 숫자를 입력받기 위해 하나씩 분리해서 적용
    tmparray=list(map(int,input().split()))
    for j in range(N):
        array[i][j]= tmparray[j]

x, y = N//2, N//2      #시작점
nsum = array[x][y]          #총합


def in_range(x,y):        #벗어나는지 검사하는 함수
    return 0<=x and x<N and 0<=y and y<N

dx,dy = [-1,0,1,0],[0,1,0,-1]
dir_num=0

for i in range(T):
    if command[i]=='L':
        if dir_num==0:
            dir_num=3
        else:
            dir_num-=1

    if command[i]=='R':
        if dir_num==3:
            dir_num=0
        else:
            dir_num+=1

    if command[i]=='F':
        nx,ny = x+dx[dir_num],y+dy[dir_num]
        if not in_range(nx, ny): #벗어날경우 무시
            continue
        x,y = x+dx[dir_num],y+dy[dir_num]
        nsum += array[x][y]

print(nsum)


