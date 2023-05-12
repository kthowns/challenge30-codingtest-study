'''
의사코드

1. N입력받기
2. x,y의 초기 위치 설정
3. 문제에서 주어진 W,S,N,E 순으로 dx,dy technique설정
4. 입력받아 움직이는 for 문
    1. 방향,거리 입력받기
    2. 거리는 문자열로 받았으니 int로 변환
    3. 받은 방향이 문자이므로 문자에 따른 정수로 변환
    4. 거리만큼 정해진 방향으로 이동
5. 출력
'''

def move(x,y,N):

    dx, dy = [-1, 0, 0, 1], [0, -1, 1, 0]

    for _ in range(N):

        direction, distance = input().split()
        distance=int(distance)       #문자일 거리를 정수로 변환

        if direction =='W':
            direction=0
        elif direction=='S':
            direction=1
        elif direction=='N':
            direction=2
        elif direction=='E':
            direction=3

        x, y = x + distance*dx[direction], y + distance*dy[direction]      #거리만큼 곱해준후 그방향으로 이동

    return x,y

def main():

    x, y = 0, 0

    N = int(input())
    
    x,y=move(x,y,N)

    print (x,y)

main()
