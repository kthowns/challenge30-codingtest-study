'''
못풀었다, 해설을 보았다
로직은 맞지만 쓰는 문법이 해설과 내가 다르다
파이썬 언어에 대해 조금 더 공부를 하자
일단 내코드와 해설 모두 업로드 하였다

내가 짠 코드 의사코드

1. A,B리스트 선언 후 시작점 0으로 설정
2. N,M 받기
3. 리스트에 A의 움직임 기록하기
4. 리스트에 B의 움직임 기록하기
    1. d=0
    2. B와A의 마지막 원소가 다르면 d=1
    3. 원소 추가하기
    4. B와A의 마지막 원소가 같고 d가 1이면 count+=1 
5. count 출력
'''
def inputA(A,N):
    for _ in range(N):
        distance, direction = input().split()
        distance=int(distance)

        if direction=="R":
            for _ in range(distance):
                A.append(A[-1]+1)
        else:
            for _ in range(distance):
                A.append(A[-1]-1)

def inputBandCompare(A,B,M):
    count=0
    for _ in range(M):
        distance, direction = input().split()
        distance=int(distance)

        if direction=="R":
            for _ in range(distance):
                d=0
                
                if B[-1]!=A[len(B)-1]:
                    d=1    
                B.append(B[-1]+1)

                if B[-1]==A[len(B)-1] and d==1:
                    count+=1
                    
        else:
            for _ in range(distance):
                d=0

                if B[-1]!=A[len(B)-1]:
                    d=1  

                B.append(B[-1]-1)

                if B[-1]==A[len(B)-1] and d==1:
                    count+=1
                   
    return count
  
def main():
    A=[0]
    B=[0]
    N,M=map(int,input().split())    

    inputA(A,N)
    count=inputBandCompare(A,B,M)

    print(count)

main()

'''
여기서부터 해설
'''
main()

MAX_T = 1000000

# 변수 선언 및 입력
n, m = tuple(map(int, input().split()))
pos_a, pos_b = [0] * (MAX_T + 1), [0] * (MAX_T + 1)

# A가 매 초마다 서있는 위치를 기록
time_a = 1
for _ in range(n):
    t, d = tuple(input().split())
    for _ in range(int(t)):
        pos_a[time_a] = pos_a[time_a - 1] + (1 if d == 'R' else -1)
        time_a += 1

# B가 매 초마다 서있는 위치를 기록
time_b = 1
for _ in range(m):
    t, d = tuple(input().split())
    for _ in range(int(t)):
        pos_b[time_b] = pos_b[time_b - 1] + (1 if d == 'R' else -1)
        time_b += 1

if time_a < time_b:
	for i in range(time_a, time_b):
		pos_a[i] = pos_a[i - 1]
elif time_a > time_b:
	for i in range(time_b, time_a):
		pos_b[i] = pos_b[i - 1]

# 새롭게 만나는 횟수를 구합니다.
cnt = 0
time_max = max(time_a, time_b)
for i in range(1, time_max):
    if pos_a[i] == pos_b[i] and pos_a[i - 1] != pos_b[i - 1]:
        cnt += 1
        
print(cnt)
