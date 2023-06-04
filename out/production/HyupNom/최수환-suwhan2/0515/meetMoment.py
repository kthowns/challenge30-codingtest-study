'''
의사코드

1. A,B리스트 선언 후 시작점 0으로 설정
2. N,M 받기
3. 리스트에 A의 움직임 기록하기
4. 리스트에 B의 움직임 기록하기
    1. 하나 기록함과 동시에 해당하는 A리스트의 값과 비교후 같다면 B리스트의 길이(만나는데 걸린시간) 리턴
5. 결과 출력
'''
def inputA(A,N):
    for _ in range(N):
        direction, distance = input().split()
        distance=int(distance)

        if direction=="R":
            for _ in range(distance):
                A.append(A[-1]+1)
        else:
            for _ in range(distance):
                A.append(A[-1]-1)




def inputBandCompare(A,B,M):
    for _ in range(M):
        direction, distance = input().split()
        distance=int(distance)

        if direction=="R":
            for _ in range(distance):
                B.append(B[-1]+1)

                if B[-1]==A[len(B)-1]:
                    return len(B)-1
                    
        else:
            for _ in range(distance):
                B.append(B[-1]-1)

                if B[-1]==A[len(B)-1]:
                    return len(B)-1
                   
    return -1

'''      
함수추출 하려다가 실패
def compareAandB(A,B):
    if B[-1]==A[len(B)-1]:
        return len(B)-1    
'''    

def main():
    A=[0]
    B=[0]
    N,M=map(int,input().split())    

    inputA(A,N)
    result=inputBandCompare(A,B,M)

    print(result)

main()
