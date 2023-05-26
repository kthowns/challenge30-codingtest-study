'''
의사코드

1. 최댓값 찾는 함수 정의
    1. 수열의 끝까지 비교했다면 최댓값 출력후 빠져나오기
    2. 지정된 수열값과 최댓값을 비교해서 지정된 수열이 더 크다면 최댓값 교체
    3. 포인트 이동
    4. 재귀

2. 메인
    1. 정수 받기
    2. 수열 받기
    3. 최대값, 포인트 선언 및 초기화
    4. 함수 실행
'''

def findMax(length, numbers,maxNumber,point):     #인자(리스트길이, 리스트, 최댓값, 비교할곳을 지정할 포인트)

    if point==length:
        print(maxNumber)     #결과값 출력후 재귀빠져나오기
        return

    elif numbers[point]>maxNumber:
        maxNumber=numbers[point]
    
    point+=1
    findMax(length,numbers,maxNumber,point)         #재귀



def main():
    n=int(input())
    numberList=list(map(int,input().split()))

    maxNumber=0      #최댓값 선언후 0으로 초기화
    point=0         #리스트를 지정해서 비교할 변수 선언 및 초기화

    findMax(n,numberList,maxNumber,point)


main()
