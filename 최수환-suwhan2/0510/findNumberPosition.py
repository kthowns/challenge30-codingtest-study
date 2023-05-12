'''
의사코드

1. 클래스 정의
2. 입력값 N과 수열 받기
3. 두가지 과정을 걸쳐서 정렬된 숫자 위치를 알아내기
    1. 각 수열에 번호를 부여해 객체생성     3 1 6 2 7 30 1 (순서 = 1 2 3 4 5 6 7)
    2. 리스트에 각 객체 추가      
    3. number오름차순으로 정렬 후 반환     1 1 2 3 6 7 30 (순서 = 2 7 4 1 3 5 6)

    1. 객체를 생성하는데 number에 전에 정렬한 객체의 순서(sequence) 대입, 순서들에 새로운 순서 부여  2 7 4 1 3 5 6 (순서 = 1 2 3 4 5 6 7)
    2. 리스트에 각 객체 추가
    3. number오름차순으로 정렬 후 반환     1 2 3 4 5 6 7 (순서 = 4 1 5 3 6 7 2)
4. enumerate를 이용해서 정렬된 순서들의 순서 출력   (4 1 5 3 6 7 2 출력)

'''
class Number:
    def __init__(self,number,sequence):
        self.number=number
        self.sequence=sequence

def firstFindNumberPosition(N,inputNumbers):      #첫번째 정렬
    numbers=[]

    for i in range(N):
        number=inputNumbers[i]
        sequence=i+1            #각 숫자들에 번호 부여
        numbers.append(Number(number,sequence))

    numbers.sort(key=lambda x: x.number)   #number기준 오름차순 정렬

    return numbers

def secondFindNumberPosition(N,numbers):

    secondNumbers=[]

    for i in range(N):
        number=numbers[i].sequence      #위 함수에서 반환된 객체의 순서 대입
        sequence=i+1       #순서에 번호 부여
        secondNumbers.append(Number(number,sequence))

    secondNumbers.sort(key=lambda x: x.number)   #number기준 오름차순

    return secondNumbers

def main():
    N=int(input())
    inputNumbers=list(map(int,input().split()))

    numbers=firstFindNumberPosition(N,inputNumbers)
    secondNumbers=secondFindNumberPosition(N,numbers)

    for idx, x in enumerate(secondNumbers, start=1):      #순서의 순서 출력
        print(f"{x.sequence}",end=" ")

main()
