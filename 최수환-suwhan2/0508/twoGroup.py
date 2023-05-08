'''
의사코드

1. n받기
2. 수열 받기
3. 정렬하기
4. 두개씩 짝지어 최댓값을 찾는 함수 findMax 실행
    1. 짝지어 두 원소의 합을 저장하는 리스트 선언
    2. 합을 리스트에 추가하는 반복문
    3. 합 중에서 최댓값 반환
'''


def findMax(N,numberList):
    sumList=[]   #정렬된 리스트의 양끝값을 두개씩 짝지어 합을 저장할 리스트 선언
    for i in range(N):
        sumList.append(numberList[i]+numberList[-1-i])     #양쪽끝값 더해서 리스트에 추가
    return max(sumList) #합 리스트의 최댓값 출력

def main():
    #입력부
    N=int(input())
    numberList=list(map(int,input().split()))

    #연산부
    numberList.sort()    #정렬
    answer=findMax(N,numberList)

    #출력부
    print(answer)

main()

'''
정렬을 안하고 해보려니
최댓값 최솟값을 구하는 과정에서 시간 복잡도가 n^2이 되버려서 포기...
'''
