'''
의사코드

생각보다 어려워서
객체를 만들어 한 선분의 점이 다른 선분에 모두 포함되는지 비교하는 방식으로 진행

1. 두 점을 받을 클래스 정의
2. 점들 입력받기 , 두점을 받을때마다 객체화해서 리스트에 추가
3. 전부겹치는 선분 찾기 findOverlappiong
    1. 첫 선분의 시작점 compare에 넣기
    2. 비교하는 while
        1. 카운트=0
        2. 점이 모든 선분에 들어간다면 return 1
        3. 아니라면 compare+1
        4. compare을 올리다가 compare가 첫 선분의 끝점을 넘어간다면 더 비교할게 없으므로 return 0
4. 리턴값에 따른 출력
'''
class Line:
    def __init__ (self,x,y):
        self.x=x
        self.y=y


def findOverlapping(lines,n):

    compare=lines[0].x        #첫 선분의 정보를 이용하기위해  첫객체의 시작점 compare에 넣기      

    while True:       
        count=0

        for i in range(1,n):
            if lines[i].x<=compare and compare<=lines[i].y: #첫 점이 비교선분안에 들어간다면 카운트 +1
                count+=1
 
        if count==n-1:         #반복후 모든 선분에 들어간다면(카운트가 n-1이라면) 1반환
            return 1
           
        compare+=1        #모든 선분에 들어가진 않는다면 점+1

        if compare==lines[0].y+1:    #만약 비교하던 점이 첫 선분의 끝을 넘어갔다면 더 없다는 뜻이므로 리턴 0
           return 0
   
def main():
    #입력부
    n=int(input())
    lines=[]
    for _ in range(n):
        x,y=map(int,input().split())
        lines.append(Line(x,y))       #객체로 두점을 받아서 리스트에 넣기

    #연산부
    result=findOverlapping(lines,n)

    #출력부
    if result==1:
        print("Yes")
    else:
        print("No")

main()
