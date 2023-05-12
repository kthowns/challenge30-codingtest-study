'''
두 선분
의사코드
1. x1, x2, x3, x4를 입력받고 Operating 함수에 인자로 넘긴다.
2. 서로 선분 끝점이 서로의 범위에 속하는지 판단한다.
3. 2번에서 속하지 않는다면 한 선분이 한 선분을 포함하는지 판단한다.
'''
def Operating(x1, x2, x3, x4):

    #x3, x4가 (x1:x2) 범위 내에 있는경우
    if x1 <= x3 <= x2 or x1 <= x4 <= x2:
        print("intersecting")
        return
    
    #x1, x2가 (x3:x4) 범위 내에 있는경우
    if x3 <= x1 <= x4 or x3 <= x2 <= x4:
        print("intersecting")
        return
    
    #끝점이 범위 내에 있는게 아니라 한 선분이 나머지 선분을 포함하는 경우
    if (x2 - x1) > (x4 - x3):
        for Num in range(x3, x4+1):
            if x1 <= Num <= x2:
                print("intersecting")
                return
    else:
        for Num in range(x1, x2+1):
            if x3 <= Num <= x4:
                print("intersecting")
                return
    
    print("nonintersecting")
    

x1, x2, x3, x4 =map(int, input().split())
Operating(x1, x2, x3, x4)


