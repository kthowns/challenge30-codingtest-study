'''
다 풀어놓고 위의 간단한 반복문 선언을 잘못해서 시간이 오래걸린 어이없는 문제

의사코드

1. 악수 시간과 사람을 입력받을 클래스 선언
2. 사람수, 최대감염가능수, 첫감염자, 입력될 악수 횟수 입력받기
3. 악수를 입력받아 객체들을 리스트에 저장
4. 시간 기준으로 객체들 정렬해서 리스트에 저장
5. 이차리스트로 첫원소에는 감염여부(0 or 1),두번째는 감염가능한 남은 횟수 선언 후 초기화
6. 첫감염자 감염여부 1로 변환
7. x와y 악수시작(반복문)
    1. x가 감염가능한 감염자이면
        1. y도 감염자이면 상대 감염가능횟수-1
        2. y 감염 후 x의 감염 가능횟수 -1
        3. 컨티뉴. 빠져나가기
        
    2. y가 감염가능한 감염자이면
        1. x 감염후 y의 감염가능횟수 -1

8. 이차리스트의 첫원소(감염여부) 반복문으로 출력 
'''
class Virus:
    def __init__(self,time,x,y):
        self.time=time
        self.x=x
        self.y=y

N,K,P,T=map(int,input().split())

handshakes=[]      #입력될 T개의 악수객체들을 저장할 리스트 선언
for i in range(T):
    time, x, y=list(map(int , input().split()))
    handshakes.append(Virus(time,x,y))

handshakes.sort(key=lambda x: x.time ) #악수리스트 시간순으로 정렬

developers=[[0,K] for i in range(N)]      #개발자들을 표현할 이차리스트 선언
developers[P-1][0] = 1       #첫 감염자 1로 바꾸기 


for i in range(T):
    if developers[handshakes[i].x-1][0]==1 and developers[handshakes[i].x-1][1]>0: #x가 감염자면
        if developers[handshakes[i].y-1][0]==1:   #동시에 y도 감염자면
            developers[handshakes[i].y-1][1]-=1   #y 감염횟수 -1
        developers[handshakes[i].y-1][0]=1           #y 감염
        developers[handshakes[i].x-1][1]-=1         # x감염횟수 -1
        continue   #뛰어넘어야 이번에 감염된 사람을 좀비로 계산하지 않는다

    elif developers[handshakes[i].y-1][0]==1 and developers[handshakes[i].y-1][1]>0: #y가 감염자면
        developers[handshakes[i].x-1][0]=1       #x감염
        developers[handshakes[i].y-1][1]-=1      #y 감염 횟수 -1

for i in range(N):
    print(developers[i][0], end="")
    
    
