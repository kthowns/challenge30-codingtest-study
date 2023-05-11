'''
되돌아오기
의사코드
1. 방향과 거리를 입력받아 리스트(2차원)에 삽입한다.
2. Calc 함수에서 연산한다.
3 리스트에 담긴 Direction과 Distance 뭉치를 추출하여 연산한다.
3.1 N 이면 y를 1씩 Distance번 증가시킨다.
3.2 S 이면 y를 1씩 Distance번 감소시킨다.
3.3 W 이면 x를 1씩 Distance번 감소시킨다.
3.4 E 이면 x를 1씩 Distance번 증가시킨다.
4. 3번 연산이 진행되는 도중에 x와 y가 둘다 0이되면 cnt를 출력하고 함수를 리턴한다.
5. x와 y가 0이 되는 지점이 없으면 -1을 리턴한다.
'''
def Calc(lst):
    x, y = 0, 0 #초기범위
    cnt = 0 #이동 초 체크 변수
    for Direction, Distance in lst:

        if Direction == 'N':
            for i in range(Distance):
                y += 1
                cnt +=1
                if x == 0 and y ==0:
                    print(cnt)
                    return

        if Direction == 'E':
            for i in range(Distance):
                x += 1
                cnt +=1
                if x == 0 and y ==0:
                    print(cnt)
                    return
            
        if Direction == 'S':
            for i in range(Distance):
                y -= 1
                cnt +=1
                if x == 0 and y ==0:
                    print(cnt)
                    return
            
        if Direction == 'W':
            for i in range(Distance):
                x -= 1
                cnt +=1
                if x == 0 and y ==0:
                    print(cnt) 
                    return          
    
    print(-1)

    


n = int(input())
lst = []

for i in range(n):
    Direction, Distance = input().split()
    Distance = int(Distance)
    lst.append([Direction, Distance])

Calc(lst)
