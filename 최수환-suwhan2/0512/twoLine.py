'''
의사코드

겹치는 부분을 찾는것보다
안겹치는 경우를 찾는게 더욱 쉽다
1. 점 입력받기
2. 겹치는지 확인하는 compareIntersecting
3. 출력
'''

def compareIntersecting(x1,x2,x3,x4):

    if x2<x3 or x4<x1:
       return False
    else:
        return True

def main():
    #입력부
    x1,x2,x3,x4=map(int,input().split())
    
    #연산부
    result=compareIntersecting(x1,x2,x3,x4)

    #출력부
    print('intersecting' if result==True else 'nonintersecting')

main()
