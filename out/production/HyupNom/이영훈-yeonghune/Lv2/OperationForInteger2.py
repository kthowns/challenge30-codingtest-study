'''
두 정수에 대한 연산값 2
의사코드

1. a 와 b를 입력받는다.
2. a 와 b의 대소를 비교한다.
    1. a가 b 보다 크면 a에 2를 곱하고 b에 10을 더한다.
    2. b가 a 보다 크면 b에 2를 곱하고 a에 10을 더한다.
3. a와 b를 출력한다.

조건
1. 연산은 함수내에서 한다.
2. 출력은 함수 호출이후에(main 함수) 한다.
'''
def operate(a, b):
    if a>b:
        b += 10
        a *= 2
    else:
        b *= 2
        a += 10
    return a, b


a, b = map(int,input().split())
a, b = operate(a,b)
print(a, b)