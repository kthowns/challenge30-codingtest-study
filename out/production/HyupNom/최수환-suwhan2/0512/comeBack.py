'''
의사코드

1. x,y 기본 위치 초기화
2. N 받기
3. 움직이는 move함수
    1. dx,dy 설정
    2. 이동 횟수를 셀 count 선언 및 0으로 초기화
    3. direction distance 입력받기
    4. direction 문자에 따른 정수 설정
    5.distance 만큼 반복이동하는 반복문
        1. 이동
        2. 카운트 증가
        3. 위치가 원점일시 카운트 리턴
    6. 리턴되지 않고 도착시 -1 리턴
4. count 출력
''' 
def move(x,y,N):

    dx,dy=[1,-1,0,0],[0,0,-1,1]
    count=0

    for _ in range(N):
        direction,distance=input().split()
        distance=int(distance)
        
        if direction=='E':
            direction=0
        elif direction=='W':
            direction=1
        elif direction=='S':
            direction=2
        elif direction=='N':
            direction=3

        for _ in range(distance):
            x+=dx[direction]
            y+=dy[direction]
            count+=1
            if x==0 and y==0 :
                return count

    return -1   

def main():
    x,y=0,0    

    N=int(input())  

    count=move(x,y,N)

    print(count)

main()
