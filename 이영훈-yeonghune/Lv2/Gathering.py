'''
모이자
의사코드
1. n 과 lst를 입력받는다.
2. 1번째 집부터 n번째 집까지 만나는 시간을 전체 다 계산한다.
2.1 1번째 집에서 만날때 i 를 1이라 하고 1번째 집일때 0 이 나오게 abs(idx - i) 를 수행한다.
2.2 위 과정을 거치면 2번째 집일때는 2번째 집의 가중치가 0이 된다.
2.3 abs(절댓값)을 해준이유는 결과가 음수로 빠질수 있기 때문이다.
3. Result에 전체 값을 입력하고 최소값을 추출한다.
'''
n = int(input())

lst = list(map(int,input().split()))

Result =[]

for i in range(1, n+1):
    sum = 0
    for idx, arg in enumerate(lst):
        idx = idx + 1 
        How_long = abs(idx - i) * arg
        sum += How_long
    
    Result.append(sum)

print(min(Result))
        