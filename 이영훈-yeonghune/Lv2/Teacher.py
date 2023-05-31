'''
스승의 은혜2
1. 학생의 수와 예산을 입력받는다.
2. 학생들의 선물 가격들을 리스트에 입력받아서 정렬한다.
3. lst를 복사해서 result라는 리스트를 만들고 i번째 예산을 /2 연산해준다.
4. result에서 B를 초과하지 않는 선에서 모든 값을 더하고 sum += 1 해줌으로써 체크한다.
5. 가장 큰 sum을 출력한다.

이 방법이 해설에 있는 방법보다 2배나 수행시간을 감소시켰다.
'''
N , B = map(int, input().split())
lst = sorted([int(input()) for _ in range(N)])
Max = 0

for i in range(N):
    result = lst[:]
    result[i] /= 2
    sum = 0
    value = 0
    for j in result:
        value += j
        if value > B:
            break
        sum += 1
    
    if Max < sum:
        Max = sum

print(Max)
