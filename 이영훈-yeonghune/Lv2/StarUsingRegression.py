'''
재귀함수를 이용한 별 출력 2
의사코드

1. 별찍기를 반복할 n을 입력받는다.
2. 재귀함수를 수행한다.

요약
1. 자기 자신을 호출하기 전 19번 코드(별 출력)을 수행한다.
2. 계속 재귀하다보면 n이 0이 되는 지점이 있을것이다.
3. 그때 return 하게 호출자의 20번 코드를 수행한다.
4. 약간 스택 구조와 비슷하다
'''
def regression(n):
    if n <=0:
        return
    
    print('*'*n)
    regression(n-1)
    print('*'*n)

n = int(input())
regression(n)