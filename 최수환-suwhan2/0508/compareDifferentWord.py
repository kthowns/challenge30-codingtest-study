'''
의사코드

정렬쓰면 nlogn
'''

firstWord=input()
secondWord=input()
print('Yes' if sorted(firstWord)==sorted(secondWord) else 'No')


'''
의사코드

정렬쓰지말기
=> 문자하나씩 비교, 각 알파벳의 갯수가 같으면 Yes -> 아스키 코드 사용

1. 두 문자열 입력받기
2. 비교함수 사용
    1. 아스키코드수 만큼의 COUNT 리스트 선언
    2. 첫문자열을 하나씩 아스키코드로 변환후 리스트에 해당값 +1
    3. 두번째 문자열을 하나씩 아스키코드로 변환후 리스트에 해당값 -1
    4. COUNT리스트 순회하며 0이 아닌 값이 나오면 1 반환, 모두 0이면 0반환
3. 리턴값이 1이면 No, 0이면 Yes 출력

요로면 시간복잡도 n
'''


def compare(a,b):
    count=[0 for _ in range(128)]

    for i in a:
        count[ord(i)] +=1   #ord는 아스키코드로 변환하는 함수
    for i in b:
        count[ord(i)] -=1

    for i in range(128):
        if count[i] != 0:    #0이 아니면 같지 않으므로 1 반환
            return 1
        elif i==127:         #모두 0이면 같다는 의미로 0반환
            return 0

def main():
    #입력부
    firstWord=input()
    secondWord=input()

    #연산부
    answer = compare(firstWord,secondWord)

    #출력부
    if answer==1:
        print('No')
    else:
        print('Yes')

main()
