'''
중앙값 계산 2
의사코드
1. N과 배열을 입력받는다.
2. for문을 실행할때 index의 범위 까지만큼 슬라이싱한다.
3. 슬라이싱된 리스트를 getMedian() 함수에 입력하고 반환값을 출력한다.
'''
def getMedian(arr): #중앙값 구하는 함수
    arr = sorted(arr)
 
    centerIndex = len(arr)//2
    return (arr[centerIndex])

N = int(input())
Input_arr = list(map(int,input().split()))

for index in range(1,N+1):
    if index % 2 == 1:
        print(getMedian(Input_arr[:index]),end=' ')

