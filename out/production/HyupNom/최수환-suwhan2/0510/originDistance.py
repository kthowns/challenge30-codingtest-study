'''
의사코드

1. 클래스 정의
2. n받기
3. 객체를 저장할 리스트 선언
4. 객체를 입력받아 생성후 리스트에 추가
5. 정렬
6. 출력
'''
class Point:
    def __init__(self,x,y,number):
        self.x=x
        self.y=y
        self.number=number
        
#입력부
n=int(input())

points=[]
for i in range(1,n+1):
    x,y=map(int,input().split())  #입력받기
    number=i #번호지정
    points.append(Point(x,y,number)) #리스트에 추가

#연산부
points.sort(key=lambda x: (abs(x.x)+abs(x.y) , x.number) )   #abs는 절대값을 구하는 함수

#출력부
for point in points:
    print(point.number)
